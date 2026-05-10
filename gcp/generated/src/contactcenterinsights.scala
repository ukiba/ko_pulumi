package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object contactcenterinsights:
  /**
   * The CCAI Insights project wide auto labeling rule. This rule will be applied
   *  to all conversations that match the filter defined in the rule.
   * 
   *  To get more information about AutoLabelingRule, see:
   * 
   *  * [API documentation](https://cloud.google.com/contact-center/insights/docs/reference/rest/v1/projects.locations.autoLabelingRules)
   *  * How-to Guides
   *      * [Configure auto labeling rules using the API](https://cloud.google.com/contact-center/insights/docs/auto-labeling-rule)
   */
  def AutoLabelingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.AutoLabelingRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.AutoLabelingRuleArgs.builder
    com.pulumi.gcp.contactcenterinsights.AutoLabelingRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** A revision of a QaScorecard. */
  def QaScorecardRevision(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.QaScorecardRevisionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.QaScorecardRevisionArgs.builder
    com.pulumi.gcp.contactcenterinsights.QaScorecardRevision(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.AutoLabelingRuleArgs.Builder)
    /**
     * @param conditions Conditions to apply for auto-labeling the label_key.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AutoLabelingRuleConditionArgs.Builder]*):
        com.pulumi.gcp.contactcenterinsights.AutoLabelingRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AutoLabelingRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder)
    /**
     * @param answerChoices A list of valid answers to the question, which the LLM must choose from.
     *  Structure is documented below.
     * @return builder
     */
    def answerChoices(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionAnswerChoiceArgs.Builder]*):
        com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionAnswerChoiceArgs.builder
      builder.answerChoices(args.map(_(argsBuilder).build)*)

    /**
     * @param metrics A wrapper representing metrics calculated against a test-set on a LLM that
     *  was fine tuned for this question.
     *  Structure is documented below.
     * @return builder
     */
    def metrics(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionMetricsArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionMetricsArgs.builder
      builder.metrics(args(argsBuilder).build)

    /**
     * @param predefinedQuestionConfig Configuration for a predefined question. This field will only be set if the
     *  Question Type is predefined.
     *  Structure is documented below.
     * @return builder
     */
    def predefinedQuestionConfig(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionPredefinedQuestionConfigArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionPredefinedQuestionConfigArgs.builder
      builder.predefinedQuestionConfig(args(argsBuilder).build)

    /**
     * @param qaQuestionDataOptions Options for configuring the data used to generate the QA question.
     *  Structure is documented below.
     * @return builder
     */
    def qaQuestionDataOptions(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsArgs.builder
      builder.qaQuestionDataOptions(args(argsBuilder).build)

    /**
     * @param tuningMetadata Metadata about the tuning operation for the question. Will only be set if a
     *  scorecard containing this question has been tuned.
     *  Structure is documented below.
     * @return builder
     */
    def tuningMetadata(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionTuningMetadataArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionTuningMetadataArgs.builder
      builder.tuningMetadata(args(argsBuilder).build)

  /**
   * The CCAI Insights project wide assessment rule. This assessment rule will be
   *  applied to all conversations from the previous sampling cycle that match the
   *  sample rule defined in the assessment rule. One project can have multiple
   *  assessment rules.
   * 
   *  To get more information about AssessmentRule, see:
   * 
   *  * [API documentation](https://cloud.google.com/contact-center/insights/docs/reference/rest/v1/projects.locations.assessmentRules)
   *  * How-to Guides
   *      * [Configure assessment rules using the API](https://cloud.google.com/contact-center/insights/docs/assessment-rule)
   */
  def AssessmentRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.AssessmentRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.AssessmentRuleArgs.builder
    com.pulumi.gcp.contactcenterinsights.AssessmentRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Insights View resource for filtering conversations
   * 
   *  To get more information about View, see:
   * 
   *  * [API documentation](https://cloud.google.com/contact-center/insights/docs/reference/rest/v1/projects.locations.views)
   */
  def View(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.ViewArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.ViewArgs.builder
    com.pulumi.gcp.contactcenterinsights.View(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.AnalysisRuleArgs.Builder)
    /**
     * @param annotatorSelector Selector of all available annotators and phrase matchers to run.
     *  Structure is documented below.
     * @return builder
     */
    def annotatorSelector(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.AnalysisRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.builder
      builder.annotatorSelector(args(argsBuilder).build)

  /**
   * The CCAI Insights project wide analysis rule.
   *  This rule will be applied to all conversations that match the filter defined in the rule.
   *  For a conversation matches the filter, the annotators specified in the rule will be run.
   *  If a conversation matches multiple rules, a union of all the annotators will be run.
   *  One project can have multiple analysis rules.
   * 
   *  To get more information about AnalysisRule, see:
   * 
   *  * [API documentation](https://cloud.google.com/contact-center/insights/docs/reference/rest/v1/projects.locations.analysisRules)
   *  * How-to Guides
   *      * [Configure analysis rules using the API](https://cloud.google.com/contact-center/insights/docs/analysis-rule)
   */
  def AnalysisRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.AnalysisRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.AnalysisRuleArgs.builder
    com.pulumi.gcp.contactcenterinsights.AnalysisRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** A QaScorecard represents a collection of questions to be scored during analysis. */
  def QaScorecard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.QaScorecardArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.QaScorecardArgs.builder
    com.pulumi.gcp.contactcenterinsights.QaScorecard(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.AssessmentRuleArgs.Builder)
    /**
     * @param sampleRule Message for sampling conversations.
     *  Structure is documented below.
     * @return builder
     */
    def sampleRule(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleSampleRuleArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.AssessmentRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleSampleRuleArgs.builder
      builder.sampleRule(args(argsBuilder).build)

    /**
     * @param scheduleInfo Message for schedule info.
     *  Structure is documented below.
     * @return builder
     */
    def scheduleInfo(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleScheduleInfoArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.AssessmentRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleScheduleInfoArgs.builder
      builder.scheduleInfo(args(argsBuilder).build)

  /** A single question to be scored by the Insights QA feature. */
  def QaQuestion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.builder
    com.pulumi.gcp.contactcenterinsights.QaQuestion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.AutoLabelingRuleState.Builder)
    /**
     * @param conditions Conditions to apply for auto-labeling the label_key.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AutoLabelingRuleConditionArgs.Builder]*):
        com.pulumi.gcp.contactcenterinsights.inputs.AutoLabelingRuleState.Builder =
      def argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AutoLabelingRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorQaConfigArgs.Builder)
    /**
     * @param scorecardList Container for a list of scorecards.
     *  Structure is documented below.
     * @return builder
     */
    def scorecardList(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorQaConfigScorecardListArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorQaConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorQaConfigScorecardListArgs.builder
      builder.scorecardList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleState.Builder)
    /**
     * @param annotatorSelector Selector of all available annotators and phrase matchers to run.
     *  Structure is documented below.
     * @return builder
     */
    def annotatorSelector(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.builder
      builder.annotatorSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleState.Builder)
    /**
     * @param sampleRule Message for sampling conversations.
     *  Structure is documented below.
     * @return builder
     */
    def sampleRule(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleSampleRuleArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleSampleRuleArgs.builder
      builder.sampleRule(args(argsBuilder).build)

    /**
     * @param scheduleInfo Message for schedule info.
     *  Structure is documented below.
     * @return builder
     */
    def scheduleInfo(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleScheduleInfoArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AssessmentRuleScheduleInfoArgs.builder
      builder.scheduleInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.QaScorecardRevisionState.Builder)
    /**
     * @param snapshots A QaScorecard represents a collection of questions to be scored during
     *  analysis.
     *  Structure is documented below.
     * @return builder
     */
    def snapshots(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaScorecardRevisionSnapshotArgs.Builder]*):
        com.pulumi.gcp.contactcenterinsights.inputs.QaScorecardRevisionState.Builder =
      def argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaScorecardRevisionSnapshotArgs.builder
      builder.snapshots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionState.Builder)
    /**
     * @param answerChoices A list of valid answers to the question, which the LLM must choose from.
     *  Structure is documented below.
     * @return builder
     */
    def answerChoices(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionAnswerChoiceArgs.Builder]*):
        com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionState.Builder =
      def argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionAnswerChoiceArgs.builder
      builder.answerChoices(args.map(_(argsBuilder).build)*)

    /**
     * @param metrics A wrapper representing metrics calculated against a test-set on a LLM that
     *  was fine tuned for this question.
     *  Structure is documented below.
     * @return builder
     */
    def metrics(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionMetricsArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionMetricsArgs.builder
      builder.metrics(args(argsBuilder).build)

    /**
     * @param predefinedQuestionConfig Configuration for a predefined question. This field will only be set if the
     *  Question Type is predefined.
     *  Structure is documented below.
     * @return builder
     */
    def predefinedQuestionConfig(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionPredefinedQuestionConfigArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionPredefinedQuestionConfigArgs.builder
      builder.predefinedQuestionConfig(args(argsBuilder).build)

    /**
     * @param qaQuestionDataOptions Options for configuring the data used to generate the QA question.
     *  Structure is documented below.
     * @return builder
     */
    def qaQuestionDataOptions(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsArgs.builder
      builder.qaQuestionDataOptions(args(argsBuilder).build)

    /**
     * @param tuningMetadata Metadata about the tuning operation for the question. Will only be set if a
     *  scorecard containing this question has been tuned.
     *  Structure is documented below.
     * @return builder
     */
    def tuningMetadata(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionTuningMetadataArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionState.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionTuningMetadataArgs.builder
      builder.tuningMetadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsArgs.Builder)
    /**
     * @param conversationDataOptions Options for configuring what metadata is included in the conversation data
     *  used in QAI and Discovery Engine.
     *  Structure is documented below.
     * @return builder
     */
    def conversationDataOptions(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsConversationDataOptionsArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.QaQuestionQaQuestionDataOptionsConversationDataOptionsArgs.builder
      builder.conversationDataOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.Builder)
    /**
     * @param qaConfig Configuration for the QA feature.
     *  Structure is documented below.
     * @return builder
     */
    def qaConfig(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorQaConfigArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorQaConfigArgs.builder
      builder.qaConfig(args(argsBuilder).build)

    /**
     * @param summarizationConfig Configuration for summarization.
     *  Structure is documented below.
     * @return builder
     */
    def summarizationConfig(args: Endofunction[com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorSummarizationConfigArgs.Builder]):
        com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorSummarizationConfigArgs.builder
      builder.summarizationConfig(args(argsBuilder).build)
