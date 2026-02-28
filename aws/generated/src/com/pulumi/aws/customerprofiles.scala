package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object customerprofiles:
  /**
   * Resource for managing an Amazon Customer Profiles Profile.
   *  See the [Create Profile](https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_CreateProfile.html) for more information.
   */
  def Profile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.customerprofiles.ProfileArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.customerprofiles.ProfileArgs.builder
    
    com.pulumi.aws.customerprofiles.Profile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.customerprofiles.DomainArgs.Builder)
    /**
     * @param matching A block that specifies the process of matching duplicate profiles. Documented below.
     * @return builder
     */
    def matching(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainMatchingArgs.Builder]):
        com.pulumi.aws.customerprofiles.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainMatchingArgs.builder
      builder.matching(args(argsBuilder).build)

    /**
     * @param ruleBasedMatching A block that specifies the process of matching duplicate profiles using the Rule-Based matching. Documented below.
     * @return builder
     */
    def ruleBasedMatching(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingArgs.Builder]):
        com.pulumi.aws.customerprofiles.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingArgs.builder
      builder.ruleBasedMatching(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.customerprofiles.ProfileArgs.Builder)
    /**
     * @param address A block that specifies a generic address associated with the customer that is not mailing, shipping, or billing. Documented below.
     * @return builder
     */
    def address(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.ProfileAddressArgs.Builder]):
        com.pulumi.aws.customerprofiles.ProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.ProfileAddressArgs.builder
      builder.address(args(argsBuilder).build)

    /**
     * @param billingAddress A block that specifies the customer\u2019s billing address. Documented below.
     * @return builder
     */
    def billingAddress(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.ProfileBillingAddressArgs.Builder]):
        com.pulumi.aws.customerprofiles.ProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.ProfileBillingAddressArgs.builder
      builder.billingAddress(args(argsBuilder).build)

    /**
     * @param mailingAddress A block that specifies the customer\u2019s mailing address. Documented below.
     * @return builder
     */
    def mailingAddress(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.ProfileMailingAddressArgs.Builder]):
        com.pulumi.aws.customerprofiles.ProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.ProfileMailingAddressArgs.builder
      builder.mailingAddress(args(argsBuilder).build)

    /**
     * @param shippingAddress A block that specifies the customer\u2019s shipping address. Documented below.
     * @return builder
     */
    def shippingAddress(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.ProfileShippingAddressArgs.Builder]):
        com.pulumi.aws.customerprofiles.ProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.ProfileShippingAddressArgs.builder
      builder.shippingAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.customerprofiles.inputs.DomainState.Builder)
    /**
     * @param matching A block that specifies the process of matching duplicate profiles. Documented below.
     * @return builder
     */
    def matching(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainMatchingArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainMatchingArgs.builder
      builder.matching(args(argsBuilder).build)

    /**
     * @param ruleBasedMatching A block that specifies the process of matching duplicate profiles using the Rule-Based matching. Documented below.
     * @return builder
     */
    def ruleBasedMatching(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingArgs.builder
      builder.ruleBasedMatching(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingExportingConfigArgs.Builder)
    def s3Exporting(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingExportingConfigS3ExportingArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingExportingConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingExportingConfigS3ExportingArgs.builder
      builder.s3Exporting(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.customerprofiles.inputs.DomainMatchingExportingConfigArgs.Builder)
    def s3Exporting(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainMatchingExportingConfigS3ExportingArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.DomainMatchingExportingConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainMatchingExportingConfigS3ExportingArgs.builder
      builder.s3Exporting(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.customerprofiles.inputs.DomainMatchingAutoMergingArgs.Builder)
    /**
     * @param conflictResolution A block that specifies how the auto-merging process should resolve conflicts between different profiles. Documented below.
     * @return builder
     */
    def conflictResolution(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainMatchingAutoMergingConflictResolutionArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.DomainMatchingAutoMergingArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainMatchingAutoMergingConflictResolutionArgs.builder
      builder.conflictResolution(args(argsBuilder).build)

    /**
     * @param consolidation A block that specifies a list of matching attributes that represent matching criteria. If two profiles meet at least one of the requirements in the matching attributes list, they will be merged. Documented below.
     *  * ` minAllowedConfidenceScoreForMerging  ` - (Optional) A number between 0 and 1 that represents the minimum confidence score required for profiles within a matching group to be merged during the auto-merge process. A higher score means higher similarity required to merge profiles.
     * @return builder
     */
    def consolidation(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainMatchingAutoMergingConsolidationArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.DomainMatchingAutoMergingArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainMatchingAutoMergingConsolidationArgs.builder
      builder.consolidation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingArgs.Builder)
    /**
     * @param attributeTypesSelector A block that configures information about the `AttributeTypesSelector` where the rule-based identity resolution uses to match profiles. Documented below.
     * @return builder
     */
    def attributeTypesSelector(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingAttributeTypesSelectorArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingAttributeTypesSelectorArgs.builder
      builder.attributeTypesSelector(args(argsBuilder).build)

    /**
     * @param conflictResolution A block that specifies how the auto-merging process should resolve conflicts between different profiles. Documented below.
     * @return builder
     */
    def conflictResolution(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingConflictResolutionArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingConflictResolutionArgs.builder
      builder.conflictResolution(args(argsBuilder).build)

    /**
     * @param exportingConfig A block that specifies the configuration for exporting Identity Resolution results. Documented below.
     * @return builder
     */
    def exportingConfig(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingExportingConfigArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingExportingConfigArgs.builder
      builder.exportingConfig(args(argsBuilder).build)

    /**
     * @param matchingRules A block that configures how the rule-based matching process should match profiles. You can have up to 15 `rule` in the `natchingRules`. Documented below.
     * @return builder
     */
    def matchingRules(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingMatchingRuleArgs.Builder]*):
        com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingArgs.Builder =
      def argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainRuleBasedMatchingMatchingRuleArgs.builder
      builder.matchingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.customerprofiles.inputs.ProfileState.Builder)
    /**
     * @param address A block that specifies a generic address associated with the customer that is not mailing, shipping, or billing. Documented below.
     * @return builder
     */
    def address(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.ProfileAddressArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.ProfileState.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.ProfileAddressArgs.builder
      builder.address(args(argsBuilder).build)

    /**
     * @param billingAddress A block that specifies the customer\u2019s billing address. Documented below.
     * @return builder
     */
    def billingAddress(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.ProfileBillingAddressArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.ProfileState.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.ProfileBillingAddressArgs.builder
      builder.billingAddress(args(argsBuilder).build)

    /**
     * @param mailingAddress A block that specifies the customer\u2019s mailing address. Documented below.
     * @return builder
     */
    def mailingAddress(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.ProfileMailingAddressArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.ProfileState.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.ProfileMailingAddressArgs.builder
      builder.mailingAddress(args(argsBuilder).build)

    /**
     * @param shippingAddress A block that specifies the customer\u2019s shipping address. Documented below.
     * @return builder
     */
    def shippingAddress(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.ProfileShippingAddressArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.ProfileState.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.ProfileShippingAddressArgs.builder
      builder.shippingAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.customerprofiles.inputs.DomainMatchingArgs.Builder)
    /**
     * @param autoMerging A block that specifies the configuration about the auto-merging process. Documented below.
     * @return builder
     */
    def autoMerging(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainMatchingAutoMergingArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.DomainMatchingArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainMatchingAutoMergingArgs.builder
      builder.autoMerging(args(argsBuilder).build)

    /**
     * @param exportingConfig A block that specifies the configuration for exporting Identity Resolution results. Documented below.
     * @return builder
     */
    def exportingConfig(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainMatchingExportingConfigArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.DomainMatchingArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainMatchingExportingConfigArgs.builder
      builder.exportingConfig(args(argsBuilder).build)

    /**
     * @param jobSchedule A block that specifies the day and time when you want to start the Identity Resolution Job every week. Documented below.
     * @return builder
     */
    def jobSchedule(args: Endofunction[com.pulumi.aws.customerprofiles.inputs.DomainMatchingJobScheduleArgs.Builder]):
        com.pulumi.aws.customerprofiles.inputs.DomainMatchingArgs.Builder =
      val argsBuilder = com.pulumi.aws.customerprofiles.inputs.DomainMatchingJobScheduleArgs.builder
      builder.jobSchedule(args(argsBuilder).build)

  /**
   * Resource for managing an Amazon Customer Profiles Domain.
   *  See the [Create Domain](https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_CreateDomain.html) for more information.
   */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.customerprofiles.DomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.customerprofiles.DomainArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.customerprofiles.Domain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
