package jp.ukiba.ko_pulumi
package aws

object chatbot_ext:
  extension (builder: com.pulumi.aws.chatbot.SlackChannelConfigurationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.chatbot.inputs.SlackChannelConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.chatbot.SlackChannelConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.SlackChannelConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chatbot.TeamsChannelConfigurationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.chatbot.inputs.TeamsChannelConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.chatbot.TeamsChannelConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.chatbot.inputs.TeamsChannelConfigurationTimeoutsArgs.builder
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
