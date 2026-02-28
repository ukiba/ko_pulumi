package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object route53recoveryreadiness:
  extension (builder: com.pulumi.aws.route53recoveryreadiness.ResourceSetArgs.Builder)
    /**
     * @param resources List of resources to add to this resource set. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs.Builder]*):
        com.pulumi.aws.route53recoveryreadiness.ResourceSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  /** Provides an AWS Route 53 Recovery Readiness Recovery Group. */
  def RecoveryGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53recoveryreadiness.RecoveryGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53recoveryreadiness.RecoveryGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53recoveryreadiness.RecoveryGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AWS Route 53 Recovery Readiness Readiness Check. */
  def ReadinessCheck(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53recoveryreadiness.ReadinessCheckArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53recoveryreadiness.ReadinessCheckArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53recoveryreadiness.ReadinessCheck(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AWS Route 53 Recovery Readiness Cell. */
  def Cell(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53recoveryreadiness.CellArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53recoveryreadiness.CellArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53recoveryreadiness.Cell(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceTargetResourceArgs.Builder)
    /**
     * @param nlbResource NLB resource a DNS Target Resource points to. Required if `r53Resource` is not set.
     * @return builder
     */
    def nlbResource(args: Endofunction[com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs.Builder]):
        com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceTargetResourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceArgs.builder
      builder.nlbResource(args(argsBuilder).build)

    /**
     * @param r53Resource Route53 resource a DNS Target Resource record points to.
     * @return builder
     */
    def r53Resource(args: Endofunction[com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceTargetResourceR53ResourceArgs.Builder]):
        com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceTargetResourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceTargetResourceR53ResourceArgs.builder
      builder.r53Resource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetState.Builder)
    /**
     * @param resources List of resources to add to this resource set. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs.Builder]*):
        com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetState.Builder =
      def argsBuilder = com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceArgs.Builder)
    /**
     * @param targetResource Target resource the R53 record specified with the above params points to.
     * @return builder
     */
    def targetResource(args: Endofunction[com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceTargetResourceArgs.Builder]):
        com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceTargetResourceArgs.builder
      builder.targetResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs.Builder)
    /**
     * @param dnsTargetResource Component for DNS/Routing Control Readiness Checks.
     * @return builder
     */
    def dnsTargetResource(args: Endofunction[com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceArgs.Builder]):
        com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceArgs.builder
      builder.dnsTargetResource(args(argsBuilder).build)

  /** Provides an AWS Route 53 Recovery Readiness Resource Set. */
  def ResourceSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53recoveryreadiness.ResourceSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53recoveryreadiness.ResourceSetArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53recoveryreadiness.ResourceSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
