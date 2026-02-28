package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object quicksight:
  /** Resource for managing a QuickSight Data Set. */
  def DataSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.DataSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.DataSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.quicksight.DataSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.quicksight.DataSourceArgs.Builder)
    /**
     * @param credentials The credentials Amazon QuickSight uses to connect to your underlying source. See Credentials below for more details.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceCredentialsArgs.Builder]):
        com.pulumi.aws.quicksight.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

    /**
     * @param parameters The parameters used to connect to this data source (exactly one).
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder]):
        com.pulumi.aws.quicksight.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param permissions A set of resource permissions on the data source. Maximum of 64 items. See Permission below for more details.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourcePermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourcePermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your underlying source. See SSL Properties below for more details.
     * @return builder
     */
    def sslProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceSslPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceSslPropertiesArgs.builder
      builder.sslProperties(args(argsBuilder).build)

    /**
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting to your underlying source. See VPC Connection Properties below for more details.
     * @return builder
     */
    def vpcConnectionProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceVpcConnectionPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceVpcConnectionPropertiesArgs.builder
      builder.vpcConnectionProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.IamPolicyAssignmentArgs.Builder)
    /**
     * @param identities Amazon QuickSight users, groups, or both to assign the policy to. See `identities` block.
     * @return builder
     */
    def identities(args: Endofunction[com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentIdentitiesArgs.Builder]):
        com.pulumi.aws.quicksight.IamPolicyAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentIdentitiesArgs.builder
      builder.identities(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.AccountSettingsArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.quicksight.inputs.AccountSettingsTimeoutsArgs.Builder]):
        com.pulumi.aws.quicksight.AccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AccountSettingsTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.ThemeArgs.Builder)
    /**
     * @param configuration The theme configuration, which contains the theme display properties. See configuration.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.ThemeArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param permissions A set of resource permissions on the theme. Maximum of 64 items. See permissions.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemePermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.ThemeArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.ThemePermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  /** Resource for managing an AWS QuickSight Template Alias. */
  def TemplateAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.TemplateAliasArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.TemplateAliasArgs.builder
    
    com.pulumi.aws.quicksight.TemplateAlias(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing QuickSight Group */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.GroupArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.GroupArgs.builder
    
    com.pulumi.aws.quicksight.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.quicksight.VpcConnectionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.quicksight.inputs.VpcConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.quicksight.VpcConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.VpcConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Resource for managing an AWS QuickSight Account Subscription.
   *  
   *  &gt; Due to the absence of the `adminGroup`, `authorGroup`, `readerGroup`, `adminProGroup`, `authorProGroup`, and `readerProGroup` fields in the [`DescribeAccountSettings`](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DescribeAccountSettings.html) API response, changes made to these groups post-subscription will not be detected by this resource.
   */
  def AccountSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.AccountSubscriptionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.AccountSubscriptionArgs.builder
    
    com.pulumi.aws.quicksight.AccountSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing a QuickSight Analysis. */
  def Analysis(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.AnalysisArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.AnalysisArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.quicksight.Analysis(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.quicksight.NamespaceArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.quicksight.inputs.NamespaceTimeoutsArgs.Builder]):
        com.pulumi.aws.quicksight.NamespaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.NamespaceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages the custom permissions profile for a user. */
  def UserCustomPermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.UserCustomPermissionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.UserCustomPermissionArgs.builder
    
    com.pulumi.aws.quicksight.UserCustomPermission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS QuickSight Namespace. */
  def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.NamespaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.NamespaceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.quicksight.Namespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.quicksight.CustomPermissionsArgs.Builder)
    /**
     * @param capabilities Actions to include in the custom permissions profile. See capabilities.
     * @return builder
     */
    def capabilities(args: Endofunction[com.pulumi.aws.quicksight.inputs.CustomPermissionsCapabilitiesArgs.Builder]):
        com.pulumi.aws.quicksight.CustomPermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.CustomPermissionsCapabilitiesArgs.builder
      builder.capabilities(args(argsBuilder).build)

  /** Resource for managing an AWS QuickSight VPC Connection. */
  def VpcConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.VpcConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.VpcConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.quicksight.VpcConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.quicksight.TemplateArgs.Builder)
    /**
     * @param permissions A set of resource permissions on the template. Maximum of 64 items. See permissions.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplatePermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.TemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.TemplatePermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceEntity The entity that you are using as a source when you create the template (analysis or template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
     * @return builder
     */
    def sourceEntity(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.Builder]):
        com.pulumi.aws.quicksight.TemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.builder
      builder.sourceEntity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.RefreshScheduleArgs.Builder)
    /**
     * @param schedule The [refresh schedule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RefreshSchedule.html). See schedule
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs.Builder]):
        com.pulumi.aws.quicksight.RefreshScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  /** Resource for managing an AWS QuickSight Ingestion. */
  def Ingestion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.IngestionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.IngestionArgs.builder
    
    com.pulumi.aws.quicksight.Ingestion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing QuickSight User */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.UserArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.UserArgs.builder
    
    com.pulumi.aws.quicksight.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing a QuickSight Dashboard. */
  def Dashboard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.DashboardArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.DashboardArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.quicksight.Dashboard(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.quicksight.DataSetArgs.Builder)
    /**
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial hierarchy is supported. See column_groups.
     * @return builder
     */
    def columnGroups(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetColumnGroupArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetColumnGroupArgs.builder
      builder.columnGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param columnLevelPermissionRules A set of 1 or more definitions of a [ColumnLevelPermissionRule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_ColumnLevelPermissionRule.html). See column_level_permission_rules.
     * @return builder
     */
    def columnLevelPermissionRules(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetColumnLevelPermissionRuleArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetColumnLevelPermissionRuleArgs.builder
      builder.columnLevelPermissionRules(args.map(_(argsBuilder).build)*)

    /**
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that reference this dataset as a source. See data_set_usage_configuration.
     * @return builder
     */
    def dataSetUsageConfiguration(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetDataSetUsageConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetDataSetUsageConfigurationArgs.builder
      builder.dataSetUsageConfiguration(args(argsBuilder).build)

    /**
     * @param fieldFolders The folder that contains fields and nested subfolders for your dataset. See field_folders.
     * @return builder
     */
    def fieldFolders(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetFieldFolderArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetFieldFolderArgs.builder
      builder.fieldFolders(args.map(_(argsBuilder).build)*)

    /**
     * @param logicalTableMaps Configures the combination and transformation of the data from the physical tables. Maximum of 1 entry. See logical_table_map.
     * @return builder
     */
    def logicalTableMaps(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.builder
      builder.logicalTableMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param permissions A set of resource permissions on the data source. Maximum of 64 items. See permissions.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param physicalTableMaps Declares the physical tables that are available in the underlying data sources. See physical_table_map.
     * @return builder
     */
    def physicalTableMaps(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.builder
      builder.physicalTableMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param refreshProperties The refresh properties for the data set. **NOTE**: Only valid when `importMode` is set to `SPICE`. See refresh_properties.
     * @return builder
     */
    def refreshProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesArgs.builder
      builder.refreshProperties(args(argsBuilder).build)

    /**
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you want to create. See row_level_permission_data_set.
     * @return builder
     */
    def rowLevelPermissionDataSet(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionDataSetArgs.Builder]):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionDataSetArgs.builder
      builder.rowLevelPermissionDataSet(args(argsBuilder).build)

    /**
     * @param rowLevelPermissionTagConfiguration The configuration of tags on a dataset to set row-level security. Row-level security tags are currently supported for anonymous embedding only. See row_level_permission_tag_configuration.
     * @return builder
     */
    def rowLevelPermissionTagConfiguration(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationArgs.builder
      builder.rowLevelPermissionTagConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.KeyRegistrationArgs.Builder)
    /**
     * @param keyRegistrations Registered keys. See key_registration.
     * @return builder
     */
    def keyRegistrations(args: Endofunction[com.pulumi.aws.quicksight.inputs.KeyRegistrationKeyRegistrationArgs.Builder]*):
        com.pulumi.aws.quicksight.KeyRegistrationArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.KeyRegistrationKeyRegistrationArgs.builder
      builder.keyRegistrations(args.map(_(argsBuilder).build)*)

  /** Resource for managing a QuickSight Refresh Schedule. */
  def RefreshSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.RefreshScheduleArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.RefreshScheduleArgs.builder
    
    com.pulumi.aws.quicksight.RefreshSchedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS QuickSight Folder Membership. */
  def FolderMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.FolderMembershipArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.FolderMembershipArgs.builder
    
    com.pulumi.aws.quicksight.FolderMembership(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS QuickSight Account Settings.
   *  
   *  &gt; Deletion of this resource will not modify any settings, only remove the resource from state.
   */
  def AccountSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.AccountSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.AccountSettingsArgs.builder
    
    com.pulumi.aws.quicksight.AccountSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a QuickSight custom permissions profile. */
  def CustomPermissions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.CustomPermissionsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.CustomPermissionsArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.quicksight.CustomPermissions(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the custom permissions that are associated with a role. */
  def RoleCustomPermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.RoleCustomPermissionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.RoleCustomPermissionArgs.builder
    
    com.pulumi.aws.quicksight.RoleCustomPermission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing QuickSight Group Membership */
  def GroupMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.GroupMembershipArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.GroupMembershipArgs.builder
    
    com.pulumi.aws.quicksight.GroupMembership(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing a QuickSight Template. */
  def Template(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.TemplateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.TemplateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.quicksight.Template(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS QuickSight Role Membership.
   *  
   *  &gt; The role membership APIs are disabled for identities managed by QuickSight. This resource can only be used when the QuickSight account subscription uses the Active Directory or IAM Identity Center authentication method.
   */
  def RoleMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.RoleMembershipArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.RoleMembershipArgs.builder
    
    com.pulumi.aws.quicksight.RoleMembership(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.quicksight.DashboardArgs.Builder)
    /**
     * @param dashboardPublishOptions Options for publishing the dashboard. See dashboard_publish_options.
     * @return builder
     */
    def dashboardPublishOptions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder]):
        com.pulumi.aws.quicksight.DashboardArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.builder
      builder.dashboardPublishOptions(args(argsBuilder).build)

    /**
     * @param parameters The parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See parameters.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder]):
        com.pulumi.aws.quicksight.DashboardArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param permissions A set of resource permissions on the dashboard. Maximum of 64 items. See permissions.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.DashboardArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceEntity The entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
     * @return builder
     */
    def sourceEntity(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardSourceEntityArgs.Builder]):
        com.pulumi.aws.quicksight.DashboardArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardSourceEntityArgs.builder
      builder.sourceEntity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.AnalysisArgs.Builder)
    /**
     * @param parameters The parameters for the creation of the analysis, which you want to use to override the default settings. An analysis can have any type of parameters, and some parameters might accept multiple values. See parameters.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder]):
        com.pulumi.aws.quicksight.AnalysisArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param permissions A set of resource permissions on the analysis. Maximum of 64 items. See permissions.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.AnalysisArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceEntity The entity that you are using as a source when you create the analysis (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
     * @return builder
     */
    def sourceEntity(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisSourceEntityArgs.Builder]):
        com.pulumi.aws.quicksight.AnalysisArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisSourceEntityArgs.builder
      builder.sourceEntity(args(argsBuilder).build)

  type QuicksightFunctions = com.pulumi.aws.quicksight.QuicksightFunctions
  object QuicksightFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.quicksight.QuicksightFunctions.*
  extension (self: QuicksightFunctions.type)
    /** Data source for managing a QuickSight Data Set. */
    def getDataSet(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetDataSetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.quicksight.outputs.GetDataSetResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetDataSetArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getDataSet(args(argsBuilder).build)

    /** Data source for managing a QuickSight Data Set. */
    def getDataSetPlain(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetDataSetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.quicksight.outputs.GetDataSetResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetDataSetPlainArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getDataSetPlain(args(argsBuilder).build)

    /** Data source for managing an AWS QuickSight Analysis. */
    def getQuicksightAnalysis(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetQuicksightAnalysisArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.quicksight.outputs.GetQuicksightAnalysisResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetQuicksightAnalysisArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getQuicksightAnalysis(args(argsBuilder).build)

    /** Data source for managing an AWS QuickSight Analysis. */
    def getQuicksightAnalysisPlain(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetQuicksightAnalysisPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.quicksight.outputs.GetQuicksightAnalysisResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetQuicksightAnalysisPlainArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getQuicksightAnalysisPlain(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  QuickSight group. By using this data source, you can reference QuickSight group
     *  properties without having to hard code ARNs or unique IDs as input.
     */
    def getQuicksightGroup(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetQuicksightGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.quicksight.outputs.GetQuicksightGroupResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetQuicksightGroupArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getQuicksightGroup(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  QuickSight group. By using this data source, you can reference QuickSight group
     *  properties without having to hard code ARNs or unique IDs as input.
     */
    def getQuicksightGroupPlain(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetQuicksightGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.quicksight.outputs.GetQuicksightGroupResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetQuicksightGroupPlainArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getQuicksightGroupPlain(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  QuickSight user. By using this data source, you can reference QuickSight user
     *  properties without having to hard code ARNs or unique IDs as input.
     */
    def getQuicksightUser(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetQuicksightUserArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.quicksight.outputs.GetQuicksightUserResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetQuicksightUserArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getQuicksightUser(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  QuickSight user. By using this data source, you can reference QuickSight user
     *  properties without having to hard code ARNs or unique IDs as input.
     */
    def getQuicksightUserPlain(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetQuicksightUserPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.quicksight.outputs.GetQuicksightUserResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetQuicksightUserPlainArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getQuicksightUserPlain(args(argsBuilder).build)

    /** Data source for managing an AWS QuickSight Theme. */
    def getTheme(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetThemeArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.quicksight.outputs.GetThemeResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetThemeArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getTheme(args(argsBuilder).build)

    /** Data source for managing an AWS QuickSight Theme. */
    def getThemePlain(args: Endofunction[com.pulumi.aws.quicksight.inputs.GetThemePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.quicksight.outputs.GetThemeResult] =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.GetThemePlainArgs.builder
      com.pulumi.aws.quicksight.QuicksightFunctions.getThemePlain(args(argsBuilder).build)

  /** Resource for managing a QuickSight Theme. */
  def Theme(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.ThemeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.ThemeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.quicksight.Theme(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.quicksight.FolderArgs.Builder)
    /**
     * @param permissions A set of resource permissions on the folder. Maximum of 64 items. See permissions.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.FolderPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.FolderArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.FolderPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  /**
   * Manages the content and status of IP rules.
   *  
   *  &gt; Deletion of this resource clears all IP restrictions from a QuickSight account.
   */
  def IpRestriction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.IpRestrictionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.IpRestrictionArgs.builder
    
    com.pulumi.aws.quicksight.IpRestriction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Registers customer managed keys in a Amazon QuickSight account.
   *  
   *  &gt; Deletion of this resource clears all CMK registrations from a QuickSight account. QuickSight then uses AWS owned keys to encrypt your resources.
   */
  def KeyRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.KeyRegistrationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.KeyRegistrationArgs.builder
    
    com.pulumi.aws.quicksight.KeyRegistration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing a QuickSight Folder. */
  def Folder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.FolderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.FolderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.quicksight.Folder(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS QuickSight IAM Policy Assignment. */
  def IamPolicyAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.IamPolicyAssignmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.quicksight.IamPolicyAssignmentArgs.builder
    
    com.pulumi.aws.quicksight.IamPolicyAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationArgs.Builder)
    /**
     * @param tagRules A set of rules associated with row-level security, such as the tag names and columns that they are assigned to. See tag_rules.
     * @return builder
     */
    def tagRules(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationTagRuleArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationTagRuleArgs.builder
      builder.tagRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder)
    /**
     * @param dateTimeParameters A list of parameters that have a data type of date-time. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DateTimeParameter.html).
     * @return builder
     */
    def dateTimeParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardParametersDateTimeParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardParametersDateTimeParameterArgs.builder
      builder.dateTimeParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param decimalParameters A list of parameters that have a data type of decimal. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DecimalParameter.html).
     * @return builder
     */
    def decimalParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardParametersDecimalParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardParametersDecimalParameterArgs.builder
      builder.decimalParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param integerParameters A list of parameters that have a data type of integer. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_IntegerParameter.html).
     * @return builder
     */
    def integerParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardParametersIntegerParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardParametersIntegerParameterArgs.builder
      builder.integerParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param stringParameters A list of parameters that have a data type of string. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_StringParameter.html).
     * @return builder
     */
    def stringParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardParametersStringParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardParametersStringParameterArgs.builder
      builder.stringParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetArgs.Builder)
    /**
     * @param tile The display options for tiles. See tile.
     * @return builder
     */
    def tile(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileArgs.builder
      builder.tile(args(argsBuilder).build)

    /**
     * @param tileLayout The layout options for tiles. See tile_layout.
     * @return builder
     */
    def tileLayout(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutArgs.builder
      builder.tileLayout(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetState.Builder)
    /**
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial hierarchy is supported. See column_groups.
     * @return builder
     */
    def columnGroups(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetColumnGroupArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetColumnGroupArgs.builder
      builder.columnGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param columnLevelPermissionRules A set of 1 or more definitions of a [ColumnLevelPermissionRule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_ColumnLevelPermissionRule.html). See column_level_permission_rules.
     * @return builder
     */
    def columnLevelPermissionRules(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetColumnLevelPermissionRuleArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetColumnLevelPermissionRuleArgs.builder
      builder.columnLevelPermissionRules(args.map(_(argsBuilder).build)*)

    /**
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that reference this dataset as a source. See data_set_usage_configuration.
     * @return builder
     */
    def dataSetUsageConfiguration(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetDataSetUsageConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetDataSetUsageConfigurationArgs.builder
      builder.dataSetUsageConfiguration(args(argsBuilder).build)

    /**
     * @param fieldFolders The folder that contains fields and nested subfolders for your dataset. See field_folders.
     * @return builder
     */
    def fieldFolders(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetFieldFolderArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetFieldFolderArgs.builder
      builder.fieldFolders(args.map(_(argsBuilder).build)*)

    /**
     * @param logicalTableMaps Configures the combination and transformation of the data from the physical tables. Maximum of 1 entry. See logical_table_map.
     * @return builder
     */
    def logicalTableMaps(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.builder
      builder.logicalTableMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param outputColumns The final set of columns available for use in analyses and dashboards after all data preparation and transformation steps have been applied within the data set.  See `outputColumns` Block below.
     * @return builder
     */
    def outputColumns(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetOutputColumnArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetOutputColumnArgs.builder
      builder.outputColumns(args.map(_(argsBuilder).build)*)

    /**
     * @param permissions A set of resource permissions on the data source. Maximum of 64 items. See permissions.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param physicalTableMaps Declares the physical tables that are available in the underlying data sources. See physical_table_map.
     * @return builder
     */
    def physicalTableMaps(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.builder
      builder.physicalTableMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param refreshProperties The refresh properties for the data set. **NOTE**: Only valid when `importMode` is set to `SPICE`. See refresh_properties.
     * @return builder
     */
    def refreshProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesArgs.builder
      builder.refreshProperties(args(argsBuilder).build)

    /**
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you want to create. See row_level_permission_data_set.
     * @return builder
     */
    def rowLevelPermissionDataSet(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionDataSetArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionDataSetArgs.builder
      builder.rowLevelPermissionDataSet(args(argsBuilder).build)

    /**
     * @param rowLevelPermissionTagConfiguration The configuration of tags on a dataset to set row-level security. Row-level security tags are currently supported for anonymous embedding only. See row_level_permission_tag_configuration.
     * @return builder
     */
    def rowLevelPermissionTagConfiguration(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationArgs.builder
      builder.rowLevelPermissionTagConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DashboardSourceEntityArgs.Builder)
    /**
     * @param sourceTemplate The source template. See source_template.
     * @return builder
     */
    def sourceTemplate(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardSourceEntitySourceTemplateArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardSourceEntityArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardSourceEntitySourceTemplateArgs.builder
      builder.sourceTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSourceParametersS3Args.Builder)
    /**
     * @param manifestFileLocation An object containing the S3 location of the S3 manifest file.
     * @return builder
     */
    def manifestFileLocation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersS3ManifestFileLocationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersS3Args.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersS3ManifestFileLocationArgs.builder
      builder.manifestFileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationTagArgs.Builder)
    /**
     * @param columnDescription A description for a column. See column_description.
     * @return builder
     */
    def columnDescription(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationTagColumnDescriptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationTagArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationTagColumnDescriptionArgs.builder
      builder.columnDescription(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyArgs.Builder)
    /**
     * @param refreshOnDay The [refresh on entity](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_ScheduleRefreshOnEntity.html) configuration for weekly or monthly schedules. See refresh_on_day.
     * @return builder
     */
    def refreshOnDay(args: Endofunction[com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyRefreshOnDayArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyRefreshOnDayArgs.builder
      builder.refreshOnDay(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.Builder)
    /**
     * @param sourceAnalysis The source analysis, if it is based on an analysis.. Only one of `sourceAnalysis` or `sourceTemplate` should be configured. See source_analysis.
     * @return builder
     */
    def sourceAnalysis(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceAnalysisArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceAnalysisArgs.builder
      builder.sourceAnalysis(args(argsBuilder).build)

    /**
     * @param sourceTemplate The source template, if it is based on an template.. Only one of `sourceAnalysis` or `sourceTemplate` should be configured. See source_template.
     * @return builder
     */
    def sourceTemplate(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceTemplateArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceTemplateArgs.builder
      builder.sourceTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCreateColumnsOperationArgs.Builder)
    /**
     * @param columns Calculated columns to create. See columns.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCreateColumnsOperationColumnArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCreateColumnsOperationArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCreateColumnsOperationColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder)
    /**
     * @param dataColorPalette Color properties that apply to chart data colors. See data_color_palette.
     * @return builder
     */
    def dataColorPalette(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationDataColorPaletteArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationDataColorPaletteArgs.builder
      builder.dataColorPalette(args(argsBuilder).build)

    /**
     * @param sheet Display options related to sheets. See sheet.
     * @return builder
     */
    def sheet(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetArgs.builder
      builder.sheet(args(argsBuilder).build)

    /**
     * @param typography Determines the typography options. See typography.
     * @return builder
     */
    def typography(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationTypographyArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationTypographyArgs.builder
      builder.typography(args(argsBuilder).build)

    /**
     * @param uiColorPalette Color properties that apply to the UI and to charts, excluding the colors that apply to data. See ui_color_palette.
     * @return builder
     */
    def uiColorPalette(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationUiColorPaletteArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationUiColorPaletteArgs.builder
      builder.uiColorPalette(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.AnalysisSourceEntityArgs.Builder)
    /**
     * @param sourceTemplate The source template. See source_template.
     * @return builder
     */
    def sourceTemplate(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisSourceEntitySourceTemplateArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.AnalysisSourceEntityArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisSourceEntitySourceTemplateArgs.builder
      builder.sourceTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSourceCredentialsArgs.Builder)
    /**
     * @param credentialPair Credential pair. See Credential Pair below for more details.
     * @return builder
     */
    def credentialPair(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceCredentialsCredentialPairArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceCredentialsCredentialPairArgs.builder
      builder.credentialPair(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapCustomSqlArgs.Builder)
    /**
     * @param columns Column schema from the SQL query result set. See columns.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapCustomSqlColumnArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapCustomSqlArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapCustomSqlColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.ThemeConfigurationTypographyArgs.Builder)
    /**
     * @param fontFamilies Determines the list of font families. Maximum number of 5 items. See font_families.
     * @return builder
     */
    def fontFamilies(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationTypographyFontFamilyArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationTypographyArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationTypographyFontFamilyArgs.builder
      builder.fontFamilies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.FolderState.Builder)
    /**
     * @param permissions A set of resource permissions on the folder. Maximum of 64 items. See permissions.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.FolderPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.FolderState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.FolderPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder)
    /**
     * @param castColumnTypeOperation A transform operation that casts a column to a different type. See cast_column_type_operation.
     * @return builder
     */
    def castColumnTypeOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs.builder
      builder.castColumnTypeOperation(args(argsBuilder).build)

    /**
     * @param createColumnsOperation An operation that creates calculated columns. Columns created in one such operation form a lexical closure. See create_columns_operation.
     * @return builder
     */
    def createColumnsOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCreateColumnsOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCreateColumnsOperationArgs.builder
      builder.createColumnsOperation(args(argsBuilder).build)

    /**
     * @param filterOperation An operation that filters rows based on some condition. See filter_operation.
     * @return builder
     */
    def filterOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformFilterOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformFilterOperationArgs.builder
      builder.filterOperation(args(argsBuilder).build)

    /**
     * @param projectOperation An operation that projects columns. Operations that come after a projection can only refer to projected columns. See project_operation.
     * @return builder
     */
    def projectOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformProjectOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformProjectOperationArgs.builder
      builder.projectOperation(args(argsBuilder).build)

    /**
     * @param renameColumnOperation An operation that renames a column. See rename_column_operation.
     * @return builder
     */
    def renameColumnOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformRenameColumnOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformRenameColumnOperationArgs.builder
      builder.renameColumnOperation(args(argsBuilder).build)

    /**
     * @param tagColumnOperation An operation that tags a column with additional information. See tag_column_operation.
     * @return builder
     */
    def tagColumnOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationArgs.builder
      builder.tagColumnOperation(args(argsBuilder).build)

    /**
     * @param untagColumnOperation A transform operation that removes tags associated with a column. See untag_column_operation.
     * @return builder
     */
    def untagColumnOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformUntagColumnOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformUntagColumnOperationArgs.builder
      builder.untagColumnOperation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationIncrementalRefreshArgs.Builder)
    /**
     * @param lookbackWindow The lookback window setup for an incremental refresh configuration. See lookback_window.
     * @return builder
     */
    def lookbackWindow(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationIncrementalRefreshLookbackWindowArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationIncrementalRefreshArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationIncrementalRefreshLookbackWindowArgs.builder
      builder.lookbackWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder)
    /**
     * @param amazonElasticsearch Parameters for connecting to Amazon Elasticsearch.
     * @return builder
     */
    def amazonElasticsearch(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersAmazonElasticsearchArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersAmazonElasticsearchArgs.builder
      builder.amazonElasticsearch(args(argsBuilder).build)

    /**
     * @param athena Parameters for connecting to Athena.
     * @return builder
     */
    def athena(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersAthenaArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersAthenaArgs.builder
      builder.athena(args(argsBuilder).build)

    /**
     * @param aurora Parameters for connecting to Aurora MySQL.
     * @return builder
     */
    def aurora(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraArgs.builder
      builder.aurora(args(argsBuilder).build)

    /**
     * @param auroraPostgresql Parameters for connecting to Aurora Postgresql.
     * @return builder
     */
    def auroraPostgresql(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraPostgresqlArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraPostgresqlArgs.builder
      builder.auroraPostgresql(args(argsBuilder).build)

    /**
     * @param awsIotAnalytics Parameters for connecting to AWS IOT Analytics.
     * @return builder
     */
    def awsIotAnalytics(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersAwsIotAnalyticsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersAwsIotAnalyticsArgs.builder
      builder.awsIotAnalytics(args(argsBuilder).build)

    /**
     * @param databricks Parameters for connecting to Databricks.
     * @return builder
     */
    def databricks(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersDatabricksArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersDatabricksArgs.builder
      builder.databricks(args(argsBuilder).build)

    /**
     * @param jira Parameters for connecting to Jira.
     * @return builder
     */
    def jira(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersJiraArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersJiraArgs.builder
      builder.jira(args(argsBuilder).build)

    /**
     * @param mariaDb Parameters for connecting to MariaDB.
     * @return builder
     */
    def mariaDb(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersMariaDbArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersMariaDbArgs.builder
      builder.mariaDb(args(argsBuilder).build)

    /**
     * @param mysql Parameters for connecting to MySQL.
     * @return builder
     */
    def mysql(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersMysqlArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersMysqlArgs.builder
      builder.mysql(args(argsBuilder).build)

    /**
     * @param oracle Parameters for connecting to Oracle.
     * @return builder
     */
    def oracle(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersOracleArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersOracleArgs.builder
      builder.oracle(args(argsBuilder).build)

    /**
     * @param postgresql Parameters for connecting to Postgresql.
     * @return builder
     */
    def postgresql(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersPostgresqlArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersPostgresqlArgs.builder
      builder.postgresql(args(argsBuilder).build)

    /**
     * @param presto Parameters for connecting to Presto.
     * @return builder
     */
    def presto(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersPrestoArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersPrestoArgs.builder
      builder.presto(args(argsBuilder).build)

    /**
     * @param rds Parameters for connecting to RDS.
     * @return builder
     */
    def rds(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersRdsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersRdsArgs.builder
      builder.rds(args(argsBuilder).build)

    /**
     * @param redshift Parameters for connecting to Redshift.
     * @return builder
     */
    def redshift(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersRedshiftArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersRedshiftArgs.builder
      builder.redshift(args(argsBuilder).build)

    /**
     * @param s3 Parameters for connecting to S3.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersS3Args.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersS3Args.builder
      builder.s3(args(argsBuilder).build)

    /**
     * @param serviceNow Parameters for connecting to ServiceNow.
     * @return builder
     */
    def serviceNow(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersServiceNowArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersServiceNowArgs.builder
      builder.serviceNow(args(argsBuilder).build)

    /**
     * @param snowflake Parameters for connecting to Snowflake.
     * @return builder
     */
    def snowflake(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersSnowflakeArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersSnowflakeArgs.builder
      builder.snowflake(args(argsBuilder).build)

    /**
     * @param spark Parameters for connecting to Spark.
     * @return builder
     */
    def spark(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersSparkArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersSparkArgs.builder
      builder.spark(args(argsBuilder).build)

    /**
     * @param sqlServer Parameters for connecting to SQL Server.
     * @return builder
     */
    def sqlServer(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersSqlServerArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersSqlServerArgs.builder
      builder.sqlServer(args(argsBuilder).build)

    /**
     * @param teradata Parameters for connecting to Teradata.
     * @return builder
     */
    def teradata(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersTeradataArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersTeradataArgs.builder
      builder.teradata(args(argsBuilder).build)

    /**
     * @param twitter Parameters for connecting to Twitter.
     * @return builder
     */
    def twitter(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersTwitterArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapRelationalTableArgs.Builder)
    /**
     * @param inputColumns Column schema of the table. See input_columns.
     * @return builder
     */
    def inputColumns(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapRelationalTableInputColumnArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapRelationalTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapRelationalTableInputColumnArgs.builder
      builder.inputColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceAnalysisArgs.Builder)
    /**
     * @param dataSetReferences A list of dataset references used as placeholders in the template. See data_set_references.
     * @return builder
     */
    def dataSetReferences(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceAnalysisDataSetReferenceArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceAnalysisArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceAnalysisDataSetReferenceArgs.builder
      builder.dataSetReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.RefreshScheduleState.Builder)
    /**
     * @param schedule The [refresh schedule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RefreshSchedule.html). See schedule
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.RefreshScheduleState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionArgs.Builder)
    /**
     * @param leftJoinKeyProperties Join key properties of the left operand. See left_join_key_properties.
     * @return builder
     */
    def leftJoinKeyProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionLeftJoinKeyPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionLeftJoinKeyPropertiesArgs.builder
      builder.leftJoinKeyProperties(args(argsBuilder).build)

    /**
     * @param rightJoinKeyProperties Join key properties of the right operand. See right_join_key_properties.
     * @return builder
     */
    def rightJoinKeyProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionRightJoinKeyPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionRightJoinKeyPropertiesArgs.builder
      builder.rightJoinKeyProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.KeyRegistrationState.Builder)
    /**
     * @param keyRegistrations Registered keys. See key_registration.
     * @return builder
     */
    def keyRegistrations(args: Endofunction[com.pulumi.aws.quicksight.inputs.KeyRegistrationKeyRegistrationArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.KeyRegistrationState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.KeyRegistrationKeyRegistrationArgs.builder
      builder.keyRegistrations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs.Builder)
    /**
     * @param scheduleFrequency The configuration of the [schedule frequency](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RefreshFrequency.html). See schedule_frequency.
     * @return builder
     */
    def scheduleFrequency(args: Endofunction[com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyArgs.builder
      builder.scheduleFrequency(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceArgs.Builder)
    /**
     * @param inputColumns Column schema of the table. See input_columns.
     * @return builder
     */
    def inputColumns(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceInputColumnArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceInputColumnArgs.builder
      builder.inputColumns(args.map(_(argsBuilder).build)*)

    /**
     * @param uploadSettings Information about the format for the S3 source file or files. See upload_settings.
     * @return builder
     */
    def uploadSettings(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceUploadSettingsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceUploadSettingsArgs.builder
      builder.uploadSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationArgs.Builder)
    /**
     * @param incrementalRefresh The incremental refresh for the data set. See incremental_refresh.
     * @return builder
     */
    def incrementalRefresh(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationIncrementalRefreshArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationIncrementalRefreshArgs.builder
      builder.incrementalRefresh(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceArgs.Builder)
    /**
     * @param joinInstruction Specifies the result of a join of two logical tables. See join_instruction.
     * @return builder
     */
    def joinInstruction(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionArgs.builder
      builder.joinInstruction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder)
    /**
     * @param dateTimeParameters A list of parameters that have a data type of date-time. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DateTimeParameter.html).
     * @return builder
     */
    def dateTimeParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisParametersDateTimeParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisParametersDateTimeParameterArgs.builder
      builder.dateTimeParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param decimalParameters A list of parameters that have a data type of decimal. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DecimalParameter.html).
     * @return builder
     */
    def decimalParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisParametersDecimalParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisParametersDecimalParameterArgs.builder
      builder.decimalParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param integerParameters A list of parameters that have a data type of integer. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_IntegerParameter.html).
     * @return builder
     */
    def integerParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisParametersIntegerParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisParametersIntegerParameterArgs.builder
      builder.integerParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param stringParameters A list of parameters that have a data type of string. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_StringParameter.html).
     * @return builder
     */
    def stringParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisParametersStringParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisParametersStringParameterArgs.builder
      builder.stringParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.Builder)
    /**
     * @param customSql A physical table type built from the results of the custom SQL query. See custom_sql.
     * @return builder
     */
    def customSql(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapCustomSqlArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapCustomSqlArgs.builder
      builder.customSql(args(argsBuilder).build)

    /**
     * @param relationalTable A physical table type for relational data sources. See relational_table.
     * @return builder
     */
    def relationalTable(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapRelationalTableArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapRelationalTableArgs.builder
      builder.relationalTable(args(argsBuilder).build)

    /**
     * @param s3Source A physical table type for as S3 data source. See s3_source.
     * @return builder
     */
    def s3Source(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceArgs.builder
      builder.s3Source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.AccountSettingsState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.quicksight.inputs.AccountSettingsTimeoutsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.AccountSettingsState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AccountSettingsTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.ThemeState.Builder)
    /**
     * @param configuration The theme configuration, which contains the theme display properties. See configuration.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param permissions A set of resource permissions on the theme. Maximum of 64 items. See permissions.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemePermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.ThemeState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.ThemePermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.CustomPermissionsState.Builder)
    /**
     * @param capabilities Actions to include in the custom permissions profile. See capabilities.
     * @return builder
     */
    def capabilities(args: Endofunction[com.pulumi.aws.quicksight.inputs.CustomPermissionsCapabilitiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.CustomPermissionsState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.CustomPermissionsCapabilitiesArgs.builder
      builder.capabilities(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutArgs.Builder)
    /**
     * @param gutter The gutter settings that apply between tiles. See gutter.
     * @return builder
     */
    def gutter(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutGutterArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutGutterArgs.builder
      builder.gutter(args(argsBuilder).build)

    /**
     * @param margin The margin settings that apply around the outside edge of sheets. See margin.
     * @return builder
     */
    def margin(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutMarginArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutMarginArgs.builder
      builder.margin(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.NamespaceState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.quicksight.inputs.NamespaceTimeoutsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.NamespaceState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.NamespaceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentState.Builder)
    /**
     * @param identities Amazon QuickSight users, groups, or both to assign the policy to. See `identities` block.
     * @return builder
     */
    def identities(args: Endofunction[com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentIdentitiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentIdentitiesArgs.builder
      builder.identities(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationArgs.Builder)
    /**
     * @param tags The dataset column tag, currently only used for geospatial type tagging. See tags.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationTagArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileArgs.Builder)
    /**
     * @param border The border around a tile. See border.
     * @return builder
     */
    def border(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileBorderArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileBorderArgs.builder
      builder.border(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.Builder)
    /**
     * @param dataTransforms Transform operations that act on this logical table. For this structure to be valid, only one of the attributes can be non-null. See data_transforms.
     * @return builder
     */
    def dataTransforms(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.builder
      builder.dataTransforms(args.map(_(argsBuilder).build)*)

    /**
     * @param source Source of this logical table. See source.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesArgs.Builder)
    /**
     * @param refreshConfiguration The refresh configuration for the data set. See refresh_configuration.
     * @return builder
     */
    def refreshConfiguration(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationArgs.builder
      builder.refreshConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.AnalysisState.Builder)
    /**
     * @param parameters The parameters for the creation of the analysis, which you want to use to override the default settings. An analysis can have any type of parameters, and some parameters might accept multiple values. See parameters.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.AnalysisState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param permissions A set of resource permissions on the analysis. Maximum of 64 items. See permissions.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.AnalysisState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceEntity The entity that you are using as a source when you create the analysis (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
     * @return builder
     */
    def sourceEntity(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisSourceEntityArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.AnalysisState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisSourceEntityArgs.builder
      builder.sourceEntity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.TemplateState.Builder)
    /**
     * @param permissions A set of resource permissions on the template. Maximum of 64 items. See permissions.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplatePermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.TemplateState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.TemplatePermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceEntity The entity that you are using as a source when you create the template (analysis or template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
     * @return builder
     */
    def sourceEntity(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.TemplateState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.builder
      builder.sourceEntity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DashboardState.Builder)
    /**
     * @param dashboardPublishOptions Options for publishing the dashboard. See dashboard_publish_options.
     * @return builder
     */
    def dashboardPublishOptions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.builder
      builder.dashboardPublishOptions(args(argsBuilder).build)

    /**
     * @param parameters The parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See parameters.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param permissions A set of resource permissions on the dashboard. Maximum of 64 items. See permissions.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DashboardState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceEntity The entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
     * @return builder
     */
    def sourceEntity(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardSourceEntityArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardSourceEntityArgs.builder
      builder.sourceEntity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetColumnGroupArgs.Builder)
    /**
     * @param geoSpatialColumnGroup Geospatial column group that denotes a hierarchy. See geo_spatial_column_group.
     * @return builder
     */
    def geoSpatialColumnGroup(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetColumnGroupGeoSpatialColumnGroupArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetColumnGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetColumnGroupGeoSpatialColumnGroupArgs.builder
      builder.geoSpatialColumnGroup(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder)
    /**
     * @param adHocFilteringOption Ad hoc (one-time) filtering option. See ad_hoc_filtering_option.
     * @return builder
     */
    def adHocFilteringOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsAdHocFilteringOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsAdHocFilteringOptionArgs.builder
      builder.adHocFilteringOption(args(argsBuilder).build)

    /**
     * @param dataPointDrillUpDownOption The drill-down options of data points in a dashboard. See data_point_drill_up_down_option.
     * @return builder
     */
    def dataPointDrillUpDownOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsDataPointDrillUpDownOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsDataPointDrillUpDownOptionArgs.builder
      builder.dataPointDrillUpDownOption(args(argsBuilder).build)

    /**
     * @param dataPointMenuLabelOption The data point menu label options of a dashboard. See data_point_menu_label_option.
     * @return builder
     */
    def dataPointMenuLabelOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsDataPointMenuLabelOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsDataPointMenuLabelOptionArgs.builder
      builder.dataPointMenuLabelOption(args(argsBuilder).build)

    /**
     * @param dataPointTooltipOption The data point tool tip options of a dashboard. See data_point_tooltip_option.
     * @return builder
     */
    def dataPointTooltipOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsDataPointTooltipOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsDataPointTooltipOptionArgs.builder
      builder.dataPointTooltipOption(args(argsBuilder).build)

    /**
     * @param exportToCsvOption Export to .csv option. See export_to_csv_option.
     * @return builder
     */
    def exportToCsvOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsExportToCsvOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsExportToCsvOptionArgs.builder
      builder.exportToCsvOption(args(argsBuilder).build)

    /**
     * @param exportWithHiddenFieldsOption Determines if hidden fields are exported with a dashboard. See export_with_hidden_fields_option.
     * @return builder
     */
    def exportWithHiddenFieldsOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsExportWithHiddenFieldsOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsExportWithHiddenFieldsOptionArgs.builder
      builder.exportWithHiddenFieldsOption(args(argsBuilder).build)

    /**
     * @param sheetControlsOption Sheet controls option. See sheet_controls_option.
     * @return builder
     */
    def sheetControlsOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsSheetControlsOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsSheetControlsOptionArgs.builder
      builder.sheetControlsOption(args(argsBuilder).build)

    /**
     * @param sheetLayoutElementMaximizationOption The sheet layout maximization options of a dashboard. See sheet_layout_element_maximization_option.
     * @return builder
     */
    def sheetLayoutElementMaximizationOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsSheetLayoutElementMaximizationOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsSheetLayoutElementMaximizationOptionArgs.builder
      builder.sheetLayoutElementMaximizationOption(args(argsBuilder).build)

    /**
     * @param visualAxisSortOption The axis sort options of a dashboard. See visual_axis_sort_option.
     * @return builder
     */
    def visualAxisSortOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsVisualAxisSortOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsVisualAxisSortOptionArgs.builder
      builder.visualAxisSortOption(args(argsBuilder).build)

    /**
     * @param visualMenuOption The menu options of a visual in a dashboard. See visual_menu_option.
     * @return builder
     */
    def visualMenuOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsVisualMenuOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsVisualMenuOptionArgs.builder
      builder.visualMenuOption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.AnalysisSourceEntitySourceTemplateArgs.Builder)
    /**
     * @param dataSetReferences List of dataset references. See data_set_references.
     * @return builder
     */
    def dataSetReferences(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisSourceEntitySourceTemplateDataSetReferenceArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.AnalysisSourceEntitySourceTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisSourceEntitySourceTemplateDataSetReferenceArgs.builder
      builder.dataSetReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.DashboardSourceEntitySourceTemplateArgs.Builder)
    /**
     * @param dataSetReferences List of dataset references. See data_set_references.
     * @return builder
     */
    def dataSetReferences(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardSourceEntitySourceTemplateDataSetReferenceArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DashboardSourceEntitySourceTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardSourceEntitySourceTemplateDataSetReferenceArgs.builder
      builder.dataSetReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSourceState.Builder)
    /**
     * @param credentials The credentials Amazon QuickSight uses to connect to your underlying source. See Credentials below for more details.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceCredentialsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

    /**
     * @param parameters The parameters used to connect to this data source (exactly one).
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param permissions A set of resource permissions on the data source. Maximum of 64 items. See Permission below for more details.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourcePermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSourceState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourcePermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your underlying source. See SSL Properties below for more details.
     * @return builder
     */
    def sslProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceSslPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceSslPropertiesArgs.builder
      builder.sslProperties(args(argsBuilder).build)

    /**
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting to your underlying source. See VPC Connection Properties below for more details.
     * @return builder
     */
    def vpcConnectionProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceVpcConnectionPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceVpcConnectionPropertiesArgs.builder
      builder.vpcConnectionProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.VpcConnectionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.quicksight.inputs.VpcConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.VpcConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.VpcConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing QuickSight Data Source */
  def DataSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.quicksight.DataSourceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.quicksight.DataSourceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.quicksight.DataSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
