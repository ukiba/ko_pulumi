package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object ssmincidents:
  extension (builder: com.pulumi.aws.ssmincidents.ResponsePlanArgs.Builder)
    /**
     * @param action The actions that the response plan starts at the beginning of an incident.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionArgs.Builder]):
        com.pulumi.aws.ssmincidents.ResponsePlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param incidentTemplate The `incidentTemplate` configuration block is required and supports the following arguments:
     * @return builder
     */
    def incidentTemplate(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateArgs.Builder]):
        com.pulumi.aws.ssmincidents.ResponsePlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateArgs.builder
      builder.incidentTemplate(args(argsBuilder).build)

    /**
     * @param integration Information about third-party services integrated into the response plan. The following values are supported:
     * @return builder
     */
    def integration(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationArgs.Builder]):
        com.pulumi.aws.ssmincidents.ResponsePlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationArgs.builder
      builder.integration(args(argsBuilder).build)

  type SsmincidentsFunctions = com.pulumi.aws.ssmincidents.SsmincidentsFunctions
  object SsmincidentsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ssmincidents.SsmincidentsFunctions.*
  extension (self: SsmincidentsFunctions.type)
    /**
     * &gt; **NOTE:** The AWS Region specified by a provider must always be one of the Regions specified for the replication set.
     *  
     *  Use this data source to manage a replication set in AWS Systems Manager Incident Manager.
     */
    def getReplicationSet(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.GetReplicationSetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssmincidents.outputs.GetReplicationSetResult] =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.GetReplicationSetArgs.builder
      com.pulumi.aws.ssmincidents.SsmincidentsFunctions.getReplicationSet(args(argsBuilder).build)

    /**
     * &gt; **NOTE:** The AWS Region specified by a provider must always be one of the Regions specified for the replication set.
     *  
     *  Use this data source to manage a replication set in AWS Systems Manager Incident Manager.
     */
    def getReplicationSetPlain(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.GetReplicationSetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssmincidents.outputs.GetReplicationSetResult] =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.GetReplicationSetPlainArgs.builder
      com.pulumi.aws.ssmincidents.SsmincidentsFunctions.getReplicationSetPlain(args(argsBuilder).build)

    /** Use this data source to manage a response plan in AWS Systems Manager Incident Manager. */
    def getResponsePlan(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.GetResponsePlanArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssmincidents.outputs.GetResponsePlanResult] =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.GetResponsePlanArgs.builder
      com.pulumi.aws.ssmincidents.SsmincidentsFunctions.getResponsePlan(args(argsBuilder).build)

    /** Use this data source to manage a response plan in AWS Systems Manager Incident Manager. */
    def getResponsePlanPlain(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.GetResponsePlanPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssmincidents.outputs.GetResponsePlanResult] =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.GetResponsePlanPlainArgs.builder
      com.pulumi.aws.ssmincidents.SsmincidentsFunctions.getResponsePlanPlain(args(argsBuilder).build)

  /**
   * Provides a resource for managing a replication set in AWS Systems Manager Incident Manager.
   *  
   *  &gt; **NOTE:** Deleting a replication set also deletes all Incident Manager related data including response plans, incident records, contacts and escalation plans.
   */
  def ReplicationSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssmincidents.ReplicationSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssmincidents.ReplicationSetArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssmincidents.ReplicationSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ssmincidents.ReplicationSetArgs.Builder)
    /**
     * @param region The replication set&#39;s Regions. Use `regions` instead.
     * @return builder
     * @deprecated region is deprecated. Use regions instead.
     */
    @deprecated def region(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.Builder]*):
        com.pulumi.aws.ssmincidents.ReplicationSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.builder
      builder.region(args.map(_(argsBuilder).build)*)

    /**
     * @param regions The replication set&#39;s Regions.
     * @return builder
     */
    def regions(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.Builder]*):
        com.pulumi.aws.ssmincidents.ReplicationSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.builder
      builder.regions(args.map(_(argsBuilder).build)*)

  /**
   * Provides a resource to manage response plans in AWS Systems Manager Incident Manager.
   *  
   *  &gt; NOTE: A response plan implicitly depends on a replication set. If you configured your replication set in Pulumi, we recommend you add it to the `dependsOn` argument for the ResponsePlan Resource.
   */
  def ResponsePlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssmincidents.ResponsePlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssmincidents.ResponsePlanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssmincidents.ResponsePlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionSsmAutomationArgs.Builder)
    /**
     * @param parameters The key-value pair parameters to use when the automation document runs. The following values are supported:
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionSsmAutomationParameterArgs.Builder]*):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionSsmAutomationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionSsmAutomationParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationArgs.Builder)
    /**
     * @param pagerduties Details about the PagerDuty configuration for a response plan. The following values are supported:
     * @return builder
     */
    def pagerduties(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationPagerdutyArgs.Builder]*):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationPagerdutyArgs.builder
      builder.pagerduties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmincidents.inputs.ReplicationSetState.Builder)
    /**
     * @param region The replication set&#39;s Regions. Use `regions` instead.
     * @return builder
     * @deprecated region is deprecated. Use regions instead.
     */
    @deprecated def region(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.Builder]*):
        com.pulumi.aws.ssmincidents.inputs.ReplicationSetState.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.builder
      builder.region(args.map(_(argsBuilder).build)*)

    /**
     * @param regions The replication set&#39;s Regions.
     * @return builder
     */
    def regions(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.Builder]*):
        com.pulumi.aws.ssmincidents.inputs.ReplicationSetState.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs.builder
      builder.regions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmincidents.inputs.ResponsePlanState.Builder)
    /**
     * @param action The actions that the response plan starts at the beginning of an incident.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionArgs.Builder]):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanState.Builder =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param incidentTemplate The `incidentTemplate` configuration block is required and supports the following arguments:
     * @return builder
     */
    def incidentTemplate(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateArgs.Builder]):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanState.Builder =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateArgs.builder
      builder.incidentTemplate(args(argsBuilder).build)

    /**
     * @param integration Information about third-party services integrated into the response plan. The following values are supported:
     * @return builder
     */
    def integration(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationArgs.Builder]):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanState.Builder =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanIntegrationArgs.builder
      builder.integration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionArgs.Builder)
    /**
     * @param ssmAutomations The Systems Manager automation document to start as the runbook at the beginning of the incident. The following values are supported:
     * @return builder
     */
    def ssmAutomations(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionSsmAutomationArgs.Builder]*):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionSsmAutomationArgs.builder
      builder.ssmAutomations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateArgs.Builder)
    /**
     * @param notificationTargets The Amazon Simple Notification Service (Amazon SNS) targets that this incident notifies when it is updated. The `notificationTarget` configuration block supports the following argument:
     * @return builder
     */
    def notificationTargets(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateNotificationTargetArgs.Builder]*):
        com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssmincidents.inputs.ResponsePlanIncidentTemplateNotificationTargetArgs.builder
      builder.notificationTargets(args.map(_(argsBuilder).build)*)
