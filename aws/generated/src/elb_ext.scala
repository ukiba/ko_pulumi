package jp.ukiba.ko_pulumi
package aws

object elb_ext:
  extension (builder: com.pulumi.aws.elb.LoadBalancerArgs.Builder)
    /**
     * @param accessLogs An Access Logs block. Access Logs documented below.
     * @return builder
     */
    inline def accessLogs(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerAccessLogsArgs.Builder]):
        com.pulumi.aws.elb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerAccessLogsArgs.builder
      builder.accessLogs(args(argsBuilder).build)

    /**
     * @param healthCheck A healthCheck block. Health Check documented below.
     * @return builder
     */
    inline def healthCheck(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerHealthCheckArgs.Builder]):
        com.pulumi.aws.elb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param listeners A list of listener blocks. Listeners documented below.
     * @return builder
     */
    inline def listeners(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerListenerArgs.Builder]*):
        com.pulumi.aws.elb.LoadBalancerArgs.Builder =
      def argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerListenerArgs.builder
      builder.listeners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elb.LoadBalancerPolicyArgs.Builder)
    /**
     * @param policyAttributes Policy attribute to apply to the policy.
     * @return builder
     */
    inline def policyAttributes(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerPolicyPolicyAttributeArgs.Builder]*):
        com.pulumi.aws.elb.LoadBalancerPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerPolicyPolicyAttributeArgs.builder
      builder.policyAttributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elb.SslNegotiationPolicyArgs.Builder)
    /**
     * @param attributes An SSL Negotiation policy attribute. Each has two properties:
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.aws.elb.inputs.SslNegotiationPolicyAttributeArgs.Builder]*):
        com.pulumi.aws.elb.SslNegotiationPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.elb.inputs.SslNegotiationPolicyAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elb.inputs.LoadBalancerPolicyState.Builder)
    /**
     * @param policyAttributes Policy attribute to apply to the policy.
     * @return builder
     */
    inline def policyAttributes(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerPolicyPolicyAttributeArgs.Builder]*):
        com.pulumi.aws.elb.inputs.LoadBalancerPolicyState.Builder =
      def argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerPolicyPolicyAttributeArgs.builder
      builder.policyAttributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elb.inputs.LoadBalancerState.Builder)
    /**
     * @param accessLogs An Access Logs block. Access Logs documented below.
     * @return builder
     */
    inline def accessLogs(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerAccessLogsArgs.Builder]):
        com.pulumi.aws.elb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerAccessLogsArgs.builder
      builder.accessLogs(args(argsBuilder).build)

    /**
     * @param healthCheck A healthCheck block. Health Check documented below.
     * @return builder
     */
    inline def healthCheck(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerHealthCheckArgs.Builder]):
        com.pulumi.aws.elb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param listeners A list of listener blocks. Listeners documented below.
     * @return builder
     */
    inline def listeners(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerListenerArgs.Builder]*):
        com.pulumi.aws.elb.inputs.LoadBalancerState.Builder =
      def argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerListenerArgs.builder
      builder.listeners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elb.inputs.SslNegotiationPolicyState.Builder)
    /**
     * @param attributes An SSL Negotiation policy attribute. Each has two properties:
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.aws.elb.inputs.SslNegotiationPolicyAttributeArgs.Builder]*):
        com.pulumi.aws.elb.inputs.SslNegotiationPolicyState.Builder =
      def argsBuilder = com.pulumi.aws.elb.inputs.SslNegotiationPolicyAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)
