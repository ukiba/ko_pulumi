package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object autoscaling:
  /**
   * Attaches a load balancer to an Auto Scaling group.
   * 
   * &gt; **NOTE on Auto Scaling groups, Attachments and Traffic Source Attachments:** Pulumi provides standalone Attachment (for attaching Classic Load Balancers and Application Load Balancer, Gateway Load Balancer, or Network Load Balancer target groups) and Traffic Source Attachment (for attaching Load Balancers and VPC Lattice target groups) resources and an Auto Scaling group resource with `loadBalancers`, `targetGroupArns` and `trafficSource` attributes. Do not use the same traffic source in more than one of these resources. Doing so will cause a conflict of attachments. A `lifecycle` configuration block can be used to suppress differences if necessary.
   */
  def Attachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.AttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.autoscaling.AttachmentArgs.builder
    com.pulumi.aws.autoscaling.Attachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object AutoscalingFunctions:
    /**
     * The Auto Scaling groups data source allows access to the list of AWS
     * ASGs within a specific region. This will allow you to pass a list of Auto Scaling groups to other resources.
     */
    inline def getAmiIds(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GetAmiIdsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.autoscaling.outputs.GetAmiIdsResult] =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GetAmiIdsArgs.builder
      com.pulumi.aws.autoscaling.AutoscalingFunctions.getAmiIds(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * The Auto Scaling groups data source allows access to the list of AWS
     * ASGs within a specific region. This will allow you to pass a list of Auto Scaling groups to other resources.
     */
    inline def getAmiIdsPlain(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GetAmiIdsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.autoscaling.outputs.GetAmiIdsResult] =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GetAmiIdsPlainArgs.builder
      com.pulumi.aws.autoscaling.AutoscalingFunctions.getAmiIdsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information on an existing Auto Scaling group. */
    inline def getGroup(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GetGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.autoscaling.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GetGroupArgs.builder
      com.pulumi.aws.autoscaling.AutoscalingFunctions.getGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information on an existing Auto Scaling group. */
    inline def getGroupPlain(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GetGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.autoscaling.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GetGroupPlainArgs.builder
      com.pulumi.aws.autoscaling.AutoscalingFunctions.getGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Provides an Auto Scaling group resource.
   * 
   * &gt; **Note:** You must specify either `launchConfiguration`, `launchTemplate`, or `mixedInstancesPolicy`.
   * 
   * &gt; **NOTE on Auto Scaling groups, Attachments and Traffic Source Attachments:** Pulumi provides standalone Attachment (for attaching Classic Load Balancers and Application Load Balancer, Gateway Load Balancer, or Network Load Balancer target groups) and Traffic Source Attachment (for attaching Load Balancers and VPC Lattice target groups) resources and an Auto Scaling group resource with `loadBalancers`, `targetGroupArns` and `trafficSource` attributes. Do not use the same traffic source in more than one of these resources. Doing so will cause a conflict of attachments. A `lifecycle` configuration block can be used to suppress differences if necessary.
   * 
   * A newly-created ASG is initially empty and begins to scale to `minSize` (or
   * `desiredCapacity`, if specified) by launching instances using the provided
   * Launch Configuration. These instances take time to launch and boot.
   * 
   * On ASG Update, changes to these values also take time to result in the target
   * number of instances providing service.
   * 
   * This provider provides two mechanisms to help consistently manage ASG scale up
   * time across dependent resources.
   * 
   * #### Waiting for ASG Capacity
   * 
   * The first is default behavior. This provider waits after ASG creation for
   * `minSize` (or `desiredCapacity`, if specified) healthy instances to show up
   * in the ASG before continuing.
   * 
   * If `minSize` or `desiredCapacity` are changed in a subsequent update,
   * this provider will also wait for the correct number of healthy instances before
   * continuing.
   * 
   * This provider considers an instance &#34;healthy&#34; when the ASG reports `HealthStatus:
   * &#34;Healthy&#34;` and `LifecycleState: &#34;InService&#34;`. See the [AWS AutoScaling
   * Docs](https://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html)
   * for more information on an ASG&#39;s lifecycle.
   * 
   * This provider will wait for healthy instances for up to
   * `waitForCapacityTimeout`. If ASG creation is taking more than a few minutes,
   * it&#39;s worth investigating for scaling activity errors, which can be caused by
   * problems with the selected Launch Configuration.
   * 
   * Setting `waitForCapacityTimeout` to `&#34;0&#34;` disables ASG Capacity waiting.
   * 
   * #### Waiting for ELB Capacity
   * 
   * The second mechanism is optional, and affects ASGs with attached ELBs specified
   * via the `loadBalancers` attribute or with ALBs specified with `targetGroupArns`.
   * 
   * The `minElbCapacity` parameter causes the provider to wait for at least the
   * requested number of instances to show up `&#34;InService&#34;` in all attached ELBs
   * during ASG creation. It has no effect on ASG updates.
   * 
   * If `waitForElbCapacity` is set, the provider will wait for exactly that number
   * of Instances to be `&#34;InService&#34;` in all attached ELBs on both creation and
   * updates.
   * 
   * These parameters can be used to ensure that service is being provided before
   * the provider moves on. If new instances don&#39;t pass the ELB&#39;s health checks for any
   * reason, the apply will time out, and the ASG will be marked as
   * tainted (i.e., marked to be destroyed in a follow up run).
   * 
   * As with ASG Capacity, the provider will wait for up to `waitForCapacityTimeout`
   * for the proper number of instances to be healthy.
   * 
   * #### Troubleshooting Capacity Waiting Timeouts
   * 
   * If ASG creation takes more than a few minutes, this could indicate one of a
   * number of configuration problems. See the [AWS Docs on Load Balancer
   * Troubleshooting](https://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-troubleshooting.html)
   * for more information.
   */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.GroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.autoscaling.GroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.autoscaling.Group(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an AutoScaling Lifecycle Hook resource.
   * 
   * &gt; **NOTE:** This provider has two types of ways you can add lifecycle hooks - via
   * the `initialLifecycleHook` attribute from the
   * `aws.autoscaling.Group`
   * resource, or via this one. Hooks added via this resource will not be added
   * until the Auto Scaling group has been created, and depending on your
   * capacity
   * settings, after the initial instances have been launched, creating unintended
   * behavior. If you need hooks to run on all instances, add them with
   * `initialLifecycleHook` in
   * `aws.autoscaling.Group`,
   * but take care to not duplicate those hooks with this resource.
   */
  def LifecycleHook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.LifecycleHookArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.autoscaling.LifecycleHookArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.autoscaling.LifecycleHook(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an Auto Scaling group with Notification support, via SNS Topics. Each of
   * the `notifications` map to a [Notification Configuration](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeNotificationConfigurations.html) inside Amazon Web
   * Services, and are applied to each Auto Scaling group you supply.
   */
  def Notification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.NotificationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.autoscaling.NotificationArgs.builder
    com.pulumi.aws.autoscaling.Notification(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an AutoScaling Scaling Policy resource.
   * 
   * &gt; **NOTE:** You may want to omit `desiredCapacity` attribute from attached `aws.autoscaling.Group`
   * when using Auto Scaling policies. It&#39;s good practice to pick either
   * [manual](https://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-manual-scaling.html)
   * or [dynamic](https://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-scale-based-on-demand.html)
   * (policy-based) scaling.
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.PolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.autoscaling.PolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.autoscaling.Policy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AutoScaling Schedule resource. */
  def Schedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.ScheduleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.autoscaling.ScheduleArgs.builder
    com.pulumi.aws.autoscaling.Schedule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an individual Auto Scaling group (ASG) tag. This resource should only be used in cases where ASGs are created outside Pulumi (e.g., ASGs implicitly created by EKS Node Groups).
   * 
   * &gt; **NOTE:** This tagging resource should not be combined with the resource for managing the parent resource. For example, using `aws.autoscaling.Group` and `aws.autoscaling.Tag` to manage tags of the same ASG will cause a perpetual difference where the `aws.autoscaling.Group` resource will try to remove the tag being added by the `aws.autoscaling.Tag` resource.
   * 
   * &gt; **NOTE:** This tagging resource does not use the provider `ignoreTags` configuration.
   */
  def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.TagArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.autoscaling.TagArgs.builder
    com.pulumi.aws.autoscaling.Tag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Attaches a traffic source to an Auto Scaling group.
   * 
   * &gt; **NOTE on Auto Scaling groups, Attachments and Traffic Source Attachments:** Pulumi provides standalone Attachment (for attaching Classic Load Balancers and Application Load Balancer, Gateway Load Balancer, or Network Load Balancer target groups) and Traffic Source Attachment (for attaching Load Balancers and VPC Lattice target groups) resources and an Auto Scaling group resource with `loadBalancers`, `targetGroupArns` and `trafficSource` attributes. Do not use the same traffic source in more than one of these resources. Doing so will cause a conflict of attachments. A `lifecycle` configuration block can be used to suppress differences if necessary.
   */
  def TrafficSourceAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.TrafficSourceAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.autoscaling.TrafficSourceAttachmentArgs.builder
    com.pulumi.aws.autoscaling.TrafficSourceAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
