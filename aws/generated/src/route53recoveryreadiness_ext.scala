package jp.ukiba.ko_pulumi
package aws

object route53recoveryreadiness_ext:
  extension (builder: com.pulumi.aws.route53recoveryreadiness.ResourceSetArgs.Builder)
    /**
     * @param resources List of resources to add to this resource set. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs.Builder]*):
        com.pulumi.aws.route53recoveryreadiness.ResourceSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs.Builder)
    /**
     * @param dnsTargetResource Component for DNS/Routing Control Readiness Checks.
     * @return builder
     */
    def dnsTargetResource(args: Endofunction[com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceArgs.Builder]):
        com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceArgs.builder
      builder.dnsTargetResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceArgs.Builder)
    /**
     * @param targetResource Target resource the R53 record specified with the above params points to.
     * @return builder
     */
    def targetResource(args: Endofunction[com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceTargetResourceArgs.Builder]):
        com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceTargetResourceArgs.builder
      builder.targetResource(args(argsBuilder).build)

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
     * The following arguments are optional:
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs.Builder]*):
        com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetState.Builder =
      def argsBuilder = com.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)
