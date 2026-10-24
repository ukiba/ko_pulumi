package jp.ukiba.ko_pulumi
package aws

object connect_ext:
  extension (builder: com.pulumi.aws.connect.BotAssociationArgs.Builder)
    /**
     * @param lexBot Configuration information of an Amazon Lex (V1) bot. Detailed below.
     * @return builder
     */
    inline def lexBot(args: Endofunction[com.pulumi.aws.connect.inputs.BotAssociationLexBotArgs.Builder]):
        com.pulumi.aws.connect.BotAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.BotAssociationLexBotArgs.builder
      builder.lexBot(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.HoursOfOperationArgs.Builder)
    /**
     * @param configs One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
     * @return builder
     */
    inline def configs(args: Endofunction[com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.Builder]*):
        com.pulumi.aws.connect.HoursOfOperationArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.builder
      builder.configs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.InstanceStorageConfigArgs.Builder)
    /**
     * @param storageConfig Specifies the storage configuration options for the Connect Instance. Documented below.
     * @return builder
     */
    inline def storageConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder]):
        com.pulumi.aws.connect.InstanceStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.builder
      builder.storageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.QueueArgs.Builder)
    /**
     * @param outboundCallerConfig A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
     * @return builder
     */
    inline def outboundCallerConfig(args: Endofunction[com.pulumi.aws.connect.inputs.QueueOutboundCallerConfigArgs.Builder]):
        com.pulumi.aws.connect.QueueArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.QueueOutboundCallerConfigArgs.builder
      builder.outboundCallerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.QuickConnectArgs.Builder)
    /**
     * @param quickConnectConfig A block that defines the configuration information for the Quick Connect: `quickConnectType` and one of `phoneConfig`, `queueConfig`, `userConfig` . The Quick Connect Config block is documented below.
     * @return builder
     */
    inline def quickConnectConfig(args: Endofunction[com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.Builder]):
        com.pulumi.aws.connect.QuickConnectArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.builder
      builder.quickConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.RoutingProfileArgs.Builder)
    /**
     * @param mediaConcurrencies One or more `mediaConcurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `mediaConcurrencies` block is documented below.
     * @return builder
     */
    inline def mediaConcurrencies(args: Endofunction[com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyArgs.Builder]*):
        com.pulumi.aws.connect.RoutingProfileArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyArgs.builder
      builder.mediaConcurrencies(args.map(_(argsBuilder).build)*)

    /**
     * @param queueConfigs One or more `queueConfigs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queueConfigs` block is documented below.
     * @return builder
     */
    inline def queueConfigs(args: Endofunction[com.pulumi.aws.connect.inputs.RoutingProfileQueueConfigArgs.Builder]*):
        com.pulumi.aws.connect.RoutingProfileArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.RoutingProfileQueueConfigArgs.builder
      builder.queueConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.UserArgs.Builder)
    /**
     * @param identityInfo A block that contains information about the identity of the user. Documented below.
     * @return builder
     */
    inline def identityInfo(args: Endofunction[com.pulumi.aws.connect.inputs.UserIdentityInfoArgs.Builder]):
        com.pulumi.aws.connect.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserIdentityInfoArgs.builder
      builder.identityInfo(args(argsBuilder).build)

    /**
     * @param phoneConfig A block that contains information about the phone settings for the user. Documented below.
     * @return builder
     */
    inline def phoneConfig(args: Endofunction[com.pulumi.aws.connect.inputs.UserPhoneConfigArgs.Builder]):
        com.pulumi.aws.connect.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserPhoneConfigArgs.builder
      builder.phoneConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.UserHierarchyStructureArgs.Builder)
    /**
     * @param hierarchyStructure A block that defines the hierarchy structure&#39;s levels. The `hierarchyStructure` block is documented below.
     * @return builder
     */
    inline def hierarchyStructure(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder]):
        com.pulumi.aws.connect.UserHierarchyStructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.builder
      builder.hierarchyStructure(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.BotAssociationState.Builder)
    /**
     * @param lexBot Configuration information of an Amazon Lex (V1) bot. Detailed below.
     * @return builder
     */
    inline def lexBot(args: Endofunction[com.pulumi.aws.connect.inputs.BotAssociationLexBotArgs.Builder]):
        com.pulumi.aws.connect.inputs.BotAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.BotAssociationLexBotArgs.builder
      builder.lexBot(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.GetBotAssociationArgs.Builder)
    /**
     * @param lexBot Configuration information of an Amazon Lex (V1) bot. Detailed below.
     * @return builder
     */
    inline def lexBot(args: Endofunction[com.pulumi.aws.connect.inputs.GetBotAssociationLexBotArgs.Builder]):
        com.pulumi.aws.connect.inputs.GetBotAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetBotAssociationLexBotArgs.builder
      builder.lexBot(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.GetBotAssociationPlainArgs.Builder)
    /**
     * @param lexBot Configuration information of an Amazon Lex (V1) bot. Detailed below.
     * @return builder
     */
    inline def lexBot(args: Endofunction[com.pulumi.aws.connect.inputs.GetBotAssociationLexBot.Builder]):
        com.pulumi.aws.connect.inputs.GetBotAssociationPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetBotAssociationLexBot.builder
      builder.lexBot(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.Builder)
    /**
     * @param endTime A end time block specifies the time that your contact center closes. The `endTime` is documented below.
     * @return builder
     */
    inline def endTime(args: Endofunction[com.pulumi.aws.connect.inputs.HoursOfOperationConfigEndTimeArgs.Builder]):
        com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.HoursOfOperationConfigEndTimeArgs.builder
      builder.endTime(args(argsBuilder).build)

    /**
     * @param startTime A start time block specifies the time that your contact center opens. The `startTime` is documented below.
     * @return builder
     */
    inline def startTime(args: Endofunction[com.pulumi.aws.connect.inputs.HoursOfOperationConfigStartTimeArgs.Builder]):
        com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.HoursOfOperationConfigStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.HoursOfOperationState.Builder)
    /**
     * @param configs One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
     * @return builder
     */
    inline def configs(args: Endofunction[com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.Builder]*):
        com.pulumi.aws.connect.inputs.HoursOfOperationState.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.builder
      builder.configs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.inputs.InstanceStorageConfigState.Builder)
    /**
     * @param storageConfig Specifies the storage configuration options for the Connect Instance. Documented below.
     * @return builder
     */
    inline def storageConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.builder
      builder.storageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder)
    /**
     * @param kinesisFirehoseConfig A block that specifies the configuration of the Kinesis Firehose delivery stream. Documented below.
     * @return builder
     */
    inline def kinesisFirehoseConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisFirehoseConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisFirehoseConfigArgs.builder
      builder.kinesisFirehoseConfig(args(argsBuilder).build)

    /**
     * @param kinesisStreamConfig A block that specifies the configuration of the Kinesis data stream. Documented below.
     * @return builder
     */
    inline def kinesisStreamConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisStreamConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisStreamConfigArgs.builder
      builder.kinesisStreamConfig(args(argsBuilder).build)

    /**
     * @param kinesisVideoStreamConfig A block that specifies the configuration of the Kinesis video stream. Documented below.
     * @return builder
     */
    inline def kinesisVideoStreamConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs.builder
      builder.kinesisVideoStreamConfig(args(argsBuilder).build)

    /**
     * @param s3Config A block that specifies the configuration of S3 Bucket. Documented below.
     * @return builder
     */
    inline def s3Config(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigS3ConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigS3ConfigArgs.builder
      builder.s3Config(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs.Builder)
    /**
     * @param encryptionConfig The encryption configuration. Documented below.
     * @return builder
     */
    inline def encryptionConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigS3ConfigArgs.Builder)
    /**
     * @param encryptionConfig The encryption configuration. Documented below.
     * @return builder
     */
    inline def encryptionConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigS3ConfigEncryptionConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigS3ConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigS3ConfigEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.PhoneNumberState.Builder)
    /**
     * @param statuses The status of the phone number. Valid Values: `CLAIMED` | `IN_PROGRESS` | `FAILED`.
     * @return builder
     */
    inline def statuses(args: Endofunction[com.pulumi.aws.connect.inputs.PhoneNumberStatusArgs.Builder]*):
        com.pulumi.aws.connect.inputs.PhoneNumberState.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.PhoneNumberStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.inputs.QueueState.Builder)
    /**
     * @param outboundCallerConfig A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
     * @return builder
     */
    inline def outboundCallerConfig(args: Endofunction[com.pulumi.aws.connect.inputs.QueueOutboundCallerConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.QueueOutboundCallerConfigArgs.builder
      builder.outboundCallerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.Builder)
    /**
     * @param phoneConfigs Specifies the phone configuration of the Quick Connect. This is required only if `quickConnectType` is `PHONE_NUMBER`. The `phoneConfig` block is documented below.
     * @return builder
     */
    inline def phoneConfigs(args: Endofunction[com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigPhoneConfigArgs.Builder]*):
        com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigPhoneConfigArgs.builder
      builder.phoneConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param queueConfigs Specifies the queue configuration of the Quick Connect. This is required only if `quickConnectType` is `QUEUE`. The `queueConfig` block is documented below.
     * @return builder
     */
    inline def queueConfigs(args: Endofunction[com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigQueueConfigArgs.Builder]*):
        com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigQueueConfigArgs.builder
      builder.queueConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param userConfigs Specifies the user configuration of the Quick Connect. This is required only if `quickConnectType` is `USER`. The `userConfig` block is documented below.
     * @return builder
     */
    inline def userConfigs(args: Endofunction[com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigUserConfigArgs.Builder]*):
        com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigUserConfigArgs.builder
      builder.userConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.inputs.QuickConnectState.Builder)
    /**
     * @param quickConnectConfig A block that defines the configuration information for the Quick Connect: `quickConnectType` and one of `phoneConfig`, `queueConfig`, `userConfig` . The Quick Connect Config block is documented below.
     * @return builder
     */
    inline def quickConnectConfig(args: Endofunction[com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.QuickConnectState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.builder
      builder.quickConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyArgs.Builder)
    /**
     * @param crossChannelBehavior Defines the cross-channel routing behavior for each traffic type. **Out-of-band changes are only detected when this argument is explicitly configured in your Terraform configuration.** Documented below.
     * @return builder
     */
    inline def crossChannelBehavior(args: Endofunction[com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyCrossChannelBehaviorArgs.Builder]):
        com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyCrossChannelBehaviorArgs.builder
      builder.crossChannelBehavior(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.RoutingProfileState.Builder)
    /**
     * @param mediaConcurrencies One or more `mediaConcurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `mediaConcurrencies` block is documented below.
     * @return builder
     */
    inline def mediaConcurrencies(args: Endofunction[com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyArgs.Builder]*):
        com.pulumi.aws.connect.inputs.RoutingProfileState.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyArgs.builder
      builder.mediaConcurrencies(args.map(_(argsBuilder).build)*)

    /**
     * @param queueConfigs One or more `queueConfigs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queueConfigs` block is documented below.
     * @return builder
     */
    inline def queueConfigs(args: Endofunction[com.pulumi.aws.connect.inputs.RoutingProfileQueueConfigArgs.Builder]*):
        com.pulumi.aws.connect.inputs.RoutingProfileState.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.RoutingProfileQueueConfigArgs.builder
      builder.queueConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder)
    /**
     * @param levelFives A block that defines the details of level five. The level block is documented below.
     * @return builder
     */
    inline def levelFives(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelFifeArgs.Builder]*):
        com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelFifeArgs.builder
      builder.levelFives(args.map(_(argsBuilder).build)*)

    /**
     * @param levelFours A block that defines the details of level four. The level block is documented below.
     * @return builder
     */
    inline def levelFours(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelFourArgs.Builder]*):
        com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelFourArgs.builder
      builder.levelFours(args.map(_(argsBuilder).build)*)

    /**
     * @param levelOnes A block that defines the details of level one. The level block is documented below.
     * @return builder
     */
    inline def levelOnes(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelOneArgs.Builder]*):
        com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelOneArgs.builder
      builder.levelOnes(args.map(_(argsBuilder).build)*)

    /**
     * @param levelThrees A block that defines the details of level three. The level block is documented below.
     * @return builder
     */
    inline def levelThrees(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelThreeArgs.Builder]*):
        com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelThreeArgs.builder
      builder.levelThrees(args.map(_(argsBuilder).build)*)

    /**
     * @param levelTwos A block that defines the details of level two. The level block is documented below.
     * @return builder
     */
    inline def levelTwos(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelTwoArgs.Builder]*):
        com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelTwoArgs.builder
      builder.levelTwos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.inputs.UserHierarchyGroupState.Builder)
    /**
     * @param hierarchyPaths A block that contains information about the levels in the hierarchy group. The `hierarchyPath` block is documented below.
     * @return builder
     */
    inline def hierarchyPaths(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder]*):
        com.pulumi.aws.connect.inputs.UserHierarchyGroupState.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.builder
      builder.hierarchyPaths(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder)
    /**
     * @param levelFive A block that defines the details of level five. The level block is documented below.
     * 
     * Each level block supports the following arguments:
     * @return builder
     */
    inline def levelFive(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelFiveArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelFiveArgs.builder
      builder.levelFive(args(argsBuilder).build)

    /**
     * @param levelFour A block that defines the details of level four. The level block is documented below.
     * @return builder
     */
    inline def levelFour(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelFourArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelFourArgs.builder
      builder.levelFour(args(argsBuilder).build)

    /**
     * @param levelOne A block that defines the details of level one. The level block is documented below.
     * @return builder
     */
    inline def levelOne(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelOneArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelOneArgs.builder
      builder.levelOne(args(argsBuilder).build)

    /**
     * @param levelThree A block that defines the details of level three. The level block is documented below.
     * @return builder
     */
    inline def levelThree(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelThreeArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelThreeArgs.builder
      builder.levelThree(args(argsBuilder).build)

    /**
     * @param levelTwo A block that defines the details of level two. The level block is documented below.
     * @return builder
     */
    inline def levelTwo(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelTwoArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelTwoArgs.builder
      builder.levelTwo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.UserHierarchyStructureState.Builder)
    /**
     * @param hierarchyStructure A block that defines the hierarchy structure&#39;s levels. The `hierarchyStructure` block is documented below.
     * @return builder
     */
    inline def hierarchyStructure(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserHierarchyStructureState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.builder
      builder.hierarchyStructure(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.UserState.Builder)
    /**
     * @param identityInfo A block that contains information about the identity of the user. Documented below.
     * @return builder
     */
    inline def identityInfo(args: Endofunction[com.pulumi.aws.connect.inputs.UserIdentityInfoArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserIdentityInfoArgs.builder
      builder.identityInfo(args(argsBuilder).build)

    /**
     * @param phoneConfig A block that contains information about the phone settings for the user. Documented below.
     * @return builder
     */
    inline def phoneConfig(args: Endofunction[com.pulumi.aws.connect.inputs.UserPhoneConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserPhoneConfigArgs.builder
      builder.phoneConfig(args(argsBuilder).build)
