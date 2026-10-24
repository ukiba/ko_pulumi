package jp.ukiba.ko_pulumi
package aws

object ssmincidents_ext:
  extension (builder: com.pulumi.aws.ssmincidents.ReplicationSetArgs.Builder)
    /**
     * @param region The replication set&#39;s Regions. Use `regions` instead.
     * @return builder
     * @deprecated region is deprecated. Use regions instead.
     */
    @deprecated("region is deprecated. Use regions instead.") inline def region(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.Builder]*):
        com.pulumi.aws.ssmincidents.ReplicationSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.builder
      builder.region(args.map(_(argsBuilder).build)*)

    /**
     * @param regions The replication set&#39;s Regions.
     * @return builder
     */
    inline def regions(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.Builder]*):
        com.pulumi.aws.ssmincidents.ReplicationSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.builder
      builder.regions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmincidents.ResponsePlanArgs.Builder)
    /**
     * @param action The actions that the response plan starts at the beginning of an incident.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionArgs.Builder]):
        com.pulumi.aws.ssmincidents.ResponsePlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param incidentTemplate The `incidentTemplate` configuration block is required and supports the following arguments:
     * @return builder
     */
    inline def incidentTemplate(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateArgs.Builder]):
        com.pulumi.aws.ssmincidents.ResponsePlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateArgs.builder
      builder.incidentTemplate(args(argsBuilder).build)

    /**
     * @param integration Information about third-party services integrated into the response plan. The following values are supported:
     * @return builder
     */
    inline def integration(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationArgs.Builder]):
        com.pulumi.aws.ssmincidents.ResponsePlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationArgs.builder
      builder.integration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssmincidents.inputs.ReplicationSetState.Builder)
    /**
     * @param region The replication set&#39;s Regions. Use `regions` instead.
     * @return builder
     * @deprecated region is deprecated. Use regions instead.
     */
    @deprecated("region is deprecated. Use regions instead.") inline def region(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.Builder]*):
        com.pulumi.aws.ssmincidents.inputs.ReplicationSetState.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.builder
      builder.region(args.map(_(argsBuilder).build)*)

    /**
     * @param regions The replication set&#39;s Regions.
     * @return builder
     */
    inline def regions(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.Builder]*):
        com.pulumi.aws.ssmincidents.inputs.ReplicationSetState.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.builder
      builder.regions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionArgs.Builder)
    /**
     * @param ssmAutomations The Systems Manager automation document to start as the runbook at the beginning of the incident. The following values are supported:
     * @return builder
     */
    inline def ssmAutomations(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionSsmAutomationArgs.Builder]*):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionSsmAutomationArgs.builder
      builder.ssmAutomations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionSsmAutomationArgs.Builder)
    /**
     * @param parameters The key-value pair parameters to use when the automation document runs. The following values are supported:
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionSsmAutomationParameterArgs.Builder]*):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionSsmAutomationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionSsmAutomationParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateArgs.Builder)
    /**
     * @param notificationTargets The Amazon Simple Notification Service (Amazon SNS) targets that this incident notifies when it is updated. The `notificationTarget` configuration block supports the following argument:
     * @return builder
     */
    inline def notificationTargets(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateNotificationTargetArgs.Builder]*):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateNotificationTargetArgs.builder
      builder.notificationTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationArgs.Builder)
    /**
     * @param pagerduties Details about the PagerDuty configuration for a response plan. The following values are supported:
     * @return builder
     */
    inline def pagerduties(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationPagerdutyArgs.Builder]*):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationPagerdutyArgs.builder
      builder.pagerduties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmincidents.inputs.ResponsePlanState.Builder)
    /**
     * @param action The actions that the response plan starts at the beginning of an incident.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionArgs.Builder]):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanState.Builder =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param incidentTemplate The `incidentTemplate` configuration block is required and supports the following arguments:
     * @return builder
     */
    inline def incidentTemplate(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateArgs.Builder]):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanState.Builder =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateArgs.builder
      builder.incidentTemplate(args(argsBuilder).build)

    /**
     * @param integration Information about third-party services integrated into the response plan. The following values are supported:
     * @return builder
     */
    inline def integration(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationArgs.Builder]):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanState.Builder =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationArgs.builder
      builder.integration(args(argsBuilder).build)
