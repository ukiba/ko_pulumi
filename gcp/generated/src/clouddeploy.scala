package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object clouddeploy:
  /**
   * An `Automation` enables the automation of manually driven actions for a Delivery Pipeline, which includes Release promotion amongst Targets, Rollout repair and Rollout deployment strategy advancement.
   * 
   * To get more information about Automation, see:
   * 
   * * [API documentation](https://cloud.google.com/deploy/docs/api/reference/rest/v1/projects.locations.deliveryPipelines.automations)
   * * How-to Guides
   *     * [Automate your deployment](https://cloud.google.com/deploy/docs/automation)
   */
  def Automation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.AutomationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.AutomationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.Automation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object ClouddeployFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for customtargettype */
    inline def getCustomTargetTypeIamPolicy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.GetCustomTargetTypeIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.clouddeploy.outputs.GetCustomTargetTypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.GetCustomTargetTypeIamPolicyArgs.builder
      com.pulumi.gcp.clouddeploy.ClouddeployFunctions.getCustomTargetTypeIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for customtargettype */
    inline def getCustomTargetTypeIamPolicyPlain(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.GetCustomTargetTypeIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.clouddeploy.outputs.GetCustomTargetTypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.GetCustomTargetTypeIamPolicyPlainArgs.builder
      com.pulumi.gcp.clouddeploy.ClouddeployFunctions.getCustomTargetTypeIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for deliverypipeline */
    inline def getDeliveryPipelineIamPolicy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.GetDeliveryPipelineIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.clouddeploy.outputs.GetDeliveryPipelineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.GetDeliveryPipelineIamPolicyArgs.builder
      com.pulumi.gcp.clouddeploy.ClouddeployFunctions.getDeliveryPipelineIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for deliverypipeline */
    inline def getDeliveryPipelineIamPolicyPlain(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.GetDeliveryPipelineIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.clouddeploy.outputs.GetDeliveryPipelineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.GetDeliveryPipelineIamPolicyPlainArgs.builder
      com.pulumi.gcp.clouddeploy.ClouddeployFunctions.getDeliveryPipelineIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for target */
    inline def getTargetIamPolicy(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.GetTargetIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.clouddeploy.outputs.GetTargetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.GetTargetIamPolicyArgs.builder
      com.pulumi.gcp.clouddeploy.ClouddeployFunctions.getTargetIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for target */
    inline def getTargetIamPolicyPlain(args: Endofunction[com.pulumi.gcp.clouddeploy.inputs.GetTargetIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.clouddeploy.outputs.GetTargetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.clouddeploy.inputs.GetTargetIamPolicyPlainArgs.builder
      com.pulumi.gcp.clouddeploy.ClouddeployFunctions.getTargetIamPolicyPlain(args(argsBuilder).build)

  /**
   * A Cloud Deploy `CustomTargetType` defines a type of custom target that can be referenced in a
   * Cloud Deploy `Target` in order to facilitate deploying to other systems besides the supported runtimes.
   * 
   * To get more information about CustomTargetType, see:
   * 
   * * [API documentation](https://cloud.google.com/deploy/docs/api/reference/rest/v1/projects.locations.customTargetTypes)
   * * How-to Guides
   *     * [Define and use a custom target type](https://cloud.google.com/deploy/docs/deploy-app-custom-target)
   */
  def CustomTargetType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.CustomTargetTypeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.CustomTargetTypeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.CustomTargetType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def CustomTargetTypeIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.CustomTargetTypeIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.CustomTargetTypeIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.CustomTargetTypeIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def CustomTargetTypeIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.CustomTargetTypeIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.CustomTargetTypeIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.CustomTargetTypeIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def CustomTargetTypeIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.CustomTargetTypeIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.CustomTargetTypeIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.CustomTargetTypeIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** The Cloud Deploy `DeliveryPipeline` resource */
  def DeliveryPipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.DeliveryPipelineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.DeliveryPipelineArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.DeliveryPipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def DeliveryPipelineIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.DeliveryPipelineIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.DeliveryPipelineIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.DeliveryPipelineIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def DeliveryPipelineIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.DeliveryPipelineIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.DeliveryPipelineIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.DeliveryPipelineIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def DeliveryPipelineIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.DeliveryPipelineIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.DeliveryPipelineIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.DeliveryPipelineIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A `DeployPolicy` inhibits manual or DeployPolicy-driven actions within a Delivery Pipeline or Target.
   * 
   * To get more information about DeployPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/deploy/docs/api/reference/rest/v1/projects.locations.deployPolicies)
   * * How-to Guides
   *     * [Restrict deploy behavior using policies](https://cloud.google.com/deploy/docs/deploy-policy)
   */
  def DeployPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.DeployPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.DeployPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.DeployPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** The Cloud Deploy `Target` resource */
  def Target(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.TargetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.TargetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.Target(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def TargetIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.TargetIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.TargetIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.TargetIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def TargetIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.TargetIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.TargetIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.TargetIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def TargetIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddeploy.TargetIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.clouddeploy.TargetIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.clouddeploy.TargetIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
