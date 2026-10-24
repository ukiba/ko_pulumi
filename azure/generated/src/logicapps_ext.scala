package jp.ukiba.ko_pulumi
package azure

object logicapps_ext:
  extension (builder: com.pulumi.azure.logicapps.ActionHttpArgs.Builder)
    /**
     * @param runAfters Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `runAfter` block is as defined below.
     * @return builder
     */
    inline def runAfters(args: Endofunction[com.pulumi.azure.logicapps.inputs.ActionHttpRunAfterArgs.Builder]*):
        com.pulumi.azure.logicapps.ActionHttpArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.ActionHttpRunAfterArgs.builder
      builder.runAfters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.IntegrationAccountAgreementArgs.Builder)
    /**
     * @param guestIdentity A `guestIdentity` block as documented below.
     * @return builder
     */
    inline def guestIdentity(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementGuestIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.IntegrationAccountAgreementArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementGuestIdentityArgs.builder
      builder.guestIdentity(args(argsBuilder).build)

    /**
     * @param hostIdentity A `hostIdentity` block as documented below.
     * @return builder
     */
    inline def hostIdentity(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementHostIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.IntegrationAccountAgreementArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementHostIdentityArgs.builder
      builder.hostIdentity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.IntegrationAccountBatchConfigurationArgs.Builder)
    /**
     * @param releaseCriteria A `releaseCriteria` block as documented below, which is used to select the criteria to meet before processing each batch.
     * @return builder
     */
    inline def releaseCriteria(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs.Builder]):
        com.pulumi.azure.logicapps.IntegrationAccountBatchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs.builder
      builder.releaseCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.IntegrationAccountCertificateArgs.Builder)
    /**
     * @param keyVaultKey A `keyVaultKey` block as documented below.
     * @return builder
     */
    inline def keyVaultKey(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountCertificateKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.logicapps.IntegrationAccountCertificateArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountCertificateKeyVaultKeyArgs.builder
      builder.keyVaultKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.IntegrationAccountPartnerArgs.Builder)
    /**
     * @param businessIdentities A `businessIdentity` block as documented below.
     * @return builder
     */
    inline def businessIdentities(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountPartnerBusinessIdentityArgs.Builder]*):
        com.pulumi.azure.logicapps.IntegrationAccountPartnerArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountPartnerBusinessIdentityArgs.builder
      builder.businessIdentities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.StandardArgs.Builder)
    /**
     * @param connectionStrings A `connectionString` block as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardConnectionStringArgs.Builder]*):
        com.pulumi.azure.logicapps.StandardArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.StandardConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.StandardArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` object as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.Builder]):
        com.pulumi.azure.logicapps.StandardArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.TriggerRecurrenceArgs.Builder)
    /**
     * @param schedule A `schedule` block as specified below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.logicapps.inputs.TriggerRecurrenceScheduleArgs.Builder]):
        com.pulumi.azure.logicapps.TriggerRecurrenceArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.TriggerRecurrenceScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.WorkflowArgs.Builder)
    /**
     * @param accessControl A `accessControl` block as defined below.
     * @return builder
     */
    inline def accessControl(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder]):
        com.pulumi.azure.logicapps.WorkflowArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.builder
      builder.accessControl(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.WorkflowArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.ActionHttpState.Builder)
    /**
     * @param runAfters Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `runAfter` block is as defined below.
     * @return builder
     */
    inline def runAfters(args: Endofunction[com.pulumi.azure.logicapps.inputs.ActionHttpRunAfterArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.ActionHttpState.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.ActionHttpRunAfterArgs.builder
      builder.runAfters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementState.Builder)
    /**
     * @param guestIdentity A `guestIdentity` block as documented below.
     * @return builder
     */
    inline def guestIdentity(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementGuestIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementGuestIdentityArgs.builder
      builder.guestIdentity(args(argsBuilder).build)

    /**
     * @param hostIdentity A `hostIdentity` block as documented below.
     * @return builder
     */
    inline def hostIdentity(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementHostIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementHostIdentityArgs.builder
      builder.hostIdentity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs.Builder)
    /**
     * @param recurrence A `recurrence` block as documented below.
     * @return builder
     */
    inline def recurrence(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceArgs.Builder)
    /**
     * @param schedule A `schedule` block as documented below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleArgs.Builder)
    /**
     * @param monthlies A `monthly` block as documented below.
     * @return builder
     */
    inline def monthlies(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs.builder
      builder.monthlies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationState.Builder)
    /**
     * @param releaseCriteria A `releaseCriteria` block as documented below, which is used to select the criteria to meet before processing each batch.
     * @return builder
     */
    inline def releaseCriteria(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs.builder
      builder.releaseCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountCertificateState.Builder)
    /**
     * @param keyVaultKey A `keyVaultKey` block as documented below.
     * @return builder
     */
    inline def keyVaultKey(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountCertificateKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountCertificateState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountCertificateKeyVaultKeyArgs.builder
      builder.keyVaultKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountPartnerState.Builder)
    /**
     * @param businessIdentities A `businessIdentity` block as documented below.
     * @return builder
     */
    inline def businessIdentities(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountPartnerBusinessIdentityArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountPartnerState.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountPartnerBusinessIdentityArgs.builder
      builder.businessIdentities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.Builder)
    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param ipRestrictions A list of `ipRestriction` objects representing IP restrictions as defined below.
     * 
     * &gt; **Note:** User has to explicitly set `ipRestriction` to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def ipRestrictions(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions A list of `scmIpRestriction` objects representing SCM IP restrictions as defined below.
     * 
     * &gt; **Note:** User has to explicitly set `scmIpRestriction` to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def scmIpRestrictions(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.inputs.StandardSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers The `headers` block for this specific as a `ipRestriction` block as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.StandardSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.StandardSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers The `headers` block for this specific `ipRestriction` as defined below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.StandardSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.StandardState.Builder)
    /**
     * @param connectionStrings A `connectionString` block as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardConnectionStringArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.StandardState.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.StandardConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.StandardState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` object as defined below.
     * @return builder
     */
    inline def siteConfig(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.StandardState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below, which contains the site-level credentials used to publish to this App Service.
     * @return builder
     */
    inline def siteCredentials(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteCredentialArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.StandardState.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.inputs.TriggerRecurrenceState.Builder)
    /**
     * @param schedule A `schedule` block as specified below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.logicapps.inputs.TriggerRecurrenceScheduleArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.TriggerRecurrenceState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.TriggerRecurrenceScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder)
    /**
     * @param action A `action` block as defined below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlActionArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param content A `content` block as defined below.
     * @return builder
     */
    inline def content(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlContentArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlContentArgs.builder
      builder.content(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    inline def trigger(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

    /**
     * @param workflowManagement A `workflowManagement` block as defined below.
     * @return builder
     */
    inline def workflowManagement(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlWorkflowManagementArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlWorkflowManagementArgs.builder
      builder.workflowManagement(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerArgs.Builder)
    /**
     * @param openAuthenticationPolicies A `openAuthenticationPolicy` block as defined below.
     * @return builder
     */
    inline def openAuthenticationPolicies(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerOpenAuthenticationPolicyArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerOpenAuthenticationPolicyArgs.builder
      builder.openAuthenticationPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerOpenAuthenticationPolicyArgs.Builder)
    /**
     * @param claims A `claim` block as defined below.
     * @return builder
     */
    inline def claims(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerOpenAuthenticationPolicyClaimArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerOpenAuthenticationPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerOpenAuthenticationPolicyClaimArgs.builder
      builder.claims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.inputs.WorkflowState.Builder)
    /**
     * @param accessControl A `accessControl` block as defined below.
     * @return builder
     */
    inline def accessControl(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.WorkflowState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.builder
      builder.accessControl(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.WorkflowState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
