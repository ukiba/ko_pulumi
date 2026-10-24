package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object resiliencehub:
  object ResiliencehubFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for reading an AWS Resilience Hub V2 Policy. */
    inline def getV2Policy(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.GetV2PolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.resiliencehub.outputs.GetV2PolicyResult] =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.GetV2PolicyArgs.builder
      com.pulumi.aws.resiliencehub.ResiliencehubFunctions.getV2Policy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for reading an AWS Resilience Hub V2 Policy. */
    inline def getV2PolicyPlain(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.GetV2PolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.resiliencehub.outputs.GetV2PolicyResult] =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.GetV2PolicyPlainArgs.builder
      com.pulumi.aws.resiliencehub.ResiliencehubFunctions.getV2PolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for reading an AWS Resilience Hub V2 Service. */
    inline def getV2Service(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.GetV2ServiceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.resiliencehub.outputs.GetV2ServiceResult] =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.GetV2ServiceArgs.builder
      com.pulumi.aws.resiliencehub.ResiliencehubFunctions.getV2Service(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for reading an AWS Resilience Hub V2 Service. */
    inline def getV2ServicePlain(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.GetV2ServicePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.resiliencehub.outputs.GetV2ServiceResult] =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.GetV2ServicePlainArgs.builder
      com.pulumi.aws.resiliencehub.ResiliencehubFunctions.getV2ServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for reading an AWS Resilience Hub V2 System. */
    inline def getV2System(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.GetV2SystemArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.resiliencehub.outputs.GetV2SystemResult] =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.GetV2SystemArgs.builder
      com.pulumi.aws.resiliencehub.ResiliencehubFunctions.getV2System(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for reading an AWS Resilience Hub V2 System. */
    inline def getV2SystemPlain(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.GetV2SystemPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.resiliencehub.outputs.GetV2SystemResult] =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.GetV2SystemPlainArgs.builder
      com.pulumi.aws.resiliencehub.ResiliencehubFunctions.getV2SystemPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Resource for managing an AWS Resilience Hub Resiliency Policy. */
  def ResiliencyPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.ResiliencyPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.resiliencehub.ResiliencyPolicyArgs.builder
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
    com.pulumi.aws.resiliencehub.ResiliencyPolicy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 Assertion.
   * 
   * An assertion is a statement about your application that provides context for failure mode assessments. Assertions help the GenAI assessment engine understand aspects of your architecture that aren&#39;t visible from resource configuration alone (e.g., &#34;Data loss is unacceptable&#34;, &#34;Typical traffic is 1000 TPS spiking to 10000 TPS&#34;).
   */
  def V2Assertion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2AssertionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.resiliencehub.V2AssertionArgs.builder
    com.pulumi.aws.resiliencehub.V2Assertion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 Input Source.
   * 
   * An input source defines where Resilience Hub discovers AWS resources for a service. Supported source types include CloudFormation stacks, Terraform state files (stored in S3), and EKS clusters.
   * 
   * &gt; **Note:** This resource does not support in-place updates. Any change to the resource configuration will destroy and recreate the input source.
   */
  def V2InputSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2InputSourceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.resiliencehub.V2InputSourceArgs.builder
    com.pulumi.aws.resiliencehub.V2InputSource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 Policy.
   * 
   * A resilience policy defines your resilience expectations through modular, composable requirements. Rather than choosing a single rigid policy type, you construct policies by selecting the requirements that matter to your application: availability SLO, multi-AZ disaster recovery, multi-region disaster recovery, and data recovery objectives.
   */
  def V2Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2PolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.resiliencehub.V2PolicyArgs.builder
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
    com.pulumi.aws.resiliencehub.V2Policy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 Service.
   * 
   * A service is the primary building block in Resilience Hub. It comprises AWS resources, code, and observability that together deliver a specific capability. Services can be associated with a resilience policy and a permission model for resource discovery.
   */
  def V2Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2ServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.resiliencehub.V2ServiceArgs.builder
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
    com.pulumi.aws.resiliencehub.V2Service(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 Service Function.
   * 
   * A service function represents a technical subset of the service topology that represents a specific workflow within a service. For example, an authentication service might have separate service functions for &#34;SSO sign-in&#34; and &#34;Registration&#34;.
   */
  def V2ServiceFunction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2ServiceFunctionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.resiliencehub.V2ServiceFunctionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.resiliencehub.V2ServiceFunction(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 System.
   * 
   * A system represents a business application or platform that delivers value to your organization. Systems contain user journeys and services, and serve as the top-level container for organizing your resilience posture.
   */
  def V2System(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2SystemArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.resiliencehub.V2SystemArgs.builder
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
    com.pulumi.aws.resiliencehub.V2System(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 User Journey.
   * 
   * A user journey describes a critical end-user path or business capability within a system (e.g., &#34;Path to purchase&#34;, &#34;Order fulfillment&#34;). User journeys reference services and can have resilience policies applied at the journey level.
   */
  def V2UserJourney(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2UserJourneyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.resiliencehub.V2UserJourneyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.resiliencehub.V2UserJourney(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
