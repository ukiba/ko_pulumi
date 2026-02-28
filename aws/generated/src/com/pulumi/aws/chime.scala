package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object chime:
  extension (builder: com.pulumi.aws.chime.SdkvoiceSipRuleArgs.Builder)
    /**
     * @param targetApplications List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used. See `targetApplications`.
     * @return builder
     */
    def targetApplications(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceSipRuleTargetApplicationArgs.Builder]*):
        com.pulumi.aws.chime.SdkvoiceSipRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceSipRuleTargetApplicationArgs.builder
      builder.targetApplications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.chime.SdkvoiceSipMediaApplicationArgs.Builder)
    /**
     * @param endpoints List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationEndpointsArgs.Builder]):
        com.pulumi.aws.chime.SdkvoiceSipMediaApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationEndpointsArgs.builder
      builder.endpoints(args(argsBuilder).build)

  /** A ChimeSDKVoice SIP Media Application is a managed object that passes values from a SIP rule to a target AWS Lambda function. */
  def SdkvoiceSipMediaApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chime.SdkvoiceSipMediaApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chime.SdkvoiceSipMediaApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.chime.SdkvoiceSipMediaApplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.chime.VoiceConnectorStreamingArgs.Builder)
    /**
     * @param mediaInsightsConfiguration The media insights configuration. See `mediaInsightsConfiguration`.
     * @return builder
     */
    def mediaInsightsConfiguration(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorStreamingMediaInsightsConfigurationArgs.Builder]):
        com.pulumi.aws.chime.VoiceConnectorStreamingArgs.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorStreamingMediaInsightsConfigurationArgs.builder
      builder.mediaInsightsConfiguration(args(argsBuilder).build)

  /** Enables you to connect your phone system to the telephone network at a substantial cost savings by using SIP trunking. */
  def VoiceConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chime.VoiceConnectorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.chime.VoiceConnector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.chime.VoiceConnectorGroupArgs.Builder)
    /**
     * @param connectors The Amazon Chime Voice Connectors to route inbound calls to.
     * @return builder
     */
    def connectors(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorGroupConnectorArgs.Builder]*):
        com.pulumi.aws.chime.VoiceConnectorGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorGroupConnectorArgs.builder
      builder.connectors(args.map(_(argsBuilder).build)*)

  /**
   * Adds a streaming configuration for the specified Amazon Chime Voice Connector. The streaming configuration specifies whether media streaming is enabled for sending to Amazon Kinesis.
   *  It also sets the retention period, in hours, for the Amazon Kinesis data.
   */
  def VoiceConnectorStreaming(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorStreamingArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.chime.VoiceConnectorStreamingArgs.builder
    
    com.pulumi.aws.chime.VoiceConnectorStreaming(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.chime.VoiceConnectorOriginationArgs.Builder)
    /**
     * @param routes Set of call distribution properties defined for your SIP hosts. See route below for more details. Minimum of 1. Maximum of 20.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorOriginationRouteArgs.Builder]*):
        com.pulumi.aws.chime.VoiceConnectorOriginationArgs.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorOriginationRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  /**
   * Adds termination SIP credentials for the specified Amazon Chime Voice Connector.
   *  
   *  &gt; **Note:** Voice Connector Termination Credentials requires a Voice Connector Termination to be present. Use of `dependsOn` (as shown below) is recommended to avoid race conditions.
   */
  def VoiceConnectorTerminationCredentials(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorTerminationCredentialsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.chime.VoiceConnectorTerminationCredentialsArgs.builder
    
    com.pulumi.aws.chime.VoiceConnectorTerminationCredentials(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates an Amazon Chime Voice Connector group under the administrator&#39;s AWS account. You can associate Amazon Chime Voice Connectors with the Amazon Chime Voice Connector group by including VoiceConnectorItems in the request.
   *  
   *  You can include Amazon Chime Voice Connectors from different AWS Regions in your group. This creates a fault tolerant mechanism for fallback in case of availability events.
   */
  def VoiceConnectorGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chime.VoiceConnectorGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.chime.VoiceConnectorGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing Amazon Chime SDK Voice Global Settings. */
  def SdkvoiceGlobalSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chime.SdkvoiceGlobalSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.chime.SdkvoiceGlobalSettingsArgs.builder
    
    com.pulumi.aws.chime.SdkvoiceGlobalSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Enable Termination settings to control outbound calling from your SIP infrastructure. */
  def VoiceConnectorTermination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorTerminationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.chime.VoiceConnectorTerminationArgs.builder
    
    com.pulumi.aws.chime.VoiceConnectorTermination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Chime SDK Voice Profile Domain. */
  def SdkvoiceVoiceProfileDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chime.SdkvoiceVoiceProfileDomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chime.SdkvoiceVoiceProfileDomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.chime.SdkvoiceVoiceProfileDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Adds a logging configuration for the specified Amazon Chime Voice Connector. The logging configuration specifies whether SIP message logs are enabled for sending to Amazon CloudWatch Logs. */
  def VoiceConnectorLogging(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorLoggingArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.chime.VoiceConnectorLoggingArgs.builder
    
    com.pulumi.aws.chime.VoiceConnectorLogging(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.chime.SdkvoiceGlobalSettingsArgs.Builder)
    /**
     * @param voiceConnector The Voice Connector settings. See voice_connector.
     * @return builder
     */
    def voiceConnector(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceGlobalSettingsVoiceConnectorArgs.Builder]):
        com.pulumi.aws.chime.SdkvoiceGlobalSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceGlobalSettingsVoiceConnectorArgs.builder
      builder.voiceConnector(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chime.SdkvoiceVoiceProfileDomainArgs.Builder)
    /**
     * @param serverSideEncryptionConfiguration Configuration for server side encryption.
     * @return builder
     */
    def serverSideEncryptionConfiguration(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.chime.SdkvoiceVoiceProfileDomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chime.VoiceConnectorTerminationCredentialsArgs.Builder)
    /**
     * @param credentials List of termination SIP credentials.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsCredentialArgs.Builder]*):
        com.pulumi.aws.chime.VoiceConnectorTerminationCredentialsArgs.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsCredentialArgs.builder
      builder.credentials(args.map(_(argsBuilder).build)*)

  /** A SIP rule associates your SIP media application with a phone number or a Request URI hostname. You can associate a SIP rule with more than one SIP media application. Each application then runs only that rule. */
  def SdkvoiceSipRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chime.SdkvoiceSipRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chime.SdkvoiceSipRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.chime.SdkvoiceSipRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Enable origination settings to control inbound calling to your SIP infrastructure. */
  def VoiceConnectorOrigination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorOriginationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.chime.VoiceConnectorOriginationArgs.builder
    
    com.pulumi.aws.chime.VoiceConnectorOrigination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsState.Builder)
    /**
     * @param credentials List of termination SIP credentials.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsCredentialArgs.Builder]*):
        com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsState.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsCredentialArgs.builder
      builder.credentials(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.chime.inputs.VoiceConnectorGroupState.Builder)
    /**
     * @param connectors The Amazon Chime Voice Connectors to route inbound calls to.
     * @return builder
     */
    def connectors(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorGroupConnectorArgs.Builder]*):
        com.pulumi.aws.chime.inputs.VoiceConnectorGroupState.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorGroupConnectorArgs.builder
      builder.connectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.chime.inputs.VoiceConnectorStreamingState.Builder)
    /**
     * @param mediaInsightsConfiguration The media insights configuration. See `mediaInsightsConfiguration`.
     * @return builder
     */
    def mediaInsightsConfiguration(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorStreamingMediaInsightsConfigurationArgs.Builder]):
        com.pulumi.aws.chime.inputs.VoiceConnectorStreamingState.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorStreamingMediaInsightsConfigurationArgs.builder
      builder.mediaInsightsConfiguration(args(argsBuilder).build)

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
     * @param endpoints List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationEndpointsArgs.Builder]):
        com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationEndpointsArgs.builder
      builder.endpoints(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chime.inputs.VoiceConnectorOriginationState.Builder)
    /**
     * @param routes Set of call distribution properties defined for your SIP hosts. See route below for more details. Minimum of 1. Maximum of 20.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.aws.chime.inputs.VoiceConnectorOriginationRouteArgs.Builder]*):
        com.pulumi.aws.chime.inputs.VoiceConnectorOriginationState.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.VoiceConnectorOriginationRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.chime.inputs.SdkvoiceVoiceProfileDomainState.Builder)
    /**
     * @param serverSideEncryptionConfiguration Configuration for server side encryption.
     * @return builder
     */
    def serverSideEncryptionConfiguration(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.chime.inputs.SdkvoiceVoiceProfileDomainState.Builder =
      val argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chime.inputs.SdkvoiceSipRuleState.Builder)
    /**
     * @param targetApplications List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used. See `targetApplications`.
     * @return builder
     */
    def targetApplications(args: Endofunction[com.pulumi.aws.chime.inputs.SdkvoiceSipRuleTargetApplicationArgs.Builder]*):
        com.pulumi.aws.chime.inputs.SdkvoiceSipRuleState.Builder =
      def argsBuilder = com.pulumi.aws.chime.inputs.SdkvoiceSipRuleTargetApplicationArgs.builder
      builder.targetApplications(args.map(_(argsBuilder).build)*)
