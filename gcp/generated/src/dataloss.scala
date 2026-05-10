package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object dataloss:
  extension (builder: com.pulumi.gcp.dataloss.PreventionInspectTemplateArgs.Builder)
    /**
     * @param inspectConfig The core content of the template.
     *  Structure is documented below.
     * @return builder
     */
    def inspectConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.PreventionInspectTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigArgs.builder
      builder.inspectConfig(args(argsBuilder).build)

  /**
   * Allows creation of templates to de-identify content.
   * 
   *  To get more information about DeidentifyTemplate, see:
   * 
   *  * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.deidentifyTemplates)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dlp/docs/concepts-templates)
   */
  def PreventionDeidentifyTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataloss.PreventionDeidentifyTemplateArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataloss.PreventionDeidentifyTemplateArgs.builder
    com.pulumi.gcp.dataloss.PreventionDeidentifyTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Allows creation of custom info types.
   * 
   *  To get more information about StoredInfoType, see:
   * 
   *  * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.storedInfoTypes)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dlp/docs/creating-stored-infotypes)
   */
  def PreventionStoredInfoType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataloss.PreventionStoredInfoTypeArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataloss.PreventionStoredInfoTypeArgs.builder
    com.pulumi.gcp.dataloss.PreventionStoredInfoType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A job trigger configuration.
   * 
   *  To get more information about JobTrigger, see:
   * 
   *  * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.jobTriggers)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dlp/docs/creating-job-triggers)
   */
  def PreventionJobTrigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataloss.PreventionJobTriggerArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataloss.PreventionJobTriggerArgs.builder
    com.pulumi.gcp.dataloss.PreventionJobTrigger(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataloss.PreventionDiscoveryConfigArgs.Builder)
    /**
     * @param actions Actions to execute at the completion of scanning
     *  Structure is documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionArgs.Builder]*):
        com.pulumi.gcp.dataloss.PreventionDiscoveryConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param orgConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def orgConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOrgConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.PreventionDiscoveryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOrgConfigArgs.builder
      builder.orgConfig(args(argsBuilder).build)

    /**
     * @param otherCloudStartingLocation A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def otherCloudStartingLocation(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOtherCloudStartingLocationArgs.Builder]):
        com.pulumi.gcp.dataloss.PreventionDiscoveryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOtherCloudStartingLocationArgs.builder
      builder.otherCloudStartingLocation(args(argsBuilder).build)

    /**
     * @param targets Target to match against for determining what to scan and how frequently
     *  Structure is documented below.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetArgs.Builder]*):
        com.pulumi.gcp.dataloss.PreventionDiscoveryConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  /**
   * Configuration for discovery to scan resources for profile generation. Only one discovery configuration may exist per organization, folder, or project.
   * 
   *  To get more information about DiscoveryConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.locations.discoveryConfigs)
   *  * How-to Guides
   *      * [Schedule inspection scan](https://cloud.google.com/dlp/docs/schedule-inspection-scan)
   */
  def PreventionDiscoveryConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataloss.PreventionDiscoveryConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataloss.PreventionDiscoveryConfigArgs.builder
    com.pulumi.gcp.dataloss.PreventionDiscoveryConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataloss.PreventionDeidentifyTemplateArgs.Builder)
    /**
     * @param deidentifyConfig Configuration of the deidentify template
     *  Structure is documented below.
     * @return builder
     */
    def deidentifyConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.PreventionDeidentifyTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigArgs.builder
      builder.deidentifyConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.PreventionStoredInfoTypeArgs.Builder)
    /**
     * @param dictionary Dictionary which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def dictionary(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryArgs.Builder]):
        com.pulumi.gcp.dataloss.PreventionStoredInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryArgs.builder
      builder.dictionary(args(argsBuilder).build)

    /**
     * @param largeCustomDictionary Dictionary which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def largeCustomDictionary(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryArgs.Builder]):
        com.pulumi.gcp.dataloss.PreventionStoredInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryArgs.builder
      builder.largeCustomDictionary(args(argsBuilder).build)

    /**
     * @param regex Regular expression which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def regex(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeRegexArgs.Builder]):
        com.pulumi.gcp.dataloss.PreventionStoredInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeRegexArgs.builder
      builder.regex(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.PreventionJobTriggerArgs.Builder)
    /**
     * @param inspectJob Controls what and how to inspect for findings.
     *  Structure is documented below.
     * @return builder
     */
    def inspectJob(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobArgs.Builder]):
        com.pulumi.gcp.dataloss.PreventionJobTriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobArgs.builder
      builder.inspectJob(args(argsBuilder).build)

    /**
     * @param triggers What event needs to occur for a new job to be started.
     *  Structure is documented below.
     * @return builder
     */
    def triggers(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerArgs.Builder]*):
        com.pulumi.gcp.dataloss.PreventionJobTriggerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerArgs.builder
      builder.triggers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder)
    /**
     * @param max Upper bound of the range, exclusive; type must match min.
     *  The `max` block must only contain one argument. See the `bucketingConfig` block description for more information about choosing a data type.
     *  Structure is documented below.
     * @return builder
     */
    def max(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.builder
      builder.max(args(argsBuilder).build)

    /**
     * @param min Lower bound of the range, inclusive. Type should be the same as max if used.
     *  The `min` block must only contain one argument. See the `bucketingConfig` block description for more information about choosing a data type.
     *  Structure is documented below.
     * @return builder
     */
    def min(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.builder
      builder.min(args(argsBuilder).build)

    /**
     * @param replacementValue Replacement value for this bucket.
     *  The `replacementValue` block must only contain one argument.
     *  Structure is documented below.
     * @return builder
     */
    def replacementValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.builder
      builder.replacementValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsArgs.Builder)
    /**
     * @param conditions Conditions to apply to the expression.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsArgs.builder
      builder.conditions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionArgs.Builder)
    /**
     * @param condition A condition that when it evaluates to true will result in the record being evaluated to be suppressed from the transformed content.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs.Builder)
    /**
     * @param infoTypes If a finding is matched by any of the infoType detectors listed here, the finding will be excluded from the scan results.
     *  Structure is documented below.
     * @return builder
     */
    def infoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesInfoTypeArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesInfoTypeArgs.builder
      builder.infoTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs.Builder)
    /**
     * @param infoTypes InfoTypes to apply the transformation to. Leaving this empty will apply the transformation to apply to
     *  all findings that correspond to infoTypes that were requested in InspectConfig.
     *  Structure is documented below.
     * @return builder
     */
    def infoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArgs.builder
      builder.infoTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param primitiveTransformation Apply the transformation to the entire field.
     *  The `primitiveTransformation` block must only contain one argument, corresponding to the type of transformation.
     *  Structure is documented below.
     * @return builder
     */
    def primitiveTransformation(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.builder
      builder.primitiveTransformation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigState.Builder)
    /**
     * @param actions Actions to execute at the completion of scanning
     *  Structure is documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param errors Output only. A stream of errors encountered when the config was activated. Repeated errors may result in the config automatically being paused. Output only field. Will return the last 100 errors. Whenever the config is modified this list will be cleared.
     *  Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigErrorArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param orgConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def orgConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOrgConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOrgConfigArgs.builder
      builder.orgConfig(args(argsBuilder).build)

    /**
     * @param otherCloudStartingLocation A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def otherCloudStartingLocation(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOtherCloudStartingLocationArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOtherCloudStartingLocationArgs.builder
      builder.otherCloudStartingLocation(args(argsBuilder).build)

    /**
     * @param targets Target to match against for determining what to scan and how frequently
     *  Structure is documented below.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsArgs.Builder)
    /**
     * @param conditions A collection of conditions.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigArgs.Builder)
    /**
     * @param wordList A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
     *  Structure is documented below.
     * @return builder
     */
    def wordList(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigWordListArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigWordListArgs.builder
      builder.wordList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionTagResourcesTagConditionArgs.Builder)
    /**
     * @param sensitivityScore Conditions attaching the tag to a resource on its profile having this sensitivity score.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionTagResourcesTagConditionSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionTagResourcesTagConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionTagResourcesTagConditionSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

    /**
     * @param tag The tag value to attach to resources.
     *  Structure is documented below.
     * @return builder
     */
    def tag(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionTagResourcesTagConditionTagArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionTagResourcesTagConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionTagResourcesTagConditionTagArgs.builder
      builder.tag(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigArgs.Builder)
    /**
     * @param imageTransformations Treat the dataset as an image and redact.
     *  Structure is documented below.
     * @return builder
     */
    def imageTransformations(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsArgs.builder
      builder.imageTransformations(args(argsBuilder).build)

    /**
     * @param infoTypeTransformations Treat the dataset as free-form text and apply the same free text transformation everywhere
     *  Structure is documented below.
     * @return builder
     */
    def infoTypeTransformations(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs.builder
      builder.infoTypeTransformations(args(argsBuilder).build)

    /**
     * @param recordTransformations Treat the dataset as structured. Transformations can be applied to specific locations within structured datasets, such as transforming a column within a table.
     *  Structure is documented below.
     * @return builder
     */
    def recordTransformations(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsArgs.builder
      builder.recordTransformations(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder)
    /**
     * @param kmsWrapped KMS wrapped key.
     *  Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     *  For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key). Only one of this, `transient` or `unwrapped` must be specified.
     *  Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     *  Structure is documented below.
     * @return builder
     */
    def kmsWrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyKmsWrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyKmsWrappedArgs.builder
      builder.kmsWrapped(args(argsBuilder).build)

    /**
     * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes. Only one of this, `unwrapped` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def transient_(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyTransientArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyTransientArgs.builder
      builder.transient_(args(argsBuilder).build)

    /**
     * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible. Only one of this, `transient` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def unwrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyUnwrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyUnwrappedArgs.builder
      builder.unwrapped(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOrgConfigArgs.Builder)
    /**
     * @param location The data to scan folder org or project
     *  Structure is documented below.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOrgConfigLocationArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOrgConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOrgConfigLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionArgs.Builder)
    /**
     * @param deidentify Create a de-identified copy of the requested table or files.
     *  Structure is documented below.
     * @return builder
     */
    def deidentify(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionDeidentifyArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionDeidentifyArgs.builder
      builder.deidentify(args(argsBuilder).build)

    /**
     * @param jobNotificationEmails Sends an email when the job completes. The email goes to IAM project owners and technical Essential Contacts.
     * @return builder
     */
    def jobNotificationEmails(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionJobNotificationEmailsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionJobNotificationEmailsArgs.builder
      builder.jobNotificationEmails(args(argsBuilder).build)

    /**
     * @param pubSub Publish a message into a given Pub/Sub topic when the job completes.
     *  Structure is documented below.
     * @return builder
     */
    def pubSub(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionPubSubArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionPubSubArgs.builder
      builder.pubSub(args(argsBuilder).build)

    /**
     * @param publishFindingsToCloudDataCatalog (Optional, Deprecated)
     *  Publish findings of a DlpJob to Data Catalog.
     * 
     *  &gt; **Warning:** `publishFindingsToCloudDataCatalog` is deprecated and will be removed in a future major release. To publish findings to Dataplex Catalog, use `publishFindingsToDataplexCatalog` instead.
     * @return builder
     * @deprecated `publishFindingsToCloudDataCatalog` is deprecated and will be removed in a future major release. To publish findings to Dataplex Catalog, use `publishFindingsToDataplexCatalog` instead.
     */
    @deprecated def publishFindingsToCloudDataCatalog(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionPublishFindingsToCloudDataCatalogArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionPublishFindingsToCloudDataCatalogArgs.builder
      builder.publishFindingsToCloudDataCatalog(args(argsBuilder).build)

    /**
     * @param publishFindingsToDataplexCatalog Publish findings of a DlpJob as an aspect to Dataplex Universal Catalog.
     * @return builder
     */
    def publishFindingsToDataplexCatalog(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionPublishFindingsToDataplexCatalogArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionPublishFindingsToDataplexCatalogArgs.builder
      builder.publishFindingsToDataplexCatalog(args(argsBuilder).build)

    /**
     * @param publishSummaryToCscc Publish the result summary of a DlpJob to the Cloud Security Command Center.
     * @return builder
     */
    def publishSummaryToCscc(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionPublishSummaryToCsccArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionPublishSummaryToCsccArgs.builder
      builder.publishSummaryToCscc(args(argsBuilder).build)

    /**
     * @param publishToStackdriver Enable Stackdriver metric dlp.googleapis.com/findingCount.
     * @return builder
     */
    def publishToStackdriver(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionPublishToStackdriverArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionPublishToStackdriverArgs.builder
      builder.publishToStackdriver(args(argsBuilder).build)

    /**
     * @param saveFindings If set, the detailed findings will be persisted to the specified OutputStorageConfig. Only a single instance of this action can be specified. Compatible with: Inspect, Risk
     *  Structure is documented below.
     * @return builder
     */
    def saveFindings(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsArgs.builder
      builder.saveFindings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs.Builder)
    /**
     * @param infoType Type of information the findings limit applies to. Only one limit per infoType should be provided. If InfoTypeLimit does
     *  not have an infoType, the DLP API applies the limit against all infoTypes that are found but not
     *  specified in another InfoTypeLimit.
     *  Structure is documented below.
     * @return builder
     */
    def infoType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs.builder
      builder.infoType(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionTagResourcesArgs.Builder)
    /**
     * @param tagConditions The tags to associate with different conditions.
     *  Structure is documented below.
     * @return builder
     */
    def tagConditions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionTagResourcesTagConditionArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionTagResourcesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionTagResourcesTagConditionArgs.builder
      builder.tagConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetGenerationCadenceArgs.Builder)
    /**
     * @param inspectTemplateModifiedCadence Governs when to update data profiles when the inspection rules defined by the `InspectTemplate` change. If not set, changing the template will not cause a data profile to update.
     *  Structure is documented below.
     * @return builder
     */
    def inspectTemplateModifiedCadence(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetGenerationCadenceInspectTemplateModifiedCadenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetGenerationCadenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetGenerationCadenceInspectTemplateModifiedCadenceArgs.builder
      builder.inspectTemplateModifiedCadence(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigHybridOptionsArgs.Builder)
    /**
     * @param tableOptions If the container is a table, additional information to make findings meaningful such as the columns that are primary keys.
     *  Structure is documented below.
     * @return builder
     */
    def tableOptions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigHybridOptionsTableOptionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigHybridOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigHybridOptionsTableOptionsArgs.builder
      builder.tableOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetCadenceArgs.Builder)
    /**
     * @param inspectTemplateModifiedCadence Governs when to update data profiles when the inspection rules defined by the `InspectTemplate` change. If not set, changing the template will not cause a data profile to update.
     *  Structure is documented below.
     * @return builder
     */
    def inspectTemplateModifiedCadence(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetCadenceInspectTemplateModifiedCadenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetCadenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetCadenceInspectTemplateModifiedCadenceArgs.builder
      builder.inspectTemplateModifiedCadence(args(argsBuilder).build)

    /**
     * @param schemaModifiedCadence Governs when to update data profiles when a schema is modified
     *  Structure is documented below.
     * @return builder
     */
    def schemaModifiedCadence(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetCadenceSchemaModifiedCadenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetCadenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetCadenceSchemaModifiedCadenceArgs.builder
      builder.schemaModifiedCadence(args(argsBuilder).build)

    /**
     * @param tableModifiedCadence Governs when to update profile when a table is modified.
     *  Structure is documented below.
     * @return builder
     */
    def tableModifiedCadence(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetCadenceTableModifiedCadenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetCadenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetCadenceTableModifiedCadenceArgs.builder
      builder.tableModifiedCadence(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationPubsubConditionArgs.Builder)
    /**
     * @param expressions An expression
     *  Structure is documented below.
     * @return builder
     */
    def expressions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationPubsubConditionExpressionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationPubsubConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationPubsubConditionExpressionsArgs.builder
      builder.expressions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMinDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMinDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMinTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMinTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterArgs.Builder)
    /**
     * @param otherTables Catch-all. This should always be the last filter in the list because anything above it will apply first.
     * @return builder
     */
    def otherTables(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterOtherTablesArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterOtherTablesArgs.builder
      builder.otherTables(args(argsBuilder).build)

    /**
     * @param tableReference The table to scan. Discovery configurations including this can only include one DiscoveryTarget (the DiscoveryTarget with this TableReference).
     *  Structure is documented below.
     * @return builder
     */
    def tableReference(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTableReferenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTableReferenceArgs.builder
      builder.tableReference(args(argsBuilder).build)

    /**
     * @param tables A specific set of tables for this filter to apply to. A table collection must be specified in only one filter per config.
     *  Structure is documented below.
     * @return builder
     */
    def tables(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesArgs.builder
      builder.tables(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigArgs.Builder)
    /**
     * @param cryptoKey The key used by the encryption function.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKey(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.builder
      builder.cryptoKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs.Builder)
    /**
     * @param context Points to the field that contains the context, for example, an entity id.
     *  If set, must also set cryptoKey. If set, shift will be consistent for the given context.
     *  Structure is documented below.
     * @return builder
     */
    def context(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigContextArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigContextArgs.builder
      builder.context(args(argsBuilder).build)

    /**
     * @param cryptoKey Causes the shift to be computed based on this key and the context. This results in the same shift for the same context and cryptoKey. If set, must also set context. Can only be applied to table items.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKey(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.builder
      builder.cryptoKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOtherCloudStartingLocationArgs.Builder)
    /**
     * @param awsLocation A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def awsLocation(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOtherCloudStartingLocationAwsLocationArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOtherCloudStartingLocationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigOtherCloudStartingLocationAwsLocationArgs.builder
      builder.awsLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesIncludeRegexesArgs.Builder)
    /**
     * @param patterns The group of regular expression patterns to match against one or more resources. Maximum of 100 entries. The sum of all lengths of regular expressions can&#39;t exceed 10 KiB.
     *  Structure is documented below.
     * @return builder
     */
    def patterns(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesIncludeRegexesPatternArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesIncludeRegexesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesIncludeRegexesPatternArgs.builder
      builder.patterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetArgs.Builder)
    /**
     * @param infoTypes List of infoTypes this rule set is applied to.
     *  Structure is documented below.
     * @return builder
     */
    def infoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetInfoTypeArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetInfoTypeArgs.builder
      builder.infoTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param rules Set of rules to be applied to infoTypes. The rules are applied in order.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder)
    /**
     * @param kmsWrapped KMS wrapped key.
     *  Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     *  For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key). Only one of this, `transient` or `unwrapped` must be specified.
     *  Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     *  Structure is documented below.
     * @return builder
     */
    def kmsWrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyKmsWrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyKmsWrappedArgs.builder
      builder.kmsWrapped(args(argsBuilder).build)

    /**
     * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes. Only one of this, `unwrapped` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def transient_(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyTransientArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyTransientArgs.builder
      builder.transient_(args(argsBuilder).build)

    /**
     * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible. Only one of this, `transient` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def unwrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyUnwrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyUnwrappedArgs.builder
      builder.unwrapped(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigErrorArgs.Builder)
    /**
     * @param details A list of messages that carry the error details.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigErrorDetailsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigErrorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigErrorDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsArgs.Builder)
    /**
     * @param transformations Transformation for each infoType. Cannot specify more than one for a given infoType.
     *  Structure is documented below.
     * @return builder
     */
    def transformations(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationArgs.builder
      builder.transformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs.Builder)
    /**
     * @param infoTypes If a finding is matched by any of the infoType detectors listed here, the finding will be excluded from the scan results.
     *  Structure is documented below.
     * @return builder
     */
    def infoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesInfoTypeArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesInfoTypeArgs.builder
      builder.infoTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldArgs.Builder)
    /**
     * @param field Designated field in the BigQuery table.
     *  Structure is documented below.
     * @return builder
     */
    def field(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldArgs.builder
      builder.field(args(argsBuilder).build)

    /**
     * @param table Field in a BigQuery table where each cell represents a dictionary phrase.
     *  Structure is documented below.
     * @return builder
     */
    def table(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableArgs.builder
      builder.table(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsArgs.Builder)
    /**
     * @param transforms For determination of how redaction of images should occur.
     *  Structure is documented below.
     * @return builder
     */
    def transforms(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArgs.builder
      builder.transforms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCharacterMaskConfigArgs.Builder)
    /**
     * @param charactersToIgnores Characters to skip when doing de-identification of a value. These will be left alone and skipped.
     *  Structure is documented below.
     * @return builder
     */
    def charactersToIgnores(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCharacterMaskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs.builder
      builder.charactersToIgnores(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigArgs.Builder)
    /**
     * @param wordList A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
     *  Structure is documented below.
     * @return builder
     */
    def wordList(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigWordListArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigWordListArgs.builder
      builder.wordList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs.Builder)
    /**
     * @param expressions An expression, consisting of an operator and conditions.
     *  Structure is documented below.
     * @return builder
     */
    def expressions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsArgs.builder
      builder.expressions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionArgs.Builder)
    /**
     * @param includeRegexes A collection of regular expressions to match a resource against.
     *  Structure is documented below.
     * @return builder
     */
    def includeRegexes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesArgs.builder
      builder.includeRegexes(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterArgs.Builder)
    /**
     * @param cloudStorageResourceReference The bucket to scan. Targets including this can only include one target (the target with this bucket). This enables profiling the contents of a single bucket, while the other options allow for easy profiling of many buckets within a project or an organization.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStorageResourceReference(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCloudStorageResourceReferenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCloudStorageResourceReferenceArgs.builder
      builder.cloudStorageResourceReference(args(argsBuilder).build)

    /**
     * @param collection A collection of resources for this filter to apply to.
     *  Structure is documented below.
     * @return builder
     */
    def collection(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionArgs.builder
      builder.collection(args(argsBuilder).build)

    /**
     * @param others Match discovery resources not covered by any other filter.
     * @return builder
     */
    def others(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterOthersArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterOthersArgs.builder
      builder.others(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionArgs.Builder)
    /**
     * @param expressions An expression, consisting of an operator and conditions.
     *  Structure is documented below.
     * @return builder
     */
    def expressions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsArgs.builder
      builder.expressions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationArgs.Builder)
    /**
     * @param pubsubCondition Conditions for triggering pubsub
     *  Structure is documented below.
     * @return builder
     */
    def pubsubCondition(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationPubsubConditionArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationPubsubConditionArgs.builder
      builder.pubsubCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleDictionaryArgs.Builder)
    /**
     * @param cloudStoragePath Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStoragePath(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleDictionaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathArgs.builder
      builder.cloudStoragePath(args(argsBuilder).build)

    /**
     * @param wordList List of words or phrases to search for.
     *  Structure is documented below.
     * @return builder
     */
    def wordList(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleDictionaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs.builder
      builder.wordList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeArgs.Builder)
    /**
     * @param dictionary Dictionary which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def dictionary(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs.builder
      builder.dictionary(args(argsBuilder).build)

    /**
     * @param infoType CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
     *  infoTypes and that infoType is specified in `infoTypes` field. Specifying the latter adds findings to the
     *  one detected by the system. If built-in info type is not specified in `infoTypes` list then the name is
     *  treated as a custom info type.
     *  Structure is documented below.
     * @return builder
     */
    def infoType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeArgs.builder
      builder.infoType(args(argsBuilder).build)

    /**
     * @param regex Regular expression which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def regex(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeRegexArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeRegexArgs.builder
      builder.regex(args(argsBuilder).build)

    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

    /**
     * @param storedType A reference to a StoredInfoType to use with scanning.
     *  Structure is documented below.
     * @return builder
     */
    def storedType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeArgs.builder
      builder.storedType(args(argsBuilder).build)

    /**
     * @param surrogateType Message for detecting output from deidentification transformations that support reversing.
     * @return builder
     */
    def surrogateType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeSurrogateTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeSurrogateTypeArgs.builder
      builder.surrogateType(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetArgs.Builder)
    /**
     * @param conditions In addition to matching the filter, these conditions must be true before a profile is generated.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetConditionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetConditionsArgs.builder
      builder.conditions(args(argsBuilder).build)

    /**
     * @param disabled Disable profiling for buckets that match this filter.
     * @return builder
     */
    def disabled(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetDisabledArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetDisabledArgs.builder
      builder.disabled(args(argsBuilder).build)

    /**
     * @param filter The buckets the generationCadence applies to. The first target with a matching filter will be the one to apply to a bucket.
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param generationCadence How often and when to update profiles. New buckets that match both the filter and conditions are scanned as quickly as possible depending on system capacity.
     *  Structure is documented below.
     * @return builder
     */
    def generationCadence(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetGenerationCadenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetGenerationCadenceArgs.builder
      builder.generationCadence(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesArgs.Builder)
    /**
     * @param patterns The group of regular expression patterns to match against one or more resources. Maximum of 100 entries. The sum of all lengths of regular expressions can&#39;t exceed 10 KiB.
     *  Structure is documented below.
     * @return builder
     */
    def patterns(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPatternArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPatternArgs.builder
      builder.patterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleArgs.Builder)
    /**
     * @param exclusionRule The rule that specifies conditions when findings of infoTypes specified in InspectionRuleSet are removed from results.
     *  Structure is documented below.
     * @return builder
     */
    def exclusionRule(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs.builder
      builder.exclusionRule(args(argsBuilder).build)

    /**
     * @param hotwordRule Hotword-based detection rule.
     *  Structure is documented below.
     * @return builder
     */
    def hotwordRule(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs.builder
      builder.hotwordRule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder)
    /**
     * @param context A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during encryption, same context must be provided during decryption as well.
     *  If the context is not set, plaintext would be used as is for encryption. If the context is set but:
     *  1. there is no record present when transforming a given value or
     *  2. the field is not present when transforming a given value,
     *     plaintext would be used as is for encryption.
     *     Note that case (1) is expected when an InfoTypeTransformation is applied to both structured and unstructured ContentItems.
     *     Structure is documented below.
     * @return builder
     */
    def context(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigContextArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigContextArgs.builder
      builder.context(args(argsBuilder).build)

    /**
     * @param cryptoKey The key used by the encryption function. For deterministic encryption using AES-SIV, the provided key is internally expanded to 64 bytes prior to use.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKey(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.builder
      builder.cryptoKey(args(argsBuilder).build)

    /**
     * @param surrogateInfoType The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate}
     *  For example, if the name of custom info type is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
     *  This annotation identifies the surrogate when inspecting content using the custom info type &#39;Surrogate&#39;. This facilitates reversal of the surrogate when it occurs in free text.
     *  Note: For record transformations where the entire cell in a table is being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text.
     *  In order for inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either
     *  *   reverse a surrogate that does not correspond to an actual identifier
     *  *   be unable to parse the surrogate and result in an error
     *      Therefore, choose your custom info type name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: \u29ddMY\_TOKEN\_TYPE.
     *      Structure is documented below.
     * @return builder
     */
    def surrogateInfoType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs.builder
      builder.surrogateInfoType(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder)
    /**
     * @param context A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during encryption, same context must be provided during decryption as well.
     *  If the context is not set, plaintext would be used as is for encryption. If the context is set but:
     *  1. there is no record present when transforming a given value or
     *  2. the field is not present when transforming a given value,
     *     plaintext would be used as is for encryption.
     *     Note that case (1) is expected when an InfoTypeTransformation is applied to both structured and unstructured ContentItems.
     *     Structure is documented below.
     * @return builder
     */
    def context(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigContextArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigContextArgs.builder
      builder.context(args(argsBuilder).build)

    /**
     * @param cryptoKey The key used by the encryption function. For deterministic encryption using AES-SIV, the provided key is internally expanded to 64 bytes prior to use.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKey(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.builder
      builder.cryptoKey(args(argsBuilder).build)

    /**
     * @param surrogateInfoType The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate}
     *  For example, if the name of custom info type is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
     *  This annotation identifies the surrogate when inspecting content using the custom info type &#39;Surrogate&#39;. This facilitates reversal of the surrogate when it occurs in free text.
     *  Note: For record transformations where the entire cell in a table is being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text.
     *  In order for inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either
     *  *   reverse a surrogate that does not correspond to an actual identifier
     *  *   be unable to parse the surrogate and result in an error
     *      Therefore, choose your custom info type name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: \u29ddMY\_TOKEN\_TYPE.
     *      Structure is documented below.
     * @return builder
     */
    def surrogateInfoType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs.builder
      builder.surrogateInfoType(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArgs.Builder)
    /**
     * @param allInfoTypes Apply transformation to all findings not specified in other ImageTransformation&#39;s selectedInfoTypes.
     * @return builder
     */
    def allInfoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformAllInfoTypesArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformAllInfoTypesArgs.builder
      builder.allInfoTypes(args(argsBuilder).build)

    /**
     * @param allText Apply transformation to all text that doesn&#39;t match an infoType.
     * @return builder
     */
    def allText(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformAllTextArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformAllTextArgs.builder
      builder.allText(args(argsBuilder).build)

    /**
     * @param redactionColor The color to use when redacting content from an image. If not specified, the default is black.
     *  Structure is documented below.
     * @return builder
     */
    def redactionColor(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformRedactionColorArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformRedactionColorArgs.builder
      builder.redactionColor(args(argsBuilder).build)

    /**
     * @param selectedInfoTypes Apply transformation to the selected infoTypes.
     *  Structure is documented below.
     * @return builder
     */
    def selectedInfoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesArgs.builder
      builder.selectedInfoTypes(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder)
    /**
     * @param kmsWrapped KMS wrapped key.
     *  Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     *  For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key). Only one of this, `transient` or `unwrapped` must be specified.
     *  Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     *  Structure is documented below.
     * @return builder
     */
    def kmsWrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs.builder
      builder.kmsWrapped(args(argsBuilder).build)

    /**
     * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes. Only one of this, `unwrapped` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def transient_(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientArgs.builder
      builder.transient_(args(argsBuilder).build)

    /**
     * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible. Only one of this, `transient` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def unwrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedArgs.builder
      builder.unwrapped(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionExportDataArgs.Builder)
    /**
     * @param profileTable Store all table and column profiles in an existing table or a new table in an existing dataset. Each re-generation will result in a new row in BigQuery.
     *  The system will create a new dataset and table for you if none are are provided. The dataset will be named `sensitiveDataProtectionDiscovery`
     *  and table will be named `discoveryProfiles`. This table will be placed in the same project as the container project running the scan.
     *  Structure is documented below.
     * @return builder
     */
    def profileTable(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionExportDataProfileTableArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionExportDataArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionExportDataProfileTableArgs.builder
      builder.profileTable(args(argsBuilder).build)

    /**
     * @param sampleFindingsTable Store sample findings in an existing table or a new table in an existing dataset. Each re-generation will result in a new row in BigQuery
     *  Structure is documented below.
     * @return builder
     */
    def sampleFindingsTable(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionExportDataSampleFindingsTableArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionExportDataArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionExportDataSampleFindingsTableArgs.builder
      builder.sampleFindingsTable(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetArgs.Builder)
    /**
     * @param cadence How often and when to update profiles. New tables that match both the fiter and conditions are scanned as quickly as possible depending on system capacity.
     *  Structure is documented below.
     * @return builder
     */
    def cadence(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetCadenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetCadenceArgs.builder
      builder.cadence(args(argsBuilder).build)

    /**
     * @param conditions In addition to matching the filter, these conditions must be true before a profile is generated
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetConditionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetConditionsArgs.builder
      builder.conditions(args(argsBuilder).build)

    /**
     * @param disabled Tables that match this filter will not have profiles created.
     * @return builder
     */
    def disabled(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetDisabledArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetDisabledArgs.builder
      builder.disabled(args(argsBuilder).build)

    /**
     * @param filter Required. The tables the discovery cadence applies to. The first target with a matching filter will be the one to apply to a table
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadenceArgs.Builder)
    /**
     * @param inspectTemplateModifiedCadence Governs when to update data profiles when the inspection rules defined by the `InspectTemplate` change. If not set, changing the template will not cause a data profile to update.
     *  Structure is documented below.
     * @return builder
     */
    def inspectTemplateModifiedCadence(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadenceInspectTemplateModifiedCadenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadenceInspectTemplateModifiedCadenceArgs.builder
      builder.inspectTemplateModifiedCadence(args(argsBuilder).build)

    /**
     * @param schemaModifiedCadence Governs when to update data profiles when a schema is modified
     *  Structure is documented below.
     * @return builder
     */
    def schemaModifiedCadence(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadenceSchemaModifiedCadenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadenceSchemaModifiedCadenceArgs.builder
      builder.schemaModifiedCadence(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder)
    /**
     * @param kmsWrapped KMS wrapped key.
     *  Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     *  For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key). Only one of this, `transient` or `unwrapped` must be specified.
     *  Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     *  Structure is documented below.
     * @return builder
     */
    def kmsWrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyKmsWrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyKmsWrappedArgs.builder
      builder.kmsWrapped(args(argsBuilder).build)

    /**
     * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes. Only one of this, `unwrapped` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def transient_(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyTransientArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyTransientArgs.builder
      builder.transient_(args(argsBuilder).build)

    /**
     * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible. Only one of this, `transient` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def unwrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyUnwrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyUnwrappedArgs.builder
      builder.unwrapped(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobArgs.Builder)
    /**
     * @param actions Configuration block for the actions to execute on the completion of a job. Can be specified multiple times, but only one for each type. Each action block supports fields documented below. This argument is processed in attribute-as-blocks mode.
     *  Structure is documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param inspectConfig The core content of the template.
     *  Structure is documented below.
     * @return builder
     */
    def inspectConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigArgs.builder
      builder.inspectConfig(args(argsBuilder).build)

    /**
     * @param storageConfig Information on where to inspect
     *  Structure is documented below.
     * @return builder
     */
    def storageConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigArgs.builder
      builder.storageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigArgs.Builder)
    /**
     * @param buckets Set of buckets. Ranges must be non-overlapping.
     *  Bucket is represented as a range, along with replacement values.
     *  Structure is documented below.
     * @return builder
     */
    def buckets(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs.builder
      builder.buckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionValueArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionValueDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionValueDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionValueTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionValueTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs.Builder)
    /**
     * @param kind A representation of a Datastore kind.
     *  Structure is documented below.
     * @return builder
     */
    def kind(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKindArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKindArgs.builder
      builder.kind(args(argsBuilder).build)

    /**
     * @param partitionId Datastore partition ID. A partition ID identifies a grouping of entities. The grouping
     *  is always by project and namespace, however the namespace ID may be empty.
     *  Structure is documented below.
     * @return builder
     */
    def partitionId(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdArgs.builder
      builder.partitionId(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs.Builder)
    /**
     * @param timestampField Specification of the field containing the timestamp of scanned items.
     *  Structure is documented below.
     * @return builder
     */
    def timestampField(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldArgs.builder
      builder.timestampField(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetArgs.Builder)
    /**
     * @param conditions In addition to matching the filter, these conditions must be true before a profile is generated.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetConditionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetConditionsArgs.builder
      builder.conditions(args(argsBuilder).build)

    /**
     * @param disabled Disable profiling for database resources that match this filter.
     * @return builder
     */
    def disabled(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetDisabledArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetDisabledArgs.builder
      builder.disabled(args(argsBuilder).build)

    /**
     * @param filter Required. The tables the discovery cadence applies to. The first target with a matching filter will be the one to apply to a table.
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param generationCadence How often and when to update profiles. New tables that match both the filter and conditions are scanned as quickly as possible depending on system capacity.
     *  Structure is documented below.
     * @return builder
     */
    def generationCadence(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadenceArgs.builder
      builder.generationCadence(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder)
    /**
     * @param context The &#39;tweak&#39;, a context may be used for higher security since the same identifier in two different contexts won&#39;t be given the same surrogate. If the context is not set, a default tweak will be used.
     *  If the context is set but:
     *  1.  there is no record present when transforming a given value or
     *  2.  the field is not present when transforming a given value,
     *      a default tweak will be used.
     *      Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s. Currently, the referenced field may be of value type integer or string.
     *      The tweak is constructed as a sequence of bytes in big endian byte order such that:
     *  *   a 64 bit integer is encoded followed by a single byte of value 1
     *  *   a string is encoded in UTF-8 format followed by a single byte of value 2
     *      Structure is documented below.
     * @return builder
     */
    def context(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs.builder
      builder.context(args(argsBuilder).build)

    /**
     * @param cryptoKey The key used by the encryption algorithm.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKey(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.builder
      builder.cryptoKey(args(argsBuilder).build)

    /**
     * @param surrogateInfoType The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of characters comprising the surrogate. The following scheme defines the format: info\_type\_name(surrogate\_character\_count):surrogate
     *  For example, if the name of custom infoType is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
     *  This annotation identifies the surrogate when inspecting content using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it occurs in free text.
     *  In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: \u29ddMY\_TOKEN\_TYPE
     *  Structure is documented below.
     * @return builder
     */
    def surrogateInfoType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs.builder
      builder.surrogateInfoType(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder)
    /**
     * @param kmsWrapped KMS wrapped key.
     *  Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     *  For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key). Only one of this, `transient` or `unwrapped` must be specified.
     *  Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     *  Structure is documented below.
     * @return builder
     */
    def kmsWrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs.builder
      builder.kmsWrapped(args(argsBuilder).build)

    /**
     * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes. Only one of this, `unwrapped` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def transient_(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyTransientArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyTransientArgs.builder
      builder.transient_(args(argsBuilder).build)

    /**
     * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible. Only one of this, `transient` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def unwrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrappedArgs.builder
      builder.unwrapped(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs.Builder)
    /**
     * @param storagePath Store findings in an existing Cloud Storage bucket. Files will be generated with the job ID and file part number
     *  as the filename, and will contain findings in textproto format as SaveToGcsFindingsOutput. The file name will use
     *  the naming convention &lt;job_id&gt;-&lt;shard_number&gt;, for example: my-job-id-2.
     *  Supported for InspectJobs. The bucket must not be the same as the bucket being inspected. If storing findings to
     *  Cloud Storage, the output schema field should not be set. If set, it will be ignored.
     *  Structure is documented below.
     * @return builder
     */
    def storagePath(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigStoragePathArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigStoragePathArgs.builder
      builder.storagePath(args(argsBuilder).build)

    /**
     * @param table Information on the location of the target BigQuery Table.
     *  Structure is documented below.
     * @return builder
     */
    def table(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs.builder
      builder.table(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterSingleResourceAmazonS3BucketArgs.Builder)
    /**
     * @param awsAccount The AWS account.
     * @return builder
     */
    def awsAccount(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterSingleResourceAmazonS3BucketAwsAccountArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterSingleResourceAmazonS3BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterSingleResourceAmazonS3BucketAwsAccountArgs.builder
      builder.awsAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterSingleResourceArgs.Builder)
    /**
     * @param amazonS3Bucket Amazon S3 bucket.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedTargetsOtherCloudTargetFilterSingleResourceAmazonS3Bucket&#34;&gt;&lt;/a&gt;The `amazonS3Bucket` block supports:
     * @return builder
     */
    def amazonS3Bucket(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterSingleResourceAmazonS3BucketArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterSingleResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterSingleResourceAmazonS3BucketArgs.builder
      builder.amazonS3Bucket(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsArgs.Builder)
    /**
     * @param conditions A collection of conditions.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder)
    /**
     * @param kmsWrapped KMS wrapped key.
     *  Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     *  For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key). Only one of this, `transient` or `unwrapped` must be specified.
     *  Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     *  Structure is documented below.
     * @return builder
     */
    def kmsWrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs.builder
      builder.kmsWrapped(args(argsBuilder).build)

    /**
     * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes. Only one of this, `unwrapped` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def transient_(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyTransientArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyTransientArgs.builder
      builder.transient_(args(argsBuilder).build)

    /**
     * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible. Only one of this, `transient` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def unwrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrappedArgs.builder
      builder.unwrapped(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesPatternArgs.Builder)
    /**
     * @param amazonS3BucketRegex Regex for Cloud Storage.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedTargetsOtherCloudTargetFilterCollectionIncludeRegexesPatternsAmazonS3BucketRegex&#34;&gt;&lt;/a&gt;The `amazonS3BucketRegex` block supports:
     * @return builder
     */
    def amazonS3BucketRegex(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesPatternAmazonS3BucketRegexArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesPatternArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesPatternAmazonS3BucketRegexArgs.builder
      builder.amazonS3BucketRegex(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationPubsubConditionExpressionsArgs.Builder)
    /**
     * @param conditions Conditions to apply to the expression
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationPubsubConditionExpressionsConditionArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationPubsubConditionExpressionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationPubsubConditionExpressionsConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs.Builder)
    /**
     * @param transformations Transformation for each infoType. Cannot specify more than one for a given infoType.
     *  Structure is documented below.
     * @return builder
     */
    def transformations(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationArgs.builder
      builder.transformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs.Builder)
    /**
     * @param hotwordRegex Regular expression pattern defining what qualifies as a hotword.
     *  Structure is documented below.
     * @return builder
     */
    def hotwordRegex(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs.builder
      builder.hotwordRegex(args(argsBuilder).build)

    /**
     * @param likelihoodAdjustment Likelihood adjustment to apply to all matching findings.
     *  Structure is documented below.
     * @return builder
     */
    def likelihoodAdjustment(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs.builder
      builder.likelihoodAdjustment(args(argsBuilder).build)

    /**
     * @param proximity Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
     *  exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
     *  used to match substrings of the finding itself. For example, the certainty of a phone number regex
     *  `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
     *  office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
     *  Structure is documented below.
     * @return builder
     */
    def proximity(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs.builder
      builder.proximity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigArgs.Builder)
    /**
     * @param cryptoKey The key used by the encryption function.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKey(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.builder
      builder.cryptoKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.Builder)
    /**
     * @param bucketingConfig Generalization function that buckets values based on ranges. The ranges and replacement values are dynamically provided by the user for custom behavior, such as 1-30 &gt; LOW 31-65 &gt; MEDIUM 66-100 &gt; HIGH
     *  This can be used on data of type: number, long, string, timestamp.
     *  If the provided value type differs from the type of data being transformed, we will first attempt converting the type of the data to be transformed to match the type of the bound before comparing.
     *  See https://cloud.google.com/dlp/docs/concepts-bucketing to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def bucketingConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigArgs.builder
      builder.bucketingConfig(args(argsBuilder).build)

    /**
     * @param characterMaskConfig Partially mask a string by replacing a given number of characters with a fixed character. Masking can start from the beginning or end of the string. This can be used on data of any type (numbers, longs, and so on) and when de-identifying structured data we&#39;ll attempt to preserve the original data&#39;s type. (This allows you to take a long like 123 and modify it to a string like **3).
     *  Structure is documented below.
     * @return builder
     */
    def characterMaskConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCharacterMaskConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCharacterMaskConfigArgs.builder
      builder.characterMaskConfig(args(argsBuilder).build)

    /**
     * @param cryptoDeterministicConfig Pseudonymization method that generates deterministic encryption for the given input. Outputs a base64 encoded representation of the encrypted output. Uses AES-SIV based on the RFC [https://tools.ietf.org/html/rfc5297](https://tools.ietf.org/html/rfc5297).
     *  Structure is documented below.
     * @return builder
     */
    def cryptoDeterministicConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.builder
      builder.cryptoDeterministicConfig(args(argsBuilder).build)

    /**
     * @param cryptoHashConfig Pseudonymization method that generates surrogates via cryptographic hashing. Uses SHA-256. The key size must be either 32 or 64 bytes.
     *  Outputs a base64 encoded representation of the hashed output (for example, L7k0BHmF1ha5U3NfGykjro4xWi1MPVQPjhMAZbSV9mM=).
     *  Currently, only string and integer values can be hashed.
     *  See https://cloud.google.com/dlp/docs/pseudonymization to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoHashConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigArgs.builder
      builder.cryptoHashConfig(args(argsBuilder).build)

    /**
     * @param cryptoReplaceFfxFpeConfig Replaces an identifier with a surrogate using Format Preserving Encryption (FPE) with the FFX mode of operation; however when used in the `content.reidentify` API method, it serves the opposite function by reversing the surrogate back into the original identifier. The identifier must be encoded as ASCII. For a given crypto key and context, the same identifier will be replaced with the same surrogate. Identifiers must be at least two characters long. In the case that the identifier is the empty string, it will be skipped. See [https://cloud.google.com/dlp/docs/pseudonymization](https://cloud.google.com/dlp/docs/pseudonymization) to learn more.
     *  Note: We recommend using CryptoDeterministicConfig for all use cases which do not require preserving the input alphabet space and size, plus warrant referential integrity.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoReplaceFfxFpeConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.builder
      builder.cryptoReplaceFfxFpeConfig(args(argsBuilder).build)

    /**
     * @param dateShiftConfig Shifts dates by random number of days, with option to be consistent for the same context. See https://cloud.google.com/dlp/docs/concepts-date-shifting to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def dateShiftConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigArgs.builder
      builder.dateShiftConfig(args(argsBuilder).build)

    /**
     * @param fixedSizeBucketingConfig Buckets values based on fixed size ranges. The Bucketing transformation can provide all of this functionality, but requires more configuration. This message is provided as a convenience to the user for simple bucketing strategies.
     *  The transformed value will be a hyphenated string of {lower_bound}-{upper_bound}. For example, if lowerBound = 10 and upperBound = 20, all values that are within this bucket will be replaced with &#34;10-20&#34;.
     *  This can be used on data of type: double, long.
     *  If the bound Value type differs from the type of data being transformed, we will first attempt converting the type of the data to be transformed to match the type of the bound before comparing.
     *  See https://cloud.google.com/dlp/docs/concepts-bucketing to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def fixedSizeBucketingConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.builder
      builder.fixedSizeBucketingConfig(args(argsBuilder).build)

    /**
     * @param redactConfig Redact a given value. For example, if used with an InfoTypeTransformation transforming PHONE_NUMBER, and input &#39;My phone number is 206-555-0123&#39;, the output would be &#39;My phone number is &#39;.
     * @return builder
     */
    def redactConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationRedactConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationRedactConfigArgs.builder
      builder.redactConfig(args(argsBuilder).build)

    /**
     * @param replaceConfig Replace each input value with a given value.
     *  Structure is documented below.
     * @return builder
     */
    def replaceConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigArgs.builder
      builder.replaceConfig(args(argsBuilder).build)

    /**
     * @param replaceDictionaryConfig Replace with a value randomly drawn (with replacement) from a dictionary.
     *  Structure is documented below.
     * @return builder
     */
    def replaceDictionaryConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs.builder
      builder.replaceDictionaryConfig(args(argsBuilder).build)

    /**
     * @param timePartConfig For use with Date, Timestamp, and TimeOfDay, extract or preserve a portion of the value.
     *  Structure is documented below.
     * @return builder
     */
    def timePartConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationTimePartConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationTimePartConfigArgs.builder
      builder.timePartConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsArgs.Builder)
    /**
     * @param conditions Conditions to apply to the expression.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsArgs.builder
      builder.conditions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMaxDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMaxDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMaxTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMaxTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryArgs.Builder)
    /**
     * @param cloudStoragePath Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStoragePath(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryCloudStoragePathArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryCloudStoragePathArgs.builder
      builder.cloudStoragePath(args(argsBuilder).build)

    /**
     * @param wordList List of words or phrases to search for.
     *  Structure is documented below.
     * @return builder
     */
    def wordList(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryWordListArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryWordListArgs.builder
      builder.wordList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionDeidentifyTransformationDetailsStorageConfigArgs.Builder)
    /**
     * @param table The BigQuery table in which to store the output.
     *  Structure is documented below.
     * @return builder
     */
    def table(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionDeidentifyTransformationDetailsStorageConfigTableArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionDeidentifyTransformationDetailsStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionDeidentifyTransformationDetailsStorageConfigTableArgs.builder
      builder.table(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder)
    /**
     * @param kmsWrapped KMS wrapped key.
     *  Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     *  For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key). Only one of this, `transient` or `unwrapped` must be specified.
     *  Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     *  Structure is documented below.
     * @return builder
     */
    def kmsWrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyKmsWrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyKmsWrappedArgs.builder
      builder.kmsWrapped(args(argsBuilder).build)

    /**
     * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes. Only one of this, `unwrapped` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def transient_(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyTransientArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyTransientArgs.builder
      builder.transient_(args(argsBuilder).build)

    /**
     * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible. Only one of this, `transient` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def unwrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyUnwrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyUnwrappedArgs.builder
      builder.unwrapped(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationArgs.Builder)
    /**
     * @param infoTypes InfoTypes to apply the transformation to. Leaving this empty will apply the transformation to apply to
     *  all findings that correspond to infoTypes that were requested in InspectConfig.
     *  Structure is documented below.
     * @return builder
     */
    def infoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationInfoTypeArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationInfoTypeArgs.builder
      builder.infoTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param primitiveTransformation Apply the transformation to the entire field.
     *  The `primitiveTransformation` block must only contain one argument, corresponding to the type of transformation.
     *  Structure is documented below.
     * @return builder
     */
    def primitiveTransformation(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.builder
      builder.primitiveTransformation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsArgs.Builder)
    /**
     * @param maxFindingsPerInfoTypes Configuration of findings limit given for specified infoTypes.
     *  Structure is documented below.
     * @return builder
     */
    def maxFindingsPerInfoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs.builder
      builder.maxFindingsPerInfoTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetArgs.Builder)
    /**
     * @param bigQueryTarget BigQuery target for Discovery. The first target to match a table will be the one applied.
     *  Structure is documented below.
     * @return builder
     */
    def bigQueryTarget(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetArgs.builder
      builder.bigQueryTarget(args(argsBuilder).build)

    /**
     * @param cloudSqlTarget Cloud SQL target for Discovery. The first target to match a table will be the one applied.
     *  Structure is documented below.
     * @return builder
     */
    def cloudSqlTarget(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetArgs.builder
      builder.cloudSqlTarget(args(argsBuilder).build)

    /**
     * @param cloudStorageTarget Cloud Storage target for Discovery. The first target to match a bucket will be the one applied.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStorageTarget(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetArgs.builder
      builder.cloudStorageTarget(args(argsBuilder).build)

    /**
     * @param otherCloudTarget Other clouds target for discovery. The first target to match a resource will be the one applied.
     *  Structure is documented below.
     * @return builder
     */
    def otherCloudTarget(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetArgs.builder
      builder.otherCloudTarget(args(argsBuilder).build)

    /**
     * @param secretsTarget Discovery target that looks for credentials and secrets stored in cloud resource metadata and reports them as vulnerabilities to Security Command Center. Only one target of this type is allowed.
     * @return builder
     */
    def secretsTarget(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetSecretsTargetArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetSecretsTargetArgs.builder
      builder.secretsTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesArgs.Builder)
    /**
     * @param patterns The group of regular expression patterns to match against one or more resources. Maximum of 100 entries. The sum of all lengths of regular expressions can&#39;t exceed 10 KiB.
     *  Structure is documented below.
     * @return builder
     */
    def patterns(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionIncludeRegexesPatternArgs.builder
      builder.patterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs.Builder)
    /**
     * @param charactersToIgnores Characters to skip when doing de-identification of a value. These will be left alone and skipped.
     *  Structure is documented below.
     * @return builder
     */
    def charactersToIgnores(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs.builder
      builder.charactersToIgnores(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleArgs.Builder)
    /**
     * @param dictionary Dictionary which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def dictionary(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleDictionaryArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleDictionaryArgs.builder
      builder.dictionary(args(argsBuilder).build)

    /**
     * @param excludeByHotword Drop if the hotword rule is contained in the proximate context.
     *  Structure is documented below.
     * @return builder
     */
    def excludeByHotword(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordArgs.builder
      builder.excludeByHotword(args(argsBuilder).build)

    /**
     * @param excludeInfoTypes Set of infoTypes for which findings would affect this rule.
     *  Structure is documented below.
     * @return builder
     */
    def excludeInfoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs.builder
      builder.excludeInfoTypes(args(argsBuilder).build)

    /**
     * @param regex Regular expression which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def regex(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleRegexArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleRegexArgs.builder
      builder.regex(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationArgs.Builder)
    /**
     * @param condition Only apply the transformation if the condition evaluates to true for the given RecordCondition. The conditions are allowed to reference fields that are not used in the actual transformation.
     *  Example Use Cases:
     *  - Apply a different bucket transformation to an age column if the zip code column for the same record is within a specific range.
     *  - Redact a field if the date of birth field is greater than 85.
     *    Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param fields Input field(s) to apply the transformation to. When you have columns that reference their position within a list, omit the index from the FieldId.
     *  FieldId name matching ignores the index. For example, instead of &#34;contact.nums[0].type&#34;, use &#34;contact.nums.type&#34;.
     *  Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationFieldArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

    /**
     * @param infoTypeTransformations Treat the contents of the field as free text, and selectively transform content that matches an InfoType.
     *  Only one of `primitiveTransformation` or `infoTypeTransformations` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def infoTypeTransformations(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsArgs.builder
      builder.infoTypeTransformations(args(argsBuilder).build)

    /**
     * @param primitiveTransformation Apply the transformation to the entire field.
     *  The `primitiveTransformation` block must only contain one argument, corresponding to the type of transformation.
     *  Only one of `primitiveTransformation` or `infoTypeTransformations` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def primitiveTransformation(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationArgs.builder
      builder.primitiveTransformation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder)
    /**
     * @param kmsWrapped KMS wrapped key.
     *  Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     *  For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key). Only one of this, `transient` or `unwrapped` must be specified.
     *  Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     *  Structure is documented below.
     * @return builder
     */
    def kmsWrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs.builder
      builder.kmsWrapped(args(argsBuilder).build)

    /**
     * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes. Only one of this, `unwrapped` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def transient_(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyTransientArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyTransientArgs.builder
      builder.transient_(args(argsBuilder).build)

    /**
     * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible. Only one of this, `transient` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def unwrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrappedArgs.builder
      builder.unwrapped(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionArgs.Builder)
    /**
     * @param includeRegexes A collection of regular expressions to match a resource against.
     *  Structure is documented below.
     * @return builder
     */
    def includeRegexes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesArgs.builder
      builder.includeRegexes(args(argsBuilder).build)

    /**
     * @param includeTags For a resource to match the tag filters, the resource must have all of the
     *  provided tags attached. Tags refer to Resource Manager tags bound to the
     *  resource or its ancestors.
     *  Structure is documented below.
     * @return builder
     */
    def includeTags(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeTagsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeTagsArgs.builder
      builder.includeTags(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsArgs.Builder)
    /**
     * @param outputConfig Information on where to store output
     *  Structure is documented below.
     * @return builder
     */
    def outputConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs.builder
      builder.outputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs.Builder)
    /**
     * @param cloudStoragePath Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStoragePath(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs.builder
      builder.cloudStoragePath(args(argsBuilder).build)

    /**
     * @param wordList List of words or phrases to search for.
     *  Structure is documented below.
     * @return builder
     */
    def wordList(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs.builder
      builder.wordList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesArgs.Builder)
    /**
     * @param patterns The group of regular expression patterns to match against one or more resources. Maximum of 100 entries. The sum of all lengths of regular expressions can&#39;t exceed 10 KiB.
     *  Structure is documented below.
     * @return builder
     */
    def patterns(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesPatternArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesPatternArgs.builder
      builder.patterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder)
    /**
     * @param context The &#39;tweak&#39;, a context may be used for higher security since the same identifier in two different contexts won&#39;t be given the same surrogate. If the context is not set, a default tweak will be used.
     *  If the context is set but:
     *  1.  there is no record present when transforming a given value or
     *  2.  the field is not present when transforming a given value,
     *      a default tweak will be used.
     *      Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s. Currently, the referenced field may be of value type integer or string.
     *      The tweak is constructed as a sequence of bytes in big endian byte order such that:
     *  *   a 64 bit integer is encoded followed by a single byte of value 1
     *  *   a string is encoded in UTF-8 format followed by a single byte of value 2
     *      Structure is documented below.
     * @return builder
     */
    def context(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs.builder
      builder.context(args(argsBuilder).build)

    /**
     * @param cryptoKey The key used by the encryption algorithm.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKey(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.builder
      builder.cryptoKey(args(argsBuilder).build)

    /**
     * @param surrogateInfoType The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of characters comprising the surrogate. The following scheme defines the format: info\_type\_name(surrogate\_character\_count):surrogate
     *  For example, if the name of custom infoType is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
     *  This annotation identifies the surrogate when inspecting content using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it occurs in free text.
     *  In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: \u29ddMY\_TOKEN\_TYPE
     *  Structure is documented below.
     * @return builder
     */
    def surrogateInfoType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs.builder
      builder.surrogateInfoType(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordArgs.Builder)
    /**
     * @param hotwordRegex Regular expression pattern defining what qualifies as a hotword.
     *  Structure is documented below.
     * @return builder
     */
    def hotwordRegex(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegexArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegexArgs.builder
      builder.hotwordRegex(args(argsBuilder).build)

    /**
     * @param proximity Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
     *  exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
     *  used to match substrings of the finding itself. For example, the certainty of a phone number regex
     *  `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
     *  office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
     *  Structure is documented below.
     * @return builder
     */
    def proximity(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs.builder
      builder.proximity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionValueArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionValueDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionValueDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionValueTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionValueTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigArgs.Builder)
    /**
     * @param customInfoTypes Custom info types to be used. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def customInfoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeArgs.builder
      builder.customInfoTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param infoTypes Restricts what infoTypes to look for. The values must correspond to InfoType values returned by infoTypes.list
     *  or listed at https://cloud.google.com/dlp/docs/infotypes-reference.
     *  When no InfoTypes or CustomInfoTypes are specified in a request, the system may automatically choose what detectors to run.
     *  By default this may be all types, but may change over time as detectors are updated.
     *  Structure is documented below.
     * @return builder
     */
    def infoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigInfoTypeArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigInfoTypeArgs.builder
      builder.infoTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param limits Configuration to control the number of findings returned.
     *  Structure is documented below.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param ruleSets Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end,
     *  other rules are executed in the order they are specified for each info type.
     *  Structure is documented below.
     * @return builder
     */
    def ruleSets(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetArgs.builder
      builder.ruleSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateState.Builder)
    /**
     * @param inspectConfig The core content of the template.
     *  Structure is documented below.
     * @return builder
     */
    def inspectConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigArgs.builder
      builder.inspectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs.Builder)
    /**
     * @param regexFileSet The regex-filtered set of files to scan.
     *  Structure is documented below.
     * @return builder
     */
    def regexFileSet(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs.builder
      builder.regexFileSet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetArgs.Builder)
    /**
     * @param infoTypes List of infoTypes this rule set is applied to.
     *  Structure is documented below.
     * @return builder
     */
    def infoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs.builder
      builder.infoTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param rules Set of rules to be applied to infoTypes. The rules are applied in order.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterArgs.Builder)
    /**
     * @param collection A collection of resources for this filter to apply to.
     *  Structure is documented below.
     * @return builder
     */
    def collection(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionArgs.builder
      builder.collection(args(argsBuilder).build)

    /**
     * @param databaseResourceReference The database resource to scan. Targets including this can only include one target (the target with this database resource reference).
     *  Structure is documented below.
     * @return builder
     */
    def databaseResourceReference(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs.builder
      builder.databaseResourceReference(args(argsBuilder).build)

    /**
     * @param others Match discovery resources not covered by any other filter.
     * @return builder
     */
    def others(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterOthersArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterOthersArgs.builder
      builder.others(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionArgs.Builder)
    /**
     * @param includeRegexes A collection of regular expressions to match a resource against.
     *  Structure is documented below.
     * @return builder
     */
    def includeRegexes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesArgs.builder
      builder.includeRegexes(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigArgs.Builder)
    /**
     * @param buckets Set of buckets. Ranges must be non-overlapping.
     *  Bucket is represented as a range, along with replacement values.
     *  Structure is documented below.
     * @return builder
     */
    def buckets(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs.builder
      builder.buckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.Builder)
    /**
     * @param lowerBound Lower bound value of buckets.
     *  All values less than lowerBound are grouped together into a single bucket; for example if lowerBound = 10, then all values less than 10 are replaced with the value &#34;-10&#34;.
     *  The `lowerBound` block must only contain one argument. See the `fixedSizeBucketingConfig` block description for more information about choosing a data type.
     *  Structure is documented below.
     * @return builder
     */
    def lowerBound(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs.builder
      builder.lowerBound(args(argsBuilder).build)

    /**
     * @param upperBound Upper bound value of buckets.
     *  All values greater than upperBound are grouped together into a single bucket; for example if upperBound = 89, then all values greater than 89 are replaced with the value &#34;89+&#34;.
     *  The `upperBound` block must only contain one argument. See the `fixedSizeBucketingConfig` block description for more information about choosing a data type.
     *  Structure is documented below.
     * @return builder
     */
    def upperBound(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs.builder
      builder.upperBound(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetGenerationCadenceArgs.Builder)
    /**
     * @param inspectTemplateModifiedCadence Governs when to update data profiles when the inspection rules defined by the `InspectTemplate` change. If not set, changing the template will not cause a data profile to update.
     *  Structure is documented below.
     * @return builder
     */
    def inspectTemplateModifiedCadence(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetGenerationCadenceInspectTemplateModifiedCadenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetGenerationCadenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetGenerationCadenceInspectTemplateModifiedCadenceArgs.builder
      builder.inspectTemplateModifiedCadence(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder)
    /**
     * @param kmsWrapped KMS wrapped key.
     *  Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     *  For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key). Only one of this, `transient` or `unwrapped` must be specified.
     *  Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     *  Structure is documented below.
     * @return builder
     */
    def kmsWrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs.builder
      builder.kmsWrapped(args(argsBuilder).build)

    /**
     * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes. Only one of this, `unwrapped` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def transient_(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientArgs.builder
      builder.transient_(args(argsBuilder).build)

    /**
     * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible. Only one of this, `transient` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def unwrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedArgs.builder
      builder.unwrapped(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionArgs.Builder)
    /**
     * @param exportData Export data profiles into a provided location
     *  Structure is documented below.
     * @return builder
     */
    def exportData(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionExportDataArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionExportDataArgs.builder
      builder.exportData(args(argsBuilder).build)

    /**
     * @param pubSubNotification Publish a message into the Pub/Sub topic.
     *  Structure is documented below.
     * @return builder
     */
    def pubSubNotification(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPubSubNotificationArgs.builder
      builder.pubSubNotification(args(argsBuilder).build)

    /**
     * @param publishToChronicle Publishes generated data profiles to Google Security Operations. For more information, see [Use Sensitive Data Protection data in context-aware analytics](https://cloud.google.com/chronicle/docs/detection/usecase-dlp-high-risk-user-download).
     * @return builder
     */
    def publishToChronicle(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPublishToChronicleArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPublishToChronicleArgs.builder
      builder.publishToChronicle(args(argsBuilder).build)

    /**
     * @param publishToDataplexCatalog Publish a portion of each profile to Dataplex Universal Catalog with the aspect type Sensitive Data Protection Profile.
     * @return builder
     */
    def publishToDataplexCatalog(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPublishToDataplexCatalogArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPublishToDataplexCatalogArgs.builder
      builder.publishToDataplexCatalog(args(argsBuilder).build)

    /**
     * @param publishToScc Publishes findings to Security Command Center for each data profile.
     * @return builder
     */
    def publishToScc(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPublishToSccArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionPublishToSccArgs.builder
      builder.publishToScc(args(argsBuilder).build)

    /**
     * @param tagResources Tag the profiled resources with the specified tag values.
     *  Structure is documented below.
     * @return builder
     */
    def tagResources(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionTagResourcesArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigActionTagResourcesArgs.builder
      builder.tagResources(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetConditionsArgs.Builder)
    /**
     * @param cloudStorageConditions Cloud Storage conditions.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStorageConditions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetConditionsCloudStorageConditionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetConditionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetConditionsCloudStorageConditionsArgs.builder
      builder.cloudStorageConditions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeArgs.Builder)
    /**
     * @param dictionary Dictionary which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def dictionary(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionaryArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionaryArgs.builder
      builder.dictionary(args(argsBuilder).build)

    /**
     * @param infoType CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
     *  infoTypes and that infoType is specified in `infoTypes` field. Specifying the latter adds findings to the
     *  one detected by the system. If built-in info type is not specified in `infoTypes` list then the name is
     *  treated as a custom info type.
     *  Structure is documented below.
     * @return builder
     */
    def infoType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeInfoTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeInfoTypeArgs.builder
      builder.infoType(args(argsBuilder).build)

    /**
     * @param regex Regular expression which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def regex(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeRegexArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeRegexArgs.builder
      builder.regex(args(argsBuilder).build)

    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

    /**
     * @param storedType A reference to a StoredInfoType to use with scanning.
     *  Structure is documented below.
     * @return builder
     */
    def storedType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeStoredTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeStoredTypeArgs.builder
      builder.storedType(args(argsBuilder).build)

    /**
     * @param surrogateType Message for detecting output from deidentification transformations that support reversing.
     * @return builder
     */
    def surrogateType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSurrogateTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSurrogateTypeArgs.builder
      builder.surrogateType(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder)
    /**
     * @param max Upper bound of the range, exclusive; type must match min.
     *  The `max` block must only contain one argument. See the `bucketingConfig` block description for more information about choosing a data type.
     *  Structure is documented below.
     * @return builder
     */
    def max(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.builder
      builder.max(args(argsBuilder).build)

    /**
     * @param min Lower bound of the range, inclusive. Type should be the same as max if used.
     *  The `min` block must only contain one argument. See the `bucketingConfig` block description for more information about choosing a data type.
     *  Structure is documented below.
     * @return builder
     */
    def min(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.builder
      builder.min(args(argsBuilder).build)

    /**
     * @param replacementValue Replacement value for this bucket.
     *  The `replacementValue` block must only contain one argument.
     *  Structure is documented below.
     * @return builder
     */
    def replacementValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.builder
      builder.replacementValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordArgs.Builder)
    /**
     * @param hotwordRegex Regular expression pattern defining what qualifies as a hotword.
     *  Structure is documented below.
     * @return builder
     */
    def hotwordRegex(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegexArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegexArgs.builder
      builder.hotwordRegex(args(argsBuilder).build)

    /**
     * @param proximity Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
     *  exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
     *  used to match substrings of the finding itself. For example, the certainty of a phone number regex
     *  `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
     *  office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
     *  Structure is documented below.
     * @return builder
     */
    def proximity(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs.builder
      builder.proximity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryArgs.Builder)
    /**
     * @param bigQueryField Field in a BigQuery table where each cell represents a dictionary phrase.
     *  Structure is documented below.
     * @return builder
     */
    def bigQueryField(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldArgs.builder
      builder.bigQueryField(args(argsBuilder).build)

    /**
     * @param cloudStorageFileSet Set of files containing newline-delimited lists of dictionary phrases.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStorageFileSet(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs.builder
      builder.cloudStorageFileSet(args(argsBuilder).build)

    /**
     * @param outputPath Location to store dictionary artifacts in Google Cloud Storage. These files will only be accessible by project owners and the DLP API.
     *  If any of these artifacts are modified, the dictionary is considered invalid and can no longer be used.
     *  Structure is documented below.
     * @return builder
     */
    def outputPath(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs.builder
      builder.outputPath(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder)
    /**
     * @param kmsWrapped KMS wrapped key.
     *  Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     *  For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key). Only one of this, `transient` or `unwrapped` must be specified.
     *  Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     *  Structure is documented below.
     * @return builder
     */
    def kmsWrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs.builder
      builder.kmsWrapped(args(argsBuilder).build)

    /**
     * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes. Only one of this, `unwrapped` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def transient_(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyTransientArgs.builder
      builder.transient_(args(argsBuilder).build)

    /**
     * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible. Only one of this, `transient` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def unwrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedArgs.builder
      builder.unwrapped(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetArgs.Builder)
    /**
     * @param conditions In addition to matching the filter, these conditions must be true before a profile is generated.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetConditionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetConditionsArgs.builder
      builder.conditions(args(argsBuilder).build)

    /**
     * @param dataSourceType Required. The type of data profiles generated by this discovery target. Supported values are: aws/s3/bucket
     *  Structure is documented below.
     * @return builder
     */
    def dataSourceType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetDataSourceTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetDataSourceTypeArgs.builder
      builder.dataSourceType(args(argsBuilder).build)

    /**
     * @param disabled Disable profiling for resources that match this filter.
     * @return builder
     */
    def disabled(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetDisabledArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetDisabledArgs.builder
      builder.disabled(args(argsBuilder).build)

    /**
     * @param filter Required. The resources that the discovery cadence applies to. The first target with a matching filter will be the one to apply to a resource.
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param generationCadence How often and when to update profiles. New resources that match both the filter and conditions are scanned as quickly as possible depending on system capacity.
     *  Structure is documented below.
     * @return builder
     */
    def generationCadence(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetGenerationCadenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetGenerationCadenceArgs.builder
      builder.generationCadence(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPatternArgs.Builder)
    /**
     * @param cloudStorageRegex Regex for Cloud Storage.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStorageRegex(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPatternCloudStorageRegexArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPatternArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPatternCloudStorageRegexArgs.builder
      builder.cloudStorageRegex(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder)
    /**
     * @param kmsWrapped KMS wrapped key.
     *  Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     *  For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key). Only one of this, `transient` or `unwrapped` must be specified.
     *  Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     *  Structure is documented below.
     * @return builder
     */
    def kmsWrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyKmsWrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyKmsWrappedArgs.builder
      builder.kmsWrapped(args(argsBuilder).build)

    /**
     * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes. Only one of this, `unwrapped` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def transient_(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyTransientArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyTransientArgs.builder
      builder.transient_(args(argsBuilder).build)

    /**
     * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible. Only one of this, `transient` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def unwrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyUnwrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyUnwrappedArgs.builder
      builder.unwrapped(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs.Builder)
    /**
     * @param newValue Replace each input value with a given value.
     *  The `newValue` block must only contain one argument. For example when replacing the contents of a string-type field, only `stringValue` should be set.
     *  Structure is documented below.
     * @return builder
     */
    def newValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs.builder
      builder.newValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsArgs.Builder)
    /**
     * @param fieldTransformations Transform the record by applying various field transformations.
     *  Structure is documented below.
     * @return builder
     */
    def fieldTransformations(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationArgs.builder
      builder.fieldTransformations(args.map(_(argsBuilder).build)*)

    /**
     * @param recordSuppressions Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output.
     *  Structure is documented below.
     * @return builder
     */
    def recordSuppressions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionArgs.builder
      builder.recordSuppressions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerState.Builder)
    /**
     * @param inspectJob Controls what and how to inspect for findings.
     *  Structure is documented below.
     * @return builder
     */
    def inspectJob(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobArgs.builder
      builder.inspectJob(args(argsBuilder).build)

    /**
     * @param triggers What event needs to occur for a new job to be started.
     *  Structure is documented below.
     * @return builder
     */
    def triggers(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerState.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerArgs.builder
      builder.triggers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs.Builder)
    /**
     * @param fileSet Set of files to scan.
     *  Structure is documented below.
     * @return builder
     */
    def fileSet(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs.builder
      builder.fileSet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsArgs.Builder)
    /**
     * @param maxFindingsPerInfoTypes Configuration of findings limit given for specified infoTypes.
     *  Structure is documented below.
     * @return builder
     */
    def maxFindingsPerInfoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs.builder
      builder.maxFindingsPerInfoTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesPatternAmazonS3BucketRegexArgs.Builder)
    /**
     * @param awsAccountRegex The AWS account regex
     * @return builder
     */
    def awsAccountRegex(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesPatternAmazonS3BucketRegexAwsAccountRegexArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesPatternAmazonS3BucketRegexArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionIncludeRegexesPatternAmazonS3BucketRegexAwsAccountRegexArgs.builder
      builder.awsAccountRegex(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerArgs.Builder)
    /**
     * @param manual For use with hybrid jobs. Jobs must be manually created and finished.
     * @return builder
     */
    def manual(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerManualArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerManualArgs.builder
      builder.manual(args(argsBuilder).build)

    /**
     * @param schedule Schedule for triggered jobs
     *  Structure is documented below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerScheduleArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigArgs.Builder)
    /**
     * @param newValue Replace each input value with a given value.
     *  The `newValue` block must only contain one argument. For example when replacing the contents of a string-type field, only `stringValue` should be set.
     *  Structure is documented below.
     * @return builder
     */
    def newValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs.builder
      builder.newValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigArgs.Builder)
    /**
     * @param context Points to the field that contains the context, for example, an entity id.
     *  If set, must also set cryptoKey. If set, shift will be consistent for the given context.
     *  Structure is documented below.
     * @return builder
     */
    def context(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigContextArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigContextArgs.builder
      builder.context(args(argsBuilder).build)

    /**
     * @param cryptoKey Causes the shift to be computed based on this key and the context. This results in the same shift for the same context and cryptoKey. If set, must also set context. Can only be applied to table items.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKey(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.builder
      builder.cryptoKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleArgs.Builder)
    /**
     * @param exclusionRule The rule that specifies conditions when findings of infoTypes specified in InspectionRuleSet are removed from results.
     *  Structure is documented below.
     * @return builder
     */
    def exclusionRule(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleArgs.builder
      builder.exclusionRule(args(argsBuilder).build)

    /**
     * @param hotwordRule Hotword-based detection rule.
     *  Structure is documented below.
     * @return builder
     */
    def hotwordRule(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs.builder
      builder.hotwordRule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigArgs.Builder)
    /**
     * @param cryptoKey The key used by the encryption function.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKey(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.builder
      builder.cryptoKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesArgs.Builder)
    /**
     * @param includeRegexes A collection of regular expressions to match a BQ table against.
     *  Structure is documented below.
     * @return builder
     */
    def includeRegexes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesIncludeRegexesArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesIncludeRegexesArgs.builder
      builder.includeRegexes(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs.Builder)
    /**
     * @param newValue Replace each input value with a given value.
     *  The `newValue` block must only contain one argument. For example when replacing the contents of a string-type field, only `stringValue` should be set.
     *  Structure is documented below.
     * @return builder
     */
    def newValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs.builder
      builder.newValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigArgs.Builder)
    /**
     * @param buckets Set of buckets. Ranges must be non-overlapping.
     *  Bucket is represented as a range, along with replacement values.
     *  Structure is documented below.
     * @return builder
     */
    def buckets(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketArgs.builder
      builder.buckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateState.Builder)
    /**
     * @param deidentifyConfig Configuration of the deidentify template
     *  Structure is documented below.
     * @return builder
     */
    def deidentifyConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigArgs.builder
      builder.deidentifyConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs.Builder)
    /**
     * @param wordList A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
     *  Structure is documented below.
     * @return builder
     */
    def wordList(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigWordListArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigWordListArgs.builder
      builder.wordList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs.Builder)
    /**
     * @param dateValue Represents a whole or partial calendar date.
     *  Structure is documented below.
     * @return builder
     */
    def dateValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs.builder
      builder.dateValue(args(argsBuilder).build)

    /**
     * @param timeValue Represents a time of day.
     *  Structure is documented below.
     * @return builder
     */
    def timeValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs.builder
      builder.timeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionDeidentifyArgs.Builder)
    /**
     * @param transformationConfig User specified deidentify templates and configs for structured, unstructured, and image files.
     *  Structure is documented below.
     * @return builder
     */
    def transformationConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionDeidentifyTransformationConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionDeidentifyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionDeidentifyTransformationConfigArgs.builder
      builder.transformationConfig(args(argsBuilder).build)

    /**
     * @param transformationDetailsStorageConfig Config for storing transformation details.
     *  Structure is documented below.
     * @return builder
     */
    def transformationDetailsStorageConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionDeidentifyTransformationDetailsStorageConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionDeidentifyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionDeidentifyTransformationDetailsStorageConfigArgs.builder
      builder.transformationDetailsStorageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder)
    /**
     * @param kmsWrapped KMS wrapped key.
     *  Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     *  For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key). Only one of this, `transient` or `unwrapped` must be specified.
     *  Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     *  Structure is documented below.
     * @return builder
     */
    def kmsWrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyKmsWrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyKmsWrappedArgs.builder
      builder.kmsWrapped(args(argsBuilder).build)

    /**
     * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes. Only one of this, `unwrapped` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def transient_(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyTransientArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyTransientArgs.builder
      builder.transient_(args(argsBuilder).build)

    /**
     * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible. Only one of this, `transient` or `kmsWrapped` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def unwrapped(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyUnwrappedArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyUnwrappedArgs.builder
      builder.unwrapped(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionArgs.Builder)
    /**
     * @param field Field within the record this condition is evaluated against.
     *  Structure is documented below.
     * @return builder
     */
    def field(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionFieldArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionFieldArgs.builder
      builder.field(args(argsBuilder).build)

    /**
     * @param value Value to compare against. [Mandatory, except for EXISTS tests.]
     *  Structure is documented below.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsRecordSuppressionConditionExpressionsConditionsConditionValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeState.Builder)
    /**
     * @param dictionary Dictionary which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def dictionary(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeState.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryArgs.builder
      builder.dictionary(args(argsBuilder).build)

    /**
     * @param largeCustomDictionary Dictionary which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def largeCustomDictionary(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeState.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryArgs.builder
      builder.largeCustomDictionary(args(argsBuilder).build)

    /**
     * @param regex Regular expression which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def regex(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeRegexArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeState.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeRegexArgs.builder
      builder.regex(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigArgs.Builder)
    /**
     * @param bigQueryOptions Options defining BigQuery table and row identifiers.
     *  Structure is documented below.
     * @return builder
     */
    def bigQueryOptions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs.builder
      builder.bigQueryOptions(args(argsBuilder).build)

    /**
     * @param cloudStorageOptions Options defining a file or a set of files within a Google Cloud Storage bucket.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStorageOptions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs.builder
      builder.cloudStorageOptions(args(argsBuilder).build)

    /**
     * @param datastoreOptions Options defining a data set within Google Cloud Datastore.
     *  Structure is documented below.
     * @return builder
     */
    def datastoreOptions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs.builder
      builder.datastoreOptions(args(argsBuilder).build)

    /**
     * @param hybridOptions Configuration to control jobs where the content being inspected is outside of Google Cloud Platform.
     *  Structure is documented below.
     * @return builder
     */
    def hybridOptions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigHybridOptionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigHybridOptionsArgs.builder
      builder.hybridOptions(args(argsBuilder).build)

    /**
     * @param timespanConfig Configuration of the timespan of the items to include in scanning
     *  Structure is documented below.
     * @return builder
     */
    def timespanConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs.builder
      builder.timespanConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs.Builder)
    /**
     * @param dictionary Dictionary which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def dictionary(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs.builder
      builder.dictionary(args(argsBuilder).build)

    /**
     * @param excludeByHotword Drop if the hotword rule is contained in the proximate context.
     *  For tabular data, the context includes the column name.
     *  Structure is documented below.
     * @return builder
     */
    def excludeByHotword(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordArgs.builder
      builder.excludeByHotword(args(argsBuilder).build)

    /**
     * @param excludeInfoTypes Set of infoTypes for which findings would affect this rule.
     *  Structure is documented below.
     * @return builder
     */
    def excludeInfoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs.builder
      builder.excludeInfoTypes(args(argsBuilder).build)

    /**
     * @param regex Regular expression which defines the rule.
     *  Structure is documented below.
     * @return builder
     */
    def regex(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs.builder
      builder.regex(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs.Builder)
    /**
     * @param excludedFields References to fields excluded from scanning.
     *  This allows you to skip inspection of entire columns which you know have no findings.
     *  Structure is documented below.
     * @return builder
     */
    def excludedFields(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsExcludedFieldArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsExcludedFieldArgs.builder
      builder.excludedFields(args.map(_(argsBuilder).build)*)

    /**
     * @param identifyingFields Specifies the BigQuery fields that will be returned with findings.
     *  If not specified, no identifying fields will be returned for findings.
     *  Structure is documented below.
     * @return builder
     */
    def identifyingFields(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsIdentifyingFieldArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsIdentifyingFieldArgs.builder
      builder.identifyingFields(args.map(_(argsBuilder).build)*)

    /**
     * @param includedFields Limit scanning only to these fields.
     *  Structure is documented below.
     * @return builder
     */
    def includedFields(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsIncludedFieldArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsIncludedFieldArgs.builder
      builder.includedFields(args.map(_(argsBuilder).build)*)

    /**
     * @param tableReference Set of files to scan.
     *  Structure is documented below.
     * @return builder
     */
    def tableReference(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs.builder
      builder.tableReference(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeTagsArgs.Builder)
    /**
     * @param tagFilters A resource must match ALL of the specified tag filters to be included in the collection.
     *  Structure is documented below.
     * @return builder
     */
    def tagFilters(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeTagsTagFilterArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeTagsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeTagsTagFilterArgs.builder
      builder.tagFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetConditionsArgs.Builder)
    /**
     * @param amazonS3BucketConditions Amazon S3 bucket conditions.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedTargetsOtherCloudTargetConditionsAmazonS3BucketConditions&#34;&gt;&lt;/a&gt;The `amazonS3BucketConditions` block supports:
     * @return builder
     */
    def amazonS3BucketConditions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetConditionsAmazonS3BucketConditionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetConditionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetConditionsAmazonS3BucketConditionsArgs.builder
      builder.amazonS3BucketConditions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigHybridOptionsTableOptionsArgs.Builder)
    /**
     * @param identifyingFields The columns that are the primary keys for table objects included in ContentItem. A copy of this
     *  cell&#39;s value will stored alongside alongside each finding so that the finding can be traced to
     *  the specific row it came from. No more than 3 may be provided.
     *  Structure is documented below.
     * @return builder
     */
    def identifyingFields(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigHybridOptionsTableOptionsIdentifyingFieldArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigHybridOptionsTableOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigHybridOptionsTableOptionsIdentifyingFieldArgs.builder
      builder.identifyingFields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder)
    /**
     * @param max Upper bound of the range, exclusive; type must match min.
     *  The `max` block must only contain one argument. See the `bucketingConfig` block description for more information about choosing a data type.
     *  Structure is documented below.
     * @return builder
     */
    def max(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMaxArgs.builder
      builder.max(args(argsBuilder).build)

    /**
     * @param min Lower bound of the range, inclusive. Type should be the same as max if used.
     *  The `min` block must only contain one argument. See the `bucketingConfig` block description for more information about choosing a data type.
     *  Structure is documented below.
     * @return builder
     */
    def min(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketMinArgs.builder
      builder.min(args(argsBuilder).build)

    /**
     * @param replacementValue Replacement value for this bucket.
     *  The `replacementValue` block must only contain one argument.
     *  Structure is documented below.
     * @return builder
     */
    def replacementValue(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueArgs.builder
      builder.replacementValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder)
    /**
     * @param context A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during encryption, same context must be provided during decryption as well.
     *  If the context is not set, plaintext would be used as is for encryption. If the context is set but:
     *  1. there is no record present when transforming a given value or
     *  2. the field is not present when transforming a given value,
     *     plaintext would be used as is for encryption.
     *     Note that case (1) is expected when an InfoTypeTransformation is applied to both structured and unstructured ContentItems.
     *     Structure is documented below.
     * @return builder
     */
    def context(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigContextArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigContextArgs.builder
      builder.context(args(argsBuilder).build)

    /**
     * @param cryptoKey The key used by the encryption function. For deterministic encryption using AES-SIV, the provided key is internally expanded to 64 bytes prior to use.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKey(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs.builder
      builder.cryptoKey(args(argsBuilder).build)

    /**
     * @param surrogateInfoType The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate}
     *  For example, if the name of custom info type is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
     *  This annotation identifies the surrogate when inspecting content using the custom info type &#39;Surrogate&#39;. This facilitates reversal of the surrogate when it occurs in free text.
     *  Note: For record transformations where the entire cell in a table is being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text.
     *  In order for inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either
     *  *   reverse a surrogate that does not correspond to an actual identifier
     *  *   be unable to parse the surrogate and result in an error
     *      Therefore, choose your custom info type name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: \u29ddMY\_TOKEN\_TYPE.
     *      Structure is documented below.
     * @return builder
     */
    def surrogateInfoType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs.builder
      builder.surrogateInfoType(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder)
    /**
     * @param bucketingConfig Generalization function that buckets values based on ranges. The ranges and replacement values are dynamically provided by the user for custom behavior, such as 1-30 &gt; LOW 31-65 &gt; MEDIUM 66-100 &gt; HIGH
     *  This can be used on data of type: number, long, string, timestamp.
     *  If the provided value type differs from the type of data being transformed, we will first attempt converting the type of the data to be transformed to match the type of the bound before comparing.
     *  See https://cloud.google.com/dlp/docs/concepts-bucketing to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def bucketingConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigArgs.builder
      builder.bucketingConfig(args(argsBuilder).build)

    /**
     * @param characterMaskConfig Partially mask a string by replacing a given number of characters with a fixed character. Masking can start from the beginning or end of the string. This can be used on data of any type (numbers, longs, and so on) and when de-identifying structured data we&#39;ll attempt to preserve the original data&#39;s type. (This allows you to take a long like 123 and modify it to a string like **3).
     *  Structure is documented below.
     * @return builder
     */
    def characterMaskConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs.builder
      builder.characterMaskConfig(args(argsBuilder).build)

    /**
     * @param cryptoDeterministicConfig Pseudonymization method that generates deterministic encryption for the given input. Outputs a base64 encoded representation of the encrypted output. Uses AES-SIV based on the RFC [https://tools.ietf.org/html/rfc5297](https://tools.ietf.org/html/rfc5297).
     *  Structure is documented below.
     * @return builder
     */
    def cryptoDeterministicConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.builder
      builder.cryptoDeterministicConfig(args(argsBuilder).build)

    /**
     * @param cryptoHashConfig Pseudonymization method that generates surrogates via cryptographic hashing. Uses SHA-256. The key size must be either 32 or 64 bytes.
     *  Outputs a base64 encoded representation of the hashed output (for example, L7k0BHmF1ha5U3NfGykjro4xWi1MPVQPjhMAZbSV9mM=).
     *  Currently, only string and integer values can be hashed.
     *  See https://cloud.google.com/dlp/docs/pseudonymization to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoHashConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigArgs.builder
      builder.cryptoHashConfig(args(argsBuilder).build)

    /**
     * @param cryptoReplaceFfxFpeConfig Replaces an identifier with a surrogate using Format Preserving Encryption (FPE) with the FFX mode of operation; however when used in the `content.reidentify` API method, it serves the opposite function by reversing the surrogate back into the original identifier. The identifier must be encoded as ASCII. For a given crypto key and context, the same identifier will be replaced with the same surrogate. Identifiers must be at least two characters long. In the case that the identifier is the empty string, it will be skipped. See [https://cloud.google.com/dlp/docs/pseudonymization](https://cloud.google.com/dlp/docs/pseudonymization) to learn more.
     *  Note: We recommend using CryptoDeterministicConfig for all use cases which do not require preserving the input alphabet space and size, plus warrant referential integrity.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoReplaceFfxFpeConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.builder
      builder.cryptoReplaceFfxFpeConfig(args(argsBuilder).build)

    /**
     * @param dateShiftConfig Shifts dates by random number of days, with option to be consistent for the same context. See https://cloud.google.com/dlp/docs/concepts-date-shifting to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def dateShiftConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs.builder
      builder.dateShiftConfig(args(argsBuilder).build)

    /**
     * @param fixedSizeBucketingConfig Buckets values based on fixed size ranges. The Bucketing transformation can provide all of this functionality, but requires more configuration. This message is provided as a convenience to the user for simple bucketing strategies.
     *  The transformed value will be a hyphenated string of {lower_bound}-{upper_bound}. For example, if lowerBound = 10 and upperBound = 20, all values that are within this bucket will be replaced with &#34;10-20&#34;.
     *  This can be used on data of type: double, long.
     *  If the bound Value type differs from the type of data being transformed, we will first attempt converting the type of the data to be transformed to match the type of the bound before comparing.
     *  See https://cloud.google.com/dlp/docs/concepts-bucketing to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def fixedSizeBucketingConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.builder
      builder.fixedSizeBucketingConfig(args(argsBuilder).build)

    /**
     * @param redactConfig Redact a given value. For example, if used with an InfoTypeTransformation transforming PHONE_NUMBER, and input &#39;My phone number is 206-555-0123&#39;, the output would be &#39;My phone number is &#39;.
     * @return builder
     */
    def redactConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationRedactConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationRedactConfigArgs.builder
      builder.redactConfig(args(argsBuilder).build)

    /**
     * @param replaceConfig Replace each input value with a given value.
     *  Structure is documented below.
     * @return builder
     */
    def replaceConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs.builder
      builder.replaceConfig(args(argsBuilder).build)

    /**
     * @param replaceDictionaryConfig Replace with a value randomly drawn (with replacement) from a dictionary.
     *  Structure is documented below.
     * @return builder
     */
    def replaceDictionaryConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigArgs.builder
      builder.replaceDictionaryConfig(args(argsBuilder).build)

    /**
     * @param timePartConfig For use with Date, Timestamp, and TimeOfDay, extract or preserve a portion of the value.
     *  Structure is documented below.
     * @return builder
     */
    def timePartConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationTimePartConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationTimePartConfigArgs.builder
      builder.timePartConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionaryArgs.Builder)
    /**
     * @param cloudStoragePath Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStoragePath(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs.builder
      builder.cloudStoragePath(args(argsBuilder).build)

    /**
     * @param wordList List of words or phrases to search for.
     *  Structure is documented below.
     * @return builder
     */
    def wordList(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionaryWordListArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionaryWordListArgs.builder
      builder.wordList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterArgs.Builder)
    /**
     * @param collection A collection of resources for this filter to apply to.
     *  Structure is documented below.
     * @return builder
     */
    def collection(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterCollectionArgs.builder
      builder.collection(args(argsBuilder).build)

    /**
     * @param others Match discovery resources not covered by any other filter.
     * @return builder
     */
    def others(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterOthersArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterOthersArgs.builder
      builder.others(args(argsBuilder).build)

    /**
     * @param singleResource The resource to scan. Configs using this filter can only have one target (the target with this single resource reference).
     *  Structure is documented below.
     * @return builder
     */
    def singleResource(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterSingleResourceArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetOtherCloudTargetFilterSingleResourceArgs.builder
      builder.singleResource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs.Builder)
    /**
     * @param hotwordRegex Regular expression pattern defining what qualifies as a hotword.
     *  Structure is documented below.
     * @return builder
     */
    def hotwordRegex(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs.builder
      builder.hotwordRegex(args(argsBuilder).build)

    /**
     * @param likelihoodAdjustment Likelihood adjustment to apply to all matching findings.
     *  Structure is documented below.
     * @return builder
     */
    def likelihoodAdjustment(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs.builder
      builder.likelihoodAdjustment(args(argsBuilder).build)

    /**
     * @param proximity Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
     *  exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
     *  used to match substrings of the finding itself. For example, the certainty of a phone number regex
     *  `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
     *  office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
     *  Structure is documented below.
     * @return builder
     */
    def proximity(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleProximityArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleProximityArgs.builder
      builder.proximity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.Builder)
    /**
     * @param lowerBound Lower bound value of buckets.
     *  All values less than lowerBound are grouped together into a single bucket; for example if lowerBound = 10, then all values less than 10 are replaced with the value &#34;-10&#34;.
     *  The `lowerBound` block must only contain one argument. See the `fixedSizeBucketingConfig` block description for more information about choosing a data type.
     *  Structure is documented below.
     * @return builder
     */
    def lowerBound(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs.builder
      builder.lowerBound(args(argsBuilder).build)

    /**
     * @param upperBound Upper bound value of buckets.
     *  All values greater than upperBound are grouped together into a single bucket; for example if upperBound = 89, then all values greater than 89 are replaced with the value &#34;89+&#34;.
     *  The `upperBound` block must only contain one argument. See the `fixedSizeBucketingConfig` block description for more information about choosing a data type.
     *  Structure is documented below.
     * @return builder
     */
    def upperBound(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs.builder
      builder.upperBound(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesArgs.Builder)
    /**
     * @param infoTypes InfoTypes to apply the transformation to. Leaving this empty will apply the transformation to apply to
     *  all findings that correspond to infoTypes that were requested in InspectConfig.
     *  Structure is documented below.
     * @return builder
     */
    def infoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeArgs.builder
      builder.infoTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs.Builder)
    /**
     * @param context Points to the field that contains the context, for example, an entity id.
     *  If set, must also set cryptoKey. If set, shift will be consistent for the given context.
     *  Structure is documented below.
     * @return builder
     */
    def context(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigContextArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigContextArgs.builder
      builder.context(args(argsBuilder).build)

    /**
     * @param cryptoKey Causes the shift to be computed based on this key and the context. This results in the same shift for the same context and cryptoKey. If set, must also set context. Can only be applied to table items.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKey(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs.builder
      builder.cryptoKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.Builder)
    /**
     * @param lowerBound Lower bound value of buckets.
     *  All values less than lowerBound are grouped together into a single bucket; for example if lowerBound = 10, then all values less than 10 are replaced with the value &#34;-10&#34;.
     *  The `lowerBound` block must only contain one argument. See the `fixedSizeBucketingConfig` block description for more information about choosing a data type.
     *  Structure is documented below.
     * @return builder
     */
    def lowerBound(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigLowerBoundArgs.builder
      builder.lowerBound(args(argsBuilder).build)

    /**
     * @param upperBound Upper bound value of buckets.
     *  All values greater than upperBound are grouped together into a single bucket; for example if upperBound = 89, then all values greater than 89 are replaced with the value &#34;89+&#34;.
     *  The `upperBound` block must only contain one argument. See the `fixedSizeBucketingConfig` block description for more information about choosing a data type.
     *  Structure is documented below.
     * @return builder
     */
    def upperBound(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigUpperBoundArgs.builder
      builder.upperBound(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs.Builder)
    /**
     * @param cloudStoragePath Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStoragePath(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathArgs.builder
      builder.cloudStoragePath(args(argsBuilder).build)

    /**
     * @param wordList List of words or phrases to search for.
     *  Structure is documented below.
     * @return builder
     */
    def wordList(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs.builder
      builder.wordList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder)
    /**
     * @param bucketingConfig Generalization function that buckets values based on ranges. The ranges and replacement values are dynamically provided by the user for custom behavior, such as 1-30 &gt; LOW 31-65 &gt; MEDIUM 66-100 &gt; HIGH
     *  This can be used on data of type: number, long, string, timestamp.
     *  If the provided value type differs from the type of data being transformed, we will first attempt converting the type of the data to be transformed to match the type of the bound before comparing.
     *  See https://cloud.google.com/dlp/docs/concepts-bucketing to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def bucketingConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigArgs.builder
      builder.bucketingConfig(args(argsBuilder).build)

    /**
     * @param characterMaskConfig Partially mask a string by replacing a given number of characters with a fixed character. Masking can start from the beginning or end of the string. This can be used on data of any type (numbers, longs, and so on) and when de-identifying structured data we&#39;ll attempt to preserve the original data&#39;s type. (This allows you to take a long like 123 and modify it to a string like **3).
     *  Structure is documented below.
     * @return builder
     */
    def characterMaskConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs.builder
      builder.characterMaskConfig(args(argsBuilder).build)

    /**
     * @param cryptoDeterministicConfig Pseudonymization method that generates deterministic encryption for the given input. Outputs a base64 encoded representation of the encrypted output. Uses AES-SIV based on the RFC [https://tools.ietf.org/html/rfc5297](https://tools.ietf.org/html/rfc5297).
     *  Structure is documented below.
     * @return builder
     */
    def cryptoDeterministicConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs.builder
      builder.cryptoDeterministicConfig(args(argsBuilder).build)

    /**
     * @param cryptoHashConfig Pseudonymization method that generates surrogates via cryptographic hashing. Uses SHA-256. The key size must be either 32 or 64 bytes.
     *  Outputs a base64 encoded representation of the hashed output (for example, L7k0BHmF1ha5U3NfGykjro4xWi1MPVQPjhMAZbSV9mM=).
     *  Currently, only string and integer values can be hashed.
     *  See https://cloud.google.com/dlp/docs/pseudonymization to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoHashConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoHashConfigArgs.builder
      builder.cryptoHashConfig(args(argsBuilder).build)

    /**
     * @param cryptoReplaceFfxFpeConfig Replaces an identifier with a surrogate using Format Preserving Encryption (FPE) with the FFX mode of operation; however when used in the `content.reidentify` API method, it serves the opposite function by reversing the surrogate back into the original identifier. The identifier must be encoded as ASCII. For a given crypto key and context, the same identifier will be replaced with the same surrogate. Identifiers must be at least two characters long. In the case that the identifier is the empty string, it will be skipped. See [https://cloud.google.com/dlp/docs/pseudonymization](https://cloud.google.com/dlp/docs/pseudonymization) to learn more.
     *  Note: We recommend using CryptoDeterministicConfig for all use cases which do not require preserving the input alphabet space and size, plus warrant referential integrity.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoReplaceFfxFpeConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.builder
      builder.cryptoReplaceFfxFpeConfig(args(argsBuilder).build)

    /**
     * @param dateShiftConfig Shifts dates by random number of days, with option to be consistent for the same context. See https://cloud.google.com/dlp/docs/concepts-date-shifting to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def dateShiftConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationDateShiftConfigArgs.builder
      builder.dateShiftConfig(args(argsBuilder).build)

    /**
     * @param fixedSizeBucketingConfig Buckets values based on fixed size ranges. The Bucketing transformation can provide all of this functionality, but requires more configuration. This message is provided as a convenience to the user for simple bucketing strategies.
     *  The transformed value will be a hyphenated string of {lower_bound}-{upper_bound}. For example, if lowerBound = 10 and upperBound = 20, all values that are within this bucket will be replaced with &#34;10-20&#34;.
     *  This can be used on data of type: double, long.
     *  If the bound Value type differs from the type of data being transformed, we will first attempt converting the type of the data to be transformed to match the type of the bound before comparing.
     *  See https://cloud.google.com/dlp/docs/concepts-bucketing to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def fixedSizeBucketingConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationFixedSizeBucketingConfigArgs.builder
      builder.fixedSizeBucketingConfig(args(argsBuilder).build)

    /**
     * @param redactConfig Redact a given value. For example, if used with an InfoTypeTransformation transforming PHONE_NUMBER, and input &#39;My phone number is 206-555-0123&#39;, the output would be &#39;My phone number is &#39;.
     * @return builder
     */
    def redactConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationRedactConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationRedactConfigArgs.builder
      builder.redactConfig(args(argsBuilder).build)

    /**
     * @param replaceConfig Replace each input value with a given value.
     *  Structure is documented below.
     * @return builder
     */
    def replaceConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs.builder
      builder.replaceConfig(args(argsBuilder).build)

    /**
     * @param replaceDictionaryConfig Replace with a value randomly drawn (with replacement) from a dictionary.
     *  Structure is documented below.
     * @return builder
     */
    def replaceDictionaryConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigArgs.builder
      builder.replaceDictionaryConfig(args(argsBuilder).build)

    /**
     * @param replaceWithInfoTypeConfig Replace each matching finding with the name of the info type.
     * @return builder
     */
    def replaceWithInfoTypeConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceWithInfoTypeConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceWithInfoTypeConfigArgs.builder
      builder.replaceWithInfoTypeConfig(args(argsBuilder).build)

    /**
     * @param timePartConfig For use with Date, Timestamp, and TimeOfDay, extract or preserve a portion of the value.
     *  Structure is documented below.
     * @return builder
     */
    def timePartConfig(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationTimePartConfigArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationTimePartConfigArgs.builder
      builder.timePartConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetConditionsArgs.Builder)
    /**
     * @param orConditions At least one of the conditions must be true for a table to be scanned.
     *  Structure is documented below.
     * @return builder
     */
    def orConditions(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetConditionsOrConditionsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetConditionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetConditionsOrConditionsArgs.builder
      builder.orConditions(args(argsBuilder).build)

    /**
     * @param types Data profiles will only be generated for the database resource types specified in this field. If not specified, defaults to [DATABASE_RESOURCE_TYPE_ALL_SUPPORTED_TYPES].
     *  Each value may be one of: `DATABASE_RESOURCE_TYPE_ALL_SUPPORTED_TYPES`, `DATABASE_RESOURCE_TYPE_TABLE`.
     * @return builder
     */
    def types(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetConditionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDiscoveryConfigTargetBigQueryTargetConditionsTypesArgs.builder
      builder.types(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionArgs.Builder)
    /**
     * @param field Field within the record this condition is evaluated against.
     *  Structure is documented below.
     * @return builder
     */
    def field(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionFieldArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionFieldArgs.builder
      builder.field(args(argsBuilder).build)

    /**
     * @param value Value to compare against. [Mandatory, except for EXISTS tests.]
     *  Structure is documented below.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionValueArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationConditionExpressionsConditionsConditionValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigArgs.Builder)
    /**
     * @param customInfoTypes Custom info types to be used. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
     *  Structure is documented below.
     * @return builder
     */
    def customInfoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeArgs.builder
      builder.customInfoTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param infoTypes Restricts what infoTypes to look for. The values must correspond to InfoType values returned by infoTypes.list
     *  or listed at https://cloud.google.com/dlp/docs/infotypes-reference.
     *  When no InfoTypes or CustomInfoTypes are specified in a request, the system may automatically choose what detectors to run.
     *  By default this may be all types, but may change over time as detectors are updated.
     *  Structure is documented below.
     * @return builder
     */
    def infoTypes(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigInfoTypeArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigInfoTypeArgs.builder
      builder.infoTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param limits Configuration to control the number of findings returned.
     *  Structure is documented below.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param ruleSets Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end,
     *  other rules are executed in the order they are specified for each info type.
     *  Structure is documented below.
     * @return builder
     */
    def ruleSets(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetArgs.builder
      builder.ruleSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder)
    /**
     * @param context The &#39;tweak&#39;, a context may be used for higher security since the same identifier in two different contexts won&#39;t be given the same surrogate. If the context is not set, a default tweak will be used.
     *  If the context is set but:
     *  1.  there is no record present when transforming a given value or
     *  2.  the field is not present when transforming a given value,
     *      a default tweak will be used.
     *      Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s. Currently, the referenced field may be of value type integer or string.
     *      The tweak is constructed as a sequence of bytes in big endian byte order such that:
     *  *   a 64 bit integer is encoded followed by a single byte of value 1
     *  *   a string is encoded in UTF-8 format followed by a single byte of value 2
     *      Structure is documented below.
     * @return builder
     */
    def context(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs.builder
      builder.context(args(argsBuilder).build)

    /**
     * @param cryptoKey The key used by the encryption algorithm.
     *  Structure is documented below.
     * @return builder
     */
    def cryptoKey(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs.builder
      builder.cryptoKey(args(argsBuilder).build)

    /**
     * @param surrogateInfoType The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of characters comprising the surrogate. The following scheme defines the format: info\_type\_name(surrogate\_character\_count):surrogate
     *  For example, if the name of custom infoType is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
     *  This annotation identifies the surrogate when inspecting content using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it occurs in free text.
     *  In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: \u29ddMY\_TOKEN\_TYPE
     *  Structure is documented below.
     * @return builder
     */
    def surrogateInfoType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs.builder
      builder.surrogateInfoType(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs.Builder)
    /**
     * @param sensitivityScore Optional custom sensitivity for this InfoType. This only applies to data profiling.
     *  Structure is documented below.
     * @return builder
     */
    def sensitivityScore(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeSensitivityScoreArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeSensitivityScoreArgs.builder
      builder.sensitivityScore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs.Builder)
    /**
     * @param charactersToIgnores Characters to skip when doing de-identification of a value. These will be left alone and skipped.
     *  Structure is documented below.
     * @return builder
     */
    def charactersToIgnores(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs.Builder]*):
        com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs.builder
      builder.charactersToIgnores(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs.Builder)
    /**
     * @param infoType Type of information the findings limit applies to. Only one limit per infoType should be provided. If InfoTypeLimit does
     *  not have an infoType, the DLP API applies the limit against all infoTypes that are found but not
     *  specified in another InfoTypeLimit.
     *  Structure is documented below.
     * @return builder
     */
    def infoType(args: Endofunction[com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs.Builder]):
        com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs.builder
      builder.infoType(args(argsBuilder).build)

  /**
   * An inspect job template.
   * 
   *  To get more information about InspectTemplate, see:
   * 
   *  * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.inspectTemplates)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dlp/docs/creating-templates-inspect)
   */
  def PreventionInspectTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataloss.PreventionInspectTemplateArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataloss.PreventionInspectTemplateArgs.builder
    com.pulumi.gcp.dataloss.PreventionInspectTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
