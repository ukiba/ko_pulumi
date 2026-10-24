package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object securityhub:
  /**
   * Enables Security Hub CSPM for this AWS account.
   * 
   * &gt; **NOTE:** Destroying this resource will disable Security Hub for this AWS account.
   * 
   * &gt; **NOTE:** This resource manages Security Hub CSPM, which is distinct from the unified Security Hub V2 service managed by `aws.securityhub.AccountV2`. Both can coexist in the same account.
   */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.AccountArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securityhub.AccountArgs.builder
    com.pulumi.aws.securityhub.Account(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Enables the unified Security Hub V2 for this AWS account.
   * 
   * &gt; **NOTE:** Destroying this resource will disable Security Hub V2 for this AWS account.
   * 
   * &gt; **NOTE:** This resource manages the unified Security Hub V2 service, which is distinct from the classic Security Hub CSPM managed by `aws.securityhub.Account`. Both can coexist in the same account.
   */
  def AccountV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.AccountV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securityhub.AccountV2Args.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.securityhub.AccountV2(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Creates Security Hub custom action. */
  def ActionTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.ActionTargetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securityhub.ActionTargetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.securityhub.ActionTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Security Hub V2 Aggregator, which enables cross-region finding aggregation.
   * 
   * &gt; **NOTE:** Security Hub V2 must be enabled (`aws.securityhub.AccountV2`) before creating an aggregator.
   */
  def AggregatorV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.AggregatorV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securityhub.AggregatorV2Args.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.securityhub.AggregatorV2(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Security Hub Automation Rule. */
  def AutomationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.AutomationRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securityhub.AutomationRuleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.securityhub.AutomationRule(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Security Hub V2 Automation Rule, which automatically updates or takes action on findings that match specified criteria.
   * 
   * &gt; **NOTE:** Automation rules must be created in the aggregation (home) region. A Security Hub V2 Aggregator (`aws.securityhub.AggregatorV2`) must exist before creating automation rules.
   */
  def AutomationRuleV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.AutomationRuleV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securityhub.AutomationRuleV2Args.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.securityhub.AutomationRuleV2(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages Security Hub configuration policy
   * 
   * &gt; **NOTE:** This resource requires `aws.securityhub.OrganizationConfiguration` to be configured of type `CENTRAL`. More information about Security Hub central configuration and configuration policies can be found in the [How Security Hub configuration policies work](https://docs.aws.amazon.com/securityhub/latest/userguide/configuration-policies-overview.html) documentation.
   */
  def ConfigurationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.ConfigurationPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securityhub.ConfigurationPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.securityhub.ConfigurationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages Security Hub configuration policy associations.
   * 
   * &gt; **NOTE:** This resource requires `aws.securityhub.OrganizationConfiguration` to be configured with type `CENTRAL`. More information about Security Hub central configuration and configuration policies can be found in the [How Security Hub configuration policies work](https://docs.aws.amazon.com/securityhub/latest/userguide/configuration-policies-overview.html) documentation.
   */
  def ConfigurationPolicyAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.ConfigurationPolicyAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securityhub.ConfigurationPolicyAssociationArgs.builder
    com.pulumi.aws.securityhub.ConfigurationPolicyAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Security Hub V2 connector.
   * 
   * &gt; **NOTE:** Connectors must be created in the aggregation (home) region. A Security Hub V2 Aggregator (`aws.securityhub.AggregatorV2`) must exist before creating connectors.
   * 
   * &gt; **NOTE:** After creation, the connector will be in `PENDING_AUTHORIZATION` status. Use the `authUrl` output to complete the OAuth authorization flow.
   */
  def ConnectorV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.ConnectorV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securityhub.ConnectorV2Args.builder
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
    com.pulumi.aws.securityhub.ConnectorV2(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an opt-in [Security Hub V2](https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html) feature, such as network scanning (NetScan), for the calling account in the current AWS Region.
   * 
   * &gt; **NOTE:** Security Hub V2 must be enabled (see `aws.securityhub.AccountV2`) before you can enable a feature. Use `dependsOn` to ensure the correct ordering.
   * 
   * &gt; **NOTE:** Deleting this resource does not disable the feature, the resource in simply removed from state instead.
   * 
   * &gt; **NOTE:** You cannot enable a feature that is managed by an organization policy.
   */
  def FeatureV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.FeatureV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securityhub.FeatureV2Args.builder
    com.pulumi.aws.securityhub.FeatureV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Security Hub finding aggregator. Security Hub needs to be enabled in a region in order for the aggregator to pull through findings. */
  def FindingAggregator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.FindingAggregatorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securityhub.FindingAggregatorArgs.builder
    com.pulumi.aws.securityhub.FindingAggregator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Security Hub custom insight resource. See the [Managing custom insights section](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-custom-insights.html) of the AWS User Guide for more information. */
  def Insight(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.InsightArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.securityhub.InsightArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.securityhub.Insight(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * &gt; **Note:** AWS accounts can only be associated with a single Security Hub master account. Destroying this resource will disassociate the member account from the master account.
   * 
   * Accepts a Security Hub invitation.
   */
  def InviteAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.InviteAccepterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securityhub.InviteAccepterArgs.builder
    com.pulumi.aws.securityhub.InviteAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Security Hub member resource. */
  def Member(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.MemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securityhub.MemberArgs.builder
    com.pulumi.aws.securityhub.Member(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Security Hub administrator account for an organization. The AWS account utilizing this resource must be an Organizations primary account. More information about Organizations support in Security Hub can be found in the [Security Hub User Guide](https://docs.aws.amazon.com/securityhub/latest/userguide/designate-orgs-admin-account.html). */
  def OrganizationAdminAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.OrganizationAdminAccountArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securityhub.OrganizationAdminAccountArgs.builder
    com.pulumi.aws.securityhub.OrganizationAdminAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages the Security Hub Organization Configuration.
   * 
   * &gt; **NOTE:** This resource requires an `aws.securityhub.OrganizationAdminAccount` to be configured (not necessarily with Pulumi). More information about managing Security Hub in an organization can be found in the [Managing administrator and member accounts](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-accounts.html) documentation.
   * 
   * &gt; **NOTE:** In order to set the `configurationType` to `CENTRAL`, the delegated admin must be a member account of the organization and not the management account. Central configuration also requires an `aws.securityhub.FindingAggregator` to be configured.
   * 
   * &gt; **NOTE:** This is an advanced AWS resource. Pulumi will automatically assume management of the Security Hub Organization Configuration without import and perform no actions on removal from the Pulumi program.
   * 
   * &gt; **NOTE:** Deleting this resource resets Security Hub to a local organization configuration with auto enable false.
   */
  def OrganizationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.OrganizationConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securityhub.OrganizationConfigurationArgs.builder
    com.pulumi.aws.securityhub.OrganizationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Subscribes to a Security Hub product. */
  def ProductSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.ProductSubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securityhub.ProductSubscriptionArgs.builder
    com.pulumi.aws.securityhub.ProductSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object SecurityhubFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Lists the standards that are currently enabled. */
    inline def getEnabledStandards(args: Endofunction[com.pulumi.aws.securityhub.inputs.GetEnabledStandardsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.securityhub.outputs.GetEnabledStandardsResult] =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.GetEnabledStandardsArgs.builder
      com.pulumi.aws.securityhub.SecurityhubFunctions.getEnabledStandards(args(argsBuilder).build)

    /** Lists the standards that are currently enabled. */
    inline def getEnabledStandardsPlain(args: Endofunction[com.pulumi.aws.securityhub.inputs.GetEnabledStandardsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.securityhub.outputs.GetEnabledStandardsResult] =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.GetEnabledStandardsPlainArgs.builder
      com.pulumi.aws.securityhub.SecurityhubFunctions.getEnabledStandardsPlain(args(argsBuilder).build)

    /** Lists security controls. */
    inline def getSecurityControls(args: Endofunction[com.pulumi.aws.securityhub.inputs.GetSecurityControlsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.securityhub.outputs.GetSecurityControlsResult] =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.GetSecurityControlsArgs.builder
      com.pulumi.aws.securityhub.SecurityhubFunctions.getSecurityControls(args(argsBuilder).build)

    /** Lists security controls. */
    inline def getSecurityControlsPlain(args: Endofunction[com.pulumi.aws.securityhub.inputs.GetSecurityControlsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.securityhub.outputs.GetSecurityControlsResult] =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.GetSecurityControlsPlainArgs.builder
      com.pulumi.aws.securityhub.SecurityhubFunctions.getSecurityControlsPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Security Hub Standards Control Associations. */
    inline def getStandardsControlAssociations(args: Endofunction[com.pulumi.aws.securityhub.inputs.GetStandardsControlAssociationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.securityhub.outputs.GetStandardsControlAssociationsResult] =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.GetStandardsControlAssociationsArgs.builder
      com.pulumi.aws.securityhub.SecurityhubFunctions.getStandardsControlAssociations(args(argsBuilder).build)

    /** Data source for managing an AWS Security Hub Standards Control Associations. */
    inline def getStandardsControlAssociationsPlain(args: Endofunction[com.pulumi.aws.securityhub.inputs.GetStandardsControlAssociationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.securityhub.outputs.GetStandardsControlAssociationsResult] =
      val argsBuilder = com.pulumi.aws.securityhub.inputs.GetStandardsControlAssociationsPlainArgs.builder
      com.pulumi.aws.securityhub.SecurityhubFunctions.getStandardsControlAssociationsPlain(args(argsBuilder).build)

  /**
   * Disable/enable Security Hub standards control in the current region.
   * 
   * The `aws.securityhub.StandardsControl` behaves differently from normal resources, in that
   * Pulumi does not _create_ this resource, but instead &#34;adopts&#34; it
   * into management. When you _delete_ this resource configuration, Pulumi &#34;abandons&#34; resource as is and just removes it from the state.
   */
  def StandardsControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.StandardsControlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securityhub.StandardsControlArgs.builder
    com.pulumi.aws.securityhub.StandardsControl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an AWS Security Hub Standards Control Association.
   * 
   * Disable/enable Security Hub security control in the standard.
   * 
   * The `aws.securityhub.StandardsControlAssociation`, similarly to `aws.securityhub.StandardsControl`,
   * behaves differently from normal resources, in that Terraform does not _create_ this resource, but instead &#34;adopts&#34; it
   * into management. When you _delete_ this resource configuration, Terraform &#34;abandons&#34; resource as is and just removes it from the state.
   */
  def StandardsControlAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.StandardsControlAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securityhub.StandardsControlAssociationArgs.builder
    com.pulumi.aws.securityhub.StandardsControlAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Subscribes to a Security Hub standard. */
  def StandardsSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.securityhub.StandardsSubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.securityhub.StandardsSubscriptionArgs.builder
    com.pulumi.aws.securityhub.StandardsSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
