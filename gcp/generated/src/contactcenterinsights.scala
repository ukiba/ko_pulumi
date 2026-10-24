package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object contactcenterinsights:
  /**
   * The CCAI Insights project wide analysis rule.
   * This rule will be applied to all conversations that match the filter defined in the rule.
   * For a conversation matches the filter, the annotators specified in the rule will be run.
   * If a conversation matches multiple rules, a union of all the annotators will be run.
   * One project can have multiple analysis rules.
   * 
   * To get more information about AnalysisRule, see:
   * 
   * * [API documentation](https://cloud.google.com/contact-center/insights/docs/reference/rest/v1/projects.locations.analysisRules)
   * * How-to Guides
   *     * [Configure analysis rules using the API](https://cloud.google.com/contact-center/insights/docs/analysis-rule)
   */
  def AnalysisRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.AnalysisRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.AnalysisRuleArgs.builder
    com.pulumi.gcp.contactcenterinsights.AnalysisRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The CCAI Insights project wide assessment rule. This assessment rule will be
   * applied to all conversations from the previous sampling cycle that match the
   * sample rule defined in the assessment rule. One project can have multiple
   * assessment rules.
   * 
   * To get more information about AssessmentRule, see:
   * 
   * * [API documentation](https://cloud.google.com/contact-center/insights/docs/reference/rest/v1/projects.locations.assessmentRules)
   * * How-to Guides
   *     * [Configure assessment rules using the API](https://cloud.google.com/contact-center/insights/docs/assessment-rule)
   */
  def AssessmentRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.AssessmentRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.AssessmentRuleArgs.builder
    com.pulumi.gcp.contactcenterinsights.AssessmentRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The CCAI Insights project wide auto labeling rule. This rule will be applied
   * to all conversations that match the filter defined in the rule.
   * 
   * To get more information about AutoLabelingRule, see:
   * 
   * * [API documentation](https://cloud.google.com/contact-center/insights/docs/reference/rest/v1/projects.locations.autoLabelingRules)
   * * How-to Guides
   *     * [Configure auto labeling rules using the API](https://cloud.google.com/contact-center/insights/docs/auto-labeling-rule)
   */
  def AutoLabelingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.AutoLabelingRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.AutoLabelingRuleArgs.builder
    com.pulumi.gcp.contactcenterinsights.AutoLabelingRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Initializes a location-level encryption key specification.
   * 
   * To get more information about EncryptionSpec, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/contact-center/insights/docs/reference/rest/v1/projects.locations.encryptionSpec)
   * * How-to Guides
   *     * [Official Documentation](https://docs.cloud.google.com/contact-center/insights/docs/cmek)
   */
  def EncryptionSpec(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.EncryptionSpecArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.EncryptionSpecArgs.builder
    com.pulumi.gcp.contactcenterinsights.EncryptionSpec(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A single question to be scored by the Insights QA feature. */
  def QaQuestion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.QaQuestionArgs.builder
    com.pulumi.gcp.contactcenterinsights.QaQuestion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A QaScorecard represents a collection of questions to be scored during analysis. */
  def QaScorecard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.QaScorecardArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.QaScorecardArgs.builder
    com.pulumi.gcp.contactcenterinsights.QaScorecard(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A revision of a QaScorecard. */
  def QaScorecardRevision(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.QaScorecardRevisionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.QaScorecardRevisionArgs.builder
    com.pulumi.gcp.contactcenterinsights.QaScorecardRevision(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Insights View resource for filtering conversations
   * 
   * To get more information about View, see:
   * 
   * * [API documentation](https://cloud.google.com/contact-center/insights/docs/reference/rest/v1/projects.locations.views)
   */
  def View(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.contactcenterinsights.ViewArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.contactcenterinsights.ViewArgs.builder
    com.pulumi.gcp.contactcenterinsights.View(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
