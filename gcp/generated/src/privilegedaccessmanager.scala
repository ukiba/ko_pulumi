package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object privilegedaccessmanager:
  extension (builder: com.pulumi.gcp.privilegedaccessmanager.EntitlementArgs.Builder)
    /**
     * @param additionalNotificationTargets AdditionalNotificationTargets includes email addresses to be notified.
     *  Structure is documented below.
     * @return builder
     */
    def additionalNotificationTargets(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementAdditionalNotificationTargetsArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.EntitlementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementAdditionalNotificationTargetsArgs.builder
      builder.additionalNotificationTargets(args(argsBuilder).build)

    /**
     * @param approvalWorkflow The approvals needed before access will be granted to a requester.
     *  No approvals will be needed if this field is null. Different types of approval workflows that can be used to gate privileged access granting.
     *  Structure is documented below.
     * @return builder
     */
    def approvalWorkflow(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.EntitlementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowArgs.builder
      builder.approvalWorkflow(args(argsBuilder).build)

    /**
     * @param eligibleUsers Who can create Grants using Entitlement. This list should contain at most one entry
     *  Structure is documented below.
     * @return builder
     */
    def eligibleUsers(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementEligibleUserArgs.Builder]*):
        com.pulumi.gcp.privilegedaccessmanager.EntitlementArgs.Builder =
      def argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementEligibleUserArgs.builder
      builder.eligibleUsers(args.map(_(argsBuilder).build)*)

    /**
     * @param privilegedAccess Privileged access that this service can be used to gate.
     *  Structure is documented below.
     * @return builder
     */
    def privilegedAccess(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementPrivilegedAccessArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.EntitlementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementPrivilegedAccessArgs.builder
      builder.privilegedAccess(args(argsBuilder).build)

    /**
     * @param requesterJustificationConfig Defines the ways in which a requester should provide the justification while requesting for access.
     *  Structure is documented below.
     * @return builder
     */
    def requesterJustificationConfig(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementRequesterJustificationConfigArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.EntitlementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementRequesterJustificationConfigArgs.builder
      builder.requesterJustificationConfig(args(argsBuilder).build)

  type PrivilegedaccessmanagerFunctions = com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions
  object PrivilegedaccessmanagerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions.*
  extension (self: PrivilegedaccessmanagerFunctions.type)
    /**
     * Use this data source to get information about a Google Cloud Privileged Access Manager Entitlement.
     * 
     *  To get more information about Privileged Access Manager, see:
     * 
     *  * [API Documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
     *  * How-to guides
     *    * [Official documentation](https://cloud.google.com/iam/docs/pam-overview)
     */
    def getEntitlement(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.privilegedaccessmanager.outputs.GetEntitlementResult] =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementArgs.builder
      com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions.getEntitlement(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Google Cloud Privileged Access Manager Entitlement.
     * 
     *  To get more information about Privileged Access Manager, see:
     * 
     *  * [API Documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
     *  * How-to guides
     *    * [Official documentation](https://cloud.google.com/iam/docs/pam-overview)
     */
    def getEntitlementPlain(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.privilegedaccessmanager.outputs.GetEntitlementResult] =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.GetEntitlementPlainArgs.builder
      com.pulumi.gcp.privilegedaccessmanager.PrivilegedaccessmanagerFunctions.getEntitlementPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.privilegedaccessmanager.SettingsArgs.Builder)
    /**
     * @param emailNotificationSettings EmailNotificationSettings defines node-wide email notification preferences for various PAM events.
     *  Structure is documented below.
     * @return builder
     */
    def emailNotificationSettings(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.SettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsArgs.builder
      builder.emailNotificationSettings(args(argsBuilder).build)

    /**
     * @param serviceAccountApproverSettings This controls the node-level settings for allowing service accounts as approvers.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccountApproverSettings(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsServiceAccountApproverSettingsArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.SettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsServiceAccountApproverSettingsArgs.builder
      builder.serviceAccountApproverSettings(args(argsBuilder).build)

  /**
   * Settings resource defines the properties, applied directly to the resource or inherited through the hierarchy, to enable consistent, federated use of PAM.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Settings, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/pam/rest/v1beta/folders.locations/updateSettings)
   *  * How-to Guides
   *      * [Configure Privileged Access Manager settings](https://cloud.google.com/iam/docs/pam-configure-settings)
   *      * [Official Documentation](https://cloud.google.com/iam/docs/pam-overview)
   */
  def Settings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.SettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.SettingsArgs.builder
    com.pulumi.gcp.privilegedaccessmanager.Settings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementRequesterJustificationConfigArgs.Builder)
    /**
     * @param notMandatory The justification is not mandatory but can be provided in any of the supported formats.
     * @return builder
     */
    def notMandatory(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementRequesterJustificationConfigNotMandatoryArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementRequesterJustificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementRequesterJustificationConfigNotMandatoryArgs.builder
      builder.notMandatory(args(argsBuilder).build)

    /**
     * @param unstructured The requester has to provide a justification in the form of free flowing text.
     * @return builder
     */
    def unstructured(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementRequesterJustificationConfigUnstructuredArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementRequesterJustificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementRequesterJustificationConfigUnstructuredArgs.builder
      builder.unstructured(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementState.Builder)
    /**
     * @param additionalNotificationTargets AdditionalNotificationTargets includes email addresses to be notified.
     *  Structure is documented below.
     * @return builder
     */
    def additionalNotificationTargets(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementAdditionalNotificationTargetsArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementState.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementAdditionalNotificationTargetsArgs.builder
      builder.additionalNotificationTargets(args(argsBuilder).build)

    /**
     * @param approvalWorkflow The approvals needed before access will be granted to a requester.
     *  No approvals will be needed if this field is null. Different types of approval workflows that can be used to gate privileged access granting.
     *  Structure is documented below.
     * @return builder
     */
    def approvalWorkflow(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementState.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowArgs.builder
      builder.approvalWorkflow(args(argsBuilder).build)

    /**
     * @param eligibleUsers Who can create Grants using Entitlement. This list should contain at most one entry
     *  Structure is documented below.
     * @return builder
     */
    def eligibleUsers(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementEligibleUserArgs.Builder]*):
        com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementState.Builder =
      def argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementEligibleUserArgs.builder
      builder.eligibleUsers(args.map(_(argsBuilder).build)*)

    /**
     * @param privilegedAccess Privileged access that this service can be used to gate.
     *  Structure is documented below.
     * @return builder
     */
    def privilegedAccess(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementPrivilegedAccessArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementState.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementPrivilegedAccessArgs.builder
      builder.privilegedAccess(args(argsBuilder).build)

    /**
     * @param requesterJustificationConfig Defines the ways in which a requester should provide the justification while requesting for access.
     *  Structure is documented below.
     * @return builder
     */
    def requesterJustificationConfig(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementRequesterJustificationConfigArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementState.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementRequesterJustificationConfigArgs.builder
      builder.requesterJustificationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowManualApprovalsStepArgs.Builder)
    /**
     * @param approvers The potential set of approvers in this step. This list should contain at only one entry.
     *  Structure is documented below.
     * @return builder
     */
    def approvers(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowManualApprovalsStepApproversArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowManualApprovalsStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowManualApprovalsStepApproversArgs.builder
      builder.approvers(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsCustomNotificationBehaviorArgs.Builder)
    /**
     * @param adminNotifications Email notifications specific to Requesters.
     *  Structure is documented below.
     * @return builder
     */
    def adminNotifications(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsCustomNotificationBehaviorAdminNotificationsArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsCustomNotificationBehaviorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsCustomNotificationBehaviorAdminNotificationsArgs.builder
      builder.adminNotifications(args(argsBuilder).build)

    /**
     * @param approverNotifications Email notifications specific to Approvers.
     *  Structure is documented below.
     * @return builder
     */
    def approverNotifications(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsCustomNotificationBehaviorApproverNotificationsArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsCustomNotificationBehaviorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsCustomNotificationBehaviorApproverNotificationsArgs.builder
      builder.approverNotifications(args(argsBuilder).build)

    /**
     * @param requesterNotifications Email notifications specific to Requesters.
     *  Structure is documented below.
     * @return builder
     */
    def requesterNotifications(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsCustomNotificationBehaviorRequesterNotificationsArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsCustomNotificationBehaviorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsCustomNotificationBehaviorRequesterNotificationsArgs.builder
      builder.requesterNotifications(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementPrivilegedAccessArgs.Builder)
    /**
     * @param gcpIamAccess GcpIamAccess represents IAM based access control on a GCP resource. Refer to https://cloud.google.com/iam/docs to understand more about IAM.
     *  Structure is documented below.
     * @return builder
     */
    def gcpIamAccess(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementPrivilegedAccessGcpIamAccessArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementPrivilegedAccessArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementPrivilegedAccessGcpIamAccessArgs.builder
      builder.gcpIamAccess(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowArgs.Builder)
    /**
     * @param manualApprovals A manual approval workflow where users who are designated as approvers need to call the ApproveGrant/DenyGrant APIs for an Grant.
     *  The workflow can consist of multiple serial steps where each step defines who can act as Approver in that step and how many of those users should approve before the workflow moves to the next step.
     *  This can be used to create approval workflows such as
     *  * Require an approval from any user in a group G.
     *  * Require an approval from any k number of users from a Group G.
     *  * Require an approval from any user in a group G and then from a user U. etc.
     *    A single user might be part of `approvers` ACL for multiple steps in this workflow but they can only approve once and that approval will only be considered to satisfy the approval step at which it was granted.
     *    Structure is documented below.
     * @return builder
     */
    def manualApprovals(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowManualApprovalsArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowManualApprovalsArgs.builder
      builder.manualApprovals(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementPrivilegedAccessGcpIamAccessArgs.Builder)
    /**
     * @param roleBindings Role bindings to be created on successful grant.
     *  Structure is documented below.
     * @return builder
     */
    def roleBindings(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementPrivilegedAccessGcpIamAccessRoleBindingArgs.Builder]*):
        com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementPrivilegedAccessGcpIamAccessArgs.Builder =
      def argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementPrivilegedAccessGcpIamAccessRoleBindingArgs.builder
      builder.roleBindings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowManualApprovalsArgs.Builder)
    /**
     * @param steps List of approval steps in this workflow. These steps would be followed in the specified order sequentially.
     *  Structure is documented below.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowManualApprovalsStepArgs.Builder]*):
        com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowManualApprovalsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.EntitlementApprovalWorkflowManualApprovalsStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsArgs.Builder)
    /**
     * @param customNotificationBehavior CustomNotificationBehavior provides granular control over email notification delivery. Allows admins to selectively enable/disable notifications for specific events and specific personas.
     *  Structure is documented below.
     * @return builder
     */
    def customNotificationBehavior(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsCustomNotificationBehaviorArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsCustomNotificationBehaviorArgs.builder
      builder.customNotificationBehavior(args(argsBuilder).build)

    /**
     * @param disableAllNotifications This option indicates that all email notifications are disabled.
     * @return builder
     */
    def disableAllNotifications(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsDisableAllNotificationsArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsDisableAllNotificationsArgs.builder
      builder.disableAllNotifications(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsState.Builder)
    /**
     * @param emailNotificationSettings EmailNotificationSettings defines node-wide email notification preferences for various PAM events.
     *  Structure is documented below.
     * @return builder
     */
    def emailNotificationSettings(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsState.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsEmailNotificationSettingsArgs.builder
      builder.emailNotificationSettings(args(argsBuilder).build)

    /**
     * @param serviceAccountApproverSettings This controls the node-level settings for allowing service accounts as approvers.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccountApproverSettings(args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsServiceAccountApproverSettingsArgs.Builder]):
        com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsState.Builder =
      val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.inputs.SettingsServiceAccountApproverSettingsArgs.builder
      builder.serviceAccountApproverSettings(args(argsBuilder).build)

  /**
   * An Entitlement defines the eligibility of a set of users to obtain a predefined access for some time possibly after going through an approval workflow.
   * 
   *  To get more information about Entitlement, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/pam/rest)
   *  * How-to Guides
   *      * [How to create an Entitlement](https://cloud.google.com/iam/docs/pam-create-entitlements)
   *      * [Official Documentation](https://cloud.google.com/iam/docs/pam-overview)
   */
  def Entitlement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.privilegedaccessmanager.EntitlementArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.privilegedaccessmanager.EntitlementArgs.builder
    com.pulumi.gcp.privilegedaccessmanager.Entitlement(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
