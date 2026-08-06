package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object mailmanager:
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
