package jp.ukiba.ko_pulumi
package gcp

object securitycenter_ext:
  extension (builder: com.pulumi.gcp.securitycenter.FolderCustomModuleArgs.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     * Structure is documented below.
     * @return builder
     */
    inline def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.FolderCustomModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.FolderNotificationConfigArgs.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     * Structure is documented below.
     * @return builder
     */
    inline def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.FolderNotificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.InstanceIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.InstanceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.InstanceIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.InstanceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.ManagementFolderSecurityHealthAnalyticsCustomModuleArgs.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     * Structure is documented below.
     * @return builder
     */
    inline def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.ManagementFolderSecurityHealthAnalyticsCustomModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.ManagementOrganizationSecurityHealthAnalyticsCustomModuleArgs.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     * Structure is documented below.
     * @return builder
     */
    inline def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.ManagementOrganizationSecurityHealthAnalyticsCustomModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.ManagementProjectSecurityHealthAnalyticsCustomModuleArgs.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     * Structure is documented below.
     * @return builder
     */
    inline def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.ManagementProjectSecurityHealthAnalyticsCustomModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.NotificationConfigArgs.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     * Structure is documented below.
     * @return builder
     */
    inline def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.NotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.NotificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.NotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.OrganizationCustomModuleArgs.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     * Structure is documented below.
     * @return builder
     */
    inline def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.OrganizationCustomModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.ProjectCustomModuleArgs.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     * Structure is documented below.
     * @return builder
     */
    inline def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.ProjectCustomModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.ProjectNotificationConfigArgs.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     * Structure is documented below.
     * @return builder
     */
    inline def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.ProjectNotificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.SourceIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.SourceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.SourceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.SourceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.SourceIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.SourceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.SourceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.SourceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.V2FolderNotificationConfigArgs.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     * Structure is documented below.
     * @return builder
     */
    inline def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2FolderNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.V2FolderNotificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2FolderNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.V2OrganizationNotificationConfigArgs.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     * Structure is documented below.
     * @return builder
     */
    inline def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2OrganizationNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.V2OrganizationNotificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2OrganizationNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.V2OrganizationSourceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.V2OrganizationSourceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.V2ProjectNotificationConfigArgs.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     * Structure is documented below.
     * @return builder
     */
    inline def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.V2ProjectNotificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.Builder)
    /**
     * @param customOutput Custom output properties.
     * Structure is documented below.
     * @return builder
     */
    inline def customOutput(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputArgs.builder
      builder.customOutput(args(argsBuilder).build)

    /**
     * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
     * to true against a resource, a finding is generated.
     * Structure is documented below.
     * @return builder
     */
    inline def predicate(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigPredicateArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

    /**
     * @param resourceSelector The resource types that the custom module operates on. Each custom module
     * can specify up to 5 resource types.
     * Structure is documented below.
     * @return builder
     */
    inline def resourceSelector(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigResourceSelectorArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigResourceSelectorArgs.builder
      builder.resourceSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputArgs.Builder)
    /**
     * @param properties A list of custom output properties to add to the finding.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputPropertyArgs.Builder]*):
        com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputPropertyArgs.Builder)
    /**
     * @param valueExpression The CEL expression for the custom output. A resource property can be specified
     * to return the value of the property or a text string enclosed in quotation marks.
     * Structure is documented below.
     * @return builder
     */
    inline def valueExpression(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputPropertyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.builder
      builder.valueExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleState.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     * Structure is documented below.
     * @return builder
     */
    inline def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.FolderNotificationConfigState.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     * Structure is documented below.
     * @return builder
     */
    inline def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.FolderNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.FolderNotificationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.FolderNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.InstanceIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.InstanceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.InstanceIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.InstanceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder)
    /**
     * @param customOutput Custom output properties.
     * Structure is documented below.
     * @return builder
     */
    inline def customOutput(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.builder
      builder.customOutput(args(argsBuilder).build)

    /**
     * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
     * to true against a resource, a finding is generated.
     * Structure is documented below.
     * @return builder
     */
    inline def predicate(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigPredicateArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

    /**
     * @param resourceSelector The resource types that the custom module operates on. Each custom module
     * can specify up to 5 resource types.
     * Structure is documented below.
     * @return builder
     */
    inline def resourceSelector(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs.builder
      builder.resourceSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder)
    /**
     * @param properties A list of custom output properties to add to the finding.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder]*):
        com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder)
    /**
     * @param valueExpression The CEL expression for the custom output. A resource property can be specified
     * to return the value of the property or a text string enclosed in quotation marks.
     * Structure is documented below.
     * @return builder
     */
    inline def valueExpression(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.builder
      builder.valueExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleState.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     * Structure is documented below.
     * @return builder
     */
    inline def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder)
    /**
     * @param customOutput Custom output properties.
     * Structure is documented below.
     * @return builder
     */
    inline def customOutput(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.builder
      builder.customOutput(args(argsBuilder).build)

    /**
     * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
     * to true against a resource, a finding is generated.
     * Structure is documented below.
     * @return builder
     */
    inline def predicate(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigPredicateArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

    /**
     * @param resourceSelector The resource types that the custom module operates on. Each custom module
     * can specify up to 5 resource types.
     * Structure is documented below.
     * @return builder
     */
    inline def resourceSelector(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs.builder
      builder.resourceSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder)
    /**
     * @param properties A list of custom output properties to add to the finding.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder]*):
        com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder)
    /**
     * @param valueExpression The CEL expression for the custom output. A resource property can be specified
     * to return the value of the property or a text string enclosed in quotation marks.
     * Structure is documented below.
     * @return builder
     */
    inline def valueExpression(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.builder
      builder.valueExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleState.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     * Structure is documented below.
     * @return builder
     */
    inline def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder)
    /**
     * @param customOutput Custom output properties.
     * Structure is documented below.
     * @return builder
     */
    inline def customOutput(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.builder
      builder.customOutput(args(argsBuilder).build)

    /**
     * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
     * to true against a resource, a finding is generated.
     * Structure is documented below.
     * @return builder
     */
    inline def predicate(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigPredicateArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

    /**
     * @param resourceSelector The resource types that the custom module operates on. Each custom module
     * can specify up to 5 resource types.
     * Structure is documented below.
     * @return builder
     */
    inline def resourceSelector(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs.builder
      builder.resourceSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder)
    /**
     * @param properties A list of custom output properties to add to the finding.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder]*):
        com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder)
    /**
     * @param valueExpression The CEL expression for the custom output. A resource property can be specified
     * to return the value of the property or a text string enclosed in quotation marks.
     * Structure is documented below.
     * @return builder
     */
    inline def valueExpression(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.builder
      builder.valueExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleState.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     * Structure is documented below.
     * @return builder
     */
    inline def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ManagementProjectSecurityHealthAnalyticsCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.NotificationConfigState.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     * Structure is documented below.
     * @return builder
     */
    inline def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.NotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.NotificationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.NotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.Builder)
    /**
     * @param customOutput Custom output properties.
     * Structure is documented below.
     * @return builder
     */
    inline def customOutput(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputArgs.builder
      builder.customOutput(args(argsBuilder).build)

    /**
     * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
     * to true against a resource, a finding is generated.
     * Structure is documented below.
     * @return builder
     */
    inline def predicate(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigPredicateArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

    /**
     * @param resourceSelector The resource types that the custom module operates on. Each custom module
     * can specify up to 5 resource types.
     * Structure is documented below.
     * @return builder
     */
    inline def resourceSelector(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigResourceSelectorArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigResourceSelectorArgs.builder
      builder.resourceSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputArgs.Builder)
    /**
     * @param properties A list of custom output properties to add to the finding.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs.Builder]*):
        com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs.Builder)
    /**
     * @param valueExpression The CEL expression for the custom output. A resource property can be specified
     * to return the value of the property or a text string enclosed in quotation marks.
     * Structure is documented below.
     * @return builder
     */
    inline def valueExpression(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.builder
      builder.valueExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleState.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     * Structure is documented below.
     * @return builder
     */
    inline def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.Builder)
    /**
     * @param customOutput Custom output properties.
     * Structure is documented below.
     * @return builder
     */
    inline def customOutput(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputArgs.builder
      builder.customOutput(args(argsBuilder).build)

    /**
     * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
     * to true against a resource, a finding is generated.
     * Structure is documented below.
     * @return builder
     */
    inline def predicate(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigPredicateArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

    /**
     * @param resourceSelector The resource types that the custom module operates on. Each custom module
     * can specify up to 5 resource types.
     * Structure is documented below.
     * @return builder
     */
    inline def resourceSelector(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigResourceSelectorArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigResourceSelectorArgs.builder
      builder.resourceSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputArgs.Builder)
    /**
     * @param properties A list of custom output properties to add to the finding.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputPropertyArgs.Builder]*):
        com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputPropertyArgs.Builder)
    /**
     * @param valueExpression The CEL expression for the custom output. A resource property can be specified
     * to return the value of the property or a text string enclosed in quotation marks.
     * Structure is documented below.
     * @return builder
     */
    inline def valueExpression(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputPropertyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigCustomOutputPropertyValueExpressionArgs.builder
      builder.valueExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleState.Builder)
    /**
     * @param customConfig The user specified custom configuration for the module.
     * Structure is documented below.
     * @return builder
     */
    inline def customConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectCustomModuleCustomConfigArgs.builder
      builder.customConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.ProjectNotificationConfigState.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     * Structure is documented below.
     * @return builder
     */
    inline def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.ProjectNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.ProjectNotificationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.ProjectNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.SourceIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.SourceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.SourceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.SourceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.SourceIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.SourceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.SourceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.SourceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.V2FolderNotificationConfigState.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     * Structure is documented below.
     * @return builder
     */
    inline def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2FolderNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.V2FolderNotificationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2FolderNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.V2OrganizationNotificationConfigState.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     * Structure is documented below.
     * @return builder
     */
    inline def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2OrganizationNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.V2OrganizationNotificationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2OrganizationNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigState.Builder)
    /**
     * @param streamingConfig The config for triggering streaming-based notifications.
     * Structure is documented below.
     * @return builder
     */
    inline def streamingConfig(args: Endofunction[com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigStreamingConfigArgs.Builder]):
        com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigStreamingConfigArgs.builder
      builder.streamingConfig(args(argsBuilder).build)
