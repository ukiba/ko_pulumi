package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object sentinel:
  /**
   * ## Disclaimers
   * 
   * &gt; **Note:** A Built-in Anomaly Alert Rule could not be deleted. delete a Terraform managed Built-in Anomaly Alert Rule will cause the Built-in Anomaly Alert Rule to be disabled.
   * 
   * Manages a Built-in Anomaly Alert Rule.
   */
  def AlertRuleAnomalyBuiltIn(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleAnomalyBuiltInArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleAnomalyBuiltInArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleAnomalyBuiltIn(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Duplicated Anomaly Alert Rule. */
  def AlertRuleAnomalyDuplicate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.builder
    com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Sentinel Fusion Alert Rule. */
  @deprecated("calls deprecated com.pulumi.azure.sentinel.AlertRuleFusionArgs.Builder.name: the `name` is deprecated and will be removed in v5.0 version of the provider.") def AlertRuleFusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleFusionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleFusionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleFusion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Sentinel Machine Learning Behavior Analytics Alert Rule. */
  def AlertRuleMachineLearningBehaviorAnalytics(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleMachineLearningBehaviorAnalyticsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleMachineLearningBehaviorAnalyticsArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleMachineLearningBehaviorAnalytics(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Sentinel MS Security Incident Alert Rule. */
  def AlertRuleMsSecurityIncident(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleMsSecurityIncidentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleMsSecurityIncidentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleMsSecurityIncident(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Sentinel NRT Alert Rule. */
  def AlertRuleNrt(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleNrtArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleNrt(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Sentinel Scheduled Alert Rule. */
  def AlertRuleScheduled(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleScheduledArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleScheduled(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Sentinel Threat Intelligence Alert Rule. */
  def AlertRuleThreatIntelligence(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleThreatIntelligenceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleThreatIntelligenceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleThreatIntelligence(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Sentinel Automation Rule. */
  @deprecated("azure.sentinel.AuthomationRule has been deprecated in favor of azure.sentinel.AutomationRule") def AuthomationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AuthomationRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AuthomationRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AuthomationRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Sentinel Automation Rule. */
  def AutomationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AutomationRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AutomationRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AutomationRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a AWS CloudTrail Data Connector. */
  def DataConnectorAwsCloudTrail(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorAwsCloudTrailArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorAwsCloudTrailArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorAwsCloudTrail(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a AWS S3 Data Connector. */
  def DataConnectorAwsS3(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorAwsS3Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorAwsS3Args.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorAwsS3(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Azure Active Directory Data Connector. */
  def DataConnectorAzureActiveDirectory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorAzureActiveDirectoryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorAzureActiveDirectoryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorAzureActiveDirectory(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Azure Advanced Threat Protection Data Connector.
   * 
   * &gt; **Note:** This resource requires that [Enterprise Mobility + Security E5](https://www.microsoft.com/en-us/microsoft-365/enterprise-mobility-security) is enabled on the tenant being connected to.
   */
  def DataConnectorAzureAdvancedThreadProtection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorAzureAdvancedThreadProtectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorAzureAdvancedThreadProtectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorAzureAdvancedThreadProtection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Azure Security Center Data Connector. */
  def DataConnectorAzureSecurityCenter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorAzureSecurityCenterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorAzureSecurityCenterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorAzureSecurityCenter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Dynamics 365 Data Connector. */
  def DataConnectorDynamics365(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorDynamics365Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorDynamics365Args.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorDynamics365(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Iot Data Connector. */
  def DataConnectorIot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorIotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorIotArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorIot(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Microsoft Cloud App Security Data Connector.
   * 
   * &gt; **Note:** This resource requires that [Enterprise Mobility + Security E5](https://www.microsoft.com/en-us/microsoft-365/enterprise-mobility-security) is enabled on the tenant being connected to.
   */
  def DataConnectorMicrosoftCloudAppSecurity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorMicrosoftCloudAppSecurityArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorMicrosoftCloudAppSecurityArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorMicrosoftCloudAppSecurity(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Microsoft Defender Advanced Threat Protection Data Connector. */
  def DataConnectorMicrosoftDefenderAdvancedThreatProtection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorMicrosoftDefenderAdvancedThreatProtectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorMicrosoftDefenderAdvancedThreatProtectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorMicrosoftDefenderAdvancedThreatProtection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Microsoft Threat Intelligence Data Connector. */
  def DataConnectorMicrosoftThreatIntelligence(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorMicrosoftThreatIntelligenceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorMicrosoftThreatIntelligenceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorMicrosoftThreatIntelligence(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Microsoft Threat Protection Data Connector. */
  def DataConnectorMicrosoftThreatProtection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorMicrosoftThreatProtectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorMicrosoftThreatProtectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorMicrosoftThreatProtection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Office 365 Data Connector. */
  def DataConnectorOffice365(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorOffice365Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorOffice365Args.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorOffice365(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Office 365 Project Data Connector. */
  def DataConnectorOffice365Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorOffice365ProjectArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorOffice365ProjectArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorOffice365Project(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Office ATP Data Connector. */
  def DataConnectorOfficeAtp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorOfficeAtpArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorOfficeAtpArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorOfficeAtp(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Office IRM Data Connector. */
  def DataConnectorOfficeIrm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorOfficeIrmArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorOfficeIrmArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorOfficeIrm(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Office Power BI Data Connector. */
  def DataConnectorOfficePowerBi(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorOfficePowerBiArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorOfficePowerBiArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorOfficePowerBi(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Threat Intelligence Data Connector. */
  def DataConnectorThreatIntelligence(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorThreatIntelligenceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorThreatIntelligenceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorThreatIntelligence(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Threat Intelligence TAXII Data Connector. */
  def DataConnectorThreatIntelligenceTaxii(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorThreatIntelligenceTaxiiArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorThreatIntelligenceTaxiiArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorThreatIntelligenceTaxii(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Security Insights Sentinel Onboarding. */
  def LogAnalyticsWorkspaceOnboarding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboardingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboardingArgs.builder
    com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboarding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Sentinel Metadata. */
  def Metadata(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.MetadataArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.MetadataArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.Metadata(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object SentinelFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Sentinel Alert Rule. */
    inline def getAlertRule(args: Endofunction[com.pulumi.azure.sentinel.inputs.GetAlertRuleArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.sentinel.outputs.GetAlertRuleResult] =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.GetAlertRuleArgs.builder
      com.pulumi.azure.sentinel.SentinelFunctions.getAlertRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Sentinel Alert Rule. */
    inline def getAlertRulePlain(args: Endofunction[com.pulumi.azure.sentinel.inputs.GetAlertRulePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.sentinel.outputs.GetAlertRuleResult] =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.GetAlertRulePlainArgs.builder
      com.pulumi.azure.sentinel.SentinelFunctions.getAlertRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Anomaly Alert Rule. */
    inline def getAlertRuleAnomaly(args: Endofunction[com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.sentinel.outputs.GetAlertRuleAnomalyResult] =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyArgs.builder
      com.pulumi.azure.sentinel.SentinelFunctions.getAlertRuleAnomaly(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Anomaly Alert Rule. */
    inline def getAlertRuleAnomalyPlain(args: Endofunction[com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.sentinel.outputs.GetAlertRuleAnomalyResult] =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyPlainArgs.builder
      com.pulumi.azure.sentinel.SentinelFunctions.getAlertRuleAnomalyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Sentinel Alert Rule Template. */
    inline def getAlertRuleTemplate(args: Endofunction[com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplateArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.sentinel.outputs.GetAlertRuleTemplateResult] =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplateArgs.builder
      com.pulumi.azure.sentinel.SentinelFunctions.getAlertRuleTemplate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Sentinel Alert Rule Template. */
    inline def getAlertRuleTemplatePlain(args: Endofunction[com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplatePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.sentinel.outputs.GetAlertRuleTemplateResult] =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplatePlainArgs.builder
      com.pulumi.azure.sentinel.SentinelFunctions.getAlertRuleTemplatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Sentinel Threat Intelligence Indicator. */
  def ThreatIntelligenceIndicator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.ThreatIntelligenceIndicatorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.sentinel.ThreatIntelligenceIndicatorArgs.builder
    com.pulumi.azure.sentinel.ThreatIntelligenceIndicator(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Sentinel Watchlist. */
  def Watchlist(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.WatchlistArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.WatchlistArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.Watchlist(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Sentinel Watchlist Item. */
  def WatchlistItem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.WatchlistItemArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.WatchlistItemArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.WatchlistItem(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
