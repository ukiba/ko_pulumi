package jp.ukiba.ko_pulumi
package aws

object workspacesweb_ext:
  extension (builder: com.pulumi.aws.workspacesweb.DataProtectionSettingsArgs.Builder)
    /**
     * @param inlineRedactionConfiguration The inline redaction configuration of the data protection settings. Detailed below.
     * @return builder
     */
    inline def inlineRedactionConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.DataProtectionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationArgs.builder
      builder.inlineRedactionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.IpAccessSettingsArgs.Builder)
    /**
     * @param ipRules The IP rules of the IP access settings. See IP Rule below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def ipRules(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.IpAccessSettingsIpRuleArgs.Builder]*):
        com.pulumi.aws.workspacesweb.IpAccessSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.IpAccessSettingsIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspacesweb.PortalArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.PortalTimeoutsArgs.Builder]):
        com.pulumi.aws.workspacesweb.PortalArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.PortalTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.SessionLoggerArgs.Builder)
    /**
     * @param eventFilter Event filter that determines which events are logged. See Event Filter below.
     * @return builder
     */
    inline def eventFilter(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterArgs.Builder]):
        com.pulumi.aws.workspacesweb.SessionLoggerArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterArgs.builder
      builder.eventFilter(args(argsBuilder).build)

    /**
     * @param logConfiguration Configuration block for specifying where logs are delivered. See Log Configuration below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def logConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.SessionLoggerArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.TrustStoreArgs.Builder)
    /**
     * @param certificates Set of certificates to include in the trust store. See Certificate below.
     * @return builder
     */
    inline def certificates(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.TrustStoreCertificateArgs.Builder]*):
        com.pulumi.aws.workspacesweb.TrustStoreArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.TrustStoreCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspacesweb.UserSettingsArgs.Builder)
    /**
     * @param cookieSynchronizationConfiguration Configuration that specifies which cookies should be synchronized from the end user&#39;s local browser to the remote browser. Detailed below.
     * @return builder
     */
    inline def cookieSynchronizationConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.UserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.builder
      builder.cookieSynchronizationConfiguration(args(argsBuilder).build)

    /**
     * @param toolbarConfiguration Configuration of the toolbar. Detailed below.
     * @return builder
     */
    inline def toolbarConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.UserSettingsToolbarConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.UserSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.UserSettingsToolbarConfigurationArgs.builder
      builder.toolbarConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationArgs.Builder)
    /**
     * @param inlineRedactionPatterns The inline redaction patterns to be enabled for the inline redaction configuration. Detailed below.
     * @return builder
     */
    inline def inlineRedactionPatterns(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternArgs.Builder]*):
        com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternArgs.builder
      builder.inlineRedactionPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternArgs.Builder)
    /**
     * @param customPattern The configuration for a custom pattern. Either a `customPattern` or `builtInPatternId` is required. Detailed below.
     * @return builder
     */
    inline def customPattern(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternCustomPatternArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternCustomPatternArgs.builder
      builder.customPattern(args(argsBuilder).build)

    /**
     * @param redactionPlaceHolders The redaction placeholder that will replace the redacted text in session. Detailed below.
     * @return builder
     */
    inline def redactionPlaceHolders(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternRedactionPlaceHolderArgs.Builder]*):
        com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationInlineRedactionPatternRedactionPlaceHolderArgs.builder
      builder.redactionPlaceHolders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsState.Builder)
    /**
     * @param inlineRedactionConfiguration The inline redaction configuration of the data protection settings. Detailed below.
     * @return builder
     */
    inline def inlineRedactionConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsState.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.DataProtectionSettingsInlineRedactionConfigurationArgs.builder
      builder.inlineRedactionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.IpAccessSettingsState.Builder)
    /**
     * @param ipRules The IP rules of the IP access settings. See IP Rule below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def ipRules(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.IpAccessSettingsIpRuleArgs.Builder]*):
        com.pulumi.aws.workspacesweb.inputs.IpAccessSettingsState.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.IpAccessSettingsIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.PortalState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.PortalTimeoutsArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.PortalState.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.PortalTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterArgs.Builder)
    /**
     * @param all Block that specifies to monitor all events. Set to `{}` to monitor all events.
     * @return builder
     */
    inline def all(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterAllArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationArgs.Builder)
    /**
     * @param s3 Configuration block for S3 log delivery. See S3 Configuration below.
     * @return builder
     */
    inline def s3(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationS3Args.Builder]):
        com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.SessionLoggerState.Builder)
    /**
     * @param eventFilter Event filter that determines which events are logged. See Event Filter below.
     * @return builder
     */
    inline def eventFilter(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.SessionLoggerState.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.SessionLoggerEventFilterArgs.builder
      builder.eventFilter(args(argsBuilder).build)

    /**
     * @param logConfiguration Configuration block for specifying where logs are delivered. See Log Configuration below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def logConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.SessionLoggerState.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.SessionLoggerLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.TrustStoreState.Builder)
    /**
     * @param certificates Set of certificates to include in the trust store. See Certificate below.
     * @return builder
     */
    inline def certificates(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.TrustStoreCertificateArgs.Builder]*):
        com.pulumi.aws.workspacesweb.inputs.TrustStoreState.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.TrustStoreCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.Builder)
    /**
     * @param allowlists List of cookie specifications that are allowed to be synchronized to the remote browser.
     * @return builder
     */
    inline def allowlists(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationAllowlistArgs.Builder]*):
        com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationAllowlistArgs.builder
      builder.allowlists(args.map(_(argsBuilder).build)*)

    /**
     * @param blocklists List of cookie specifications that are blocked from being synchronized to the remote browser.
     * @return builder
     */
    inline def blocklists(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationBlocklistArgs.Builder]*):
        com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationBlocklistArgs.builder
      builder.blocklists(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workspacesweb.inputs.UserSettingsState.Builder)
    /**
     * @param cookieSynchronizationConfiguration Configuration that specifies which cookies should be synchronized from the end user&#39;s local browser to the remote browser. Detailed below.
     * @return builder
     */
    inline def cookieSynchronizationConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.UserSettingsState.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.UserSettingsCookieSynchronizationConfigurationArgs.builder
      builder.cookieSynchronizationConfiguration(args(argsBuilder).build)

    /**
     * @param toolbarConfiguration Configuration of the toolbar. Detailed below.
     * @return builder
     */
    inline def toolbarConfiguration(args: Endofunction[com.pulumi.aws.workspacesweb.inputs.UserSettingsToolbarConfigurationArgs.Builder]):
        com.pulumi.aws.workspacesweb.inputs.UserSettingsState.Builder =
      val argsBuilder = com.pulumi.aws.workspacesweb.inputs.UserSettingsToolbarConfigurationArgs.builder
      builder.toolbarConfiguration(args(argsBuilder).build)
