package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object securitylake:
  /**
   * Resource for managing an AWS Security Lake Custom Log Source.
   *  
   *  &gt; **NOTE:** The underlying `aws.securitylake.DataLake` must be configured before creating the `aws.securitylake.CustomLogSource`. Use a `dependsOn` statement.
   */
  def CustomLogSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securitylake.CustomLogSourceArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securitylake.CustomLogSourceArgs.builder
    
    com.pulumi.aws.securitylake.CustomLogSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS Security Lake Subscriber.
   *  
   *  &gt; **NOTE:** The underlying `aws.securitylake.DataLake` must be configured before creating the `aws.securitylake.Subscriber`. Use a `dependsOn` statement.
   */
  def Subscriber(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securitylake.SubscriberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securitylake.SubscriberArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.securitylake.Subscriber(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Security Lake Subscriber Notification. */
  def SubscriberNotification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securitylake.SubscriberNotificationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securitylake.SubscriberNotificationArgs.builder
    
    com.pulumi.aws.securitylake.SubscriberNotification(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.securitylake.AwsLogSourceArgs.Builder)
    /**
     * @param source Specify the natively-supported AWS service to add as a source in Security Lake.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.securitylake.inputs.AwsLogSourceSourceArgs.Builder]):
        com.pulumi.aws.securitylake.AwsLogSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.AwsLogSourceSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securitylake.DataLakeArgs.Builder)
    /**
     * @param configuration Specify the Region or Regions that will contribute data to the rollup region.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.securitylake.inputs.DataLakeConfigurationArgs.Builder]):
        com.pulumi.aws.securitylake.DataLakeArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.DataLakeConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.securitylake.inputs.DataLakeTimeoutsArgs.Builder]):
        com.pulumi.aws.securitylake.DataLakeArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.DataLakeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Resource for managing an AWS Security Lake Data Lake.
   *  
   *  &gt; **NOTE:** The underlying `aws.securitylake.DataLake` must be configured before creating other Security Lake resources. Use a `dependsOn` statement.
   */
  def DataLake(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securitylake.DataLakeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securitylake.DataLakeArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.securitylake.DataLake(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.securitylake.SubscriberArgs.Builder)
    /**
     * @param sources The supported AWS services from which logs and events are collected. Security Lake supports log and event collection for natively supported AWS services. See `source` Blocks below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberSourceArgs.Builder]*):
        com.pulumi.aws.securitylake.SubscriberArgs.Builder =
      def argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    /**
     * @param subscriberIdentity The AWS identity used to access your data. See `subscriberIdentity` Block below.
     * @return builder
     */
    def subscriberIdentity(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberSubscriberIdentityArgs.Builder]):
        com.pulumi.aws.securitylake.SubscriberArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberSubscriberIdentityArgs.builder
      builder.subscriberIdentity(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberTimeoutsArgs.Builder]):
        com.pulumi.aws.securitylake.SubscriberArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securitylake.CustomLogSourceArgs.Builder)
    /**
     * @param configuration The configuration for the third-party custom source.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.securitylake.inputs.CustomLogSourceConfigurationArgs.Builder]):
        com.pulumi.aws.securitylake.CustomLogSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.CustomLogSourceConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securitylake.SubscriberNotificationArgs.Builder)
    /**
     * @param configuration Specify the configuration using which you want to create the subscriber notification..
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberNotificationConfigurationArgs.Builder]):
        com.pulumi.aws.securitylake.SubscriberNotificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberNotificationConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  /**
   * Resource for managing an Amazon Security Lake AWS Log Source.
   *  
   *  &gt; **NOTE:** A single `aws.securitylake.AwsLogSource` should be used to configure a log source across all regions and accounts.
   *  
   *  &gt; **NOTE:** The underlying `aws.securitylake.DataLake` must be configured before creating the `aws.securitylake.AwsLogSource`. Use a `dependsOn` statement.
   */
  def AwsLogSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securitylake.AwsLogSourceArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securitylake.AwsLogSourceArgs.builder
    
    com.pulumi.aws.securitylake.AwsLogSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.securitylake.inputs.SubscriberSourceCustomLogSourceResourceArgs.Builder)
    /**
     * @param attributes The attributes of the third-party custom source. See `attributes` Block below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberSourceCustomLogSourceResourceAttributeArgs.Builder]*):
        com.pulumi.aws.securitylake.inputs.SubscriberSourceCustomLogSourceResourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberSourceCustomLogSourceResourceAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param providers The details of the log provider for the third-party custom source. See `provider` Block below.
     * @return builder
     */
    def providers(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberSourceCustomLogSourceResourceProviderArgs.Builder]*):
        com.pulumi.aws.securitylake.inputs.SubscriberSourceCustomLogSourceResourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberSourceCustomLogSourceResourceProviderArgs.builder
      builder.providers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.securitylake.inputs.SubscriberState.Builder)
    /**
     * @param sources The supported AWS services from which logs and events are collected. Security Lake supports log and event collection for natively supported AWS services. See `source` Blocks below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberSourceArgs.Builder]*):
        com.pulumi.aws.securitylake.inputs.SubscriberState.Builder =
      def argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    /**
     * @param subscriberIdentity The AWS identity used to access your data. See `subscriberIdentity` Block below.
     * @return builder
     */
    def subscriberIdentity(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberSubscriberIdentityArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.SubscriberState.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberSubscriberIdentityArgs.builder
      builder.subscriberIdentity(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberTimeoutsArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.SubscriberState.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securitylake.inputs.DataLakeConfigurationArgs.Builder)
    /**
     * @param encryptionConfigurations Provides encryption details of Amazon Security Lake object.
     * @return builder
     */
    def encryptionConfigurations(args: Endofunction[com.pulumi.aws.securitylake.inputs.DataLakeConfigurationEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.securitylake.inputs.DataLakeConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.securitylake.inputs.DataLakeConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycleConfiguration Provides lifecycle details of Amazon Security Lake object.
     * @return builder
     */
    def lifecycleConfiguration(args: Endofunction[com.pulumi.aws.securitylake.inputs.DataLakeConfigurationLifecycleConfigurationArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.DataLakeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.DataLakeConfigurationLifecycleConfigurationArgs.builder
      builder.lifecycleConfiguration(args(argsBuilder).build)

    /**
     * @param replicationConfiguration Provides replication details of Amazon Security Lake object.
     * @return builder
     */
    def replicationConfiguration(args: Endofunction[com.pulumi.aws.securitylake.inputs.DataLakeConfigurationReplicationConfigurationArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.DataLakeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.DataLakeConfigurationReplicationConfigurationArgs.builder
      builder.replicationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securitylake.inputs.CustomLogSourceConfigurationArgs.Builder)
    /**
     * @param crawlerConfiguration The configuration for the Glue Crawler for the third-party custom source.
     * @return builder
     */
    def crawlerConfiguration(args: Endofunction[com.pulumi.aws.securitylake.inputs.CustomLogSourceConfigurationCrawlerConfigurationArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.CustomLogSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.CustomLogSourceConfigurationCrawlerConfigurationArgs.builder
      builder.crawlerConfiguration(args(argsBuilder).build)

    /**
     * @param providerIdentity The identity of the log provider for the third-party custom source.
     * @return builder
     */
    def providerIdentity(args: Endofunction[com.pulumi.aws.securitylake.inputs.CustomLogSourceConfigurationProviderIdentityArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.CustomLogSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.CustomLogSourceConfigurationProviderIdentityArgs.builder
      builder.providerIdentity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securitylake.inputs.DataLakeConfigurationLifecycleConfigurationArgs.Builder)
    /**
     * @param expiration Provides data expiration details of Amazon Security Lake object.
     * @return builder
     */
    def expiration(args: Endofunction[com.pulumi.aws.securitylake.inputs.DataLakeConfigurationLifecycleConfigurationExpirationArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.DataLakeConfigurationLifecycleConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.DataLakeConfigurationLifecycleConfigurationExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

    /**
     * @param transitions Provides data storage transition details of Amazon Security Lake object.
     * @return builder
     */
    def transitions(args: Endofunction[com.pulumi.aws.securitylake.inputs.DataLakeConfigurationLifecycleConfigurationTransitionArgs.Builder]*):
        com.pulumi.aws.securitylake.inputs.DataLakeConfigurationLifecycleConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.securitylake.inputs.DataLakeConfigurationLifecycleConfigurationTransitionArgs.builder
      builder.transitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.securitylake.inputs.SubscriberNotificationConfigurationArgs.Builder)
    /**
     * @param httpsNotificationConfiguration The configurations for HTTPS subscriber notification.
     * @return builder
     */
    def httpsNotificationConfiguration(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberNotificationConfigurationHttpsNotificationConfigurationArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.SubscriberNotificationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberNotificationConfigurationHttpsNotificationConfigurationArgs.builder
      builder.httpsNotificationConfiguration(args(argsBuilder).build)

    /**
     * @param sqsNotificationConfiguration The configurations for SQS subscriber notification.
     *  There are no parameters within `sqsNotificationConfiguration`.
     * @return builder
     */
    def sqsNotificationConfiguration(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberNotificationConfigurationSqsNotificationConfigurationArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.SubscriberNotificationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberNotificationConfigurationSqsNotificationConfigurationArgs.builder
      builder.sqsNotificationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securitylake.inputs.DataLakeState.Builder)
    /**
     * @param configuration Specify the Region or Regions that will contribute data to the rollup region.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.securitylake.inputs.DataLakeConfigurationArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.DataLakeState.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.DataLakeConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.securitylake.inputs.DataLakeTimeoutsArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.DataLakeState.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.DataLakeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securitylake.inputs.SubscriberSourceArgs.Builder)
    /**
     * @param awsLogSourceResource Amazon Security Lake supports log and event collection for natively supported AWS services. See `awsLogSourceResource` Block below.
     * @return builder
     */
    def awsLogSourceResource(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberSourceAwsLogSourceResourceArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.SubscriberSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberSourceAwsLogSourceResourceArgs.builder
      builder.awsLogSourceResource(args(argsBuilder).build)

    /**
     * @param customLogSourceResource Amazon Security Lake supports custom source types. See `customLogSourceResource` Block below.
     * @return builder
     */
    def customLogSourceResource(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberSourceCustomLogSourceResourceArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.SubscriberSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberSourceCustomLogSourceResourceArgs.builder
      builder.customLogSourceResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securitylake.inputs.AwsLogSourceState.Builder)
    /**
     * @param source Specify the natively-supported AWS service to add as a source in Security Lake.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.securitylake.inputs.AwsLogSourceSourceArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.AwsLogSourceState.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.AwsLogSourceSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securitylake.inputs.CustomLogSourceState.Builder)
    /**
     * @param attributes The attributes of a third-party custom source.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.securitylake.inputs.CustomLogSourceAttributeArgs.Builder]*):
        com.pulumi.aws.securitylake.inputs.CustomLogSourceState.Builder =
      def argsBuilder = com.pulumi.aws.securitylake.inputs.CustomLogSourceAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param configuration The configuration for the third-party custom source.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.securitylake.inputs.CustomLogSourceConfigurationArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.CustomLogSourceState.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.CustomLogSourceConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param providerDetails The details of the log provider for a third-party custom source.
     * @return builder
     */
    def providerDetails(args: Endofunction[com.pulumi.aws.securitylake.inputs.CustomLogSourceProviderDetailArgs.Builder]*):
        com.pulumi.aws.securitylake.inputs.CustomLogSourceState.Builder =
      def argsBuilder = com.pulumi.aws.securitylake.inputs.CustomLogSourceProviderDetailArgs.builder
      builder.providerDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.securitylake.inputs.SubscriberNotificationState.Builder)
    /**
     * @param configuration Specify the configuration using which you want to create the subscriber notification..
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.securitylake.inputs.SubscriberNotificationConfigurationArgs.Builder]):
        com.pulumi.aws.securitylake.inputs.SubscriberNotificationState.Builder =
      val argsBuilder = com.pulumi.aws.securitylake.inputs.SubscriberNotificationConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)
