package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object lb:
  object LbFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get the HostedZoneId of the AWS Elastic Load Balancing (ELB) in a given region for the purpose of using in an AWS Route53 Alias. Specify the ELB type (`network` or `application`) to return the relevant the associated HostedZoneId. Ref: [ELB service endpoints](https://docs.aws.amazon.com/general/latest/gr/elb.html#elb_region) */
    inline def getHostedZoneId(args: Endofunction[com.pulumi.aws.lb.inputs.GetHostedZoneIdArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetHostedZoneIdResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetHostedZoneIdArgs.builder
      com.pulumi.aws.lb.LbFunctions.getHostedZoneId(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get the HostedZoneId of the AWS Elastic Load Balancing (ELB) in a given region for the purpose of using in an AWS Route53 Alias. Specify the ELB type (`network` or `application`) to return the relevant the associated HostedZoneId. Ref: [ELB service endpoints](https://docs.aws.amazon.com/general/latest/gr/elb.html#elb_region) */
    inline def getHostedZoneIdPlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetHostedZoneIdPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetHostedZoneIdResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetHostedZoneIdPlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getHostedZoneIdPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get a list of Load Balancer ARNs matching the specified criteria. Useful for passing to other
     * resources.
     */
    inline def getLbs(args: Endofunction[com.pulumi.aws.lb.inputs.GetLbsArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetLbsResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetLbsArgs.builder
      com.pulumi.aws.lb.LbFunctions.getLbs(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get a list of Load Balancer ARNs matching the specified criteria. Useful for passing to other
     * resources.
     */
    inline def getLbsPlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetLbsPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetLbsResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetLbsPlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getLbsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
     * 
     * Provides information about a Load Balancer Listener.
     * 
     * This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
     */
    inline def getListener(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetListenerResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetListenerArgs.builder
      com.pulumi.aws.lb.LbFunctions.getListener(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
     * 
     * Provides information about a Load Balancer Listener.
     * 
     * This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
     */
    inline def getListenerPlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetListenerResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetListenerPlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getListenerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides information about an AWS Elastic Load Balancing Listener Rule. */
    inline def getListenerRule(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRuleArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetListenerRuleResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRuleArgs.builder
      com.pulumi.aws.lb.LbFunctions.getListenerRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about an AWS Elastic Load Balancing Listener Rule. */
    inline def getListenerRulePlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetListenerRulePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetListenerRuleResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetListenerRulePlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getListenerRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * &gt; **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
     * 
     * Provides information about a Load Balancer.
     * 
     * This data source can prove useful when a module accepts an LB as an input
     * variable and needs to, for example, determine the security groups associated
     * with it, etc.
     */
    inline def getLoadBalancer(args: Endofunction[com.pulumi.aws.lb.inputs.GetLoadBalancerArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetLoadBalancerArgs.builder
      com.pulumi.aws.lb.LbFunctions.getLoadBalancer(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * &gt; **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
     * 
     * Provides information about a Load Balancer.
     * 
     * This data source can prove useful when a module accepts an LB as an input
     * variable and needs to, for example, determine the security groups associated
     * with it, etc.
     */
    inline def getLoadBalancerPlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetLoadBalancerPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetLoadBalancerPlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getLoadBalancerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
     * 
     * Provides information about a Load Balancer Target Group.
     * 
     * This data source can prove useful when a module accepts an LB Target Group as an
     * input variable and needs to know its attributes. It can also be used to get the ARN of
     * an LB Target Group for use in other resources, given LB Target Group name.
     */
    inline def getTargetGroup(args: Endofunction[com.pulumi.aws.lb.inputs.GetTargetGroupArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetTargetGroupResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetTargetGroupArgs.builder
      com.pulumi.aws.lb.LbFunctions.getTargetGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
     * 
     * Provides information about a Load Balancer Target Group.
     * 
     * This data source can prove useful when a module accepts an LB Target Group as an
     * input variable and needs to know its attributes. It can also be used to get the ARN of
     * an LB Target Group for use in other resources, given LB Target Group name.
     */
    inline def getTargetGroupPlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetTargetGroupPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetTargetGroupResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetTargetGroupPlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getTargetGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Provides information about a Load Balancer Trust Store.
     * 
     * This data source can prove useful when a module accepts an LB Trust Store as an
     * input variable and needs to know its attributes. It can also be used to get the ARN of
     * an LB Trust Store for use in other resources, given LB Trust Store name.
     */
    inline def getTrustStore(args: Endofunction[com.pulumi.aws.lb.inputs.GetTrustStoreArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.lb.outputs.GetTrustStoreResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetTrustStoreArgs.builder
      com.pulumi.aws.lb.LbFunctions.getTrustStore(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Provides information about a Load Balancer Trust Store.
     * 
     * This data source can prove useful when a module accepts an LB Trust Store as an
     * input variable and needs to know its attributes. It can also be used to get the ARN of
     * an LB Trust Store for use in other resources, given LB Trust Store name.
     */
    inline def getTrustStorePlain(args: Endofunction[com.pulumi.aws.lb.inputs.GetTrustStorePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lb.outputs.GetTrustStoreResult] =
      val argsBuilder = com.pulumi.aws.lb.inputs.GetTrustStorePlainArgs.builder
      com.pulumi.aws.lb.LbFunctions.getTrustStorePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Provides a Load Balancer Listener resource.
   * 
   * &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
   */
  def Listener(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lb.ListenerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lb.ListenerArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.lb.Listener(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a Load Balancer Listener Certificate resource.
   * 
   * This resource is for additional certificates and does not replace the default certificate on the listener.
   * 
   * &gt; **Note:** `aws.alb.ListenerCertificate` is known as `aws.lb.ListenerCertificate`. The functionality is identical.
   */
  def ListenerCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lb.ListenerCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lb.ListenerCertificateArgs.builder
    com.pulumi.aws.lb.ListenerCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a Load Balancer Listener Rule resource.
   * 
   * &gt; **Note:** `aws.alb.ListenerRule` is known as `aws.lb.ListenerRule`. The functionality is identical.
   * 
   * #### Required
   * 
   * - `arn` (String) ARN of the load balancer listener rule.
   * 
   * Using `pulumi import`, import rules using their ARN. For example:
   * 
   * ```sh
   * \$ pulumi import aws:lb/listenerRule:ListenerRule front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener-rule/app/test/8e4497da625e2d8a/9ab28ade35828f96/67b3d2d36dd7c26b
   * ```
   */
  def ListenerRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lb.ListenerRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lb.ListenerRuleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.lb.ListenerRule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a Load Balancer resource.
   * 
   * &gt; **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
   */
  def LoadBalancer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lb.LoadBalancerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lb.LoadBalancerArgs.builder
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
    com.pulumi.aws.lb.LoadBalancer(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a Target Group resource for use with Load Balancer resources.
   * 
   * &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
   */
  def TargetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lb.TargetGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lb.TargetGroupArgs.builder
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
    com.pulumi.aws.lb.TargetGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides the ability to register instances and containers with an Application Load Balancer (ALB) or Network Load Balancer (NLB) target group. For attaching resources with Elastic Load Balancer (ELB), see the `aws.elb.Attachment` resource.
   * 
   * &gt; **Note:** `aws.alb.TargetGroupAttachment` is known as `aws.lb.TargetGroupAttachment`. The functionality is identical.
   */
  def TargetGroupAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lb.TargetGroupAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lb.TargetGroupAttachmentArgs.builder
    com.pulumi.aws.lb.TargetGroupAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a ELBv2 Trust Store for use with Application Load Balancer Listener resources. */
  def TrustStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lb.TrustStoreArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lb.TrustStoreArgs.builder
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
    com.pulumi.aws.lb.TrustStore(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a ELBv2 Trust Store Revocation for use with Application Load Balancer Listener resources. */
  def TrustStoreRevocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lb.TrustStoreRevocationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lb.TrustStoreRevocationArgs.builder
    com.pulumi.aws.lb.TrustStoreRevocation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
