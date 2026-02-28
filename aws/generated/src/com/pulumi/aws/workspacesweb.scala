package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object workspacesweb:
  extension (builder: com.pulumi.aws.workspacesweb.DataProtectionSettingsArgs.Builder)
    /**
     * @param inlineRedactionConfiguration The inline redaction configuration of the data protection settings. Detailed below.
     * @return builder
     */
    def inlineRedactionConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.DataProtectionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationArgs.builder
      builder.inlineRedactionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.PortalArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.PortalTimeoutsArgs.Builder]):
        com.pulumi.aws.workspacesweb.PortalArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.PortalTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS WorkSpaces Web IP Access Settings Association. */
  def IpAccessSettingsAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.IpAccessSettingsAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.workspacesweb.IpAccessSettingsAssociationArgs.builder
    
    com.pulumi.aws.workspacesweb.IpAccessSettingsAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web Identity Provider. */
  def IdentityProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.IdentityProviderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspacesweb.IdentityProviderArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspacesweb.IdentityProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web Data Protection Settings resource. Once associated with a web portal, data protection settings control how sensitive information is redacted in streaming sessions. */
  def DataProtectionSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.DataProtectionSettingsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspacesweb.DataProtectionSettingsArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspacesweb.DataProtectionSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web User Settings Association. */
  def UserSettingsAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.UserSettingsAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.workspacesweb.UserSettingsAssociationArgs.builder
    
    com.pulumi.aws.workspacesweb.UserSettingsAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web User Access Logging Settings Association. */
  def UserAccessLoggingSettingsAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.UserAccessLoggingSettingsAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.workspacesweb.UserAccessLoggingSettingsAssociationArgs.builder
    
    com.pulumi.aws.workspacesweb.UserAccessLoggingSettingsAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web Browser Settings Association. */
  def BrowserSettingsAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.BrowserSettingsAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.workspacesweb.BrowserSettingsAssociationArgs.builder
    
    com.pulumi.aws.workspacesweb.BrowserSettingsAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web Session Logger Association. */
  def SessionLoggerAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.SessionLoggerAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.workspacesweb.SessionLoggerAssociationArgs.builder
    
    com.pulumi.aws.workspacesweb.SessionLoggerAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web Portal. */
  def Portal(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.PortalArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspacesweb.PortalArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspacesweb.Portal(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web User Access Logging Settings resource. Once associated with a web portal, user access logging settings control how user access events are logged to Amazon Kinesis. */
  def UserAccessLoggingSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.UserAccessLoggingSettingsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspacesweb.UserAccessLoggingSettingsArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspacesweb.UserAccessLoggingSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web Trust Store Association. */
  def TrustStoreAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.TrustStoreAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.workspacesweb.TrustStoreAssociationArgs.builder
    
    com.pulumi.aws.workspacesweb.TrustStoreAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.workspacesweb.IpAccessSettingsArgs.Builder)
    /**
     * @param ipRules The IP rules of the IP access settings. See IP Rule below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def ipRules(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.IpAccessSettingsIpRuleArgs.Builder]*):
        com.pulumi.aws.workspacesweb.IpAccessSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.IpAccessSettingsIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

  /** Resource for managing an AWS WorkSpaces Web Network Settings resource. Once associated with a web portal, network settings define how streaming instances will connect with your specified VPC. */
  def NetworkSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.NetworkSettingsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspacesweb.NetworkSettingsArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspacesweb.NetworkSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web IP Access Settings resource. Once associated with a web portal, IP access settings control which IP addresses users can connect from. */
  def IpAccessSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.IpAccessSettingsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspacesweb.IpAccessSettingsArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspacesweb.IpAccessSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web Data Protection Settings Association. */
  def DataProtectionSettingsAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.DataProtectionSettingsAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.workspacesweb.DataProtectionSettingsAssociationArgs.builder
    
    com.pulumi.aws.workspacesweb.DataProtectionSettingsAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.workspacesweb.UserSettingsArgs.Builder)
    /**
     * @param cookieSynchronizationConfiguration Configuration that specifies which cookies should be synchronized from the end user&#39;s local browser to the remote browser. Detailed below.
     * @return builder
     */
    def cookieSynchronizationConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.UserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.builder
      builder.cookieSynchronizationConfiguration(args(argsBuilder).build)

    /**
     * @param toolbarConfiguration Configuration of the toolbar. Detailed below.
     * @return builder
     */
    def toolbarConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.UserSettingsToolbarConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.UserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.UserSettingsToolbarConfigurationArgs.builder
      builder.toolbarConfiguration(args(argsBuilder).build)

  /** Resource for managing an AWS WorkSpaces Web Browser Settings resource. */
  def BrowserSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.BrowserSettingsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspacesweb.BrowserSettingsArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspacesweb.BrowserSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web Trust Store. */
  def TrustStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.TrustStoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspacesweb.TrustStoreArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspacesweb.TrustStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web Session Logger. */
  def SessionLogger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.SessionLoggerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspacesweb.SessionLoggerArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspacesweb.SessionLogger(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS WorkSpaces Web User Settings resource. Once associated with a web portal, user settings control how users can transfer data between a streaming session and their local devices. */
  def UserSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.UserSettingsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workspacesweb.UserSettingsArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.workspacesweb.UserSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.workspacesweb.SessionLoggerArgs.Builder)
    /**
     * @param eventFilter Event filter that determines which events are logged. See Event Filter below.
     * @return builder
     */
    def eventFilter(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterArgs.Builder]):
        com.pulumi.aws.workspacesweb.SessionLoggerArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterArgs.builder
      builder.eventFilter(args(argsBuilder).build)

    /**
     * @param logConfiguration Configuration block for specifying where logs are delivered. See Log Configuration below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def logConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.SessionLoggerArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

  /** Resource for managing an AWS WorkSpaces Web Network Settings Association. */
  def NetworkSettingsAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.workspacesweb.NetworkSettingsAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.workspacesweb.NetworkSettingsAssociationArgs.builder
    
    com.pulumi.aws.workspacesweb.NetworkSettingsAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.SessionLoggerState.Builder)
    /**
     * @param eventFilter Event filter that determines which events are logged. See Event Filter below.
     * @return builder
     */
    def eventFilter(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.SessionLoggerState.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterArgs.builder
      builder.eventFilter(args(argsBuilder).build)

    /**
     * @param logConfiguration Configuration block for specifying where logs are delivered. See Log Configuration below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def logConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.SessionLoggerState.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternArgs.Builder)
    /**
     * @param customPattern The configuration for a custom pattern. Either a `customPattern` or `builtInPatternId` is required. Detailed below.
     * @return builder
     */
    def customPattern(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternCustomPatternArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternCustomPatternArgs.builder
      builder.customPattern(args(argsBuilder).build)

    /**
     * @param redactionPlaceHolders The redaction placeholder that will replace the redacted text in session. Detailed below.
     * @return builder
     */
    def redactionPlaceHolders(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternRedactionPlaceHolderArgs.Builder]*):
        com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternRedactionPlaceHolderArgs.builder
      builder.redactionPlaceHolders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.TrustStoreState.Builder)
    /**
     * @param certificates Set of certificates to include in the trust store. See Certificate below.
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.TrustStoreCertificateArgs.Builder]*):
        com.pulumi.aws.workspacesweb.inputs.TrustStoreState.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.TrustStoreCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.PortalState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.PortalTimeoutsArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.PortalState.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.PortalTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.IpAccessSettingsState.Builder)
    /**
     * @param ipRules The IP rules of the IP access settings. See IP Rule below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def ipRules(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.IpAccessSettingsIpRuleArgs.Builder]*):
        com.pulumi.aws.workspacesweb.inputs.IpAccessSettingsState.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.IpAccessSettingsIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsState.Builder)
    /**
     * @param inlineRedactionConfiguration The inline redaction configuration of the data protection settings. Detailed below.
     * @return builder
     */
    def inlineRedactionConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsState.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationArgs.builder
      builder.inlineRedactionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterArgs.Builder)
    /**
     * @param all Block that specifies to monitor all events. Set to `{}` to monitor all events.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterAllArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.Builder)
    /**
     * @param allowlists List of cookie specifications that are allowed to be synchronized to the remote browser.
     * @return builder
     */
    def allowlists(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationAllowlistArgs.Builder]*):
        com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationAllowlistArgs.builder
      builder.allowlists(args.map(_(argsBuilder).build)*)

    /**
     * @param blocklists List of cookie specifications that are blocked from being synchronized to the remote browser.
     * @return builder
     */
    def blocklists(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationBlocklistArgs.Builder]*):
        com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationBlocklistArgs.builder
      builder.blocklists(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.UserSettingsState.Builder)
    /**
     * @param cookieSynchronizationConfiguration Configuration that specifies which cookies should be synchronized from the end user&#39;s local browser to the remote browser. Detailed below.
     * @return builder
     */
    def cookieSynchronizationConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.UserSettingsState.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.builder
      builder.cookieSynchronizationConfiguration(args(argsBuilder).build)

    /**
     * @param toolbarConfiguration Configuration of the toolbar. Detailed below.
     * @return builder
     */
    def toolbarConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.UserSettingsToolbarConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.UserSettingsState.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.UserSettingsToolbarConfigurationArgs.builder
      builder.toolbarConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationArgs.Builder)
    /**
     * @param s3 Configuration block for S3 log delivery. See S3 Configuration below.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationS3Args.Builder]):
        com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationArgs.Builder)
    /**
     * @param inlineRedactionPatterns The inline redaction patterns to be enabled for the inline redaction configuration. Detailed below.
     * @return builder
     */
    def inlineRedactionPatterns(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternArgs.Builder]*):
        com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternArgs.builder
      builder.inlineRedactionPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspacesweb.TrustStoreArgs.Builder)
    /**
     * @param certificates Set of certificates to include in the trust store. See Certificate below.
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.TrustStoreCertificateArgs.Builder]*):
        com.pulumi.aws.workspacesweb.TrustStoreArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.TrustStoreCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)
