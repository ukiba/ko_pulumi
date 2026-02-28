package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object securityhub:
  extension (builder: com.pulumi.aws.securityhub.OrganizationConfigurationArgs.Builder)
    /**
     * @param organizationConfiguration Provides information about the way an organization is configured in Security Hub.
     * @return builder
     */
    def organizationConfiguration(args: Endofunction[com.pulumi.aws.securityhub.inputs.OrganizationConfigurationOrganizationConfigurationArgs.Builder]):
        com.pulumi.aws.securityhub.OrganizationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.OrganizationConfigurationOrganizationConfigurationArgs.builder
      builder.organizationConfiguration(args(argsBuilder).build)

  /** Manages a Security Hub administrator account for an organization. The AWS account utilizing this resource must be an Organizations primary account. More information about Organizations support in Security Hub can be found in the [Security Hub User Guide](https://docs.aws.amazon.com/securityhub/latest/userguide/designate-orgs-admin-account.html). */
  def OrganizationAdminAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.OrganizationAdminAccountArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securityhub.OrganizationAdminAccountArgs.builder
    
    com.pulumi.aws.securityhub.OrganizationAdminAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages Security Hub configuration policy associations.
   *  
   *  &gt; **NOTE:** This resource requires `aws.securityhub.OrganizationConfiguration` to be configured with type `CENTRAL`. More information about Security Hub central configuration and configuration policies can be found in the [How Security Hub configuration policies work](https://docs.aws.amazon.com/securityhub/latest/userguide/configuration-policies-overview.html) documentation.
   */
  def ConfigurationPolicyAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.ConfigurationPolicyAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securityhub.ConfigurationPolicyAssociationArgs.builder
    
    com.pulumi.aws.securityhub.ConfigurationPolicyAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages the Security Hub Organization Configuration.
   *  
   *  &gt; **NOTE:** This resource requires an `aws.securityhub.OrganizationAdminAccount` to be configured (not necessarily with Pulumi). More information about managing Security Hub in an organization can be found in the [Managing administrator and member accounts](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-accounts.html) documentation.
   *  
   *  &gt; **NOTE:** In order to set the `configurationType` to `CENTRAL`, the delegated admin must be a member account of the organization and not the management account. Central configuration also requires an `aws.securityhub.FindingAggregator` to be configured.
   *  
   *  &gt; **NOTE:** This is an advanced AWS resource. Pulumi will automatically assume management of the Security Hub Organization Configuration without import and perform no actions on removal from the Pulumi program.
   *  
   *  &gt; **NOTE:** Deleting this resource resets security hub to a local organization configuration with auto enable false.
   */
  def OrganizationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.OrganizationConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securityhub.OrganizationConfigurationArgs.builder
    
    com.pulumi.aws.securityhub.OrganizationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates Security Hub custom action. */
  def ActionTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.ActionTargetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securityhub.ActionTargetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.securityhub.ActionTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** AWS accounts can only be associated with a single Security Hub master account. Destroying this resource will disassociate the member account from the master account.
   *  
   *  Accepts a Security Hub invitation.
   */
  def InviteAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.InviteAccepterArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securityhub.InviteAccepterArgs.builder
    
    com.pulumi.aws.securityhub.InviteAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type SecurityhubFunctions = com.pulumi.aws.securityhub.SecurityhubFunctions
  object SecurityhubFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.securityhub.SecurityhubFunctions.*
  extension (self: SecurityhubFunctions.type)
    /** Data source for managing an AWS Security Hub Standards Control Associations. */
    def getStandardsControlAssociations(args: Endofunction[com.pulumi.aws.securityhub.inputs.GetStandardsControlAssociationsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.securityhub.outputs.GetStandardsControlAssociationsResult] =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.GetStandardsControlAssociationsArgs.builder
      com.pulumi.aws.securityhub.SecurityhubFunctions.getStandardsControlAssociations(args(argsBuilder).build)

    /** Data source for managing an AWS Security Hub Standards Control Associations. */
    def getStandardsControlAssociationsPlain(args: Endofunction[com.pulumi.aws.securityhub.inputs.GetStandardsControlAssociationsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.securityhub.outputs.GetStandardsControlAssociationsResult] =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.GetStandardsControlAssociationsPlainArgs.builder
      com.pulumi.aws.securityhub.SecurityhubFunctions.getStandardsControlAssociationsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.InsightArgs.Builder)
    /**
     * @param filters A configuration block including one or more (up to 10 distinct) attributes used to filter the findings included in the insight. The insight only includes findings that match criteria defined in the filters. See filters below for more details.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder]):
        com.pulumi.aws.securityhub.InsightArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

  /** Provides a Security Hub custom insight resource. See the [Managing custom insights section](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-custom-insights.html) of the AWS User Guide for more information. */
  def Insight(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.InsightArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securityhub.InsightArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.securityhub.Insight(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Enables Security Hub for this AWS account.
   *  
   *  &gt; **NOTE:** Destroying this resource will disable Security Hub for this AWS account.
   */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.AccountArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securityhub.AccountArgs.builder
    
    com.pulumi.aws.securityhub.Account(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Security Hub finding aggregator. Security Hub needs to be enabled in a region in order for the aggregator to pull through findings. */
  def FindingAggregator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.FindingAggregatorArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securityhub.FindingAggregatorArgs.builder
    
    com.pulumi.aws.securityhub.FindingAggregator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * 
   */
  def StandardsControlAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.StandardsControlAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securityhub.StandardsControlAssociationArgs.builder
    
    com.pulumi.aws.securityhub.StandardsControlAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Subscribes to a Security Hub product. */
  def ProductSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.ProductSubscriptionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securityhub.ProductSubscriptionArgs.builder
    
    com.pulumi.aws.securityhub.ProductSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages Security Hub configuration policy
   *  
   *  &gt; **NOTE:** This resource requires `aws.securityhub.OrganizationConfiguration` to be configured of type `CENTRAL`. More information about Security Hub central configuration and configuration policies can be found in the [How Security Hub configuration policies work](https://docs.aws.amazon.com/securityhub/latest/userguide/configuration-policies-overview.html) documentation.
   */
  def ConfigurationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.ConfigurationPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securityhub.ConfigurationPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.securityhub.ConfigurationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Security Hub member resource. */
  def Member(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.MemberArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securityhub.MemberArgs.builder
    
    com.pulumi.aws.securityhub.Member(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Security Hub Automation Rule. */
  def AutomationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.AutomationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securityhub.AutomationRuleArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.securityhub.AutomationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.securityhub.AutomationRuleArgs.Builder)
    /**
     * @param actions A block that specifies one or more actions to update finding fields if a finding matches the conditions specified in `Criteria`. Documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleActionArgs.Builder]*):
        com.pulumi.aws.securityhub.AutomationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param criteria A block that specifies a set of ASFF finding field attributes and corresponding expected values that Security Hub uses to filter findings. Documented below.
     * @return builder
     */
    def criteria(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder]):
        com.pulumi.aws.securityhub.AutomationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

  /**
   * Disable/enable Security Hub standards control in the current region.
   *  
   *  The `aws.securityhub.StandardsControl` behaves differently from normal resources, in that
   *  Pulumi does not _create_ this resource, but instead &#34;adopts&#34; it
   *  into management. When you _delete_ this resource configuration, Pulumi &#34;abandons&#34; resource as is and just removes it from the state.
   */
  def StandardsControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.StandardsControlArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securityhub.StandardsControlArgs.builder
    
    com.pulumi.aws.securityhub.StandardsControl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Subscribes to a Security Hub standard. */
  def StandardsSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.securityhub.StandardsSubscriptionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.securityhub.StandardsSubscriptionArgs.builder
    
    com.pulumi.aws.securityhub.StandardsSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.securityhub.ConfigurationPolicyArgs.Builder)
    /**
     * @param configurationPolicy Defines how Security Hub is configured. See below.
     * @return builder
     */
    def configurationPolicy(args: Endofunction[com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicyArgs.Builder]):
        com.pulumi.aws.securityhub.ConfigurationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicyArgs.builder
      builder.configurationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.InsightFiltersNoteUpdatedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNoteUpdatedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.InsightFiltersNoteUpdatedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNoteUpdatedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorLastObservedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorLastObservedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorLastObservedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorLastObservedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.OrganizationConfigurationState.Builder)
    /**
     * @param organizationConfiguration Provides information about the way an organization is configured in Security Hub.
     * @return builder
     */
    def organizationConfiguration(args: Endofunction[com.pulumi.aws.securityhub.inputs.OrganizationConfigurationOrganizationConfigurationArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.OrganizationConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.OrganizationConfigurationOrganizationConfigurationArgs.builder
      builder.organizationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaUpdatedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaUpdatedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaUpdatedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaUpdatedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.ConfigurationPolicyState.Builder)
    /**
     * @param configurationPolicy Defines how Security Hub is configured. See below.
     * @return builder
     */
    def configurationPolicy(args: Endofunction[com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicyArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.ConfigurationPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicyArgs.builder
      builder.configurationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterArgs.Builder)
    /**
     * @param parameters An object that specifies parameter values for a control in a configuration policy. See below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.securityhub.inputs.InsightFiltersUpdatedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersUpdatedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.InsightFiltersUpdatedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersUpdatedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsIamAccessKeyCreatedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsIamAccessKeyCreatedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.InsightFiltersFirstObservedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersFirstObservedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.InsightFiltersFirstObservedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersFirstObservedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.InsightFiltersCreatedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersCreatedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.InsightFiltersCreatedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersCreatedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.AutomationRuleActionArgs.Builder)
    /**
     * @param findingFieldsUpdate A block that specifies that the automation rule action is an update to a finding field.  Documented below.
     * @return builder
     */
    def findingFieldsUpdate(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.AutomationRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateArgs.builder
      builder.findingFieldsUpdate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationArgs.Builder)
    /**
     * @param securityControlCustomParameters A list of control parameter customizations that are included in a configuration policy. Include multiple blocks to define multiple control custom parameters. See below.
     * @return builder
     */
    def securityControlCustomParameters(args: Endofunction[com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterArgs.builder
      builder.securityControlCustomParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaCreatedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaCreatedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaCreatedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaCreatedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.InsightFiltersLastObservedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersLastObservedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.InsightFiltersLastObservedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersLastObservedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.Builder)
    /**
     * @param bool The bool `value` for a Boolean-typed Security Hub Control Parameter.
     * @return builder
     */
    def bool(args: Endofunction[com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterBoolArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterBoolArgs.builder
      builder.bool(args(argsBuilder).build)

    /**
     * @param double_ The float `value` for a Double-typed Security Hub Control Parameter.
     * @return builder
     */
    def double_(args: Endofunction[com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDoubleArgs.builder
      builder.double_(args(argsBuilder).build)

    /**
     * @param enum_ The string `value` for a Enum-typed Security Hub Control Parameter.
     * @return builder
     */
    def enum_(args: Endofunction[com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnumArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnumArgs.builder
      builder.enum_(args(argsBuilder).build)

    /**
     * @param enumList The string list `value` for a EnumList-typed Security Hub Control Parameter.
     * @return builder
     */
    def enumList(args: Endofunction[com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnumListArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnumListArgs.builder
      builder.enumList(args(argsBuilder).build)

    /**
     * @param int_ The int `value` for a Int-typed Security Hub Control Parameter.
     * @return builder
     */
    def int_(args: Endofunction[com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterIntArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterIntArgs.builder
      builder.int_(args(argsBuilder).build)

    /**
     * @param intList The int list `value` for a IntList-typed Security Hub Control Parameter.
     * @return builder
     */
    def intList(args: Endofunction[com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterIntListArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterIntListArgs.builder
      builder.intList(args(argsBuilder).build)

    /**
     * @param string The string `value` for a String-typed Security Hub Control Parameter.
     * @return builder
     */
    def string(args: Endofunction[com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterStringArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterStringArgs.builder
      builder.string(args(argsBuilder).build)

    /**
     * @param stringList The string list `value` for a StringList-typed Security Hub Control Parameter.
     * @return builder
     */
    def stringList(args: Endofunction[com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterStringListArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterStringListArgs.builder
      builder.stringList(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.InsightFiltersResourceContainerLaunchedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceContainerLaunchedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.InsightFiltersResourceContainerLaunchedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceContainerLaunchedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceLaunchedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceLaunchedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceLaunchedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceLaunchedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaLastObservedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaLastObservedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaLastObservedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaLastObservedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaFirstObservedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaFirstObservedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaFirstObservedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaFirstObservedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder)
    /**
     * @param awsAccountIds AWS account ID that a finding is generated in. See String_Filter below for more details.
     * @return builder
     */
    def awsAccountIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersAwsAccountIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersAwsAccountIdArgs.builder
      builder.awsAccountIds(args.map(_(argsBuilder).build)*)

    /**
     * @param companyNames The name of the findings provider (company) that owns the solution (product) that generates findings. See String_Filter below for more details.
     * @return builder
     */
    def companyNames(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersCompanyNameArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersCompanyNameArgs.builder
      builder.companyNames(args.map(_(argsBuilder).build)*)

    /**
     * @param complianceStatuses Exclusive to findings that are generated as the result of a check run against a specific rule in a supported standard, such as CIS AWS Foundations. Contains security standard-related finding details. See String Filter below for more details.
     * @return builder
     */
    def complianceStatuses(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersComplianceStatusArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersComplianceStatusArgs.builder
      builder.complianceStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param confidences A finding&#39;s confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence. See Number Filter below for more details.
     * @return builder
     */
    def confidences(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersConfidenceArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersConfidenceArgs.builder
      builder.confidences(args.map(_(argsBuilder).build)*)

    /**
     * @param createdAts An ISO8601-formatted timestamp that indicates when the security-findings provider captured the potential security issue that a finding captured. See Date Filter below for more details.
     * @return builder
     */
    def createdAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersCreatedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersCreatedAtArgs.builder
      builder.createdAts(args.map(_(argsBuilder).build)*)

    /**
     * @param criticalities The level of importance assigned to the resources associated with the finding. A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources. See Number Filter below for more details.
     * @return builder
     */
    def criticalities(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersCriticalityArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersCriticalityArgs.builder
      builder.criticalities(args.map(_(argsBuilder).build)*)

    /**
     * @param descriptions A finding&#39;s description. See String Filter below for more details.
     * @return builder
     */
    def descriptions(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersDescriptionArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersDescriptionArgs.builder
      builder.descriptions(args.map(_(argsBuilder).build)*)

    /**
     * @param findingProviderFieldsConfidences The finding provider value for the finding confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence. See Number Filter below for more details.
     * @return builder
     */
    def findingProviderFieldsConfidences(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsConfidenceArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsConfidenceArgs.builder
      builder.findingProviderFieldsConfidences(args.map(_(argsBuilder).build)*)

    /**
     * @param findingProviderFieldsCriticalities The finding provider value for the level of importance assigned to the resources associated with the findings. A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources. See Number Filter below for more details.
     * @return builder
     */
    def findingProviderFieldsCriticalities(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsCriticalityArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsCriticalityArgs.builder
      builder.findingProviderFieldsCriticalities(args.map(_(argsBuilder).build)*)

    /**
     * @param findingProviderFieldsRelatedFindingsIds The finding identifier of a related finding that is identified by the finding provider. See String Filter below for more details.
     * @return builder
     */
    def findingProviderFieldsRelatedFindingsIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsRelatedFindingsIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsRelatedFindingsIdArgs.builder
      builder.findingProviderFieldsRelatedFindingsIds(args.map(_(argsBuilder).build)*)

    /**
     * @param findingProviderFieldsRelatedFindingsProductArns The ARN of the solution that generated a related finding that is identified by the finding provider. See String Filter below for more details.
     * @return builder
     */
    def findingProviderFieldsRelatedFindingsProductArns(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsRelatedFindingsProductArnArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsRelatedFindingsProductArnArgs.builder
      builder.findingProviderFieldsRelatedFindingsProductArns(args.map(_(argsBuilder).build)*)

    /**
     * @param findingProviderFieldsSeverityLabels The finding provider value for the severity label. See String Filter below for more details.
     * @return builder
     */
    def findingProviderFieldsSeverityLabels(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsSeverityLabelArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsSeverityLabelArgs.builder
      builder.findingProviderFieldsSeverityLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param findingProviderFieldsSeverityOriginals The finding provider&#39;s original value for the severity. See String Filter below for more details.
     * @return builder
     */
    def findingProviderFieldsSeverityOriginals(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsSeverityOriginalArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsSeverityOriginalArgs.builder
      builder.findingProviderFieldsSeverityOriginals(args.map(_(argsBuilder).build)*)

    /**
     * @param findingProviderFieldsTypes One or more finding types that the finding provider assigned to the finding. Uses the format of `namespace/category/classifier` that classify a finding. Valid namespace values include: `Software and Configuration Checks`, `TTPs`, `Effects`, `Unusual Behaviors`, and `Sensitive Data Identifications`. See String Filter below for more details.
     * @return builder
     */
    def findingProviderFieldsTypes(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsTypeArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersFindingProviderFieldsTypeArgs.builder
      builder.findingProviderFieldsTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param firstObservedAts An ISO8601-formatted timestamp that indicates when the security-findings provider first observed the potential security issue that a finding captured. See Date Filter below for more details.
     * @return builder
     */
    def firstObservedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersFirstObservedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersFirstObservedAtArgs.builder
      builder.firstObservedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param generatorIds The identifier for the solution-specific component (a discrete unit of logic) that generated a finding. See String Filter below for more details.
     * @return builder
     */
    def generatorIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersGeneratorIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersGeneratorIdArgs.builder
      builder.generatorIds(args.map(_(argsBuilder).build)*)

    /**
     * @param ids The security findings provider-specific identifier for a finding. See String Filter below for more details.
     * @return builder
     */
    def ids(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersIdArgs.builder
      builder.ids(args.map(_(argsBuilder).build)*)

    /**
     * @param keywords A keyword for a finding. See Keyword Filter below for more details.
     * @return builder
     */
    def keywords(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersKeywordArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersKeywordArgs.builder
      builder.keywords(args.map(_(argsBuilder).build)*)

    /**
     * @param lastObservedAts An ISO8601-formatted timestamp that indicates when the security-findings provider most recently observed the potential security issue that a finding captured. See Date Filter below for more details.
     * @return builder
     */
    def lastObservedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersLastObservedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersLastObservedAtArgs.builder
      builder.lastObservedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param malwareNames The name of the malware that was observed. See String Filter below for more details.
     * @return builder
     */
    def malwareNames(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersMalwareNameArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersMalwareNameArgs.builder
      builder.malwareNames(args.map(_(argsBuilder).build)*)

    /**
     * @param malwarePaths The filesystem path of the malware that was observed. See String Filter below for more details.
     * @return builder
     */
    def malwarePaths(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersMalwarePathArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersMalwarePathArgs.builder
      builder.malwarePaths(args.map(_(argsBuilder).build)*)

    /**
     * @param malwareStates The state of the malware that was observed. See String Filter below for more details.
     * @return builder
     */
    def malwareStates(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersMalwareStateArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersMalwareStateArgs.builder
      builder.malwareStates(args.map(_(argsBuilder).build)*)

    /**
     * @param malwareTypes The type of the malware that was observed. See String Filter below for more details.
     * @return builder
     */
    def malwareTypes(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersMalwareTypeArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersMalwareTypeArgs.builder
      builder.malwareTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param networkDestinationDomains The destination domain of network-related information about a finding. See String Filter below for more details.
     * @return builder
     */
    def networkDestinationDomains(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkDestinationDomainArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkDestinationDomainArgs.builder
      builder.networkDestinationDomains(args.map(_(argsBuilder).build)*)

    /**
     * @param networkDestinationIpv4s The destination IPv4 address of network-related information about a finding. See Ip Filter below for more details.
     * @return builder
     */
    def networkDestinationIpv4s(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkDestinationIpv4Args.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkDestinationIpv4Args.builder
      builder.networkDestinationIpv4s(args.map(_(argsBuilder).build)*)

    /**
     * @param networkDestinationIpv6s The destination IPv6 address of network-related information about a finding. See Ip Filter below for more details.
     * @return builder
     */
    def networkDestinationIpv6s(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkDestinationIpv6Args.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkDestinationIpv6Args.builder
      builder.networkDestinationIpv6s(args.map(_(argsBuilder).build)*)

    /**
     * @param networkDestinationPorts The destination port of network-related information about a finding. See Number Filter below for more details.
     * @return builder
     */
    def networkDestinationPorts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkDestinationPortArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkDestinationPortArgs.builder
      builder.networkDestinationPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param networkDirections Indicates the direction of network traffic associated with a finding. See String Filter below for more details.
     * @return builder
     */
    def networkDirections(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkDirectionArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkDirectionArgs.builder
      builder.networkDirections(args.map(_(argsBuilder).build)*)

    /**
     * @param networkProtocols The protocol of network-related information about a finding. See String Filter below for more details.
     * @return builder
     */
    def networkProtocols(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkProtocolArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkProtocolArgs.builder
      builder.networkProtocols(args.map(_(argsBuilder).build)*)

    /**
     * @param networkSourceDomains The source domain of network-related information about a finding. See String Filter below for more details.
     * @return builder
     */
    def networkSourceDomains(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkSourceDomainArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkSourceDomainArgs.builder
      builder.networkSourceDomains(args.map(_(argsBuilder).build)*)

    /**
     * @param networkSourceIpv4s The source IPv4 address of network-related information about a finding. See Ip Filter below for more details.
     * @return builder
     */
    def networkSourceIpv4s(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkSourceIpv4Args.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkSourceIpv4Args.builder
      builder.networkSourceIpv4s(args.map(_(argsBuilder).build)*)

    /**
     * @param networkSourceIpv6s The source IPv6 address of network-related information about a finding. See Ip Filter below for more details.
     * @return builder
     */
    def networkSourceIpv6s(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkSourceIpv6Args.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkSourceIpv6Args.builder
      builder.networkSourceIpv6s(args.map(_(argsBuilder).build)*)

    /**
     * @param networkSourceMacs The source media access control (MAC) address of network-related information about a finding. See String Filter below for more details.
     * @return builder
     */
    def networkSourceMacs(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkSourceMacArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkSourceMacArgs.builder
      builder.networkSourceMacs(args.map(_(argsBuilder).build)*)

    /**
     * @param networkSourcePorts The source port of network-related information about a finding. See Number Filter below for more details.
     * @return builder
     */
    def networkSourcePorts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkSourcePortArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNetworkSourcePortArgs.builder
      builder.networkSourcePorts(args.map(_(argsBuilder).build)*)

    /**
     * @param noteTexts The text of a note. See String Filter below for more details.
     * @return builder
     */
    def noteTexts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNoteTextArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNoteTextArgs.builder
      builder.noteTexts(args.map(_(argsBuilder).build)*)

    /**
     * @param noteUpdatedAts The timestamp of when the note was updated. See Date Filter below for more details.
     * @return builder
     */
    def noteUpdatedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNoteUpdatedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNoteUpdatedAtArgs.builder
      builder.noteUpdatedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param noteUpdatedBies The principal that created a note. See String Filter below for more details.
     * @return builder
     */
    def noteUpdatedBies(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersNoteUpdatedByArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersNoteUpdatedByArgs.builder
      builder.noteUpdatedBies(args.map(_(argsBuilder).build)*)

    /**
     * @param processLaunchedAts The date/time that the process was launched. See Date Filter below for more details.
     * @return builder
     */
    def processLaunchedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersProcessLaunchedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersProcessLaunchedAtArgs.builder
      builder.processLaunchedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param processNames The name of the process. See String Filter below for more details.
     * @return builder
     */
    def processNames(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersProcessNameArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersProcessNameArgs.builder
      builder.processNames(args.map(_(argsBuilder).build)*)

    /**
     * @param processParentPids The parent process ID. See Number Filter below for more details.
     * @return builder
     */
    def processParentPids(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersProcessParentPidArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersProcessParentPidArgs.builder
      builder.processParentPids(args.map(_(argsBuilder).build)*)

    /**
     * @param processPaths The path to the process executable. See String Filter below for more details.
     * @return builder
     */
    def processPaths(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersProcessPathArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersProcessPathArgs.builder
      builder.processPaths(args.map(_(argsBuilder).build)*)

    /**
     * @param processPids The process ID. See Number Filter below for more details.
     * @return builder
     */
    def processPids(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersProcessPidArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersProcessPidArgs.builder
      builder.processPids(args.map(_(argsBuilder).build)*)

    /**
     * @param processTerminatedAts The date/time that the process was terminated. See Date Filter below for more details.
     * @return builder
     */
    def processTerminatedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersProcessTerminatedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersProcessTerminatedAtArgs.builder
      builder.processTerminatedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param productArns The ARN generated by Security Hub that uniquely identifies a third-party company (security findings provider) after this provider&#39;s product (solution that generates findings) is registered with Security Hub. See String Filter below for more details.
     * @return builder
     */
    def productArns(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersProductArnArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersProductArnArgs.builder
      builder.productArns(args.map(_(argsBuilder).build)*)

    /**
     * @param productFields A data type where security-findings providers can include additional solution-specific details that aren&#39;t part of the defined `AwsSecurityFinding` format. See Map Filter below for more details.
     * @return builder
     */
    def productFields(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersProductFieldArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersProductFieldArgs.builder
      builder.productFields(args.map(_(argsBuilder).build)*)

    /**
     * @param productNames The name of the solution (product) that generates findings. See String Filter below for more details.
     * @return builder
     */
    def productNames(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersProductNameArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersProductNameArgs.builder
      builder.productNames(args.map(_(argsBuilder).build)*)

    /**
     * @param recommendationTexts The recommendation of what to do about the issue described in a finding. See String Filter below for more details.
     * @return builder
     */
    def recommendationTexts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersRecommendationTextArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersRecommendationTextArgs.builder
      builder.recommendationTexts(args.map(_(argsBuilder).build)*)

    /**
     * @param recordStates The updated record state for the finding. See String Filter below for more details.
     * @return builder
     */
    def recordStates(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersRecordStateArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersRecordStateArgs.builder
      builder.recordStates(args.map(_(argsBuilder).build)*)

    /**
     * @param relatedFindingsIds The solution-generated identifier for a related finding. See String Filter below for more details.
     * @return builder
     */
    def relatedFindingsIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersRelatedFindingsIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersRelatedFindingsIdArgs.builder
      builder.relatedFindingsIds(args.map(_(argsBuilder).build)*)

    /**
     * @param relatedFindingsProductArns The ARN of the solution that generated a related finding. See String Filter below for more details.
     * @return builder
     */
    def relatedFindingsProductArns(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersRelatedFindingsProductArnArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersRelatedFindingsProductArnArgs.builder
      builder.relatedFindingsProductArns(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsEc2InstanceIamInstanceProfileArns The IAM profile ARN of the instance. See String Filter below for more details.
     * @return builder
     */
    def resourceAwsEc2InstanceIamInstanceProfileArns(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceIamInstanceProfileArnArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceIamInstanceProfileArnArgs.builder
      builder.resourceAwsEc2InstanceIamInstanceProfileArns(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsEc2InstanceImageIds The Amazon Machine Image (AMI) ID of the instance. See String Filter below for more details.
     * @return builder
     */
    def resourceAwsEc2InstanceImageIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceImageIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceImageIdArgs.builder
      builder.resourceAwsEc2InstanceImageIds(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsEc2InstanceIpv4Addresses The IPv4 addresses associated with the instance. See Ip Filter below for more details.
     * @return builder
     */
    def resourceAwsEc2InstanceIpv4Addresses(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceIpv4AddressArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceIpv4AddressArgs.builder
      builder.resourceAwsEc2InstanceIpv4Addresses(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsEc2InstanceIpv6Addresses The IPv6 addresses associated with the instance. See Ip Filter below for more details.
     * @return builder
     */
    def resourceAwsEc2InstanceIpv6Addresses(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs.builder
      builder.resourceAwsEc2InstanceIpv6Addresses(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsEc2InstanceKeyNames The key name associated with the instance. See String Filter below for more details.
     * @return builder
     */
    def resourceAwsEc2InstanceKeyNames(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceKeyNameArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceKeyNameArgs.builder
      builder.resourceAwsEc2InstanceKeyNames(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsEc2InstanceLaunchedAts The date and time the instance was launched. See Date Filter below for more details.
     * @return builder
     */
    def resourceAwsEc2InstanceLaunchedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceLaunchedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceLaunchedAtArgs.builder
      builder.resourceAwsEc2InstanceLaunchedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsEc2InstanceSubnetIds The identifier of the subnet that the instance was launched in. See String Filter below for more details.
     * @return builder
     */
    def resourceAwsEc2InstanceSubnetIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceSubnetIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceSubnetIdArgs.builder
      builder.resourceAwsEc2InstanceSubnetIds(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsEc2InstanceTypes The instance type of the instance. See String Filter below for more details.
     * @return builder
     */
    def resourceAwsEc2InstanceTypes(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceTypeArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceTypeArgs.builder
      builder.resourceAwsEc2InstanceTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsEc2InstanceVpcIds The identifier of the VPC that the instance was launched in. See String Filter below for more details.
     * @return builder
     */
    def resourceAwsEc2InstanceVpcIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceVpcIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsEc2InstanceVpcIdArgs.builder
      builder.resourceAwsEc2InstanceVpcIds(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsIamAccessKeyCreatedAts The creation date/time of the IAM access key related to a finding. See Date Filter below for more details.
     * @return builder
     */
    def resourceAwsIamAccessKeyCreatedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsIamAccessKeyCreatedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsIamAccessKeyCreatedAtArgs.builder
      builder.resourceAwsIamAccessKeyCreatedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsIamAccessKeyStatuses The status of the IAM access key related to a finding. See String Filter below for more details.
     * @return builder
     */
    def resourceAwsIamAccessKeyStatuses(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsIamAccessKeyStatusArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsIamAccessKeyStatusArgs.builder
      builder.resourceAwsIamAccessKeyStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsIamAccessKeyUserNames The user associated with the IAM access key related to a finding. See String Filter below for more details.
     * @return builder
     */
    def resourceAwsIamAccessKeyUserNames(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsIamAccessKeyUserNameArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsIamAccessKeyUserNameArgs.builder
      builder.resourceAwsIamAccessKeyUserNames(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsS3BucketOwnerIds The canonical user ID of the owner of the S3 bucket. See String Filter below for more details.
     * @return builder
     */
    def resourceAwsS3BucketOwnerIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsS3BucketOwnerIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsS3BucketOwnerIdArgs.builder
      builder.resourceAwsS3BucketOwnerIds(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceAwsS3BucketOwnerNames The display name of the owner of the S3 bucket. See String Filter below for more details.
     * @return builder
     */
    def resourceAwsS3BucketOwnerNames(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsS3BucketOwnerNameArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsS3BucketOwnerNameArgs.builder
      builder.resourceAwsS3BucketOwnerNames(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceContainerImageIds The identifier of the image related to a finding. See String Filter below for more details.
     * @return builder
     */
    def resourceContainerImageIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceContainerImageIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceContainerImageIdArgs.builder
      builder.resourceContainerImageIds(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceContainerImageNames The name of the image related to a finding. See String Filter below for more details.
     * @return builder
     */
    def resourceContainerImageNames(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceContainerImageNameArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceContainerImageNameArgs.builder
      builder.resourceContainerImageNames(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceContainerLaunchedAts The date/time that the container was started. See Date Filter below for more details.
     * @return builder
     */
    def resourceContainerLaunchedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceContainerLaunchedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceContainerLaunchedAtArgs.builder
      builder.resourceContainerLaunchedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceContainerNames The name of the container related to a finding. See String Filter below for more details.
     * @return builder
     */
    def resourceContainerNames(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceContainerNameArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceContainerNameArgs.builder
      builder.resourceContainerNames(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceDetailsOthers The details of a resource that doesn&#39;t have a specific subfield for the resource type defined. See Map Filter below for more details.
     * @return builder
     */
    def resourceDetailsOthers(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceDetailsOtherArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceDetailsOtherArgs.builder
      builder.resourceDetailsOthers(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceIds The canonical identifier for the given resource type. See String Filter below for more details.
     * @return builder
     */
    def resourceIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceIdArgs.builder
      builder.resourceIds(args.map(_(argsBuilder).build)*)

    /**
     * @param resourcePartitions The canonical AWS partition name that the Region is assigned to. See String Filter below for more details.
     * @return builder
     */
    def resourcePartitions(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourcePartitionArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourcePartitionArgs.builder
      builder.resourcePartitions(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceRegions The canonical AWS external Region name where this resource is located. See String Filter below for more details.
     * @return builder
     */
    def resourceRegions(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceRegionArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceRegionArgs.builder
      builder.resourceRegions(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceTags A list of AWS tags associated with a resource at the time the finding was processed. See Map Filter below for more details.
     * @return builder
     */
    def resourceTags(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceTagArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceTagArgs.builder
      builder.resourceTags(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceTypes Specifies the type of the resource that details are provided for. See String Filter below for more details.
     * @return builder
     */
    def resourceTypes(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersResourceTypeArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersResourceTypeArgs.builder
      builder.resourceTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param severityLabels The label of a finding&#39;s severity. See String Filter below for more details.
     * @return builder
     */
    def severityLabels(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersSeverityLabelArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersSeverityLabelArgs.builder
      builder.severityLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceUrls A URL that links to a page about the current finding in the security-findings provider&#39;s solution. See String Filter below for more details.
     * @return builder
     */
    def sourceUrls(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersSourceUrlArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersSourceUrlArgs.builder
      builder.sourceUrls(args.map(_(argsBuilder).build)*)

    /**
     * @param threatIntelIndicatorCategories The category of a threat intelligence indicator. See String Filter below for more details.
     * @return builder
     */
    def threatIntelIndicatorCategories(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorCategoryArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorCategoryArgs.builder
      builder.threatIntelIndicatorCategories(args.map(_(argsBuilder).build)*)

    /**
     * @param threatIntelIndicatorLastObservedAts The date/time of the last observation of a threat intelligence indicator. See Date Filter below for more details.
     * @return builder
     */
    def threatIntelIndicatorLastObservedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorLastObservedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorLastObservedAtArgs.builder
      builder.threatIntelIndicatorLastObservedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param threatIntelIndicatorSourceUrls The URL for more details from the source of the threat intelligence. See String Filter below for more details.
     * @return builder
     */
    def threatIntelIndicatorSourceUrls(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorSourceUrlArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorSourceUrlArgs.builder
      builder.threatIntelIndicatorSourceUrls(args.map(_(argsBuilder).build)*)

    /**
     * @param threatIntelIndicatorSources The source of the threat intelligence. See String Filter below for more details.
     * @return builder
     */
    def threatIntelIndicatorSources(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorSourceArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorSourceArgs.builder
      builder.threatIntelIndicatorSources(args.map(_(argsBuilder).build)*)

    /**
     * @param threatIntelIndicatorTypes The type of a threat intelligence indicator. See String Filter below for more details.
     * @return builder
     */
    def threatIntelIndicatorTypes(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorTypeArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorTypeArgs.builder
      builder.threatIntelIndicatorTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param threatIntelIndicatorValues The value of a threat intelligence indicator. See String Filter below for more details.
     * @return builder
     */
    def threatIntelIndicatorValues(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorValueArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersThreatIntelIndicatorValueArgs.builder
      builder.threatIntelIndicatorValues(args.map(_(argsBuilder).build)*)

    /**
     * @param titles A finding&#39;s title. See String Filter below for more details.
     * @return builder
     */
    def titles(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersTitleArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersTitleArgs.builder
      builder.titles(args.map(_(argsBuilder).build)*)

    /**
     * @param types A finding type in the format of `namespace/category/classifier` that classifies a finding. See String Filter below for more details.
     * @return builder
     */
    def types(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersTypeArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersTypeArgs.builder
      builder.types(args.map(_(argsBuilder).build)*)

    /**
     * @param updatedAts An ISO8601-formatted timestamp that indicates when the security-findings provider last updated the finding record. See Date Filter below for more details.
     * @return builder
     */
    def updatedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersUpdatedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersUpdatedAtArgs.builder
      builder.updatedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param userDefinedValues A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a finding. See Map Filter below for more details.
     * @return builder
     */
    def userDefinedValues(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersUserDefinedValueArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersUserDefinedValueArgs.builder
      builder.userDefinedValues(args.map(_(argsBuilder).build)*)

    /**
     * @param verificationStates The veracity of a finding. See String Filter below for more details.
     * @return builder
     */
    def verificationStates(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersVerificationStateArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersVerificationStateArgs.builder
      builder.verificationStates(args.map(_(argsBuilder).build)*)

    /**
     * @param workflowStatuses The status of the investigation into a finding. See Workflow Status Filter below for more details.
     * @return builder
     */
    def workflowStatuses(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersWorkflowStatusArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersWorkflowStatusArgs.builder
      builder.workflowStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.securityhub.inputs.InsightState.Builder)
    /**
     * @param filters A configuration block including one or more (up to 10 distinct) attributes used to filter the findings included in the insight. The insight only includes findings that match criteria defined in the filters. See filters below for more details.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.InsightState.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaNoteUpdatedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaNoteUpdatedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaNoteUpdatedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaNoteUpdatedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder)
    /**
     * @param awsAccountIds The AWS account ID in which a finding was generated. Documented below.
     * @return builder
     */
    def awsAccountIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaAwsAccountIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaAwsAccountIdArgs.builder
      builder.awsAccountIds(args.map(_(argsBuilder).build)*)

    /**
     * @param awsAccountNames The name of the AWS account in which a finding was generated. Documented below.
     * @return builder
     */
    def awsAccountNames(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaAwsAccountNameArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaAwsAccountNameArgs.builder
      builder.awsAccountNames(args.map(_(argsBuilder).build)*)

    /**
     * @param companyNames The name of the company for the product that generated the finding. For control-based findings, the company is AWS. Documented below.
     * @return builder
     */
    def companyNames(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaCompanyNameArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaCompanyNameArgs.builder
      builder.companyNames(args.map(_(argsBuilder).build)*)

    /**
     * @param complianceAssociatedStandardsIds The unique identifier of a standard in which a control is enabled. Documented below.
     * @return builder
     */
    def complianceAssociatedStandardsIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaComplianceAssociatedStandardsIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaComplianceAssociatedStandardsIdArgs.builder
      builder.complianceAssociatedStandardsIds(args.map(_(argsBuilder).build)*)

    /**
     * @param complianceSecurityControlIds The security control ID for which a finding was generated. Security control IDs are the same across standards. Documented below.
     * @return builder
     */
    def complianceSecurityControlIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaComplianceSecurityControlIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaComplianceSecurityControlIdArgs.builder
      builder.complianceSecurityControlIds(args.map(_(argsBuilder).build)*)

    /**
     * @param complianceStatuses The result of a security check. This field is only used for findings generated from controls. Documented below.
     * @return builder
     */
    def complianceStatuses(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaComplianceStatusArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaComplianceStatusArgs.builder
      builder.complianceStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param confidences The likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. `Confidence` is scored on a 0\u2013100 basis using a ratio scale. A value of `0` means 0 percent confidence, and a value of `100` means 100 percent confidence. Documented below.
     * @return builder
     */
    def confidences(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaConfidenceArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaConfidenceArgs.builder
      builder.confidences(args.map(_(argsBuilder).build)*)

    /**
     * @param createdAts A timestamp that indicates when this finding record was created. Documented below.
     * @return builder
     */
    def createdAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaCreatedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaCreatedAtArgs.builder
      builder.createdAts(args.map(_(argsBuilder).build)*)

    /**
     * @param criticalities The level of importance that is assigned to the resources that are associated with a finding. Documented below.
     * @return builder
     */
    def criticalities(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaCriticalityArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaCriticalityArgs.builder
      builder.criticalities(args.map(_(argsBuilder).build)*)

    /**
     * @param descriptions A finding&#39;s description. Documented below.
     * @return builder
     */
    def descriptions(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaDescriptionArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaDescriptionArgs.builder
      builder.descriptions(args.map(_(argsBuilder).build)*)

    /**
     * @param firstObservedAts A timestamp that indicates when the potential security issue captured by a finding was first observed by the security findings product. Documented below.
     * @return builder
     */
    def firstObservedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaFirstObservedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaFirstObservedAtArgs.builder
      builder.firstObservedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param generatorIds The identifier for the solution-specific component that generated a finding. Documented below.
     * @return builder
     */
    def generatorIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaGeneratorIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaGeneratorIdArgs.builder
      builder.generatorIds(args.map(_(argsBuilder).build)*)

    /**
     * @param ids The product-specific identifier for a finding. Documented below.
     * @return builder
     */
    def ids(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaIdArgs.builder
      builder.ids(args.map(_(argsBuilder).build)*)

    /**
     * @param lastObservedAts A timestamp that indicates when the potential security issue captured by a finding was most recently observed by the security findings product. Documented below.
     * @return builder
     */
    def lastObservedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaLastObservedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaLastObservedAtArgs.builder
      builder.lastObservedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param noteTexts The text of a user-defined note that&#39;s added to a finding. Documented below.
     * @return builder
     */
    def noteTexts(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaNoteTextArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaNoteTextArgs.builder
      builder.noteTexts(args.map(_(argsBuilder).build)*)

    /**
     * @param noteUpdatedAts The timestamp of when the note was updated. Documented below.
     * @return builder
     */
    def noteUpdatedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaNoteUpdatedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaNoteUpdatedAtArgs.builder
      builder.noteUpdatedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param noteUpdatedBies The principal that created a note. Documented below.
     * @return builder
     */
    def noteUpdatedBies(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaNoteUpdatedByArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaNoteUpdatedByArgs.builder
      builder.noteUpdatedBies(args.map(_(argsBuilder).build)*)

    /**
     * @param productArns The Amazon Resource Name (ARN) for a third-party product that generated a finding in Security Hub. Documented below.
     * @return builder
     */
    def productArns(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaProductArnArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaProductArnArgs.builder
      builder.productArns(args.map(_(argsBuilder).build)*)

    /**
     * @param productNames Provides the name of the product that generated the finding. For control-based findings, the product name is Security Hub. Documented below.
     * @return builder
     */
    def productNames(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaProductNameArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaProductNameArgs.builder
      builder.productNames(args.map(_(argsBuilder).build)*)

    /**
     * @param recordStates Provides the current state of a finding. Documented below.
     * @return builder
     */
    def recordStates(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaRecordStateArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaRecordStateArgs.builder
      builder.recordStates(args.map(_(argsBuilder).build)*)

    /**
     * @param relatedFindingsIds The product-generated identifier for a related finding.  Documented below.
     * @return builder
     */
    def relatedFindingsIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaRelatedFindingsIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaRelatedFindingsIdArgs.builder
      builder.relatedFindingsIds(args.map(_(argsBuilder).build)*)

    /**
     * @param relatedFindingsProductArns The ARN for the product that generated a related finding. Documented below.
     * @return builder
     */
    def relatedFindingsProductArns(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaRelatedFindingsProductArnArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaRelatedFindingsProductArnArgs.builder
      builder.relatedFindingsProductArns(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceApplicationArns The Amazon Resource Name (ARN) of the application that is related to a finding. Documented below.
     * @return builder
     */
    def resourceApplicationArns(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceApplicationArnArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceApplicationArnArgs.builder
      builder.resourceApplicationArns(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceApplicationNames The name of the application that is related to a finding. Documented below.
     * @return builder
     */
    def resourceApplicationNames(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceApplicationNameArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceApplicationNameArgs.builder
      builder.resourceApplicationNames(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceDetailsOthers Custom fields and values about the resource that a finding pertains to. Documented below.
     * @return builder
     */
    def resourceDetailsOthers(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceDetailsOtherArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceDetailsOtherArgs.builder
      builder.resourceDetailsOthers(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceIds The identifier for the given resource type. For AWS resources that are identified by Amazon Resource Names (ARNs), this is the ARN. For AWS resources that lack ARNs, this is the identifier as defined by the AWS service that created the resource. For non-AWS resources, this is a unique identifier that is associated with the resource. Documented below.
     * @return builder
     */
    def resourceIds(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceIdArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceIdArgs.builder
      builder.resourceIds(args.map(_(argsBuilder).build)*)

    /**
     * @param resourcePartitions The partition in which the resource that the finding pertains to is located. A partition is a group of AWS Regions. Each AWS account is scoped to one partition. Documented below.
     * @return builder
     */
    def resourcePartitions(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourcePartitionArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourcePartitionArgs.builder
      builder.resourcePartitions(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceRegions The AWS Region where the resource that a finding pertains to is located. Documented below.
     * @return builder
     */
    def resourceRegions(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceRegionArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceRegionArgs.builder
      builder.resourceRegions(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceTags A list of AWS tags associated with a resource at the time the finding was processed. Documented below.
     * @return builder
     */
    def resourceTags(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceTagArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceTagArgs.builder
      builder.resourceTags(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceTypes The type of resource that the finding pertains to. Documented below.
     * @return builder
     */
    def resourceTypes(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceTypeArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaResourceTypeArgs.builder
      builder.resourceTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param severityLabels The severity value of the finding. Documented below.
     * @return builder
     */
    def severityLabels(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaSeverityLabelArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaSeverityLabelArgs.builder
      builder.severityLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceUrls Provides a URL that links to a page about the current finding in the finding product. Documented below.
     * @return builder
     */
    def sourceUrls(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaSourceUrlArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaSourceUrlArgs.builder
      builder.sourceUrls(args.map(_(argsBuilder).build)*)

    /**
     * @param titles A finding&#39;s title. Documented below.
     * @return builder
     */
    def titles(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaTitleArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaTitleArgs.builder
      builder.titles(args.map(_(argsBuilder).build)*)

    /**
     * @param types One or more finding types in the format of namespace/category/classifier that classify a finding. Documented below.
     * @return builder
     */
    def types(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaTypeArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaTypeArgs.builder
      builder.types(args.map(_(argsBuilder).build)*)

    /**
     * @param updatedAts A timestamp that indicates when the finding record was most recently updated. Documented below.
     * @return builder
     */
    def updatedAts(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaUpdatedAtArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaUpdatedAtArgs.builder
      builder.updatedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param userDefinedFields A list of user-defined name and value string pairs added to a finding. Documented below.
     * @return builder
     */
    def userDefinedFields(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaUserDefinedFieldArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaUserDefinedFieldArgs.builder
      builder.userDefinedFields(args.map(_(argsBuilder).build)*)

    /**
     * @param verificationStates Provides the veracity of a finding. Documented below.
     * @return builder
     */
    def verificationStates(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaVerificationStateArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaVerificationStateArgs.builder
      builder.verificationStates(args.map(_(argsBuilder).build)*)

    /**
     * @param workflowStatuses Provides information about the status of the investigation into a finding. Documented below.
     * @return builder
     */
    def workflowStatuses(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaWorkflowStatusArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaWorkflowStatusArgs.builder
      builder.workflowStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.securityhub.inputs.InsightFiltersProcessLaunchedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersProcessLaunchedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.InsightFiltersProcessLaunchedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersProcessLaunchedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateArgs.Builder)
    /**
     * @param note A resource block that updates the note. Documented below.
     * @return builder
     */
    def note(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateNoteArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateNoteArgs.builder
      builder.note(args(argsBuilder).build)

    /**
     * @param relatedFindings A resource block that the rule action updates the `RelatedFindings` field of a finding. Documented below.
     * @return builder
     */
    def relatedFindings(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateRelatedFindingArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateArgs.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateRelatedFindingArgs.builder
      builder.relatedFindings(args.map(_(argsBuilder).build)*)

    /**
     * @param severity A resource block that updates to the severity information for a finding. Documented below.
     * @return builder
     */
    def severity(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateSeverityArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateSeverityArgs.builder
      builder.severity(args(argsBuilder).build)

    /**
     * @param workflow A resource block that is used to update information about the investigation into the finding. Documented below.
     * @return builder
     */
    def workflow(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateWorkflowArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleActionFindingFieldsUpdateWorkflowArgs.builder
      builder.workflow(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicyArgs.Builder)
    /**
     * @param securityControlsConfiguration Defines which security controls are enabled in the configuration policy and any customizations to parameters affecting them. See below.
     * @return builder
     */
    def securityControlsConfiguration(args: Endofunction[com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationArgs.builder
      builder.securityControlsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.InsightFiltersProcessTerminatedAtArgs.Builder)
    /**
     * @param dateRange A configuration block of the date range for the date filter. See dateRange below for more details.
     * @return builder
     */
    def dateRange(args: Endofunction[com.pulumi.aws.securityhub.inputs.InsightFiltersProcessTerminatedAtDateRangeArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.InsightFiltersProcessTerminatedAtArgs.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.InsightFiltersProcessTerminatedAtDateRangeArgs.builder
      builder.dateRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.securityhub.inputs.AutomationRuleState.Builder)
    /**
     * @param actions A block that specifies one or more actions to update finding fields if a finding matches the conditions specified in `Criteria`. Documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleActionArgs.Builder]*):
        com.pulumi.aws.securityhub.inputs.AutomationRuleState.Builder =
      def argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param criteria A block that specifies a set of ASFF finding field attributes and corresponding expected values that Security Hub uses to filter findings. Documented below.
     * @return builder
     */
    def criteria(args: Endofunction[com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.Builder]):
        com.pulumi.aws.securityhub.inputs.AutomationRuleState.Builder =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.AutomationRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)
