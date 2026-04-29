package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object lb:
  extension (builder: com.pulumi.aws.lb.TargetGroupArgs.Builder)
    /**
     * @param healthCheck Health Check configuration block. Detailed below.
     * @return builder
     */
    def healthCheck(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupHealthCheckArgs.Builder]):
        com.pulumi.aws.lb.TargetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param stickiness Stickiness configuration block. Detailed below.
     * @return builder
     */
    def stickiness(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupStickinessArgs.Builder]):
        com.pulumi.aws.lb.TargetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupStickinessArgs.builder
      builder.stickiness(args(argsBuilder).build)

    /**
     * @param targetFailovers Target failover block. Only applicable for Gateway Load Balancer target groups. See targetFailover for more information.
     * @return builder
     */
    def targetFailovers(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetFailoverArgs.Builder]*):
        com.pulumi.aws.lb.TargetGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetFailoverArgs.builder
      builder.targetFailovers(args.map(_(argsBuilder).build)*)

    /**
     * @param targetGroupHealth Target health requirements block. See targetGroupHealth for more information.
     * @return builder
     */
    def targetGroupHealth(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.Builder]):
        com.pulumi.aws.lb.TargetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.builder
      builder.targetGroupHealth(args(argsBuilder).build)

    /**
     * @param targetHealthStates Target health state block. Only applicable for Network Load Balancer target groups when `protocol` is `TCP` or `TLS`. See targetHealthState for more information.
     * @return builder
     */
    def targetHealthStates(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetHealthStateArgs.Builder]*):
        com.pulumi.aws.lb.TargetGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetHealthStateArgs.builder
      builder.targetHealthStates(args.map(_(argsBuilder).build)*)

  /**
   * Provides a Load Balancer Listener Certificate resource.
   *  
   *  This resource is for additional certificates and does not replace the default certificate on the listener.
   *  
   *  &gt; **Note:** `aws.alb.ListenerCertificate` is known as `aws.lb.ListenerCertificate`. The functionality is identical.
   */
  def ListenerCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lb.ListenerCertificateArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lb.ListenerCertificateArgs.builder
    
    com.pulumi.aws.lb.ListenerCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides the ability to register instances and containers with an Application Load Balancer (ALB) or Network Load Balancer (NLB) target group. For attaching resources with Elastic Load Balancer (ELB), see the `aws.elb.Attachment` resource.
   *  
   *  &gt; **Note:** `aws.alb.TargetGroupAttachment` is known as `aws.lb.TargetGroupAttachment`. The functionality is identical.
   */
  def TargetGroupAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lb.TargetGroupAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lb.TargetGroupAttachmentArgs.builder
    
    com.pulumi.aws.lb.TargetGroupAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Target Group resource for use with Load Balancer resources.
   *  
   *  &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
   */
  def TargetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lb.TargetGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lb.TargetGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lb.TargetGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lb.ListenerRuleArgs.Builder)
    /**
     * @param actions An Action block. Action blocks are documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder]*):
        com.pulumi.aws.lb.ListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder]*):
        com.pulumi.aws.lb.ListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param transforms Configuration block that defines the transform to apply to requests matching this rule. See Transform Blocks below for more details. Once specified, to remove the transform from the rule, remove the `transform` block from the configuration.
     * @return builder
     */
    def transforms(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.Builder]*):
        com.pulumi.aws.lb.ListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.builder
      builder.transforms(args.map(_(argsBuilder).build)*)

  /**
   * Provides a Load Balancer resource.
   *  
   *  &gt; **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
   */
  def LoadBalancer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lb.LoadBalancerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lb.LoadBalancerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lb.LoadBalancer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type LbFunctions = com.pulumi.aws.lb.LbFunctions
  object LbFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.lb.LbFunctions.*
  extension (self: LbFunctions.type)
    /** Use this data source to get the HostedZoneId of the AWS Elastic Load Balancing (ELB) in a given region for the purpose of using in an AWS Route53 Alias. Specify the ELB type (`network` or `application`) to return the relevant the associated HostedZoneId. Ref: [ELB service endpoints](https://docs.aws.amazon.com/general/latest/gr/elb.html#elb_region) */
    def getHostedZoneId(args: Endofunction[com.pulumi.aws.lb.inputs.GetHostedZoneIdArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetHostedZoneIdResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetHostedZoneIdArgs.builder
      com.pulumi.aws.lb.LbFunctions.getHostedZoneId(args(argsBuilder).build)

    /** Use this data source to get the HostedZoneId of the AWS Elastic Load Balancing (ELB) in a given region for the purpose of using in an AWS Route53 Alias. Specify the ELB type (`network` or `application`) to return the relevant the associated HostedZoneId. Ref: [ELB service endpoints](https://docs.aws.amazon.com/general/latest/gr/elb.html#elb_region) */
    def getHostedZoneIdPlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetHostedZoneIdPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetHostedZoneIdResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetHostedZoneIdPlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getHostedZoneIdPlain(args(argsBuilder).build)

    /**
     * Use this data source to get a list of Load Balancer ARNs matching the specified criteria. Useful for passing to other
     *  resources.
     */
    def getLbs(args: Endofunction[com.pulumi.aws.lb.inputs.GetLbsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetLbsResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetLbsArgs.builder
      com.pulumi.aws.lb.LbFunctions.getLbs(args(argsBuilder).build)

    /**
     * Use this data source to get a list of Load Balancer ARNs matching the specified criteria. Useful for passing to other
     *  resources.
     */
    def getLbsPlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetLbsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetLbsResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetLbsPlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getLbsPlain(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer Listener.
     *  
     *  This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
     */
    def getListener(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetListenerResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetListenerArgs.builder
      com.pulumi.aws.lb.LbFunctions.getListener(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer Listener.
     *  
     *  This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
     */
    def getListenerPlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetListenerResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetListenerPlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getListenerPlain(args(argsBuilder).build)

    /** Provides information about an AWS Elastic Load Balancing Listener Rule. */
    def getListenerRule(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetListenerRuleResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleArgs.builder
      com.pulumi.aws.lb.LbFunctions.getListenerRule(args(argsBuilder).build)

    /** Provides information about an AWS Elastic Load Balancing Listener Rule. */
    def getListenerRulePlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRulePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetListenerRuleResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRulePlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getListenerRulePlain(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer.
     *  
     *  This data source can prove useful when a module accepts an LB as an input
     *  variable and needs to, for example, determine the security groups associated
     *  with it, etc.
     */
    def getLoadBalancer(args: Endofunction[com.pulumi.aws.lb.inputs.GetLoadBalancerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetLoadBalancerArgs.builder
      com.pulumi.aws.lb.LbFunctions.getLoadBalancer(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer.
     *  
     *  This data source can prove useful when a module accepts an LB as an input
     *  variable and needs to, for example, determine the security groups associated
     *  with it, etc.
     */
    def getLoadBalancerPlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetLoadBalancerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetLoadBalancerPlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getLoadBalancerPlain(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer Target Group.
     *  
     *  This data source can prove useful when a module accepts an LB Target Group as an
     *  input variable and needs to know its attributes. It can also be used to get the ARN of
     *  an LB Target Group for use in other resources, given LB Target Group name.
     */
    def getTargetGroup(args: Endofunction[com.pulumi.aws.lb.inputs.GetTargetGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetTargetGroupResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetTargetGroupArgs.builder
      com.pulumi.aws.lb.LbFunctions.getTargetGroup(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer Target Group.
     *  
     *  This data source can prove useful when a module accepts an LB Target Group as an
     *  input variable and needs to know its attributes. It can also be used to get the ARN of
     *  an LB Target Group for use in other resources, given LB Target Group name.
     */
    def getTargetGroupPlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetTargetGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetTargetGroupResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetTargetGroupPlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getTargetGroupPlain(args(argsBuilder).build)

    /**
     * &gt; **Note:** `awsAlbTrustStore` is known as `aws.lb.TrustStore`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer Trust Store.
     *  
     *  This data source can prove useful when a module accepts an LB Trust Store as an
     *  input variable and needs to know its attributes. It can also be used to get the ARN of
     *  an LB Trust Store for use in other resources, given LB Trust Store name.
     */
    def getTrustStore(args: Endofunction[com.pulumi.aws.lb.inputs.GetTrustStoreArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetTrustStoreResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetTrustStoreArgs.builder
      com.pulumi.aws.lb.LbFunctions.getTrustStore(args(argsBuilder).build)

    /**
     * &gt; **Note:** `awsAlbTrustStore` is known as `aws.lb.TrustStore`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer Trust Store.
     *  
     *  This data source can prove useful when a module accepts an LB Trust Store as an
     *  input variable and needs to know its attributes. It can also be used to get the ARN of
     *  an LB Trust Store for use in other resources, given LB Trust Store name.
     */
    def getTrustStorePlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetTrustStorePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetTrustStoreResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetTrustStorePlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getTrustStorePlain(args(argsBuilder).build)

  /** Provides a ELBv2 Trust Store for use with Application Load Balancer Listener resources. */
  def TrustStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lb.TrustStoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lb.TrustStoreArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lb.TrustStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lb.LoadBalancerArgs.Builder)
    /**
     * @param accessLogs Access Logs block. See below.
     * @return builder
     */
    def accessLogs(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerAccessLogsArgs.Builder]):
        com.pulumi.aws.lb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerAccessLogsArgs.builder
      builder.accessLogs(args(argsBuilder).build)

    /**
     * @param connectionLogs Connection Logs block. See below. Only valid for Load Balancers of type `application`.
     * @return builder
     */
    def connectionLogs(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerConnectionLogsArgs.Builder]):
        com.pulumi.aws.lb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerConnectionLogsArgs.builder
      builder.connectionLogs(args(argsBuilder).build)

    /**
     * @param healthCheckLogs Health Check Logs block. See below. Only valid for Load Balancers of type `application`.
     * @return builder
     */
    def healthCheckLogs(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerHealthCheckLogsArgs.Builder]):
        com.pulumi.aws.lb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerHealthCheckLogsArgs.builder
      builder.healthCheckLogs(args(argsBuilder).build)

    /**
     * @param ipamPools . The IPAM pools to use with the load balancer.  Only valid for Load Balancers of type `application`. See ipamPools for more information.
     * @return builder
     */
    def ipamPools(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerIpamPoolsArgs.Builder]):
        com.pulumi.aws.lb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerIpamPoolsArgs.builder
      builder.ipamPools(args(argsBuilder).build)

    /**
     * @param minimumLoadBalancerCapacity Minimum capacity for a load balancer. Only valid for Load Balancers of type `application` or `network`.
     * @return builder
     */
    def minimumLoadBalancerCapacity(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerMinimumLoadBalancerCapacityArgs.Builder]):
        com.pulumi.aws.lb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerMinimumLoadBalancerCapacityArgs.builder
      builder.minimumLoadBalancerCapacity(args(argsBuilder).build)

    /**
     * @param subnetMappings Subnet mapping block. See below. For Load Balancers of type `network` subnet mappings can only be added.
     * @return builder
     */
    def subnetMappings(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerSubnetMappingArgs.Builder]*):
        com.pulumi.aws.lb.LoadBalancerArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerSubnetMappingArgs.builder
      builder.subnetMappings(args.map(_(argsBuilder).build)*)

  /**
   * Provides a Load Balancer Listener resource.
   *  
   *  &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
   */
  def Listener(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lb.ListenerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lb.ListenerArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lb.Listener(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lb.ListenerArgs.Builder)
    /**
     * @param defaultActions Configuration block for default actions. See below.
     * @return builder
     */
    def defaultActions(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder]*):
        com.pulumi.aws.lb.ListenerArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.builder
      builder.defaultActions(args.map(_(argsBuilder).build)*)

    /**
     * @param mutualAuthentication The mutual authentication configuration information. See below.
     * @return builder
     */
    def mutualAuthentication(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerMutualAuthenticationArgs.Builder]):
        com.pulumi.aws.lb.ListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerMutualAuthenticationArgs.builder
      builder.mutualAuthentication(args(argsBuilder).build)

  /** Provides a ELBv2 Trust Store Revocation for use with Application Load Balancer Listener resources. */
  def TrustStoreRevocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lb.TrustStoreRevocationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lb.TrustStoreRevocationArgs.builder
    
    com.pulumi.aws.lb.TrustStoreRevocation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder)
    /**
     * @param authenticateCognitos An action to authenticate using Amazon Cognito.
     *  Detailed below.
     * @return builder
     */
    def authenticateCognitos(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionAuthenticateCognitoArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionAuthenticateCognitoArgs.builder
      builder.authenticateCognitos(args.map(_(argsBuilder).build)*)

    /**
     * @param authenticateOidcs An action to authenticate using OIDC.
     *  Detailed below.
     * @return builder
     */
    def authenticateOidcs(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionAuthenticateOidcArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionAuthenticateOidcArgs.builder
      builder.authenticateOidcs(args.map(_(argsBuilder).build)*)

    /**
     * @param fixedResponses An action to return a fixed response.
     *  Detailed below.
     * @return builder
     */
    def fixedResponses(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionFixedResponseArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionFixedResponseArgs.builder
      builder.fixedResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param forwards An action to forward the request.
     *  Detailed below.
     * @return builder
     */
    def forwards(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardArgs.builder
      builder.forwards(args.map(_(argsBuilder).build)*)

    /**
     * @param jwtValidations An action to validate using JWT.
     *  Detailed below.
     * @return builder
     */
    def jwtValidations(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationArgs.builder
      builder.jwtValidations(args.map(_(argsBuilder).build)*)

    /**
     * @param redirects An action to redirect the request.
     *  Detailed below.
     * @return builder
     */
    def redirects(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionRedirectArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionRedirectArgs.builder
      builder.redirects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigArgs.Builder)
    /**
     * @param rewrites Block for URL rewrite configuration. Detailed below.
     * @return builder
     */
    def rewrites(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigRewriteArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigRewriteArgs.builder
      builder.rewrites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.Builder)
    /**
     * @param dnsFailover Block to configure DNS Failover requirements. See DNS Failover below for details on attributes.
     * @return builder
     */
    def dnsFailover(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthDnsFailoverArgs.Builder]):
        com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthDnsFailoverArgs.builder
      builder.dnsFailover(args(argsBuilder).build)

    /**
     * @param unhealthyStateRouting Block to configure Unhealthy State Routing requirements. See Unhealthy State Routing below for details on attributes.
     * @return builder
     */
    def unhealthyStateRouting(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthUnhealthyStateRoutingArgs.Builder]):
        com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthUnhealthyStateRoutingArgs.builder
      builder.unhealthyStateRouting(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleArgs.Builder)
    /**
     * @param actions List of actions associated with the rule, sorted by `order`.
     *  Detailed below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions Set of conditions associated with the rule.
     *  Detailed below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param transforms Block for transform to apply to requests that match this rule. Detailed below.
     * @return builder
     */
    def transforms(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformArgs.builder
      builder.transforms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerState.Builder)
    /**
     * @param defaultActions Configuration block for default actions. See below.
     * @return builder
     */
    def defaultActions(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.builder
      builder.defaultActions(args.map(_(argsBuilder).build)*)

    /**
     * @param mutualAuthentication The mutual authentication configuration information. See below.
     * @return builder
     */
    def mutualAuthentication(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerMutualAuthenticationArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerMutualAuthenticationArgs.builder
      builder.mutualAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationArgs.Builder)
    /**
     * @param additionalClaims Additional claims to validate.
     * @return builder
     */
    def additionalClaims(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationAdditionalClaimArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionJwtValidationAdditionalClaimArgs.builder
      builder.additionalClaims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleActionForwardArgs.Builder)
    /**
     * @param stickiness The target group stickiness for the rule.
     * @return builder
     */
    def stickiness(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionForwardStickinessArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionForwardArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionForwardStickinessArgs.builder
      builder.stickiness(args(argsBuilder).build)

    /**
     * @param targetGroups One or more target group blocks.
     * @return builder
     */
    def targetGroups(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionForwardTargetGroupArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerRuleActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionForwardTargetGroupArgs.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerDefaultActionJwtValidationArgs.Builder)
    /**
     * @param additionalClaims Repeatable configuration block for additional claims to validate.
     * @return builder
     */
    def additionalClaims(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionJwtValidationAdditionalClaimArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionJwtValidationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionJwtValidationAdditionalClaimArgs.builder
      builder.additionalClaims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardArgs.Builder)
    /**
     * @param stickinesses Target group stickiness for the rule.
     *  Detailed below.
     * @return builder
     */
    def stickinesses(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardStickinessArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardStickinessArgs.builder
      builder.stickinesses(args.map(_(argsBuilder).build)*)

    /**
     * @param targetGroups Set of target groups for the action.
     *  Detailed below.
     * @return builder
     */
    def targetGroups(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardTargetGroupArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleActionForwardTargetGroupArgs.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigArgs.Builder)
    /**
     * @param rewrites Block for URL rewrite configuration. Detailed below.
     * @return builder
     */
    def rewrites(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigRewriteArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigRewriteArgs.builder
      builder.rewrites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.LoadBalancerState.Builder)
    /**
     * @param accessLogs Access Logs block. See below.
     * @return builder
     */
    def accessLogs(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerAccessLogsArgs.Builder]):
        com.pulumi.aws.lb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerAccessLogsArgs.builder
      builder.accessLogs(args(argsBuilder).build)

    /**
     * @param connectionLogs Connection Logs block. See below. Only valid for Load Balancers of type `application`.
     * @return builder
     */
    def connectionLogs(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerConnectionLogsArgs.Builder]):
        com.pulumi.aws.lb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerConnectionLogsArgs.builder
      builder.connectionLogs(args(argsBuilder).build)

    /**
     * @param healthCheckLogs Health Check Logs block. See below. Only valid for Load Balancers of type `application`.
     * @return builder
     */
    def healthCheckLogs(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerHealthCheckLogsArgs.Builder]):
        com.pulumi.aws.lb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerHealthCheckLogsArgs.builder
      builder.healthCheckLogs(args(argsBuilder).build)

    /**
     * @param ipamPools . The IPAM pools to use with the load balancer.  Only valid for Load Balancers of type `application`. See ipamPools for more information.
     * @return builder
     */
    def ipamPools(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerIpamPoolsArgs.Builder]):
        com.pulumi.aws.lb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerIpamPoolsArgs.builder
      builder.ipamPools(args(argsBuilder).build)

    /**
     * @param minimumLoadBalancerCapacity Minimum capacity for a load balancer. Only valid for Load Balancers of type `application` or `network`.
     * @return builder
     */
    def minimumLoadBalancerCapacity(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerMinimumLoadBalancerCapacityArgs.Builder]):
        com.pulumi.aws.lb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerMinimumLoadBalancerCapacityArgs.builder
      builder.minimumLoadBalancerCapacity(args(argsBuilder).build)

    /**
     * @param subnetMappings Subnet mapping block. See below. For Load Balancers of type `network` subnet mappings can only be added.
     * @return builder
     */
    def subnetMappings(args: Endofunction[com.pulumi.aws.lb.inputs.LoadBalancerSubnetMappingArgs.Builder]*):
        com.pulumi.aws.lb.inputs.LoadBalancerState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.LoadBalancerSubnetMappingArgs.builder
      builder.subnetMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.TargetGroupState.Builder)
    /**
     * @param healthCheck Health Check configuration block. Detailed below.
     * @return builder
     */
    def healthCheck(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupHealthCheckArgs.Builder]):
        com.pulumi.aws.lb.inputs.TargetGroupState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param stickiness Stickiness configuration block. Detailed below.
     * @return builder
     */
    def stickiness(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupStickinessArgs.Builder]):
        com.pulumi.aws.lb.inputs.TargetGroupState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupStickinessArgs.builder
      builder.stickiness(args(argsBuilder).build)

    /**
     * @param targetFailovers Target failover block. Only applicable for Gateway Load Balancer target groups. See targetFailover for more information.
     * @return builder
     */
    def targetFailovers(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetFailoverArgs.Builder]*):
        com.pulumi.aws.lb.inputs.TargetGroupState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetFailoverArgs.builder
      builder.targetFailovers(args.map(_(argsBuilder).build)*)

    /**
     * @param targetGroupHealth Target health requirements block. See targetGroupHealth for more information.
     * @return builder
     */
    def targetGroupHealth(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.Builder]):
        com.pulumi.aws.lb.inputs.TargetGroupState.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetGroupHealthArgs.builder
      builder.targetGroupHealth(args(argsBuilder).build)

    /**
     * @param targetHealthStates Target health state block. Only applicable for Network Load Balancer target groups when `protocol` is `TCP` or `TLS`. See targetHealthState for more information.
     * @return builder
     */
    def targetHealthStates(args: Endofunction[com.pulumi.aws.lb.inputs.TargetGroupTargetHealthStateArgs.Builder]*):
        com.pulumi.aws.lb.inputs.TargetGroupState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.TargetGroupTargetHealthStateArgs.builder
      builder.targetHealthStates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringArgs.Builder)
    /**
     * @param values Set of `key`-`value` pairs indicating the query string parameters to match.
     * @return builder
     */
    def values(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringValueArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringValueArgs.builder
      builder.values(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleActionJwtValidationArgs.Builder)
    /**
     * @param additionalClaims Repeatable configuration block for additional claims to validate.
     * @return builder
     */
    def additionalClaims(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionJwtValidationAdditionalClaimArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerRuleActionJwtValidationArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionJwtValidationAdditionalClaimArgs.builder
      builder.additionalClaims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder)
    /**
     * @param authenticateCognito Configuration block for using Amazon Cognito to authenticate users. Specify only when `type` is `authenticate-cognito`. See below.
     * @return builder
     */
    def authenticateCognito(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateCognitoArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateCognitoArgs.builder
      builder.authenticateCognito(args(argsBuilder).build)

    /**
     * @param authenticateOidc Configuration block for an identity provider that is compliant with OpenID Connect (OIDC). Specify only when `type` is `authenticate-oidc`. See below.
     * @return builder
     */
    def authenticateOidc(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateOidcArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateOidcArgs.builder
      builder.authenticateOidc(args(argsBuilder).build)

    /**
     * @param fixedResponse Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * @return builder
     */
    def fixedResponse(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionFixedResponseArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionFixedResponseArgs.builder
      builder.fixedResponse(args(argsBuilder).build)

    /**
     * @param forward Configuration block for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. See below.
     * @return builder
     */
    def forward(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardArgs.builder
      builder.forward(args(argsBuilder).build)

    /**
     * @param jwtValidation Configuration block for creating a JWT validation action. Required if `type` is `jwt-validation`.
     * @return builder
     */
    def jwtValidation(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionJwtValidationArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionJwtValidationArgs.builder
      builder.jwtValidation(args(argsBuilder).build)

    /**
     * @param redirect Configuration block for creating a redirect action. Required if `type` is `redirect`. See below.
     * @return builder
     */
    def redirect(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionRedirectArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleState.Builder)
    /**
     * @param actions An Action block. Action blocks are documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerRuleState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerRuleState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param transforms Configuration block that defines the transform to apply to requests matching this rule. See Transform Blocks below for more details. Once specified, to remove the transform from the rule, remove the `transform` block from the configuration.
     * @return builder
     */
    def transforms(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerRuleState.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.builder
      builder.transforms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleTransformHostHeaderRewriteConfigArgs.Builder)
    /**
     * @param rewrite Block for host header rewrite configuration. Only one block is accepted. See Rewrite Blocks below.
     * @return builder
     */
    def rewrite(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleTransformHostHeaderRewriteConfigRewriteArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleTransformHostHeaderRewriteConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleTransformHostHeaderRewriteConfigRewriteArgs.builder
      builder.rewrite(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.Builder)
    /**
     * @param hostHeaderRewriteConfig Configuration block for host header rewrite. Required if `type` is `host-header-rewrite`. See Host Header Rewrite Config Blocks below.
     * @return builder
     */
    def hostHeaderRewriteConfig(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleTransformHostHeaderRewriteConfigArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleTransformHostHeaderRewriteConfigArgs.builder
      builder.hostHeaderRewriteConfig(args(argsBuilder).build)

    /**
     * @param urlRewriteConfig Configuration block for URL rewrite. Required if `type` is `url-rewrite`. See URL Rewrite Config Blocks below.
     * @return builder
     */
    def urlRewriteConfig(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleTransformUrlRewriteConfigArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleTransformUrlRewriteConfigArgs.builder
      builder.urlRewriteConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder)
    /**
     * @param authenticateCognito Information for creating an authenticate action using Cognito. Required if `type` is `authenticate-cognito`.
     * @return builder
     */
    def authenticateCognito(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionAuthenticateCognitoArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionAuthenticateCognitoArgs.builder
      builder.authenticateCognito(args(argsBuilder).build)

    /**
     * @param authenticateOidc Information for creating an authenticate action using OIDC. Required if `type` is `authenticate-oidc`.
     * @return builder
     */
    def authenticateOidc(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionAuthenticateOidcArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionAuthenticateOidcArgs.builder
      builder.authenticateOidc(args(argsBuilder).build)

    /**
     * @param fixedResponse Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * @return builder
     */
    def fixedResponse(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionFixedResponseArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionFixedResponseArgs.builder
      builder.fixedResponse(args(argsBuilder).build)

    /**
     * @param forward Configuration block for creating an action that distributes requests among one or more target groups.
     *  Specify only if `type` is `forward`.
     *  Cannot be specified with `targetGroupArn`.
     * @return builder
     */
    def forward(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionForwardArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionForwardArgs.builder
      builder.forward(args(argsBuilder).build)

    /**
     * @param jwtValidation Information for creating a JWT validation action. Required if `type` is `jwt-validation`.
     * @return builder
     */
    def jwtValidation(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionJwtValidationArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionJwtValidationArgs.builder
      builder.jwtValidation(args(argsBuilder).build)

    /**
     * @param redirect Information for creating a redirect action. Required if `type` is `redirect`.
     * @return builder
     */
    def redirect(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleActionRedirectArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleActionRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder)
    /**
     * @param hostHeaders Host header patterns to match.
     *  Detailed below.
     * @return builder
     */
    def hostHeaders(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionHostHeaderArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionHostHeaderArgs.builder
      builder.hostHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param httpHeaders HTTP header and values to match.
     *  Detailed below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionHttpHeaderArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param httpRequestMethods Contains a single attribute `values`, which contains a set of HTTP request methods.
     * @return builder
     */
    def httpRequestMethods(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionHttpRequestMethodArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionHttpRequestMethodArgs.builder
      builder.httpRequestMethods(args.map(_(argsBuilder).build)*)

    /**
     * @param pathPatterns Path patterns to compare against the request URL.
     *  Detailed below.
     * @return builder
     */
    def pathPatterns(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionPathPatternArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionPathPatternArgs.builder
      builder.pathPatterns(args.map(_(argsBuilder).build)*)

    /**
     * @param queryStrings Query string parameters to match.
     *  Detailed below.
     * @return builder
     */
    def queryStrings(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionQueryStringArgs.builder
      builder.queryStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceIps Contains a single attribute `values`, which contains a set of source IPs in CIDR notation.
     * @return builder
     */
    def sourceIps(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleConditionSourceIpArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleConditionSourceIpArgs.builder
      builder.sourceIps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder)
    /**
     * @param hostHeader Host header patterns to match. Host Header block fields documented below.
     * @return builder
     */
    def hostHeader(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionHostHeaderArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionHostHeaderArgs.builder
      builder.hostHeader(args(argsBuilder).build)

    /**
     * @param httpHeader HTTP headers to match. HTTP Header block fields documented below.
     * @return builder
     */
    def httpHeader(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionHttpHeaderArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionHttpHeaderArgs.builder
      builder.httpHeader(args(argsBuilder).build)

    /**
     * @param httpRequestMethod Contains a single `values` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
     * @return builder
     */
    def httpRequestMethod(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionHttpRequestMethodArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionHttpRequestMethodArgs.builder
      builder.httpRequestMethod(args(argsBuilder).build)

    /**
     * @param pathPattern Path patterns to match against the request URL. Path Pattern block fields documented below.
     * @return builder
     */
    def pathPattern(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionPathPatternArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionPathPatternArgs.builder
      builder.pathPattern(args(argsBuilder).build)

    /**
     * @param queryStrings Query strings to match. Query String block fields documented below.
     * @return builder
     */
    def queryStrings(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionQueryStringArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionQueryStringArgs.builder
      builder.queryStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceIp Contains a single `values` item which is a list of source IP CIDR notations to match. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. Condition is satisfied if the source IP address of the request matches one of the CIDR blocks. Condition is not satisfied by the addresses in the `X-Forwarded-For` header, use `httpHeader` condition instead.
     *  
     *  &gt; **NOTE::** Exactly one of `hostHeader`, `httpHeader`, `httpRequestMethod`, `pathPattern`, `queryString` or `sourceIp` must be set per condition.
     * @return builder
     */
    def sourceIp(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleConditionSourceIpArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleConditionSourceIpArgs.builder
      builder.sourceIp(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lb.inputs.GetListenerRuleTransformArgs.Builder)
    /**
     * @param hostHeaderRewriteConfigs Block for host header rewrite. Detailed below.
     * @return builder
     */
    def hostHeaderRewriteConfigs(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleTransformArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformHostHeaderRewriteConfigArgs.builder
      builder.hostHeaderRewriteConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param urlRewriteConfigs Block for URL rewrite. Detailed below.
     * @return builder
     */
    def urlRewriteConfigs(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigArgs.Builder]*):
        com.pulumi.aws.lb.inputs.GetListenerRuleTransformArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleTransformUrlRewriteConfigArgs.builder
      builder.urlRewriteConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardArgs.Builder)
    /**
     * @param stickiness Configuration block for target group stickiness for the rule. See below.
     * @return builder
     */
    def stickiness(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardStickinessArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardStickinessArgs.builder
      builder.stickiness(args(argsBuilder).build)

    /**
     * @param targetGroups Set of 1-5 target group blocks. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def targetGroups(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardTargetGroupArgs.Builder]*):
        com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.lb.inputs.ListenerDefaultActionForwardTargetGroupArgs.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lb.inputs.ListenerRuleTransformUrlRewriteConfigArgs.Builder)
    /**
     * @param rewrite Block for URL rewrite configuration. Only one block is accepted. See Rewrite Blocks below.
     * @return builder
     */
    def rewrite(args: Endofunction[com.pulumi.aws.lb.inputs.ListenerRuleTransformUrlRewriteConfigRewriteArgs.Builder]):
        com.pulumi.aws.lb.inputs.ListenerRuleTransformUrlRewriteConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lb.inputs.ListenerRuleTransformUrlRewriteConfigRewriteArgs.builder
      builder.rewrite(args(argsBuilder).build)

  /**
   * Provides a Load Balancer Listener Rule resource.
   *  
   *  &gt; **Note:** `aws.alb.ListenerRule` is known as `aws.lb.ListenerRule`. The functionality is identical.
   *  
   *  #### Required
   *  
   *  - `arn` (String) Amazon Resource Name (ARN) of the load balancer listener rule.
   *  
   *  Using `pulumi import`, import rules using their ARN. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:lb/listenerRule:ListenerRule front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener-rule/app/test/8e4497da625e2d8a/9ab28ade35828f96/67b3d2d36dd7c26b
   *  ```
   */
  def ListenerRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lb.ListenerRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lb.ListenerRuleArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lb.ListenerRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
