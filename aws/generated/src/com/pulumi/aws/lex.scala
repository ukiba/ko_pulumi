package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object lex:
  /**
   * Provides an Amazon Lex Slot Type resource. For more information see
   *  [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)
   */
  def SlotType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.SlotTypeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.SlotTypeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.lex.SlotType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lex.V2modelsSlotTypeArgs.Builder)
    /**
     * @param compositeSlotTypeSettings Specifications for a composite slot type.
     *  See `compositeSlotTypeSetting` argument reference below.
     * @return builder
     */
    def compositeSlotTypeSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingArgs.Builder]*):
        com.pulumi.aws.lex.V2modelsSlotTypeArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingArgs.builder
      builder.compositeSlotTypeSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param externalSourceSettings Type of external information used to create the slot type.
     *  See `externalSourceSetting` argument reference below.
     * @return builder
     */
    def externalSourceSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingArgs.Builder]*):
        com.pulumi.aws.lex.V2modelsSlotTypeArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingArgs.builder
      builder.externalSourceSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param slotTypeValues List of SlotTypeValue objects that defines the values that the slot type can take.
     *  Each value can have a list of synonyms, additional values that help train the machine learning model about the values that it resolves for a slot.
     *  See `slotTypeValues` argument reference below.
     * @return builder
     */
    def slotTypeValues(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueArgs.Builder]*):
        com.pulumi.aws.lex.V2modelsSlotTypeArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueArgs.builder
      builder.slotTypeValues(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeTimeoutsArgs.Builder]):
        com.pulumi.aws.lex.V2modelsSlotTypeArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param valueSelectionSetting Determines the strategy that Amazon Lex uses to select a value from the list of possible values.
     *  See `valueSelectionSetting` argument reference below.
     * @return builder
     */
    def valueSelectionSetting(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingArgs.Builder]):
        com.pulumi.aws.lex.V2modelsSlotTypeArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingArgs.builder
      builder.valueSelectionSetting(args(argsBuilder).build)

  type LexFunctions = com.pulumi.aws.lex.LexFunctions
  object LexFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.lex.LexFunctions.*
  extension (self: LexFunctions.type)
    /** Provides details about a specific Amazon Lex Bot. */
    def getBot(args: Endofunction[com.pulumi.aws.lex.inputs.GetBotArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lex.outputs.GetBotResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetBotArgs.builder
      com.pulumi.aws.lex.LexFunctions.getBot(args(argsBuilder).build)

    /** Provides details about a specific Amazon Lex Bot. */
    def getBotPlain(args: Endofunction[com.pulumi.aws.lex.inputs.GetBotPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lex.outputs.GetBotResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetBotPlainArgs.builder
      com.pulumi.aws.lex.LexFunctions.getBotPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Lex Bot Alias. */
    def getBotAlias(args: Endofunction[com.pulumi.aws.lex.inputs.GetBotAliasArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lex.outputs.GetBotAliasResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetBotAliasArgs.builder
      com.pulumi.aws.lex.LexFunctions.getBotAlias(args(argsBuilder).build)

    /** Provides details about a specific Amazon Lex Bot Alias. */
    def getBotAliasPlain(args: Endofunction[com.pulumi.aws.lex.inputs.GetBotAliasPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lex.outputs.GetBotAliasResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetBotAliasPlainArgs.builder
      com.pulumi.aws.lex.LexFunctions.getBotAliasPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Lex Intent. */
    def getIntent(args: Endofunction[com.pulumi.aws.lex.inputs.GetIntentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lex.outputs.GetIntentResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetIntentArgs.builder
      com.pulumi.aws.lex.LexFunctions.getIntent(args(argsBuilder).build)

    /** Provides details about a specific Amazon Lex Intent. */
    def getIntentPlain(args: Endofunction[com.pulumi.aws.lex.inputs.GetIntentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lex.outputs.GetIntentResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetIntentPlainArgs.builder
      com.pulumi.aws.lex.LexFunctions.getIntentPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Lex Slot Type. */
    def getSlotType(args: Endofunction[com.pulumi.aws.lex.inputs.GetSlotTypeArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lex.outputs.GetSlotTypeResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetSlotTypeArgs.builder
      com.pulumi.aws.lex.LexFunctions.getSlotType(args(argsBuilder).build)

    /** Provides details about a specific Amazon Lex Slot Type. */
    def getSlotTypePlain(args: Endofunction[com.pulumi.aws.lex.inputs.GetSlotTypePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lex.outputs.GetSlotTypeResult] =
      val argsBuilder = com.pulumi.aws.lex.inputs.GetSlotTypePlainArgs.builder
      com.pulumi.aws.lex.LexFunctions.getSlotTypePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.BotAliasArgs.Builder)
    /**
     * @param conversationLogs The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
     * @return builder
     */
    def conversationLogs(args: Endofunction[com.pulumi.aws.lex.inputs.BotAliasConversationLogsArgs.Builder]):
        com.pulumi.aws.lex.BotAliasArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.BotAliasConversationLogsArgs.builder
      builder.conversationLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.IntentArgs.Builder)
    /**
     * @param conclusionStatement The statement that you want Amazon Lex to convey to the user
     *  after the intent is successfully fulfilled by the Lambda function. This element is relevant only if
     *  you provide a Lambda function in the `fulfillmentActivity`. If you return the intent to the client
     *  application, you can&#39;t specify this element. The `followUpPrompt` and `conclusionStatement` are
     *  mutually exclusive. You can specify only one. Attributes are documented under statement.
     * @return builder
     */
    def conclusionStatement(args: Endofunction[com.pulumi.aws.lex.inputs.IntentConclusionStatementArgs.Builder]):
        com.pulumi.aws.lex.IntentArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentConclusionStatementArgs.builder
      builder.conclusionStatement(args(argsBuilder).build)

    /**
     * @param confirmationPrompt Prompts the user to confirm the intent. This question should
     *  have a yes or no answer. You you must provide both the `rejectionStatement` and `confirmationPrompt`,
     *  or neither. Attributes are documented under prompt.
     * @return builder
     */
    def confirmationPrompt(args: Endofunction[com.pulumi.aws.lex.inputs.IntentConfirmationPromptArgs.Builder]):
        com.pulumi.aws.lex.IntentArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentConfirmationPromptArgs.builder
      builder.confirmationPrompt(args(argsBuilder).build)

    /**
     * @param dialogCodeHook Specifies a Lambda function to invoke for each user input. You can
     *  invoke this Lambda function to personalize user interaction. Attributes are documented under code_hook.
     * @return builder
     */
    def dialogCodeHook(args: Endofunction[com.pulumi.aws.lex.inputs.IntentDialogCodeHookArgs.Builder]):
        com.pulumi.aws.lex.IntentArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentDialogCodeHookArgs.builder
      builder.dialogCodeHook(args(argsBuilder).build)

    /**
     * @param followUpPrompt Amazon Lex uses this prompt to solicit additional activity after
     *  fulfilling an intent. For example, after the OrderPizza intent is fulfilled, you might prompt the
     *  user to order a drink. The `followUpPrompt` field and the `conclusionStatement` field are mutually
     *  exclusive. You can specify only one. Attributes are documented under follow_up_prompt.
     * @return builder
     */
    def followUpPrompt(args: Endofunction[com.pulumi.aws.lex.inputs.IntentFollowUpPromptArgs.Builder]):
        com.pulumi.aws.lex.IntentArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentFollowUpPromptArgs.builder
      builder.followUpPrompt(args(argsBuilder).build)

    /**
     * @param fulfillmentActivity Describes how the intent is fulfilled. For example, after a
     *  user provides all of the information for a pizza order, `fulfillmentActivity` defines how the bot
     *  places an order with a local pizza store. Attributes are documented under fulfillment_activity.
     * @return builder
     */
    def fulfillmentActivity(args: Endofunction[com.pulumi.aws.lex.inputs.IntentFulfillmentActivityArgs.Builder]):
        com.pulumi.aws.lex.IntentArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentFulfillmentActivityArgs.builder
      builder.fulfillmentActivity(args(argsBuilder).build)

    /**
     * @param rejectionStatement When the user answers &#34;no&#34; to the question defined in
     *  `confirmationPrompt`, Amazon Lex responds with this statement to acknowledge that the intent was
     *  canceled. You must provide both the `rejectionStatement` and the `confirmationPrompt`, or neither.
     *  Attributes are documented under statement.
     * @return builder
     */
    def rejectionStatement(args: Endofunction[com.pulumi.aws.lex.inputs.IntentRejectionStatementArgs.Builder]):
        com.pulumi.aws.lex.IntentArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentRejectionStatementArgs.builder
      builder.rejectionStatement(args(argsBuilder).build)

    /**
     * @param slots An list of intent slots. At runtime, Amazon Lex elicits required slot values
     *  from the user using prompts defined in the slots. Attributes are documented under slot.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.IntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.IntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.IntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  /**
   * Provides an Amazon Lex Bot Alias resource. For more information see
   *  [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)
   */
  def BotAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.BotAliasArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.BotAliasArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.lex.BotAlias(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Lex V2 Models Bot Version. */
  def V2modelsBotVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.V2modelsBotVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lex.V2modelsBotVersionArgs.builder
    
    com.pulumi.aws.lex.V2modelsBotVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lex.V2modelsSlotArgs.Builder)
    /**
     * @param multipleValuesSettings Whether the slot returns multiple values in one response.
     *  See the `multipleValuesSetting` argument reference below.
     * @return builder
     */
    def multipleValuesSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotMultipleValuesSettingArgs.Builder]*):
        com.pulumi.aws.lex.V2modelsSlotArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotMultipleValuesSettingArgs.builder
      builder.multipleValuesSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param obfuscationSettings Determines how slot values are used in Amazon CloudWatch logs.
     *  See the `obfuscationSetting` argument reference below.
     * @return builder
     */
    def obfuscationSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotObfuscationSettingArgs.Builder]*):
        com.pulumi.aws.lex.V2modelsSlotArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotObfuscationSettingArgs.builder
      builder.obfuscationSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param subSlotSettings Specifications for the constituent sub slots and the expression for the composite slot.
     *  See the `subSlotSetting` argument reference below.
     * @return builder
     */
    def subSlotSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingArgs.Builder]*):
        com.pulumi.aws.lex.V2modelsSlotArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingArgs.builder
      builder.subSlotSettings(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTimeoutsArgs.Builder]):
        com.pulumi.aws.lex.V2modelsSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    def valueElicitationSetting(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.Builder]):
        com.pulumi.aws.lex.V2modelsSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.builder
      builder.valueElicitationSetting(args(argsBuilder).build)

  /** Resource for managing an AWS Lex V2 Models Bot. */
  def V2modelsBot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.V2modelsBotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.V2modelsBotArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lex.V2modelsBot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * ## Import
   *  
   *  Using `pulumi import`, import Lex V2 Models Intent using the `intent_id:bot_id:bot_version:locale_id`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:lex/v2modelsIntent:V2modelsIntent example intent-42874:bot-11376:DRAFT:en_US
   *  ```
   */
  def V2modelsIntent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.V2modelsIntentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.V2modelsIntentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.lex.V2modelsIntent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Lex V2 Models Bot Locale. */
  def V2modelsBotLocale(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.V2modelsBotLocaleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.V2modelsBotLocaleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.lex.V2modelsBotLocale(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Lex V2 Models Slot Type. */
  def V2modelsSlotType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.V2modelsSlotTypeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.V2modelsSlotTypeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.lex.V2modelsSlotType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lex.V2modelsBotLocaleArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsBotLocaleTimeoutsArgs.Builder]):
        com.pulumi.aws.lex.V2modelsBotLocaleArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsBotLocaleTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param voiceSettings Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. See `voiceSettings`.
     * @return builder
     */
    def voiceSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsBotLocaleVoiceSettingsArgs.Builder]):
        com.pulumi.aws.lex.V2modelsBotLocaleArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsBotLocaleVoiceSettingsArgs.builder
      builder.voiceSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.V2modelsBotArgs.Builder)
    /**
     * @param dataPrivacies Provides information on additional privacy protections Amazon Lex should use with the bot&#39;s data. See `dataPrivacy`
     * @return builder
     */
    def dataPrivacies(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsBotDataPrivacyArgs.Builder]*):
        com.pulumi.aws.lex.V2modelsBotArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsBotDataPrivacyArgs.builder
      builder.dataPrivacies(args.map(_(argsBuilder).build)*)

    /**
     * @param members List of bot members in a network to be created. See `botMembers`.
     * @return builder
     */
    def members(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsBotMemberArgs.Builder]*):
        com.pulumi.aws.lex.V2modelsBotArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsBotMemberArgs.builder
      builder.members(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsBotTimeoutsArgs.Builder]):
        com.pulumi.aws.lex.V2modelsBotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsBotTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Provides an Amazon Lex Bot resource. For more information see
   *  [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)
   */
  def Bot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.BotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.BotArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.lex.Bot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lex.SlotTypeArgs.Builder)
    /**
     * @param enumerationValues A list of EnumerationValue objects that defines the values that
     *  the slot type can take. Each value can have a list of synonyms, which are additional values that help
     *  train the machine learning model about the values that it resolves for a slot. Attributes are
     *  documented under enumeration_value.
     * @return builder
     */
    def enumerationValues(args: Endofunction[com.pulumi.aws.lex.inputs.SlotTypeEnumerationValueArgs.Builder]*):
        com.pulumi.aws.lex.SlotTypeArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.SlotTypeEnumerationValueArgs.builder
      builder.enumerationValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.V2modelsBotVersionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsBotVersionTimeoutsArgs.Builder]):
        com.pulumi.aws.lex.V2modelsBotVersionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsBotVersionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * ## Import
   *  
   *  Using `pulumi import`, import Lex V2 Models Slot using the `id`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:lex/v2modelsSlot:V2modelsSlot example bot-1234,1,intent-5678,en-US,slot-9012
   *  ```
   */
  def V2modelsSlot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.V2modelsSlotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.V2modelsSlotArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.lex.V2modelsSlot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lex.BotArgs.Builder)
    /**
     * @param abortStatement The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
     * @return builder
     */
    def abortStatement(args: Endofunction[com.pulumi.aws.lex.inputs.BotAbortStatementArgs.Builder]):
        com.pulumi.aws.lex.BotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.BotAbortStatementArgs.builder
      builder.abortStatement(args(argsBuilder).build)

    /**
     * @param clarificationPrompt The message that Amazon Lex uses when it doesn&#39;t understand the user&#39;s request. Attributes are documented under prompt.
     * @return builder
     */
    def clarificationPrompt(args: Endofunction[com.pulumi.aws.lex.inputs.BotClarificationPromptArgs.Builder]):
        com.pulumi.aws.lex.BotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.BotClarificationPromptArgs.builder
      builder.clarificationPrompt(args(argsBuilder).build)

    /**
     * @param intents A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 250 Intent objects.
     * @return builder
     */
    def intents(args: Endofunction[com.pulumi.aws.lex.inputs.BotIntentArgs.Builder]*):
        com.pulumi.aws.lex.BotArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.BotIntentArgs.builder
      builder.intents(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.V2modelsIntentArgs.Builder)
    /**
     * @param closingSetting Configuration block for the response that Amazon Lex sends to the user when the intent is closed. See `closingSetting`.
     * @return builder
     */
    def closingSetting(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingArgs.Builder]):
        com.pulumi.aws.lex.V2modelsIntentArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingArgs.builder
      builder.closingSetting(args(argsBuilder).build)

    def confirmationSetting(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder]):
        com.pulumi.aws.lex.V2modelsIntentArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.builder
      builder.confirmationSetting(args(argsBuilder).build)

    /**
     * @param dialogCodeHook Configuration block for invoking the alias Lambda function for each user input. You can invoke this Lambda function to personalize user interaction. See `dialogCodeHook`.
     * @return builder
     */
    def dialogCodeHook(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentDialogCodeHookArgs.Builder]):
        com.pulumi.aws.lex.V2modelsIntentArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentDialogCodeHookArgs.builder
      builder.dialogCodeHook(args(argsBuilder).build)

    /**
     * @param fulfillmentCodeHook Configuration block for invoking the alias Lambda function when the intent is ready for fulfillment. You can invoke this function to complete the bot&#39;s transaction with the user. See `fulfillmentCodeHook`.
     * @return builder
     */
    def fulfillmentCodeHook(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookArgs.Builder]):
        com.pulumi.aws.lex.V2modelsIntentArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookArgs.builder
      builder.fulfillmentCodeHook(args(argsBuilder).build)

    /**
     * @param initialResponseSetting Configuration block for the response that is sent to the user at the beginning of a conversation, before eliciting slot values. See `initialResponseSetting`.
     * @return builder
     */
    def initialResponseSetting(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingArgs.Builder]):
        com.pulumi.aws.lex.V2modelsIntentArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingArgs.builder
      builder.initialResponseSetting(args(argsBuilder).build)

    /**
     * @param inputContexts Configuration blocks for contexts that must be active for this intent to be considered by Amazon Lex. When an intent has an input context list, Amazon Lex only considers using the intent in an interaction with the user when the specified contexts are included in the active context list for the session. If the contexts are not active, then Amazon Lex will not use the intent. A context can be automatically activated using the outputContexts property or it can be set at runtime. See `inputContext`.
     * @return builder
     */
    def inputContexts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInputContextArgs.Builder]*):
        com.pulumi.aws.lex.V2modelsIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInputContextArgs.builder
      builder.inputContexts(args.map(_(argsBuilder).build)*)

    /**
     * @param kendraConfiguration Configuration block for information required to use the AMAZON.KendraSearchIntent intent to connect to an Amazon Kendra index. The AMAZON.KendraSearchIntent intent is called when Amazon Lex can&#39;t determine another intent to invoke. See `kendraConfiguration`.
     * @return builder
     */
    def kendraConfiguration(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentKendraConfigurationArgs.Builder]):
        com.pulumi.aws.lex.V2modelsIntentArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentKendraConfigurationArgs.builder
      builder.kendraConfiguration(args(argsBuilder).build)

    /**
     * @param outputContexts Configuration blocks for contexts that the intent activates when it is fulfilled. You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of the conversation with a customer. When you use the outputContextsList property, all of the contexts specified in the list are activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number of conversation turns that the context should be active, or the length of time that the context should be active. See `outputContext`.
     * @return builder
     */
    def outputContexts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentOutputContextArgs.Builder]*):
        com.pulumi.aws.lex.V2modelsIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentOutputContextArgs.builder
      builder.outputContexts(args.map(_(argsBuilder).build)*)

    /**
     * @param sampleUtterances Configuration block for strings that a user might say to signal the intent. See `sampleUtterance`.
     * @return builder
     */
    def sampleUtterances(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentSampleUtteranceArgs.Builder]*):
        com.pulumi.aws.lex.V2modelsIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentSampleUtteranceArgs.builder
      builder.sampleUtterances(args.map(_(argsBuilder).build)*)

    /**
     * @param slotPriorities Configuration block for a new list of slots and their priorities that are contained by the intent. This is ignored on create and only valid for updates. See `slotPriority`.
     * @return builder
     */
    def slotPriorities(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentSlotPriorityArgs.Builder]*):
        com.pulumi.aws.lex.V2modelsIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentSlotPriorityArgs.builder
      builder.slotPriorities(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentTimeoutsArgs.Builder]):
        com.pulumi.aws.lex.V2modelsIntentArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Provides an Amazon Lex Intent resource. For more information see
   *  [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)
   */
  def Intent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lex.IntentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lex.IntentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.lex.Intent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.IntentFollowUpPromptRejectionStatementArgs.Builder)
    def messages(args: Endofunction[com.pulumi.aws.lex.inputs.IntentFollowUpPromptRejectionStatementMessageArgs.Builder]*):
        com.pulumi.aws.lex.inputs.IntentFollowUpPromptRejectionStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.IntentFollowUpPromptRejectionStatementMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationArgs.Builder)
    /**
     * @param startResponse Configuration block for the message sent to users when the fulfillment Lambda functions starts running.
     * @return builder
     */
    def startResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseArgs.builder
      builder.startResponse(args(argsBuilder).build)

    /**
     * @param updateResponse Configuration block for messages sent periodically to the user while the fulfillment Lambda function is running.
     * @return builder
     */
    def updateResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseArgs.builder
      builder.updateResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingArgs.Builder)
    /**
     * @param subSlots Sub slots in the composite slot.
     *  See `subSlots` argument reference below.
     * @return builder
     */
    def subSlots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingSubSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingSubSlotArgs.builder
      builder.subSlots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.IntentSlotValueElicitationPromptArgs.Builder)
    def messages(args: Endofunction[com.pulumi.aws.lex.inputs.IntentSlotValueElicitationPromptMessageArgs.Builder]*):
        com.pulumi.aws.lex.inputs.IntentSlotValueElicitationPromptArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.IntentSlotValueElicitationPromptMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder)
    /**
     * @param audioSpecification Configuration block for the settings on audio input. See `audioSpecification`.
     * @return builder
     */
    def audioSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationAudioSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationAudioSpecificationArgs.builder
      builder.audioSpecification(args(argsBuilder).build)

    /**
     * @param dtmfSpecification Configuration block for the settings on DTMF input. See `dtmfSpecification`.
     * @return builder
     */
    def dtmfSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationDtmfSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationDtmfSpecificationArgs.builder
      builder.dtmfSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingDefaultValueSpecificationArgs.Builder)
    /**
     * @param defaultValueLists List of default values.
     *  Amazon Lex chooses the default value to use in the order that they are presented in the list.
     *  See the `defaultValueList` argument reference below.
     * @return builder
     */
    def defaultValueLists(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingDefaultValueSpecificationDefaultValueListArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingDefaultValueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingDefaultValueSpecificationDefaultValueListArgs.builder
      builder.defaultValueLists(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     *  When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.IntentFulfillmentActivityArgs.Builder)
    /**
     * @param codeHook A description of the Lambda function that is run to fulfill the intent.
     *  Required if type is CodeHook. Attributes are documented under code_hook.
     * @return builder
     */
    def codeHook(args: Endofunction[com.pulumi.aws.lex.inputs.IntentFulfillmentActivityCodeHookArgs.Builder]):
        com.pulumi.aws.lex.inputs.IntentFulfillmentActivityArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentFulfillmentActivityCodeHookArgs.builder
      builder.codeHook(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseArgs.Builder)
    /**
     * @param messageGroups Between 1-5 configuration block message groups that contain start messages. Amazon Lex chooses one of the messages to play to the user. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.IntentSlotArgs.Builder)
    /**
     * @param valueElicitationPrompt The prompt that Amazon Lex uses to elicit the slot value
     *  from the user. Attributes are documented under prompt.
     * @return builder
     */
    def valueElicitationPrompt(args: Endofunction[com.pulumi.aws.lex.inputs.IntentSlotValueElicitationPromptArgs.Builder]):
        com.pulumi.aws.lex.inputs.IntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentSlotValueElicitationPromptArgs.builder
      builder.valueElicitationPrompt(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookArgs.Builder)
    /**
     * @param postCodeHookSpecification Configuration block that contains the responses and actions that Amazon Lex takes after the Lambda function is complete. See `postCodeHookSpecification`.
     * @return builder
     */
    def postCodeHookSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationArgs.builder
      builder.postCodeHookSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationArgs.Builder)
    /**
     * @param messageGroups Configuration block for messages that Amazon Lex can send to the user. Amazon Lex chooses the actual message to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param promptAttemptsSpecifications Configuration block for advanced settings on each attempt of the prompt. See `promptAttemptsSpecification`.
     * @return builder
     */
    def promptAttemptsSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationArgs.builder
      builder.promptAttemptsSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     *  When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.Builder)
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationArgs.Builder)
    /**
     * @param continueResponses Response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     *  See the `continueResponse` argument reference below.
     * @return builder
     */
    def continueResponses(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.builder
      builder.continueResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param stillWaitingResponses Response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input from the user.
     *  See the `stillWaitingResponse` argument reference below.
     * @return builder
     */
    def stillWaitingResponses(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.builder
      builder.stillWaitingResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param waitingResponses Response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     *  See the `waitingResponse` argument reference below.
     * @return builder
     */
    def waitingResponses(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.builder
      builder.waitingResponses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsBotState.Builder)
    /**
     * @param dataPrivacies Provides information on additional privacy protections Amazon Lex should use with the bot&#39;s data. See `dataPrivacy`
     * @return builder
     */
    def dataPrivacies(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsBotDataPrivacyArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsBotState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsBotDataPrivacyArgs.builder
      builder.dataPrivacies(args.map(_(argsBuilder).build)*)

    /**
     * @param members List of bot members in a network to be created. See `botMembers`.
     * @return builder
     */
    def members(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsBotMemberArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsBotState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsBotMemberArgs.builder
      builder.members(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsBotTimeoutsArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsBotState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsBotTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationArgs.Builder)
    /**
     * @param valueElicitationSettings Elicitation setting details for constituent sub slots of a composite slot.
     *  See the `valueElicitationSetting` argument reference below.
     * @return builder
     */
    def valueElicitationSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingArgs.builder
      builder.valueElicitationSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     *  When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.Builder)
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.BotAbortStatementArgs.Builder)
    def messages(args: Endofunction[com.pulumi.aws.lex.inputs.BotAbortStatementMessageArgs.Builder]*):
        com.pulumi.aws.lex.inputs.BotAbortStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.BotAbortStatementMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationArgs.Builder)
    /**
     * @param failureConditional Configuration block for conditional branches to evaluate after the dialog code hook throws an exception or returns with the State field of the Intent object set to Failed. See `failureConditional`.
     * @return builder
     */
    def failureConditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalArgs.builder
      builder.failureConditional(args(argsBuilder).build)

    /**
     * @param failureNextStep Configuration block for the next step the bot runs after the dialog code hook throws an exception or returns with the State field of the Intent object set to Failed. See `failureNextStep`.
     * @return builder
     */
    def failureNextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepArgs.builder
      builder.failureNextStep(args(argsBuilder).build)

    /**
     * @param failureResponse Configuration block for message groups that Amazon Lex uses to respond the user input. See `failureResponse`.
     * @return builder
     */
    def failureResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseArgs.builder
      builder.failureResponse(args(argsBuilder).build)

    /**
     * @param successConditional Configuration block for conditional branches to evaluate after the dialog code hook finishes successfully. See `successConditional`.
     * @return builder
     */
    def successConditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalArgs.builder
      builder.successConditional(args(argsBuilder).build)

    /**
     * @param successNextStep Configuration block for the next step the bot runs after the dialog code hook finishes successfully. See `successNextStep`.
     * @return builder
     */
    def successNextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepArgs.builder
      builder.successNextStep(args(argsBuilder).build)

    /**
     * @param successResponse Configuration block for message groups that Amazon Lex uses to respond the user input. See `successResponse`.
     * @return builder
     */
    def successResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseArgs.builder
      builder.successResponse(args(argsBuilder).build)

    /**
     * @param timeoutConditional Configuration block for conditional branches to evaluate if the code hook times out. See `timeoutConditional`.
     * @return builder
     */
    def timeoutConditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalArgs.builder
      builder.timeoutConditional(args(argsBuilder).build)

    /**
     * @param timeoutNextStep Configuration block for the next step that the bot runs when the code hook times out. See `timeoutNextStep`.
     * @return builder
     */
    def timeoutNextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepArgs.builder
      builder.timeoutNextStep(args(argsBuilder).build)

    /**
     * @param timeoutResponse Configuration block for a list of message groups that Amazon Lex uses to respond the user input. See `timeoutResponse`.
     * @return builder
     */
    def timeoutResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseArgs.builder
      builder.timeoutResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder)
    def allowedInputTypes(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAllowedInputTypesArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAllowedInputTypesArgs.builder
      builder.allowedInputTypes(args(argsBuilder).build)

    def audioAndDtmfInputSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.builder
      builder.audioAndDtmfInputSpecification(args(argsBuilder).build)

    def textInputSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationTextInputSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationTextInputSpecificationArgs.builder
      builder.textInputSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     *  When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsBotLocaleState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsBotLocaleTimeoutsArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsBotLocaleState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsBotLocaleTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param voiceSettings Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. See `voiceSettings`.
     * @return builder
     */
    def voiceSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsBotLocaleVoiceSettingsArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsBotLocaleState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsBotLocaleVoiceSettingsArgs.builder
      builder.voiceSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookArgs.Builder)
    /**
     * @param fulfillmentUpdatesSpecification Configuration block for settings for update messages sent to the user for long-running Lambda fulfillment functions. Fulfillment updates can be used only with streaming conversations. See `fulfillmentUpdatesSpecification`.
     * @return builder
     */
    def fulfillmentUpdatesSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationArgs.builder
      builder.fulfillmentUpdatesSpecification(args(argsBuilder).build)

    /**
     * @param postFulfillmentStatusSpecification Configuration block for settings for messages sent to the user for after the Lambda fulfillment function completes. Post-fulfillment messages can be sent for both streaming and non-streaming conversations. See `postFulfillmentStatusSpecification`.
     * @return builder
     */
    def postFulfillmentStatusSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationArgs.builder
      builder.postFulfillmentStatusSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsBotVersionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsBotVersionTimeoutsArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsBotVersionState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsBotVersionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     *  When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingArgs.Builder)
    /**
     * @param slotSpecifications Specifications for the constituent sub slots of a composite slot.
     *  See the `slotSpecification` argument reference below.
     * @return builder
     */
    def slotSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationArgs.builder
      builder.slotSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseArgs.Builder)
    /**
     * @param messageGroups Between 1-5 configuration block message groups that contain start messages. Amazon Lex chooses one of the messages to play to the user. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingGrammarSlotTypeSettingArgs.Builder)
    /**
     * @param sources Source of the grammar used to create the slot type.
     *  See `source` argument reference below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingGrammarSlotTypeSettingSourceArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingGrammarSlotTypeSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingGrammarSlotTypeSettingSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationArgs.Builder)
    /**
     * @param continueResponses Response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     *  See the `continueResponse` argument reference below.
     * @return builder
     */
    def continueResponses(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.builder
      builder.continueResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param stillWaitingResponses Response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input from the user.
     *  See the `stillWaitingResponse` argument reference below.
     * @return builder
     */
    def stillWaitingResponses(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.builder
      builder.stillWaitingResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param waitingResponses Response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     *  See the `waitingResponse` argument reference below.
     * @return builder
     */
    def waitingResponses(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.builder
      builder.waitingResponses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingArgs.Builder)
    /**
     * @param codeHook Configuration block for the dialog code hook that is called by Amazon Lex at a step of the conversation. See `codeHook`.
     * @return builder
     */
    def codeHook(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookArgs.builder
      builder.codeHook(args(argsBuilder).build)

    /**
     * @param conditional Configuration block for conditional branches. Branches are evaluated in the order that they are entered in the list. The first branch with a condition that evaluates to true is executed. The last branch in the list is the default branch. The default branch should not have any condition expression. The default branch is executed if no other branch has a matching condition. See `conditional`.
     * @return builder
     */
    def conditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalArgs.builder
      builder.conditional(args(argsBuilder).build)

    /**
     * @param initialResponse Configuration block for message groups that Amazon Lex uses to respond the user input. See `initialResponse`.
     * @return builder
     */
    def initialResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseArgs.builder
      builder.initialResponse(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user.
     *  Amazon Lex chooses the actual response to send at runtime.
     *  See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.SlotTypeState.Builder)
    /**
     * @param enumerationValues A list of EnumerationValue objects that defines the values that
     *  the slot type can take. Each value can have a list of synonyms, which are additional values that help
     *  train the machine learning model about the values that it resolves for a slot. Attributes are
     *  documented under enumeration_value.
     * @return builder
     */
    def enumerationValues(args: Endofunction[com.pulumi.aws.lex.inputs.SlotTypeEnumerationValueArgs.Builder]*):
        com.pulumi.aws.lex.inputs.SlotTypeState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.SlotTypeEnumerationValueArgs.builder
      builder.enumerationValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     *  When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.BotState.Builder)
    /**
     * @param abortStatement The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
     * @return builder
     */
    def abortStatement(args: Endofunction[com.pulumi.aws.lex.inputs.BotAbortStatementArgs.Builder]):
        com.pulumi.aws.lex.inputs.BotState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.BotAbortStatementArgs.builder
      builder.abortStatement(args(argsBuilder).build)

    /**
     * @param clarificationPrompt The message that Amazon Lex uses when it doesn&#39;t understand the user&#39;s request. Attributes are documented under prompt.
     * @return builder
     */
    def clarificationPrompt(args: Endofunction[com.pulumi.aws.lex.inputs.BotClarificationPromptArgs.Builder]):
        com.pulumi.aws.lex.inputs.BotState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.BotClarificationPromptArgs.builder
      builder.clarificationPrompt(args(argsBuilder).build)

    /**
     * @param intents A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 250 Intent objects.
     * @return builder
     */
    def intents(args: Endofunction[com.pulumi.aws.lex.inputs.BotIntentArgs.Builder]*):
        com.pulumi.aws.lex.inputs.BotState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.BotIntentArgs.builder
      builder.intents(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.BotAliasState.Builder)
    /**
     * @param conversationLogs The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
     * @return builder
     */
    def conversationLogs(args: Endofunction[com.pulumi.aws.lex.inputs.BotAliasConversationLogsArgs.Builder]):
        com.pulumi.aws.lex.inputs.BotAliasState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.BotAliasConversationLogsArgs.builder
      builder.conversationLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.IntentFollowUpPromptPromptArgs.Builder)
    /**
     * @param messages A set of messages, each of which provides a message string and its type.
     *  You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
     *  Attributes are documented under message. Must contain between 1 and 15 messages.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.aws.lex.inputs.IntentFollowUpPromptPromptMessageArgs.Builder]*):
        com.pulumi.aws.lex.inputs.IntentFollowUpPromptPromptArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.IntentFollowUpPromptPromptMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.IntentFollowUpPromptArgs.Builder)
    /**
     * @param prompt Prompts for information from the user. Attributes are documented under prompt.
     * @return builder
     */
    def prompt(args: Endofunction[com.pulumi.aws.lex.inputs.IntentFollowUpPromptPromptArgs.Builder]):
        com.pulumi.aws.lex.inputs.IntentFollowUpPromptArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentFollowUpPromptPromptArgs.builder
      builder.prompt(args(argsBuilder).build)

    /**
     * @param rejectionStatement If the user answers &#34;no&#34; to the question defined in the prompt field,
     *  Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
     *  documented below under statement.
     * @return builder
     */
    def rejectionStatement(args: Endofunction[com.pulumi.aws.lex.inputs.IntentFollowUpPromptRejectionStatementArgs.Builder]):
        com.pulumi.aws.lex.inputs.IntentFollowUpPromptArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentFollowUpPromptRejectionStatementArgs.builder
      builder.rejectionStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user.
     *  Amazon Lex chooses the actual response to send at runtime.
     *  See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder)
    /**
     * @param codeHook Configuration block for the intent&#39;s confirmation step. The dialog code hook is triggered based on these invocation settings when the confirmation next step or declination next step or failure next step is `invokeDialogCodeHook`.  See `codeHook`.
     * @return builder
     */
    def codeHook(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookArgs.builder
      builder.codeHook(args(argsBuilder).build)

    /**
     * @param confirmationConditional Configuration block for conditional branches to evaluate after the intent is closed. See `confirmationConditional`.
     * @return builder
     */
    def confirmationConditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalArgs.builder
      builder.confirmationConditional(args(argsBuilder).build)

    /**
     * @param confirmationNextStep Configuration block for the next step that the bot executes when the customer confirms the intent. See `confirmationNextStep`.
     * @return builder
     */
    def confirmationNextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationNextStepArgs.builder
      builder.confirmationNextStep(args(argsBuilder).build)

    /**
     * @param confirmationResponse Configuration block for message groups that Amazon Lex uses to respond the user input. See `confirmationResponse`.
     * @return builder
     */
    def confirmationResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseArgs.builder
      builder.confirmationResponse(args(argsBuilder).build)

    /**
     * @param declinationConditional Configuration block for conditional branches to evaluate after the intent is declined. See `declinationConditional`.
     * @return builder
     */
    def declinationConditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalArgs.builder
      builder.declinationConditional(args(argsBuilder).build)

    /**
     * @param declinationNextStep Configuration block for the next step that the bot executes when the customer declines the intent. See `declinationNextStep`.
     * @return builder
     */
    def declinationNextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepArgs.builder
      builder.declinationNextStep(args(argsBuilder).build)

    /**
     * @param declinationResponse Configuration block for when the user answers &#34;no&#34; to the question defined in `promptSpecification`, Amazon Lex responds with this response to acknowledge that the intent was canceled. See `declinationResponse`.
     * @return builder
     */
    def declinationResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseArgs.builder
      builder.declinationResponse(args(argsBuilder).build)

    /**
     * @param elicitationCodeHook Configuration block for when the code hook is invoked during confirmation prompt retries. See `elicitationCodeHook`.
     * @return builder
     */
    def elicitationCodeHook(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingElicitationCodeHookArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingElicitationCodeHookArgs.builder
      builder.elicitationCodeHook(args(argsBuilder).build)

    /**
     * @param failureConditional Configuration block for conditional branches. Branches are evaluated in the order that they are entered in the list. The first branch with a condition that evaluates to true is executed. The last branch in the list is the default branch. The default branch should not have any condition expression. The default branch is executed if no other branch has a matching condition. See `failureConditional`.
     * @return builder
     */
    def failureConditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalArgs.builder
      builder.failureConditional(args(argsBuilder).build)

    /**
     * @param failureNextStep Configuration block for the next step to take in the conversation if the confirmation step fails. See `failureNextStep`.
     * @return builder
     */
    def failureNextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureNextStepArgs.builder
      builder.failureNextStep(args(argsBuilder).build)

    /**
     * @param failureResponse Configuration block for message groups that Amazon Lex uses to respond the user input. See `failureResponse`.
     * @return builder
     */
    def failureResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseArgs.builder
      builder.failureResponse(args(argsBuilder).build)

    /**
     * @param promptSpecification Configuration block for prompting the user to confirm the intent. This question should have a yes or no answer. Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment. See `promptSpecification`.
     * @return builder
     */
    def promptSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationArgs.builder
      builder.promptSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationArgs.Builder)
    /**
     * @param failureConditional Configuration block for conditional branches to evaluate after the dialog code hook throws an exception or returns with the State field of the Intent object set to Failed.
     * @return builder
     */
    def failureConditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalArgs.builder
      builder.failureConditional(args(argsBuilder).build)

    /**
     * @param failureNextStep Configuration block for the next step the bot runs after the dialog code hook throws an exception or returns with the State field of the Intent object set to Failed . See `failureNextStep`.
     * @return builder
     */
    def failureNextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepArgs.builder
      builder.failureNextStep(args(argsBuilder).build)

    /**
     * @param failureResponse Configuration block for message groups that Amazon Lex uses to respond the user input. See `failureResponse`.
     * @return builder
     */
    def failureResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseArgs.builder
      builder.failureResponse(args(argsBuilder).build)

    /**
     * @param successConditional Configuration block for conditional branches to evaluate after the dialog code hook finishes successfully. See `successConditional`.
     * @return builder
     */
    def successConditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalArgs.builder
      builder.successConditional(args(argsBuilder).build)

    /**
     * @param successNextStep Configuration block for the next step the bot runs after the dialog code hook finishes successfully. See `successNextStep`.
     * @return builder
     */
    def successNextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepArgs.builder
      builder.successNextStep(args(argsBuilder).build)

    /**
     * @param successResponse Configuration block for message groups that Amazon Lex uses to respond the user input. See `successResponse`.
     * @return builder
     */
    def successResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseArgs.builder
      builder.successResponse(args(argsBuilder).build)

    /**
     * @param timeoutConditional Configuration block for conditional branches to evaluate if the code hook times out. See `timeoutConditional`.
     * @return builder
     */
    def timeoutConditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalArgs.builder
      builder.timeoutConditional(args(argsBuilder).build)

    /**
     * @param timeoutNextStep Configuration block for the next step that the bot runs when the code hook times out. See `timeoutNextStep`.
     * @return builder
     */
    def timeoutNextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepArgs.builder
      builder.timeoutNextStep(args(argsBuilder).build)

    /**
     * @param timeoutResponse Configuration block for a list of message groups that Amazon Lex uses to respond the user input. See `timeoutResponse`.
     * @return builder
     */
    def timeoutResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseArgs.builder
      builder.timeoutResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookArgs.Builder)
    /**
     * @param postCodeHookSpecification Configuration block that contains the responses and actions that Amazon Lex takes after the Lambda function is complete. See `postCodeHookSpecification`.
     * @return builder
     */
    def postCodeHookSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationArgs.builder
      builder.postCodeHookSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationArgs.Builder)
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

    def promptAttemptsSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.builder
      builder.promptAttemptsSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingArgs.Builder)
    /**
     * @param advancedRecognitionSettings Provides settings that enable advanced recognition settings for slot values.
     *  You can use this to enable using slot values as a custom vocabulary for recognizing user utterances.
     *  See `advancedRecognitionSetting` argument reference below.
     * @return builder
     */
    def advancedRecognitionSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingAdvancedRecognitionSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingAdvancedRecognitionSettingArgs.builder
      builder.advancedRecognitionSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param regexFilters Used to validate the value of the slot.
     *  See `regexFilter` argument reference below.
     * @return builder
     */
    def regexFilters(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingRegexFilterArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingRegexFilterArgs.builder
      builder.regexFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user.
     *  Amazon Lex chooses the actual response to send at runtime.
     *  See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingArgs.Builder)
    /**
     * @param closingResponse Configuration block for response that Amazon Lex sends to the user when the intent is complete. See `closingResponse`.
     * @return builder
     */
    def closingResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseArgs.builder
      builder.closingResponse(args(argsBuilder).build)

    /**
     * @param conditional Configuration block for list of conditional branches associated with the intent&#39;s closing response. These branches are executed when the `nextStep` attribute is set to `EvalutateConditional`. See `conditional`.
     * @return builder
     */
    def conditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalArgs.builder
      builder.conditional(args(argsBuilder).build)

    /**
     * @param nextStep Next step that the bot executes after playing the intent&#39;s closing response. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationArgs.Builder)
    /**
     * @param failureConditional Configuration block for conditional branches to evaluate after the dialog code hook throws an exception or returns with the State field of the Intent object set to Failed.
     * @return builder
     */
    def failureConditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalArgs.builder
      builder.failureConditional(args(argsBuilder).build)

    /**
     * @param failureNextStep Configuration block for the next step the bot runs after the dialog code hook throws an exception or returns with the State field of the Intent object set to Failed . See `failureNextStep`.
     * @return builder
     */
    def failureNextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepArgs.builder
      builder.failureNextStep(args(argsBuilder).build)

    /**
     * @param failureResponse Configuration block for message groups that Amazon Lex uses to respond the user input. See `failureResponse`.
     * @return builder
     */
    def failureResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseArgs.builder
      builder.failureResponse(args(argsBuilder).build)

    /**
     * @param successConditional Configuration block for conditional branches to evaluate after the dialog code hook finishes successfully. See `successConditional`.
     * @return builder
     */
    def successConditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalArgs.builder
      builder.successConditional(args(argsBuilder).build)

    /**
     * @param successNextStep Configuration block for the next step the bot runs after the dialog code hook finishes successfully. See `successNextStep`.
     * @return builder
     */
    def successNextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepArgs.builder
      builder.successNextStep(args(argsBuilder).build)

    /**
     * @param successResponse Configuration block for message groups that Amazon Lex uses to respond the user input. See `successResponse`.
     * @return builder
     */
    def successResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseArgs.builder
      builder.successResponse(args(argsBuilder).build)

    /**
     * @param timeoutConditional Configuration block for conditional branches to evaluate if the code hook times out. See `timeoutConditional`.
     * @return builder
     */
    def timeoutConditional(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalArgs.builder
      builder.timeoutConditional(args(argsBuilder).build)

    /**
     * @param timeoutNextStep Configuration block for the next step that the bot runs when the code hook times out. See `timeoutNextStep`.
     * @return builder
     */
    def timeoutNextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutNextStepArgs.builder
      builder.timeoutNextStep(args(argsBuilder).build)

    /**
     * @param timeoutResponse Configuration block for a list of message groups that Amazon Lex uses to respond the user input. See `timeoutResponse`.
     * @return builder
     */
    def timeoutResponse(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseArgs.builder
      builder.timeoutResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationStartResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.BotClarificationPromptArgs.Builder)
    def messages(args: Endofunction[com.pulumi.aws.lex.inputs.BotClarificationPromptMessageArgs.Builder]*):
        com.pulumi.aws.lex.inputs.BotClarificationPromptArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.BotClarificationPromptMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingDefaultValueSpecificationArgs.Builder)
    /**
     * @param defaultValueLists List of default values.
     *  Amazon Lex chooses the default value to use in the order that they are presented in the list.
     *  See the `defaultValueList` argument reference below.
     * @return builder
     */
    def defaultValueLists(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingDefaultValueSpecificationDefaultValueListArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingDefaultValueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingDefaultValueSpecificationDefaultValueListArgs.builder
      builder.defaultValueLists(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentState.Builder)
    /**
     * @param closingSetting Configuration block for the response that Amazon Lex sends to the user when the intent is closed. See `closingSetting`.
     * @return builder
     */
    def closingSetting(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingArgs.builder
      builder.closingSetting(args(argsBuilder).build)

    def confirmationSetting(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingArgs.builder
      builder.confirmationSetting(args(argsBuilder).build)

    /**
     * @param dialogCodeHook Configuration block for invoking the alias Lambda function for each user input. You can invoke this Lambda function to personalize user interaction. See `dialogCodeHook`.
     * @return builder
     */
    def dialogCodeHook(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentDialogCodeHookArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentDialogCodeHookArgs.builder
      builder.dialogCodeHook(args(argsBuilder).build)

    /**
     * @param fulfillmentCodeHook Configuration block for invoking the alias Lambda function when the intent is ready for fulfillment. You can invoke this function to complete the bot&#39;s transaction with the user. See `fulfillmentCodeHook`.
     * @return builder
     */
    def fulfillmentCodeHook(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookArgs.builder
      builder.fulfillmentCodeHook(args(argsBuilder).build)

    /**
     * @param initialResponseSetting Configuration block for the response that is sent to the user at the beginning of a conversation, before eliciting slot values. See `initialResponseSetting`.
     * @return builder
     */
    def initialResponseSetting(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingArgs.builder
      builder.initialResponseSetting(args(argsBuilder).build)

    /**
     * @param inputContexts Configuration blocks for contexts that must be active for this intent to be considered by Amazon Lex. When an intent has an input context list, Amazon Lex only considers using the intent in an interaction with the user when the specified contexts are included in the active context list for the session. If the contexts are not active, then Amazon Lex will not use the intent. A context can be automatically activated using the outputContexts property or it can be set at runtime. See `inputContext`.
     * @return builder
     */
    def inputContexts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInputContextArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInputContextArgs.builder
      builder.inputContexts(args.map(_(argsBuilder).build)*)

    /**
     * @param kendraConfiguration Configuration block for information required to use the AMAZON.KendraSearchIntent intent to connect to an Amazon Kendra index. The AMAZON.KendraSearchIntent intent is called when Amazon Lex can&#39;t determine another intent to invoke. See `kendraConfiguration`.
     * @return builder
     */
    def kendraConfiguration(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentKendraConfigurationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentKendraConfigurationArgs.builder
      builder.kendraConfiguration(args(argsBuilder).build)

    /**
     * @param outputContexts Configuration blocks for contexts that the intent activates when it is fulfilled. You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of the conversation with a customer. When you use the outputContextsList property, all of the contexts specified in the list are activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number of conversation turns that the context should be active, or the length of time that the context should be active. See `outputContext`.
     * @return builder
     */
    def outputContexts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentOutputContextArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentOutputContextArgs.builder
      builder.outputContexts(args.map(_(argsBuilder).build)*)

    /**
     * @param sampleUtterances Configuration block for strings that a user might say to signal the intent. See `sampleUtterance`.
     * @return builder
     */
    def sampleUtterances(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentSampleUtteranceArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentSampleUtteranceArgs.builder
      builder.sampleUtterances(args.map(_(argsBuilder).build)*)

    /**
     * @param slotPriorities Configuration block for a new list of slots and their priorities that are contained by the intent. This is ignored on create and only valid for updates. See `slotPriority`.
     * @return builder
     */
    def slotPriorities(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentSlotPriorityArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentSlotPriorityArgs.builder
      builder.slotPriorities(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentTimeoutsArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingArgs.Builder)
    /**
     * @param grammarSlotTypeSettings Settings required for a slot type based on a grammar that you provide.
     *  See `grammarSlotTypeSetting` argument reference below.
     * @return builder
     */
    def grammarSlotTypeSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingGrammarSlotTypeSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingGrammarSlotTypeSettingArgs.builder
      builder.grammarSlotTypeSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder)
    /**
     * @param allowedInputTypes Configuration block for the allowed input types of the prompt attempt. See `allowedInputTypes`.
     * @return builder
     */
    def allowedInputTypes(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationAllowedInputTypesArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationAllowedInputTypesArgs.builder
      builder.allowedInputTypes(args(argsBuilder).build)

    /**
     * @param audioAndDtmfInputSpecification Configuration block for settings on audio and DTMF input. See `audioAndDtmfInputSpecification`.
     * @return builder
     */
    def audioAndDtmfInputSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.builder
      builder.audioAndDtmfInputSpecification(args(argsBuilder).build)

    /**
     * @param textInputSpecification Configuration block for the settings on text input. See `textInputSpecification`.
     * @return builder
     */
    def textInputSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationTextInputSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationPromptAttemptsSpecificationTextInputSpecificationArgs.builder
      builder.textInputSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotTypeState.Builder)
    /**
     * @param compositeSlotTypeSettings Specifications for a composite slot type.
     *  See `compositeSlotTypeSetting` argument reference below.
     * @return builder
     */
    def compositeSlotTypeSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingArgs.builder
      builder.compositeSlotTypeSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param externalSourceSettings Type of external information used to create the slot type.
     *  See `externalSourceSetting` argument reference below.
     * @return builder
     */
    def externalSourceSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingArgs.builder
      builder.externalSourceSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param slotTypeValues List of SlotTypeValue objects that defines the values that the slot type can take.
     *  Each value can have a list of synonyms, additional values that help train the machine learning model about the values that it resolves for a slot.
     *  See `slotTypeValues` argument reference below.
     * @return builder
     */
    def slotTypeValues(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueArgs.builder
      builder.slotTypeValues(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeTimeoutsArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param valueSelectionSetting Determines the strategy that Amazon Lex uses to select a value from the list of possible values.
     *  See `valueSelectionSetting` argument reference below.
     * @return builder
     */
    def valueSelectionSetting(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingArgs.builder
      builder.valueSelectionSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.IntentConclusionStatementArgs.Builder)
    def messages(args: Endofunction[com.pulumi.aws.lex.inputs.IntentConclusionStatementMessageArgs.Builder]*):
        com.pulumi.aws.lex.inputs.IntentConclusionStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.IntentConclusionStatementMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder)
    def audioSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationAudioSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationAudioSpecificationArgs.builder
      builder.audioSpecification(args(argsBuilder).build)

    def dtmfSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationDtmfSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationDtmfSpecificationArgs.builder
      builder.dtmfSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingInitialResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.IntentConfirmationPromptArgs.Builder)
    def messages(args: Endofunction[com.pulumi.aws.lex.inputs.IntentConfirmationPromptMessageArgs.Builder]*):
        com.pulumi.aws.lex.inputs.IntentConfirmationPromptArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.IntentConfirmationPromptMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder)
    def audioSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationAudioSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationAudioSpecificationArgs.builder
      builder.audioSpecification(args(argsBuilder).build)

    def dtmfSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationDtmfSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationDtmfSpecificationArgs.builder
      builder.dtmfSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationArgs.Builder)
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

    def promptAttemptsSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.builder
      builder.promptAttemptsSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     *  When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.BotAliasConversationLogsArgs.Builder)
    /**
     * @param logSettings The settings for your conversation logs. You can log text, audio, or both. Attributes are documented under log_settings.
     * @return builder
     */
    def logSettings(args: Endofunction[com.pulumi.aws.lex.inputs.BotAliasConversationLogsLogSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.BotAliasConversationLogsArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.BotAliasConversationLogsLogSettingArgs.builder
      builder.logSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.IntentState.Builder)
    /**
     * @param conclusionStatement The statement that you want Amazon Lex to convey to the user
     *  after the intent is successfully fulfilled by the Lambda function. This element is relevant only if
     *  you provide a Lambda function in the `fulfillmentActivity`. If you return the intent to the client
     *  application, you can&#39;t specify this element. The `followUpPrompt` and `conclusionStatement` are
     *  mutually exclusive. You can specify only one. Attributes are documented under statement.
     * @return builder
     */
    def conclusionStatement(args: Endofunction[com.pulumi.aws.lex.inputs.IntentConclusionStatementArgs.Builder]):
        com.pulumi.aws.lex.inputs.IntentState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentConclusionStatementArgs.builder
      builder.conclusionStatement(args(argsBuilder).build)

    /**
     * @param confirmationPrompt Prompts the user to confirm the intent. This question should
     *  have a yes or no answer. You you must provide both the `rejectionStatement` and `confirmationPrompt`,
     *  or neither. Attributes are documented under prompt.
     * @return builder
     */
    def confirmationPrompt(args: Endofunction[com.pulumi.aws.lex.inputs.IntentConfirmationPromptArgs.Builder]):
        com.pulumi.aws.lex.inputs.IntentState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentConfirmationPromptArgs.builder
      builder.confirmationPrompt(args(argsBuilder).build)

    /**
     * @param dialogCodeHook Specifies a Lambda function to invoke for each user input. You can
     *  invoke this Lambda function to personalize user interaction. Attributes are documented under code_hook.
     * @return builder
     */
    def dialogCodeHook(args: Endofunction[com.pulumi.aws.lex.inputs.IntentDialogCodeHookArgs.Builder]):
        com.pulumi.aws.lex.inputs.IntentState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentDialogCodeHookArgs.builder
      builder.dialogCodeHook(args(argsBuilder).build)

    /**
     * @param followUpPrompt Amazon Lex uses this prompt to solicit additional activity after
     *  fulfilling an intent. For example, after the OrderPizza intent is fulfilled, you might prompt the
     *  user to order a drink. The `followUpPrompt` field and the `conclusionStatement` field are mutually
     *  exclusive. You can specify only one. Attributes are documented under follow_up_prompt.
     * @return builder
     */
    def followUpPrompt(args: Endofunction[com.pulumi.aws.lex.inputs.IntentFollowUpPromptArgs.Builder]):
        com.pulumi.aws.lex.inputs.IntentState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentFollowUpPromptArgs.builder
      builder.followUpPrompt(args(argsBuilder).build)

    /**
     * @param fulfillmentActivity Describes how the intent is fulfilled. For example, after a
     *  user provides all of the information for a pizza order, `fulfillmentActivity` defines how the bot
     *  places an order with a local pizza store. Attributes are documented under fulfillment_activity.
     * @return builder
     */
    def fulfillmentActivity(args: Endofunction[com.pulumi.aws.lex.inputs.IntentFulfillmentActivityArgs.Builder]):
        com.pulumi.aws.lex.inputs.IntentState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentFulfillmentActivityArgs.builder
      builder.fulfillmentActivity(args(argsBuilder).build)

    /**
     * @param rejectionStatement When the user answers &#34;no&#34; to the question defined in
     *  `confirmationPrompt`, Amazon Lex responds with this statement to acknowledge that the intent was
     *  canceled. You must provide both the `rejectionStatement` and the `confirmationPrompt`, or neither.
     *  Attributes are documented under statement.
     * @return builder
     */
    def rejectionStatement(args: Endofunction[com.pulumi.aws.lex.inputs.IntentRejectionStatementArgs.Builder]):
        com.pulumi.aws.lex.inputs.IntentState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.IntentRejectionStatementArgs.builder
      builder.rejectionStatement(args(argsBuilder).build)

    /**
     * @param slots An list of intent slots. At runtime, Amazon Lex elicits required slot values
     *  from the user using prompts defined in the slots. Attributes are documented under slot.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.IntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.IntentState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.IntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingArgs.Builder)
    /**
     * @param defaultValueSpecifications List of default values for a slot.
     *  See the `defaultValueSpecification` argument reference below.
     * @return builder
     */
    def defaultValueSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingDefaultValueSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingDefaultValueSpecificationArgs.builder
      builder.defaultValueSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param promptSpecification Prompt that Amazon Lex uses to elicit the slot value from the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `promptSpecification` argument reference - they are identical.
     * @return builder
     */
    def promptSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationArgs.builder
      builder.promptSpecification(args(argsBuilder).build)

    def sampleUtterances(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingSampleUtteranceArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingSampleUtteranceArgs.builder
      builder.sampleUtterances(args.map(_(argsBuilder).build)*)

    /**
     * @param waitAndContinueSpecifications Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
     *  See the `waitAndContinueSpecification` argument reference below.
     * @return builder
     */
    def waitAndContinueSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationArgs.builder
      builder.waitAndContinueSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingPromptSpecificationMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder)
    def allowedInputTypes(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAllowedInputTypesArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAllowedInputTypesArgs.builder
      builder.allowedInputTypes(args(argsBuilder).build)

    def audioAndDtmfInputSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.builder
      builder.audioAndDtmfInputSpecification(args(argsBuilder).build)

    def textInputSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationTextInputSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationTextInputSpecificationArgs.builder
      builder.textInputSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingClosingResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user.
     *  Amazon Lex chooses the actual response to send at runtime.
     *  See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookFulfillmentUpdatesSpecificationUpdateResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     *  When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotState.Builder)
    /**
     * @param multipleValuesSettings Whether the slot returns multiple values in one response.
     *  See the `multipleValuesSetting` argument reference below.
     * @return builder
     */
    def multipleValuesSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotMultipleValuesSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotMultipleValuesSettingArgs.builder
      builder.multipleValuesSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param obfuscationSettings Determines how slot values are used in Amazon CloudWatch logs.
     *  See the `obfuscationSetting` argument reference below.
     * @return builder
     */
    def obfuscationSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotObfuscationSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotObfuscationSettingArgs.builder
      builder.obfuscationSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param subSlotSettings Specifications for the constituent sub slots and the expression for the composite slot.
     *  See the `subSlotSetting` argument reference below.
     * @return builder
     */
    def subSlotSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingArgs.builder
      builder.subSlotSettings(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTimeoutsArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    def valueElicitationSetting(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.builder
      builder.valueElicitationSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationSuccessConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueArgs.Builder)
    /**
     * @param sampleValues Value of the slot type entry.
     *  See `sampleValue` argument reference below.
     * @return builder
     */
    def sampleValues(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueSampleValueArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueSampleValueArgs.builder
      builder.sampleValues(args.map(_(argsBuilder).build)*)

    /**
     * @param synonyms A list of additional values related to the slot type entry.
     *  See `synonyms` argument reference below.
     * @return builder
     */
    def synonyms(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueSynonymArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueSynonymArgs.builder
      builder.synonyms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationTimeoutConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationConditionalConditionalBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime. See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.Builder)
    /**
     * @param defaultValueSpecifications List of default values for a slot.
     *  See the `defaultValueSpecification` argument reference below.
     * @return builder
     */
    def defaultValueSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingDefaultValueSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingDefaultValueSpecificationArgs.builder
      builder.defaultValueSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param promptSpecification Prompt that Amazon Lex uses to elicit the slot value from the user.
     *  See the `aws.lex.V2modelsIntent` resource for details on the `promptSpecification` argument reference - they are identical.
     * @return builder
     */
    def promptSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationArgs.builder
      builder.promptSpecification(args(argsBuilder).build)

    def sampleUtterances(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingSampleUtteranceArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingSampleUtteranceArgs.builder
      builder.sampleUtterances(args.map(_(argsBuilder).build)*)

    /**
     * @param slotResolutionSettings Information about whether assisted slot resolution is turned on for the slot or not.
     *  See the `slotResolutionSetting` argument reference below.
     * @return builder
     */
    def slotResolutionSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingSlotResolutionSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingSlotResolutionSettingArgs.builder
      builder.slotResolutionSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param waitAndContinueSpecifications Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
     *  See the `waitAndContinueSpecification` argument reference below.
     * @return builder
     */
    def waitAndContinueSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationArgs.builder
      builder.waitAndContinueSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepArgs.Builder)
    /**
     * @param dialogAction Configuration block for action that the bot executes at runtime when the conversation reaches this step. See `dialogAction`.
     * @return builder
     */
    def dialogAction(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepDialogActionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepDialogActionArgs.builder
      builder.dialogAction(args(argsBuilder).build)

    /**
     * @param intent Configuration block for override settings to configure the intent state. See `intent`.
     * @return builder
     */
    def intent(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepIntentArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchNextStepIntentArgs.builder
      builder.intent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationTimeoutConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationSuccessConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalConditionalBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder)
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalArgs.Builder)
    /**
     * @param conditionalBranches Configuration blocks for conditional branches. A conditional branch is made up of a condition, a response and a next step. The response and next step are executed when the condition is true. See `conditionalBranch`.
     * @return builder
     */
    def conditionalBranches(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalConditionalBranchArgs.builder
      builder.conditionalBranches(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBranch Configuration block for the conditional branch that should be followed when the conditions for other branches are not satisfied. A branch is made up of a condition, a response and a next step. See `defaultBranch`.
     * @return builder
     */
    def defaultBranch(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchArgs.builder
      builder.defaultBranch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationSuccessConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlotArgs.Builder)
    /**
     * @param value Configuration block for the current value of the slot. See `value`.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlotValueArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlotArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlotValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder)
    /**
     * @param customPayload Configuration block for a message in a custom format defined by the client application. See `customPayload`.
     * @return builder
     */
    def customPayload(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageCustomPayloadArgs.builder
      builder.customPayload(args(argsBuilder).build)

    /**
     * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `imageResponseCard`.
     * @return builder
     */
    def imageResponseCard(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageImageResponseCardArgs.builder
      builder.imageResponseCard(args(argsBuilder).build)

    /**
     * @param plainTextMessage Configuration block for a message in plain text format. See `plainTextMessage`.
     * @return builder
     */
    def plainTextMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessagePlainTextMessageArgs.builder
      builder.plainTextMessage(args(argsBuilder).build)

    /**
     * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssmlMessage`.
     * @return builder
     */
    def ssmlMessage(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingConditionalDefaultBranchResponseMessageGroupMessageSsmlMessageArgs.builder
      builder.ssmlMessage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepIntentArgs.Builder)
    /**
     * @param slots Configuration block for all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren&#39;t overridden. See `slot`.
     * @return builder
     */
    def slots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepIntentSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepIntentArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchNextStepIntentSlotArgs.builder
      builder.slots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user. See `message`.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user. See `variation`.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.IntentRejectionStatementArgs.Builder)
    def messages(args: Endofunction[com.pulumi.aws.lex.inputs.IntentRejectionStatementMessageArgs.Builder]*):
        com.pulumi.aws.lex.inputs.IntentRejectionStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.IntentRejectionStatementMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchArgs.Builder)
    /**
     * @param condition Configuration block for the expression to evaluate. If the condition is true, the branch&#39;s actions are taken. See `condition`.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchConditionArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationFailureConditionalConditionalBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageImageResponseCardArgs.Builder)
    /**
     * @param buttons Configuration blocks for buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button. See `button`.
     * @return builder
     */
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchArgs.Builder)
    /**
     * @param nextStep Configuration block for the next step in the conversation. See `nextStep`.
     * @return builder
     */
    def nextStep(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchNextStepArgs.builder
      builder.nextStep(args(argsBuilder).build)

    /**
     * @param response Configuration block for a list of message groups that Amazon Lex uses to respond to the user input. See `response`.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseArgs.builder
      builder.response(args(argsBuilder).build)
