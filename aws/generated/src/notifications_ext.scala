package jp.ukiba.ko_pulumi
package aws

object notifications_ext:
  extension (builder: com.pulumi.aws.notifications.NotificationHubArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.notifications.inputs.NotificationHubTimeoutsArgs.Builder]):
        com.pulumi.aws.notifications.NotificationHubArgs.Builder =
      val argsBuilder = com.pulumi.aws.notifications.inputs.NotificationHubTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.notifications.OrganizationsAccessArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.notifications.inputs.OrganizationsAccessTimeoutsArgs.Builder]):
        com.pulumi.aws.notifications.OrganizationsAccessArgs.Builder =
      val argsBuilder = com.pulumi.aws.notifications.inputs.OrganizationsAccessTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.notifications.inputs.NotificationHubState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.notifications.inputs.NotificationHubTimeoutsArgs.Builder]):
        com.pulumi.aws.notifications.inputs.NotificationHubState.Builder =
      val argsBuilder = com.pulumi.aws.notifications.inputs.NotificationHubTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.notifications.inputs.OrganizationsAccessState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.notifications.inputs.OrganizationsAccessTimeoutsArgs.Builder]):
        com.pulumi.aws.notifications.inputs.OrganizationsAccessState.Builder =
      val argsBuilder = com.pulumi.aws.notifications.inputs.OrganizationsAccessTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
