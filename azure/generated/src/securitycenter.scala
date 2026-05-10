package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object securitycenter:
  /**
   * Manages the Pricing Tier for Azure Security Center in the current subscription.
   * 
   *  &gt; **Note:** Deletion of this resource will reset the pricing tier to `Free`
   */
  def SubscriptionPricing(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.SubscriptionPricingArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.securitycenter.SubscriptionPricingArgs.builder
    com.pulumi.azure.securitycenter.SubscriptionPricing(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the Defender for Storage. */
  def StorageDefender(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.StorageDefenderArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.securitycenter.StorageDefenderArgs.builder
    com.pulumi.azure.securitycenter.StorageDefender(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages the subscription&#39;s Security Center Contact.
   * 
   *  &gt; **Note:** Owner access permission is required.
   */
  def Contact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.ContactArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.securitycenter.ContactArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.securitycenter.Contact(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages Security Center Automation and Continuous Export. This resource supports three types of destination in the `action`, Logic Apps, Log Analytics and Event Hubs */
  def Automation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.AutomationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.securitycenter.AutomationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.securitycenter.Automation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Enables or disables the Security Center Auto Provisioning feature for the subscription
   * 
   *  &gt; **Note:** The `azure.securitycenter.AutoProvisioning` resource has been deprecated because [the auto provisioning capability will be deprecated by end of Novemember of 2024](https://learn.microsoft.com/en-us/azure/defender-for-cloud/prepare-deprecation-log-analytics-mma-agent#log-analytics-agent-autoprovisioning-experience---deprecation-plan) and will be removed in v5.0 of the AzureRM Provider.
   * 
   *  &gt; **Note:** There is no resource name required, it will always be &#34;default&#34;
   */
  def AutoProvisioning(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.AutoProvisioningArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.securitycenter.AutoProvisioningArgs.builder
    com.pulumi.azure.securitycenter.AutoProvisioning(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a resources Advanced Threat Protection setting. */
  def AdvancedThreatProtection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.AdvancedThreatProtectionArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.securitycenter.AdvancedThreatProtectionArgs.builder
    com.pulumi.azure.securitycenter.AdvancedThreatProtection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the Security Center Assessment Metadata for Azure Security Center. */
  def AssessmentPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.AssessmentPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.securitycenter.AssessmentPolicyArgs.builder
    com.pulumi.azure.securitycenter.AssessmentPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.securitycenter.AssessmentArgs.Builder)
    /**
     * @param status A `status` block as defined below.
     * @return builder
     */
    def status(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AssessmentStatusArgs.Builder]):
        com.pulumi.azure.securitycenter.AssessmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.securitycenter.inputs.AssessmentStatusArgs.builder
      builder.status(args(argsBuilder).build)

  /**
   * Manages an Azure Server Vulnerability Assessment (Qualys) to a VM.
   * 
   *  &gt; **Note:** Azure Defender has to be enabled on the subscription in order for this resource to work.
   *  See this [documentation](https://docs.microsoft.com/azure/security-center/security-center-get-started) to get started.
   */
  def ServerVulnerabilityAssessmentVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.ServerVulnerabilityAssessmentVirtualMachineArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.securitycenter.ServerVulnerabilityAssessmentVirtualMachineArgs.builder
    com.pulumi.azure.securitycenter.ServerVulnerabilityAssessmentVirtualMachine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.securitycenter.SubscriptionPricingArgs.Builder)
    /**
     * @param extensions One or more `extension` blocks as defined below.
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.azure.securitycenter.inputs.SubscriptionPricingExtensionArgs.Builder]*):
        com.pulumi.azure.securitycenter.SubscriptionPricingArgs.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.SubscriptionPricingExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

  /**
   * Manages the Data Access Settings for Azure Security Center.
   * 
   *  &gt; **Note:** This resource requires the `Owner` permission on the Subscription.
   * 
   *  &gt; **Note:** Deletion of this resource disables the setting.
   */
  def Setting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.SettingArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.securitycenter.SettingArgs.builder
    com.pulumi.azure.securitycenter.Setting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the Security Center Assessment for Azure Security Center. */
  def Assessment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.AssessmentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.securitycenter.AssessmentArgs.builder
    com.pulumi.azure.securitycenter.Assessment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.securitycenter.AutomationArgs.Builder)
    /**
     * @param actions One or more `action` blocks as defined below. An `action` tells this automation where the data is to be sent to upon being evaluated by the rules in the `source`.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AutomationActionArgs.Builder]*):
        com.pulumi.azure.securitycenter.AutomationArgs.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.AutomationActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below. A `source` defines what data types will be processed and a set of rules to filter that data.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AutomationSourceArgs.Builder]*):
        com.pulumi.azure.securitycenter.AutomationArgs.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.AutomationSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.securitycenter.AutomationArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages the subscription&#39;s Security Center Workspace.
   * 
   *  &gt; **Note:** Owner access permission is required.
   */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.WorkspaceArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.securitycenter.WorkspaceArgs.builder
    com.pulumi.azure.securitycenter.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages the Server Vulnerability Assesments Setting for Azure Security Center.
   * 
   *  &gt; **Note:** This resource requires the `Owner` permission on the Subscription.
   * 
   *  &gt; **Note:** Deletion of this resource disables the setting.
   */
  def ServerVulnerabilityAssessmentsSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.ServerVulnerabilityAssessmentsSettingArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.securitycenter.ServerVulnerabilityAssessmentsSettingArgs.builder
    com.pulumi.azure.securitycenter.ServerVulnerabilityAssessmentsSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.securitycenter.inputs.AutomationSourceArgs.Builder)
    /**
     * @param ruleSets A set of rules which evaluate upon event and data interception. This is defined in one or more `ruleSet` blocks as defined below.
     * 
     *  &gt; **Note:** When multiple `ruleSet` block are provided, a logical &#39;OR&#39; is applied to the evaluation of them.
     * @return builder
     */
    def ruleSets(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AutomationSourceRuleSetArgs.Builder]*):
        com.pulumi.azure.securitycenter.inputs.AutomationSourceArgs.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.AutomationSourceRuleSetArgs.builder
      builder.ruleSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.securitycenter.inputs.SubscriptionPricingState.Builder)
    /**
     * @param extensions One or more `extension` blocks as defined below.
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.azure.securitycenter.inputs.SubscriptionPricingExtensionArgs.Builder]*):
        com.pulumi.azure.securitycenter.inputs.SubscriptionPricingState.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.SubscriptionPricingExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.securitycenter.inputs.AssessmentState.Builder)
    /**
     * @param status A `status` block as defined below.
     * @return builder
     */
    def status(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AssessmentStatusArgs.Builder]):
        com.pulumi.azure.securitycenter.inputs.AssessmentState.Builder =
      val argsBuilder = com.pulumi.azure.securitycenter.inputs.AssessmentStatusArgs.builder
      builder.status(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.securitycenter.inputs.AutomationState.Builder)
    /**
     * @param actions One or more `action` blocks as defined below. An `action` tells this automation where the data is to be sent to upon being evaluated by the rules in the `source`.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AutomationActionArgs.Builder]*):
        com.pulumi.azure.securitycenter.inputs.AutomationState.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.AutomationActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below. A `source` defines what data types will be processed and a set of rules to filter that data.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AutomationSourceArgs.Builder]*):
        com.pulumi.azure.securitycenter.inputs.AutomationState.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.AutomationSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.securitycenter.inputs.AutomationState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.securitycenter.inputs.AutomationSourceRuleSetArgs.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * 
     *  &gt; **Note:** This automation will trigger when all of the `rule`s in this `ruleSet` are evaluated as &#39;true&#39;. This is equivalent to a logical &#39;AND&#39;.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AutomationSourceRuleSetRuleArgs.Builder]*):
        com.pulumi.azure.securitycenter.inputs.AutomationSourceRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.AutomationSourceRuleSetRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)
