package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object mailmanager:
  /** Manages an AWS SES Mail Manager Archive. */
  def Archive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.mailmanager.ArchiveArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mailmanager.ArchiveArgs.builder
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
    com.pulumi.aws.mailmanager.Archive(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.mailmanager.ArchiveArgs.Builder)
    /**
     * @param retention Retention policy for the archive. See `retention` Block.
     * @return builder
     */
    def retention(args: Endofunction[com.pulumi.aws.mailmanager.inputs.ArchiveRetentionArgs.Builder]):
        com.pulumi.aws.mailmanager.ArchiveArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.ArchiveRetentionArgs.builder
      builder.retention(args(argsBuilder).build)

  /** Manages an AWS SES Mail Manager Ingress Point. */
  def IngressPoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.mailmanager.IngressPointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mailmanager.IngressPointArgs.builder
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
    com.pulumi.aws.mailmanager.IngressPoint(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.mailmanager.IngressPointArgs.Builder)
    /**
     * @param ingressPointConfiguration Configuration used to authenticate with the ingress point. See `ingressPointConfiguration` Block for details.
     * @return builder
     */
    def ingressPointConfiguration(args: Endofunction[com.pulumi.aws.mailmanager.inputs.IngressPointIngressPointConfigurationArgs.Builder]):
        com.pulumi.aws.mailmanager.IngressPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.IngressPointIngressPointConfigurationArgs.builder
      builder.ingressPointConfiguration(args(argsBuilder).build)

    /**
     * @param networkConfiguration Network configuration for the ingress point. See `networkConfiguration` Block for details. Changing this value forces a new resource.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.mailmanager.inputs.IngressPointNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.mailmanager.IngressPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.IngressPointNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.mailmanager.inputs.IngressPointTimeoutsArgs.Builder]):
        com.pulumi.aws.mailmanager.IngressPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.IngressPointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an AWS SES Mail Manager Relay. */
  def Relay(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.mailmanager.RelayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mailmanager.RelayArgs.builder
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
    com.pulumi.aws.mailmanager.Relay(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.mailmanager.RelayArgs.Builder)
    /**
     * @param authentication Authentication configuration for the relay. See `authentication` Block.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RelayAuthenticationArgs.Builder]):
        com.pulumi.aws.mailmanager.RelayArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RelayAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  /** Manages an AWS SES Mail Manager Rule Set. */
  def RuleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.mailmanager.RuleSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mailmanager.RuleSetArgs.builder
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
    com.pulumi.aws.mailmanager.RuleSet(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.mailmanager.RuleSetArgs.Builder)
    /**
     * @param rules One or more rules that define filtering and action logic. Up to 40 rules are supported. See `rule` Block.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleArgs.Builder]*):
        com.pulumi.aws.mailmanager.RuleSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /** Manages an SES Mail Manager Traffic Policy. */
  def TrafficPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.mailmanager.TrafficPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mailmanager.TrafficPolicyArgs.builder
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
    com.pulumi.aws.mailmanager.TrafficPolicy(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.mailmanager.TrafficPolicyArgs.Builder)
    /**
     * @param policyStatements Traffic policy statements. See `policyStatement` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def policyStatements(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementArgs.Builder]*):
        com.pulumi.aws.mailmanager.TrafficPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementArgs.builder
      builder.policyStatements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.mailmanager.inputs.ArchiveState.Builder)
    /**
     * @param retention Retention policy for the archive. See `retention` Block.
     * @return builder
     */
    def retention(args: Endofunction[com.pulumi.aws.mailmanager.inputs.ArchiveRetentionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.ArchiveState.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.ArchiveRetentionArgs.builder
      builder.retention(args(argsBuilder).build)

    /**
     * @param retentionActuals Effective retention policy for the archive, including the default (`SIX_MONTHS`) when no `retention` block is configured. See `retentionActual` Block below.
     * @return builder
     */
    def retentionActuals(args: Endofunction[com.pulumi.aws.mailmanager.inputs.ArchiveRetentionActualArgs.Builder]*):
        com.pulumi.aws.mailmanager.inputs.ArchiveState.Builder =
      def argsBuilder = com.pulumi.aws.mailmanager.inputs.ArchiveRetentionActualArgs.builder
      builder.retentionActuals(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.mailmanager.inputs.IngressPointIngressPointConfigurationArgs.Builder)
    /**
     * @param tlsAuthConfiguration Configuration used to authenticate with `MTLS` ingress points. See `tlsAuthConfiguration` Block for details.
     * @return builder
     */
    def tlsAuthConfiguration(args: Endofunction[com.pulumi.aws.mailmanager.inputs.IngressPointIngressPointConfigurationTlsAuthConfigurationArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.IngressPointIngressPointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.IngressPointIngressPointConfigurationTlsAuthConfigurationArgs.builder
      builder.tlsAuthConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.IngressPointIngressPointConfigurationTlsAuthConfigurationArgs.Builder)
    /**
     * @param trustStore Trust store used to validate client certificates. See `trustStore` Block for details.
     * @return builder
     */
    def trustStore(args: Endofunction[com.pulumi.aws.mailmanager.inputs.IngressPointIngressPointConfigurationTlsAuthConfigurationTrustStoreArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.IngressPointIngressPointConfigurationTlsAuthConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.IngressPointIngressPointConfigurationTlsAuthConfigurationTrustStoreArgs.builder
      builder.trustStore(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.IngressPointNetworkConfigurationArgs.Builder)
    /**
     * @param privateNetworkConfiguration Configuration for a private ingress point that uses a VPC endpoint. See `privateNetworkConfiguration` Block for details.
     * @return builder
     */
    def privateNetworkConfiguration(args: Endofunction[com.pulumi.aws.mailmanager.inputs.IngressPointNetworkConfigurationPrivateNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.IngressPointNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.IngressPointNetworkConfigurationPrivateNetworkConfigurationArgs.builder
      builder.privateNetworkConfiguration(args(argsBuilder).build)

    /**
     * @param publicNetworkConfiguration Configuration for a public ingress point. See `publicNetworkConfiguration` Block for details.
     * @return builder
     */
    def publicNetworkConfiguration(args: Endofunction[com.pulumi.aws.mailmanager.inputs.IngressPointNetworkConfigurationPublicNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.IngressPointNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.IngressPointNetworkConfigurationPublicNetworkConfigurationArgs.builder
      builder.publicNetworkConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.IngressPointState.Builder)
    /**
     * @param ingressPointConfiguration Configuration used to authenticate with the ingress point. See `ingressPointConfiguration` Block for details.
     * @return builder
     */
    def ingressPointConfiguration(args: Endofunction[com.pulumi.aws.mailmanager.inputs.IngressPointIngressPointConfigurationArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.IngressPointState.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.IngressPointIngressPointConfigurationArgs.builder
      builder.ingressPointConfiguration(args(argsBuilder).build)

    /**
     * @param networkConfiguration Network configuration for the ingress point. See `networkConfiguration` Block for details. Changing this value forces a new resource.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.mailmanager.inputs.IngressPointNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.IngressPointState.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.IngressPointNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.mailmanager.inputs.IngressPointTimeoutsArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.IngressPointState.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.IngressPointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RelayAuthenticationArgs.Builder)
    /**
     * @param noAuthentication No authentication is required to connect to the SMTP server.
     * @return builder
     */
    def noAuthentication(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RelayAuthenticationNoAuthenticationArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RelayAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RelayAuthenticationNoAuthenticationArgs.builder
      builder.noAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RelayState.Builder)
    /**
     * @param authentication Authentication configuration for the relay. See `authentication` Block.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RelayAuthenticationArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RelayState.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RelayAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder)
    /**
     * @param addHeader Adds a header to the email. See `addHeader` Block.
     * @return builder
     */
    def addHeader(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionAddHeaderArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionAddHeaderArgs.builder
      builder.addHeader(args(argsBuilder).build)

    /**
     * @param archive Archives the email. See `archive` Block.
     * @return builder
     */
    def archive(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArchiveArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArchiveArgs.builder
      builder.archive(args(argsBuilder).build)

    /**
     * @param bounce Sends a bounce response. See `bounce` Block.
     * @return builder
     */
    def bounce(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionBounceArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionBounceArgs.builder
      builder.bounce(args(argsBuilder).build)

    /**
     * @param deliverToMailbox Delivers the email to a WorkMail mailbox. See `deliverToMailbox` Block.
     * @return builder
     */
    def deliverToMailbox(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionDeliverToMailboxArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionDeliverToMailboxArgs.builder
      builder.deliverToMailbox(args(argsBuilder).build)

    /**
     * @param deliverToQBusiness Delivers the email to an Amazon Q Business application. See `deliverToQBusiness` Block.
     * @return builder
     */
    def deliverToQBusiness(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionDeliverToQBusinessArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionDeliverToQBusinessArgs.builder
      builder.deliverToQBusiness(args(argsBuilder).build)

    /**
     * @param drop Stops rule evaluation and drops the email.
     * @return builder
     */
    def drop(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionDropArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionDropArgs.builder
      builder.drop(args(argsBuilder).build)

    /**
     * @param invokeLambda Invokes a Lambda function. See `invokeLambda` Block.
     * @return builder
     */
    def invokeLambda(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionInvokeLambdaArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionInvokeLambdaArgs.builder
      builder.invokeLambda(args(argsBuilder).build)

    /**
     * @param publishToSns Publishes the email to an SNS topic. See `publishToSns` Block.
     * @return builder
     */
    def publishToSns(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionPublishToSnsArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionPublishToSnsArgs.builder
      builder.publishToSns(args(argsBuilder).build)

    /**
     * @param relay Relays the email to an SMTP server. See `relay` Block.
     * @return builder
     */
    def relay(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionRelayArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionRelayArgs.builder
      builder.relay(args(argsBuilder).build)

    /**
     * @param replaceRecipient Replaces envelope recipients. See `replaceRecipient` Block.
     * @return builder
     */
    def replaceRecipient(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionReplaceRecipientArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionReplaceRecipientArgs.builder
      builder.replaceRecipient(args(argsBuilder).build)

    /**
     * @param send Sends the email to the internet. See `send` Block.
     * @return builder
     */
    def send(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionSendArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionSendArgs.builder
      builder.send(args(argsBuilder).build)

    /**
     * @param writeToS3 Writes the email MIME content to an S3 bucket. See `writeToS3` Block.
     * @return builder
     */
    def writeToS3(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionWriteToS3Args.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionWriteToS3Args.builder
      builder.writeToS3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleArgs.Builder)
    /**
     * @param actions One or more actions to execute when all conditions match. Between 1 and 10 actions are supported. Each action must contain exactly one action configuration. See `action` Block.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.Builder]*):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions One or more conditions that must all evaluate to true for the rule to match. Up to 10 conditions are supported. See `condition` Block.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionArgs.Builder]*):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param unlesses One or more conditions that prevent the rule from matching when any evaluates to true. Up to 10 conditions are supported. See `condition` Block.
     * @return builder
     */
    def unlesses(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessArgs.Builder]*):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessArgs.builder
      builder.unlesses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionArgs.Builder)
    /**
     * @param booleanExpression Boolean expression evaluated against an email attribute or Add On result. See `booleanExpression` Block.
     * @return builder
     */
    def booleanExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionBooleanExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionBooleanExpressionArgs.builder
      builder.booleanExpression(args(argsBuilder).build)

    /**
     * @param dmarcExpression DMARC policy expression evaluated against the email&#39;s DMARC result. See `dmarcExpression` Block.
     * @return builder
     */
    def dmarcExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionDmarcExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionDmarcExpressionArgs.builder
      builder.dmarcExpression(args(argsBuilder).build)

    /**
     * @param ipExpression IP CIDR expression evaluated against the sender IP address. See `ipExpression` Block.
     * @return builder
     */
    def ipExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionIpExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionIpExpressionArgs.builder
      builder.ipExpression(args(argsBuilder).build)

    /**
     * @param numberExpression Numeric expression evaluated against an email attribute such as message size. See `numberExpression` Block.
     * @return builder
     */
    def numberExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionNumberExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionNumberExpressionArgs.builder
      builder.numberExpression(args(argsBuilder).build)

    /**
     * @param stringExpression String expression evaluated against an email attribute, MIME header, client certificate field, or Add On result. See `stringExpression` Block.
     * @return builder
     */
    def stringExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionStringExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionStringExpressionArgs.builder
      builder.stringExpression(args(argsBuilder).build)

    /**
     * @param verdictExpression Verdict expression evaluated against email authentication results such as SPF or DKIM. See `verdictExpression` Block.
     * @return builder
     */
    def verdictExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionVerdictExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionVerdictExpressionArgs.builder
      builder.verdictExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionBooleanExpressionArgs.Builder)
    /**
     * @param evaluate Operand evaluated by the expression. Exactly one of `analysis`, `attribute`, or `isInAddressList` must be configured.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionBooleanExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionBooleanExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionBooleanExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionBooleanExpressionEvaluateArgs.Builder)
    /**
     * @param analysis Add On result to evaluate. See `analysis` Block.
     * @return builder
     */
    def analysis(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionBooleanExpressionEvaluateAnalysisArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionBooleanExpressionEvaluateArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionBooleanExpressionEvaluateAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

    /**
     * @param isInAddressList Address-list membership expression.
     * @return builder
     */
    def isInAddressList(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionBooleanExpressionEvaluateIsInAddressListArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionBooleanExpressionEvaluateArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionBooleanExpressionEvaluateIsInAddressListArgs.builder
      builder.isInAddressList(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionIpExpressionArgs.Builder)
    /**
     * @param evaluate Left-hand operand of the expression.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionIpExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionIpExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionIpExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionNumberExpressionArgs.Builder)
    /**
     * @param evaluate Left-hand operand of the expression.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionNumberExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionNumberExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionNumberExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionStringExpressionArgs.Builder)
    /**
     * @param evaluate Left-hand operand of the expression. Exactly one of `analysis`, `attribute`, `clientCertificateAttribute`, or `mimeHeaderAttribute` must be configured.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionStringExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionStringExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionStringExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionStringExpressionEvaluateArgs.Builder)
    /**
     * @param analysis Add On result to evaluate. See `analysis` Block.
     * @return builder
     */
    def analysis(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionStringExpressionEvaluateAnalysisArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionStringExpressionEvaluateArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionStringExpressionEvaluateAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionVerdictExpressionArgs.Builder)
    /**
     * @param evaluate Left-hand operand of the expression. Exactly one of `analysis` or `attribute` must be configured.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionVerdictExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionVerdictExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionVerdictExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionVerdictExpressionEvaluateArgs.Builder)
    /**
     * @param analysis Add On result to evaluate. See `analysis` Block.
     * @return builder
     */
    def analysis(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionVerdictExpressionEvaluateAnalysisArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionVerdictExpressionEvaluateArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleConditionVerdictExpressionEvaluateAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessArgs.Builder)
    /**
     * @param booleanExpression Boolean expression evaluated against an email attribute or Add On result. See `booleanExpression` Block.
     * @return builder
     */
    def booleanExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessBooleanExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessBooleanExpressionArgs.builder
      builder.booleanExpression(args(argsBuilder).build)

    /**
     * @param dmarcExpression DMARC policy expression evaluated against the email&#39;s DMARC result. See `dmarcExpression` Block.
     * @return builder
     */
    def dmarcExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessDmarcExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessDmarcExpressionArgs.builder
      builder.dmarcExpression(args(argsBuilder).build)

    /**
     * @param ipExpression IP CIDR expression evaluated against the sender IP address. See `ipExpression` Block.
     * @return builder
     */
    def ipExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessIpExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessIpExpressionArgs.builder
      builder.ipExpression(args(argsBuilder).build)

    /**
     * @param numberExpression Numeric expression evaluated against an email attribute such as message size. See `numberExpression` Block.
     * @return builder
     */
    def numberExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessNumberExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessNumberExpressionArgs.builder
      builder.numberExpression(args(argsBuilder).build)

    /**
     * @param stringExpression String expression evaluated against an email attribute, MIME header, client certificate field, or Add On result. See `stringExpression` Block.
     * @return builder
     */
    def stringExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessStringExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessStringExpressionArgs.builder
      builder.stringExpression(args(argsBuilder).build)

    /**
     * @param verdictExpression Verdict expression evaluated against email authentication results such as SPF or DKIM. See `verdictExpression` Block.
     * @return builder
     */
    def verdictExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessVerdictExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessVerdictExpressionArgs.builder
      builder.verdictExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessBooleanExpressionArgs.Builder)
    /**
     * @param evaluate Operand evaluated by the expression. Exactly one of `analysis`, `attribute`, or `isInAddressList` must be configured.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessBooleanExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessBooleanExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessBooleanExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessBooleanExpressionEvaluateArgs.Builder)
    /**
     * @param analysis Add On result to evaluate. See `analysis` Block.
     * @return builder
     */
    def analysis(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessBooleanExpressionEvaluateAnalysisArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessBooleanExpressionEvaluateArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessBooleanExpressionEvaluateAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

    /**
     * @param isInAddressList Address-list membership expression.
     * @return builder
     */
    def isInAddressList(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessBooleanExpressionEvaluateIsInAddressListArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessBooleanExpressionEvaluateArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessBooleanExpressionEvaluateIsInAddressListArgs.builder
      builder.isInAddressList(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessIpExpressionArgs.Builder)
    /**
     * @param evaluate Left-hand operand of the expression.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessIpExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessIpExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessIpExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessNumberExpressionArgs.Builder)
    /**
     * @param evaluate Left-hand operand of the expression.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessNumberExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessNumberExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessNumberExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessStringExpressionArgs.Builder)
    /**
     * @param evaluate Left-hand operand of the expression. Exactly one of `analysis`, `attribute`, `clientCertificateAttribute`, or `mimeHeaderAttribute` must be configured.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessStringExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessStringExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessStringExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessStringExpressionEvaluateArgs.Builder)
    /**
     * @param analysis Add On result to evaluate. See `analysis` Block.
     * @return builder
     */
    def analysis(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessStringExpressionEvaluateAnalysisArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessStringExpressionEvaluateArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessStringExpressionEvaluateAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessVerdictExpressionArgs.Builder)
    /**
     * @param evaluate Left-hand operand of the expression. Exactly one of `analysis` or `attribute` must be configured.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessVerdictExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessVerdictExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessVerdictExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessVerdictExpressionEvaluateArgs.Builder)
    /**
     * @param analysis Add On result to evaluate. See `analysis` Block.
     * @return builder
     */
    def analysis(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessVerdictExpressionEvaluateAnalysisArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessVerdictExpressionEvaluateArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleUnlessVerdictExpressionEvaluateAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.RuleSetState.Builder)
    /**
     * @param rules One or more rules that define filtering and action logic. Up to 40 rules are supported. See `rule` Block.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.mailmanager.inputs.RuleSetRuleArgs.Builder]*):
        com.pulumi.aws.mailmanager.inputs.RuleSetState.Builder =
      def argsBuilder = com.pulumi.aws.mailmanager.inputs.RuleSetRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementArgs.Builder)
    /**
     * @param conditions Conditions evaluated by the statement. See `condition` Block below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionArgs.Builder]*):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionArgs.Builder)
    /**
     * @param booleanExpression Boolean comparison. See `booleanExpression` Block below.
     * @return builder
     */
    def booleanExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionBooleanExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionBooleanExpressionArgs.builder
      builder.booleanExpression(args(argsBuilder).build)

    /**
     * @param ipExpression IPv4 address comparison. See `ipExpression` Block below.
     * @return builder
     */
    def ipExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionIpExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionIpExpressionArgs.builder
      builder.ipExpression(args(argsBuilder).build)

    /**
     * @param ipv6Expression IPv6 address comparison. See `ipv6Expression` Block below.
     * @return builder
     */
    def ipv6Expression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionIpv6ExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionIpv6ExpressionArgs.builder
      builder.ipv6Expression(args(argsBuilder).build)

    /**
     * @param stringExpression String comparison. See `stringExpression` Block below.
     * @return builder
     */
    def stringExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionStringExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionStringExpressionArgs.builder
      builder.stringExpression(args(argsBuilder).build)

    /**
     * @param tlsExpression TLS policy comparison. See `tlsExpression` Block below.
     * @return builder
     */
    def tlsExpression(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionTlsExpressionArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionTlsExpressionArgs.builder
      builder.tlsExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionBooleanExpressionArgs.Builder)
    /**
     * @param evaluate Operand evaluated by the expression. See `policy_statement.condition.boolean_expression.evaluate` Block below.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionBooleanExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionBooleanExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionBooleanExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionBooleanExpressionEvaluateArgs.Builder)
    /**
     * @param analysis Analysis result to evaluate. See `policy_statement.condition.string_expression.evaluate.analysis` Block below.
     * @return builder
     */
    def analysis(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionBooleanExpressionEvaluateAnalysisArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionBooleanExpressionEvaluateArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionBooleanExpressionEvaluateAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

    /**
     * @param isInAddressList Address list membership check. See `isInAddressList` Block below.
     * @return builder
     */
    def isInAddressList(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionBooleanExpressionEvaluateIsInAddressListArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionBooleanExpressionEvaluateArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionBooleanExpressionEvaluateIsInAddressListArgs.builder
      builder.isInAddressList(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionIpExpressionArgs.Builder)
    /**
     * @param evaluate Operand evaluated by the expression. See `policy_statement.condition.ip_expression.evaluate` Block below.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionIpExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionIpExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionIpExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionIpv6ExpressionArgs.Builder)
    /**
     * @param evaluate Operand evaluated by the expression. See `policy_statement.condition.ipv6_expression.evaluate` Block below.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionIpv6ExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionIpv6ExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionIpv6ExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionStringExpressionArgs.Builder)
    /**
     * @param evaluate Operand evaluated by the expression. See `policy_statement.condition.string_expression.evaluate` Block below.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionStringExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionStringExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionStringExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionStringExpressionEvaluateArgs.Builder)
    /**
     * @param analysis Analysis result to evaluate. See `policy_statement.condition.string_expression.evaluate.analysis` Block below.
     * @return builder
     */
    def analysis(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionStringExpressionEvaluateAnalysisArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionStringExpressionEvaluateArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionStringExpressionEvaluateAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionTlsExpressionArgs.Builder)
    /**
     * @param evaluate Operand evaluated by the expression. See `policy_statement.condition.tls_expression.evaluate` Block below.
     * @return builder
     */
    def evaluate(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionTlsExpressionEvaluateArgs.Builder]):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionTlsExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementConditionTlsExpressionEvaluateArgs.builder
      builder.evaluate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mailmanager.inputs.TrafficPolicyState.Builder)
    /**
     * @param policyStatements Traffic policy statements. See `policyStatement` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def policyStatements(args: Endofunction[com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementArgs.Builder]*):
        com.pulumi.aws.mailmanager.inputs.TrafficPolicyState.Builder =
      def argsBuilder = com.pulumi.aws.mailmanager.inputs.TrafficPolicyPolicyStatementArgs.builder
      builder.policyStatements(args.map(_(argsBuilder).build)*)
