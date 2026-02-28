package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object connect:
  extension (builder: com.pulumi.aws.connect.BotAssociationArgs.Builder)
    /**
     * @param lexBot Configuration information of an Amazon Lex (V1) bot. Detailed below.
     * @return builder
     */
    def lexBot(args: Endofunction[com.pulumi.aws.connect.inputs.BotAssociationLexBotArgs.Builder]):
        com.pulumi.aws.connect.BotAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.BotAssociationLexBotArgs.builder
      builder.lexBot(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.QueueArgs.Builder)
    /**
     * @param outboundCallerConfig A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
     * @return builder
     */
    def outboundCallerConfig(args: Endofunction[com.pulumi.aws.connect.inputs.QueueOutboundCallerConfigArgs.Builder]):
        com.pulumi.aws.connect.QueueArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.QueueOutboundCallerConfigArgs.builder
      builder.outboundCallerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.HoursOfOperationArgs.Builder)
    /**
     * @param configs One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
     * @return builder
     */
    def configs(args: Endofunction[com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.Builder]*):
        com.pulumi.aws.connect.HoursOfOperationArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.builder
      builder.configs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.UserArgs.Builder)
    /**
     * @param identityInfo A block that contains information about the identity of the user. Documented below.
     * @return builder
     */
    def identityInfo(args: Endofunction[com.pulumi.aws.connect.inputs.UserIdentityInfoArgs.Builder]):
        com.pulumi.aws.connect.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserIdentityInfoArgs.builder
      builder.identityInfo(args(argsBuilder).build)

    /**
     * @param phoneConfig A block that contains information about the phone settings for the user. Documented below.
     * @return builder
     */
    def phoneConfig(args: Endofunction[com.pulumi.aws.connect.inputs.UserPhoneConfigArgs.Builder]):
        com.pulumi.aws.connect.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserPhoneConfigArgs.builder
      builder.phoneConfig(args(argsBuilder).build)

  /**
   * Provides an Amazon Connect Contact Flow Module resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   *  
   *  This resource embeds or references Contact Flows Modules specified in Amazon Connect Contact Flow Language. For more information see
   *  [Amazon Connect Flow language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html)
   *  
   *  !&gt; **WARN:** Contact Flow Modules exported from the Console [See Contact Flow import/export which is the same for Contact Flow Modules](https://docs.aws.amazon.com/connect/latest/adminguide/contact-flow-import-export.html) are not in the Amazon Connect Contact Flow Language and can not be used with this resource. Instead, the recommendation is to use the AWS CLI [`describe-contact-flow-module`](https://docs.aws.amazon.com/cli/latest/reference/connect/describe-contact-flow-module.html).
   *  See example below which uses `jq` to extract the `Content` attribute and saves it to a local file.
   */
  def ContactFlowModule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.ContactFlowModuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.ContactFlowModuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.connect.ContactFlowModule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.connect.UserHierarchyStructureArgs.Builder)
    /**
     * @param hierarchyStructure A block that defines the hierarchy structure&#39;s levels. The `hierarchyStructure` block is documented below.
     * @return builder
     */
    def hierarchyStructure(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder]):
        com.pulumi.aws.connect.UserHierarchyStructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.builder
      builder.hierarchyStructure(args(argsBuilder).build)

  /**
   * Provides an Amazon Connect Queue resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.QueueArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.QueueArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.connect.Queue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Amazon Connect User resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.UserArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.UserArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.connect.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Amazon Connect Quick Connect resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def QuickConnect(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.QuickConnectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.QuickConnectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.connect.QuickConnect(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Amazon Connect Routing Profile resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html).
   */
  def RoutingProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.RoutingProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.RoutingProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.connect.RoutingProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Amazon Connect Contact Flow resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   *  
   *  This resource embeds or references Contact Flows specified in Amazon Connect Contact Flow Language. For more information see
   *  [Amazon Connect Flow language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html)
   *  
   *  !&gt; **WARN:** Contact Flows exported from the Console [Contact Flow import/export](https://docs.aws.amazon.com/connect/latest/adminguide/contact-flow-import-export.html) are not in the Amazon Connect Contact Flow Language and can not be used with this resource. Instead, the recommendation is to use the AWS CLI [`describe-contact-flow`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/connect/describe-contact-flow.html).
   *  See example below which uses `jq` to extract the `Content` attribute and saves it to a local file.
   */
  def ContactFlow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.ContactFlowArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.ContactFlowArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.connect.ContactFlow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type ConnectFunctions = com.pulumi.aws.connect.ConnectFunctions
  object ConnectFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.connect.ConnectFunctions.*
  extension (self: ConnectFunctions.type)
    /** Provides details about a specific Lex (V1) Bot associated with an Amazon Connect instance. */
    def getBotAssociation(args: Endofunction[com.pulumi.aws.connect.inputs.GetBotAssociationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetBotAssociationResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetBotAssociationArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getBotAssociation(args(argsBuilder).build)

    /** Provides details about a specific Lex (V1) Bot associated with an Amazon Connect instance. */
    def getBotAssociationPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetBotAssociationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetBotAssociationResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetBotAssociationPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getBotAssociationPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Contact Flow. */
    def getContactFlow(args: Endofunction[com.pulumi.aws.connect.inputs.GetContactFlowArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetContactFlowResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetContactFlowArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getContactFlow(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Contact Flow. */
    def getContactFlowPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetContactFlowPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetContactFlowResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetContactFlowPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getContactFlowPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Contact Flow Module. */
    def getContactFlowModule(args: Endofunction[com.pulumi.aws.connect.inputs.GetContactFlowModuleArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetContactFlowModuleResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetContactFlowModuleArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getContactFlowModule(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Contact Flow Module. */
    def getContactFlowModulePlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetContactFlowModulePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetContactFlowModuleResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetContactFlowModulePlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getContactFlowModulePlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Hours of Operation. */
    def getHoursOfOperation(args: Endofunction[com.pulumi.aws.connect.inputs.GetHoursOfOperationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetHoursOfOperationResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetHoursOfOperationArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getHoursOfOperation(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Hours of Operation. */
    def getHoursOfOperationPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetHoursOfOperationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetHoursOfOperationResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetHoursOfOperationPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getHoursOfOperationPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Instance. */
    def getInstance(args: Endofunction[com.pulumi.aws.connect.inputs.GetInstanceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetInstanceArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getInstance(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Instance. */
    def getInstancePlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetInstancePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetInstancePlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getInstancePlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Instance Storage Config. */
    def getInstanceStorageConfig(args: Endofunction[com.pulumi.aws.connect.inputs.GetInstanceStorageConfigArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetInstanceStorageConfigResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetInstanceStorageConfigArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getInstanceStorageConfig(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Instance Storage Config. */
    def getInstanceStorageConfigPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetInstanceStorageConfigPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetInstanceStorageConfigResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetInstanceStorageConfigPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getInstanceStorageConfigPlain(args(argsBuilder).build)

    /** Provides details about a specific Connect Lambda Function Association. */
    def getLambdaFunctionAssociation(args: Endofunction[com.pulumi.aws.connect.inputs.GetLambdaFunctionAssociationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetLambdaFunctionAssociationResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetLambdaFunctionAssociationArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getLambdaFunctionAssociation(args(argsBuilder).build)

    /** Provides details about a specific Connect Lambda Function Association. */
    def getLambdaFunctionAssociationPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetLambdaFunctionAssociationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetLambdaFunctionAssociationResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetLambdaFunctionAssociationPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getLambdaFunctionAssociationPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Prompt. */
    def getPrompt(args: Endofunction[com.pulumi.aws.connect.inputs.GetPromptArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetPromptResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetPromptArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getPrompt(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Prompt. */
    def getPromptPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetPromptPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetPromptResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetPromptPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getPromptPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Queue. */
    def getQueue(args: Endofunction[com.pulumi.aws.connect.inputs.GetQueueArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetQueueArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getQueue(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Queue. */
    def getQueuePlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetQueuePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetQueuePlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getQueuePlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Quick Connect. */
    def getQuickConnect(args: Endofunction[com.pulumi.aws.connect.inputs.GetQuickConnectArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetQuickConnectResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetQuickConnectArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getQuickConnect(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Quick Connect. */
    def getQuickConnectPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetQuickConnectPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetQuickConnectResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetQuickConnectPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getQuickConnectPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Routing Profile. */
    def getRoutingProfile(args: Endofunction[com.pulumi.aws.connect.inputs.GetRoutingProfileArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetRoutingProfileResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetRoutingProfileArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getRoutingProfile(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Routing Profile. */
    def getRoutingProfilePlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetRoutingProfilePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetRoutingProfileResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetRoutingProfilePlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getRoutingProfilePlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Security Profile. */
    def getSecurityProfile(args: Endofunction[com.pulumi.aws.connect.inputs.GetSecurityProfileArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetSecurityProfileResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetSecurityProfileArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getSecurityProfile(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Security Profile. */
    def getSecurityProfilePlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetSecurityProfilePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetSecurityProfileResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetSecurityProfilePlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getSecurityProfilePlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect User. */
    def getUser(args: Endofunction[com.pulumi.aws.connect.inputs.GetUserArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetUserArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getUser(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect User. */
    def getUserPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetUserPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetUserPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getUserPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect User Hierarchy Group. */
    def getUserHierarchyGroup(args: Endofunction[com.pulumi.aws.connect.inputs.GetUserHierarchyGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetUserHierarchyGroupResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetUserHierarchyGroupArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getUserHierarchyGroup(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect User Hierarchy Group. */
    def getUserHierarchyGroupPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetUserHierarchyGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetUserHierarchyGroupResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetUserHierarchyGroupPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getUserHierarchyGroupPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect User Hierarchy Structure */
    def getUserHierarchyStructure(args: Endofunction[com.pulumi.aws.connect.inputs.GetUserHierarchyStructureArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetUserHierarchyStructureResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetUserHierarchyStructureArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getUserHierarchyStructure(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect User Hierarchy Structure */
    def getUserHierarchyStructurePlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetUserHierarchyStructurePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetUserHierarchyStructureResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetUserHierarchyStructurePlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getUserHierarchyStructurePlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Vocabulary. */
    def getVocabulary(args: Endofunction[com.pulumi.aws.connect.inputs.GetVocabularyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetVocabularyResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetVocabularyArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getVocabulary(args(argsBuilder).build)

    /** Provides details about a specific Amazon Connect Vocabulary. */
    def getVocabularyPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetVocabularyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetVocabularyResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetVocabularyPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getVocabularyPlain(args(argsBuilder).build)

  /**
   * Provides an Amazon Connect Hours of Operation resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def HoursOfOperation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.HoursOfOperationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.HoursOfOperationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.connect.HoursOfOperation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.connect.InstanceStorageConfigArgs.Builder)
    /**
     * @param storageConfig Specifies the storage configuration options for the Connect Instance. Documented below.
     * @return builder
     */
    def storageConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder]):
        com.pulumi.aws.connect.InstanceStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.builder
      builder.storageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.RoutingProfileArgs.Builder)
    /**
     * @param mediaConcurrencies One or more `mediaConcurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `mediaConcurrencies` block is documented below.
     * @return builder
     */
    def mediaConcurrencies(args: Endofunction[com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyArgs.Builder]*):
        com.pulumi.aws.connect.RoutingProfileArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyArgs.builder
      builder.mediaConcurrencies(args.map(_(argsBuilder).build)*)

    /**
     * @param queueConfigs One or more `queueConfigs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queueConfigs` block is documented below.
     * @return builder
     */
    def queueConfigs(args: Endofunction[com.pulumi.aws.connect.inputs.RoutingProfileQueueConfigArgs.Builder]*):
        com.pulumi.aws.connect.RoutingProfileArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.RoutingProfileQueueConfigArgs.builder
      builder.queueConfigs(args.map(_(argsBuilder).build)*)

  /**
   * Provides an Amazon Connect instance resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   *  
   *  !&gt; **WARN:** Amazon Connect enforces a limit of [100 combined instance creation and deletions every 30 days](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits). For example, if you create 80 instances and delete 20 of them, you must wait 30 days to create or delete another instance. Use care when creating or deleting instances.
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.InstanceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.connect.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Amazon Connect Lambda Function Association. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html) and [Invoke AWS Lambda functions](https://docs.aws.amazon.com/connect/latest/adminguide/connect-lambda-functions.html).
   */
  def LambdaFunctionAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.LambdaFunctionAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.connect.LambdaFunctionAssociationArgs.builder
    
    com.pulumi.aws.connect.LambdaFunctionAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Amazon Connect Security Profile resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def SecurityProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.SecurityProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.SecurityProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.connect.SecurityProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Amazon Connect Vocabulary resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def Vocabulary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.VocabularyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.VocabularyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.connect.Vocabulary(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Amazon Connect Instance Storage Config resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def InstanceStorageConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.InstanceStorageConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.connect.InstanceStorageConfigArgs.builder
    
    com.pulumi.aws.connect.InstanceStorageConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Associates a flow with a phone number claimed to an Amazon Connect instance. */
  def PhoneNumberContactFlowAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.PhoneNumberContactFlowAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.connect.PhoneNumberContactFlowAssociationArgs.builder
    
    com.pulumi.aws.connect.PhoneNumberContactFlowAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Amazon Connect User Hierarchy Structure resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def UserHierarchyStructure(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.UserHierarchyStructureArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.connect.UserHierarchyStructureArgs.builder
    
    com.pulumi.aws.connect.UserHierarchyStructure(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Amazon Connect Phone Number resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def PhoneNumber(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.PhoneNumberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.PhoneNumberArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.connect.PhoneNumber(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.connect.QuickConnectArgs.Builder)
    /**
     * @param quickConnectConfig A block that defines the configuration information for the Quick Connect: `quickConnectType` and one of `phoneConfig`, `queueConfig`, `userConfig` . The Quick Connect Config block is documented below.
     * @return builder
     */
    def quickConnectConfig(args: Endofunction[com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.Builder]):
        com.pulumi.aws.connect.QuickConnectArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.builder
      builder.quickConnectConfig(args(argsBuilder).build)

  /**
   * Provides an Amazon Connect User Hierarchy Group resource. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   *  
   *  &gt; **NOTE:** The User Hierarchy Structure must be created before creating a User Hierarchy Group.
   */
  def UserHierarchyGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.UserHierarchyGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.UserHierarchyGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.connect.UserHierarchyGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.Builder)
    /**
     * @param phoneConfigs Specifies the phone configuration of the Quick Connect. This is required only if `quickConnectType` is `PHONE_NUMBER`. The `phoneConfig` block is documented below.
     * @return builder
     */
    def phoneConfigs(args: Endofunction[com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigPhoneConfigArgs.Builder]*):
        com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigPhoneConfigArgs.builder
      builder.phoneConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param queueConfigs Specifies the queue configuration of the Quick Connect. This is required only if `quickConnectType` is `QUEUE`. The `queueConfig` block is documented below.
     * @return builder
     */
    def queueConfigs(args: Endofunction[com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigQueueConfigArgs.Builder]*):
        com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigQueueConfigArgs.builder
      builder.queueConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param userConfigs Specifies the user configuration of the Quick Connect. This is required only if `quickConnectType` is `USER`. The `userConfig` block is documented below.
     * @return builder
     */
    def userConfigs(args: Endofunction[com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigUserConfigArgs.Builder]*):
        com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigUserConfigArgs.builder
      builder.userConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyArgs.Builder)
    /**
     * @param crossChannelBehavior Defines the cross-channel routing behavior for each traffic type. **Out-of-band changes are only detected when this argument is explicitly configured in your Terraform configuration.** Documented below.
     * @return builder
     */
    def crossChannelBehavior(args: Endofunction[com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyCrossChannelBehaviorArgs.Builder]):
        com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyCrossChannelBehaviorArgs.builder
      builder.crossChannelBehavior(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.GetBotAssociationArgs.Builder)
    /**
     * @param lexBot Configuration information of an Amazon Lex (V1) bot. Detailed below.
     * @return builder
     */
    def lexBot(args: Endofunction[com.pulumi.aws.connect.inputs.GetBotAssociationLexBotArgs.Builder]):
        com.pulumi.aws.connect.inputs.GetBotAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetBotAssociationLexBotArgs.builder
      builder.lexBot(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.QuickConnectState.Builder)
    /**
     * @param quickConnectConfig A block that defines the configuration information for the Quick Connect: `quickConnectType` and one of `phoneConfig`, `queueConfig`, `userConfig` . The Quick Connect Config block is documented below.
     * @return builder
     */
    def quickConnectConfig(args: Endofunction[com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.QuickConnectState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs.builder
      builder.quickConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs.Builder)
    /**
     * @param encryptionConfig The encryption configuration. Documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.UserHierarchyStructureState.Builder)
    /**
     * @param hierarchyStructure A block that defines the hierarchy structure&#39;s levels. The `hierarchyStructure` block is documented below.
     * @return builder
     */
    def hierarchyStructure(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserHierarchyStructureState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.builder
      builder.hierarchyStructure(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.QueueState.Builder)
    /**
     * @param outboundCallerConfig A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
     * @return builder
     */
    def outboundCallerConfig(args: Endofunction[com.pulumi.aws.connect.inputs.QueueOutboundCallerConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.QueueOutboundCallerConfigArgs.builder
      builder.outboundCallerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.RoutingProfileState.Builder)
    /**
     * @param mediaConcurrencies One or more `mediaConcurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `mediaConcurrencies` block is documented below.
     * @return builder
     */
    def mediaConcurrencies(args: Endofunction[com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyArgs.Builder]*):
        com.pulumi.aws.connect.inputs.RoutingProfileState.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.RoutingProfileMediaConcurrencyArgs.builder
      builder.mediaConcurrencies(args.map(_(argsBuilder).build)*)

    /**
     * @param queueConfigs One or more `queueConfigs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queueConfigs` block is documented below.
     * @return builder
     */
    def queueConfigs(args: Endofunction[com.pulumi.aws.connect.inputs.RoutingProfileQueueConfigArgs.Builder]*):
        com.pulumi.aws.connect.inputs.RoutingProfileState.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.RoutingProfileQueueConfigArgs.builder
      builder.queueConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.inputs.UserHierarchyGroupState.Builder)
    /**
     * @param hierarchyPaths A block that contains information about the levels in the hierarchy group. The `hierarchyPath` block is documented below.
     * @return builder
     */
    def hierarchyPaths(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder]*):
        com.pulumi.aws.connect.inputs.UserHierarchyGroupState.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.builder
      builder.hierarchyPaths(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.inputs.UserState.Builder)
    /**
     * @param identityInfo A block that contains information about the identity of the user. Documented below.
     * @return builder
     */
    def identityInfo(args: Endofunction[com.pulumi.aws.connect.inputs.UserIdentityInfoArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserIdentityInfoArgs.builder
      builder.identityInfo(args(argsBuilder).build)

    /**
     * @param phoneConfig A block that contains information about the phone settings for the user. Documented below.
     * @return builder
     */
    def phoneConfig(args: Endofunction[com.pulumi.aws.connect.inputs.UserPhoneConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserPhoneConfigArgs.builder
      builder.phoneConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.InstanceStorageConfigState.Builder)
    /**
     * @param storageConfig Specifies the storage configuration options for the Connect Instance. Documented below.
     * @return builder
     */
    def storageConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.builder
      builder.storageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.HoursOfOperationState.Builder)
    /**
     * @param configs One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
     * @return builder
     */
    def configs(args: Endofunction[com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.Builder]*):
        com.pulumi.aws.connect.inputs.HoursOfOperationState.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.builder
      builder.configs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder)
    /**
     * @param levelFive A block that defines the details of level five. The level block is documented below.
     *  
     *  Each level block supports the following arguments:
     * @return builder
     */
    def levelFive(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelFiveArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelFiveArgs.builder
      builder.levelFive(args(argsBuilder).build)

    /**
     * @param levelFour A block that defines the details of level four. The level block is documented below.
     * @return builder
     */
    def levelFour(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelFourArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelFourArgs.builder
      builder.levelFour(args(argsBuilder).build)

    /**
     * @param levelOne A block that defines the details of level one. The level block is documented below.
     * @return builder
     */
    def levelOne(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelOneArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelOneArgs.builder
      builder.levelOne(args(argsBuilder).build)

    /**
     * @param levelThree A block that defines the details of level three. The level block is documented below.
     * @return builder
     */
    def levelThree(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelThreeArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelThreeArgs.builder
      builder.levelThree(args(argsBuilder).build)

    /**
     * @param levelTwo A block that defines the details of level two. The level block is documented below.
     * @return builder
     */
    def levelTwo(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelTwoArgs.Builder]):
        com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyStructureHierarchyStructureLevelTwoArgs.builder
      builder.levelTwo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.BotAssociationState.Builder)
    /**
     * @param lexBot Configuration information of an Amazon Lex (V1) bot. Detailed below.
     * @return builder
     */
    def lexBot(args: Endofunction[com.pulumi.aws.connect.inputs.BotAssociationLexBotArgs.Builder]):
        com.pulumi.aws.connect.inputs.BotAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.BotAssociationLexBotArgs.builder
      builder.lexBot(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigS3ConfigArgs.Builder)
    /**
     * @param encryptionConfig The encryption configuration. Documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigS3ConfigEncryptionConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigS3ConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigS3ConfigEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.Builder)
    /**
     * @param endTime A end time block specifies the time that your contact center closes. The `endTime` is documented below.
     * @return builder
     */
    def endTime(args: Endofunction[com.pulumi.aws.connect.inputs.HoursOfOperationConfigEndTimeArgs.Builder]):
        com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.HoursOfOperationConfigEndTimeArgs.builder
      builder.endTime(args(argsBuilder).build)

    /**
     * @param startTime A start time block specifies the time that your contact center opens. The `startTime` is documented below.
     * @return builder
     */
    def startTime(args: Endofunction[com.pulumi.aws.connect.inputs.HoursOfOperationConfigStartTimeArgs.Builder]):
        com.pulumi.aws.connect.inputs.HoursOfOperationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.HoursOfOperationConfigStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder)
    /**
     * @param kinesisFirehoseConfig A block that specifies the configuration of the Kinesis Firehose delivery stream. Documented below.
     * @return builder
     */
    def kinesisFirehoseConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisFirehoseConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisFirehoseConfigArgs.builder
      builder.kinesisFirehoseConfig(args(argsBuilder).build)

    /**
     * @param kinesisStreamConfig A block that specifies the configuration of the Kinesis data stream. Documented below.
     * @return builder
     */
    def kinesisStreamConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisStreamConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisStreamConfigArgs.builder
      builder.kinesisStreamConfig(args(argsBuilder).build)

    /**
     * @param kinesisVideoStreamConfig A block that specifies the configuration of the Kinesis video stream. Documented below.
     * @return builder
     */
    def kinesisVideoStreamConfig(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs.builder
      builder.kinesisVideoStreamConfig(args(argsBuilder).build)

    /**
     * @param s3Config A block that specifies the configuration of S3 Bucket. Documented below.
     * @return builder
     */
    def s3Config(args: Endofunction[com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigS3ConfigArgs.Builder]):
        com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigS3ConfigArgs.builder
      builder.s3Config(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.connect.inputs.PhoneNumberState.Builder)
    /**
     * @param statuses The status of the phone number. Valid Values: `CLAIMED` | `IN_PROGRESS` | `FAILED`.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.aws.connect.inputs.PhoneNumberStatusArgs.Builder]*):
        com.pulumi.aws.connect.inputs.PhoneNumberState.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.PhoneNumberStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder)
    /**
     * @param levelFives A block that defines the details of level five. The level block is documented below.
     * @return builder
     */
    def levelFives(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelFifeArgs.Builder]*):
        com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelFifeArgs.builder
      builder.levelFives(args.map(_(argsBuilder).build)*)

    /**
     * @param levelFours A block that defines the details of level four. The level block is documented below.
     * @return builder
     */
    def levelFours(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelFourArgs.Builder]*):
        com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelFourArgs.builder
      builder.levelFours(args.map(_(argsBuilder).build)*)

    /**
     * @param levelOnes A block that defines the details of level one. The level block is documented below.
     * @return builder
     */
    def levelOnes(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelOneArgs.Builder]*):
        com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelOneArgs.builder
      builder.levelOnes(args.map(_(argsBuilder).build)*)

    /**
     * @param levelThrees A block that defines the details of level three. The level block is documented below.
     * @return builder
     */
    def levelThrees(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelThreeArgs.Builder]*):
        com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelThreeArgs.builder
      builder.levelThrees(args.map(_(argsBuilder).build)*)

    /**
     * @param levelTwos A block that defines the details of level two. The level block is documented below.
     * @return builder
     */
    def levelTwos(args: Endofunction[com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelTwoArgs.Builder]*):
        com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.connect.inputs.UserHierarchyGroupHierarchyPathLevelTwoArgs.builder
      builder.levelTwos(args.map(_(argsBuilder).build)*)

  /**
   * Allows the specified Amazon Connect instance to access the specified Amazon Lex (V1) bot. For more information see
   *  [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html) and [Add an Amazon Lex bot](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-lex.html).
   *  
   *  &gt; **NOTE:** This resource only currently supports Amazon Lex (V1) Associations.
   */
  def BotAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.BotAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.connect.BotAssociationArgs.builder
    
    com.pulumi.aws.connect.BotAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
