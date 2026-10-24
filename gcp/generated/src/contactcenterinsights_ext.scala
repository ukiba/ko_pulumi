package jp.ukiba.ko_pulumi
package gcp

object contactcenterinsights_ext:
  extension (builder: com.pulumi.gcp.contactcenterinsights.AnalysisRuleArgs.Builder)
    /**
     * @param annotatorSelector Selector of all available annotators and phrase matchers to run.
     * Structure is documented below.
     * @return builder
     */
    inline def annotatorSelector(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.AnalysisRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.builder
      builder.annotatorSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.AssessmentRuleArgs.Builder)
    /**
     * @param sampleRule Message for sampling conversations.
     * Structure is documented below.
     * @return builder
     */
    inline def sampleRule(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleSampleRuleArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.AssessmentRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleSampleRuleArgs.builder
      builder.sampleRule(args(argsBuilder).build)

    /**
     * @param scheduleInfo Message for schedule info.
     * Structure is documented below.
     * @return builder
     */
    inline def scheduleInfo(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleScheduleInfoArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.AssessmentRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleScheduleInfoArgs.builder
      builder.scheduleInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.AutoLabelingRuleArgs.Builder)
    /**
     * @param conditions Conditions to apply for auto-labeling the label_key.
     * Structure is documented below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AutoLabelingRuleConditionArgs.Builder]*):
        com.pulumi.gcp.contactcenterinsights.AutoLabelingRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AutoLabelingRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder)
    /**
     * @param answerChoices A list of valid answers to the question, which the LLM must choose from.
     * Structure is documented below.
     * @return builder
     */
    inline def answerChoices(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionAnswerChoiceArgs.Builder]*):
        com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionAnswerChoiceArgs.builder
      builder.answerChoices(args.map(_(argsBuilder).build)*)

    /**
     * @param metrics A wrapper representing metrics calculated against a test-set on a LLM that
     * was fine tuned for this question.
     * Structure is documented below.
     * @return builder
     */
    inline def metrics(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionMetricsArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionMetricsArgs.builder
      builder.metrics(args(argsBuilder).build)

    /**
     * @param predefinedQuestionConfig Configuration for a predefined question. This field will only be set if the
     * Question Type is predefined.
     * Structure is documented below.
     * @return builder
     */
    inline def predefinedQuestionConfig(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionPredefinedQuestionConfigArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionPredefinedQuestionConfigArgs.builder
      builder.predefinedQuestionConfig(args(argsBuilder).build)

    /**
     * @param qaQuestionDataOptions Options for configuring the data used to generate the QA question.
     * Structure is documented below.
     * @return builder
     */
    inline def qaQuestionDataOptions(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsArgs.builder
      builder.qaQuestionDataOptions(args(argsBuilder).build)

    /**
     * @param tuningMetadata Metadata about the tuning operation for the question. Will only be set if a
     * scorecard containing this question has been tuned.
     * Structure is documented below.
     * @return builder
     */
    inline def tuningMetadata(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionTuningMetadataArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionTuningMetadataArgs.builder
      builder.tuningMetadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.Builder)
    /**
     * @param qaConfig Configuration for the QA feature.
     * Structure is documented below.
     * @return builder
     */
    inline def qaConfig(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorQaConfigArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorQaConfigArgs.builder
      builder.qaConfig(args(argsBuilder).build)

    /**
     * @param summarizationConfig Configuration for summarization.
     * Structure is documented below.
     * @return builder
     */
    inline def summarizationConfig(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorSummarizationConfigArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorSummarizationConfigArgs.builder
      builder.summarizationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorQaConfigArgs.Builder)
    /**
     * @param scorecardList Container for a list of scorecards.
     * Structure is documented below.
     * @return builder
     */
    inline def scorecardList(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorQaConfigScorecardListArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorQaConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorQaConfigScorecardListArgs.builder
      builder.scorecardList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleState.Builder)
    /**
     * @param annotatorSelector Selector of all available annotators and phrase matchers to run.
     * Structure is documented below.
     * @return builder
     */
    inline def annotatorSelector(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.builder
      builder.annotatorSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleState.Builder)
    /**
     * @param sampleRule Message for sampling conversations.
     * Structure is documented below.
     * @return builder
     */
    inline def sampleRule(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleSampleRuleArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleSampleRuleArgs.builder
      builder.sampleRule(args(argsBuilder).build)

    /**
     * @param scheduleInfo Message for schedule info.
     * Structure is documented below.
     * @return builder
     */
    inline def scheduleInfo(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleScheduleInfoArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleScheduleInfoArgs.builder
      builder.scheduleInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.AutoLabelingRuleState.Builder)
    /**
     * @param conditions Conditions to apply for auto-labeling the label_key.
     * Structure is documented below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AutoLabelingRuleConditionArgs.Builder]*):
        com.pulumi.gcp.contactcenterinsights.inputs.AutoLabelingRuleState.Builder =
      def argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AutoLabelingRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsArgs.Builder)
    /**
     * @param conversationDataOptions Options for configuring what metadata is included in the conversation data
     * used in QAI and Discovery Engine.
     * Structure is documented below.
     * @return builder
     */
    inline def conversationDataOptions(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsConversationDataOptionsArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsConversationDataOptionsArgs.builder
      builder.conversationDataOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionState.Builder)
    /**
     * @param answerChoices A list of valid answers to the question, which the LLM must choose from.
     * Structure is documented below.
     * @return builder
     */
    inline def answerChoices(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionAnswerChoiceArgs.Builder]*):
        com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionState.Builder =
      def argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionAnswerChoiceArgs.builder
      builder.answerChoices(args.map(_(argsBuilder).build)*)

    /**
     * @param metrics A wrapper representing metrics calculated against a test-set on a LLM that
     * was fine tuned for this question.
     * Structure is documented below.
     * @return builder
     */
    inline def metrics(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionMetricsArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionMetricsArgs.builder
      builder.metrics(args(argsBuilder).build)

    /**
     * @param predefinedQuestionConfig Configuration for a predefined question. This field will only be set if the
     * Question Type is predefined.
     * Structure is documented below.
     * @return builder
     */
    inline def predefinedQuestionConfig(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionPredefinedQuestionConfigArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionPredefinedQuestionConfigArgs.builder
      builder.predefinedQuestionConfig(args(argsBuilder).build)

    /**
     * @param qaQuestionDataOptions Options for configuring the data used to generate the QA question.
     * Structure is documented below.
     * @return builder
     */
    inline def qaQuestionDataOptions(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsArgs.builder
      builder.qaQuestionDataOptions(args(argsBuilder).build)

    /**
     * @param tuningMetadata Metadata about the tuning operation for the question. Will only be set if a
     * scorecard containing this question has been tuned.
     * Structure is documented below.
     * @return builder
     */
    inline def tuningMetadata(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionTuningMetadataArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionTuningMetadataArgs.builder
      builder.tuningMetadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.QaScorecardRevisionState.Builder)
    /**
     * @param snapshots A QaScorecard represents a collection of questions to be scored during
     * analysis.
     * Structure is documented below.
     * @return builder
     */
    inline def snapshots(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaScorecardRevisionSnapshotArgs.Builder]*):
        com.pulumi.gcp.contactcenterinsights.inputs.QaScorecardRevisionState.Builder =
      def argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaScorecardRevisionSnapshotArgs.builder
      builder.snapshots(args.map(_(argsBuilder).build)*)
