package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object clouddeploy:
  extension (builder: com.pulumi.gcp.clouddeploy.TargetIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.clouddeploy.TargetIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  def TargetIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.TargetIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.TargetIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.TargetIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  def DeliveryPipelineIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.DeliveryPipelineIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.DeliveryPipelineIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.DeliveryPipelineIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.DeliveryPipelineArgs.Builder)
    /**
     * @param serialPipeline SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
     * @return builder
     */
    def serialPipeline(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineArgs.Builder]):
        com.pulumi.gcp.clouddeploy.DeliveryPipelineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineArgs.builder
      builder.serialPipeline(args(argsBuilder).build)

  def TargetIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.TargetIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.TargetIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.TargetIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.DeployPolicyArgs.Builder)
    /**
     * @param rules Rules to apply. At least one rule must be present.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.DeployPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param selectors Selected resources to which the policy will be applied. At least one selector is required. If one selector matches the resource the policy applies. For example, if there are two selectors and the action being attempted matches one of them, the policy will apply to that action.
     *  Structure is documented below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicySelectorArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.DeployPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicySelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.TargetIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.clouddeploy.TargetIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * An `Automation` enables the automation of manually driven actions for a Delivery Pipeline, which includes Release promotion amongst Targets, Rollout repair and Rollout deployment strategy advancement.
   * 
   *  To get more information about Automation, see:
   * 
   *  * [API documentation](https://cloud.google.com/deploy/docs/api/reference/rest/v1/projects.locations.deliveryPipelines.automations)
   *  * How-to Guides
   *      * [Automate your deployment](https://cloud.google.com/deploy/docs/automation)
   */
  def Automation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.AutomationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.AutomationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.Automation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  def TargetIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.TargetIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.TargetIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.TargetIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  def DeliveryPipelineIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.DeliveryPipelineIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.DeliveryPipelineIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.DeliveryPipelineIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.TargetArgs.Builder)
    /**
     * @param anthosCluster Information specifying an Anthos Cluster.
     * @return builder
     */
    def anthosCluster(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetAnthosClusterArgs.Builder]):
        com.pulumi.gcp.clouddeploy.TargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetAnthosClusterArgs.builder
      builder.anthosCluster(args(argsBuilder).build)

    /**
     * @param associatedEntities Optional. Map of entity IDs to their associated entities. Associated entities allows specifying places other than the deployment target for specific features. For example, the Gateway API canary can be configured to deploy the HTTPRoute to a different cluster(s) than the deployment cluster using associated entities. An entity ID must consist of lower-case letters, numbers, and hyphens, start with a letter and end with a letter or a number, and have a max length of 63 characters. In other words, it must match the following regex: `^a-z?$`.
     * @return builder
     */
    def associatedEntities(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetAssociatedEntityArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.TargetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetAssociatedEntityArgs.builder
      builder.associatedEntities(args.map(_(argsBuilder).build)*)

    /**
     * @param customTarget Optional. Information specifying a Custom Target.
     * @return builder
     */
    def customTarget(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetCustomTargetArgs.Builder]):
        com.pulumi.gcp.clouddeploy.TargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetCustomTargetArgs.builder
      builder.customTarget(args(argsBuilder).build)

    /**
     * @param executionConfigs Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
     * @return builder
     */
    def executionConfigs(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetExecutionConfigArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.TargetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetExecutionConfigArgs.builder
      builder.executionConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param gke Information specifying a GKE Cluster.
     * @return builder
     */
    def gke(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetGkeArgs.Builder]):
        com.pulumi.gcp.clouddeploy.TargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetGkeArgs.builder
      builder.gke(args(argsBuilder).build)

    /**
     * @param multiTarget Information specifying a multiTarget.
     * @return builder
     */
    def multiTarget(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetMultiTargetArgs.Builder]):
        com.pulumi.gcp.clouddeploy.TargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetMultiTargetArgs.builder
      builder.multiTarget(args(argsBuilder).build)

    /**
     * @param run Information specifying a Cloud Run deployment target.
     * @return builder
     */
    def run(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetRunArgs.Builder]):
        com.pulumi.gcp.clouddeploy.TargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetRunArgs.builder
      builder.run(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.DeliveryPipelineIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.clouddeploy.DeliveryPipelineIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  def DeliveryPipelineIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.DeliveryPipelineIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.DeliveryPipelineIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.DeliveryPipelineIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.CustomTargetTypeIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.clouddeploy.CustomTargetTypeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A Cloud Deploy `CustomTargetType` defines a type of custom target that can be referenced in a
   *  Cloud Deploy `Target` in order to facilitate deploying to other systems besides the supported runtimes.
   * 
   *  To get more information about CustomTargetType, see:
   * 
   *  * [API documentation](https://cloud.google.com/deploy/docs/api/reference/rest/v1/projects.locations.customTargetTypes)
   *  * How-to Guides
   *      * [Define and use a custom target type](https://cloud.google.com/deploy/docs/deploy-app-custom-target)
   */
  def CustomTargetType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.CustomTargetTypeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.CustomTargetTypeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.CustomTargetType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  def CustomTargetTypeIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.CustomTargetTypeIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.CustomTargetTypeIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.CustomTargetTypeIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.DeliveryPipelineIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.clouddeploy.DeliveryPipelineIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  type ClouddeployFunctions = com.pulumi.gcp.clouddeploy.ClouddeployFunctions
  object ClouddeployFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.clouddeploy.ClouddeployFunctions.*
  extension (self: ClouddeployFunctions.type)
    /** Retrieves the current IAM policy data for customtargettype */
    def getCustomTargetTypeIamPolicy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.GetCustomTargetTypeIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.clouddeploy.outputs.GetCustomTargetTypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.GetCustomTargetTypeIamPolicyArgs.builder
      com.pulumi.gcp.clouddeploy.ClouddeployFunctions.getCustomTargetTypeIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for customtargettype */
    def getCustomTargetTypeIamPolicyPlain(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.GetCustomTargetTypeIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.clouddeploy.outputs.GetCustomTargetTypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.GetCustomTargetTypeIamPolicyPlainArgs.builder
      com.pulumi.gcp.clouddeploy.ClouddeployFunctions.getCustomTargetTypeIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for deliverypipeline */
    def getDeliveryPipelineIamPolicy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.GetDeliveryPipelineIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.clouddeploy.outputs.GetDeliveryPipelineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.GetDeliveryPipelineIamPolicyArgs.builder
      com.pulumi.gcp.clouddeploy.ClouddeployFunctions.getDeliveryPipelineIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for deliverypipeline */
    def getDeliveryPipelineIamPolicyPlain(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.GetDeliveryPipelineIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.clouddeploy.outputs.GetDeliveryPipelineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.GetDeliveryPipelineIamPolicyPlainArgs.builder
      com.pulumi.gcp.clouddeploy.ClouddeployFunctions.getDeliveryPipelineIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for target */
    def getTargetIamPolicy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.GetTargetIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.clouddeploy.outputs.GetTargetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.GetTargetIamPolicyArgs.builder
      com.pulumi.gcp.clouddeploy.ClouddeployFunctions.getTargetIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for target */
    def getTargetIamPolicyPlain(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.GetTargetIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.clouddeploy.outputs.GetTargetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.GetTargetIamPolicyPlainArgs.builder
      com.pulumi.gcp.clouddeploy.ClouddeployFunctions.getTargetIamPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.CustomTargetTypeArgs.Builder)
    /**
     * @param customActions Configures render and deploy for the `CustomTargetType` using Skaffold custom actions.
     *  Structure is documented below.
     * @return builder
     */
    def customActions(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsArgs.Builder]):
        com.pulumi.gcp.clouddeploy.CustomTargetTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsArgs.builder
      builder.customActions(args(argsBuilder).build)

    /**
     * @param tasks Configures render and deploy for the `CustomTargetType` using tasks.
     *  Structure is documented below.
     * @return builder
     */
    def tasks(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksArgs.Builder]):
        com.pulumi.gcp.clouddeploy.CustomTargetTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksArgs.builder
      builder.tasks(args(argsBuilder).build)

  /**
   * A `DeployPolicy` inhibits manual or DeployPolicy-driven actions within a Delivery Pipeline or Target.
   * 
   *  To get more information about DeployPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/deploy/docs/api/reference/rest/v1/projects.locations.deployPolicies)
   *  * How-to Guides
   *      * [Restrict deploy behavior using policies](https://cloud.google.com/deploy/docs/deploy-policy)
   */
  def DeployPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.DeployPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.DeployPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.DeployPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** The Cloud Deploy `Target` resource */
  def Target(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.TargetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.TargetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.Target(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.AutomationArgs.Builder)
    /**
     * @param rules Required. List of Automation rules associated with the Automation resource. Must have at least one rule and limited to 250 rules per Delivery Pipeline. Note: the order of the rules here is not the same as the order of execution.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.AutomationRuleArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.AutomationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.AutomationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param selector Required. Selected resources to which the automation will be applied.
     *  Structure is documented below.
     * @return builder
     */
    def selector(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.AutomationSelectorArgs.Builder]):
        com.pulumi.gcp.clouddeploy.AutomationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.AutomationSelectorArgs.builder
      builder.selector(args(argsBuilder).build)

  def CustomTargetTypeIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.CustomTargetTypeIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.CustomTargetTypeIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.CustomTargetTypeIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.CustomTargetTypeIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.clouddeploy.CustomTargetTypeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  def CustomTargetTypeIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.CustomTargetTypeIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.CustomTargetTypeIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.CustomTargetTypeIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs.Builder)
    /**
     * @param analysis Optional. Configuration for the analysis job.
     * @return builder
     */
    def analysis(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

    /**
     * @param postdeploy Optional. Configuration for the postdeploy job of the last phase. If this is not configured, postdeploy job will not be present.
     * @return builder
     */
    def postdeploy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs.builder
      builder.postdeploy(args(argsBuilder).build)

    /**
     * @param predeploy Optional. Configuration for the predeploy job of the first phase. If this is not configured, predeploy job will not be present.
     * @return builder
     */
    def predeploy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPredeployArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPredeployArgs.builder
      builder.predeploy(args(argsBuilder).build)

    /**
     * @param verifyConfig Optional. Configuration for the verify job.
     * @return builder
     */
    def verifyConfig(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentVerifyConfigArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentVerifyConfigArgs.builder
      builder.verifyConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs.Builder)
    /**
     * @param gatewayServiceMesh Kubernetes Gateway API service mesh configuration.
     * @return builder
     */
    def gatewayServiceMesh(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshArgs.builder
      builder.gatewayServiceMesh(args(argsBuilder).build)

    /**
     * @param serviceNetworking Kubernetes Service networking configuration.
     * @return builder
     */
    def serviceNetworking(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesServiceNetworkingArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesServiceNetworkingArgs.builder
      builder.serviceNetworking(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPostdeployArgs.Builder)
    /**
     * @param tasks Optional. The tasks that will run as a part of the postdeploy job. Only one of `actions` or `tasks` can be specified.
     * @return builder
     */
    def tasks(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPostdeployTaskArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPostdeployArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPostdeployTaskArgs.builder
      builder.tasks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigArgs.Builder)
    /**
     * @param analysis Optional. Configuration for the analysis job.
     * @return builder
     */
    def analysis(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

    /**
     * @param postdeploy Optional. Configuration for the postdeploy job of this phase. If this is not configured, postdeploy job will not be present for this phase.
     * @return builder
     */
    def postdeploy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPostdeployArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPostdeployArgs.builder
      builder.postdeploy(args(argsBuilder).build)

    /**
     * @param predeploy Optional. Configuration for the predeploy job of this phase. If this is not configured, predeploy job will not be present for this phase.
     * @return builder
     */
    def predeploy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPredeployArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPredeployArgs.builder
      builder.predeploy(args(argsBuilder).build)

    /**
     * @param verifyConfig Optional. Configuration for the verify job.
     * @return builder
     */
    def verifyConfig(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigVerifyConfigArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigVerifyConfigArgs.builder
      builder.verifyConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisGoogleCloudArgs.Builder)
    /**
     * @param alertPolicyChecks Optional. A list of Cloud Monitoring Alert Policy checks to perform as part of the analysis.
     * @return builder
     */
    def alertPolicyChecks(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisGoogleCloudAlertPolicyCheckArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisGoogleCloudArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisGoogleCloudAlertPolicyCheckArgs.builder
      builder.alertPolicyChecks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisCustomCheckArgs.Builder)
    /**
     * @param task Required. The Task to be run for this custom check.
     * @return builder
     */
    def task(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisCustomCheckTaskArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisCustomCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisCustomCheckTaskArgs.builder
      builder.task(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardVerifyConfigTaskArgs.Builder)
    /**
     * @param container Optional. This task is represented by a container that is executed in the Cloud Build execution environment.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardVerifyConfigTaskContainerArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardVerifyConfigTaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardVerifyConfigTaskContainerArgs.builder
      builder.container(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisArgs.Builder)
    /**
     * @param customChecks Optional. Custom analysis checks from 3P metric providers.
     * @return builder
     */
    def customChecks(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisCustomCheckArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisCustomCheckArgs.builder
      builder.customChecks(args.map(_(argsBuilder).build)*)

    /**
     * @param googleCloud Optional. Google Cloud - based analysis checks.
     * @return builder
     */
    def googleCloud(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisGoogleCloudArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisGoogleCloudArgs.builder
      builder.googleCloud(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs.Builder)
    /**
     * @param endDate End date.
     *  Structure is documented below.
     * @return builder
     */
    def endDate(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndDateArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndDateArgs.builder
      builder.endDate(args(argsBuilder).build)

    /**
     * @param endTime End time (exclusive). You may use 24:00 for the end of the day.
     *  Structure is documented below.
     * @return builder
     */
    def endTime(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndTimeArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndTimeArgs.builder
      builder.endTime(args(argsBuilder).build)

    /**
     * @param startDate Start date.
     *  Structure is documented below.
     * @return builder
     */
    def startDate(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartDateArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartDateArgs.builder
      builder.startDate(args(argsBuilder).build)

    /**
     * @param startTime Start time (inclusive). Use 00:00 for the beginning of the day.
     *  Structure is documented below.
     * @return builder
     */
    def startTime(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartTimeArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisArgs.Builder)
    /**
     * @param customChecks Optional. Custom analysis checks from 3P metric providers.
     * @return builder
     */
    def customChecks(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisCustomCheckArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisCustomCheckArgs.builder
      builder.customChecks(args.map(_(argsBuilder).build)*)

    /**
     * @param googleCloud Optional. Google Cloud - based analysis checks.
     * @return builder
     */
    def googleCloud(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisGoogleCloudArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisGoogleCloudArgs.builder
      builder.googleCloud(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineArgs.Builder)
    /**
     * @param stages Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
     * @return builder
     */
    def stages(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleArgs.Builder)
    /**
     * @param rolloutRestriction Rollout restrictions.
     *  Structure is documented below.
     * @return builder
     */
    def rolloutRestriction(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionArgs.builder
      builder.rolloutRestriction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisArgs.Builder)
    /**
     * @param customChecks Optional. Custom analysis checks from 3P metric providers.
     * @return builder
     */
    def customChecks(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisCustomCheckArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisCustomCheckArgs.builder
      builder.customChecks(args.map(_(argsBuilder).build)*)

    /**
     * @param googleCloud Optional. Google Cloud - based analysis checks.
     * @return builder
     */
    def googleCloud(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisGoogleCloudArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisGoogleCloudArgs.builder
      builder.googleCloud(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksArgs.Builder)
    /**
     * @param deploy The task responsible for deploy operations.
     *  Structure is documented below.
     * @return builder
     */
    def deploy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksDeployArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksDeployArgs.builder
      builder.deploy(args(argsBuilder).build)

    /**
     * @param render The task responsible for render operations. If not provided then Cloud Deploy will perform its default rendering operation.
     *  Structure is documented below.
     * @return builder
     */
    def render(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksRenderArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksRenderArgs.builder
      builder.render(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardArgs.Builder)
    /**
     * @param analysis Optional. Configuration for the analysis job.
     * @return builder
     */
    def analysis(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

    /**
     * @param postdeploy Optional. Configuration for the postdeploy job. If this is not configured, postdeploy job will not be present.
     * @return builder
     */
    def postdeploy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPostdeployArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPostdeployArgs.builder
      builder.postdeploy(args(argsBuilder).build)

    /**
     * @param predeploy Optional. Configuration for the predeploy job. If this is not configured, predeploy job will not be present.
     * @return builder
     */
    def predeploy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs.builder
      builder.predeploy(args(argsBuilder).build)

    /**
     * @param verifyConfig Optional. Configuration for the verify job.
     * @return builder
     */
    def verifyConfig(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardVerifyConfigArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardVerifyConfigArgs.builder
      builder.verifyConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineState.Builder)
    /**
     * @param conditions Output only. Information around the state of the Delivery Pipeline.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineState.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param serialPipeline SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
     * @return builder
     */
    def serialPipeline(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineArgs.builder
      builder.serialPipeline(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigArgs.Builder)
    /**
     * @param cloudRun Cloud Run runtime configuration.
     * @return builder
     */
    def cloudRun(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigCloudRunArgs.builder
      builder.cloudRun(args(argsBuilder).build)

    /**
     * @param kubernetes Kubernetes runtime configuration.
     * @return builder
     */
    def kubernetes(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs.builder
      builder.kubernetes(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeployPolicySelectorArgs.Builder)
    /**
     * @param deliveryPipeline Contains attributes about a delivery pipeline.
     *  Structure is documented below.
     * @return builder
     */
    def deliveryPipeline(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicySelectorDeliveryPipelineArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicySelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicySelectorDeliveryPipelineArgs.builder
      builder.deliveryPipeline(args(argsBuilder).build)

    /**
     * @param target Contains attributes about a target.
     *  Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicySelectorTargetArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicySelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicySelectorTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsArgs.Builder)
    /**
     * @param includeSkaffoldModules List of Skaffold modules Cloud Deploy will include in the Skaffold Config as required before performing diagnose.
     *  Structure is documented below.
     * @return builder
     */
    def includeSkaffoldModules(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsIncludeSkaffoldModuleArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsIncludeSkaffoldModuleArgs.builder
      builder.includeSkaffoldModules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeployPolicyState.Builder)
    /**
     * @param rules Rules to apply. At least one rule must be present.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param selectors Selected resources to which the policy will be applied. At least one selector is required. If one selector matches the resource the policy applies. For example, if there are two selectors and the action being attempted matches one of them, the policy will apply to that action.
     *  Structure is documented below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicySelectorArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicySelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs.Builder)
    /**
     * @param tasks Optional. The tasks that will run as a part of the predeploy job. Only one of `actions` or `tasks` can be specified.
     * @return builder
     */
    def tasks(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPredeployTaskArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPredeployArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPredeployTaskArgs.builder
      builder.tasks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentArgs.Builder)
    /**
     * @param phaseConfigs Required. Configuration for each phase in the canary deployment in the order executed.
     * @return builder
     */
    def phaseConfigs(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigArgs.builder
      builder.phaseConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.AutomationRuleRepairRolloutRuleRepairPhaseArgs.Builder)
    /**
     * @param retry Optional. Retries a failed job.
     *  Structure is documented below.
     * @return builder
     */
    def retry(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.AutomationRuleRepairRolloutRuleRepairPhaseRetryArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.AutomationRuleRepairRolloutRuleRepairPhaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.AutomationRuleRepairRolloutRuleRepairPhaseRetryArgs.builder
      builder.retry(args(argsBuilder).build)

    /**
     * @param rollback Optional. Rolls back a Rollout.
     *  Structure is documented below.
     * @return builder
     */
    def rollback(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.AutomationRuleRepairRolloutRuleRepairPhaseRollbackArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.AutomationRuleRepairRolloutRuleRepairPhaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.AutomationRuleRepairRolloutRuleRepairPhaseRollbackArgs.builder
      builder.rollback(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeState.Builder)
    /**
     * @param customActions Configures render and deploy for the `CustomTargetType` using Skaffold custom actions.
     *  Structure is documented below.
     * @return builder
     */
    def customActions(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsArgs.builder
      builder.customActions(args(argsBuilder).build)

    /**
     * @param tasks Configures render and deploy for the `CustomTargetType` using tasks.
     *  Structure is documented below.
     * @return builder
     */
    def tasks(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksArgs.builder
      builder.tasks(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryArgs.Builder)
    /**
     * @param canaryDeployment Configures the progressive based deployment for a Target.
     * @return builder
     */
    def canaryDeployment(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs.builder
      builder.canaryDeployment(args(argsBuilder).build)

    /**
     * @param customCanaryDeployment Configures the progressive based deployment for a Target, but allows customizing at the phase level where a phase represents each of the percentage deployments.
     * @return builder
     */
    def customCanaryDeployment(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentArgs.builder
      builder.customCanaryDeployment(args(argsBuilder).build)

    /**
     * @param runtimeConfig Optional. Runtime specific configurations for the deployment strategy. The runtime configuration is used to determine how Cloud Deploy will split traffic to enable a progressive deployment.
     * @return builder
     */
    def runtimeConfig(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigArgs.builder
      builder.runtimeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.TargetExecutionConfigArgs.Builder)
    /**
     * @param defaultPool Optional. Use default Cloud Build pool.
     * @return builder
     */
    def defaultPool(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetExecutionConfigDefaultPoolArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.TargetExecutionConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetExecutionConfigDefaultPoolArgs.builder
      builder.defaultPool(args(argsBuilder).build)

    /**
     * @param privatePool Optional. Use private Cloud Build pool.
     * @return builder
     */
    def privatePool(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetExecutionConfigPrivatePoolArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.TargetExecutionConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetExecutionConfigPrivatePoolArgs.builder
      builder.privatePool(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPostdeployTaskArgs.Builder)
    /**
     * @param container Optional. This task is represented by a container that is executed in the Cloud Build execution environment.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPostdeployTaskContainerArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPostdeployTaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPostdeployTaskContainerArgs.builder
      builder.container(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksDeployArgs.Builder)
    /**
     * @param container This task is represented by a container that is executed in the Cloud Build execution environment.
     *  Structure is documented below.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksDeployContainerArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksDeployArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksDeployContainerArgs.builder
      builder.container(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsArgs.Builder)
    /**
     * @param oneTimeWindows One-time windows within which actions are restricted.
     *  Structure is documented below.
     * @return builder
     */
    def oneTimeWindows(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs.builder
      builder.oneTimeWindows(args.map(_(argsBuilder).build)*)

    /**
     * @param weeklyWindows Recurring weekly windows within which actions are restricted.
     *  Structure is documented below.
     * @return builder
     */
    def weeklyWindows(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowArgs.builder
      builder.weeklyWindows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardVerifyConfigArgs.Builder)
    /**
     * @param tasks Optional. The tasks that will run as a part of the verify job. The tasks are executed sequentially in the order specified.
     * @return builder
     */
    def tasks(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardVerifyConfigTaskArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardVerifyConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardVerifyConfigTaskArgs.builder
      builder.tasks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.AutomationState.Builder)
    /**
     * @param rules Required. List of Automation rules associated with the Automation resource. Must have at least one rule and limited to 250 rules per Delivery Pipeline. Note: the order of the rules here is not the same as the order of execution.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.AutomationRuleArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.AutomationState.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.AutomationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param selector Required. Selected resources to which the automation will be applied.
     *  Structure is documented below.
     * @return builder
     */
    def selector(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.AutomationSelectorArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.AutomationState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.AutomationSelectorArgs.builder
      builder.selector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionArgs.Builder)
    /**
     * @param pipelineReadyConditions Details around the Pipeline&#39;s overall status.
     * @return builder
     */
    def pipelineReadyConditions(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionPipelineReadyConditionArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionPipelineReadyConditionArgs.builder
      builder.pipelineReadyConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param targetsPresentConditions Details around targets enumerated in the pipeline.
     * @return builder
     */
    def targetsPresentConditions(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionTargetsPresentConditionArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionTargetsPresentConditionArgs.builder
      builder.targetsPresentConditions(args.map(_(argsBuilder).build)*)

    /**
     * @param targetsTypeConditions Details on the whether the targets enumerated in the pipeline are of the same type.
     * @return builder
     */
    def targetsTypeConditions(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionTargetsTypeConditionArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineConditionTargetsTypeConditionArgs.builder
      builder.targetsTypeConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.TargetIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.TargetIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigVerifyConfigTaskArgs.Builder)
    /**
     * @param container Optional. This task is represented by a container that is executed in the Cloud Build execution environment.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigVerifyConfigTaskContainerArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigVerifyConfigTaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigVerifyConfigTaskContainerArgs.builder
      builder.container(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.TargetState.Builder)
    /**
     * @param anthosCluster Information specifying an Anthos Cluster.
     * @return builder
     */
    def anthosCluster(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetAnthosClusterArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.TargetState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetAnthosClusterArgs.builder
      builder.anthosCluster(args(argsBuilder).build)

    /**
     * @param associatedEntities Optional. Map of entity IDs to their associated entities. Associated entities allows specifying places other than the deployment target for specific features. For example, the Gateway API canary can be configured to deploy the HTTPRoute to a different cluster(s) than the deployment cluster using associated entities. An entity ID must consist of lower-case letters, numbers, and hyphens, start with a letter and end with a letter or a number, and have a max length of 63 characters. In other words, it must match the following regex: `^a-z?$`.
     * @return builder
     */
    def associatedEntities(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetAssociatedEntityArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.TargetState.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetAssociatedEntityArgs.builder
      builder.associatedEntities(args.map(_(argsBuilder).build)*)

    /**
     * @param customTarget Optional. Information specifying a Custom Target.
     * @return builder
     */
    def customTarget(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetCustomTargetArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.TargetState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetCustomTargetArgs.builder
      builder.customTarget(args(argsBuilder).build)

    /**
     * @param executionConfigs Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
     * @return builder
     */
    def executionConfigs(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetExecutionConfigArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.TargetState.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetExecutionConfigArgs.builder
      builder.executionConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param gke Information specifying a GKE Cluster.
     * @return builder
     */
    def gke(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetGkeArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.TargetState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetGkeArgs.builder
      builder.gke(args(argsBuilder).build)

    /**
     * @param multiTarget Information specifying a multiTarget.
     * @return builder
     */
    def multiTarget(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetMultiTargetArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.TargetState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetMultiTargetArgs.builder
      builder.multiTarget(args(argsBuilder).build)

    /**
     * @param run Information specifying a Cloud Run deployment target.
     * @return builder
     */
    def run(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetRunArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.TargetState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetRunArgs.builder
      builder.run(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.AutomationSelectorArgs.Builder)
    /**
     * @param targets Contains attributes about a target.
     *  Structure is documented below.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.AutomationSelectorTargetArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.AutomationSelectorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.AutomationSelectorTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowArgs.Builder)
    /**
     * @param endTime End time (exclusive). Use 24:00 to indicate midnight. If you specify endTime you must also specify startTime. If left empty, this will block for the entire day for the days specified in daysOfWeek.
     *  Structure is documented below.
     * @return builder
     */
    def endTime(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowEndTimeArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowEndTimeArgs.builder
      builder.endTime(args(argsBuilder).build)

    /**
     * @param startTime Start time (inclusive). Use 00:00 for the beginning of the day. If you specify startTime you must also specify endTime. If left empty, this will block for the entire day for the days specified in daysOfWeek.
     *  Structure is documented below.
     * @return builder
     */
    def startTime(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowStartTimeArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsWeeklyWindowStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksRenderArgs.Builder)
    /**
     * @param container This task is represented by a container that is executed in the Cloud Build execution environment.
     *  Structure is documented below.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksRenderContainerArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksRenderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeTasksRenderContainerArgs.builder
      builder.container(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisGoogleCloudArgs.Builder)
    /**
     * @param alertPolicyChecks Optional. A list of Cloud Monitoring Alert Policy checks to perform as part of the analysis.
     * @return builder
     */
    def alertPolicyChecks(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisGoogleCloudAlertPolicyCheckArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisGoogleCloudArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisGoogleCloudAlertPolicyCheckArgs.builder
      builder.alertPolicyChecks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisCustomCheckArgs.Builder)
    /**
     * @param task Required. The Task to be run for this custom check.
     * @return builder
     */
    def task(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisCustomCheckTaskArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisCustomCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisCustomCheckTaskArgs.builder
      builder.task(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.AutomationRuleRepairRolloutRuleArgs.Builder)
    /**
     * @param repairPhases Optional. Proceeds only after phase name matched any one in the list. This value must consist of lower-case letters, numbers, and hyphens, start with a letter and end with a letter or a number, and have a max length of 63 characters. In other words, it must match the following regex: `^a-z?$`.
     *  Structure is documented below.
     * @return builder
     */
    def repairPhases(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.AutomationRuleRepairRolloutRuleRepairPhaseArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.AutomationRuleRepairRolloutRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.AutomationRuleRepairRolloutRuleRepairPhaseArgs.builder
      builder.repairPhases(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisCustomCheckArgs.Builder)
    /**
     * @param task Required. The Task to be run for this custom check.
     * @return builder
     */
    def task(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisCustomCheckTaskArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisCustomCheckArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisCustomCheckTaskArgs.builder
      builder.task(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisGoogleCloudArgs.Builder)
    /**
     * @param alertPolicyChecks Optional. A list of Cloud Monitoring Alert Policy checks to perform as part of the analysis.
     * @return builder
     */
    def alertPolicyChecks(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisGoogleCloudAlertPolicyCheckArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisGoogleCloudArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisGoogleCloudAlertPolicyCheckArgs.builder
      builder.alertPolicyChecks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentVerifyConfigArgs.Builder)
    /**
     * @param tasks Optional. The tasks that will run as a part of the verify job. The tasks are executed sequentially in the order specified.
     * @return builder
     */
    def tasks(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentVerifyConfigTaskArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentVerifyConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentVerifyConfigTaskArgs.builder
      builder.tasks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPredeployTaskArgs.Builder)
    /**
     * @param container Optional. This task is represented by a container that is executed in the Cloud Build execution environment.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPredeployTaskContainerArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPredeployTaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardPredeployTaskContainerArgs.builder
      builder.container(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsIncludeSkaffoldModuleArgs.Builder)
    /**
     * @param git Remote git repository containing the Skaffold Config modules.
     *  Structure is documented below.
     * @return builder
     */
    def git(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsIncludeSkaffoldModuleGitArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsIncludeSkaffoldModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsIncludeSkaffoldModuleGitArgs.builder
      builder.git(args(argsBuilder).build)

    /**
     * @param googleCloudBuildRepo Cloud Build 2nd gen repository containing the Skaffold Config modules.
     *  Structure is documented below.
     * @return builder
     */
    def googleCloudBuildRepo(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsIncludeSkaffoldModuleGoogleCloudBuildRepoArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsIncludeSkaffoldModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsIncludeSkaffoldModuleGoogleCloudBuildRepoArgs.builder
      builder.googleCloudBuildRepo(args(argsBuilder).build)

    /**
     * @param googleCloudStorage Cloud Storage bucket containing Skaffold Config modules.
     *  Structure is documented below.
     * @return builder
     */
    def googleCloudStorage(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsIncludeSkaffoldModuleGoogleCloudStorageArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsIncludeSkaffoldModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.CustomTargetTypeCustomActionsIncludeSkaffoldModuleGoogleCloudStorageArgs.builder
      builder.googleCloudStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyArgs.Builder)
    /**
     * @param canary Canary deployment strategy provides progressive percentage based deployments to a Target.
     * @return builder
     */
    def canary(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryArgs.builder
      builder.canary(args(argsBuilder).build)

    /**
     * @param standard Standard deployment strategy executes a single deploy and allows verifying the deployment.
     * @return builder
     */
    def standard(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardArgs.builder
      builder.standard(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageArgs.Builder)
    /**
     * @param deployParameters Optional. The deploy parameters to use for the target in this stage.
     * @return builder
     */
    def deployParameters(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageDeployParameterArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageDeployParameterArgs.builder
      builder.deployParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param strategy Optional. The strategy to use for a `Rollout` to this stage.
     * @return builder
     */
    def strategy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyArgs.builder
      builder.strategy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.TargetAssociatedEntityArgs.Builder)
    /**
     * @param anthosClusters Optional. Information specifying Anthos clusters as associated entities.
     * @return builder
     */
    def anthosClusters(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetAssociatedEntityAnthosClusterArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.TargetAssociatedEntityArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetAssociatedEntityAnthosClusterArgs.builder
      builder.anthosClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param gkeClusters Optional. Information specifying GKE clusters as associated entities.
     * @return builder
     */
    def gkeClusters(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetAssociatedEntityGkeClusterArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.TargetAssociatedEntityArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetAssociatedEntityGkeClusterArgs.builder
      builder.gkeClusters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisCustomCheckTaskArgs.Builder)
    /**
     * @param container Optional. This task is represented by a container that is executed in the Cloud Build execution environment.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisCustomCheckTaskContainerArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisCustomCheckTaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyStandardAnalysisCustomCheckTaskContainerArgs.builder
      builder.container(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigVerifyConfigArgs.Builder)
    /**
     * @param tasks Optional. The tasks that will run as a part of the verify job. The tasks are executed sequentially in the order specified.
     * @return builder
     */
    def tasks(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigVerifyConfigTaskArgs.Builder]*):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigVerifyConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigVerifyConfigTaskArgs.builder
      builder.tasks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.AutomationRuleArgs.Builder)
    /**
     * @param advanceRolloutRule Optional. The `AdvanceRolloutRule` will automatically advance a successful Rollout.
     *  Structure is documented below.
     * @return builder
     */
    def advanceRolloutRule(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.AutomationRuleAdvanceRolloutRuleArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.AutomationRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.AutomationRuleAdvanceRolloutRuleArgs.builder
      builder.advanceRolloutRule(args(argsBuilder).build)

    /**
     * @param promoteReleaseRule Optional. `PromoteReleaseRule` will automatically promote a release from the current target to a specified target.
     *  Structure is documented below.
     * @return builder
     */
    def promoteReleaseRule(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.AutomationRulePromoteReleaseRuleArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.AutomationRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.AutomationRulePromoteReleaseRuleArgs.builder
      builder.promoteReleaseRule(args(argsBuilder).build)

    /**
     * @param repairRolloutRule Optional. The RepairRolloutRule will automatically repair a failed rollout.
     *  Structure is documented below.
     * @return builder
     */
    def repairRolloutRule(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.AutomationRuleRepairRolloutRuleArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.AutomationRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.AutomationRuleRepairRolloutRuleArgs.builder
      builder.repairRolloutRule(args(argsBuilder).build)

    /**
     * @param timedPromoteReleaseRule Optional. The `TimedPromoteReleaseRule` will automatically promote a release from the current target(s) to the specified target(s) on a configured schedule.
     *  Structure is documented below.
     * @return builder
     */
    def timedPromoteReleaseRule(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.AutomationRuleTimedPromoteReleaseRuleArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.AutomationRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.AutomationRuleTimedPromoteReleaseRuleArgs.builder
      builder.timedPromoteReleaseRule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisCustomCheckTaskArgs.Builder)
    /**
     * @param container Optional. This task is represented by a container that is executed in the Cloud Build execution environment.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisCustomCheckTaskContainerArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisCustomCheckTaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigAnalysisCustomCheckTaskContainerArgs.builder
      builder.container(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.TargetIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.TargetIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.TargetIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.TargetIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshArgs.Builder)
    /**
     * @param routeDestinations Optional. Route destinations allow configuring the Gateway API HTTPRoute to be deployed to additional clusters. This option is available for multi-cluster service mesh set ups that require the route to exist in the clusters that call the service. If unspecified, the HTTPRoute will only be deployed to the Target cluster.
     * @return builder
     */
    def routeDestinations(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshRouteDestinationsArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshRouteDestinationsArgs.builder
      builder.routeDestinations(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionArgs.Builder)
    /**
     * @param timeWindows Time window within which actions are restricted.
     *  Structure is documented below.
     * @return builder
     */
    def timeWindows(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsArgs.builder
      builder.timeWindows(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentVerifyConfigTaskArgs.Builder)
    /**
     * @param container Optional. This task is represented by a container that is executed in the Cloud Build execution environment.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentVerifyConfigTaskContainerArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentVerifyConfigTaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentVerifyConfigTaskContainerArgs.builder
      builder.container(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisCustomCheckTaskArgs.Builder)
    /**
     * @param container Optional. This task is represented by a container that is executed in the Cloud Build execution environment.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisCustomCheckTaskContainerArgs.Builder]):
        com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisCustomCheckTaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentAnalysisCustomCheckTaskContainerArgs.builder
      builder.container(args(argsBuilder).build)

  /** The Cloud Deploy `DeliveryPipeline` resource */
  def DeliveryPipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.DeliveryPipelineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.DeliveryPipelineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.DeliveryPipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
