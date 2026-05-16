package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object sentinel:
  /** Manages a Azure Active Directory Data Connector. */
  def DataConnectorAzureActiveDirectory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorAzureActiveDirectoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorAzureActiveDirectoryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorAzureActiveDirectory(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Sentinel NRT Alert Rule. */
  def AlertRuleNrt(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleNrtArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleNrt(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Office Power BI Data Connector. */
  def DataConnectorOfficePowerBi(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorOfficePowerBiArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorOfficePowerBiArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorOfficePowerBi(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * ## Disclaimers
   * 
   *  &gt; **Note:** A Built-in Anomaly Alert Rule could not be deleted. delete a Terraform managed Built-in Anomaly Alert Rule will cause the Built-in Anomaly Alert Rule to be disabled.
   * 
   *  Manages a Built-in Anomaly Alert Rule.
   */
  def AlertRuleAnomalyBuiltIn(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleAnomalyBuiltInArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleAnomalyBuiltInArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleAnomalyBuiltIn(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Sentinel MS Security Incident Alert Rule. */
  def AlertRuleMsSecurityIncident(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleMsSecurityIncidentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleMsSecurityIncidentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleMsSecurityIncident(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Office IRM Data Connector. */
  def DataConnectorOfficeIrm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorOfficeIrmArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorOfficeIrmArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorOfficeIrm(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Sentinel Automation Rule. */
  @deprecated() def AuthomationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AuthomationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AuthomationRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AuthomationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Sentinel Watchlist Item. */
  def WatchlistItem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.WatchlistItemArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.WatchlistItemArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.WatchlistItem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Microsoft Threat Intelligence Data Connector. */
  def DataConnectorMicrosoftThreatIntelligence(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorMicrosoftThreatIntelligenceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorMicrosoftThreatIntelligenceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorMicrosoftThreatIntelligence(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Iot Data Connector. */
  def DataConnectorIot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorIotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorIotArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorIot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Threat Intelligence Data Connector. */
  def DataConnectorThreatIntelligence(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorThreatIntelligenceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorThreatIntelligenceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorThreatIntelligence(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.sentinel.ThreatIntelligenceIndicatorArgs.Builder)
    /**
     * @param externalReferences One or more `externalReference` blocks as defined below.
     * @return builder
     */
    def externalReferences(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorExternalReferenceArgs.Builder]*):
        com.pulumi.azure.sentinel.ThreatIntelligenceIndicatorArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorExternalReferenceArgs.builder
      builder.externalReferences(args.map(_(argsBuilder).build)*)

    /**
     * @param granularMarkings One or more `granularMarking` blocks as defined below.
     * @return builder
     */
    def granularMarkings(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorGranularMarkingArgs.Builder]*):
        com.pulumi.azure.sentinel.ThreatIntelligenceIndicatorArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorGranularMarkingArgs.builder
      builder.granularMarkings(args.map(_(argsBuilder).build)*)

    /**
     * @param killChainPhases One or more `killChainPhase` blocks as defined below.
     * @return builder
     */
    def killChainPhases(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorKillChainPhaseArgs.Builder]*):
        com.pulumi.azure.sentinel.ThreatIntelligenceIndicatorArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorKillChainPhaseArgs.builder
      builder.killChainPhases(args.map(_(argsBuilder).build)*)

  /** Manages a Duplicated Anomaly Alert Rule. */
  def AlertRuleAnomalyDuplicate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.builder
    com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.sentinel.AlertRuleFusionArgs.Builder)
    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleFusionArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  /** Manages a Microsoft Threat Protection Data Connector. */
  def DataConnectorMicrosoftThreatProtection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorMicrosoftThreatProtectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorMicrosoftThreatProtectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorMicrosoftThreatProtection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a AWS S3 Data Connector. */
  def DataConnectorAwsS3(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorAwsS3Args.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorAwsS3Args.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorAwsS3(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Microsoft Defender Advanced Threat Protection Data Connector. */
  def DataConnectorMicrosoftDefenderAdvancedThreatProtection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorMicrosoftDefenderAdvancedThreatProtectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorMicrosoftDefenderAdvancedThreatProtectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorMicrosoftDefenderAdvancedThreatProtection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Azure Advanced Threat Protection Data Connector.
   * 
   *  !&gt; **Note:** This resource requires that [Enterprise Mobility + Security E5](https://www.microsoft.com/en-us/microsoft-365/enterprise-mobility-security) is enabled on the tenant being connected to.
   */
  def DataConnectorAzureAdvancedThreadProtection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorAzureAdvancedThreadProtectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorAzureAdvancedThreadProtectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorAzureAdvancedThreadProtection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder)
    /**
     * @param alertDetailsOverrides An `alertDetailsOverride` block as defined below.
     * @return builder
     */
    def alertDetailsOverrides(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideArgs.builder
      builder.alertDetailsOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param entityMappings A list of `entityMapping` blocks as defined below.
     * @return builder
     */
    def entityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingArgs.builder
      builder.entityMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param eventGrouping A `eventGrouping` block as defined below.
     * @return builder
     */
    def eventGrouping(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEventGroupingArgs.Builder]):
        com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEventGroupingArgs.builder
      builder.eventGrouping(args(argsBuilder).build)

    /**
     * @param incident A `incident` block as defined below.
     * @return builder
     */
    def incident(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentArgs.Builder]):
        com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentArgs.builder
      builder.incident(args(argsBuilder).build)

    /**
     * @param sentinelEntityMappings A list of `sentinelEntityMapping` blocks as defined below.
     * 
     *  &gt; **Note:** `entityMapping` and `sentinelEntityMapping` together can&#39;t exceed 10.
     * @return builder
     */
    def sentinelEntityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledSentinelEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledSentinelEntityMappingArgs.builder
      builder.sentinelEntityMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.MetadataArgs.Builder)
    /**
     * @param author An `author` blocks as defined below.
     * @return builder
     */
    def author(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataAuthorArgs.Builder]):
        com.pulumi.azure.sentinel.MetadataArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataAuthorArgs.builder
      builder.author(args(argsBuilder).build)

    /**
     * @param category A `category` block as defined below.
     * @return builder
     */
    def category(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataCategoryArgs.Builder]):
        com.pulumi.azure.sentinel.MetadataArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataCategoryArgs.builder
      builder.category(args(argsBuilder).build)

    /**
     * @param source A `source` block as defined below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataSourceArgs.Builder]):
        com.pulumi.azure.sentinel.MetadataArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param support A `support` block as defined below.
     * @return builder
     */
    def support(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataSupportArgs.Builder]):
        com.pulumi.azure.sentinel.MetadataArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataSupportArgs.builder
      builder.support(args(argsBuilder).build)

  /** Manages an Office 365 Project Data Connector. */
  def DataConnectorOffice365Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorOffice365ProjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorOffice365ProjectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorOffice365Project(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Threat Intelligence TAXII Data Connector. */
  def DataConnectorThreatIntelligenceTaxii(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorThreatIntelligenceTaxiiArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorThreatIntelligenceTaxiiArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorThreatIntelligenceTaxii(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Sentinel Threat Intelligence Alert Rule. */
  def AlertRuleThreatIntelligence(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleThreatIntelligenceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleThreatIntelligenceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleThreatIntelligence(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a AWS CloudTrail Data Connector. */
  def DataConnectorAwsCloudTrail(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorAwsCloudTrailArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorAwsCloudTrailArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorAwsCloudTrail(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Office 365 Data Connector. */
  def DataConnectorOffice365(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorOffice365Args.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorOffice365Args.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorOffice365(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object SentinelFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Sentinel Alert Rule. */
    inline def getAlertRule(args: Endofunction[com.pulumi.azure.sentinel.inputs.GetAlertRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.sentinel.outputs.GetAlertRuleResult] =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.GetAlertRuleArgs.builder
      com.pulumi.azure.sentinel.SentinelFunctions.getAlertRule(args(argsBuilder).build)

    /** Use this data source to access information about an existing Sentinel Alert Rule. */
    inline def getAlertRulePlain(args: Endofunction[com.pulumi.azure.sentinel.inputs.GetAlertRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.sentinel.outputs.GetAlertRuleResult] =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.GetAlertRulePlainArgs.builder
      com.pulumi.azure.sentinel.SentinelFunctions.getAlertRulePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Anomaly Alert Rule. */
    inline def getAlertRuleAnomaly(args: Endofunction[com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.sentinel.outputs.GetAlertRuleAnomalyResult] =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyArgs.builder
      com.pulumi.azure.sentinel.SentinelFunctions.getAlertRuleAnomaly(args(argsBuilder).build)

    /** Use this data source to access information about an existing Anomaly Alert Rule. */
    inline def getAlertRuleAnomalyPlain(args: Endofunction[com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.sentinel.outputs.GetAlertRuleAnomalyResult] =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.GetAlertRuleAnomalyPlainArgs.builder
      com.pulumi.azure.sentinel.SentinelFunctions.getAlertRuleAnomalyPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Sentinel Alert Rule Template. */
    inline def getAlertRuleTemplate(args: Endofunction[com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.sentinel.outputs.GetAlertRuleTemplateResult] =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplateArgs.builder
      com.pulumi.azure.sentinel.SentinelFunctions.getAlertRuleTemplate(args(argsBuilder).build)

    /** Use this data source to access information about an existing Sentinel Alert Rule Template. */
    inline def getAlertRuleTemplatePlain(args: Endofunction[com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.sentinel.outputs.GetAlertRuleTemplateResult] =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplatePlainArgs.builder
      com.pulumi.azure.sentinel.SentinelFunctions.getAlertRuleTemplatePlain(args(argsBuilder).build)

  /** Manages a Sentinel Metadata. */
  def Metadata(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.MetadataArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.MetadataArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.Metadata(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Sentinel Watchlist. */
  def Watchlist(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.WatchlistArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.WatchlistArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.Watchlist(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Microsoft Cloud App Security Data Connector.
   * 
   *  !&gt; **Note:** This resource requires that [Enterprise Mobility + Security E5](https://www.microsoft.com/en-us/microsoft-365/enterprise-mobility-security) is enabled on the tenant being connected to.
   */
  def DataConnectorMicrosoftCloudAppSecurity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorMicrosoftCloudAppSecurityArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorMicrosoftCloudAppSecurityArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorMicrosoftCloudAppSecurity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.Builder)
    /**
     * @param multiSelectObservations A list of `multiSelectObservation` blocks as defined below.
     * @return builder
     */
    def multiSelectObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateMultiSelectObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateMultiSelectObservationArgs.builder
      builder.multiSelectObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param prioritizedExcludeObservations A list of `prioritizedExcludeObservation` blocks as defined below.
     * @return builder
     */
    def prioritizedExcludeObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs.builder
      builder.prioritizedExcludeObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param singleSelectObservations A list of `singleSelectObservation` blocks as defined below.
     * @return builder
     */
    def singleSelectObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateSingleSelectObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateSingleSelectObservationArgs.builder
      builder.singleSelectObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param thresholdObservations A list of `thresholdObservation` blocks as defined below.
     * 
     *  &gt; **Note:** un-specified `multiSelectObservation`, `singleSelectObservation`, `prioritizedExcludeObservation` and `thresholdObservation` will be inherited from the built-in Anomaly Alert Rule.
     * @return builder
     */
    def thresholdObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateThresholdObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateThresholdObservationArgs.builder
      builder.thresholdObservations(args.map(_(argsBuilder).build)*)

  /** Manages a Sentinel Fusion Alert Rule. */
  def AlertRuleFusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleFusionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleFusionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleFusion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Security Insights Sentinel Onboarding. */
  def LogAnalyticsWorkspaceOnboarding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboardingArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboardingArgs.builder
    com.pulumi.azure.sentinel.LogAnalyticsWorkspaceOnboarding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Sentinel Automation Rule. */
  def AutomationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AutomationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AutomationRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AutomationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Office ATP Data Connector. */
  def DataConnectorOfficeAtp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorOfficeAtpArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorOfficeAtpArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorOfficeAtp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.sentinel.AutomationRuleArgs.Builder)
    /**
     * @param actionIncidentTasks One or more `actionIncidentTask` blocks as defined below.
     * @return builder
     */
    def actionIncidentTasks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentTaskArgs.Builder]*):
        com.pulumi.azure.sentinel.AutomationRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentTaskArgs.builder
      builder.actionIncidentTasks(args.map(_(argsBuilder).build)*)

    /**
     * @param actionIncidents One or more `actionIncident` blocks as defined below.
     * @return builder
     */
    def actionIncidents(args: Endofunction[com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentArgs.Builder]*):
        com.pulumi.azure.sentinel.AutomationRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentArgs.builder
      builder.actionIncidents(args.map(_(argsBuilder).build)*)

    /**
     * @param actionPlaybooks One or more `actionPlaybook` blocks as defined below.
     * 
     *  &gt; **Note:** Either one `actionIncident` block or `actionPlaybook` block has to be specified.
     * @return builder
     */
    def actionPlaybooks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AutomationRuleActionPlaybookArgs.Builder]*):
        com.pulumi.azure.sentinel.AutomationRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AutomationRuleActionPlaybookArgs.builder
      builder.actionPlaybooks(args.map(_(argsBuilder).build)*)

  /** Manages a Azure Security Center Data Connector. */
  def DataConnectorAzureSecurityCenter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorAzureSecurityCenterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorAzureSecurityCenterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorAzureSecurityCenter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.sentinel.AuthomationRuleArgs.Builder)
    /**
     * @param actionIncidentTasks One or more `actionIncidentTask` blocks as defined below.
     * @return builder
     */
    def actionIncidentTasks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentTaskArgs.Builder]*):
        com.pulumi.azure.sentinel.AuthomationRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentTaskArgs.builder
      builder.actionIncidentTasks(args.map(_(argsBuilder).build)*)

    /**
     * @param actionIncidents One or more `actionIncident` blocks as defined below.
     * @return builder
     */
    def actionIncidents(args: Endofunction[com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentArgs.Builder]*):
        com.pulumi.azure.sentinel.AuthomationRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentArgs.builder
      builder.actionIncidents(args.map(_(argsBuilder).build)*)

    /**
     * @param actionPlaybooks One or more `actionPlaybook` blocks as defined below.
     * 
     *  &gt; **Note:** Either one `actionIncident` block or `actionPlaybook` block has to be specified.
     * @return builder
     */
    def actionPlaybooks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AuthomationRuleActionPlaybookArgs.Builder]*):
        com.pulumi.azure.sentinel.AuthomationRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AuthomationRuleActionPlaybookArgs.builder
      builder.actionPlaybooks(args.map(_(argsBuilder).build)*)

  /** Manages a Sentinel Machine Learning Behavior Analytics Alert Rule. */
  def AlertRuleMachineLearningBehaviorAnalytics(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleMachineLearningBehaviorAnalyticsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleMachineLearningBehaviorAnalyticsArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleMachineLearningBehaviorAnalytics(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Sentinel Scheduled Alert Rule. */
  def AlertRuleScheduled(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.AlertRuleScheduledArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.AlertRuleScheduled(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Dynamics 365 Data Connector. */
  def DataConnectorDynamics365(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.DataConnectorDynamics365Args.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.sentinel.DataConnectorDynamics365Args.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.sentinel.DataConnectorDynamics365(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleNrtState.Builder)
    /**
     * @param alertDetailsOverrides An `alertDetailsOverride` block as defined below.
     * @return builder
     */
    def alertDetailsOverrides(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideArgs.builder
      builder.alertDetailsOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param entityMappings A list of `entityMapping` blocks as defined below.
     * @return builder
     */
    def entityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingArgs.builder
      builder.entityMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param eventGrouping A `eventGrouping` block as defined below.
     * @return builder
     */
    def eventGrouping(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtEventGroupingArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtEventGroupingArgs.builder
      builder.eventGrouping(args(argsBuilder).build)

    /**
     * @param incident A `incident` block as defined below.
     * @return builder
     */
    def incident(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentArgs.builder
      builder.incident(args(argsBuilder).build)

    /**
     * @param sentinelEntityMappings A list of `sentinelEntityMapping` blocks as defined below.
     * 
     *  &gt; **Note:** `entityMapping` and `sentinelEntityMapping` together can&#39;t exceed 5.
     * @return builder
     */
    def sentinelEntityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtSentinelEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtSentinelEntityMappingArgs.builder
      builder.sentinelEntityMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AuthomationRuleState.Builder)
    /**
     * @param actionIncidentTasks One or more `actionIncidentTask` blocks as defined below.
     * @return builder
     */
    def actionIncidentTasks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentTaskArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AuthomationRuleState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentTaskArgs.builder
      builder.actionIncidentTasks(args.map(_(argsBuilder).build)*)

    /**
     * @param actionIncidents One or more `actionIncident` blocks as defined below.
     * @return builder
     */
    def actionIncidents(args: Endofunction[com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AuthomationRuleState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentArgs.builder
      builder.actionIncidents(args.map(_(argsBuilder).build)*)

    /**
     * @param actionPlaybooks One or more `actionPlaybook` blocks as defined below.
     * 
     *  &gt; **Note:** Either one `actionIncident` block or `actionPlaybook` block has to be specified.
     * @return builder
     */
    def actionPlaybooks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AuthomationRuleActionPlaybookArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AuthomationRuleState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AuthomationRuleActionPlaybookArgs.builder
      builder.actionPlaybooks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingArgs.Builder)
    /**
     * @param fieldMappings A list of `fieldMapping` blocks as defined below.
     * @return builder
     */
    def fieldMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingFieldMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingFieldMappingArgs.builder
      builder.fieldMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorParsedPatternArgs.Builder)
    /**
     * @param patternTypeValues A `patternTypeValues` block as defined below.
     * @return builder
     */
    def patternTypeValues(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorParsedPatternArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs.builder
      builder.patternTypeValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideArgs.Builder)
    /**
     * @param dynamicProperties A list of `dynamicProperty` blocks as defined below.
     * @return builder
     */
    def dynamicProperties(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs.builder
      builder.dynamicProperties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateState.Builder)
    /**
     * @param multiSelectObservations A list of `multiSelectObservation` blocks as defined below.
     * @return builder
     */
    def multiSelectObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateMultiSelectObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateMultiSelectObservationArgs.builder
      builder.multiSelectObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param prioritizedExcludeObservations A list of `prioritizedExcludeObservation` blocks as defined below.
     * @return builder
     */
    def prioritizedExcludeObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs.builder
      builder.prioritizedExcludeObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param requiredDataConnectors A `requiredDataConnector` block as defined below.
     * @return builder
     */
    def requiredDataConnectors(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateRequiredDataConnectorArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateRequiredDataConnectorArgs.builder
      builder.requiredDataConnectors(args.map(_(argsBuilder).build)*)

    /**
     * @param singleSelectObservations A list of `singleSelectObservation` blocks as defined below.
     * @return builder
     */
    def singleSelectObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateSingleSelectObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateSingleSelectObservationArgs.builder
      builder.singleSelectObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param thresholdObservations A list of `thresholdObservation` blocks as defined below.
     * 
     *  &gt; **Note:** un-specified `multiSelectObservation`, `singleSelectObservation`, `prioritizedExcludeObservation` and `thresholdObservation` will be inherited from the built-in Anomaly Alert Rule.
     * @return builder
     */
    def thresholdObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateThresholdObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateThresholdObservationArgs.builder
      builder.thresholdObservations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideArgs.Builder)
    /**
     * @param dynamicProperties A list of `dynamicProperty` blocks as defined below.
     * @return builder
     */
    def dynamicProperties(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideDynamicPropertyArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideDynamicPropertyArgs.builder
      builder.dynamicProperties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorState.Builder)
    /**
     * @param externalReferences One or more `externalReference` blocks as defined below.
     * @return builder
     */
    def externalReferences(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorExternalReferenceArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorExternalReferenceArgs.builder
      builder.externalReferences(args.map(_(argsBuilder).build)*)

    /**
     * @param granularMarkings One or more `granularMarking` blocks as defined below.
     * @return builder
     */
    def granularMarkings(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorGranularMarkingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorGranularMarkingArgs.builder
      builder.granularMarkings(args.map(_(argsBuilder).build)*)

    /**
     * @param killChainPhases One or more `killChainPhase` blocks as defined below.
     * @return builder
     */
    def killChainPhases(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorKillChainPhaseArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorKillChainPhaseArgs.builder
      builder.killChainPhases(args.map(_(argsBuilder).build)*)

    /**
     * @param parsedPatterns A `parsedPattern` block as defined below.
     * @return builder
     */
    def parsedPatterns(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorParsedPatternArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorParsedPatternArgs.builder
      builder.parsedPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentArgs.Builder)
    /**
     * @param grouping A `grouping` block as defined below.
     * @return builder
     */
    def grouping(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentGroupingArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentGroupingArgs.builder
      builder.grouping(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentArgs.Builder)
    /**
     * @param grouping A `grouping` block as defined below.
     * @return builder
     */
    def grouping(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentGroupingArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentGroupingArgs.builder
      builder.grouping(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingArgs.Builder)
    /**
     * @param fieldMappings A list of `fieldMapping` blocks as defined below.
     * @return builder
     */
    def fieldMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingFieldMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingFieldMappingArgs.builder
      builder.fieldMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.MetadataState.Builder)
    /**
     * @param author An `author` blocks as defined below.
     * @return builder
     */
    def author(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataAuthorArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.MetadataState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataAuthorArgs.builder
      builder.author(args(argsBuilder).build)

    /**
     * @param category A `category` block as defined below.
     * @return builder
     */
    def category(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataCategoryArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.MetadataState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataCategoryArgs.builder
      builder.category(args(argsBuilder).build)

    /**
     * @param source A `source` block as defined below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataSourceArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.MetadataState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param support A `support` block as defined below.
     * @return builder
     */
    def support(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataSupportArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.MetadataState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataSupportArgs.builder
      builder.support(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleFusionState.Builder)
    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleFusionState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceArgs.Builder)
    /**
     * @param subTypes One or more `subType` blocks as defined below.
     * @return builder
     */
    def subTypes(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceSubTypeArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceSubTypeArgs.builder
      builder.subTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleScheduledState.Builder)
    /**
     * @param alertDetailsOverrides An `alertDetailsOverride` block as defined below.
     * @return builder
     */
    def alertDetailsOverrides(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideArgs.builder
      builder.alertDetailsOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param entityMappings A list of `entityMapping` blocks as defined below.
     * @return builder
     */
    def entityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingArgs.builder
      builder.entityMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param eventGrouping A `eventGrouping` block as defined below.
     * @return builder
     */
    def eventGrouping(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEventGroupingArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEventGroupingArgs.builder
      builder.eventGrouping(args(argsBuilder).build)

    /**
     * @param incident A `incident` block as defined below.
     * @return builder
     */
    def incident(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentArgs.builder
      builder.incident(args(argsBuilder).build)

    /**
     * @param sentinelEntityMappings A list of `sentinelEntityMapping` blocks as defined below.
     * 
     *  &gt; **Note:** `entityMapping` and `sentinelEntityMapping` together can&#39;t exceed 10.
     * @return builder
     */
    def sentinelEntityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledSentinelEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledSentinelEntityMappingArgs.builder
      builder.sentinelEntityMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInState.Builder)
    /**
     * @param multiSelectObservations A list of `multiSelectObservation` blocks as defined below.
     * @return builder
     */
    def multiSelectObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInMultiSelectObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInMultiSelectObservationArgs.builder
      builder.multiSelectObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param prioritizedExcludeObservations A list of `prioritizedExcludeObservation` blocks as defined below.
     * @return builder
     */
    def prioritizedExcludeObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInPrioritizedExcludeObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInPrioritizedExcludeObservationArgs.builder
      builder.prioritizedExcludeObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param requiredDataConnectors A `requiredDataConnector` block as defined below.
     * @return builder
     */
    def requiredDataConnectors(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInRequiredDataConnectorArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInRequiredDataConnectorArgs.builder
      builder.requiredDataConnectors(args.map(_(argsBuilder).build)*)

    /**
     * @param singleSelectObservations A list of `singleSelectObservation` blocks as defined below.
     * @return builder
     */
    def singleSelectObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInSingleSelectObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInSingleSelectObservationArgs.builder
      builder.singleSelectObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param thresholdObservations A list of `thresholdObservation` blocks as defined below.
     * @return builder
     */
    def thresholdObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInThresholdObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInThresholdObservationArgs.builder
      builder.thresholdObservations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AutomationRuleState.Builder)
    /**
     * @param actionIncidentTasks One or more `actionIncidentTask` blocks as defined below.
     * @return builder
     */
    def actionIncidentTasks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentTaskArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AutomationRuleState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentTaskArgs.builder
      builder.actionIncidentTasks(args.map(_(argsBuilder).build)*)

    /**
     * @param actionIncidents One or more `actionIncident` blocks as defined below.
     * @return builder
     */
    def actionIncidents(args: Endofunction[com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AutomationRuleState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentArgs.builder
      builder.actionIncidents(args.map(_(argsBuilder).build)*)

    /**
     * @param actionPlaybooks One or more `actionPlaybook` blocks as defined below.
     * 
     *  &gt; **Note:** Either one `actionIncident` block or `actionPlaybook` block has to be specified.
     * @return builder
     */
    def actionPlaybooks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AutomationRuleActionPlaybookArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AutomationRuleState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AutomationRuleActionPlaybookArgs.builder
      builder.actionPlaybooks(args.map(_(argsBuilder).build)*)

  /** Manages a Sentinel Threat Intelligence Indicator. */
  def ThreatIntelligenceIndicator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.sentinel.ThreatIntelligenceIndicatorArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.sentinel.ThreatIntelligenceIndicatorArgs.builder
    com.pulumi.azure.sentinel.ThreatIntelligenceIndicator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder)
    /**
     * @param alertDetailsOverrides An `alertDetailsOverride` block as defined below.
     * @return builder
     */
    def alertDetailsOverrides(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideArgs.builder
      builder.alertDetailsOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param entityMappings A list of `entityMapping` blocks as defined below.
     * @return builder
     */
    def entityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingArgs.builder
      builder.entityMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param eventGrouping A `eventGrouping` block as defined below.
     * @return builder
     */
    def eventGrouping(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtEventGroupingArgs.Builder]):
        com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtEventGroupingArgs.builder
      builder.eventGrouping(args(argsBuilder).build)

    /**
     * @param incident A `incident` block as defined below.
     * @return builder
     */
    def incident(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentArgs.Builder]):
        com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentArgs.builder
      builder.incident(args(argsBuilder).build)

    /**
     * @param sentinelEntityMappings A list of `sentinelEntityMapping` blocks as defined below.
     * 
     *  &gt; **Note:** `entityMapping` and `sentinelEntityMapping` together can&#39;t exceed 5.
     * @return builder
     */
    def sentinelEntityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtSentinelEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtSentinelEntityMappingArgs.builder
      builder.sentinelEntityMappings(args.map(_(argsBuilder).build)*)
