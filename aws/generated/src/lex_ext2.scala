package jp.ukiba.ko_pulumi
package aws

object lex_ext2:
  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotState.Builder)
    /**
     * @param multipleValuesSettings Whether the slot returns multiple values in one response.
     * See the `multipleValuesSetting` argument reference below.
     * @return builder
     */
    def multipleValuesSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotMultipleValuesSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotMultipleValuesSettingArgs.builder
      builder.multipleValuesSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param obfuscationSettings Determines how slot values are used in Amazon CloudWatch logs.
     * See the `obfuscationSetting` argument reference below.
     * @return builder
     */
    def obfuscationSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotObfuscationSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotObfuscationSettingArgs.builder
      builder.obfuscationSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param subSlotSettings Specifications for the constituent sub slots and the expression for the composite slot.
     * See the `subSlotSetting` argument reference below.
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

    /**
     * @param valueElicitationSetting Prompts that Amazon Lex sends to the user to elicit a response that provides the value for the slot.
     * If you configure this block without `prompt_specification.*.prompt_attempts_specification`, AWS will provide default `promptAttemptsSpecification` blocks for the initial prompt (map key `Initial`) and each retry attempt (map keys `Retry1`, `Retry2`, etc.).
     * This will cause Terraform to report differences.
     * Use the `valueElicitationSetting` configuration above in the `valueElicitationSetting` example to avoid differences resulting from AWS default configurations.
     * See the `valueElicitationSetting` argument reference below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def valueElicitationSetting(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.builder
      builder.valueElicitationSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingArgs.Builder)
    /**
     * @param slotSpecifications Specifications for the constituent sub slots of a composite slot.
     * See the `slotSpecification` argument reference below.
     * @return builder
     */
    def slotSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationArgs.builder
      builder.slotSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationArgs.Builder)
    /**
     * @param valueElicitationSettings Elicitation setting details for constituent sub slots of a composite slot.
     * See the `valueElicitationSetting` argument reference below.
     * @return builder
     */
    def valueElicitationSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingArgs.builder
      builder.valueElicitationSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingArgs.Builder)
    /**
     * @param defaultValueSpecifications List of default values for a slot.
     * See the `defaultValueSpecification` argument reference below.
     * @return builder
     */
    def defaultValueSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingDefaultValueSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingDefaultValueSpecificationArgs.builder
      builder.defaultValueSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param promptSpecification Prompt that Amazon Lex uses to elicit the slot value from the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `promptSpecification` argument reference - they are identical.
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
     * See the `waitAndContinueSpecification` argument reference below.
     * @return builder
     */
    def waitAndContinueSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationArgs.builder
      builder.waitAndContinueSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingDefaultValueSpecificationArgs.Builder)
    /**
     * @param defaultValueLists List of default values.
     * Amazon Lex chooses the default value to use in the order that they are presented in the list.
     * See the `defaultValueList` argument reference below.
     * @return builder
     */
    def defaultValueLists(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingDefaultValueSpecificationDefaultValueListArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingDefaultValueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingDefaultValueSpecificationDefaultValueListArgs.builder
      builder.defaultValueLists(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationArgs.Builder)
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

    def promptAttemptsSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.builder
      builder.promptAttemptsSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     * When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder)
    def audioSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationAudioSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationAudioSpecificationArgs.builder
      builder.audioSpecification(args(argsBuilder).build)

    def dtmfSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationDtmfSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationDtmfSpecificationArgs.builder
      builder.dtmfSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationArgs.Builder)
    /**
     * @param continueResponses Response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     * See the `continueResponse` argument reference below.
     * @return builder
     */
    def continueResponses(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.builder
      builder.continueResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param stillWaitingResponses Response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input from the user.
     * See the `stillWaitingResponse` argument reference below.
     * @return builder
     */
    def stillWaitingResponses(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.builder
      builder.stillWaitingResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param waitingResponses Response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     * See the `waitingResponse` argument reference below.
     * @return builder
     */
    def waitingResponses(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.builder
      builder.waitingResponses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user.
     * Amazon Lex chooses the actual response to send at runtime.
     * See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     * When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.Builder)
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     * When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.builder
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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user.
     * Amazon Lex chooses the actual response to send at runtime.
     * See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     * When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotSubSlotSettingSlotSpecificationValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingArgs.Builder)
    /**
     * @param subSlots Sub slots in the composite slot.
     * See `subSlots` argument reference below.
     * @return builder
     */
    def subSlots(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingSubSlotArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingSubSlotArgs.builder
      builder.subSlots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingArgs.Builder)
    /**
     * @param grammarSlotTypeSettings Settings required for a slot type based on a grammar that you provide.
     * See `grammarSlotTypeSetting` argument reference below.
     * @return builder
     */
    def grammarSlotTypeSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingGrammarSlotTypeSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingGrammarSlotTypeSettingArgs.builder
      builder.grammarSlotTypeSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingGrammarSlotTypeSettingArgs.Builder)
    /**
     * @param sources Source of the grammar used to create the slot type.
     * See `source` argument reference below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingGrammarSlotTypeSettingSourceArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingGrammarSlotTypeSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingGrammarSlotTypeSettingSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueArgs.Builder)
    /**
     * @param sampleValues Value of the slot type entry.
     * See `sampleValue` argument reference below.
     * @return builder
     */
    def sampleValues(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueSampleValueArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueSampleValueArgs.builder
      builder.sampleValues(args.map(_(argsBuilder).build)*)

    /**
     * @param synonyms A list of additional values related to the slot type entry.
     * See `synonyms` argument reference below.
     * @return builder
     */
    def synonyms(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueSynonymArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeSlotTypeValueSynonymArgs.builder
      builder.synonyms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotTypeState.Builder)
    /**
     * @param compositeSlotTypeSettings Specifications for a composite slot type.
     * See `compositeSlotTypeSetting` argument reference below.
     * @return builder
     */
    def compositeSlotTypeSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeCompositeSlotTypeSettingArgs.builder
      builder.compositeSlotTypeSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param externalSourceSettings Type of external information used to create the slot type.
     * See `externalSourceSetting` argument reference below.
     * @return builder
     */
    def externalSourceSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeState.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeExternalSourceSettingArgs.builder
      builder.externalSourceSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param slotTypeValues List of SlotTypeValue objects that defines the values that the slot type can take.
     * Each value can have a list of synonyms, additional values that help train the machine learning model about the values that it resolves for a slot.
     * See `slotTypeValues` argument reference below.
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
     * See `valueSelectionSetting` argument reference below.
     * @return builder
     */
    def valueSelectionSetting(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeState.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingArgs.builder
      builder.valueSelectionSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingArgs.Builder)
    /**
     * @param advancedRecognitionSettings Provides settings that enable advanced recognition settings for slot values.
     * You can use this to enable using slot values as a custom vocabulary for recognizing user utterances.
     * See `advancedRecognitionSetting` argument reference below.
     * @return builder
     */
    def advancedRecognitionSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingAdvancedRecognitionSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingAdvancedRecognitionSettingArgs.builder
      builder.advancedRecognitionSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param regexFilters Used to validate the value of the slot.
     * See `regexFilter` argument reference below.
     * @return builder
     */
    def regexFilters(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingRegexFilterArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotTypeValueSelectionSettingRegexFilterArgs.builder
      builder.regexFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.Builder)
    /**
     * @param defaultValueSpecifications List of default values for a slot.
     * See the `defaultValueSpecification` argument reference below.
     * @return builder
     */
    def defaultValueSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingDefaultValueSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingDefaultValueSpecificationArgs.builder
      builder.defaultValueSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param promptSpecification Prompt that Amazon Lex uses to elicit the slot value from the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `promptSpecification` argument reference - they are identical.
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
     * See the `slotResolutionSetting` argument reference below.
     * @return builder
     */
    def slotResolutionSettings(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingSlotResolutionSettingArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingSlotResolutionSettingArgs.builder
      builder.slotResolutionSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param waitAndContinueSpecifications Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
     * See the `waitAndContinueSpecification` argument reference below.
     * @return builder
     */
    def waitAndContinueSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationArgs.builder
      builder.waitAndContinueSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingDefaultValueSpecificationArgs.Builder)
    /**
     * @param defaultValueLists List of default values.
     * Amazon Lex chooses the default value to use in the order that they are presented in the list.
     * See the `defaultValueList` argument reference below.
     * @return builder
     */
    def defaultValueLists(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingDefaultValueSpecificationDefaultValueListArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingDefaultValueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingDefaultValueSpecificationDefaultValueListArgs.builder
      builder.defaultValueLists(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationArgs.Builder)
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

    def promptAttemptsSpecifications(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationArgs.builder
      builder.promptAttemptsSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     * When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupMessageImageResponseCardButtonArgs.builder
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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder)
    def audioSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationAudioSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationAudioSpecificationArgs.builder
      builder.audioSpecification(args(argsBuilder).build)

    def dtmfSpecification(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationDtmfSpecificationArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingPromptSpecificationPromptAttemptsSpecificationAudioAndDtmfInputSpecificationDtmfSpecificationArgs.builder
      builder.dtmfSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationArgs.Builder)
    /**
     * @param continueResponses Response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     * See the `continueResponse` argument reference below.
     * @return builder
     */
    def continueResponses(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.builder
      builder.continueResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param stillWaitingResponses Response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input from the user.
     * See the `stillWaitingResponse` argument reference below.
     * @return builder
     */
    def stillWaitingResponses(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.builder
      builder.stillWaitingResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param waitingResponses Response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     * See the `waitingResponse` argument reference below.
     * @return builder
     */
    def waitingResponses(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.builder
      builder.waitingResponses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user.
     * Amazon Lex chooses the actual response to send at runtime.
     * See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     * When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationContinueResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.Builder)
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     * When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationStillWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.Builder)
    /**
     * @param messageGroups Configuration blocks for responses that Amazon Lex can send to the user.
     * Amazon Lex chooses the actual response to send at runtime.
     * See `messageGroup`.
     * @return builder
     */
    def messageGroups(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.builder
      builder.messageGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder)
    /**
     * @param message Configuration block for the primary message that Amazon Lex should send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `message` argument reference - they are identical.
     * @return builder
     */
    def message(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.Builder]):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageArgs.builder
      builder.message(args(argsBuilder).build)

    /**
     * @param variations Configuration blocks for message variations to send to the user.
     * When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
     * See the `aws.lex.V2modelsIntent` resource for details on the `variation` argument reference - they are identical.
     * @return builder
     */
    def variations(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationArgs.builder
      builder.variations(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupMessageImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder)
    def buttons(args: Endofunction[com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.Builder]*):
        com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lex.inputs.V2modelsSlotValueElicitationSettingWaitAndContinueSpecificationWaitingResponseMessageGroupVariationImageResponseCardButtonArgs.builder
      builder.buttons(args.map(_(argsBuilder).build)*)
