package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object notifications:
  /** Resource for managing an AWS User Notifications Event Rule. */
  def EventRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.notifications.EventRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.notifications.EventRuleArgs.builder
    
    com.pulumi.aws.notifications.EventRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing AWS User Notifications Contacts Email Contact. */
  def ContactsEmailContact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.notifications.ContactsEmailContactArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.notifications.ContactsEmailContactArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.notifications.ContactsEmailContact(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS User Notifications Notification Hub. */
  def NotificationHub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.notifications.NotificationHubArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.notifications.NotificationHubArgs.builder
    
    com.pulumi.aws.notifications.NotificationHub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.notifications.NotificationHubArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.notifications.inputs.NotificationHubTimeoutsArgs.Builder]):
        com.pulumi.aws.notifications.NotificationHubArgs.Builder =
      val argsBuilder = com.pulumi.aws.notifications.inputs.NotificationHubTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS User Notifications Notification Configuration. */
  def NotificationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.notifications.NotificationConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.notifications.NotificationConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.notifications.NotificationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS User Notifications Channel Association. This resource associates a channel (such as an email contact) with a notification configuration. */
  def ChannelAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.notifications.ChannelAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.notifications.ChannelAssociationArgs.builder
    
    com.pulumi.aws.notifications.ChannelAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.notifications.inputs.NotificationHubState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.notifications.inputs.NotificationHubTimeoutsArgs.Builder]):
        com.pulumi.aws.notifications.inputs.NotificationHubState.Builder =
      val argsBuilder = com.pulumi.aws.notifications.inputs.NotificationHubTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
