package jp.ukiba.ko_pulumi
package aws

object auditmanager_ext:
  extension (builder: com.pulumi.aws.auditmanager.AssessmentArgs.Builder)
    /**
     * @param assessmentReportsDestination Assessment report storage destination configuration. See `assessmentReportsDestination` below.
     * @return builder
     */
    def assessmentReportsDestination(args: Endofunction[com.pulumi.aws.auditmanager.inputs.AssessmentAssessmentReportsDestinationArgs.Builder]):
        com.pulumi.aws.auditmanager.AssessmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.AssessmentAssessmentReportsDestinationArgs.builder
      builder.assessmentReportsDestination(args(argsBuilder).build)

    /**
     * @param roles List of roles for the assessment. See `roles` below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.aws.auditmanager.inputs.AssessmentRoleArgs.Builder]*):
        com.pulumi.aws.auditmanager.AssessmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.AssessmentRoleArgs.builder
      builder.roles(args.map(_(argsBuilder).build)*)

    /**
     * @param scope Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.aws.auditmanager.inputs.AssessmentScopeArgs.Builder]):
        com.pulumi.aws.auditmanager.AssessmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.AssessmentScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.auditmanager.ControlArgs.Builder)
    /**
     * @param controlMappingSources Data mapping sources. See `controlMappingSources` below.
     * @return builder
     */
    def controlMappingSources(args: Endofunction[com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceArgs.Builder]*):
        com.pulumi.aws.auditmanager.ControlArgs.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceArgs.builder
      builder.controlMappingSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.auditmanager.FrameworkArgs.Builder)
    /**
     * @param controlSets Configuration block(s) for the control sets that are associated with the framework. See `controlSets` Block below for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def controlSets(args: Endofunction[com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs.Builder]*):
        com.pulumi.aws.auditmanager.FrameworkArgs.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs.builder
      builder.controlSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.auditmanager.inputs.AssessmentScopeArgs.Builder)
    /**
     * @param awsAccounts Amazon Web Services accounts that are in scope for the assessment. See `awsAccounts` below.
     * @return builder
     */
    def awsAccounts(args: Endofunction[com.pulumi.aws.auditmanager.inputs.AssessmentScopeAwsAccountArgs.Builder]*):
        com.pulumi.aws.auditmanager.inputs.AssessmentScopeArgs.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.AssessmentScopeAwsAccountArgs.builder
      builder.awsAccounts(args.map(_(argsBuilder).build)*)

    /**
     * @param awsServices Amazon Web Services services that are included in the scope of the assessment. See `awsServices` below.
     * @return builder
     */
    def awsServices(args: Endofunction[com.pulumi.aws.auditmanager.inputs.AssessmentScopeAwsServiceArgs.Builder]*):
        com.pulumi.aws.auditmanager.inputs.AssessmentScopeArgs.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.AssessmentScopeAwsServiceArgs.builder
      builder.awsServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.auditmanager.inputs.AssessmentState.Builder)
    /**
     * @param assessmentReportsDestination Assessment report storage destination configuration. See `assessmentReportsDestination` below.
     * @return builder
     */
    def assessmentReportsDestination(args: Endofunction[com.pulumi.aws.auditmanager.inputs.AssessmentAssessmentReportsDestinationArgs.Builder]):
        com.pulumi.aws.auditmanager.inputs.AssessmentState.Builder =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.AssessmentAssessmentReportsDestinationArgs.builder
      builder.assessmentReportsDestination(args(argsBuilder).build)

    /**
     * @param roles List of roles for the assessment. See `roles` below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.aws.auditmanager.inputs.AssessmentRoleArgs.Builder]*):
        com.pulumi.aws.auditmanager.inputs.AssessmentState.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.AssessmentRoleArgs.builder
      builder.roles(args.map(_(argsBuilder).build)*)

    /**
     * @param rolesAlls Complete list of all roles with access to the assessment. This includes both roles explicitly configured via the `roles` block, and any roles which have access to all Audit Manager assessments by default.
     * @return builder
     */
    def rolesAlls(args: Endofunction[com.pulumi.aws.auditmanager.inputs.AssessmentRolesAllArgs.Builder]*):
        com.pulumi.aws.auditmanager.inputs.AssessmentState.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.AssessmentRolesAllArgs.builder
      builder.rolesAlls(args.map(_(argsBuilder).build)*)

    /**
     * @param scope Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.aws.auditmanager.inputs.AssessmentScopeArgs.Builder]):
        com.pulumi.aws.auditmanager.inputs.AssessmentState.Builder =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.AssessmentScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceArgs.Builder)
    /**
     * @param sourceKeyword Keyword to search for in CloudTrail logs, Config rules, Security Hub checks, and Amazon Web Services API names. See `sourceKeyword` below.
     * @return builder
     */
    def sourceKeyword(args: Endofunction[com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceSourceKeywordArgs.Builder]):
        com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceSourceKeywordArgs.builder
      builder.sourceKeyword(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.auditmanager.inputs.ControlState.Builder)
    /**
     * @param controlMappingSources Data mapping sources. See `controlMappingSources` below.
     * @return builder
     */
    def controlMappingSources(args: Endofunction[com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceArgs.Builder]*):
        com.pulumi.aws.auditmanager.inputs.ControlState.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceArgs.builder
      builder.controlMappingSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs.Builder)
    /**
     * @param controls Configuration block(s) for the controls within the control set. See `controls` Block below for details.
     * @return builder
     */
    def controls(args: Endofunction[com.pulumi.aws.auditmanager.inputs.FrameworkControlSetControlArgs.Builder]*):
        com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.FrameworkControlSetControlArgs.builder
      builder.controls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.auditmanager.inputs.FrameworkState.Builder)
    /**
     * @param controlSets Configuration block(s) for the control sets that are associated with the framework. See `controlSets` Block below for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def controlSets(args: Endofunction[com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs.Builder]*):
        com.pulumi.aws.auditmanager.inputs.FrameworkState.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs.builder
      builder.controlSets(args.map(_(argsBuilder).build)*)
