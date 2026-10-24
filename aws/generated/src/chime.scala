package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object chime:
  /** Resource for managing Amazon Chime SDK Voice Global Settings. */
  def SdkvoiceGlobalSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.chime.SdkvoiceGlobalSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.chime.SdkvoiceGlobalSettingsArgs.builder
    com.pulumi.aws.chime.SdkvoiceGlobalSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A ChimeSDKVoice SIP Media Application is a managed object that passes values from a SIP rule to a target AWS Lambda function. */
  def SdkvoiceSipMediaApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.chime.SdkvoiceSipMediaApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chime.SdkvoiceSipMediaApplicationArgs.builder
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
    com.pulumi.aws.chime.SdkvoiceSipMediaApplication(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A SIP rule associates your SIP media application with a phone number or a Request URI hostname. You can associate a SIP rule with more than one SIP media application. Each application then runs only that rule. */
  def SdkvoiceSipRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.chime.SdkvoiceSipRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chime.SdkvoiceSipRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.chime.SdkvoiceSipRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Chime SDK Voice Profile Domain. */
  def SdkvoiceVoiceProfileDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.chime.SdkvoiceVoiceProfileDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chime.SdkvoiceVoiceProfileDomainArgs.builder
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
    com.pulumi.aws.chime.SdkvoiceVoiceProfileDomain(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Enables you to connect your phone system to the telephone network at a substantial cost savings by using SIP trunking. */
  def VoiceConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chime.VoiceConnectorArgs.builder
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
    com.pulumi.aws.chime.VoiceConnector(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Creates an Amazon Chime Voice Connector group under the administrator&#39;s AWS account. You can associate Amazon Chime Voice Connectors with the Amazon Chime Voice Connector group by including VoiceConnectorItems in the request.
   * 
   * You can include Amazon Chime Voice Connectors from different AWS Regions in your group. This creates a fault tolerant mechanism for fallback in case of availability events.
   */
  def VoiceConnectorGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chime.VoiceConnectorGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.chime.VoiceConnectorGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Adds a logging configuration for the specified Amazon Chime Voice Connector. The logging configuration specifies whether SIP message logs are enabled for sending to Amazon CloudWatch Logs. */
  def VoiceConnectorLogging(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorLoggingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.chime.VoiceConnectorLoggingArgs.builder
    com.pulumi.aws.chime.VoiceConnectorLogging(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Enable origination settings to control inbound calling to your SIP infrastructure. */
  def VoiceConnectorOrigination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorOriginationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.chime.VoiceConnectorOriginationArgs.builder
    com.pulumi.aws.chime.VoiceConnectorOrigination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Adds a streaming configuration for the specified Amazon Chime Voice Connector. The streaming configuration specifies whether media streaming is enabled for sending to Amazon Kinesis.
   * It also sets the retention period, in hours, for the Amazon Kinesis data.
   */
  def VoiceConnectorStreaming(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorStreamingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.chime.VoiceConnectorStreamingArgs.builder
    com.pulumi.aws.chime.VoiceConnectorStreaming(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Enable Termination settings to control outbound calling from your SIP infrastructure. */
  def VoiceConnectorTermination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorTerminationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.chime.VoiceConnectorTerminationArgs.builder
    com.pulumi.aws.chime.VoiceConnectorTermination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Adds termination SIP credentials for the specified Amazon Chime Voice Connector.
   * 
   * &gt; **Note:** Voice Connector Termination Credentials requires a Voice Connector Termination to be present. Use of `dependsOn` (as shown below) is recommended to avoid race conditions.
   */
  def VoiceConnectorTerminationCredentials(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.chime.VoiceConnectorTerminationCredentialsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.chime.VoiceConnectorTerminationCredentialsArgs.builder
    com.pulumi.aws.chime.VoiceConnectorTerminationCredentials(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
