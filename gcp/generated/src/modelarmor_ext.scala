package jp.ukiba.ko_pulumi
package gcp

object modelarmor_ext:
  extension (builder: com.pulumi.gcp.modelarmor.FloorsettingArgs.Builder)
    /**
     * @param aiPlatformFloorSetting AI Platform floor setting.
     * Structure is documented below.
     * @return builder
     */
    def aiPlatformFloorSetting(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingAiPlatformFloorSettingArgs.Builder]):
        com.pulumi.gcp.modelarmor.FloorsettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingAiPlatformFloorSettingArgs.builder
      builder.aiPlatformFloorSetting(args(argsBuilder).build)

    /**
     * @param filterConfig Filters configuration.
     * Structure is documented below.
     * @return builder
     */
    def filterConfig(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigArgs.Builder]):
        com.pulumi.gcp.modelarmor.FloorsettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigArgs.builder
      builder.filterConfig(args(argsBuilder).build)

    /**
     * @param floorSettingMetadata Metadata to enable multi language detection via floor setting.
     * Structure is documented below.
     * @return builder
     */
    def floorSettingMetadata(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingFloorSettingMetadataArgs.Builder]):
        com.pulumi.gcp.modelarmor.FloorsettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingFloorSettingMetadataArgs.builder
      builder.floorSettingMetadata(args(argsBuilder).build)

    /**
     * @param googleMcpServerFloorSetting Google MCP Server floor setting.
     * Structure is documented below.
     * @return builder
     */
    def googleMcpServerFloorSetting(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingGoogleMcpServerFloorSettingArgs.Builder]):
        com.pulumi.gcp.modelarmor.FloorsettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingGoogleMcpServerFloorSettingArgs.builder
      builder.googleMcpServerFloorSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.modelarmor.TemplateArgs.Builder)
    /**
     * @param filterConfig Filters configuration.
     * Structure is documented below.
     * @return builder
     */
    def filterConfig(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigArgs.Builder]):
        com.pulumi.gcp.modelarmor.TemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigArgs.builder
      builder.filterConfig(args(argsBuilder).build)

    /**
     * @param templateMetadata Message describing TemplateMetadata
     * Structure is documented below.
     * @return builder
     */
    def templateMetadata(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.TemplateTemplateMetadataArgs.Builder]):
        com.pulumi.gcp.modelarmor.TemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.TemplateTemplateMetadataArgs.builder
      builder.templateMetadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigArgs.Builder)
    /**
     * @param maliciousUriFilterSettings Malicious URI filter settings.
     * Structure is documented below.
     * @return builder
     */
    def maliciousUriFilterSettings(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigMaliciousUriFilterSettingsArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigMaliciousUriFilterSettingsArgs.builder
      builder.maliciousUriFilterSettings(args(argsBuilder).build)

    /**
     * @param piAndJailbreakFilterSettings Prompt injection and Jailbreak Filter settings.
     * Structure is documented below.
     * @return builder
     */
    def piAndJailbreakFilterSettings(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigPiAndJailbreakFilterSettingsArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigPiAndJailbreakFilterSettingsArgs.builder
      builder.piAndJailbreakFilterSettings(args(argsBuilder).build)

    /**
     * @param raiSettings Responsible AI Filter settings.
     * Structure is documented below.
     * @return builder
     */
    def raiSettings(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigRaiSettingsArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigRaiSettingsArgs.builder
      builder.raiSettings(args(argsBuilder).build)

    /**
     * @param sdpSettings Sensitive Data Protection settings.
     * Structure is documented below.
     * @return builder
     */
    def sdpSettings(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigSdpSettingsArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigSdpSettingsArgs.builder
      builder.sdpSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigRaiSettingsArgs.Builder)
    /**
     * @param raiFilters List of Responsible AI filters enabled for template.
     * Structure is documented below.
     * @return builder
     */
    def raiFilters(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigRaiSettingsRaiFilterArgs.Builder]*):
        com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigRaiSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigRaiSettingsRaiFilterArgs.builder
      builder.raiFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigSdpSettingsArgs.Builder)
    /**
     * @param advancedConfig Sensitive Data Protection Advanced configuration.
     * Structure is documented below.
     * @return builder
     */
    def advancedConfig(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigSdpSettingsAdvancedConfigArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigSdpSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigSdpSettingsAdvancedConfigArgs.builder
      builder.advancedConfig(args(argsBuilder).build)

    /**
     * @param basicConfig Sensitive Data Protection basic configuration.
     * Structure is documented below.
     * @return builder
     */
    def basicConfig(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigSdpSettingsBasicConfigArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigSdpSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigSdpSettingsBasicConfigArgs.builder
      builder.basicConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.modelarmor.inputs.FloorsettingFloorSettingMetadataArgs.Builder)
    /**
     * @param multiLanguageDetection Metadata for multi language detection.
     * Structure is documented below.
     * @return builder
     */
    def multiLanguageDetection(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingFloorSettingMetadataMultiLanguageDetectionArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.FloorsettingFloorSettingMetadataArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingFloorSettingMetadataMultiLanguageDetectionArgs.builder
      builder.multiLanguageDetection(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.modelarmor.inputs.FloorsettingState.Builder)
    /**
     * @param aiPlatformFloorSetting AI Platform floor setting.
     * Structure is documented below.
     * @return builder
     */
    def aiPlatformFloorSetting(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingAiPlatformFloorSettingArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.FloorsettingState.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingAiPlatformFloorSettingArgs.builder
      builder.aiPlatformFloorSetting(args(argsBuilder).build)

    /**
     * @param filterConfig Filters configuration.
     * Structure is documented below.
     * @return builder
     */
    def filterConfig(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.FloorsettingState.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingFilterConfigArgs.builder
      builder.filterConfig(args(argsBuilder).build)

    /**
     * @param floorSettingMetadata Metadata to enable multi language detection via floor setting.
     * Structure is documented below.
     * @return builder
     */
    def floorSettingMetadata(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingFloorSettingMetadataArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.FloorsettingState.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingFloorSettingMetadataArgs.builder
      builder.floorSettingMetadata(args(argsBuilder).build)

    /**
     * @param googleMcpServerFloorSetting Google MCP Server floor setting.
     * Structure is documented below.
     * @return builder
     */
    def googleMcpServerFloorSetting(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.FloorsettingGoogleMcpServerFloorSettingArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.FloorsettingState.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.FloorsettingGoogleMcpServerFloorSettingArgs.builder
      builder.googleMcpServerFloorSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigArgs.Builder)
    /**
     * @param maliciousUriFilterSettings Malicious URI filter settings.
     * Structure is documented below.
     * @return builder
     */
    def maliciousUriFilterSettings(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigMaliciousUriFilterSettingsArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigMaliciousUriFilterSettingsArgs.builder
      builder.maliciousUriFilterSettings(args(argsBuilder).build)

    /**
     * @param piAndJailbreakFilterSettings Prompt injection and Jailbreak Filter settings.
     * Structure is documented below.
     * @return builder
     */
    def piAndJailbreakFilterSettings(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigPiAndJailbreakFilterSettingsArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigPiAndJailbreakFilterSettingsArgs.builder
      builder.piAndJailbreakFilterSettings(args(argsBuilder).build)

    /**
     * @param raiSettings Responsible AI Filter settings.
     * Structure is documented below.
     * @return builder
     */
    def raiSettings(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigRaiSettingsArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigRaiSettingsArgs.builder
      builder.raiSettings(args(argsBuilder).build)

    /**
     * @param sdpSettings Sensitive Data Protection settings.
     * Structure is documented below.
     * @return builder
     */
    def sdpSettings(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigSdpSettingsArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigSdpSettingsArgs.builder
      builder.sdpSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigRaiSettingsArgs.Builder)
    /**
     * @param raiFilters List of Responsible AI filters enabled for template.
     * Structure is documented below.
     * @return builder
     */
    def raiFilters(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigRaiSettingsRaiFilterArgs.Builder]*):
        com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigRaiSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigRaiSettingsRaiFilterArgs.builder
      builder.raiFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigSdpSettingsArgs.Builder)
    /**
     * @param advancedConfig Sensitive Data Protection Advanced configuration.
     * Structure is documented below.
     * @return builder
     */
    def advancedConfig(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigSdpSettingsAdvancedConfigArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigSdpSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigSdpSettingsAdvancedConfigArgs.builder
      builder.advancedConfig(args(argsBuilder).build)

    /**
     * @param basicConfig Sensitive Data Protection basic configuration.
     * Structure is documented below.
     * @return builder
     */
    def basicConfig(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigSdpSettingsBasicConfigArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigSdpSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigSdpSettingsBasicConfigArgs.builder
      builder.basicConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.modelarmor.inputs.TemplateState.Builder)
    /**
     * @param filterConfig Filters configuration.
     * Structure is documented below.
     * @return builder
     */
    def filterConfig(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.TemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigArgs.builder
      builder.filterConfig(args(argsBuilder).build)

    /**
     * @param templateMetadata Message describing TemplateMetadata
     * Structure is documented below.
     * @return builder
     */
    def templateMetadata(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.TemplateTemplateMetadataArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.TemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.TemplateTemplateMetadataArgs.builder
      builder.templateMetadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.modelarmor.inputs.TemplateTemplateMetadataArgs.Builder)
    /**
     * @param filterVersionSelector Selects the filter version to use for this template. Set exactly one of
     * &#39;alias&#39; or &#39;version&#39;.
     * Structure is documented below.
     * @return builder
     */
    def filterVersionSelector(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.TemplateTemplateMetadataFilterVersionSelectorArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.TemplateTemplateMetadataArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.TemplateTemplateMetadataFilterVersionSelectorArgs.builder
      builder.filterVersionSelector(args(argsBuilder).build)

    /**
     * @param multiLanguageDetection Metadata to enable multi language detection via template.
     * Structure is documented below.
     * @return builder
     */
    def multiLanguageDetection(args: Endofunction[com.pulumi.gcp.modelarmor.inputs.TemplateTemplateMetadataMultiLanguageDetectionArgs.Builder]):
        com.pulumi.gcp.modelarmor.inputs.TemplateTemplateMetadataArgs.Builder =
      val argsBuilder = com.pulumi.gcp.modelarmor.inputs.TemplateTemplateMetadataMultiLanguageDetectionArgs.builder
      builder.multiLanguageDetection(args(argsBuilder).build)
