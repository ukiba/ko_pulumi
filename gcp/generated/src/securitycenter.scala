package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object securitycenter:
  /**
   * A Cloud Security Command Center (Cloud SCC) Big Query Export Config.
   *  It represents exporting Security Command Center data, including assets, findings, and security marks
   *  to a BigQuery instance.
   * 
   *  &gt; **Note:** In order to use Cloud SCC resources, your organization must be enrolled
   *  in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
   *  Without doing so, you may run into errors during resource creation.
   * 
   *  To get more information about FolderSccBigQueryExport, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/folders.bigQueryExports)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs/how-to-analyze-findings-in-big-query)
   */
  def FolderSccBigQueryExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.FolderSccBigQueryExportArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.FolderSccBigQueryExportArgs.builder
    com.pulumi.gcp.securitycenter.FolderSccBigQueryExport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * This is a continuous export that exports findings to a Pub/Sub topic.
   * 
   *  To get more information about ProjectNotificationConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/projects.locations.notificationConfigs)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs)
   */
  def V2ProjectNotificationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2ProjectNotificationConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.V2ProjectNotificationConfigArgs.builder
    com.pulumi.gcp.securitycenter.V2ProjectNotificationConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents an instance of an Event Threat Detection custom module, including
   *  its full module name, display name, enablement state, and last updated time.
   *  You can create a custom module at the organization level only.
   * 
   *  To get more information about OrganizationEventThreatDetectionCustomModule, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/security-center-management/rest/v1/organizations.locations.eventThreatDetectionCustomModules)
   *  * How-to Guides
   *      * [Overview of custom modules for Event Threat Detection](https://cloud.google.com/security-command-center/docs/custom-modules-etd-overview)
   */
  def ManagementOrganizationEventThreatDetectionCustomModule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.ManagementOrganizationEventThreatDetectionCustomModuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.ManagementOrganizationEventThreatDetectionCustomModuleArgs.builder
    com.pulumi.gcp.securitycenter.ManagementOrganizationEventThreatDetectionCustomModule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securitycenter.ManagementOrganizationSecurityHealthAnalyticsCustomModuleArgs.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     *  Structure is documented below.
     * @return builder
     */
    def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.ManagementOrganizationSecurityHealthAnalyticsCustomModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.ManagementProjectSecurityHealthAnalyticsCustomModuleArgs.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     *  Structure is documented below.
     * @return builder
     */
    def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.ManagementProjectSecurityHealthAnalyticsCustomModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  /**
   * Mute Findings is a volume management feature in Security Command Center
   *  that lets you manually or programmatically hide irrelevant findings,
   *  and create filters to automatically silence existing and future
   *  findings based on criteria you specify.
   * 
   *  To get more information about FolderMuteConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/folders.muteConfigs)
   */
  def V2FolderMuteConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2FolderMuteConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.V2FolderMuteConfigArgs.builder
    com.pulumi.gcp.securitycenter.V2FolderMuteConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents an instance of a Security Health Analytics custom module, including
   *  its full module name, display name, enablement state, and last updated time.
   *  You can create a custom module at the organization, folder, or project level.
   *  Custom modules that you create at the organization or folder level are inherited
   *  by the child folders and projects.
   * 
   *  To get more information about ProjectCustomModule, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/projects.securityHealthAnalyticsSettings.customModules)
   *  * How-to Guides
   *      * [Overview of custom modules for Security Health Analytics](https://cloud.google.com/security-command-center/docs/custom-modules-sha-overview)
   */
  def ProjectCustomModule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.ProjectCustomModuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.ProjectCustomModuleArgs.builder
    com.pulumi.gcp.securitycenter.ProjectCustomModule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securitycenter.V2OrganizationNotificationConfigArgs.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     *  Structure is documented below.
     * @return builder
     */
    def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2OrganizationNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.V2OrganizationNotificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2OrganizationNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.InstanceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.InstanceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Mute Findings is a volume management feature in Security Command Center
   *  that lets you manually or programmatically hide irrelevant findings,
   *  and create filters to automatically silence existing and future
   *  findings based on criteria you specify.
   * 
   *  To get more information about MuteConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.muteConfigs)
   */
  def MuteConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.MuteConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.MuteConfigArgs.builder
    com.pulumi.gcp.securitycenter.MuteConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * This is a continuous export that exports findings to a Pub/Sub topic.
   * 
   *  To get more information about OrganizationNotificationConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/organizations.locations.notificationConfigs)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs)
   */
  def V2OrganizationNotificationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2OrganizationNotificationConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.V2OrganizationNotificationConfigArgs.builder
    com.pulumi.gcp.securitycenter.V2OrganizationNotificationConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents an instance of a Security Health Analytics custom module, including
   *  its full module name, display name, enablement state, and last updated time.
   *  You can create a custom module at the organization, folder, or project level.
   *  Custom modules that you create at the organization or folder level are inherited
   *  by the child folders and projects.
   * 
   *  To get more information about OrganizationSecurityHealthAnalyticsCustomModule, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/security-center-management/rest/v1/organizations.locations.securityHealthAnalyticsCustomModules)
   *  * How-to Guides
   *      * [Overview of custom modules for Security Health Analytics](https://cloud.google.com/security-command-center/docs/custom-modules-sha-overview)
   */
  def ManagementOrganizationSecurityHealthAnalyticsCustomModule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.ManagementOrganizationSecurityHealthAnalyticsCustomModuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.ManagementOrganizationSecurityHealthAnalyticsCustomModuleArgs.builder
    com.pulumi.gcp.securitycenter.ManagementOrganizationSecurityHealthAnalyticsCustomModule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * &gt; **Warning:** `gcp.securitycenter.V2OrganizationSccBigQueryExports` is deprecated and will be removed in a future major release. Use `gcp.securitycenter.V2OrganizationSccBigQueryExport` instead.
   * 
   *  A Cloud Security Command Center (Cloud SCC) Big Query Export Config.
   *  It represents exporting Security Command Center data, including assets, findings, and security marks
   *  using gcloud scc bqexports
   *  &gt; **Note:** In order to use Cloud SCC resources, your organization must be enrolled
   *  in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
   *  Without doing so, you may run into errors during resource creation.
   * 
   *  To get more information about OrganizationSccBigQueryExports, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/organizations.locations.bigQueryExports)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs/how-to-analyze-findings-in-big-query)
   */
  def V2OrganizationSccBigQueryExports(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2OrganizationSccBigQueryExportsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.securitycenter.V2OrganizationSccBigQueryExportsArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.securitycenter.V2OrganizationSccBigQueryExports(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securitycenter.SourceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.SourceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.SourceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.SourceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.ProjectCustomModuleArgs.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     *  Structure is documented below.
     * @return builder
     */
    def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.ProjectCustomModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.V2ProjectNotificationConfigArgs.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     *  Structure is documented below.
     * @return builder
     */
    def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.V2ProjectNotificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  /**
   * Represents an instance of a Security Health Analytics custom module, including
   *  its full module name, display name, enablement state, and last updated time.
   *  You can create a custom module at the organization, folder, or project level.
   *  Custom modules that you create at the organization or folder level are inherited
   *  by the child folders and projects.
   * 
   *  To get more information about ProjectSecurityHealthAnalyticsCustomModule, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/security-center-management/rest/v1/projects.locations.securityHealthAnalyticsCustomModules)
   *  * How-to Guides
   *      * [Overview of custom modules for Security Health Analytics](https://cloud.google.com/security-command-center/docs/custom-modules-sha-overview)
   */
  def ManagementProjectSecurityHealthAnalyticsCustomModule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.ManagementProjectSecurityHealthAnalyticsCustomModuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.ManagementProjectSecurityHealthAnalyticsCustomModuleArgs.builder
    com.pulumi.gcp.securitycenter.ManagementProjectSecurityHealthAnalyticsCustomModule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securitycenter.NotificationConfigArgs.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     *  Structure is documented below.
     * @return builder
     */
    def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.NotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.NotificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.NotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  type SecuritycenterFunctions = com.pulumi.gcp.securitycenter.SecuritycenterFunctions
  object SecuritycenterFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.securitycenter.SecuritycenterFunctions.*
  extension (self: SecuritycenterFunctions.type)
    /** Retrieves the current IAM policy data for source */
    def getSourceIamPolicy(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.GetSourceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.securitycenter.outputs.GetSourceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.GetSourceIamPolicyArgs.builder
      com.pulumi.gcp.securitycenter.SecuritycenterFunctions.getSourceIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for source */
    def getSourceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.GetSourceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.securitycenter.outputs.GetSourceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.GetSourceIamPolicyPlainArgs.builder
      com.pulumi.gcp.securitycenter.SecuritycenterFunctions.getSourceIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for organizationsource */
    def getV2OrganizationSourceIamPolicy(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.GetV2OrganizationSourceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.securitycenter.outputs.GetV2OrganizationSourceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.GetV2OrganizationSourceIamPolicyArgs.builder
      com.pulumi.gcp.securitycenter.SecuritycenterFunctions.getV2OrganizationSourceIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for organizationsource */
    def getV2OrganizationSourceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.GetV2OrganizationSourceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.securitycenter.outputs.GetV2OrganizationSourceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.GetV2OrganizationSourceIamPolicyPlainArgs.builder
      com.pulumi.gcp.securitycenter.SecuritycenterFunctions.getV2OrganizationSourceIamPolicyPlain(args(argsBuilder).build)

  /**
   * A Cloud Security Command Center (Cloud SCC) Big Query Export Config.
   *  It represents exporting Security Command Center data, including assets, findings, and security marks
   *  using gcloud scc bqexports
   *  &gt; **Note:** In order to use Cloud SCC resources, your organization must be enrolled
   *  in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
   *  Without doing so, you may run into errors during resource creation.
   * 
   *  To get more information about ProjectSccBigQueryExport, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/projects.locations.bigQueryExports)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs/how-to-analyze-findings-in-big-query)
   */
  def V2ProjectSccBigQueryExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2ProjectSccBigQueryExportArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.V2ProjectSccBigQueryExportArgs.builder
    com.pulumi.gcp.securitycenter.V2ProjectSccBigQueryExport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Cloud Security Command Center (Cloud SCC) notification configs. A
   *  notification config is a Cloud SCC resource that contains the
   *  configuration to send notifications for create/update events of
   *  findings, assets and etc.
   *  &gt; **Note:** In order to use Cloud SCC resources, your organization must be enrolled
   *  in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
   *  Without doing so, you may run into errors during resource creation.
   * 
   *  To get more information about FolderNotificationConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/folders.notificationConfigs)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs)
   */
  def FolderNotificationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.FolderNotificationConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.FolderNotificationConfigArgs.builder
    com.pulumi.gcp.securitycenter.FolderNotificationConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents an instance of an Event Threat Detection custom module, including
   *  its full module name, display name, enablement state, andlast updated time.
   *  You can create a custom module at the organization level only.
   * 
   *  To get more information about EventThreatDetectionCustomModule, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.eventThreatDetectionSettings.customModules)
   *  * How-to Guides
   *      * [Overview of custom modules for Event Threat Detection](https://cloud.google.com/security-command-center/docs/custom-modules-etd-overview)
   */
  def EventThreatDetectionCustomModule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.EventThreatDetectionCustomModuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.EventThreatDetectionCustomModuleArgs.builder
    com.pulumi.gcp.securitycenter.EventThreatDetectionCustomModule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents an instance of a Security Health Analytics custom module, including
   *  its full module name, display name, enablement state, and last updated time.
   *  You can create a custom module at the organization, folder, or project level.
   *  Custom modules that you create at the organization or folder level are inherited
   *  by the child folders and projects.
   * 
   *  To get more information about OrganizationCustomModule, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.securityHealthAnalyticsSettings.customModules)
   *  * How-to Guides
   *      * [Overview of custom modules for Security Health Analytics](https://cloud.google.com/security-command-center/docs/custom-modules-sha-overview)
   */
  def OrganizationCustomModule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.OrganizationCustomModuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.OrganizationCustomModuleArgs.builder
    com.pulumi.gcp.securitycenter.OrganizationCustomModule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Cloud Security Command Center (Cloud SCC) Big Query Export Config.
   *  It represents exporting Security Command Center data, including assets, findings, and security marks
   *  using gcloud scc bqexports
   *  &gt; **Note:** In order to use Cloud SCC resources, your organization must be enrolled
   *  in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
   *  Without doing so, you may run into errors during resource creation.
   * 
   *  To get more information about OrganizationSccBigQueryExport, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.bigQueryExports)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs/how-to-analyze-findings-in-big-query)
   */
  def OrganizationSccBigQueryExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.OrganizationSccBigQueryExportArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.OrganizationSccBigQueryExportArgs.builder
    com.pulumi.gcp.securitycenter.OrganizationSccBigQueryExport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Cloud Security Command Center (Cloud SCC) notification configs. A
   *  notification config is a Cloud SCC resource that contains the
   *  configuration to send notifications for create/update events of
   *  findings, assets and etc.
   *  &gt; **Note:** In order to use Cloud SCC resources, your organization must be enrolled
   *  in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
   *  Without doing so, you may run into errors during resource creation.
   * 
   *  To get more information about ProjectNotificationConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/projects.notificationConfigs)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs)
   */
  def ProjectNotificationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.ProjectNotificationConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.ProjectNotificationConfigArgs.builder
    com.pulumi.gcp.securitycenter.ProjectNotificationConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents an instance of a Security Health Analytics custom module, including
   *  its full module name, display name, enablement state, and last updated time.
   *  You can create a custom module at the organization, folder, or project level.
   *  Custom modules that you create at the organization or folder level are inherited
   *  by the child folders and projects.
   * 
   *  To get more information about FolderSecurityHealthAnalyticsCustomModule, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/security-center-management/rest/v1/folders.locations.securityHealthAnalyticsCustomModules)
   *  * How-to Guides
   *      * [Overview of custom modules for Security Health Analytics](https://cloud.google.com/security-command-center/docs/custom-modules-sha-overview)
   */
  def ManagementFolderSecurityHealthAnalyticsCustomModule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.ManagementFolderSecurityHealthAnalyticsCustomModuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.ManagementFolderSecurityHealthAnalyticsCustomModuleArgs.builder
    com.pulumi.gcp.securitycenter.ManagementFolderSecurityHealthAnalyticsCustomModule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securitycenter.ManagementFolderSecurityHealthAnalyticsCustomModuleArgs.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     *  Structure is documented below.
     * @return builder
     */
    def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.ManagementFolderSecurityHealthAnalyticsCustomModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Security Command Center (SCC) v2 API OrganizationSource. Each of these resources serves a different use case:
   * 
   *  * `gcp.securitycenter.V2OrganizationSourceIamPolicy`: Authoritative. Sets the IAM policy for the organizationsource and replaces any existing policy already attached.
   *  * `gcp.securitycenter.V2OrganizationSourceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organizationsource are preserved.
   *  * `gcp.securitycenter.V2OrganizationSourceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organizationsource are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.securitycenter.V2OrganizationSourceIamPolicy`: Retrieves the IAM policy for the organizationsource
   * 
   *  &gt; **Note:** `gcp.securitycenter.V2OrganizationSourceIamPolicy` **cannot** be used in conjunction with `gcp.securitycenter.V2OrganizationSourceIamBinding` and `gcp.securitycenter.V2OrganizationSourceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.securitycenter.V2OrganizationSourceIamBinding` resources **can be** used in conjunction with `gcp.securitycenter.V2OrganizationSourceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicy;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new V2OrganizationSourceIamPolicy("policy", V2OrganizationSourceIamPolicyArgs.builder()
   *              .source(customSource.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBinding;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new V2OrganizationSourceIamBinding("binding", V2OrganizationSourceIamBindingArgs.builder()
   *              .source(customSource.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMember;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new V2OrganizationSourceIamMember("member", V2OrganizationSourceIamMemberArgs.builder()
   *              .source(customSource.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Security Command Center (SCC) v2 API OrganizationSource
   * 
   *  Three different resources help you manage your IAM policy for Security Command Center (SCC) v2 API OrganizationSource. Each of these resources serves a different use case:
   * 
   *  * `gcp.securitycenter.V2OrganizationSourceIamPolicy`: Authoritative. Sets the IAM policy for the organizationsource and replaces any existing policy already attached.
   *  * `gcp.securitycenter.V2OrganizationSourceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organizationsource are preserved.
   *  * `gcp.securitycenter.V2OrganizationSourceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organizationsource are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.securitycenter.V2OrganizationSourceIamPolicy`: Retrieves the IAM policy for the organizationsource
   * 
   *  &gt; **Note:** `gcp.securitycenter.V2OrganizationSourceIamPolicy` **cannot** be used in conjunction with `gcp.securitycenter.V2OrganizationSourceIamBinding` and `gcp.securitycenter.V2OrganizationSourceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.securitycenter.V2OrganizationSourceIamBinding` resources **can be** used in conjunction with `gcp.securitycenter.V2OrganizationSourceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicy;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new V2OrganizationSourceIamPolicy("policy", V2OrganizationSourceIamPolicyArgs.builder()
   *              .source(customSource.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBinding;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new V2OrganizationSourceIamBinding("binding", V2OrganizationSourceIamBindingArgs.builder()
   *              .source(customSource.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMember;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new V2OrganizationSourceIamMember("member", V2OrganizationSourceIamMemberArgs.builder()
   *              .source(customSource.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * organizations/{{organization}}/sources/{{source}}
   *  * {{organization}}/{{source}}
   *  * {{source}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Security Command Center (SCC) v2 API organizationsource IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_scc_v2_organization_source_iam_member.editor &#34;organizations/{{organization}}/sources/{{source}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_scc_v2_organization_source_iam_binding.editor &#34;organizations/{{organization}}/sources/{{source}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:securitycenter/v2OrganizationSourceIamMember:V2OrganizationSourceIamMember editor organizations/{{organization}}/sources/{{source}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def V2OrganizationSourceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMemberArgs.builder
    com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.SourceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.SourceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.SourceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.SourceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.ProjectNotificationConfigArgs.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     *  Structure is documented below.
     * @return builder
     */
    def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.ProjectNotificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  /**
   * Represents a Data Fusion instance.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/data-fusion/docs/reference/rest/v1beta1/projects.locations.instances)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/data-fusion/docs/)
   */
  def InstanceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.InstanceIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.securitycenter.InstanceIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.securitycenter.InstanceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Cloud Security Command Center&#39;s (Cloud SCC) finding source. A finding
   *  source is an entity or a mechanism that can produce a finding. A source is
   *  like a container of findings that come from the same scanner, logger,
   *  monitor, etc.
   * 
   *  To get more information about Source, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.sources)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs)
   */
  def SourceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.SourceIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.SourceIamMemberArgs.builder
    com.pulumi.gcp.securitycenter.SourceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securitycenter.OrganizationCustomModuleArgs.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     *  Structure is documented below.
     * @return builder
     */
    def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.OrganizationCustomModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.InstanceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.InstanceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Represents a Data Fusion instance.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/data-fusion/docs/reference/rest/v1beta1/projects.locations.instances)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/data-fusion/docs/)
   */
  def InstanceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.InstanceIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.securitycenter.InstanceIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.securitycenter.InstanceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Cloud Security Command Center&#39;s (Cloud SCC) finding source. A finding
   *  source is an entity or a mechanism that can produce a finding. A source is
   *  like a container of findings that come from the same scanner, logger,
   *  monitor, etc.
   * 
   *  To get more information about Source, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.sources)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs)
   */
  def Source(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.SourceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.SourceArgs.builder
    com.pulumi.gcp.securitycenter.Source(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Cloud Security Command Center (Cloud SCC) Big Query Export Config.
   *  It represents exporting Security Command Center data, including assets, findings, and security marks
   *  using gcloud scc bqexports
   *  &gt; **Note:** In order to use Cloud SCC resources, your organization must be enrolled
   *  in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
   *  Without doing so, you may run into errors during resource creation.
   * 
   *  To get more information about ProjectSccBigQueryExport, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/projects.bigQueryExports)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs/how-to-analyze-findings-in-big-query)
   */
  def ProjectSccBigQueryExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.ProjectSccBigQueryExportArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.ProjectSccBigQueryExportArgs.builder
    com.pulumi.gcp.securitycenter.ProjectSccBigQueryExport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securitycenter.FolderNotificationConfigArgs.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     *  Structure is documented below.
     * @return builder
     */
    def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.FolderNotificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  /**
   * Represents an instance of a Security Health Analytics custom module, including
   *  its full module name, display name, enablement state, and last updated time.
   *  You can create a custom module at the organization, folder, or project level.
   *  Custom modules that you create at the organization or folder level are inherited
   *  by the child folders and projects.
   * 
   *  To get more information about FolderCustomModule, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/folders.securityHealthAnalyticsSettings.customModules)
   *  * How-to Guides
   *      * [Overview of custom modules for Security Health Analytics](https://cloud.google.com/security-command-center/docs/custom-modules-sha-overview)
   */
  def FolderCustomModule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.FolderCustomModuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.FolderCustomModuleArgs.builder
    com.pulumi.gcp.securitycenter.FolderCustomModule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Mute Findings is a volume management feature in Security Command Center
   *  that lets you manually or programmatically hide irrelevant findings,
   *  and create filters to automatically silence existing and future
   *  findings based on criteria you specify.
   * 
   *  To get more information about OrganizationMuteConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/organizations.muteConfigs)
   */
  def V2OrganizationMuteConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2OrganizationMuteConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.V2OrganizationMuteConfigArgs.builder
    com.pulumi.gcp.securitycenter.V2OrganizationMuteConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securitycenter.V2FolderNotificationConfigArgs.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     *  Structure is documented below.
     * @return builder
     */
    def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2FolderNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.V2FolderNotificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2FolderNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  /**
   * A Cloud Security Command Center (Cloud SCC) Big Query Export Config.
   *  It represents exporting Security Command Center data, including assets, findings, and security marks
   *  using gcloud scc bqexports
   *  &gt; **Note:** In order to use Cloud SCC resources, your organization must be enrolled
   *  in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
   *  Without doing so, you may run into errors during resource creation.
   * 
   *  To get more information about FolderSccBigQueryExport, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/folders.locations.bigQueryExports)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs/how-to-analyze-findings-in-big-query)
   */
  def V2FolderSccBigQueryExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2FolderSccBigQueryExportArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.V2FolderSccBigQueryExportArgs.builder
    com.pulumi.gcp.securitycenter.V2FolderSccBigQueryExport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * This is a continuous export that exports findings to a Pub/Sub topic.
   * 
   *  To get more information about FolderNotificationConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/folders.locations.notificationConfigs)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs)
   */
  def V2FolderNotificationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2FolderNotificationConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.V2FolderNotificationConfigArgs.builder
    com.pulumi.gcp.securitycenter.V2FolderNotificationConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securitycenter.FolderCustomModuleArgs.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     *  Structure is documented below.
     * @return builder
     */
    def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.FolderCustomModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Security Command Center (SCC) v2 API OrganizationSource. Each of these resources serves a different use case:
   * 
   *  * `gcp.securitycenter.V2OrganizationSourceIamPolicy`: Authoritative. Sets the IAM policy for the organizationsource and replaces any existing policy already attached.
   *  * `gcp.securitycenter.V2OrganizationSourceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organizationsource are preserved.
   *  * `gcp.securitycenter.V2OrganizationSourceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organizationsource are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.securitycenter.V2OrganizationSourceIamPolicy`: Retrieves the IAM policy for the organizationsource
   * 
   *  &gt; **Note:** `gcp.securitycenter.V2OrganizationSourceIamPolicy` **cannot** be used in conjunction with `gcp.securitycenter.V2OrganizationSourceIamBinding` and `gcp.securitycenter.V2OrganizationSourceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.securitycenter.V2OrganizationSourceIamBinding` resources **can be** used in conjunction with `gcp.securitycenter.V2OrganizationSourceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicy;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new V2OrganizationSourceIamPolicy("policy", V2OrganizationSourceIamPolicyArgs.builder()
   *              .source(customSource.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBinding;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new V2OrganizationSourceIamBinding("binding", V2OrganizationSourceIamBindingArgs.builder()
   *              .source(customSource.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMember;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new V2OrganizationSourceIamMember("member", V2OrganizationSourceIamMemberArgs.builder()
   *              .source(customSource.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Security Command Center (SCC) v2 API OrganizationSource
   * 
   *  Three different resources help you manage your IAM policy for Security Command Center (SCC) v2 API OrganizationSource. Each of these resources serves a different use case:
   * 
   *  * `gcp.securitycenter.V2OrganizationSourceIamPolicy`: Authoritative. Sets the IAM policy for the organizationsource and replaces any existing policy already attached.
   *  * `gcp.securitycenter.V2OrganizationSourceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organizationsource are preserved.
   *  * `gcp.securitycenter.V2OrganizationSourceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organizationsource are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.securitycenter.V2OrganizationSourceIamPolicy`: Retrieves the IAM policy for the organizationsource
   * 
   *  &gt; **Note:** `gcp.securitycenter.V2OrganizationSourceIamPolicy` **cannot** be used in conjunction with `gcp.securitycenter.V2OrganizationSourceIamBinding` and `gcp.securitycenter.V2OrganizationSourceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.securitycenter.V2OrganizationSourceIamBinding` resources **can be** used in conjunction with `gcp.securitycenter.V2OrganizationSourceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicy;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new V2OrganizationSourceIamPolicy("policy", V2OrganizationSourceIamPolicyArgs.builder()
   *              .source(customSource.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBinding;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new V2OrganizationSourceIamBinding("binding", V2OrganizationSourceIamBindingArgs.builder()
   *              .source(customSource.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMember;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new V2OrganizationSourceIamMember("member", V2OrganizationSourceIamMemberArgs.builder()
   *              .source(customSource.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * organizations/{{organization}}/sources/{{source}}
   *  * {{organization}}/{{source}}
   *  * {{source}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Security Command Center (SCC) v2 API organizationsource IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_scc_v2_organization_source_iam_member.editor &#34;organizations/{{organization}}/sources/{{source}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_scc_v2_organization_source_iam_binding.editor &#34;organizations/{{organization}}/sources/{{source}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:securitycenter/v2OrganizationSourceIamPolicy:V2OrganizationSourceIamPolicy editor organizations/{{organization}}/sources/{{source}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def V2OrganizationSourceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicyArgs.builder
    com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Cloud Security Command Center&#39;s (Cloud SCC) finding source. A finding
   *  source is an entity or a mechanism that can produce a finding. A source is
   *  like a container of findings that come from the same scanner, logger,
   *  monitor, etc.
   * 
   *  To get more information about Source, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.sources)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs)
   */
  def SourceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.SourceIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.SourceIamPolicyArgs.builder
    com.pulumi.gcp.securitycenter.SourceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Cloud Security Command Center (Cloud SCC) Big Query Export Config.
   *  It represents exporting Security Command Center data, including assets, findings, and security marks
   *  using gcloud scc bqexports
   *  &gt; **Note:** In order to use Cloud SCC resources, your organization must be enrolled
   *  in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
   *  Without doing so, you may run into errors during resource creation.
   * 
   *  To get more information about OrganizationSccBigQueryExport, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/organizations.locations.bigQueryExports)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs/how-to-analyze-findings-in-big-query)
   */
  def V2OrganizationSccBigQueryExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2OrganizationSccBigQueryExportArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.securitycenter.V2OrganizationSccBigQueryExportArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.securitycenter.V2OrganizationSccBigQueryExport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a Data Fusion instance.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/data-fusion/docs/reference/rest/v1beta1/projects.locations.instances)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/data-fusion/docs/)
   */
  def InstanceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.InstanceIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.securitycenter.InstanceIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.securitycenter.InstanceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Mute Findings is a volume management feature in Security Command Center
   *  that lets you manually or programmatically hide irrelevant findings,
   *  and create filters to automatically silence existing and future
   *  findings based on criteria you specify.
   * 
   *  To get more information about ProjectMuteConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/projects.muteConfigs)
   */
  def V2ProjectMuteConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2ProjectMuteConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.V2ProjectMuteConfigArgs.builder
    com.pulumi.gcp.securitycenter.V2ProjectMuteConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Cloud Security Command Center&#39;s (Cloud SCC) finding source. A finding
   *  source is an entity or a mechanism that can produce a finding. A source is
   *  like a container of findings that come from the same scanner, logger,
   *  monitor, etc.
   * 
   *  To get more information about OrganizationSource, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/organizations.sources)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs)
   */
  def V2OrganizationSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2OrganizationSourceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.V2OrganizationSourceArgs.builder
    com.pulumi.gcp.securitycenter.V2OrganizationSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Security Command Center (SCC) v2 API OrganizationSource. Each of these resources serves a different use case:
   * 
   *  * `gcp.securitycenter.V2OrganizationSourceIamPolicy`: Authoritative. Sets the IAM policy for the organizationsource and replaces any existing policy already attached.
   *  * `gcp.securitycenter.V2OrganizationSourceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organizationsource are preserved.
   *  * `gcp.securitycenter.V2OrganizationSourceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organizationsource are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.securitycenter.V2OrganizationSourceIamPolicy`: Retrieves the IAM policy for the organizationsource
   * 
   *  &gt; **Note:** `gcp.securitycenter.V2OrganizationSourceIamPolicy` **cannot** be used in conjunction with `gcp.securitycenter.V2OrganizationSourceIamBinding` and `gcp.securitycenter.V2OrganizationSourceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.securitycenter.V2OrganizationSourceIamBinding` resources **can be** used in conjunction with `gcp.securitycenter.V2OrganizationSourceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicy;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new V2OrganizationSourceIamPolicy("policy", V2OrganizationSourceIamPolicyArgs.builder()
   *              .source(customSource.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBinding;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new V2OrganizationSourceIamBinding("binding", V2OrganizationSourceIamBindingArgs.builder()
   *              .source(customSource.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMember;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new V2OrganizationSourceIamMember("member", V2OrganizationSourceIamMemberArgs.builder()
   *              .source(customSource.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Security Command Center (SCC) v2 API OrganizationSource
   * 
   *  Three different resources help you manage your IAM policy for Security Command Center (SCC) v2 API OrganizationSource. Each of these resources serves a different use case:
   * 
   *  * `gcp.securitycenter.V2OrganizationSourceIamPolicy`: Authoritative. Sets the IAM policy for the organizationsource and replaces any existing policy already attached.
   *  * `gcp.securitycenter.V2OrganizationSourceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organizationsource are preserved.
   *  * `gcp.securitycenter.V2OrganizationSourceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organizationsource are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.securitycenter.V2OrganizationSourceIamPolicy`: Retrieves the IAM policy for the organizationsource
   * 
   *  &gt; **Note:** `gcp.securitycenter.V2OrganizationSourceIamPolicy` **cannot** be used in conjunction with `gcp.securitycenter.V2OrganizationSourceIamBinding` and `gcp.securitycenter.V2OrganizationSourceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.securitycenter.V2OrganizationSourceIamBinding` resources **can be** used in conjunction with `gcp.securitycenter.V2OrganizationSourceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicy;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new V2OrganizationSourceIamPolicy("policy", V2OrganizationSourceIamPolicyArgs.builder()
   *              .source(customSource.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBinding;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new V2OrganizationSourceIamBinding("binding", V2OrganizationSourceIamBindingArgs.builder()
   *              .source(customSource.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securitycenter.V2OrganizationSourceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMember;
   *  import com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new V2OrganizationSourceIamMember("member", V2OrganizationSourceIamMemberArgs.builder()
   *              .source(customSource.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * organizations/{{organization}}/sources/{{source}}
   *  * {{organization}}/{{source}}
   *  * {{source}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Security Command Center (SCC) v2 API organizationsource IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_scc_v2_organization_source_iam_member.editor &#34;organizations/{{organization}}/sources/{{source}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_scc_v2_organization_source_iam_binding.editor &#34;organizations/{{organization}}/sources/{{source}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:securitycenter/v2OrganizationSourceIamBinding:V2OrganizationSourceIamBinding editor organizations/{{organization}}/sources/{{source}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def V2OrganizationSourceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBindingArgs.builder
    com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Cloud Security Command Center (Cloud SCC) notification configs. A
   *  notification config is a Cloud SCC resource that contains the
   *  configuration to send notifications for create/update events of
   *  findings, assets and etc.
   *  &gt; **Note:** In order to use Cloud SCC resources, your organization must be enrolled
   *  in [SCC Standard/Premium](https://cloud.google.com/security-command-center/docs/quickstart-security-command-center).
   *  Without doing so, you may run into errors during resource creation.
   * 
   *  To get more information about NotificationConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.notificationConfigs)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs)
   */
  def NotificationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.NotificationConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.NotificationConfigArgs.builder
    com.pulumi.gcp.securitycenter.NotificationConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Cloud Security Command Center&#39;s (Cloud SCC) finding source. A finding
   *  source is an entity or a mechanism that can produce a finding. A source is
   *  like a container of findings that come from the same scanner, logger,
   *  monitor, etc.
   * 
   *  To get more information about Source, see:
   * 
   *  * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.sources)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/security-command-center/docs)
   */
  def SourceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securitycenter.SourceIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securitycenter.SourceIamBindingArgs.builder
    com.pulumi.gcp.securitycenter.SourceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleState.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     *  Structure is documented below.
     * @return builder
     */
    def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder)
    /**
     * @param customOutput Custom output properties.
     *  Structure is documented below.
     * @return builder
     */
    def customOutput(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.builder
      builder.customOutput(args(argsBuilder).build)

    /**
     * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
     *  to true against a resource, a finding is generated.
     *  Structure is documented below.
     * @return builder
     */
    def predicate(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigPredicateArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

    /**
     * @param resourceSelector The resource types that the custom module operates on. Each custom module
     *  can specify up to 5 resource types.
     *  Structure is documented below.
     * @return builder
     */
    def resourceSelector(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs.builder
      builder.resourceSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.SourceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.SourceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.SourceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.SourceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputArgs.Builder)
    /**
     * @param properties A list of custom output properties to add to the finding.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs.Builder]*):
        com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder)
    /**
     * @param customOutput Custom output properties.
     *  Structure is documented below.
     * @return builder
     */
    def customOutput(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.builder
      builder.customOutput(args(argsBuilder).build)

    /**
     * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
     *  to true against a resource, a finding is generated.
     *  Structure is documented below.
     * @return builder
     */
    def predicate(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigPredicateArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

    /**
     * @param resourceSelector The resource types that the custom module operates on. Each custom module
     *  can specify up to 5 resource types.
     *  Structure is documented below.
     * @return builder
     */
    def resourceSelector(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs.builder
      builder.resourceSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.V2FolderNotificationConfigState.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     *  Structure is documented below.
     * @return builder
     */
    def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2FolderNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.V2FolderNotificationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2FolderNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.V2OrganizationNotificationConfigState.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     *  Structure is documented below.
     * @return builder
     */
    def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2OrganizationNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.V2OrganizationNotificationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2OrganizationNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.SourceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.SourceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.SourceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.SourceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.Builder)
    /**
     * @param customOutput Custom output properties.
     *  Structure is documented below.
     * @return builder
     */
    def customOutput(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputArgs.builder
      builder.customOutput(args(argsBuilder).build)

    /**
     * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
     *  to true against a resource, a finding is generated.
     *  Structure is documented below.
     * @return builder
     */
    def predicate(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigPredicateArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

    /**
     * @param resourceSelector The resource types that the custom module operates on. Each custom module
     *  can specify up to 5 resource types.
     *  Structure is documented below.
     * @return builder
     */
    def resourceSelector(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigResourceSelectorArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigResourceSelectorArgs.builder
      builder.resourceSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder)
    /**
     * @param valueExpression The CEL expression for the custom output. A resource property can be specified
     *  to return the value of the property or a text string enclosed in quotation marks.
     *  Structure is documented below.
     * @return builder
     */
    def valueExpression(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.builder
      builder.valueExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ProjectNotificationConfigState.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     *  Structure is documented below.
     * @return builder
     */
    def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ProjectNotificationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputPropertyArgs.Builder)
    /**
     * @param valueExpression The CEL expression for the custom output. A resource property can be specified
     *  to return the value of the property or a text string enclosed in quotation marks.
     *  Structure is documented below.
     * @return builder
     */
    def valueExpression(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputPropertyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.builder
      builder.valueExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleState.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     *  Structure is documented below.
     * @return builder
     */
    def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder)
    /**
     * @param customOutput Custom output properties.
     *  Structure is documented below.
     * @return builder
     */
    def customOutput(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.builder
      builder.customOutput(args(argsBuilder).build)

    /**
     * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
     *  to true against a resource, a finding is generated.
     *  Structure is documented below.
     * @return builder
     */
    def predicate(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigPredicateArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

    /**
     * @param resourceSelector The resource types that the custom module operates on. Each custom module
     *  can specify up to 5 resource types.
     *  Structure is documented below.
     * @return builder
     */
    def resourceSelector(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs.builder
      builder.resourceSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder)
    /**
     * @param valueExpression The CEL expression for the custom output. A resource property can be specified
     *  to return the value of the property or a text string enclosed in quotation marks.
     *  Structure is documented below.
     * @return builder
     */
    def valueExpression(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.builder
      builder.valueExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleState.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     *  Structure is documented below.
     * @return builder
     */
    def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputPropertyArgs.Builder)
    /**
     * @param valueExpression The CEL expression for the custom output. A resource property can be specified
     *  to return the value of the property or a text string enclosed in quotation marks.
     *  Structure is documented below.
     * @return builder
     */
    def valueExpression(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputPropertyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.builder
      builder.valueExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder)
    /**
     * @param valueExpression The CEL expression for the custom output. A resource property can be specified
     *  to return the value of the property or a text string enclosed in quotation marks.
     *  Structure is documented below.
     * @return builder
     */
    def valueExpression(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.builder
      builder.valueExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder)
    /**
     * @param properties A list of custom output properties to add to the finding.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder]*):
        com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder)
    /**
     * @param properties A list of custom output properties to add to the finding.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder]*):
        com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigState.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     *  Structure is documented below.
     * @return builder
     */
    def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs.Builder)
    /**
     * @param valueExpression The CEL expression for the custom output. A resource property can be specified
     *  to return the value of the property or a text string enclosed in quotation marks.
     *  Structure is documented below.
     * @return builder
     */
    def valueExpression(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.builder
      builder.valueExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.FolderNotificationConfigState.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     *  Structure is documented below.
     * @return builder
     */
    def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.FolderNotificationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.NotificationConfigState.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     *  Structure is documented below.
     * @return builder
     */
    def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.NotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.NotificationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.NotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputArgs.Builder)
    /**
     * @param properties A list of custom output properties to add to the finding.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputPropertyArgs.Builder]*):
        com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.Builder)
    /**
     * @param customOutput Custom output properties.
     *  Structure is documented below.
     * @return builder
     */
    def customOutput(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputArgs.builder
      builder.customOutput(args(argsBuilder).build)

    /**
     * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
     *  to true against a resource, a finding is generated.
     *  Structure is documented below.
     * @return builder
     */
    def predicate(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigPredicateArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

    /**
     * @param resourceSelector The resource types that the custom module operates on. Each custom module
     *  can specify up to 5 resource types.
     *  Structure is documented below.
     * @return builder
     */
    def resourceSelector(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigResourceSelectorArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigResourceSelectorArgs.builder
      builder.resourceSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleState.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     *  Structure is documented below.
     * @return builder
     */
    def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.InstanceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.InstanceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder)
    /**
     * @param properties A list of custom output properties to add to the finding.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder]*):
        com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputArgs.Builder)
    /**
     * @param properties A list of custom output properties to add to the finding.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputPropertyArgs.Builder]*):
        com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleState.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     *  Structure is documented below.
     * @return builder
     */
    def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleState.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     *  Structure is documented below.
     * @return builder
     */
    def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.Builder)
    /**
     * @param customOutput Custom output properties.
     *  Structure is documented below.
     * @return builder
     */
    def customOutput(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputArgs.builder
      builder.customOutput(args(argsBuilder).build)

    /**
     * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
     *  to true against a resource, a finding is generated.
     *  Structure is documented below.
     * @return builder
     */
    def predicate(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigPredicateArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

    /**
     * @param resourceSelector The resource types that the custom module operates on. Each custom module
     *  can specify up to 5 resource types.
     *  Structure is documented below.
     * @return builder
     */
    def resourceSelector(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigResourceSelectorArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigResourceSelectorArgs.builder
      builder.resourceSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.InstanceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.InstanceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
