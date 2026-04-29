package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object auditmanager:
  extension (builder: com.pulumi.aws.auditmanager.ControlArgs.Builder)
    /**
     * @param controlMappingSources Data mapping sources. See `controlMappingSources` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def controlMappingSources(args: Endofunction[com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceArgs.Builder]*):
        com.pulumi.aws.auditmanager.ControlArgs.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceArgs.builder
      builder.controlMappingSources(args.map(_(argsBuilder).build)*)

  /** Resource for managing an AWS Audit Manager Control. */
  def Control(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.ControlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.auditmanager.ControlArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.auditmanager.Control(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing AWS Audit Manager Account Registration. */
  def AccountRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.AccountRegistrationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.auditmanager.AccountRegistrationArgs.builder
    
    com.pulumi.aws.auditmanager.AccountRegistration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Audit Manager Framework Share. */
  def FrameworkShare(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.FrameworkShareArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.auditmanager.FrameworkShareArgs.builder
    
    com.pulumi.aws.auditmanager.FrameworkShare(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing AWS Audit Manager Organization Admin Account Registration. */
  def OrganizationAdminAccountRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.OrganizationAdminAccountRegistrationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.auditmanager.OrganizationAdminAccountRegistrationArgs.builder
    
    com.pulumi.aws.auditmanager.OrganizationAdminAccountRegistration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Audit Manager Assessment Report. */
  def AssessmentReport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.AssessmentReportArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.auditmanager.AssessmentReportArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.auditmanager.AssessmentReport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Audit Manager Assessment Delegation. */
  def AssessmentDelegation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.AssessmentDelegationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.auditmanager.AssessmentDelegationArgs.builder
    
    com.pulumi.aws.auditmanager.AssessmentDelegation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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
     *  The following arguments are optional:
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.aws.auditmanager.inputs.AssessmentScopeArgs.Builder]):
        com.pulumi.aws.auditmanager.AssessmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.AssessmentScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  /** Resource for managing an AWS Audit Manager Framework. */
  def Framework(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.FrameworkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.auditmanager.FrameworkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.auditmanager.Framework(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type AuditmanagerFunctions = com.pulumi.aws.auditmanager.AuditmanagerFunctions
  object AuditmanagerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.auditmanager.AuditmanagerFunctions.*
  extension (self: AuditmanagerFunctions.type)
    /** Data source for managing an AWS Audit Manager Control. */
    def getControl(args: Endofunction[com.pulumi.aws.auditmanager.inputs.GetControlArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.auditmanager.outputs.GetControlResult] =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.GetControlArgs.builder
      com.pulumi.aws.auditmanager.AuditmanagerFunctions.getControl(args(argsBuilder).build)

    /** Data source for managing an AWS Audit Manager Control. */
    def getControlPlain(args: Endofunction[com.pulumi.aws.auditmanager.inputs.GetControlPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.auditmanager.outputs.GetControlResult] =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.GetControlPlainArgs.builder
      com.pulumi.aws.auditmanager.AuditmanagerFunctions.getControlPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Audit Manager Framework. */
    def getFramework(args: Endofunction[com.pulumi.aws.auditmanager.inputs.GetFrameworkArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.auditmanager.outputs.GetFrameworkResult] =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.GetFrameworkArgs.builder
      com.pulumi.aws.auditmanager.AuditmanagerFunctions.getFramework(args(argsBuilder).build)

    /** Data source for managing an AWS Audit Manager Framework. */
    def getFrameworkPlain(args: Endofunction[com.pulumi.aws.auditmanager.inputs.GetFrameworkPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.auditmanager.outputs.GetFrameworkResult] =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.GetFrameworkPlainArgs.builder
      com.pulumi.aws.auditmanager.AuditmanagerFunctions.getFrameworkPlain(args(argsBuilder).build)

  /** Resource for managing an AWS Audit Manager Assessment. */
  def Assessment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.AssessmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.auditmanager.AssessmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.auditmanager.Assessment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.auditmanager.FrameworkArgs.Builder)
    /**
     * @param controlSets Configuration block(s) for the control sets that are associated with the framework. See `controlSets` Block below for details.
     *  
     *  The following arguments are optional:
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

  extension (builder: com.pulumi.aws.auditmanager.inputs.ControlState.Builder)
    /**
     * @param controlMappingSources Data mapping sources. See `controlMappingSources` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def controlMappingSources(args: Endofunction[com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceArgs.Builder]*):
        com.pulumi.aws.auditmanager.inputs.ControlState.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceArgs.builder
      builder.controlMappingSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.auditmanager.inputs.FrameworkState.Builder)
    /**
     * @param controlSets Configuration block(s) for the control sets that are associated with the framework. See `controlSets` Block below for details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def controlSets(args: Endofunction[com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs.Builder]*):
        com.pulumi.aws.auditmanager.inputs.FrameworkState.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs.builder
      builder.controlSets(args.map(_(argsBuilder).build)*)

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
     *  The following arguments are optional:
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.aws.auditmanager.inputs.AssessmentScopeArgs.Builder]):
        com.pulumi.aws.auditmanager.inputs.AssessmentState.Builder =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.AssessmentScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceArgs.Builder)
    /**
     * @param sourceKeyword The keyword to search for in CloudTrail logs, Config rules, Security Hub checks, and Amazon Web Services API names. See `sourceKeyword` below.
     * @return builder
     */
    def sourceKeyword(args: Endofunction[com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceSourceKeywordArgs.Builder]):
        com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.ControlControlMappingSourceSourceKeywordArgs.builder
      builder.sourceKeyword(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs.Builder)
    /**
     * @param controls Configuration block(s) for the controls within the control set. See `controls` Block below for details.
     * @return builder
     */
    def controls(args: Endofunction[com.pulumi.aws.auditmanager.inputs.FrameworkControlSetControlArgs.Builder]*):
        com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.auditmanager.inputs.FrameworkControlSetControlArgs.builder
      builder.controls(args.map(_(argsBuilder).build)*)
