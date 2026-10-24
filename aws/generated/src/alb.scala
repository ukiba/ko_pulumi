package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object alb:
  object AlbFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
     * 
     * Provides information about a Load Balancer Listener.
     * 
     * This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
     */
    inline def getListener(args: Endofunction[com.pulumi.aws.alb.inputs.GetListenerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.alb.outputs.GetListenerResult] =
      val argsBuilder = com.pulumi.aws.alb.inputs.GetListenerArgs.builder
      com.pulumi.aws.alb.AlbFunctions.getListener(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
     * 
     * Provides information about a Load Balancer Listener.
     * 
     * This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
     */
    inline def getListenerPlain(args: Endofunction[com.pulumi.aws.alb.inputs.GetListenerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.alb.outputs.GetListenerResult] =
      val argsBuilder = com.pulumi.aws.alb.inputs.GetListenerPlainArgs.builder
      com.pulumi.aws.alb.AlbFunctions.getListenerPlain(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
     * 
     * Provides information about a Load Balancer.
     * 
     * This data source can prove useful when a module accepts an LB as an input
     * variable and needs to, for example, determine the security groups associated
     * with it, etc.
     */
    inline def getLoadBalancer(args: Endofunction[com.pulumi.aws.alb.inputs.GetLoadBalancerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.alb.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.aws.alb.inputs.GetLoadBalancerArgs.builder
      com.pulumi.aws.alb.AlbFunctions.getLoadBalancer(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
     * 
     * Provides information about a Load Balancer.
     * 
     * This data source can prove useful when a module accepts an LB as an input
     * variable and needs to, for example, determine the security groups associated
     * with it, etc.
     */
    inline def getLoadBalancerPlain(args: Endofunction[com.pulumi.aws.alb.inputs.GetLoadBalancerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.alb.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.aws.alb.inputs.GetLoadBalancerPlainArgs.builder
      com.pulumi.aws.alb.AlbFunctions.getLoadBalancerPlain(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
     * 
     * Provides information about a Load Balancer Target Group.
     * 
     * This data source can prove useful when a module accepts an LB Target Group as an
     * input variable and needs to know its attributes. It can also be used to get the ARN of
     * an LB Target Group for use in other resources, given LB Target Group name.
     */
    inline def getTargetGroup(args: Endofunction[com.pulumi.aws.alb.inputs.GetTargetGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.alb.outputs.GetTargetGroupResult] =
      val argsBuilder = com.pulumi.aws.alb.inputs.GetTargetGroupArgs.builder
      com.pulumi.aws.alb.AlbFunctions.getTargetGroup(args(argsBuilder).build)

    /**
     * &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
     * 
     * Provides information about a Load Balancer Target Group.
     * 
     * This data source can prove useful when a module accepts an LB Target Group as an
     * input variable and needs to know its attributes. It can also be used to get the ARN of
     * an LB Target Group for use in other resources, given LB Target Group name.
     */
    inline def getTargetGroupPlain(args: Endofunction[com.pulumi.aws.alb.inputs.GetTargetGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.alb.outputs.GetTargetGroupResult] =
      val argsBuilder = com.pulumi.aws.alb.inputs.GetTargetGroupPlainArgs.builder
      com.pulumi.aws.alb.AlbFunctions.getTargetGroupPlain(args(argsBuilder).build)

  /**
   * Provides a Load Balancer Listener resource.
   * 
   * &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
   */
  def Listener(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.alb.ListenerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.alb.ListenerArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.alb.Listener(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a Load Balancer Listener Certificate resource.
   * 
   * This resource is for additional certificates and does not replace the default certificate on the listener.
   * 
   * &gt; **Note:** `aws.alb.ListenerCertificate` is known as `aws.lb.ListenerCertificate`. The functionality is identical.
   */
  def ListenerCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.alb.ListenerCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.alb.ListenerCertificateArgs.builder
    com.pulumi.aws.alb.ListenerCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
   * \$ pulumi import aws:alb/listenerRule:ListenerRule front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener-rule/app/test/8e4497da625e2d8a/9ab28ade35828f96/67b3d2d36dd7c26b
   * ```
   */
  def ListenerRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.alb.ListenerRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.alb.ListenerRuleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.alb.ListenerRule(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a Load Balancer resource.
   * 
   * &gt; **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
   */
  def LoadBalancer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.alb.LoadBalancerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.alb.LoadBalancerArgs.builder
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
    com.pulumi.aws.alb.LoadBalancer(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a Target Group resource for use with Load Balancer resources.
   * 
   * &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
   */
  def TargetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.alb.TargetGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.alb.TargetGroupArgs.builder
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
    com.pulumi.aws.alb.TargetGroup(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides the ability to register instances and containers with an Application Load Balancer (ALB) or Network Load Balancer (NLB) target group. For attaching resources with Elastic Load Balancer (ELB), see the `aws.elb.Attachment` resource.
   * 
   * &gt; **Note:** `aws.alb.TargetGroupAttachment` is known as `aws.lb.TargetGroupAttachment`. The functionality is identical.
   */
  def TargetGroupAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.alb.TargetGroupAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.alb.TargetGroupAttachmentArgs.builder
    com.pulumi.aws.alb.TargetGroupAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
