package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object lex:
  /**
   * Provides an Amazon Lex Bot resource. For more information see
   * [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)
   */
  inline def Bot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.BotArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.BotArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lex.Bot(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Lex Bot Alias resource. For more information see
   * [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)
   */
  inline def BotAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.BotAliasArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.BotAliasArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lex.BotAlias(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Amazon Lex Intent resource. For more information see
   * [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)
   */
  inline def Intent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.IntentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.IntentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lex.Intent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object LexFunctions:
    /** Provides details about a specific Amazon Lex Bot. */
    inline def getBot(args: Endofunction[com.pulumi.aws.lex.inputs.GetBotArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lex.outputs.GetBotResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetBotArgs.builder
      com.pulumi.aws.lex.LexFunctions.getBot(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Lex Bot. */
    inline def getBotPlain(args: Endofunction[com.pulumi.aws.lex.inputs.GetBotPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lex.outputs.GetBotResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetBotPlainArgs.builder
      com.pulumi.aws.lex.LexFunctions.getBotPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Lex Bot Alias. */
    inline def getBotAlias(args: Endofunction[com.pulumi.aws.lex.inputs.GetBotAliasArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lex.outputs.GetBotAliasResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetBotAliasArgs.builder
      com.pulumi.aws.lex.LexFunctions.getBotAlias(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Lex Bot Alias. */
    inline def getBotAliasPlain(args: Endofunction[com.pulumi.aws.lex.inputs.GetBotAliasPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lex.outputs.GetBotAliasResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetBotAliasPlainArgs.builder
      com.pulumi.aws.lex.LexFunctions.getBotAliasPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Lex Intent. */
    inline def getIntent(args: Endofunction[com.pulumi.aws.lex.inputs.GetIntentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lex.outputs.GetIntentResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetIntentArgs.builder
      com.pulumi.aws.lex.LexFunctions.getIntent(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Lex Intent. */
    inline def getIntentPlain(args: Endofunction[com.pulumi.aws.lex.inputs.GetIntentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lex.outputs.GetIntentResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetIntentPlainArgs.builder
      com.pulumi.aws.lex.LexFunctions.getIntentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific Amazon Lex Slot Type. */
    inline def getSlotType(args: Endofunction[com.pulumi.aws.lex.inputs.GetSlotTypeArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lex.outputs.GetSlotTypeResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetSlotTypeArgs.builder
      com.pulumi.aws.lex.LexFunctions.getSlotType(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific Amazon Lex Slot Type. */
    inline def getSlotTypePlain(args: Endofunction[com.pulumi.aws.lex.inputs.GetSlotTypePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lex.outputs.GetSlotTypeResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetSlotTypePlainArgs.builder
      com.pulumi.aws.lex.LexFunctions.getSlotTypePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Provides an Amazon Lex Slot Type resource. For more information see
   * [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)
   */
  inline def SlotType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.SlotTypeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.SlotTypeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lex.SlotType(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Lex V2 Models Bot. */
  inline def V2modelsBot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.V2modelsBotArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.V2modelsBotArgs.builder
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
    com.pulumi.aws.lex.V2modelsBot(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Lex V2 Models Bot Locale. */
  inline def V2modelsBotLocale(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.V2modelsBotLocaleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.V2modelsBotLocaleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lex.V2modelsBotLocale(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Lex V2 Models Bot Version. */
  inline def V2modelsBotVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.V2modelsBotVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lex.V2modelsBotVersionArgs.builder
    com.pulumi.aws.lex.V2modelsBotVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Lex V2 Models Intent. */
  inline def V2modelsIntent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.V2modelsIntentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.V2modelsIntentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lex.V2modelsIntent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Lex V2 Models Slot. */
  inline def V2modelsSlot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.V2modelsSlotArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.V2modelsSlotArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lex.V2modelsSlot(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Lex V2 Models Slot Type. */
  inline def V2modelsSlotType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.V2modelsSlotTypeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.V2modelsSlotTypeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lex.V2modelsSlotType(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
