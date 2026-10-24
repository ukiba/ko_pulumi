package jp.ukiba.ko_pulumi
package aws

object chime_ext:
  extension (builder: com.pulumi.aws.chime.SdkvoiceGlobalSettingsArgs.Builder)
    /**
     * @param voiceConnector The Voice Connector settings. See voice_connector.
     * @return builder
     */
    def voiceConnector(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceGlobalSettingsVoiceConnectorArgs.Builder]):
        com.pulumi.aws.chime.SdkvoiceGlobalSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceGlobalSettingsVoiceConnectorArgs.builder
      builder.voiceConnector(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chime.SdkvoiceSipMediaApplicationArgs.Builder)
    /**
     * @param endpoints List of endpoints (Lambda ARNs) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationEndpointsArgs.Builder]):
        com.pulumi.aws.chime.SdkvoiceSipMediaApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationEndpointsArgs.builder
      builder.endpoints(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chime.SdkvoiceSipRuleArgs.Builder)
    /**
     * @param targetApplications List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used. See `targetApplications`.
     * @return builder
     */
    def targetApplications(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceSipRuleTargetApplicationArgs.Builder]*):
        com.pulumi.aws.chime.SdkvoiceSipRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceSipRuleTargetApplicationArgs.builder
      builder.targetApplications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.chime.SdkvoiceVoiceProfileDomainArgs.Builder)
    /**
     * @param serverSideEncryptionConfiguration Configuration for server side encryption.
     * @return builder
     */
    def serverSideEncryptionConfiguration(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.chime.SdkvoiceVoiceProfileDomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chime.VoiceConnectorGroupArgs.Builder)
    /**
     * @param connectors The Amazon Chime Voice Connectors to route inbound calls to.
     * @return builder
     */
    def connectors(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorGroupConnectorArgs.Builder]*):
        com.pulumi.aws.chime.VoiceConnectorGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorGroupConnectorArgs.builder
      builder.connectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.chime.VoiceConnectorOriginationArgs.Builder)
    /**
     * @param routes Set of call distribution properties defined for your SIP hosts. See route below for more details. Minimum of 1. Maximum of 20.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorOriginationRouteArgs.Builder]*):
        com.pulumi.aws.chime.VoiceConnectorOriginationArgs.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorOriginationRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.chime.VoiceConnectorStreamingArgs.Builder)
    /**
     * @param mediaInsightsConfiguration The media insights configuration. See `mediaInsightsConfiguration`.
     * @return builder
     */
    def mediaInsightsConfiguration(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorStreamingMediaInsightsConfigurationArgs.Builder]):
        com.pulumi.aws.chime.VoiceConnectorStreamingArgs.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorStreamingMediaInsightsConfigurationArgs.builder
      builder.mediaInsightsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chime.VoiceConnectorTerminationCredentialsArgs.Builder)
    /**
     * @param credentials List of termination SIP credentials.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsCredentialArgs.Builder]*):
        com.pulumi.aws.chime.VoiceConnectorTerminationCredentialsArgs.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsCredentialArgs.builder
      builder.credentials(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.chime.inputs.SdkvoiceGlobalSettingsState.Builder)
    /**
     * @param voiceConnector The Voice Connector settings. See voice_connector.
     * @return builder
     */
    def voiceConnector(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceGlobalSettingsVoiceConnectorArgs.Builder]):
        com.pulumi.aws.chime.inputs.SdkvoiceGlobalSettingsState.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceGlobalSettingsVoiceConnectorArgs.builder
      builder.voiceConnector(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationState.Builder)
    /**
     * @param endpoints List of endpoints (Lambda ARNs) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationEndpointsArgs.Builder]):
        com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationEndpointsArgs.builder
      builder.endpoints(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chime.inputs.SdkvoiceSipRuleState.Builder)
    /**
     * @param targetApplications List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used. See `targetApplications`.
     * @return builder
     */
    def targetApplications(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceSipRuleTargetApplicationArgs.Builder]*):
        com.pulumi.aws.chime.inputs.SdkvoiceSipRuleState.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceSipRuleTargetApplicationArgs.builder
      builder.targetApplications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.chime.inputs.SdkvoiceVoiceProfileDomainState.Builder)
    /**
     * @param serverSideEncryptionConfiguration Configuration for server side encryption.
     * @return builder
     */
    def serverSideEncryptionConfiguration(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.chime.inputs.SdkvoiceVoiceProfileDomainState.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chime.inputs.VoiceConnectorGroupState.Builder)
    /**
     * @param connectors The Amazon Chime Voice Connectors to route inbound calls to.
     * @return builder
     */
    def connectors(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorGroupConnectorArgs.Builder]*):
        com.pulumi.aws.chime.inputs.VoiceConnectorGroupState.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorGroupConnectorArgs.builder
      builder.connectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.chime.inputs.VoiceConnectorOriginationState.Builder)
    /**
     * @param routes Set of call distribution properties defined for your SIP hosts. See route below for more details. Minimum of 1. Maximum of 20.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorOriginationRouteArgs.Builder]*):
        com.pulumi.aws.chime.inputs.VoiceConnectorOriginationState.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorOriginationRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.chime.inputs.VoiceConnectorStreamingState.Builder)
    /**
     * @param mediaInsightsConfiguration The media insights configuration. See `mediaInsightsConfiguration`.
     * @return builder
     */
    def mediaInsightsConfiguration(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorStreamingMediaInsightsConfigurationArgs.Builder]):
        com.pulumi.aws.chime.inputs.VoiceConnectorStreamingState.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorStreamingMediaInsightsConfigurationArgs.builder
      builder.mediaInsightsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsState.Builder)
    /**
     * @param credentials List of termination SIP credentials.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsCredentialArgs.Builder]*):
        com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsState.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsCredentialArgs.builder
      builder.credentials(args.map(_(argsBuilder).build)*)
