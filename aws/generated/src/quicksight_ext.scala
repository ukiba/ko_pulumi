package jp.ukiba.ko_pulumi
package aws

object quicksight_ext:
  extension (builder: com.pulumi.aws.quicksight.AccountSettingsArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.quicksight.inputs.AccountSettingsTimeoutsArgs.Builder]):
        com.pulumi.aws.quicksight.AccountSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AccountSettingsTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.AnalysisArgs.Builder)
    /**
     * @param parameters Parameters for the creation of the analysis, which you want to use to override the default settings. An analysis can have any type of parameters, and some parameters might accept multiple values. See parameters.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder]):
        com.pulumi.aws.quicksight.AnalysisArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param permissions Set of resource permissions on the analysis. Maximum of 64 items. See permissions.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.AnalysisArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceEntity Entity that you are using as a source when you create the analysis (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
     * @return builder
     */
    inline def sourceEntity(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisSourceEntityArgs.Builder]):
        com.pulumi.aws.quicksight.AnalysisArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisSourceEntityArgs.builder
      builder.sourceEntity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.CustomPermissionsArgs.Builder)
    /**
     * @param capabilities Actions to include in the custom permissions profile. See `capabilities` Block.
     * @return builder
     */
    inline def capabilities(args: Endofunction[com.pulumi.aws.quicksight.inputs.CustomPermissionsCapabilitiesArgs.Builder]):
        com.pulumi.aws.quicksight.CustomPermissionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.CustomPermissionsCapabilitiesArgs.builder
      builder.capabilities(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.DashboardArgs.Builder)
    /**
     * @param dashboardPublishOptions Options for publishing the dashboard. See `dashboardPublishOptions`.
     * @return builder
     */
    inline def dashboardPublishOptions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder]):
        com.pulumi.aws.quicksight.DashboardArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.builder
      builder.dashboardPublishOptions(args(argsBuilder).build)

    /**
     * @param parameters Parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See `parameters`.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder]):
        com.pulumi.aws.quicksight.DashboardArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param permissions Set of resource permissions on the dashboard. Maximum of 64 items. See `permissions`.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.DashboardArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceEntity Entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `sourceEntity` should be configured. See `sourceEntity`.
     * @return builder
     */
    inline def sourceEntity(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardSourceEntityArgs.Builder]):
        com.pulumi.aws.quicksight.DashboardArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardSourceEntityArgs.builder
      builder.sourceEntity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.DataSetArgs.Builder)
    /**
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial hierarchy is supported. See `columnGroups` Block below.
     * @return builder
     */
    inline def columnGroups(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetColumnGroupArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetColumnGroupArgs.builder
      builder.columnGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param columnLevelPermissionRules Set of 1 or more definitions of a [ColumnLevelPermissionRule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_ColumnLevelPermissionRule.html). See `columnLevelPermissionRules` Block below.
     * @return builder
     */
    inline def columnLevelPermissionRules(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetColumnLevelPermissionRuleArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetColumnLevelPermissionRuleArgs.builder
      builder.columnLevelPermissionRules(args.map(_(argsBuilder).build)*)

    /**
     * @param dataSetUsageConfiguration Usage configuration to apply to child datasets that reference this dataset as a source. See `dataSetUsageConfiguration` Block below.
     * @return builder
     */
    inline def dataSetUsageConfiguration(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetDataSetUsageConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetDataSetUsageConfigurationArgs.builder
      builder.dataSetUsageConfiguration(args(argsBuilder).build)

    /**
     * @param fieldFolders Folder that contains fields and nested subfolders for your dataset. See `fieldFolders` Block below.
     * @return builder
     */
    inline def fieldFolders(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetFieldFolderArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetFieldFolderArgs.builder
      builder.fieldFolders(args.map(_(argsBuilder).build)*)

    /**
     * @param logicalTableMaps Configures the combination and transformation of the data from the physical tables. Maximum of 1 entry. See `logicalTableMap` Block below.
     * @return builder
     */
    inline def logicalTableMaps(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.builder
      builder.logicalTableMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param permissions Set of resource permissions on the data source. Maximum of 64 items. See `permissions` Block below.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param physicalTableMaps Declares the physical tables that are available in the underlying data sources. See `physicalTableMap` Block below.
     * @return builder
     */
    inline def physicalTableMaps(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.builder
      builder.physicalTableMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param refreshProperties Refresh properties for the data set. **NOTE**: Only valid when `importMode` is set to `SPICE`. See `refreshProperties` Block below.
     * @return builder
     */
    inline def refreshProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesArgs.builder
      builder.refreshProperties(args(argsBuilder).build)

    /**
     * @param rowLevelPermissionDataSet Row-level security configuration for the data that you want to create. See `rowLevelPermissionDataSet` Block below.
     * @return builder
     */
    inline def rowLevelPermissionDataSet(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionDataSetArgs.Builder]):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionDataSetArgs.builder
      builder.rowLevelPermissionDataSet(args(argsBuilder).build)

    /**
     * @param rowLevelPermissionTagConfiguration Configuration of tags on a dataset to set row-level security. Row-level security tags are currently supported for anonymous embedding only. See `rowLevelPermissionTagConfiguration` Block below.
     * @return builder
     */
    inline def rowLevelPermissionTagConfiguration(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.DataSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationArgs.builder
      builder.rowLevelPermissionTagConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.DataSourceArgs.Builder)
    /**
     * @param credentials Credentials Amazon QuickSight uses to connect to your underlying source. See `credentials` Block below for more details.
     * @return builder
     */
    inline def credentials(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceCredentialsArgs.Builder]):
        com.pulumi.aws.quicksight.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

    /**
     * @param parameters Parameters used to connect to this data source (exactly one). See `parameters` Block for details.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder]):
        com.pulumi.aws.quicksight.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param permissions Set of resource permissions on the data source. Maximum of 64 items. See `permission` Block below for more details.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourcePermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.DataSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourcePermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your underlying source. See `sslProperties` Block below for more details.
     * @return builder
     */
    inline def sslProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceSslPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceSslPropertiesArgs.builder
      builder.sslProperties(args(argsBuilder).build)

    /**
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting to your underlying source. See `vpcConnectionProperties` Block below for more details.
     * @return builder
     */
    inline def vpcConnectionProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceVpcConnectionPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceVpcConnectionPropertiesArgs.builder
      builder.vpcConnectionProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.FolderArgs.Builder)
    /**
     * @param permissions Set of resource permissions on the folder. Maximum of 64 items. See `permissions` Block.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.FolderPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.FolderArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.FolderPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.IamPolicyAssignmentArgs.Builder)
    /**
     * @param identities Amazon QuickSight users, groups, or both to assign the policy to. See `identities` block.
     * @return builder
     */
    inline def identities(args: Endofunction[com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentIdentitiesArgs.Builder]):
        com.pulumi.aws.quicksight.IamPolicyAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentIdentitiesArgs.builder
      builder.identities(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.KeyRegistrationArgs.Builder)
    /**
     * @param keyRegistrations Registered keys. See `keyRegistration` Block.
     * @return builder
     */
    inline def keyRegistrations(args: Endofunction[com.pulumi.aws.quicksight.inputs.KeyRegistrationKeyRegistrationArgs.Builder]*):
        com.pulumi.aws.quicksight.KeyRegistrationArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.KeyRegistrationKeyRegistrationArgs.builder
      builder.keyRegistrations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.NamespaceArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.quicksight.inputs.NamespaceTimeoutsArgs.Builder]):
        com.pulumi.aws.quicksight.NamespaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.NamespaceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.RefreshScheduleArgs.Builder)
    /**
     * @param schedule [Refresh schedule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RefreshSchedule.html) configuration. See `schedule` Block.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs.Builder]):
        com.pulumi.aws.quicksight.RefreshScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.TemplateArgs.Builder)
    /**
     * @param permissions Set of resource permissions on the template. Maximum of 64 items. See `permissions` Block.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplatePermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.TemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.TemplatePermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceEntity Entity that you are using as a source when you create the template (analysis or template). Only one of `definition` or `sourceEntity` should be configured. See `sourceEntity` Block.
     * @return builder
     */
    inline def sourceEntity(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.Builder]):
        com.pulumi.aws.quicksight.TemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.builder
      builder.sourceEntity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.ThemeArgs.Builder)
    /**
     * @param configuration Theme configuration, which contains the theme display properties. See configuration.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.ThemeArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param permissions Set of resource permissions on the theme. Maximum of 64 items. See permissions.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemePermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.ThemeArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.ThemePermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.VpcConnectionArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.quicksight.inputs.VpcConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.quicksight.VpcConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.VpcConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.AccountSettingsState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.quicksight.inputs.AccountSettingsTimeoutsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.AccountSettingsState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AccountSettingsTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder)
    /**
     * @param dateTimeParameters List of parameters that have a data type of date-time. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DateTimeParameter.html).
     * @return builder
     */
    inline def dateTimeParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisParametersDateTimeParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisParametersDateTimeParameterArgs.builder
      builder.dateTimeParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param decimalParameters List of parameters that have a data type of decimal. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DecimalParameter.html).
     * @return builder
     */
    inline def decimalParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisParametersDecimalParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisParametersDecimalParameterArgs.builder
      builder.decimalParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param integerParameters List of parameters that have a data type of integer. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_IntegerParameter.html).
     * @return builder
     */
    inline def integerParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisParametersIntegerParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisParametersIntegerParameterArgs.builder
      builder.integerParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param stringParameters List of parameters that have a data type of string. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_StringParameter.html).
     * @return builder
     */
    inline def stringParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisParametersStringParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisParametersStringParameterArgs.builder
      builder.stringParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.AnalysisSourceEntityArgs.Builder)
    /**
     * @param sourceTemplate Source template. See source_template.
     * @return builder
     */
    inline def sourceTemplate(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisSourceEntitySourceTemplateArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.AnalysisSourceEntityArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisSourceEntitySourceTemplateArgs.builder
      builder.sourceTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.AnalysisSourceEntitySourceTemplateArgs.Builder)
    /**
     * @param dataSetReferences List of dataset references. See data_set_references.
     * @return builder
     */
    inline def dataSetReferences(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisSourceEntitySourceTemplateDataSetReferenceArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.AnalysisSourceEntitySourceTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisSourceEntitySourceTemplateDataSetReferenceArgs.builder
      builder.dataSetReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.AnalysisState.Builder)
    /**
     * @param parameters Parameters for the creation of the analysis, which you want to use to override the default settings. An analysis can have any type of parameters, and some parameters might accept multiple values. See parameters.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.AnalysisState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param permissions Set of resource permissions on the analysis. Maximum of 64 items. See permissions.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.AnalysisState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceEntity Entity that you are using as a source when you create the analysis (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
     * @return builder
     */
    inline def sourceEntity(args: Endofunction[com.pulumi.aws.quicksight.inputs.AnalysisSourceEntityArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.AnalysisState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.AnalysisSourceEntityArgs.builder
      builder.sourceEntity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.CustomPermissionsState.Builder)
    /**
     * @param capabilities Actions to include in the custom permissions profile. See `capabilities` Block.
     * @return builder
     */
    inline def capabilities(args: Endofunction[com.pulumi.aws.quicksight.inputs.CustomPermissionsCapabilitiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.CustomPermissionsState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.CustomPermissionsCapabilitiesArgs.builder
      builder.capabilities(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder)
    /**
     * @param adHocFilteringOption Ad hoc (one-time) filtering option. See `adHocFilteringOption`.
     * @return builder
     */
    inline def adHocFilteringOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsAdHocFilteringOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsAdHocFilteringOptionArgs.builder
      builder.adHocFilteringOption(args(argsBuilder).build)

    /**
     * @param dataPointDrillUpDownOption Drill-down options of data points in a dashboard. See `dataPointDrillUpDownOption`.
     * @return builder
     */
    inline def dataPointDrillUpDownOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsDataPointDrillUpDownOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsDataPointDrillUpDownOptionArgs.builder
      builder.dataPointDrillUpDownOption(args(argsBuilder).build)

    /**
     * @param dataPointMenuLabelOption Data point menu label options of a dashboard. See `dataPointMenuLabelOption`.
     * @return builder
     */
    inline def dataPointMenuLabelOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsDataPointMenuLabelOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsDataPointMenuLabelOptionArgs.builder
      builder.dataPointMenuLabelOption(args(argsBuilder).build)

    /**
     * @param dataPointTooltipOption Data point tool tip options of a dashboard. See `dataPointTooltipOption`.
     * @return builder
     */
    inline def dataPointTooltipOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsDataPointTooltipOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsDataPointTooltipOptionArgs.builder
      builder.dataPointTooltipOption(args(argsBuilder).build)

    /**
     * @param exportToCsvOption Export to `.csv` option. See `exportToCsvOption`.
     * @return builder
     */
    inline def exportToCsvOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsExportToCsvOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsExportToCsvOptionArgs.builder
      builder.exportToCsvOption(args(argsBuilder).build)

    /**
     * @param exportWithHiddenFieldsOption Whether hidden fields are exported with a dashboard. See `exportWithHiddenFieldsOption`.
     * @return builder
     */
    inline def exportWithHiddenFieldsOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsExportWithHiddenFieldsOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsExportWithHiddenFieldsOptionArgs.builder
      builder.exportWithHiddenFieldsOption(args(argsBuilder).build)

    /**
     * @param sheetControlsOption Sheet controls option. See `sheetControlsOption`.
     * @return builder
     */
    inline def sheetControlsOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsSheetControlsOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsSheetControlsOptionArgs.builder
      builder.sheetControlsOption(args(argsBuilder).build)

    /**
     * @param sheetLayoutElementMaximizationOption Sheet layout maximization options of a dashboard. See `sheetLayoutElementMaximizationOption`.
     * @return builder
     */
    inline def sheetLayoutElementMaximizationOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsSheetLayoutElementMaximizationOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsSheetLayoutElementMaximizationOptionArgs.builder
      builder.sheetLayoutElementMaximizationOption(args(argsBuilder).build)

    /**
     * @param visualAxisSortOption Axis sort options of a dashboard. See `visualAxisSortOption`.
     * @return builder
     */
    inline def visualAxisSortOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsVisualAxisSortOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsVisualAxisSortOptionArgs.builder
      builder.visualAxisSortOption(args(argsBuilder).build)

    /**
     * @param visualMenuOption Menu options of a visual in a dashboard. See `visualMenuOption`.
     * @return builder
     */
    inline def visualMenuOption(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsVisualMenuOptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsVisualMenuOptionArgs.builder
      builder.visualMenuOption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder)
    /**
     * @param dateTimeParameters List of parameters that have a data type of date-time. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DateTimeParameter.html).
     * @return builder
     */
    inline def dateTimeParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardParametersDateTimeParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardParametersDateTimeParameterArgs.builder
      builder.dateTimeParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param decimalParameters List of parameters that have a data type of decimal. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DecimalParameter.html).
     * @return builder
     */
    inline def decimalParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardParametersDecimalParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardParametersDecimalParameterArgs.builder
      builder.decimalParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param integerParameters List of parameters that have a data type of integer. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_IntegerParameter.html).
     * @return builder
     */
    inline def integerParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardParametersIntegerParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardParametersIntegerParameterArgs.builder
      builder.integerParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param stringParameters List of parameters that have a data type of string. See [AWS API Documentation for complete description](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_StringParameter.html).
     * @return builder
     */
    inline def stringParameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardParametersStringParameterArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardParametersStringParameterArgs.builder
      builder.stringParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.DashboardSourceEntityArgs.Builder)
    /**
     * @param sourceTemplate Source template. See `sourceTemplate`.
     * @return builder
     */
    inline def sourceTemplate(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardSourceEntitySourceTemplateArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardSourceEntityArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardSourceEntitySourceTemplateArgs.builder
      builder.sourceTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DashboardSourceEntitySourceTemplateArgs.Builder)
    /**
     * @param dataSetReferences List of dataset references. See `dataSetReferences`.
     * @return builder
     */
    inline def dataSetReferences(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardSourceEntitySourceTemplateDataSetReferenceArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DashboardSourceEntitySourceTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardSourceEntitySourceTemplateDataSetReferenceArgs.builder
      builder.dataSetReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.DashboardState.Builder)
    /**
     * @param dashboardPublishOptions Options for publishing the dashboard. See `dashboardPublishOptions`.
     * @return builder
     */
    inline def dashboardPublishOptions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardDashboardPublishOptionsArgs.builder
      builder.dashboardPublishOptions(args(argsBuilder).build)

    /**
     * @param parameters Parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See `parameters`.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param permissions Set of resource permissions on the dashboard. Maximum of 64 items. See `permissions`.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DashboardState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceEntity Entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `sourceEntity` should be configured. See `sourceEntity`.
     * @return builder
     */
    inline def sourceEntity(args: Endofunction[com.pulumi.aws.quicksight.inputs.DashboardSourceEntityArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DashboardState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DashboardSourceEntityArgs.builder
      builder.sourceEntity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetColumnGroupArgs.Builder)
    /**
     * @param geoSpatialColumnGroup Geospatial column group that denotes a hierarchy. See `geoSpatialColumnGroup` Block below.
     * @return builder
     */
    inline def geoSpatialColumnGroup(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetColumnGroupGeoSpatialColumnGroupArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetColumnGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetColumnGroupGeoSpatialColumnGroupArgs.builder
      builder.geoSpatialColumnGroup(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.Builder)
    /**
     * @param dataTransforms Transform operations that act on this logical table. For this structure to be valid, only one of the attributes can be non-null. See `dataTransforms` Block below.
     * @return builder
     */
    inline def dataTransforms(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.builder
      builder.dataTransforms(args.map(_(argsBuilder).build)*)

    /**
     * @param source Source of this logical table. See `source` Block below.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder)
    /**
     * @param castColumnTypeOperation Transform operation that casts a column to a different type. See `castColumnTypeOperation` Block below.
     * @return builder
     */
    inline def castColumnTypeOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs.builder
      builder.castColumnTypeOperation(args(argsBuilder).build)

    /**
     * @param createColumnsOperation Operation that creates calculated columns. Columns created in one such operation form a lexical closure. See `createColumnsOperation` Block below.
     * @return builder
     */
    inline def createColumnsOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCreateColumnsOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCreateColumnsOperationArgs.builder
      builder.createColumnsOperation(args(argsBuilder).build)

    /**
     * @param filterOperation Operation that filters rows based on some condition. See `filterOperation` Block below.
     * @return builder
     */
    inline def filterOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformFilterOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformFilterOperationArgs.builder
      builder.filterOperation(args(argsBuilder).build)

    /**
     * @param projectOperation Operation that projects columns. Operations that come after a projection can only refer to projected columns. See `projectOperation` Block below.
     * @return builder
     */
    inline def projectOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformProjectOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformProjectOperationArgs.builder
      builder.projectOperation(args(argsBuilder).build)

    /**
     * @param renameColumnOperation Operation that renames a column. See `renameColumnOperation` Block below.
     * @return builder
     */
    inline def renameColumnOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformRenameColumnOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformRenameColumnOperationArgs.builder
      builder.renameColumnOperation(args(argsBuilder).build)

    /**
     * @param tagColumnOperation Operation that tags a column with additional information. See `tagColumnOperation` Block below.
     * @return builder
     */
    inline def tagColumnOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationArgs.builder
      builder.tagColumnOperation(args(argsBuilder).build)

    /**
     * @param untagColumnOperation Transform operation that removes tags associated with a column. See `untagColumnOperation` Block below.
     * @return builder
     */
    inline def untagColumnOperation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformUntagColumnOperationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformUntagColumnOperationArgs.builder
      builder.untagColumnOperation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCreateColumnsOperationArgs.Builder)
    /**
     * @param columns Calculated columns to create. See `logical_table_map.data_transforms.create_columns_operation.columns` Block below.
     * @return builder
     */
    inline def columns(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCreateColumnsOperationColumnArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCreateColumnsOperationArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformCreateColumnsOperationColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationArgs.Builder)
    /**
     * @param tags Dataset column tag, currently only used for geospatial type tagging. See `tags` Block below.
     * @return builder
     */
    inline def tags(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationTagArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationTagArgs.Builder)
    /**
     * @param columnDescription Description for a column. See `columnDescription` Block below.
     * @return builder
     */
    inline def columnDescription(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationTagColumnDescriptionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationTagArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapDataTransformTagColumnOperationTagColumnDescriptionArgs.builder
      builder.columnDescription(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceArgs.Builder)
    /**
     * @param joinInstruction Result of a join of two logical tables. See `joinInstruction` Block below.
     * @return builder
     */
    inline def joinInstruction(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionArgs.builder
      builder.joinInstruction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionArgs.Builder)
    /**
     * @param leftJoinKeyProperties Join key properties of the left operand. See `leftJoinKeyProperties` Block below.
     * @return builder
     */
    inline def leftJoinKeyProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionLeftJoinKeyPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionLeftJoinKeyPropertiesArgs.builder
      builder.leftJoinKeyProperties(args(argsBuilder).build)

    /**
     * @param rightJoinKeyProperties Join key properties of the right operand. See `rightJoinKeyProperties` Block below.
     * @return builder
     */
    inline def rightJoinKeyProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionRightJoinKeyPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapSourceJoinInstructionRightJoinKeyPropertiesArgs.builder
      builder.rightJoinKeyProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.Builder)
    /**
     * @param customSql Physical table type built from the results of the custom SQL query. See `customSql` Block below.
     * @return builder
     */
    inline def customSql(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapCustomSqlArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapCustomSqlArgs.builder
      builder.customSql(args(argsBuilder).build)

    /**
     * @param relationalTable Physical table type for relational data sources. See `relationalTable` Block below.
     * @return builder
     */
    inline def relationalTable(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapRelationalTableArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapRelationalTableArgs.builder
      builder.relationalTable(args(argsBuilder).build)

    /**
     * @param s3Source Physical table type for an S3 data source. See `s3Source` Block below.
     * @return builder
     */
    inline def s3Source(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceArgs.builder
      builder.s3Source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapCustomSqlArgs.Builder)
    /**
     * @param columns Column schema from the SQL query result set. See `physical_table_map.custom_sql.columns` Block below.
     * @return builder
     */
    inline def columns(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapCustomSqlColumnArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapCustomSqlArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapCustomSqlColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapRelationalTableArgs.Builder)
    /**
     * @param inputColumns Column schema of the table. See `inputColumns` Block below.
     * @return builder
     */
    inline def inputColumns(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapRelationalTableInputColumnArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapRelationalTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapRelationalTableInputColumnArgs.builder
      builder.inputColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceArgs.Builder)
    /**
     * @param inputColumns Column schema of the table. See `inputColumns` Block below.
     * @return builder
     */
    inline def inputColumns(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceInputColumnArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceInputColumnArgs.builder
      builder.inputColumns(args.map(_(argsBuilder).build)*)

    /**
     * @param uploadSettings Information about the format for the S3 source file or files. See `uploadSettings` Block below.
     * @return builder
     */
    inline def uploadSettings(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceUploadSettingsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapS3SourceUploadSettingsArgs.builder
      builder.uploadSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesArgs.Builder)
    /**
     * @param refreshConfiguration Refresh configuration for the data set. See `refreshConfiguration` Block below.
     * @return builder
     */
    inline def refreshConfiguration(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationArgs.builder
      builder.refreshConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationArgs.Builder)
    /**
     * @param incrementalRefresh Incremental refresh for the data set. See `incrementalRefresh` Block below.
     * @return builder
     */
    inline def incrementalRefresh(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationIncrementalRefreshArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationIncrementalRefreshArgs.builder
      builder.incrementalRefresh(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationIncrementalRefreshArgs.Builder)
    /**
     * @param lookbackWindow Lookback window setup for an incremental refresh configuration. See `lookbackWindow` Block below.
     * @return builder
     */
    inline def lookbackWindow(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationIncrementalRefreshLookbackWindowArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationIncrementalRefreshArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesRefreshConfigurationIncrementalRefreshLookbackWindowArgs.builder
      builder.lookbackWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationArgs.Builder)
    /**
     * @param tagRules Set of rules associated with row-level security, such as the tag names and columns that they are assigned to. See `tagRules` Block below.
     * @return builder
     */
    inline def tagRules(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationTagRuleArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationTagRuleArgs.builder
      builder.tagRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSetState.Builder)
    /**
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial hierarchy is supported. See `columnGroups` Block below.
     * @return builder
     */
    inline def columnGroups(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetColumnGroupArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetColumnGroupArgs.builder
      builder.columnGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param columnLevelPermissionRules Set of 1 or more definitions of a [ColumnLevelPermissionRule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_ColumnLevelPermissionRule.html). See `columnLevelPermissionRules` Block below.
     * @return builder
     */
    inline def columnLevelPermissionRules(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetColumnLevelPermissionRuleArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetColumnLevelPermissionRuleArgs.builder
      builder.columnLevelPermissionRules(args.map(_(argsBuilder).build)*)

    /**
     * @param dataSetUsageConfiguration Usage configuration to apply to child datasets that reference this dataset as a source. See `dataSetUsageConfiguration` Block below.
     * @return builder
     */
    inline def dataSetUsageConfiguration(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetDataSetUsageConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetDataSetUsageConfigurationArgs.builder
      builder.dataSetUsageConfiguration(args(argsBuilder).build)

    /**
     * @param fieldFolders Folder that contains fields and nested subfolders for your dataset. See `fieldFolders` Block below.
     * @return builder
     */
    inline def fieldFolders(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetFieldFolderArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetFieldFolderArgs.builder
      builder.fieldFolders(args.map(_(argsBuilder).build)*)

    /**
     * @param logicalTableMaps Configures the combination and transformation of the data from the physical tables. Maximum of 1 entry. See `logicalTableMap` Block below.
     * @return builder
     */
    inline def logicalTableMaps(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetLogicalTableMapArgs.builder
      builder.logicalTableMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param outputColumns Final set of columns available for use in analyses and dashboards after all data preparation and transformation steps have been applied within the data set. See `outputColumns` Block below.
     * @return builder
     */
    inline def outputColumns(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetOutputColumnArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetOutputColumnArgs.builder
      builder.outputColumns(args.map(_(argsBuilder).build)*)

    /**
     * @param permissions Set of resource permissions on the data source. Maximum of 64 items. See `permissions` Block below.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param physicalTableMaps Declares the physical tables that are available in the underlying data sources. See `physicalTableMap` Block below.
     * @return builder
     */
    inline def physicalTableMaps(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetPhysicalTableMapArgs.builder
      builder.physicalTableMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param refreshProperties Refresh properties for the data set. **NOTE**: Only valid when `importMode` is set to `SPICE`. See `refreshProperties` Block below.
     * @return builder
     */
    inline def refreshProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRefreshPropertiesArgs.builder
      builder.refreshProperties(args(argsBuilder).build)

    /**
     * @param rowLevelPermissionDataSet Row-level security configuration for the data that you want to create. See `rowLevelPermissionDataSet` Block below.
     * @return builder
     */
    inline def rowLevelPermissionDataSet(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionDataSetArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionDataSetArgs.builder
      builder.rowLevelPermissionDataSet(args(argsBuilder).build)

    /**
     * @param rowLevelPermissionTagConfiguration Configuration of tags on a dataset to set row-level security. Row-level security tags are currently supported for anonymous embedding only. See `rowLevelPermissionTagConfiguration` Block below.
     * @return builder
     */
    inline def rowLevelPermissionTagConfiguration(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSetState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSetRowLevelPermissionTagConfigurationArgs.builder
      builder.rowLevelPermissionTagConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSourceCredentialsArgs.Builder)
    /**
     * @param credentialPair Credential pair. See `credentialPair` Block below for more details.
     * @return builder
     */
    inline def credentialPair(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceCredentialsCredentialPairArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceCredentialsCredentialPairArgs.builder
      builder.credentialPair(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder)
    /**
     * @param amazonElasticsearch Parameters for connecting to Amazon Elasticsearch.
     * @return builder
     */
    inline def amazonElasticsearch(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersAmazonElasticsearchArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersAmazonElasticsearchArgs.builder
      builder.amazonElasticsearch(args(argsBuilder).build)

    /**
     * @param athena Parameters for connecting to Athena.
     * @return builder
     */
    inline def athena(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersAthenaArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersAthenaArgs.builder
      builder.athena(args(argsBuilder).build)

    /**
     * @param aurora Parameters for connecting to Aurora MySQL.
     * @return builder
     */
    inline def aurora(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraArgs.builder
      builder.aurora(args(argsBuilder).build)

    /**
     * @param auroraPostgresql Parameters for connecting to Aurora Postgresql.
     * @return builder
     */
    inline def auroraPostgresql(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraPostgresqlArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraPostgresqlArgs.builder
      builder.auroraPostgresql(args(argsBuilder).build)

    /**
     * @param awsIotAnalytics Parameters for connecting to AWS IoT Analytics.
     * @return builder
     */
    inline def awsIotAnalytics(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersAwsIotAnalyticsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersAwsIotAnalyticsArgs.builder
      builder.awsIotAnalytics(args(argsBuilder).build)

    /**
     * @param databricks Parameters for connecting to Databricks.
     * @return builder
     */
    inline def databricks(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersDatabricksArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersDatabricksArgs.builder
      builder.databricks(args(argsBuilder).build)

    /**
     * @param jira Parameters for connecting to Jira.
     * @return builder
     */
    inline def jira(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersJiraArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersJiraArgs.builder
      builder.jira(args(argsBuilder).build)

    /**
     * @param mariaDb Parameters for connecting to MariaDB.
     * @return builder
     */
    inline def mariaDb(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersMariaDbArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersMariaDbArgs.builder
      builder.mariaDb(args(argsBuilder).build)

    /**
     * @param mysql Parameters for connecting to MySQL.
     * @return builder
     */
    inline def mysql(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersMysqlArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersMysqlArgs.builder
      builder.mysql(args(argsBuilder).build)

    /**
     * @param oracle Parameters for connecting to Oracle.
     * @return builder
     */
    inline def oracle(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersOracleArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersOracleArgs.builder
      builder.oracle(args(argsBuilder).build)

    /**
     * @param postgresql Parameters for connecting to Postgresql.
     * @return builder
     */
    inline def postgresql(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersPostgresqlArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersPostgresqlArgs.builder
      builder.postgresql(args(argsBuilder).build)

    /**
     * @param presto Parameters for connecting to Presto.
     * @return builder
     */
    inline def presto(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersPrestoArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersPrestoArgs.builder
      builder.presto(args(argsBuilder).build)

    /**
     * @param rds Parameters for connecting to RDS.
     * @return builder
     */
    inline def rds(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersRdsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersRdsArgs.builder
      builder.rds(args(argsBuilder).build)

    /**
     * @param redshift Parameters for connecting to Redshift.
     * @return builder
     */
    inline def redshift(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersRedshiftArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersRedshiftArgs.builder
      builder.redshift(args(argsBuilder).build)

    /**
     * @param s3 Parameters for connecting to S3.
     * @return builder
     */
    inline def s3(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersS3Args.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersS3Args.builder
      builder.s3(args(argsBuilder).build)

    /**
     * @param serviceNow Parameters for connecting to ServiceNow.
     * @return builder
     */
    inline def serviceNow(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersServiceNowArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersServiceNowArgs.builder
      builder.serviceNow(args(argsBuilder).build)

    /**
     * @param snowflake Parameters for connecting to Snowflake.
     * @return builder
     */
    inline def snowflake(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersSnowflakeArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersSnowflakeArgs.builder
      builder.snowflake(args(argsBuilder).build)

    /**
     * @param spark Parameters for connecting to Spark.
     * @return builder
     */
    inline def spark(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersSparkArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersSparkArgs.builder
      builder.spark(args(argsBuilder).build)

    /**
     * @param sqlServer Parameters for connecting to SQL Server.
     * @return builder
     */
    inline def sqlServer(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersSqlServerArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersSqlServerArgs.builder
      builder.sqlServer(args(argsBuilder).build)

    /**
     * @param teradata Parameters for connecting to Teradata.
     * @return builder
     */
    inline def teradata(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersTeradataArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersTeradataArgs.builder
      builder.teradata(args(argsBuilder).build)

    /**
     * @param twitter Parameters for connecting to Twitter.
     * @return builder
     */
    inline def twitter(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersTwitterArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersTwitterArgs.builder
      builder.twitter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSourceParametersS3Args.Builder)
    /**
     * @param manifestFileLocation S3 location of the S3 manifest file. See `manifestFileLocation` Block below for more details.
     * @return builder
     */
    inline def manifestFileLocation(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersS3ManifestFileLocationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceParametersS3Args.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersS3ManifestFileLocationArgs.builder
      builder.manifestFileLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.DataSourceState.Builder)
    /**
     * @param credentials Credentials Amazon QuickSight uses to connect to your underlying source. See `credentials` Block below for more details.
     * @return builder
     */
    inline def credentials(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceCredentialsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

    /**
     * @param parameters Parameters used to connect to this data source (exactly one). See `parameters` Block for details.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param permissions Set of resource permissions on the data source. Maximum of 64 items. See `permission` Block below for more details.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourcePermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.DataSourceState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourcePermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sslProperties Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your underlying source. See `sslProperties` Block below for more details.
     * @return builder
     */
    inline def sslProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceSslPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceSslPropertiesArgs.builder
      builder.sslProperties(args(argsBuilder).build)

    /**
     * @param vpcConnectionProperties Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting to your underlying source. See `vpcConnectionProperties` Block below for more details.
     * @return builder
     */
    inline def vpcConnectionProperties(args: Endofunction[com.pulumi.aws.quicksight.inputs.DataSourceVpcConnectionPropertiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.DataSourceVpcConnectionPropertiesArgs.builder
      builder.vpcConnectionProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.FolderState.Builder)
    /**
     * @param permissions Set of resource permissions on the folder. Maximum of 64 items. See `permissions` Block.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.FolderPermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.FolderState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.FolderPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentState.Builder)
    /**
     * @param identities Amazon QuickSight users, groups, or both to assign the policy to. See `identities` block.
     * @return builder
     */
    inline def identities(args: Endofunction[com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentIdentitiesArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentIdentitiesArgs.builder
      builder.identities(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.KeyRegistrationState.Builder)
    /**
     * @param keyRegistrations Registered keys. See `keyRegistration` Block.
     * @return builder
     */
    inline def keyRegistrations(args: Endofunction[com.pulumi.aws.quicksight.inputs.KeyRegistrationKeyRegistrationArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.KeyRegistrationState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.KeyRegistrationKeyRegistrationArgs.builder
      builder.keyRegistrations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.NamespaceState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.quicksight.inputs.NamespaceTimeoutsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.NamespaceState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.NamespaceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs.Builder)
    /**
     * @param scheduleFrequency Configuration of the [schedule frequency](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RefreshFrequency.html). See `scheduleFrequency` Block.
     * @return builder
     */
    inline def scheduleFrequency(args: Endofunction[com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyArgs.builder
      builder.scheduleFrequency(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyArgs.Builder)
    /**
     * @param refreshOnDay [Refresh on entity](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_ScheduleRefreshOnEntity.html) configuration for weekly or monthly schedules. See `refreshOnDay` Block.
     * @return builder
     */
    inline def refreshOnDay(args: Endofunction[com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyRefreshOnDayArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleScheduleFrequencyRefreshOnDayArgs.builder
      builder.refreshOnDay(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.RefreshScheduleState.Builder)
    /**
     * @param schedule [Refresh schedule](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RefreshSchedule.html) configuration. See `schedule` Block.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.RefreshScheduleState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.RefreshScheduleScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.Builder)
    /**
     * @param sourceAnalysis Source analysis, if it is based on an analysis. Only one of `sourceAnalysis` or `sourceTemplate` should be configured. See `sourceAnalysis` Block.
     * @return builder
     */
    inline def sourceAnalysis(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceAnalysisArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceAnalysisArgs.builder
      builder.sourceAnalysis(args(argsBuilder).build)

    /**
     * @param sourceTemplate Source template, if it is based on a template. Only one of `sourceAnalysis` or `sourceTemplate` should be configured. See `sourceTemplate` Block.
     * @return builder
     */
    inline def sourceTemplate(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceTemplateArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceTemplateArgs.builder
      builder.sourceTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceAnalysisArgs.Builder)
    /**
     * @param dataSetReferences List of dataset references used as placeholders in the template. See `dataSetReferences` Block.
     * @return builder
     */
    inline def dataSetReferences(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceAnalysisDataSetReferenceArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceAnalysisArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.TemplateSourceEntitySourceAnalysisDataSetReferenceArgs.builder
      builder.dataSetReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.TemplateState.Builder)
    /**
     * @param permissions Set of resource permissions on the template. Maximum of 64 items. See `permissions` Block.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplatePermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.TemplateState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.TemplatePermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceEntity Entity that you are using as a source when you create the template (analysis or template). Only one of `definition` or `sourceEntity` should be configured. See `sourceEntity` Block.
     * @return builder
     */
    inline def sourceEntity(args: Endofunction[com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.TemplateState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.TemplateSourceEntityArgs.builder
      builder.sourceEntity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder)
    /**
     * @param dataColorPalette Color properties that apply to chart data colors. See data_color_palette.
     * @return builder
     */
    inline def dataColorPalette(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationDataColorPaletteArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationDataColorPaletteArgs.builder
      builder.dataColorPalette(args(argsBuilder).build)

    /**
     * @param sheet Display options related to sheets. See sheet.
     * @return builder
     */
    inline def sheet(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetArgs.builder
      builder.sheet(args(argsBuilder).build)

    /**
     * @param typography Typography options. See typography.
     * @return builder
     */
    inline def typography(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationTypographyArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationTypographyArgs.builder
      builder.typography(args(argsBuilder).build)

    /**
     * @param uiColorPalette Color properties that apply to the UI and to charts, excluding the colors that apply to data. See ui_color_palette.
     * @return builder
     */
    inline def uiColorPalette(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationUiColorPaletteArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationUiColorPaletteArgs.builder
      builder.uiColorPalette(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetArgs.Builder)
    /**
     * @param tile Display options for tiles. See tile.
     * @return builder
     */
    inline def tile(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileArgs.builder
      builder.tile(args(argsBuilder).build)

    /**
     * @param tileLayout Layout options for tiles. See tile_layout.
     * @return builder
     */
    inline def tileLayout(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutArgs.builder
      builder.tileLayout(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileArgs.Builder)
    /**
     * @param border Border around a tile. See border.
     * @return builder
     */
    inline def border(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileBorderArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileBorderArgs.builder
      builder.border(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutArgs.Builder)
    /**
     * @param gutter Gutter settings that apply between tiles. See gutter.
     * @return builder
     */
    inline def gutter(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutGutterArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutGutterArgs.builder
      builder.gutter(args(argsBuilder).build)

    /**
     * @param margin Margin settings that apply around the outside edge of sheets. See margin.
     * @return builder
     */
    inline def margin(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutMarginArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutArgs.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationSheetTileLayoutMarginArgs.builder
      builder.margin(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.quicksight.inputs.ThemeConfigurationTypographyArgs.Builder)
    /**
     * @param fontFamilies List of font families. Maximum number of 5 items. See font_families.
     * @return builder
     */
    inline def fontFamilies(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationTypographyFontFamilyArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.ThemeConfigurationTypographyArgs.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationTypographyFontFamilyArgs.builder
      builder.fontFamilies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.ThemeState.Builder)
    /**
     * @param configuration Theme configuration, which contains the theme display properties. See configuration.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.ThemeState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.ThemeConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param permissions Set of resource permissions on the theme. Maximum of 64 items. See permissions.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.aws.quicksight.inputs.ThemePermissionArgs.Builder]*):
        com.pulumi.aws.quicksight.inputs.ThemeState.Builder =
      def argsBuilder = com.pulumi.aws.quicksight.inputs.ThemePermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.quicksight.inputs.VpcConnectionState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.quicksight.inputs.VpcConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.quicksight.inputs.VpcConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.quicksight.inputs.VpcConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
