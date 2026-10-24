package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object securitylake:
  /**
   * Resource for managing an Amazon Security Lake AWS Log Source.
   * 
   * &gt; **NOTE:** A single `aws.securitylake.AwsLogSource` should be used to configure a log source across all regions and accounts.
   * 
   * &gt; **NOTE:** The underlying `aws.securitylake.DataLake` must be configured before creating the `aws.securitylake.AwsLogSource`. Use a `dependsOn` statement.
   */
  def AwsLogSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securitylake.AwsLogSourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securitylake.AwsLogSourceArgs.builder
    com.pulumi.aws.securitylake.AwsLogSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an AWS Security Lake Custom Log Source.
   * 
   * &gt; **NOTE:** The underlying `aws.securitylake.DataLake` must be configured before creating the `aws.securitylake.CustomLogSource`. Use a `dependsOn` statement.
   */
  def CustomLogSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securitylake.CustomLogSourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securitylake.CustomLogSourceArgs.builder
    com.pulumi.aws.securitylake.CustomLogSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an AWS Security Lake Data Lake.
   * 
   * &gt; **NOTE:** The underlying `aws.securitylake.DataLake` must be configured before creating other Security Lake resources. Use a `dependsOn` statement.
   */
  def DataLake(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securitylake.DataLakeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securitylake.DataLakeArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.securitylake.DataLake(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an AWS Security Lake Subscriber.
   * 
   * &gt; **NOTE:** The underlying `aws.securitylake.DataLake` must be configured before creating the `aws.securitylake.Subscriber`. Use a `dependsOn` statement.
   */
  def Subscriber(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securitylake.SubscriberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securitylake.SubscriberArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.securitylake.Subscriber(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Security Lake Subscriber Notification. */
  def SubscriberNotification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securitylake.SubscriberNotificationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securitylake.SubscriberNotificationArgs.builder
    com.pulumi.aws.securitylake.SubscriberNotification(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
