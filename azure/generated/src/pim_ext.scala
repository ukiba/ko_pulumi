package jp.ukiba.ko_pulumi
package azure

object pim_ext:
  extension (builder: com.pulumi.azure.pim.ActiveRoleAssignmentArgs.Builder)
    /**
     * @param schedule A `schedule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.pim.inputs.ActiveRoleAssignmentScheduleArgs.Builder]):
        com.pulumi.azure.pim.ActiveRoleAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.ActiveRoleAssignmentScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param ticket A `ticket` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ticket(args: Endofunction[com.pulumi.azure.pim.inputs.ActiveRoleAssignmentTicketArgs.Builder]):
        com.pulumi.azure.pim.ActiveRoleAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.ActiveRoleAssignmentTicketArgs.builder
      builder.ticket(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.pim.EligibleRoleAssignmentArgs.Builder)
    /**
     * @param schedule A `schedule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleArgs.Builder]):
        com.pulumi.azure.pim.EligibleRoleAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param ticket A `ticket` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ticket(args: Endofunction[com.pulumi.azure.pim.inputs.EligibleRoleAssignmentTicketArgs.Builder]):
        com.pulumi.azure.pim.EligibleRoleAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.EligibleRoleAssignmentTicketArgs.builder
      builder.ticket(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.pim.RoleManagementPolicyArgs.Builder)
    /**
     * @param activationRules An `activationRules` block as defined below.
     * @return builder
     */
    def activationRules(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesArgs.Builder]):
        com.pulumi.azure.pim.RoleManagementPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesArgs.builder
      builder.activationRules(args(argsBuilder).build)

    /**
     * @param activeAssignmentRules An `activeAssignmentRules` block as defined below.
     * @return builder
     */
    def activeAssignmentRules(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyActiveAssignmentRulesArgs.Builder]):
        com.pulumi.azure.pim.RoleManagementPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyActiveAssignmentRulesArgs.builder
      builder.activeAssignmentRules(args(argsBuilder).build)

    /**
     * @param eligibleAssignmentRules An `eligibleAssignmentRules` block as defined below.
     * @return builder
     */
    def eligibleAssignmentRules(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyEligibleAssignmentRulesArgs.Builder]):
        com.pulumi.azure.pim.RoleManagementPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyEligibleAssignmentRulesArgs.builder
      builder.eligibleAssignmentRules(args(argsBuilder).build)

    /**
     * @param notificationRules A `notificationRules` block as defined below.
     * @return builder
     */
    def notificationRules(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesArgs.Builder]):
        com.pulumi.azure.pim.RoleManagementPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesArgs.builder
      builder.notificationRules(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.pim.inputs.ActiveRoleAssignmentScheduleArgs.Builder)
    /**
     * @param expiration An `expiration` block as defined above.
     * @return builder
     */
    def expiration(args: Endofunction[com.pulumi.azure.pim.inputs.ActiveRoleAssignmentScheduleExpirationArgs.Builder]):
        com.pulumi.azure.pim.inputs.ActiveRoleAssignmentScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.ActiveRoleAssignmentScheduleExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.pim.inputs.ActiveRoleAssignmentState.Builder)
    /**
     * @param schedule A `schedule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.pim.inputs.ActiveRoleAssignmentScheduleArgs.Builder]):
        com.pulumi.azure.pim.inputs.ActiveRoleAssignmentState.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.ActiveRoleAssignmentScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param ticket A `ticket` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ticket(args: Endofunction[com.pulumi.azure.pim.inputs.ActiveRoleAssignmentTicketArgs.Builder]):
        com.pulumi.azure.pim.inputs.ActiveRoleAssignmentState.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.ActiveRoleAssignmentTicketArgs.builder
      builder.ticket(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleArgs.Builder)
    /**
     * @param expiration An `expiration` block as defined above.
     * @return builder
     */
    def expiration(args: Endofunction[com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleExpirationArgs.Builder]):
        com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.pim.inputs.EligibleRoleAssignmentState.Builder)
    /**
     * @param schedule A `schedule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleArgs.Builder]):
        com.pulumi.azure.pim.inputs.EligibleRoleAssignmentState.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.EligibleRoleAssignmentScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param ticket A `ticket` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ticket(args: Endofunction[com.pulumi.azure.pim.inputs.EligibleRoleAssignmentTicketArgs.Builder]):
        com.pulumi.azure.pim.inputs.EligibleRoleAssignmentState.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.EligibleRoleAssignmentTicketArgs.builder
      builder.ticket(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesApprovalStageArgs.Builder)
    /**
     * @param primaryApprovers One or more `primaryApprover` blocks as defined below.
     * @return builder
     */
    def primaryApprovers(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesApprovalStagePrimaryApproverArgs.Builder]*):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesApprovalStageArgs.Builder =
      def argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesApprovalStagePrimaryApproverArgs.builder
      builder.primaryApprovers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesArgs.Builder)
    /**
     * @param approvalStage An `approvalStage` block as defined below.
     * @return builder
     */
    def approvalStage(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesApprovalStageArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesApprovalStageArgs.builder
      builder.approvalStage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsArgs.Builder)
    /**
     * @param adminNotifications Admin notification settings
     * @return builder
     */
    def adminNotifications(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsAdminNotificationsArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsAdminNotificationsArgs.builder
      builder.adminNotifications(args(argsBuilder).build)

    /**
     * @param approverNotifications Approver notification settings
     * @return builder
     */
    def approverNotifications(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsApproverNotificationsArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsApproverNotificationsArgs.builder
      builder.approverNotifications(args(argsBuilder).build)

    /**
     * @param assigneeNotifications Assignee notification settings
     * @return builder
     */
    def assigneeNotifications(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsAssigneeNotificationsArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsAssigneeNotificationsArgs.builder
      builder.assigneeNotifications(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesArgs.Builder)
    /**
     * @param activeAssignments A `notificationTarget` block as defined below to configure notfications on active role assignments.
     * @return builder
     */
    def activeAssignments(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesActiveAssignmentsArgs.builder
      builder.activeAssignments(args(argsBuilder).build)

    /**
     * @param eligibleActivations A `notificationTarget` block as defined below for configuring notifications on activation of eligible role.
     * @return builder
     */
    def eligibleActivations(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsArgs.builder
      builder.eligibleActivations(args(argsBuilder).build)

    /**
     * @param eligibleAssignments A `notificationTarget` block as defined below to configure notification on eligible role assignments.
     * @return builder
     */
    def eligibleAssignments(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs.builder
      builder.eligibleAssignments(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsArgs.Builder)
    /**
     * @param adminNotifications Admin notification settings
     * @return builder
     */
    def adminNotifications(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsAdminNotificationsArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsAdminNotificationsArgs.builder
      builder.adminNotifications(args(argsBuilder).build)

    /**
     * @param approverNotifications Approver notification settings
     * @return builder
     */
    def approverNotifications(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsApproverNotificationsArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsApproverNotificationsArgs.builder
      builder.approverNotifications(args(argsBuilder).build)

    /**
     * @param assigneeNotifications Assignee notification settings
     * @return builder
     */
    def assigneeNotifications(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotificationsArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotificationsArgs.builder
      builder.assigneeNotifications(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs.Builder)
    /**
     * @param adminNotifications Admin notification settings
     * @return builder
     */
    def adminNotifications(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsAdminNotificationsArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsAdminNotificationsArgs.builder
      builder.adminNotifications(args(argsBuilder).build)

    /**
     * @param approverNotifications Approver notification settings
     * @return builder
     */
    def approverNotifications(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsApproverNotificationsArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsApproverNotificationsArgs.builder
      builder.approverNotifications(args(argsBuilder).build)

    /**
     * @param assigneeNotifications Assignee notification settings
     * @return builder
     */
    def assigneeNotifications(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsAssigneeNotificationsArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsAssigneeNotificationsArgs.builder
      builder.assigneeNotifications(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.pim.inputs.RoleManagementPolicyState.Builder)
    /**
     * @param activationRules An `activationRules` block as defined below.
     * @return builder
     */
    def activationRules(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesArgs.builder
      builder.activationRules(args(argsBuilder).build)

    /**
     * @param activeAssignmentRules An `activeAssignmentRules` block as defined below.
     * @return builder
     */
    def activeAssignmentRules(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyActiveAssignmentRulesArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyActiveAssignmentRulesArgs.builder
      builder.activeAssignmentRules(args(argsBuilder).build)

    /**
     * @param eligibleAssignmentRules An `eligibleAssignmentRules` block as defined below.
     * @return builder
     */
    def eligibleAssignmentRules(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyEligibleAssignmentRulesArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyEligibleAssignmentRulesArgs.builder
      builder.eligibleAssignmentRules(args(argsBuilder).build)

    /**
     * @param notificationRules A `notificationRules` block as defined below.
     * @return builder
     */
    def notificationRules(args: Endofunction[com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesArgs.Builder]):
        com.pulumi.azure.pim.inputs.RoleManagementPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesArgs.builder
      builder.notificationRules(args(argsBuilder).build)
