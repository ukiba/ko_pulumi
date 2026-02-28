package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object chatbot:
  /** Resource for managing an AWS Chatbot Slack Channel Configuration. */
  def SlackChannelConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chatbot.SlackChannelConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chatbot.SlackChannelConfigurationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.chatbot.SlackChannelConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.chatbot.TeamsChannelConfigurationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.chatbot.inputs.TeamsChannelConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.chatbot.TeamsChannelConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.TeamsChannelConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  type ChatbotFunctions = com.pulumi.aws.chatbot.ChatbotFunctions
  object ChatbotFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.chatbot.ChatbotFunctions.*
  extension (self: ChatbotFunctions.type)
    /** Data source for managing an AWS Chatbot Slack Workspace. */
    def getSlackWorkspace(args: Endofunction[com.pulumi.aws.chatbot.inputs.GetSlackWorkspaceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.chatbot.outputs.GetSlackWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.GetSlackWorkspaceArgs.builder
      com.pulumi.aws.chatbot.ChatbotFunctions.getSlackWorkspace(args(argsBuilder).build)

    /** Data source for managing an AWS Chatbot Slack Workspace. */
    def getSlackWorkspacePlain(args: Endofunction[com.pulumi.aws.chatbot.inputs.GetSlackWorkspacePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.chatbot.outputs.GetSlackWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.GetSlackWorkspacePlainArgs.builder
      com.pulumi.aws.chatbot.ChatbotFunctions.getSlackWorkspacePlain(args(argsBuilder).build)

  /**
   * Resource for managing an AWS Chatbot Microsoft Teams Channel Configuration.
   *  
   *  &gt; **NOTE:** We provide this resource on a best-effort basis. If you are able to test it and find it useful, we welcome your input at GitHub.
   */
  def TeamsChannelConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chatbot.TeamsChannelConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chatbot.TeamsChannelConfigurationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.chatbot.TeamsChannelConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.chatbot.SlackChannelConfigurationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.chatbot.inputs.SlackChannelConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.chatbot.SlackChannelConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.SlackChannelConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chatbot.inputs.SlackChannelConfigurationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.chatbot.inputs.SlackChannelConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.chatbot.inputs.SlackChannelConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.SlackChannelConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chatbot.inputs.TeamsChannelConfigurationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.chatbot.inputs.TeamsChannelConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.chatbot.inputs.TeamsChannelConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.TeamsChannelConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
