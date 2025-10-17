package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object resiliencehub:
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
