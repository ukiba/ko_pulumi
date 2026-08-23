package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object resiliencehub:
  object ResiliencehubFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for reading an AWS Resilience Hub V2 Policy. */
    inline def getV2Policy(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.GetV2PolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.resiliencehub.outputs.GetV2PolicyResult] =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.GetV2PolicyArgs.builder
      com.pulumi.aws.resiliencehub.ResiliencehubFunctions.getV2Policy(args(argsBuilder).build)

    /** Data source for reading an AWS Resilience Hub V2 Policy. */
    inline def getV2PolicyPlain(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.GetV2PolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.resiliencehub.outputs.GetV2PolicyResult] =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.GetV2PolicyPlainArgs.builder
      com.pulumi.aws.resiliencehub.ResiliencehubFunctions.getV2PolicyPlain(args(argsBuilder).build)

    /** Data source for reading an AWS Resilience Hub V2 Service. */
    inline def getV2Service(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.GetV2ServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.resiliencehub.outputs.GetV2ServiceResult] =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.GetV2ServiceArgs.builder
      com.pulumi.aws.resiliencehub.ResiliencehubFunctions.getV2Service(args(argsBuilder).build)

    /** Data source for reading an AWS Resilience Hub V2 Service. */
    inline def getV2ServicePlain(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.GetV2ServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.resiliencehub.outputs.GetV2ServiceResult] =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.GetV2ServicePlainArgs.builder
      com.pulumi.aws.resiliencehub.ResiliencehubFunctions.getV2ServicePlain(args(argsBuilder).build)

    /** Data source for reading an AWS Resilience Hub V2 System. */
    inline def getV2System(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.GetV2SystemArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.resiliencehub.outputs.GetV2SystemResult] =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.GetV2SystemArgs.builder
      com.pulumi.aws.resiliencehub.ResiliencehubFunctions.getV2System(args(argsBuilder).build)

    /** Data source for reading an AWS Resilience Hub V2 System. */
    inline def getV2SystemPlain(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.GetV2SystemPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.resiliencehub.outputs.GetV2SystemResult] =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.GetV2SystemPlainArgs.builder
      com.pulumi.aws.resiliencehub.ResiliencehubFunctions.getV2SystemPlain(args(argsBuilder).build)

  /** Resource for managing an AWS Resilience Hub Resiliency Policy. */
  def ResiliencyPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.ResiliencyPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.resiliencehub.ResiliencyPolicyArgs.Builder)
    /**
     * @param policy The type of resiliency policy to be created, including the recovery time objective (RTO) and recovery point objective (RPO) in seconds. See `policy`.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder]):
        com.pulumi.aws.resiliencehub.ResiliencyPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.builder
      builder.policy(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyTimeoutsArgs.Builder]):
        com.pulumi.aws.resiliencehub.ResiliencyPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 Assertion.
   * 
   * An assertion is a statement about your application that provides context for failure mode assessments. Assertions help the GenAI assessment engine understand aspects of your architecture that aren&#39;t visible from resource configuration alone (e.g., &#34;Data loss is unacceptable&#34;, &#34;Typical traffic is 1000 TPS spiking to 10000 TPS&#34;).
   */
  def V2Assertion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2AssertionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.resiliencehub.V2AssertionArgs.builder
    com.pulumi.aws.resiliencehub.V2Assertion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 Input Source.
   * 
   * An input source defines where Resilience Hub discovers AWS resources for a service. Supported source types include CloudFormation stacks, Terraform state files (stored in S3), and EKS clusters.
   * 
   * &gt; **Note:** This resource does not support in-place updates. Any change to the resource configuration will destroy and recreate the input source.
   */
  def V2InputSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2InputSourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.resiliencehub.V2InputSourceArgs.builder
    com.pulumi.aws.resiliencehub.V2InputSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.resiliencehub.V2InputSourceArgs.Builder)
    /**
     * @param resourceConfiguration Resource configuration for an input source. See `resourceConfiguration` Block below.
     * @return builder
     */
    def resourceConfiguration(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.Builder]):
        com.pulumi.aws.resiliencehub.V2InputSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.builder
      builder.resourceConfiguration(args(argsBuilder).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 Policy.
   * 
   * A resilience policy defines your resilience expectations through modular, composable requirements. Rather than choosing a single rigid policy type, you construct policies by selecting the requirements that matter to your application: availability SLO, multi-AZ disaster recovery, multi-region disaster recovery, and data recovery objectives.
   */
  def V2Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2PolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.resiliencehub.V2PolicyArgs.Builder)
    /**
     * @param availabilitySlo Availability SLO configuration. See `availabilitySlo` Block below.
     * @return builder
     */
    def availabilitySlo(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyAvailabilitySloArgs.Builder]):
        com.pulumi.aws.resiliencehub.V2PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyAvailabilitySloArgs.builder
      builder.availabilitySlo(args(argsBuilder).build)

    /**
     * @param dataRecovery Data recovery configuration. See `dataRecovery` Block below.
     * @return builder
     */
    def dataRecovery(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyDataRecoveryArgs.Builder]):
        com.pulumi.aws.resiliencehub.V2PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyDataRecoveryArgs.builder
      builder.dataRecovery(args(argsBuilder).build)

    /**
     * @param multiAz Multi-AZ disaster recovery configuration. See `multiAz` Block below.
     * @return builder
     */
    def multiAz(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiAzArgs.Builder]):
        com.pulumi.aws.resiliencehub.V2PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiAzArgs.builder
      builder.multiAz(args(argsBuilder).build)

    /**
     * @param multiRegion Multi-region disaster recovery configuration. See `multiRegion` Block below.
     * @return builder
     */
    def multiRegion(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiRegionArgs.Builder]):
        com.pulumi.aws.resiliencehub.V2PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiRegionArgs.builder
      builder.multiRegion(args(argsBuilder).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 Service.
   * 
   * A service is the primary building block in Resilience Hub. It comprises AWS resources, code, and observability that together deliver a specific capability. Services can be associated with a resilience policy and a permission model for resource discovery.
   */
  def V2Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2ServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.resiliencehub.V2ServiceArgs.Builder)
    /**
     * @param associatedSystems Systems to associate with the service. See `associatedSystem` Block below.
     * @return builder
     */
    def associatedSystems(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2ServiceAssociatedSystemArgs.Builder]*):
        com.pulumi.aws.resiliencehub.V2ServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2ServiceAssociatedSystemArgs.builder
      builder.associatedSystems(args.map(_(argsBuilder).build)*)

    /**
     * @param permissionModel Permission model for resource discovery. See `permissionModel` Block below.
     * @return builder
     */
    def permissionModel(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelArgs.Builder]):
        com.pulumi.aws.resiliencehub.V2ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelArgs.builder
      builder.permissionModel(args(argsBuilder).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 Service Function.
   * 
   * A service function represents a technical subset of the service topology that represents a specific workflow within a service. For example, an authentication service might have separate service functions for &#34;SSO sign-in&#34; and &#34;Registration&#34;.
   */
  def V2ServiceFunction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2ServiceFunctionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.resiliencehub.V2ServiceFunctionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.resiliencehub.V2ServiceFunction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 System.
   * 
   * A system represents a business application or platform that delivers value to your organization. Systems contain user journeys and services, and serve as the top-level container for organizing your resilience posture.
   */
  def V2System(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2SystemArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an AWS Resilience Hub V2 User Journey.
   * 
   * A user journey describes a critical end-user path or business capability within a system (e.g., &#34;Path to purchase&#34;, &#34;Order fulfillment&#34;). User journeys reference services and can have resilience policies applied at the journey level.
   */
  def V2UserJourney(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.resiliencehub.V2UserJourneyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.resiliencehub.V2UserJourneyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.resiliencehub.V2UserJourney(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder)
    /**
     * @param az Specifies Availability Zone failure policy. See `policy.az`
     * @return builder
     */
    def az(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyAzArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyAzArgs.builder
      builder.az(args(argsBuilder).build)

    /**
     * @param hardware Specifies Infrastructure failure policy. See `policy.hardware`
     * @return builder
     */
    def hardware(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyHardwareArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyHardwareArgs.builder
      builder.hardware(args(argsBuilder).build)

    /**
     * @param region Specifies Region failure policy. `policy.region`
     * @return builder
     */
    def region(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyRegionArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyRegionArgs.builder
      builder.region(args(argsBuilder).build)

    /**
     * @param software Specifies Application failure policy. See `policy.software`
     * 
     * The following arguments are optional:
     * @return builder
     */
    def software(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicySoftwareArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicySoftwareArgs.builder
      builder.software(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyState.Builder)
    /**
     * @param policy The type of resiliency policy to be created, including the recovery time objective (RTO) and recovery point objective (RPO) in seconds. See `policy`.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyPolicyArgs.builder
      builder.policy(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyTimeoutsArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.ResiliencyPolicyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.Builder)
    /**
     * @param eks EKS configuration. See `eks` Block below.
     * @return builder
     */
    def eks(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationEksArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationEksArgs.builder
      builder.eks(args(argsBuilder).build)

    /**
     * @param resourceTags Resource tags used for discovery. See `resourceTag` Block below.
     * @return builder
     */
    def resourceTags(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationResourceTagArgs.Builder]*):
        com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationResourceTagArgs.builder
      builder.resourceTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.V2InputSourceState.Builder)
    /**
     * @param resourceConfiguration Resource configuration for an input source. See `resourceConfiguration` Block below.
     * @return builder
     */
    def resourceConfiguration(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2InputSourceState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2InputSourceResourceConfigurationArgs.builder
      builder.resourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.V2PolicyState.Builder)
    /**
     * @param availabilitySlo Availability SLO configuration. See `availabilitySlo` Block below.
     * @return builder
     */
    def availabilitySlo(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyAvailabilitySloArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyAvailabilitySloArgs.builder
      builder.availabilitySlo(args(argsBuilder).build)

    /**
     * @param dataRecovery Data recovery configuration. See `dataRecovery` Block below.
     * @return builder
     */
    def dataRecovery(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyDataRecoveryArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyDataRecoveryArgs.builder
      builder.dataRecovery(args(argsBuilder).build)

    /**
     * @param multiAz Multi-AZ disaster recovery configuration. See `multiAz` Block below.
     * @return builder
     */
    def multiAz(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiAzArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiAzArgs.builder
      builder.multiAz(args(argsBuilder).build)

    /**
     * @param multiRegion Multi-region disaster recovery configuration. See `multiRegion` Block below.
     * @return builder
     */
    def multiRegion(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiRegionArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2PolicyMultiRegionArgs.builder
      builder.multiRegion(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelArgs.Builder)
    /**
     * @param crossAccountRoles Cross-account IAM role. See `crossAccountRole` Block below.
     * @return builder
     */
    def crossAccountRoles(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelCrossAccountRoleArgs.Builder]*):
        com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelArgs.Builder =
      def argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelCrossAccountRoleArgs.builder
      builder.crossAccountRoles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.resiliencehub.inputs.V2ServiceState.Builder)
    /**
     * @param associatedSystems Systems to associate with the service. See `associatedSystem` Block below.
     * @return builder
     */
    def associatedSystems(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2ServiceAssociatedSystemArgs.Builder]*):
        com.pulumi.aws.resiliencehub.inputs.V2ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2ServiceAssociatedSystemArgs.builder
      builder.associatedSystems(args.map(_(argsBuilder).build)*)

    /**
     * @param permissionModel Permission model for resource discovery. See `permissionModel` Block below.
     * @return builder
     */
    def permissionModel(args: Endofunction[com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelArgs.Builder]):
        com.pulumi.aws.resiliencehub.inputs.V2ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.resiliencehub.inputs.V2ServicePermissionModelArgs.builder
      builder.permissionModel(args(argsBuilder).build)
