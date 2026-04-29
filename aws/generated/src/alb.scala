package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object alb:
  extension (builder: com.pulumi.aws.alb.TargetGroupArgs.Builder)
    /**
     * @param healthCheck Health Check configuration block. Detailed below.
     * @return builder
     */
    def healthCheck(args: Endofunction[com.pulumi.aws.alb.inputs.TargetGroupHealthCheckArgs.Builder]):
        com.pulumi.aws.alb.TargetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.TargetGroupHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param stickiness Stickiness configuration block. Detailed below.
     * @return builder
     */
    def stickiness(args: Endofunction[com.pulumi.aws.alb.inputs.TargetGroupStickinessArgs.Builder]):
        com.pulumi.aws.alb.TargetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.TargetGroupStickinessArgs.builder
      builder.stickiness(args(argsBuilder).build)

    /**
     * @param targetFailovers Target failover block. Only applicable for Gateway Load Balancer target groups. See targetFailover for more information.
     * @return builder
     */
    def targetFailovers(args: Endofunction[com.pulumi.aws.alb.inputs.TargetGroupTargetFailoverArgs.Builder]*):
        com.pulumi.aws.alb.TargetGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.TargetGroupTargetFailoverArgs.builder
      builder.targetFailovers(args.map(_(argsBuilder).build)*)

    /**
     * @param targetGroupHealth Target health requirements block. See targetGroupHealth for more information.
     * @return builder
     */
    def targetGroupHealth(args: Endofunction[com.pulumi.aws.alb.inputs.TargetGroupTargetGroupHealthArgs.Builder]):
        com.pulumi.aws.alb.TargetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.TargetGroupTargetGroupHealthArgs.builder
      builder.targetGroupHealth(args(argsBuilder).build)

    /**
     * @param targetHealthStates Target health state block. Only applicable for Network Load Balancer target groups when `protocol` is `TCP` or `TLS`. See targetHealthState for more information.
     * @return builder
     */
    def targetHealthStates(args: Endofunction[com.pulumi.aws.alb.inputs.TargetGroupTargetHealthStateArgs.Builder]*):
        com.pulumi.aws.alb.TargetGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.TargetGroupTargetHealthStateArgs.builder
      builder.targetHealthStates(args.map(_(argsBuilder).build)*)

  /**
   * Provides a Load Balancer Listener Certificate resource.
   *  
   *  This resource is for additional certificates and does not replace the default certificate on the listener.
   *  
   *  &gt; **Note:** `aws.alb.ListenerCertificate` is known as `aws.lb.ListenerCertificate`. The functionality is identical.
   */
  def ListenerCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.alb.ListenerCertificateArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.alb.ListenerCertificateArgs.builder
    
    com.pulumi.aws.alb.ListenerCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides the ability to register instances and containers with an Application Load Balancer (ALB) or Network Load Balancer (NLB) target group. For attaching resources with Elastic Load Balancer (ELB), see the `aws.elb.Attachment` resource.
   *  
   *  &gt; **Note:** `aws.alb.TargetGroupAttachment` is known as `aws.lb.TargetGroupAttachment`. The functionality is identical.
   */
  def TargetGroupAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.alb.TargetGroupAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.alb.TargetGroupAttachmentArgs.builder
    
    com.pulumi.aws.alb.TargetGroupAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Target Group resource for use with Load Balancer resources.
   *  
   *  &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
   */
  def TargetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.alb.TargetGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.alb.TargetGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.alb.TargetGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.alb.ListenerRuleArgs.Builder)
    /**
     * @param actions An Action block. Action blocks are documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleActionArgs.Builder]*):
        com.pulumi.aws.alb.ListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleConditionArgs.Builder]*):
        com.pulumi.aws.alb.ListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param transforms Configuration block that defines the transform to apply to requests matching this rule. See Transform Blocks below for more details. Once specified, to remove the transform from the rule, remove the `transform` block from the configuration.
     * @return builder
     */
    def transforms(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleTransformArgs.Builder]*):
        com.pulumi.aws.alb.ListenerRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleTransformArgs.builder
      builder.transforms(args.map(_(argsBuilder).build)*)

  /**
   * Provides a Load Balancer resource.
   *  
   *  &gt; **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
   */
  def LoadBalancer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.alb.LoadBalancerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.alb.LoadBalancerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.alb.LoadBalancer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type AlbFunctions = com.pulumi.aws.alb.AlbFunctions
  object AlbFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.alb.AlbFunctions.*
  extension (self: AlbFunctions.type)
    /**
     * &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer Listener.
     *  
     *  This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
     */
    def getListener(args: Endofunction[com.pulumi.aws.alb.inputs.GetListenerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.alb.outputs.GetListenerResult] =
      val argsBuilder = com.pulumi.aws.alb.inputs.GetListenerArgs.builder
      com.pulumi.aws.alb.AlbFunctions.getListener(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer Listener.
     *  
     *  This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
     */
    def getListenerPlain(args: Endofunction[com.pulumi.aws.alb.inputs.GetListenerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.alb.outputs.GetListenerResult] =
      val argsBuilder = com.pulumi.aws.alb.inputs.GetListenerPlainArgs.builder
      com.pulumi.aws.alb.AlbFunctions.getListenerPlain(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer.
     *  
     *  This data source can prove useful when a module accepts an LB as an input
     *  variable and needs to, for example, determine the security groups associated
     *  with it, etc.
     */
    def getLoadBalancer(args: Endofunction[com.pulumi.aws.alb.inputs.GetLoadBalancerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.alb.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.aws.alb.inputs.GetLoadBalancerArgs.builder
      com.pulumi.aws.alb.AlbFunctions.getLoadBalancer(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer.
     *  
     *  This data source can prove useful when a module accepts an LB as an input
     *  variable and needs to, for example, determine the security groups associated
     *  with it, etc.
     */
    def getLoadBalancerPlain(args: Endofunction[com.pulumi.aws.alb.inputs.GetLoadBalancerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.alb.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.aws.alb.inputs.GetLoadBalancerPlainArgs.builder
      com.pulumi.aws.alb.AlbFunctions.getLoadBalancerPlain(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer Target Group.
     *  
     *  This data source can prove useful when a module accepts an LB Target Group as an
     *  input variable and needs to know its attributes. It can also be used to get the ARN of
     *  an LB Target Group for use in other resources, given LB Target Group name.
     */
    def getTargetGroup(args: Endofunction[com.pulumi.aws.alb.inputs.GetTargetGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.alb.outputs.GetTargetGroupResult] =
      val argsBuilder = com.pulumi.aws.alb.inputs.GetTargetGroupArgs.builder
      com.pulumi.aws.alb.AlbFunctions.getTargetGroup(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
     *  
     *  Provides information about a Load Balancer Target Group.
     *  
     *  This data source can prove useful when a module accepts an LB Target Group as an
     *  input variable and needs to know its attributes. It can also be used to get the ARN of
     *  an LB Target Group for use in other resources, given LB Target Group name.
     */
    def getTargetGroupPlain(args: Endofunction[com.pulumi.aws.alb.inputs.GetTargetGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.alb.outputs.GetTargetGroupResult] =
      val argsBuilder = com.pulumi.aws.alb.inputs.GetTargetGroupPlainArgs.builder
      com.pulumi.aws.alb.AlbFunctions.getTargetGroupPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.alb.LoadBalancerArgs.Builder)
    /**
     * @param accessLogs Access Logs block. See below.
     * @return builder
     */
    def accessLogs(args: Endofunction[com.pulumi.aws.alb.inputs.LoadBalancerAccessLogsArgs.Builder]):
        com.pulumi.aws.alb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.LoadBalancerAccessLogsArgs.builder
      builder.accessLogs(args(argsBuilder).build)

    /**
     * @param connectionLogs Connection Logs block. See below. Only valid for Load Balancers of type `application`.
     * @return builder
     */
    def connectionLogs(args: Endofunction[com.pulumi.aws.alb.inputs.LoadBalancerConnectionLogsArgs.Builder]):
        com.pulumi.aws.alb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.LoadBalancerConnectionLogsArgs.builder
      builder.connectionLogs(args(argsBuilder).build)

    /**
     * @param healthCheckLogs Health Check Logs block. See below. Only valid for Load Balancers of type `application`.
     * @return builder
     */
    def healthCheckLogs(args: Endofunction[com.pulumi.aws.alb.inputs.LoadBalancerHealthCheckLogsArgs.Builder]):
        com.pulumi.aws.alb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.LoadBalancerHealthCheckLogsArgs.builder
      builder.healthCheckLogs(args(argsBuilder).build)

    /**
     * @param ipamPools . The IPAM pools to use with the load balancer.  Only valid for Load Balancers of type `application`. See ipamPools for more information.
     * @return builder
     */
    def ipamPools(args: Endofunction[com.pulumi.aws.alb.inputs.LoadBalancerIpamPoolsArgs.Builder]):
        com.pulumi.aws.alb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.LoadBalancerIpamPoolsArgs.builder
      builder.ipamPools(args(argsBuilder).build)

    /**
     * @param minimumLoadBalancerCapacity Minimum capacity for a load balancer. Only valid for Load Balancers of type `application` or `network`.
     * @return builder
     */
    def minimumLoadBalancerCapacity(args: Endofunction[com.pulumi.aws.alb.inputs.LoadBalancerMinimumLoadBalancerCapacityArgs.Builder]):
        com.pulumi.aws.alb.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.LoadBalancerMinimumLoadBalancerCapacityArgs.builder
      builder.minimumLoadBalancerCapacity(args(argsBuilder).build)

    /**
     * @param subnetMappings Subnet mapping block. See below. For Load Balancers of type `network` subnet mappings can only be added.
     * @return builder
     */
    def subnetMappings(args: Endofunction[com.pulumi.aws.alb.inputs.LoadBalancerSubnetMappingArgs.Builder]*):
        com.pulumi.aws.alb.LoadBalancerArgs.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.LoadBalancerSubnetMappingArgs.builder
      builder.subnetMappings(args.map(_(argsBuilder).build)*)

  /**
   * Provides a Load Balancer Listener resource.
   *  
   *  &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
   */
  def Listener(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.alb.ListenerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.alb.ListenerArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.alb.Listener(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.alb.ListenerArgs.Builder)
    /**
     * @param defaultActions Configuration block for default actions. See below.
     * @return builder
     */
    def defaultActions(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerDefaultActionArgs.Builder]*):
        com.pulumi.aws.alb.ListenerArgs.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.ListenerDefaultActionArgs.builder
      builder.defaultActions(args.map(_(argsBuilder).build)*)

    /**
     * @param mutualAuthentication The mutual authentication configuration information. See below.
     * @return builder
     */
    def mutualAuthentication(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerMutualAuthenticationArgs.Builder]):
        com.pulumi.aws.alb.ListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerMutualAuthenticationArgs.builder
      builder.mutualAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.alb.inputs.TargetGroupTargetGroupHealthArgs.Builder)
    /**
     * @param dnsFailover Block to configure DNS Failover requirements. See DNS Failover below for details on attributes.
     * @return builder
     */
    def dnsFailover(args: Endofunction[com.pulumi.aws.alb.inputs.TargetGroupTargetGroupHealthDnsFailoverArgs.Builder]):
        com.pulumi.aws.alb.inputs.TargetGroupTargetGroupHealthArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.TargetGroupTargetGroupHealthDnsFailoverArgs.builder
      builder.dnsFailover(args(argsBuilder).build)

    /**
     * @param unhealthyStateRouting Block to configure Unhealthy State Routing requirements. See Unhealthy State Routing below for details on attributes.
     * @return builder
     */
    def unhealthyStateRouting(args: Endofunction[com.pulumi.aws.alb.inputs.TargetGroupTargetGroupHealthUnhealthyStateRoutingArgs.Builder]):
        com.pulumi.aws.alb.inputs.TargetGroupTargetGroupHealthArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.TargetGroupTargetGroupHealthUnhealthyStateRoutingArgs.builder
      builder.unhealthyStateRouting(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.alb.inputs.ListenerState.Builder)
    /**
     * @param defaultActions Configuration block for default actions. See below.
     * @return builder
     */
    def defaultActions(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerDefaultActionArgs.Builder]*):
        com.pulumi.aws.alb.inputs.ListenerState.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.ListenerDefaultActionArgs.builder
      builder.defaultActions(args.map(_(argsBuilder).build)*)

    /**
     * @param mutualAuthentication The mutual authentication configuration information. See below.
     * @return builder
     */
    def mutualAuthentication(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerMutualAuthenticationArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerState.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerMutualAuthenticationArgs.builder
      builder.mutualAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.alb.inputs.ListenerRuleActionForwardArgs.Builder)
    /**
     * @param stickiness The target group stickiness for the rule.
     * @return builder
     */
    def stickiness(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleActionForwardStickinessArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleActionForwardArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleActionForwardStickinessArgs.builder
      builder.stickiness(args(argsBuilder).build)

    /**
     * @param targetGroups One or more target group blocks.
     * @return builder
     */
    def targetGroups(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleActionForwardTargetGroupArgs.Builder]*):
        com.pulumi.aws.alb.inputs.ListenerRuleActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleActionForwardTargetGroupArgs.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.alb.inputs.ListenerDefaultActionJwtValidationArgs.Builder)
    /**
     * @param additionalClaims Repeatable configuration block for additional claims to validate.
     * @return builder
     */
    def additionalClaims(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerDefaultActionJwtValidationAdditionalClaimArgs.Builder]*):
        com.pulumi.aws.alb.inputs.ListenerDefaultActionJwtValidationArgs.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.ListenerDefaultActionJwtValidationAdditionalClaimArgs.builder
      builder.additionalClaims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.alb.inputs.LoadBalancerState.Builder)
    /**
     * @param accessLogs Access Logs block. See below.
     * @return builder
     */
    def accessLogs(args: Endofunction[com.pulumi.aws.alb.inputs.LoadBalancerAccessLogsArgs.Builder]):
        com.pulumi.aws.alb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.LoadBalancerAccessLogsArgs.builder
      builder.accessLogs(args(argsBuilder).build)

    /**
     * @param connectionLogs Connection Logs block. See below. Only valid for Load Balancers of type `application`.
     * @return builder
     */
    def connectionLogs(args: Endofunction[com.pulumi.aws.alb.inputs.LoadBalancerConnectionLogsArgs.Builder]):
        com.pulumi.aws.alb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.LoadBalancerConnectionLogsArgs.builder
      builder.connectionLogs(args(argsBuilder).build)

    /**
     * @param healthCheckLogs Health Check Logs block. See below. Only valid for Load Balancers of type `application`.
     * @return builder
     */
    def healthCheckLogs(args: Endofunction[com.pulumi.aws.alb.inputs.LoadBalancerHealthCheckLogsArgs.Builder]):
        com.pulumi.aws.alb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.LoadBalancerHealthCheckLogsArgs.builder
      builder.healthCheckLogs(args(argsBuilder).build)

    /**
     * @param ipamPools . The IPAM pools to use with the load balancer.  Only valid for Load Balancers of type `application`. See ipamPools for more information.
     * @return builder
     */
    def ipamPools(args: Endofunction[com.pulumi.aws.alb.inputs.LoadBalancerIpamPoolsArgs.Builder]):
        com.pulumi.aws.alb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.LoadBalancerIpamPoolsArgs.builder
      builder.ipamPools(args(argsBuilder).build)

    /**
     * @param minimumLoadBalancerCapacity Minimum capacity for a load balancer. Only valid for Load Balancers of type `application` or `network`.
     * @return builder
     */
    def minimumLoadBalancerCapacity(args: Endofunction[com.pulumi.aws.alb.inputs.LoadBalancerMinimumLoadBalancerCapacityArgs.Builder]):
        com.pulumi.aws.alb.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.LoadBalancerMinimumLoadBalancerCapacityArgs.builder
      builder.minimumLoadBalancerCapacity(args(argsBuilder).build)

    /**
     * @param subnetMappings Subnet mapping block. See below. For Load Balancers of type `network` subnet mappings can only be added.
     * @return builder
     */
    def subnetMappings(args: Endofunction[com.pulumi.aws.alb.inputs.LoadBalancerSubnetMappingArgs.Builder]*):
        com.pulumi.aws.alb.inputs.LoadBalancerState.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.LoadBalancerSubnetMappingArgs.builder
      builder.subnetMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.alb.inputs.TargetGroupState.Builder)
    /**
     * @param healthCheck Health Check configuration block. Detailed below.
     * @return builder
     */
    def healthCheck(args: Endofunction[com.pulumi.aws.alb.inputs.TargetGroupHealthCheckArgs.Builder]):
        com.pulumi.aws.alb.inputs.TargetGroupState.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.TargetGroupHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param stickiness Stickiness configuration block. Detailed below.
     * @return builder
     */
    def stickiness(args: Endofunction[com.pulumi.aws.alb.inputs.TargetGroupStickinessArgs.Builder]):
        com.pulumi.aws.alb.inputs.TargetGroupState.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.TargetGroupStickinessArgs.builder
      builder.stickiness(args(argsBuilder).build)

    /**
     * @param targetFailovers Target failover block. Only applicable for Gateway Load Balancer target groups. See targetFailover for more information.
     * @return builder
     */
    def targetFailovers(args: Endofunction[com.pulumi.aws.alb.inputs.TargetGroupTargetFailoverArgs.Builder]*):
        com.pulumi.aws.alb.inputs.TargetGroupState.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.TargetGroupTargetFailoverArgs.builder
      builder.targetFailovers(args.map(_(argsBuilder).build)*)

    /**
     * @param targetGroupHealth Target health requirements block. See targetGroupHealth for more information.
     * @return builder
     */
    def targetGroupHealth(args: Endofunction[com.pulumi.aws.alb.inputs.TargetGroupTargetGroupHealthArgs.Builder]):
        com.pulumi.aws.alb.inputs.TargetGroupState.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.TargetGroupTargetGroupHealthArgs.builder
      builder.targetGroupHealth(args(argsBuilder).build)

    /**
     * @param targetHealthStates Target health state block. Only applicable for Network Load Balancer target groups when `protocol` is `TCP` or `TLS`. See targetHealthState for more information.
     * @return builder
     */
    def targetHealthStates(args: Endofunction[com.pulumi.aws.alb.inputs.TargetGroupTargetHealthStateArgs.Builder]*):
        com.pulumi.aws.alb.inputs.TargetGroupState.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.TargetGroupTargetHealthStateArgs.builder
      builder.targetHealthStates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.alb.inputs.ListenerRuleActionJwtValidationArgs.Builder)
    /**
     * @param additionalClaims Repeatable configuration block for additional claims to validate.
     * @return builder
     */
    def additionalClaims(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleActionJwtValidationAdditionalClaimArgs.Builder]*):
        com.pulumi.aws.alb.inputs.ListenerRuleActionJwtValidationArgs.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleActionJwtValidationAdditionalClaimArgs.builder
      builder.additionalClaims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.alb.inputs.ListenerDefaultActionArgs.Builder)
    /**
     * @param authenticateCognito Configuration block for using Amazon Cognito to authenticate users. Specify only when `type` is `authenticate-cognito`. See below.
     * @return builder
     */
    def authenticateCognito(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerDefaultActionAuthenticateCognitoArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerDefaultActionAuthenticateCognitoArgs.builder
      builder.authenticateCognito(args(argsBuilder).build)

    /**
     * @param authenticateOidc Configuration block for an identity provider that is compliant with OpenID Connect (OIDC). Specify only when `type` is `authenticate-oidc`. See below.
     * @return builder
     */
    def authenticateOidc(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerDefaultActionAuthenticateOidcArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerDefaultActionAuthenticateOidcArgs.builder
      builder.authenticateOidc(args(argsBuilder).build)

    /**
     * @param fixedResponse Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * @return builder
     */
    def fixedResponse(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerDefaultActionFixedResponseArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerDefaultActionFixedResponseArgs.builder
      builder.fixedResponse(args(argsBuilder).build)

    /**
     * @param forward Configuration block for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. See below.
     * @return builder
     */
    def forward(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerDefaultActionForwardArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerDefaultActionForwardArgs.builder
      builder.forward(args(argsBuilder).build)

    /**
     * @param jwtValidation Configuration block for creating a JWT validation action. Required if `type` is `jwt-validation`.
     * @return builder
     */
    def jwtValidation(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerDefaultActionJwtValidationArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerDefaultActionJwtValidationArgs.builder
      builder.jwtValidation(args(argsBuilder).build)

    /**
     * @param redirect Configuration block for creating a redirect action. Required if `type` is `redirect`. See below.
     * @return builder
     */
    def redirect(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerDefaultActionRedirectArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerDefaultActionRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.alb.inputs.ListenerRuleState.Builder)
    /**
     * @param actions An Action block. Action blocks are documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleActionArgs.Builder]*):
        com.pulumi.aws.alb.inputs.ListenerRuleState.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleConditionArgs.Builder]*):
        com.pulumi.aws.alb.inputs.ListenerRuleState.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param transforms Configuration block that defines the transform to apply to requests matching this rule. See Transform Blocks below for more details. Once specified, to remove the transform from the rule, remove the `transform` block from the configuration.
     * @return builder
     */
    def transforms(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleTransformArgs.Builder]*):
        com.pulumi.aws.alb.inputs.ListenerRuleState.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleTransformArgs.builder
      builder.transforms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.alb.inputs.ListenerRuleTransformHostHeaderRewriteConfigArgs.Builder)
    /**
     * @param rewrite Block for host header rewrite configuration. Only one block is accepted. See Rewrite Blocks below.
     * @return builder
     */
    def rewrite(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleTransformHostHeaderRewriteConfigRewriteArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleTransformHostHeaderRewriteConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleTransformHostHeaderRewriteConfigRewriteArgs.builder
      builder.rewrite(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.alb.inputs.ListenerRuleTransformArgs.Builder)
    /**
     * @param hostHeaderRewriteConfig Configuration block for host header rewrite. Required if `type` is `host-header-rewrite`. See Host Header Rewrite Config Blocks below.
     * @return builder
     */
    def hostHeaderRewriteConfig(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleTransformHostHeaderRewriteConfigArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleTransformHostHeaderRewriteConfigArgs.builder
      builder.hostHeaderRewriteConfig(args(argsBuilder).build)

    /**
     * @param urlRewriteConfig Configuration block for URL rewrite. Required if `type` is `url-rewrite`. See URL Rewrite Config Blocks below.
     * @return builder
     */
    def urlRewriteConfig(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleTransformUrlRewriteConfigArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleTransformArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleTransformUrlRewriteConfigArgs.builder
      builder.urlRewriteConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.alb.inputs.ListenerRuleActionArgs.Builder)
    /**
     * @param authenticateCognito Information for creating an authenticate action using Cognito. Required if `type` is `authenticate-cognito`.
     * @return builder
     */
    def authenticateCognito(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleActionAuthenticateCognitoArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleActionAuthenticateCognitoArgs.builder
      builder.authenticateCognito(args(argsBuilder).build)

    /**
     * @param authenticateOidc Information for creating an authenticate action using OIDC. Required if `type` is `authenticate-oidc`.
     * @return builder
     */
    def authenticateOidc(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleActionAuthenticateOidcArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleActionAuthenticateOidcArgs.builder
      builder.authenticateOidc(args(argsBuilder).build)

    /**
     * @param fixedResponse Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * @return builder
     */
    def fixedResponse(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleActionFixedResponseArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleActionFixedResponseArgs.builder
      builder.fixedResponse(args(argsBuilder).build)

    /**
     * @param forward Configuration block for creating an action that distributes requests among one or more target groups.
     *  Specify only if `type` is `forward`.
     *  Cannot be specified with `targetGroupArn`.
     * @return builder
     */
    def forward(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleActionForwardArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleActionForwardArgs.builder
      builder.forward(args(argsBuilder).build)

    /**
     * @param jwtValidation Information for creating a JWT validation action. Required if `type` is `jwt-validation`.
     * @return builder
     */
    def jwtValidation(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleActionJwtValidationArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleActionJwtValidationArgs.builder
      builder.jwtValidation(args(argsBuilder).build)

    /**
     * @param redirect Information for creating a redirect action. Required if `type` is `redirect`.
     * @return builder
     */
    def redirect(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleActionRedirectArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleActionRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.alb.inputs.ListenerRuleConditionArgs.Builder)
    /**
     * @param hostHeader Host header patterns to match. Host Header block fields documented below.
     * @return builder
     */
    def hostHeader(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleConditionHostHeaderArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleConditionHostHeaderArgs.builder
      builder.hostHeader(args(argsBuilder).build)

    /**
     * @param httpHeader HTTP headers to match. HTTP Header block fields documented below.
     * @return builder
     */
    def httpHeader(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleConditionHttpHeaderArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleConditionHttpHeaderArgs.builder
      builder.httpHeader(args(argsBuilder).build)

    /**
     * @param httpRequestMethod Contains a single `values` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
     * @return builder
     */
    def httpRequestMethod(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleConditionHttpRequestMethodArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleConditionHttpRequestMethodArgs.builder
      builder.httpRequestMethod(args(argsBuilder).build)

    /**
     * @param pathPattern Path patterns to match against the request URL. Path Pattern block fields documented below.
     * @return builder
     */
    def pathPattern(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleConditionPathPatternArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleConditionPathPatternArgs.builder
      builder.pathPattern(args(argsBuilder).build)

    /**
     * @param queryStrings Query strings to match. Query String block fields documented below.
     * @return builder
     */
    def queryStrings(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleConditionQueryStringArgs.Builder]*):
        com.pulumi.aws.alb.inputs.ListenerRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleConditionQueryStringArgs.builder
      builder.queryStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceIp Contains a single `values` item which is a list of source IP CIDR notations to match. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. Condition is satisfied if the source IP address of the request matches one of the CIDR blocks. Condition is not satisfied by the addresses in the `X-Forwarded-For` header, use `httpHeader` condition instead.
     *  
     *  &gt; **NOTE::** Exactly one of `hostHeader`, `httpHeader`, `httpRequestMethod`, `pathPattern`, `queryString` or `sourceIp` must be set per condition.
     * @return builder
     */
    def sourceIp(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleConditionSourceIpArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleConditionSourceIpArgs.builder
      builder.sourceIp(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.alb.inputs.ListenerDefaultActionForwardArgs.Builder)
    /**
     * @param stickiness Configuration block for target group stickiness for the rule. See below.
     * @return builder
     */
    def stickiness(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerDefaultActionForwardStickinessArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerDefaultActionForwardArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerDefaultActionForwardStickinessArgs.builder
      builder.stickiness(args(argsBuilder).build)

    /**
     * @param targetGroups Set of 1-5 target group blocks. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def targetGroups(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerDefaultActionForwardTargetGroupArgs.Builder]*):
        com.pulumi.aws.alb.inputs.ListenerDefaultActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.alb.inputs.ListenerDefaultActionForwardTargetGroupArgs.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.alb.inputs.ListenerRuleTransformUrlRewriteConfigArgs.Builder)
    /**
     * @param rewrite Block for URL rewrite configuration. Only one block is accepted. See Rewrite Blocks below.
     * @return builder
     */
    def rewrite(args: Endofunction[com.pulumi.aws.alb.inputs.ListenerRuleTransformUrlRewriteConfigRewriteArgs.Builder]):
        com.pulumi.aws.alb.inputs.ListenerRuleTransformUrlRewriteConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.alb.inputs.ListenerRuleTransformUrlRewriteConfigRewriteArgs.builder
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
   *  $ pulumi import aws:alb/listenerRule:ListenerRule front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener-rule/app/test/8e4497da625e2d8a/9ab28ade35828f96/67b3d2d36dd7c26b
   *  ```
   */
  def ListenerRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.alb.ListenerRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.alb.ListenerRuleArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.alb.ListenerRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
