package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object elb:
  /** Provides a load balancer cookie stickiness policy, which allows an ELB to control the sticky session lifetime of the browser. */
  def LoadBalancerCookieStickinessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elb.LoadBalancerCookieStickinessPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elb.LoadBalancerCookieStickinessPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.elb.LoadBalancerCookieStickinessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Elastic Load Balancer resource, also known as a &#34;Classic
   *  Load Balancer&#34; after the release of
   *  Application/Network Load Balancers.
   *  
   *  &gt; **NOTE on ELB Instances and ELB Attachments:** This provider currently
   *  provides both a standalone ELB Attachment resource
   *  (describing an instance attached to an ELB), and an ELB resource with
   *  `instances` defined in-line. At this time you cannot use an ELB with in-line
   *  instances in conjunction with a ELB Attachment resources. Doing so will cause a
   *  conflict and will overwrite attachments.
   */
  def LoadBalancer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elb.LoadBalancerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elb.LoadBalancerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.elb.LoadBalancer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a load balancer SSL negotiation policy, which allows an ELB to control the ciphers and protocols that are supported during SSL negotiations between a client and a load balancer. */
  def SslNegotiationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elb.SslNegotiationPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elb.SslNegotiationPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.elb.SslNegotiationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a load balancer policy, which can be attached to an ELB listener or backend server. */
  def LoadBalancerPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elb.LoadBalancerPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.elb.LoadBalancerPolicyArgs.builder
    
    com.pulumi.aws.elb.LoadBalancerPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Attaches a load balancer policy to an ELB Listener. */
  def ListenerPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elb.ListenerPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.elb.ListenerPolicyArgs.builder
    
    com.pulumi.aws.elb.ListenerPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Attaches an EC2 instance to an Elastic Load Balancer (ELB). For attaching resources with Application Load Balancer (ALB) or Network Load Balancer (NLB), see the `aws.lb.TargetGroupAttachment` resource.
   *  
   *  &gt; **NOTE on ELB Instances and ELB Attachments:** This provider currently provides
   *  both a standalone ELB Attachment resource (describing an instance attached to
   *  an ELB), and an Elastic Load Balancer resource with
   *  `instances` defined in-line. At this time you cannot use an ELB with in-line
   *  instances in conjunction with an ELB Attachment resource. Doing so will cause a
   *  conflict and will overwrite attachments.
   */
  def Attachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elb.AttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.elb.AttachmentArgs.builder
    
    com.pulumi.aws.elb.Attachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.elb.LoadBalancerArgs.Builder)
    /**
     * @param accessLogs An Access Logs block. Access Logs documented below.
     * @return builder
     */
    def accessLogs(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerAccessLogsArgs.Builder]):
        com.pulumi.aws.elb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerAccessLogsArgs.builder
      builder.accessLogs(args(argsBuilder).build)

    /**
     * @param healthCheck A healthCheck block. Health Check documented below.
     * @return builder
     */
    def healthCheck(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerHealthCheckArgs.Builder]):
        com.pulumi.aws.elb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param listeners A list of listener blocks. Listeners documented below.
     * @return builder
     */
    def listeners(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerListenerArgs.Builder]*):
        com.pulumi.aws.elb.LoadBalancerArgs.Builder =
      def argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerListenerArgs.builder
      builder.listeners(args.map(_(argsBuilder).build)*)

  /** Provides an application cookie stickiness policy, which allows an ELB to wed its sticky cookie&#39;s expiration to a cookie generated by your application. */
  def AppCookieStickinessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elb.AppCookieStickinessPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elb.AppCookieStickinessPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.elb.AppCookieStickinessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.elb.SslNegotiationPolicyArgs.Builder)
    /**
     * @param attributes An SSL Negotiation policy attribute. Each has two properties:
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.elb.inputs.SslNegotiationPolicyAttributeArgs.Builder]*):
        com.pulumi.aws.elb.SslNegotiationPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.elb.inputs.SslNegotiationPolicyAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elb.LoadBalancerPolicyArgs.Builder)
    /**
     * @param policyAttributes Policy attribute to apply to the policy.
     * @return builder
     */
    def policyAttributes(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerPolicyPolicyAttributeArgs.Builder]*):
        com.pulumi.aws.elb.LoadBalancerPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerPolicyPolicyAttributeArgs.builder
      builder.policyAttributes(args.map(_(argsBuilder).build)*)

  type ElbFunctions = com.pulumi.aws.elb.ElbFunctions
  object ElbFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.elb.ElbFunctions.*
  extension (self: ElbFunctions.type)
    /**
     * Use this data source to get the HostedZoneId of the AWS Elastic Load Balancing HostedZoneId
     *  in a given region for the purpose of using in an AWS Route53 Alias.
     */
    def getHostedZoneId(args: Endofunction[com.pulumi.aws.elb.inputs.GetHostedZoneIdArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.elb.outputs.GetHostedZoneIdResult] =
      val argsBuilder = com.pulumi.aws.elb.inputs.GetHostedZoneIdArgs.builder
      com.pulumi.aws.elb.ElbFunctions.getHostedZoneId(args(argsBuilder).build)

    /**
     * Use this data source to get the HostedZoneId of the AWS Elastic Load Balancing HostedZoneId
     *  in a given region for the purpose of using in an AWS Route53 Alias.
     */
    def getHostedZoneIdPlain(args: Endofunction[com.pulumi.aws.elb.inputs.GetHostedZoneIdPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elb.outputs.GetHostedZoneIdResult] =
      val argsBuilder = com.pulumi.aws.elb.inputs.GetHostedZoneIdPlainArgs.builder
      com.pulumi.aws.elb.ElbFunctions.getHostedZoneIdPlain(args(argsBuilder).build)

    /**
     * Provides information about a &#34;classic&#34; Elastic Load Balancer (ELB).
     *  See LB Data Source if you are looking for &#34;v2&#34;
     *  Application Load Balancer (ALB) or Network Load Balancer (NLB).
     *  
     *  This data source can prove useful when a module accepts an LB as an input
     *  variable and needs to, for example, determine the security groups associated
     *  with it, etc.
     */
    def getLoadBalancer(args: Endofunction[com.pulumi.aws.elb.inputs.GetLoadBalancerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.elb.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.aws.elb.inputs.GetLoadBalancerArgs.builder
      com.pulumi.aws.elb.ElbFunctions.getLoadBalancer(args(argsBuilder).build)

    /**
     * Provides information about a &#34;classic&#34; Elastic Load Balancer (ELB).
     *  See LB Data Source if you are looking for &#34;v2&#34;
     *  Application Load Balancer (ALB) or Network Load Balancer (NLB).
     *  
     *  This data source can prove useful when a module accepts an LB as an input
     *  variable and needs to, for example, determine the security groups associated
     *  with it, etc.
     */
    def getLoadBalancerPlain(args: Endofunction[com.pulumi.aws.elb.inputs.GetLoadBalancerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elb.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.aws.elb.inputs.GetLoadBalancerPlainArgs.builder
      com.pulumi.aws.elb.ElbFunctions.getLoadBalancerPlain(args(argsBuilder).build)

    /**
     * Use this data source to get the Account ID of the [AWS Elastic Load Balancing Service Account](http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html#attach-bucket-policy)
     *  in a given region for the purpose of permitting in S3 bucket policy.
     *  
     *  &gt; **Note:** For AWS Regions opened since Jakarta (`ap-southeast-3`) in December 2021, AWS [documents that](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html#attach-bucket-policy) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
     */
    def getServiceAccount(args: Endofunction[com.pulumi.aws.elb.inputs.GetServiceAccountArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.elb.outputs.GetServiceAccountResult] =
      val argsBuilder = com.pulumi.aws.elb.inputs.GetServiceAccountArgs.builder
      com.pulumi.aws.elb.ElbFunctions.getServiceAccount(args(argsBuilder).build)

    /**
     * Use this data source to get the Account ID of the [AWS Elastic Load Balancing Service Account](http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html#attach-bucket-policy)
     *  in a given region for the purpose of permitting in S3 bucket policy.
     *  
     *  &gt; **Note:** For AWS Regions opened since Jakarta (`ap-southeast-3`) in December 2021, AWS [documents that](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html#attach-bucket-policy) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
     */
    def getServiceAccountPlain(args: Endofunction[com.pulumi.aws.elb.inputs.GetServiceAccountPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elb.outputs.GetServiceAccountResult] =
      val argsBuilder = com.pulumi.aws.elb.inputs.GetServiceAccountPlainArgs.builder
      com.pulumi.aws.elb.ElbFunctions.getServiceAccountPlain(args(argsBuilder).build)

  /** Attaches a load balancer policy to an ELB backend server. */
  def LoadBalancerBackendServerPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elb.LoadBalancerBackendServerPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.elb.LoadBalancerBackendServerPolicyArgs.builder
    
    com.pulumi.aws.elb.LoadBalancerBackendServerPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.elb.inputs.LoadBalancerPolicyState.Builder)
    /**
     * @param policyAttributes Policy attribute to apply to the policy.
     * @return builder
     */
    def policyAttributes(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerPolicyPolicyAttributeArgs.Builder]*):
        com.pulumi.aws.elb.inputs.LoadBalancerPolicyState.Builder =
      def argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerPolicyPolicyAttributeArgs.builder
      builder.policyAttributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elb.inputs.LoadBalancerState.Builder)
    /**
     * @param accessLogs An Access Logs block. Access Logs documented below.
     * @return builder
     */
    def accessLogs(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerAccessLogsArgs.Builder]):
        com.pulumi.aws.elb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerAccessLogsArgs.builder
      builder.accessLogs(args(argsBuilder).build)

    /**
     * @param healthCheck A healthCheck block. Health Check documented below.
     * @return builder
     */
    def healthCheck(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerHealthCheckArgs.Builder]):
        com.pulumi.aws.elb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param listeners A list of listener blocks. Listeners documented below.
     * @return builder
     */
    def listeners(args: Endofunction[com.pulumi.aws.elb.inputs.LoadBalancerListenerArgs.Builder]*):
        com.pulumi.aws.elb.inputs.LoadBalancerState.Builder =
      def argsBuilder = com.pulumi.aws.elb.inputs.LoadBalancerListenerArgs.builder
      builder.listeners(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elb.inputs.SslNegotiationPolicyState.Builder)
    /**
     * @param attributes An SSL Negotiation policy attribute. Each has two properties:
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.elb.inputs.SslNegotiationPolicyAttributeArgs.Builder]*):
        com.pulumi.aws.elb.inputs.SslNegotiationPolicyState.Builder =
      def argsBuilder = com.pulumi.aws.elb.inputs.SslNegotiationPolicyAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)
