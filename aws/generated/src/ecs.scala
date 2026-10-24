package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object ecs:
  /**
   * Provides an ECS default account setting for a specific ECS Resource name within a specific region. More information can be found on the [ECS Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html).
   * 
   * &gt; **NOTE:** The AWS API does not delete this resource. When you run `destroy`, the provider will attempt to disable the setting.
   * 
   * &gt; **NOTE:** Your AWS account may not support disabling `containerInstanceLongArnFormat`, `serviceLongArnFormat`, and `taskLongArnFormat`. If your account does not support disabling these, &#34;destroying&#34; this resource will not disable the setting nor cause a provider error. However, the AWS Provider will log an AWS error: `InvalidParameterException: You can no longer disable Long Arn settings`.
   */
  def AccountSettingDefault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.AccountSettingDefaultArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.AccountSettingDefaultArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.ecs.AccountSettingDefault(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an ECS cluster capacity provider. More information can be found on the [ECS Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-capacity-providers.html).
   * 
   * &gt; **NOTE:** Associating an ECS Capacity Provider to an Auto Scaling group will automatically add the `AmazonECSManaged` tag to the Auto Scaling group. This tag should be included in the `aws.autoscaling.Group` resource configuration to prevent Terraform from removing it in subsequent executions as well as ensuring the `AmazonECSManaged` tag is propagated to all EC2 Instances in the Auto Scaling group if `minSize` is above 0 on creation. Any EC2 Instances in the Auto Scaling group without this tag must be manually be updated, otherwise they may cause unexpected scaling behavior and metrics.
   * 
   * &gt; **NOTE:** You must specify exactly one of `autoScalingGroupProvider` or `managedInstancesProvider`. When using `managedInstancesProvider`, the `cluster` parameter is required. When using `autoScalingGroupProvider`, the `cluster` parameter must not be set.
   * 
   * &gt; **NOTE:** AWS cannot delete a capacity provider that is still associated with a cluster through `aws.ecs.ClusterCapacityProviders`. When a change forces replacement, add a `replaceTriggeredBy` lifecycle rule to the `aws.ecs.ClusterCapacityProviders` resource so the association is recreated before the old capacity provider is deleted.
   */
  def CapacityProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.CapacityProviderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.CapacityProviderArgs.builder
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
    com.pulumi.aws.ecs.CapacityProvider(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an ECS cluster. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.ClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.ClusterArgs.builder
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
    com.pulumi.aws.ecs.Cluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the capacity providers of an ECS Cluster.
   * 
   * More information about capacity providers can be found in the [ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-capacity-providers.html).
   * 
   * &gt; **NOTE:** When an associated `aws.ecs.CapacityProvider` must be replaced, add a `replaceTriggeredBy` lifecycle rule referencing the capacity provider. This recreates the association so the old capacity provider is detached from the cluster before it is deleted, which AWS otherwise disallows.
   */
  def ClusterCapacityProviders(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.ClusterCapacityProvidersArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ecs.ClusterCapacityProvidersArgs.builder
    com.pulumi.aws.ecs.ClusterCapacityProviders(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an ECS Daemon resource, which manages a daemon that runs exactly one task on each container instance in an ECS cluster. */
  def Daemon(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.DaemonArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.DaemonArgs.builder
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
    com.pulumi.aws.ecs.Daemon(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a revision of an ECS daemon task definition for use with daemon scheduling strategy. */
  def DaemonTaskDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.DaemonTaskDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.DaemonTaskDefinitionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ecs.DaemonTaskDefinition(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object EcsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * The ECS Cluster data source allows access to details of a specific
     * cluster within an AWS ECS service.
     */
    inline def getCluster(args: Endofunction[com.pulumi.aws.ecs.inputs.GetClusterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecs.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetClusterArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getCluster(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * The ECS Cluster data source allows access to details of a specific
     * cluster within an AWS ECS service.
     */
    inline def getClusterPlain(args: Endofunction[com.pulumi.aws.ecs.inputs.GetClusterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecs.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getClusterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS ECS (Elastic Container) Clusters. */
    inline def getClusters(args: Endofunction[com.pulumi.aws.ecs.inputs.GetClustersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecs.outputs.GetClustersResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetClustersArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getClusters(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS ECS (Elastic Container) Clusters. */
    inline def getClustersPlain(args: Endofunction[com.pulumi.aws.ecs.inputs.GetClustersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecs.outputs.GetClustersResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetClustersPlainArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getClustersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * The ECS container definition data source allows access to details of
     * a specific container within an AWS ECS service.
     */
    inline def getContainerDefinition(args: Endofunction[com.pulumi.aws.ecs.inputs.GetContainerDefinitionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecs.outputs.GetContainerDefinitionResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetContainerDefinitionArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getContainerDefinition(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * The ECS container definition data source allows access to details of
     * a specific container within an AWS ECS service.
     */
    inline def getContainerDefinitionPlain(args: Endofunction[com.pulumi.aws.ecs.inputs.GetContainerDefinitionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecs.outputs.GetContainerDefinitionResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetContainerDefinitionPlainArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getContainerDefinitionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * The ECS Service data source allows access to details of a specific
     * Service within a AWS ECS Cluster.
     */
    inline def getService(args: Endofunction[com.pulumi.aws.ecs.inputs.GetServiceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecs.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetServiceArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * The ECS Service data source allows access to details of a specific
     * Service within a AWS ECS Cluster.
     */
    inline def getServicePlain(args: Endofunction[com.pulumi.aws.ecs.inputs.GetServicePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecs.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetServicePlainArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * The ECS task definition data source allows access to details of
     * a specific AWS ECS task definition.
     */
    inline def getTaskDefinition(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskDefinitionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecs.outputs.GetTaskDefinitionResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskDefinitionArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getTaskDefinition(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * The ECS task definition data source allows access to details of
     * a specific AWS ECS task definition.
     */
    inline def getTaskDefinitionPlain(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskDefinitionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecs.outputs.GetTaskDefinitionResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskDefinitionPlainArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getTaskDefinitionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source for managing an AWS ECS (Elastic Container) Task Execution. This data source calls the [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API, allowing execution of one-time tasks that don&#39;t fit a standard resource lifecycle. See the feature request issue for additional context.
     * 
     * &gt; **NOTE on preview operations:** This data source calls the `RunTask` API on every read operation, which means new task(s) may be created from a `pulumi preview` command if all attributes are known. Placing this functionality behind a data source is an intentional trade off to enable use cases requiring a one-time task execution without relying on provisioners. Caution should be taken to ensure the data source is only executed once, or that the resulting tasks can safely run in parallel.
     */
    inline def getTaskExecution(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecs.outputs.GetTaskExecutionResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getTaskExecution(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source for managing an AWS ECS (Elastic Container) Task Execution. This data source calls the [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API, allowing execution of one-time tasks that don&#39;t fit a standard resource lifecycle. See the feature request issue for additional context.
     * 
     * &gt; **NOTE on preview operations:** This data source calls the `RunTask` API on every read operation, which means new task(s) may be created from a `pulumi preview` command if all attributes are known. Placing this functionality behind a data source is an intentional trade off to enable use cases requiring a one-time task execution without relying on provisioners. Caution should be taken to ensure the data source is only executed once, or that the resulting tasks can safely run in parallel.
     */
    inline def getTaskExecutionPlain(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecs.outputs.GetTaskExecutionResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionPlainArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getTaskExecutionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages an [ECS Express service](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/express-service-overview.html). The Express service provides a simplified way to deploy containerized applications with automatic provisioning and management of AWS infrastructure including Application Load Balancers (ALBs), target groups, security groups, and auto-scaling policies. This service offers built-in load balancing, auto-scaling, and networking capabilities with zero-downtime deployments.
   * 
   * &gt; **Note:** To prevent a race condition during service deletion, make sure to set `dependsOn` to the related `aws.iam.RolePolicy` or `aws.iam.RolePolicyAttachment` resources. Otherwise, the policy may be destroyed too soon and the ECS service will then get stuck in the `DRAINING` state.
   */
  def ExpressGatewayService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.ExpressGatewayServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.ExpressGatewayServiceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ecs.ExpressGatewayService(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &gt; **Note:** To prevent a race condition during service deletion, make sure to set `dependsOn` to the related `aws.iam.RolePolicy`; otherwise, the policy may be destroyed too soon and the ECS service will then get stuck in the `DRAINING` state.
   * 
   * Provides an ECS service - effectively a task that is expected to run until an error occurs or a user terminates it (typically a webserver or a database).
   * 
   * See [ECS Services section in AWS developer guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html).
   */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.ServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.ServiceArgs.builder
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
    com.pulumi.aws.ecs.Service(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an individual ECS resource tag. This resource should only be used in cases where ECS resources are created outside the provider (e.g., ECS Clusters implicitly created by Batch Compute Environments).
   * 
   * &gt; **NOTE:** This tagging resource should not be combined with the resource for managing the parent resource. For example, using `aws.ecs.Cluster` and `aws.ecs.Tag` to manage tags of the same ECS Cluster will cause a perpetual difference where the `aws.ecs.Cluster` resource will try to remove the tag being added by the `aws.ecs.Tag` resource.
   * 
   * &gt; **NOTE:** This tagging resource does not use the provider `ignoreTags` configuration.
   */
  def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.TagArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ecs.TagArgs.builder
    com.pulumi.aws.ecs.Tag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a revision of an ECS task definition to be used in `aws.ecs.Service`. */
  def TaskDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.TaskDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.TaskDefinitionArgs.builder
    conf.logicalName2ecsTaskDefinitionFamily(name) match
      case Some(family) => argsBuilder = argsBuilder.family(family)
      case None         =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ecs.TaskDefinition(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an ECS task set - effectively a task that is expected to run until an error occurs or a user terminates it (typically a webserver or a database).
   * 
   * See [ECS Task Set section in AWS developer guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-external.html).
   */
  def TaskSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.TaskSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.TaskSetArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ecs.TaskSet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
