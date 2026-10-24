package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object chatbot:
  object ChatbotFunctions:
    /** Data source for managing an AWS Chatbot Slack Workspace. */
    inline def getSlackWorkspace(args: Endofunction[com.pulumi.aws.chatbot.inputs.GetSlackWorkspaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.chatbot.outputs.GetSlackWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.GetSlackWorkspaceArgs.builder
      com.pulumi.aws.chatbot.ChatbotFunctions.getSlackWorkspace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Chatbot Slack Workspace. */
    inline def getSlackWorkspacePlain(args: Endofunction[com.pulumi.aws.chatbot.inputs.GetSlackWorkspacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.chatbot.outputs.GetSlackWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.GetSlackWorkspacePlainArgs.builder
      com.pulumi.aws.chatbot.ChatbotFunctions.getSlackWorkspacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Resource for managing an AWS Chatbot Slack Channel Configuration. */
  inline def SlackChannelConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chatbot.SlackChannelConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chatbot.SlackChannelConfigurationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.chatbot.SlackChannelConfiguration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS Chatbot Microsoft Teams Channel Configuration.
   * 
   * &gt; **NOTE:** We provide this resource on a best-effort basis. If you are able to test it and find it useful, we welcome your input at GitHub.
   */
  inline def TeamsChannelConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chatbot.TeamsChannelConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chatbot.TeamsChannelConfigurationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.chatbot.TeamsChannelConfiguration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
