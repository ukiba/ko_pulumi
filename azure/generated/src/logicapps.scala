package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object logicapps:
  /** Manages a Logic App Integration Account Agreement. */
  def IntegrationAccountAgreement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountAgreementArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountAgreementArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountAgreement(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Logic App Integration Account Session. */
  def IntegrationAccountSession(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountSessionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountSessionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountSession(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.logicapps.IntegrationAccountCertificateArgs.Builder)
    /**
     * @param keyVaultKey A `keyVaultKey` block as documented below.
     * @return builder
     */
    def keyVaultKey(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountCertificateKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.logicapps.IntegrationAccountCertificateArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountCertificateKeyVaultKeyArgs.builder
      builder.keyVaultKey(args(argsBuilder).build)

  /** Manages a HTTP Request Trigger within a Logic App Workflow */
  def TriggerHttpRequest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.TriggerHttpRequestArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.TriggerHttpRequestArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.TriggerHttpRequest(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Logic App (Standard / Single Tenant) */
  def Standard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.StandardArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.StandardArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.logicapps.Standard(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Custom Trigger within a Logic App Workflow */
  def TriggerCustom(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.TriggerCustomArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.TriggerCustomArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.TriggerCustom(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.logicapps.IntegrationAccountPartnerArgs.Builder)
    /**
     * @param businessIdentities A `businessIdentity` block as documented below.
     * @return builder
     */
    def businessIdentities(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountPartnerBusinessIdentityArgs.Builder]*):
        com.pulumi.azure.logicapps.IntegrationAccountPartnerArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountPartnerBusinessIdentityArgs.builder
      builder.businessIdentities(args.map(_(argsBuilder).build)*)

  /** Manages a Logic App Integration Account Map. */
  def IntegrationAccountMap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountMapArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountMapArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountMap(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.logicapps.ActionHttpArgs.Builder)
    /**
     * @param runAfters Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `runAfter` block is as defined below.
     * @return builder
     */
    def runAfters(args: Endofunction[com.pulumi.azure.logicapps.inputs.ActionHttpRunAfterArgs.Builder]*):
        com.pulumi.azure.logicapps.ActionHttpArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.ActionHttpRunAfterArgs.builder
      builder.runAfters(args.map(_(argsBuilder).build)*)

  /** Manages a Logic App Integration Account Certificate. */
  def IntegrationAccountCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountCertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.logicapps.TriggerRecurrenceArgs.Builder)
    /**
     * @param schedule A `schedule` block as specified below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.logicapps.inputs.TriggerRecurrenceScheduleArgs.Builder]):
        com.pulumi.azure.logicapps.TriggerRecurrenceArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.TriggerRecurrenceScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  /** Manages a Logic App Integration Account. */
  def IntegrationAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.logicapps.IntegrationAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Logic App Integration Account Partner. */
  def IntegrationAccountPartner(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountPartnerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountPartnerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountPartner(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Recurrence Trigger within a Logic App Workflow */
  def TriggerRecurrence(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.TriggerRecurrenceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.TriggerRecurrenceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.TriggerRecurrence(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type LogicappsFunctions = com.pulumi.azure.logicapps.LogicappsFunctions
  object LogicappsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.logicapps.LogicappsFunctions.*
  extension (self: LogicappsFunctions.type)
    /** Use this data source to access information about an existing Logic App Integration Account. */
    def getIntegrationAccount(args: Endofunction[com.pulumi.azure.logicapps.inputs.GetIntegrationAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.logicapps.outputs.GetIntegrationAccountResult] =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.GetIntegrationAccountArgs.builder
      com.pulumi.azure.logicapps.LogicappsFunctions.getIntegrationAccount(args(argsBuilder).build)

    /** Use this data source to access information about an existing Logic App Integration Account. */
    def getIntegrationAccountPlain(args: Endofunction[com.pulumi.azure.logicapps.inputs.GetIntegrationAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.logicapps.outputs.GetIntegrationAccountResult] =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.GetIntegrationAccountPlainArgs.builder
      com.pulumi.azure.logicapps.LogicappsFunctions.getIntegrationAccountPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Logic App Standard instance. */
    def getStandard(args: Endofunction[com.pulumi.azure.logicapps.inputs.GetStandardArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.logicapps.outputs.GetStandardResult] =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.GetStandardArgs.builder
      com.pulumi.azure.logicapps.LogicappsFunctions.getStandard(args(argsBuilder).build)

    /** Use this data source to access information about an existing Logic App Standard instance. */
    def getStandardPlain(args: Endofunction[com.pulumi.azure.logicapps.inputs.GetStandardPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.logicapps.outputs.GetStandardResult] =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.GetStandardPlainArgs.builder
      com.pulumi.azure.logicapps.LogicappsFunctions.getStandardPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Logic App Workflow. */
    def getWorkflow(args: Endofunction[com.pulumi.azure.logicapps.inputs.GetWorkflowArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.logicapps.outputs.GetWorkflowResult] =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.GetWorkflowArgs.builder
      com.pulumi.azure.logicapps.LogicappsFunctions.getWorkflow(args(argsBuilder).build)

    /** Use this data source to access information about an existing Logic App Workflow. */
    def getWorkflowPlain(args: Endofunction[com.pulumi.azure.logicapps.inputs.GetWorkflowPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.logicapps.outputs.GetWorkflowResult] =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.GetWorkflowPlainArgs.builder
      com.pulumi.azure.logicapps.LogicappsFunctions.getWorkflowPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.IntegrationAccountAgreementArgs.Builder)
    /**
     * @param guestIdentity A `guestIdentity` block as documented below.
     * @return builder
     */
    def guestIdentity(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementGuestIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.IntegrationAccountAgreementArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementGuestIdentityArgs.builder
      builder.guestIdentity(args(argsBuilder).build)

    /**
     * @param hostIdentity A `hostIdentity` block as documented below.
     * @return builder
     */
    def hostIdentity(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementHostIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.IntegrationAccountAgreementArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementHostIdentityArgs.builder
      builder.hostIdentity(args(argsBuilder).build)

  /** Manages a Logic App Integration Account Assembly. */
  def IntegrationAccountAssembly(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountAssemblyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountAssemblyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountAssembly(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Logic App Integration Account Batch Configuration. */
  def IntegrationAccountBatchConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountBatchConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountBatchConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountBatchConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Logic App Integration Account Schema. */
  def IntegrationAccountSchema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountSchemaArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountSchemaArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountSchema(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Custom Action within a Logic App Workflow */
  def ActionCustom(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.ActionCustomArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.ActionCustomArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.ActionCustom(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.logicapps.WorkflowArgs.Builder)
    /**
     * @param accessControl A `accessControl` block as defined below.
     * @return builder
     */
    def accessControl(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder]):
        com.pulumi.azure.logicapps.WorkflowArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.builder
      builder.accessControl(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.WorkflowArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.logicapps.WorkflowArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.logicapps.StandardArgs.Builder)
    /**
     * @param connectionStrings A `connectionString` block as defined below.
     * @return builder
     */
    def connectionStrings(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardConnectionStringArgs.Builder]*):
        com.pulumi.azure.logicapps.StandardArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.StandardConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.StandardArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` object as defined below.
     * @return builder
     */
    def siteConfig(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.Builder]):
        com.pulumi.azure.logicapps.StandardArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.logicapps.StandardArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an HTTP Action within a Logic App Workflow */
  def ActionHttp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.ActionHttpArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.ActionHttpArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.ActionHttp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.logicapps.IntegrationAccountBatchConfigurationArgs.Builder)
    /**
     * @param releaseCriteria A `releaseCriteria` block as documented below, which is used to select the criteria to meet before processing each batch.
     * @return builder
     */
    def releaseCriteria(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs.Builder]):
        com.pulumi.azure.logicapps.IntegrationAccountBatchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs.builder
      builder.releaseCriteria(args(argsBuilder).build)

  /** Manages a Logic App Workflow. */
  def Workflow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.WorkflowArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.WorkflowArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.logicapps.Workflow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleArgs.Builder)
    /**
     * @param monthlies A `monthly` block as documented below.
     * @return builder
     */
    def monthlies(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyArgs.builder
      builder.monthlies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs.Builder)
    /**
     * @param recurrence A `recurrence` block as documented below.
     * @return builder
     */
    def recurrence(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountPartnerState.Builder)
    /**
     * @param businessIdentities A `businessIdentity` block as documented below.
     * @return builder
     */
    def businessIdentities(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountPartnerBusinessIdentityArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountPartnerState.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountPartnerBusinessIdentityArgs.builder
      builder.businessIdentities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountCertificateState.Builder)
    /**
     * @param keyVaultKey A `keyVaultKey` block as documented below.
     * @return builder
     */
    def keyVaultKey(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountCertificateKeyVaultKeyArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountCertificateState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountCertificateKeyVaultKeyArgs.builder
      builder.keyVaultKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerOpenAuthenticationPolicyArgs.Builder)
    /**
     * @param claims A `claim` block as defined below.
     * @return builder
     */
    def claims(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerOpenAuthenticationPolicyClaimArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerOpenAuthenticationPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerOpenAuthenticationPolicyClaimArgs.builder
      builder.claims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceArgs.Builder)
    /**
     * @param schedule A `schedule` block as documented below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.StandardSiteConfigScmIpRestrictionArgs.Builder)
    /**
     * @param headers The `headers` block for this specific `ipRestriction` as defined below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigScmIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.StandardSiteConfigScmIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigScmIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerArgs.Builder)
    /**
     * @param openAuthenticationPolicies A `openAuthenticationPolicy` block as defined below.
     * @return builder
     */
    def openAuthenticationPolicies(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerOpenAuthenticationPolicyArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerOpenAuthenticationPolicyArgs.builder
      builder.openAuthenticationPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.inputs.StandardState.Builder)
    /**
     * @param connectionStrings A `connectionString` block as defined below.
     * @return builder
     */
    def connectionStrings(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardConnectionStringArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.StandardState.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.StandardConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.StandardState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param siteConfig A `siteConfig` object as defined below.
     * @return builder
     */
    def siteConfig(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.StandardState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.builder
      builder.siteConfig(args(argsBuilder).build)

    /**
     * @param siteCredentials A `siteCredential` block as defined below, which contains the site-level credentials used to publish to this App Service.
     * @return builder
     */
    def siteCredentials(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteCredentialArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.StandardState.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteCredentialArgs.builder
      builder.siteCredentials(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.logicapps.inputs.StandardState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.Builder)
    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigCorsArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param ipRestrictions A list of `ipRestriction` objects representing IP restrictions as defined below.
     * 
     *  &gt; **Note:** User has to explicitly set `ipRestriction` to empty slice (`[]`) to remove it.
     * @return builder
     */
    def ipRestrictions(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigIpRestrictionArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigIpRestrictionArgs.builder
      builder.ipRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param scmIpRestrictions A list of `scmIpRestriction` objects representing SCM IP restrictions as defined below.
     * 
     *  &gt; **Note:** User has to explicitly set `scmIpRestriction` to empty slice (`[]`) to remove it.
     * @return builder
     */
    def scmIpRestrictions(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigScmIpRestrictionArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.StandardSiteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigScmIpRestrictionArgs.builder
      builder.scmIpRestrictions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.logicapps.inputs.TriggerRecurrenceState.Builder)
    /**
     * @param schedule A `schedule` block as specified below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.logicapps.inputs.TriggerRecurrenceScheduleArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.TriggerRecurrenceState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.TriggerRecurrenceScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder)
    /**
     * @param action A `action` block as defined below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlActionArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param content A `content` block as defined below.
     * @return builder
     */
    def content(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlContentArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlContentArgs.builder
      builder.content(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    def trigger(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

    /**
     * @param workflowManagement A `workflowManagement` block as defined below.
     * @return builder
     */
    def workflowManagement(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlWorkflowManagementArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlWorkflowManagementArgs.builder
      builder.workflowManagement(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.WorkflowState.Builder)
    /**
     * @param accessControl A `accessControl` block as defined below.
     * @return builder
     */
    def accessControl(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.WorkflowState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowAccessControlArgs.builder
      builder.accessControl(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.logicapps.inputs.WorkflowIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.WorkflowState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.WorkflowIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.logicapps.inputs.WorkflowState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.logicapps.inputs.StandardSiteConfigIpRestrictionArgs.Builder)
    /**
     * @param headers The `headers` block for this specific as a `ipRestriction` block as defined below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.logicapps.inputs.StandardSiteConfigIpRestrictionHeadersArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.StandardSiteConfigIpRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.StandardSiteConfigIpRestrictionHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementState.Builder)
    /**
     * @param guestIdentity A `guestIdentity` block as documented below.
     * @return builder
     */
    def guestIdentity(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementGuestIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementGuestIdentityArgs.builder
      builder.guestIdentity(args(argsBuilder).build)

    /**
     * @param hostIdentity A `hostIdentity` block as documented below.
     * @return builder
     */
    def hostIdentity(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementHostIdentityArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementHostIdentityArgs.builder
      builder.hostIdentity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationState.Builder)
    /**
     * @param releaseCriteria A `releaseCriteria` block as documented below, which is used to select the criteria to meet before processing each batch.
     * @return builder
     */
    def releaseCriteria(args: Endofunction[com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs.Builder]):
        com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs.builder
      builder.releaseCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.logicapps.inputs.ActionHttpState.Builder)
    /**
     * @param runAfters Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `runAfter` block is as defined below.
     * @return builder
     */
    def runAfters(args: Endofunction[com.pulumi.azure.logicapps.inputs.ActionHttpRunAfterArgs.Builder]*):
        com.pulumi.azure.logicapps.inputs.ActionHttpState.Builder =
      def argsBuilder = com.pulumi.azure.logicapps.inputs.ActionHttpRunAfterArgs.builder
      builder.runAfters(args.map(_(argsBuilder).build)*)
