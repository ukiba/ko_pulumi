package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object connect:
  /**
   * Allows the specified Amazon Connect instance to access the specified Amazon Lex (V1) bot. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html) and [Add an Amazon Lex bot](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-lex.html).
   * 
   * &gt; **NOTE:** This resource only currently supports Amazon Lex (V1) Associations.
   */
  def BotAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.BotAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.connect.BotAssociationArgs.builder
    com.pulumi.aws.connect.BotAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ConnectFunctions:
    /** Provides details about a specific Lex (V1) Bot associated with an Amazon Connect instance. */
    inline def getBotAssociation(args: Endofunction[com.pulumi.aws.connect.inputs.GetBotAssociationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetBotAssociationResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetBotAssociationArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getBotAssociation(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Lex (V1) Bot associated with an Amazon Connect instance. */
    inline def getBotAssociationPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetBotAssociationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetBotAssociationResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetBotAssociationPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getBotAssociationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect Contact Flow. */
    inline def getContactFlow(args: Endofunction[com.pulumi.aws.connect.inputs.GetContactFlowArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetContactFlowResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetContactFlowArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getContactFlow(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect Contact Flow. */
    inline def getContactFlowPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetContactFlowPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetContactFlowResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetContactFlowPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getContactFlowPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect Contact Flow Module. */
    inline def getContactFlowModule(args: Endofunction[com.pulumi.aws.connect.inputs.GetContactFlowModuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetContactFlowModuleResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetContactFlowModuleArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getContactFlowModule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect Contact Flow Module. */
    inline def getContactFlowModulePlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetContactFlowModulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetContactFlowModuleResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetContactFlowModulePlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getContactFlowModulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect Hours of Operation. */
    inline def getHoursOfOperation(args: Endofunction[com.pulumi.aws.connect.inputs.GetHoursOfOperationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetHoursOfOperationResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetHoursOfOperationArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getHoursOfOperation(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect Hours of Operation. */
    inline def getHoursOfOperationPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetHoursOfOperationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetHoursOfOperationResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetHoursOfOperationPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getHoursOfOperationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect Instance. */
    inline def getInstance(args: Endofunction[com.pulumi.aws.connect.inputs.GetInstanceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetInstanceArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getInstance(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect Instance. */
    inline def getInstancePlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetInstancePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetInstancePlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getInstancePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect Instance Storage Config. */
    inline def getInstanceStorageConfig(args: Endofunction[com.pulumi.aws.connect.inputs.GetInstanceStorageConfigArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetInstanceStorageConfigResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetInstanceStorageConfigArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getInstanceStorageConfig(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect Instance Storage Config. */
    inline def getInstanceStorageConfigPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetInstanceStorageConfigPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetInstanceStorageConfigResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetInstanceStorageConfigPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getInstanceStorageConfigPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Connect Lambda Function Association. */
    inline def getLambdaFunctionAssociation(args: Endofunction[com.pulumi.aws.connect.inputs.GetLambdaFunctionAssociationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetLambdaFunctionAssociationResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetLambdaFunctionAssociationArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getLambdaFunctionAssociation(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Connect Lambda Function Association. */
    inline def getLambdaFunctionAssociationPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetLambdaFunctionAssociationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetLambdaFunctionAssociationResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetLambdaFunctionAssociationPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getLambdaFunctionAssociationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect Prompt. */
    inline def getPrompt(args: Endofunction[com.pulumi.aws.connect.inputs.GetPromptArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetPromptResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetPromptArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getPrompt(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect Prompt. */
    inline def getPromptPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetPromptPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetPromptResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetPromptPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getPromptPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect Queue. */
    inline def getQueue(args: Endofunction[com.pulumi.aws.connect.inputs.GetQueueArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetQueueArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getQueue(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect Queue. */
    inline def getQueuePlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetQueuePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetQueuePlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getQueuePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect Quick Connect. */
    inline def getQuickConnect(args: Endofunction[com.pulumi.aws.connect.inputs.GetQuickConnectArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetQuickConnectResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetQuickConnectArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getQuickConnect(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect Quick Connect. */
    inline def getQuickConnectPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetQuickConnectPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetQuickConnectResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetQuickConnectPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getQuickConnectPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect Routing Profile. */
    inline def getRoutingProfile(args: Endofunction[com.pulumi.aws.connect.inputs.GetRoutingProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetRoutingProfileResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetRoutingProfileArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getRoutingProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect Routing Profile. */
    inline def getRoutingProfilePlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetRoutingProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetRoutingProfileResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetRoutingProfilePlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getRoutingProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect Security Profile. */
    inline def getSecurityProfile(args: Endofunction[com.pulumi.aws.connect.inputs.GetSecurityProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetSecurityProfileResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetSecurityProfileArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getSecurityProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect Security Profile. */
    inline def getSecurityProfilePlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetSecurityProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetSecurityProfileResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetSecurityProfilePlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getSecurityProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect User. */
    inline def getUser(args: Endofunction[com.pulumi.aws.connect.inputs.GetUserArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetUserArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getUser(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect User. */
    inline def getUserPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetUserPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetUserPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getUserPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect User Hierarchy Group. */
    inline def getUserHierarchyGroup(args: Endofunction[com.pulumi.aws.connect.inputs.GetUserHierarchyGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetUserHierarchyGroupResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetUserHierarchyGroupArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getUserHierarchyGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect User Hierarchy Group. */
    inline def getUserHierarchyGroupPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetUserHierarchyGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetUserHierarchyGroupResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetUserHierarchyGroupPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getUserHierarchyGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect User Hierarchy Structure */
    inline def getUserHierarchyStructure(args: Endofunction[com.pulumi.aws.connect.inputs.GetUserHierarchyStructureArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetUserHierarchyStructureResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetUserHierarchyStructureArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getUserHierarchyStructure(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect User Hierarchy Structure */
    inline def getUserHierarchyStructurePlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetUserHierarchyStructurePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetUserHierarchyStructureResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetUserHierarchyStructurePlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getUserHierarchyStructurePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Connect Vocabulary. */
    inline def getVocabulary(args: Endofunction[com.pulumi.aws.connect.inputs.GetVocabularyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.connect.outputs.GetVocabularyResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetVocabularyArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getVocabulary(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Connect Vocabulary. */
    inline def getVocabularyPlain(args: Endofunction[com.pulumi.aws.connect.inputs.GetVocabularyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.connect.outputs.GetVocabularyResult] =
      val argsBuilder = com.pulumi.aws.connect.inputs.GetVocabularyPlainArgs.builder
      com.pulumi.aws.connect.ConnectFunctions.getVocabularyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Provides an Amazon Connect Contact Flow resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   * 
   * This resource embeds or references Contact Flows specified in Amazon Connect Contact Flow Language. For more information see
   * [Amazon Connect Flow language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html)
   * 
   * &gt; **WARN:** Contact Flows exported from the Console [Contact Flow import/export](https://docs.aws.amazon.com/connect/latest/adminguide/contact-flow-import-export.html) are not in the Amazon Connect Contact Flow Language and can not be used with this resource. Instead, the recommendation is to use the AWS CLI [`describe-contact-flow`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/connect/describe-contact-flow.html).
   * See example below which uses `jq` to extract the `Content` attribute and saves it to a local file.
   */
  def ContactFlow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.ContactFlowArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.ContactFlowArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.connect.ContactFlow(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect Contact Flow Module resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   * 
   * This resource embeds or references Contact Flows Modules specified in Amazon Connect Contact Flow Language. For more information see
   * [Amazon Connect Flow language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html)
   * 
   * &gt; **WARN:** Contact Flow Modules exported from the Console [See Contact Flow import/export which is the same for Contact Flow Modules](https://docs.aws.amazon.com/connect/latest/adminguide/contact-flow-import-export.html) are not in the Amazon Connect Contact Flow Language and can not be used with this resource. Instead, the recommendation is to use the AWS CLI [`describe-contact-flow-module`](https://docs.aws.amazon.com/cli/latest/reference/connect/describe-contact-flow-module.html).
   * See example below which uses `jq` to extract the `Content` attribute and saves it to a local file.
   */
  def ContactFlowModule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.ContactFlowModuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.ContactFlowModuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.connect.ContactFlowModule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect Hours of Operation resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def HoursOfOperation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.HoursOfOperationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.HoursOfOperationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.connect.HoursOfOperation(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect instance resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   * 
   * &gt; **WARN:** Amazon Connect enforces a limit of [100 combined instance creation and deletions every 30 days](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits). For example, if you create 80 instances and delete 20 of them, you must wait 30 days to create or delete another instance. Use care when creating or deleting instances.
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.InstanceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.InstanceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.connect.Instance(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect Instance Storage Config resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def InstanceStorageConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.InstanceStorageConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.connect.InstanceStorageConfigArgs.builder
    com.pulumi.aws.connect.InstanceStorageConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect Lambda Function Association. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html) and [Invoke AWS Lambda functions](https://docs.aws.amazon.com/connect/latest/adminguide/connect-lambda-functions.html).
   */
  def LambdaFunctionAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.LambdaFunctionAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.connect.LambdaFunctionAssociationArgs.builder
    com.pulumi.aws.connect.LambdaFunctionAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect Phone Number resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def PhoneNumber(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.PhoneNumberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.PhoneNumberArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.connect.PhoneNumber(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Associates a flow with a phone number claimed to an Amazon Connect instance. */
  def PhoneNumberContactFlowAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.PhoneNumberContactFlowAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.connect.PhoneNumberContactFlowAssociationArgs.builder
    com.pulumi.aws.connect.PhoneNumberContactFlowAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect Queue resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.QueueArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.QueueArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.connect.Queue(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect Quick Connect resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def QuickConnect(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.QuickConnectArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.QuickConnectArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.connect.QuickConnect(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect Routing Profile resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html).
   */
  def RoutingProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.RoutingProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.RoutingProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.connect.RoutingProfile(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect Security Profile resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def SecurityProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.SecurityProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.SecurityProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.connect.SecurityProfile(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect User resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.UserArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.UserArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.connect.User(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect User Hierarchy Group resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   * 
   * &gt; **NOTE:** The User Hierarchy Structure must be created before creating a User Hierarchy Group.
   */
  def UserHierarchyGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.UserHierarchyGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.UserHierarchyGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.connect.UserHierarchyGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect User Hierarchy Structure resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def UserHierarchyStructure(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.UserHierarchyStructureArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.connect.UserHierarchyStructureArgs.builder
    com.pulumi.aws.connect.UserHierarchyStructure(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Connect Vocabulary resource. For more information see
   * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
   */
  def Vocabulary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.connect.VocabularyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.connect.VocabularyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.connect.Vocabulary(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
