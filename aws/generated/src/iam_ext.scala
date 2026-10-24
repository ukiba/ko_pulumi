package jp.ukiba.ko_pulumi
package aws

object iam_ext:
  extension (builder: com.pulumi.aws.iam.GroupPolicyArgs.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.GroupPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iam.PolicyArgs.Builder)
    /**
     * @param policy Policy document. This is a JSON formatted string. For more information about building AWS IAM policy documents, see the AWS IAM Policy Document Guide
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iam.RoleArgs.Builder)
    /**
     * @param assumeRolePolicy Policy that grants an entity permission to assume the role.
     * 
     * &gt; **NOTE:** The `assumeRolePolicy` is very similar to but slightly different than a standard IAM policy and cannot use an `aws.iam.Policy` resource.  However, it _can_ use an `aws.iam.getPolicyDocument` data source. See the example above of how this works.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def assumeRolePolicy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.RoleArgs.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.assumeRolePolicy(args(argsBuilder).build)

    /**
     * @param inlinePolicies Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, Pulumi will not manage any inline policies in this resource. Configuring one empty block (i.e., `inlinePolicy {}`) will cause Pulumi to remove _all_ inline policies added out of band on `apply`.
     * @return builder
     */
    inline def inlinePolicies(args: Endofunction[com.pulumi.aws.iam.inputs.RoleInlinePolicyArgs.Builder]*):
        com.pulumi.aws.iam.RoleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.RoleInlinePolicyArgs.builder
      builder.inlinePolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.RolePolicyArgs.Builder)
    /**
     * @param policy The inline policy document.
     * This is a JSON formatted string.
     * For more information about building IAM policy documents with Pulumi, see the AWS IAM Policy Document Guide
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.RolePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iam.UserPolicyArgs.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.UserPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs.Builder)
    /**
     * @param statements Configuration block for a policy statement. Detailed below.
     * @return builder
     */
    inline def statements(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementArgs.Builder]*):
        com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.inputs.GetPolicyDocumentPlainArgs.Builder)
    /**
     * @param statements Configuration block for a policy statement. Detailed below.
     * @return builder
     */
    inline def statements(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentStatement.Builder]*):
        com.pulumi.aws.iam.inputs.GetPolicyDocumentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentStatement.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.inputs.GetPolicyDocumentStatement.Builder)
    /**
     * @param conditions Configuration block for a condition. Detailed below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementCondition.Builder]*):
        com.pulumi.aws.iam.inputs.GetPolicyDocumentStatement.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementCondition.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param notPrincipals Like `principals` except these are principals that the statement does *not* apply to.
     * @return builder
     */
    inline def notPrincipals(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementNotPrincipal.Builder]*):
        com.pulumi.aws.iam.inputs.GetPolicyDocumentStatement.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementNotPrincipal.builder
      builder.notPrincipals(args.map(_(argsBuilder).build)*)

    /**
     * @param principals Configuration block for principals. Detailed below.
     * @return builder
     */
    inline def principals(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementPrincipal.Builder]*):
        com.pulumi.aws.iam.inputs.GetPolicyDocumentStatement.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementPrincipal.builder
      builder.principals(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementArgs.Builder)
    /**
     * @param conditions Configuration block for a condition. Detailed below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementConditionArgs.Builder]*):
        com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param notPrincipals Like `principals` except these are principals that the statement does *not* apply to.
     * @return builder
     */
    inline def notPrincipals(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementNotPrincipalArgs.Builder]*):
        com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementNotPrincipalArgs.builder
      builder.notPrincipals(args.map(_(argsBuilder).build)*)

    /**
     * @param principals Configuration block for principals. Detailed below.
     * @return builder
     */
    inline def principals(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementPrincipalArgs.Builder]*):
        com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementPrincipalArgs.builder
      builder.principals(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationArgs.Builder)
    /**
     * @param contexts Each `context` block defines an entry in the table of additional context keys in the simulated request.
     * 
     * IAM uses context keys for both custom conditions and for interpolating dynamic request-specific values into policy values. If you use policies that include those features then you will need to provide suitable example values for those keys to achieve a realistic simulation.
     * @return builder
     */
    inline def contexts(args: Endofunction[com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationContextArgs.Builder]*):
        com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationContextArgs.builder
      builder.contexts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationPlainArgs.Builder)
    /**
     * @param contexts Each `context` block defines an entry in the table of additional context keys in the simulated request.
     * 
     * IAM uses context keys for both custom conditions and for interpolating dynamic request-specific values into policy values. If you use policies that include those features then you will need to provide suitable example values for those keys to achieve a realistic simulation.
     * @return builder
     */
    inline def contexts(args: Endofunction[com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationContext.Builder]*):
        com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationContext.builder
      builder.contexts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.inputs.GroupPolicyState.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.inputs.GroupPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder)
    inline def Statement(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyStatementArgs.Builder]*):
        com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.PolicyStatementArgs.builder
      builder.Statement(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.inputs.PolicyState.Builder)
    /**
     * @param policy Policy document. This is a JSON formatted string. For more information about building AWS IAM policy documents, see the AWS IAM Policy Document Guide
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iam.inputs.RolePolicyState.Builder)
    /**
     * @param policy The inline policy document.
     * This is a JSON formatted string.
     * For more information about building IAM policy documents with Pulumi, see the AWS IAM Policy Document Guide
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.inputs.RolePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iam.inputs.RoleState.Builder)
    /**
     * @param assumeRolePolicy Policy that grants an entity permission to assume the role.
     * 
     * &gt; **NOTE:** The `assumeRolePolicy` is very similar to but slightly different than a standard IAM policy and cannot use an `aws.iam.Policy` resource.  However, it _can_ use an `aws.iam.getPolicyDocument` data source. See the example above of how this works.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def assumeRolePolicy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.inputs.RoleState.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.assumeRolePolicy(args(argsBuilder).build)

    /**
     * @param inlinePolicies Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, Pulumi will not manage any inline policies in this resource. Configuring one empty block (i.e., `inlinePolicy {}`) will cause Pulumi to remove _all_ inline policies added out of band on `apply`.
     * @return builder
     */
    inline def inlinePolicies(args: Endofunction[com.pulumi.aws.iam.inputs.RoleInlinePolicyArgs.Builder]*):
        com.pulumi.aws.iam.inputs.RoleState.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.RoleInlinePolicyArgs.builder
      builder.inlinePolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.inputs.UserPolicyState.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.inputs.UserPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)
