package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object securitycenter:
  /** Manages a resources Advanced Threat Protection setting. */
  inline def AdvancedThreatProtection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.AdvancedThreatProtectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.securitycenter.AdvancedThreatProtectionArgs.builder
    com.pulumi.azure.securitycenter.AdvancedThreatProtection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the Security Center Assessment for Azure Security Center. */
  inline def Assessment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.AssessmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.securitycenter.AssessmentArgs.builder
    com.pulumi.azure.securitycenter.Assessment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the Security Center Assessment Metadata for Azure Security Center. */
  inline def AssessmentPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.AssessmentPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.securitycenter.AssessmentPolicyArgs.builder
    com.pulumi.azure.securitycenter.AssessmentPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Enables or disables the Security Center Auto Provisioning feature for the subscription
   * 
   * &gt; **Note:** The `azure.securitycenter.AutoProvisioning` resource has been deprecated because [the auto provisioning capability will be deprecated by end of Novemember of 2024](https://learn.microsoft.com/en-us/azure/defender-for-cloud/prepare-deprecation-log-analytics-mma-agent#log-analytics-agent-autoprovisioning-experience---deprecation-plan) and will be removed in v5.0 of the AzureRM Provider.
   * 
   * &gt; **Note:** There is no resource name required, it will always be &#34;default&#34;
   */
  inline def AutoProvisioning(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.AutoProvisioningArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.securitycenter.AutoProvisioningArgs.builder
    com.pulumi.azure.securitycenter.AutoProvisioning(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages Security Center Automation and Continuous Export. This resource supports three types of destination in the `action`, Logic Apps, Log Analytics and Event Hubs */
  inline def Automation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.AutomationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.securitycenter.AutomationArgs.builder
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
    com.pulumi.azure.securitycenter.Automation(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the subscription&#39;s Security Center Contact.
   * 
   * &gt; **Note:** Owner access permission is required.
   */
  inline def Contact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.ContactArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.securitycenter.ContactArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.securitycenter.Contact(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Azure Server Vulnerability Assessment (Qualys) to a VM.
   * 
   * &gt; **Note:** Azure Defender has to be enabled on the subscription in order for this resource to work.
   * See this [documentation](https://docs.microsoft.com/azure/security-center/security-center-get-started) to get started.
   */
  inline def ServerVulnerabilityAssessmentVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.ServerVulnerabilityAssessmentVirtualMachineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.securitycenter.ServerVulnerabilityAssessmentVirtualMachineArgs.builder
    com.pulumi.azure.securitycenter.ServerVulnerabilityAssessmentVirtualMachine(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the Server Vulnerability Assesments Setting for Azure Security Center.
   * 
   * &gt; **Note:** This resource requires the `Owner` permission on the Subscription.
   * 
   * &gt; **Note:** Deletion of this resource disables the setting.
   */
  inline def ServerVulnerabilityAssessmentsSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.ServerVulnerabilityAssessmentsSettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.securitycenter.ServerVulnerabilityAssessmentsSettingArgs.builder
    com.pulumi.azure.securitycenter.ServerVulnerabilityAssessmentsSetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the Data Access Settings for Azure Security Center.
   * 
   * &gt; **Note:** This resource requires the `Owner` permission on the Subscription.
   * 
   * &gt; **Note:** Deletion of this resource disables the setting.
   */
  inline def Setting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.SettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.securitycenter.SettingArgs.builder
    com.pulumi.azure.securitycenter.Setting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the Defender for Storage. */
  inline def StorageDefender(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.StorageDefenderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.securitycenter.StorageDefenderArgs.builder
    com.pulumi.azure.securitycenter.StorageDefender(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the Pricing Tier for Azure Security Center in the current subscription.
   * 
   * &gt; **Note:** Deletion of this resource will reset the pricing tier to `Free`
   */
  inline def SubscriptionPricing(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.SubscriptionPricingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.securitycenter.SubscriptionPricingArgs.builder
    com.pulumi.azure.securitycenter.SubscriptionPricing(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the subscription&#39;s Security Center Workspace.
   * 
   * &gt; **Note:** Owner access permission is required.
   */
  inline def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.securitycenter.WorkspaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.securitycenter.WorkspaceArgs.builder
    com.pulumi.azure.securitycenter.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
