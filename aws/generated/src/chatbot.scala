package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object chatbot:
  /** Resource for managing an AWS Chatbot Slack Channel Configuration. */
  def SlackChannelConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.chatbot.TeamsChannelConfigurationArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  object ChatbotFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS Chatbot Slack Workspace. */
    inline def getSlackWorkspace(args: Endofunction[com.pulumi.aws.chatbot.inputs.GetSlackWorkspaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.chatbot.outputs.GetSlackWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.GetSlackWorkspaceArgs.builder
      com.pulumi.aws.chatbot.ChatbotFunctions.getSlackWorkspace(args(argsBuilder).build)

    /** Data source for managing an AWS Chatbot Slack Workspace. */
    inline def getSlackWorkspacePlain(args: Endofunction[com.pulumi.aws.chatbot.inputs.GetSlackWorkspacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.chatbot.outputs.GetSlackWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.GetSlackWorkspacePlainArgs.builder
      com.pulumi.aws.chatbot.ChatbotFunctions.getSlackWorkspacePlain(args(argsBuilder).build)

  /**
   * Resource for managing an AWS Chatbot Microsoft Teams Channel Configuration.
   * 
   *  &gt; **NOTE:** We provide this resource on a best-effort basis. If you are able to test it and find it useful, we welcome your input at GitHub.
   */
  def TeamsChannelConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.chatbot.SlackChannelConfigurationArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.aws.chatbot.inputs.SlackChannelConfigurationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.chatbot.inputs.SlackChannelConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.chatbot.inputs.SlackChannelConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.SlackChannelConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.chatbot.inputs.SlackChannelConfigurationState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.aws.chatbot.inputs.TeamsChannelConfigurationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.chatbot.inputs.TeamsChannelConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.chatbot.inputs.TeamsChannelConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.TeamsChannelConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.chatbot.inputs.TeamsChannelConfigurationState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
