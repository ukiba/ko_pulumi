package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object batch:
  extension (builder: com.pulumi.aws.batch.ComputeEnvironmentArgs.Builder)
    /**
     * @param computeResources Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
     * @return builder
     */
    def computeResources(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.Builder]):
        com.pulumi.aws.batch.ComputeEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.builder
      builder.computeResources(args(argsBuilder).build)

    /**
     * @param eksConfiguration Details for the Amazon EKS cluster that supports the compute environment. See details below.
     * @return builder
     */
    def eksConfiguration(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentEksConfigurationArgs.Builder]):
        com.pulumi.aws.batch.ComputeEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentEksConfigurationArgs.builder
      builder.eksConfiguration(args(argsBuilder).build)

    /**
     * @param updatePolicy Specifies the infrastructure update policy for the compute environment. See details below.
     * @return builder
     */
    def updatePolicy(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentUpdatePolicyArgs.Builder]):
        com.pulumi.aws.batch.ComputeEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentUpdatePolicyArgs.builder
      builder.updatePolicy(args(argsBuilder).build)

  /**
   * Creates a AWS Batch compute environment. Compute environments contain the Amazon ECS container instances that are used to run containerized batch jobs.
   *  
   *  For information about AWS Batch, see [What is AWS Batch?](http://docs.aws.amazon.com/batch/latest/userguide/what-is-batch.html) .
   *  For information about compute environment, see [Compute Environments](http://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) .
   *  
   *  &gt; **Note:** To prevent a race condition during environment deletion, make sure to set `dependsOn` to the related `aws.iam.RolePolicyAttachment`;
   *  otherwise, the policy may be destroyed too soon and the compute environment will then get stuck in the `DELETING` state, see [Troubleshooting AWS Batch](http://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html) .
   */
  def ComputeEnvironment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.batch.ComputeEnvironmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.batch.ComputeEnvironmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.batch.ComputeEnvironment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type BatchFunctions = com.pulumi.aws.batch.BatchFunctions
  object BatchFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.batch.BatchFunctions.*
  extension (self: BatchFunctions.type)
    /**
     * The Batch Compute Environment data source allows access to details of a specific
     *  compute environment within AWS Batch.
     */
    def getComputeEnvironment(args: Endofunction[com.pulumi.aws.batch.inputs.GetComputeEnvironmentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.batch.outputs.GetComputeEnvironmentResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetComputeEnvironmentArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getComputeEnvironment(args(argsBuilder).build)

    /**
     * The Batch Compute Environment data source allows access to details of a specific
     *  compute environment within AWS Batch.
     */
    def getComputeEnvironmentPlain(args: Endofunction[com.pulumi.aws.batch.inputs.GetComputeEnvironmentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.batch.outputs.GetComputeEnvironmentResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetComputeEnvironmentPlainArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getComputeEnvironmentPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Batch Job Definition. */
    def getJobDefinition(args: Endofunction[com.pulumi.aws.batch.inputs.GetJobDefinitionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.batch.outputs.GetJobDefinitionResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetJobDefinitionArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getJobDefinition(args(argsBuilder).build)

    /** Data source for managing an AWS Batch Job Definition. */
    def getJobDefinitionPlain(args: Endofunction[com.pulumi.aws.batch.inputs.GetJobDefinitionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.batch.outputs.GetJobDefinitionResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetJobDefinitionPlainArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getJobDefinitionPlain(args(argsBuilder).build)

    /**
     * The Batch Job Queue data source allows access to details of a specific
     *  job queue within AWS Batch.
     */
    def getJobQueue(args: Endofunction[com.pulumi.aws.batch.inputs.GetJobQueueArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.batch.outputs.GetJobQueueResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetJobQueueArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getJobQueue(args(argsBuilder).build)

    /**
     * The Batch Job Queue data source allows access to details of a specific
     *  job queue within AWS Batch.
     */
    def getJobQueuePlain(args: Endofunction[com.pulumi.aws.batch.inputs.GetJobQueuePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.batch.outputs.GetJobQueueResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetJobQueuePlainArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getJobQueuePlain(args(argsBuilder).build)

    /** The Batch Scheduling Policy data source allows access to details of a specific Scheduling Policy within AWS Batch. */
    def getSchedulingPolicy(args: Endofunction[com.pulumi.aws.batch.inputs.GetSchedulingPolicyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.batch.outputs.GetSchedulingPolicyResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetSchedulingPolicyArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getSchedulingPolicy(args(argsBuilder).build)

    /** The Batch Scheduling Policy data source allows access to details of a specific Scheduling Policy within AWS Batch. */
    def getSchedulingPolicyPlain(args: Endofunction[com.pulumi.aws.batch.inputs.GetSchedulingPolicyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.batch.outputs.GetSchedulingPolicyResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetSchedulingPolicyPlainArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getSchedulingPolicyPlain(args(argsBuilder).build)

  /** Provides a Batch Job Queue resource. */
  def JobQueue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.batch.JobQueueArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.batch.JobQueueArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.batch.JobQueue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.batch.JobQueueArgs.Builder)
    /**
     * @param computeEnvironmentOrders The set of compute environments mapped to a job queue and their order relative to each other. The job scheduler uses this parameter to determine which compute environment runs a specific job. Compute environments must be in the VALID state before you can associate them with a job queue. You can associate up to three compute environments with a job queue.
     * @return builder
     */
    def computeEnvironmentOrders(args: Endofunction[com.pulumi.aws.batch.inputs.JobQueueComputeEnvironmentOrderArgs.Builder]*):
        com.pulumi.aws.batch.JobQueueArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobQueueComputeEnvironmentOrderArgs.builder
      builder.computeEnvironmentOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param jobStateTimeLimitActions The set of job state time limit actions mapped to a job queue. Specifies an action that AWS Batch will take after the job has remained at the head of the queue in the specified state for longer than the specified time.
     * @return builder
     */
    def jobStateTimeLimitActions(args: Endofunction[com.pulumi.aws.batch.inputs.JobQueueJobStateTimeLimitActionArgs.Builder]*):
        com.pulumi.aws.batch.JobQueueArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobQueueJobStateTimeLimitActionArgs.builder
      builder.jobStateTimeLimitActions(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.batch.inputs.JobQueueTimeoutsArgs.Builder]):
        com.pulumi.aws.batch.JobQueueArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobQueueTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides a Batch Scheduling Policy resource. */
  def SchedulingPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.batch.SchedulingPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.batch.SchedulingPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.batch.SchedulingPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Batch Job Definition resource. */
  def JobDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.batch.JobDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.batch.JobDefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.batch.JobDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.batch.JobDefinitionArgs.Builder)
    /**
     * @param eksProperties Valid eks properties. This parameter is only valid if the `type` parameter is `container`.
     * @return builder
     */
    def eksProperties(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesArgs.Builder]):
        com.pulumi.aws.batch.JobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesArgs.builder
      builder.eksProperties(args(argsBuilder).build)

    /**
     * @param retryStrategy Retry strategy to use for failed jobs that are submitted with this job definition. Maximum number of `retryStrategy` is `1`.  Defined below.
     * @return builder
     */
    def retryStrategy(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyArgs.Builder]):
        com.pulumi.aws.batch.JobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyArgs.builder
      builder.retryStrategy(args(argsBuilder).build)

    /**
     * @param timeout Timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionTimeoutArgs.Builder]):
        com.pulumi.aws.batch.JobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyArgs.Builder)
    /**
     * @param evaluateOnExits Evaluate on exit conditions under which the job should be retried or failed. If this parameter is specified, then the `attempts` parameter must also be specified. You may specify up to 5 configuration blocks.
     * @return builder
     */
    def evaluateOnExits(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyEvaluateOnExitArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyEvaluateOnExitArgs.builder
      builder.evaluateOnExits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeArgs.Builder)
    def emptyDir(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs.builder
      builder.emptyDir(args(argsBuilder).build)

    def hostPath(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs.builder
      builder.hostPath(args(argsBuilder).build)

    def secret(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs.builder
      builder.secret(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.ComputeEnvironmentState.Builder)
    /**
     * @param computeResources Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
     * @return builder
     */
    def computeResources(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.Builder]):
        com.pulumi.aws.batch.inputs.ComputeEnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.builder
      builder.computeResources(args(argsBuilder).build)

    /**
     * @param eksConfiguration Details for the Amazon EKS cluster that supports the compute environment. See details below.
     * @return builder
     */
    def eksConfiguration(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentEksConfigurationArgs.Builder]):
        com.pulumi.aws.batch.inputs.ComputeEnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentEksConfigurationArgs.builder
      builder.eksConfiguration(args(argsBuilder).build)

    /**
     * @param updatePolicy Specifies the infrastructure update policy for the compute environment. See details below.
     * @return builder
     */
    def updatePolicy(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentUpdatePolicyArgs.Builder]):
        com.pulumi.aws.batch.inputs.ComputeEnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentUpdatePolicyArgs.builder
      builder.updatePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.SchedulingPolicyState.Builder)
    def fairSharePolicy(args: Endofunction[com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs.Builder]):
        com.pulumi.aws.batch.inputs.SchedulingPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs.builder
      builder.fairSharePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.JobQueueState.Builder)
    /**
     * @param computeEnvironmentOrders The set of compute environments mapped to a job queue and their order relative to each other. The job scheduler uses this parameter to determine which compute environment runs a specific job. Compute environments must be in the VALID state before you can associate them with a job queue. You can associate up to three compute environments with a job queue.
     * @return builder
     */
    def computeEnvironmentOrders(args: Endofunction[com.pulumi.aws.batch.inputs.JobQueueComputeEnvironmentOrderArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobQueueState.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobQueueComputeEnvironmentOrderArgs.builder
      builder.computeEnvironmentOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param jobStateTimeLimitActions The set of job state time limit actions mapped to a job queue. Specifies an action that AWS Batch will take after the job has remained at the head of the queue in the specified state for longer than the specified time.
     * @return builder
     */
    def jobStateTimeLimitActions(args: Endofunction[com.pulumi.aws.batch.inputs.JobQueueJobStateTimeLimitActionArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobQueueState.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobQueueJobStateTimeLimitActionArgs.builder
      builder.jobStateTimeLimitActions(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.batch.inputs.JobQueueTimeoutsArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobQueueState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobQueueTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs.Builder)
    /**
     * @param shareDistributions One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `shareDistribution` block is documented below.
     * @return builder
     */
    def shareDistributions(args: Endofunction[com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyShareDistributionArgs.Builder]*):
        com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyShareDistributionArgs.builder
      builder.shareDistributions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.Builder)
    /**
     * @param envs Environment variables to pass to a container. See EKS Environment below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerEnvArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param resources Type and amount of resources to assign to a container. The supported resources include `memory`, `cpu`, and `nvidia.com/gpu`.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerResourcesArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerResourcesArgs.builder
      builder.resources(args(argsBuilder).build)

    /**
     * @param securityContext Security context for a job. See `securityContext` below.
     * @return builder
     */
    def securityContext(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerSecurityContextArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerSecurityContextArgs.builder
      builder.securityContext(args(argsBuilder).build)

    /**
     * @param volumeMounts Volume mounts for the container.
     * @return builder
     */
    def volumeMounts(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerVolumeMountArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerVolumeMountArgs.builder
      builder.volumeMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionState.Builder)
    /**
     * @param eksProperties Valid eks properties. This parameter is only valid if the `type` parameter is `container`.
     * @return builder
     */
    def eksProperties(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesArgs.builder
      builder.eksProperties(args(argsBuilder).build)

    /**
     * @param retryStrategy Retry strategy to use for failed jobs that are submitted with this job definition. Maximum number of `retryStrategy` is `1`.  Defined below.
     * @return builder
     */
    def retryStrategy(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyArgs.builder
      builder.retryStrategy(args(argsBuilder).build)

    /**
     * @param timeout Timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionTimeoutArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.Builder)
    /**
     * @param ec2Configurations Provides information used to select Amazon Machine Images (AMIs) for EC2 instances in the compute environment. If Ec2Configuration isn&#39;t specified, the default is ECS_AL2. This parameter isn&#39;t applicable to jobs that are running on Fargate resources, and shouldn&#39;t be specified.
     * @return builder
     */
    def ec2Configurations(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesEc2ConfigurationArgs.Builder]*):
        com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesEc2ConfigurationArgs.builder
      builder.ec2Configurations(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplate The launch template to use for your compute resources. See details below. This parameter isn&#39;t applicable to jobs running on Fargate resources, and shouldn&#39;t be specified.
     * @return builder
     */
    def launchTemplate(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesLaunchTemplateArgs.Builder]):
        com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder)
    /**
     * @param containers Properties of the container that&#39;s used on the Amazon EKS pod. See containers below.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param imagePullSecrets List of Kubernetes secret resources. See `imagePullSecret` below.
     * @return builder
     */
    def imagePullSecrets(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesImagePullSecretArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesImagePullSecretArgs.builder
      builder.imagePullSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param initContainers Containers which run before application containers, always runs to completion, and must complete successfully before the next container starts. These containers are registered with the Amazon EKS Connector agent and persists the registration information in the Kubernetes backend data store. See containers below.
     * @return builder
     */
    def initContainers(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.builder
      builder.initContainers(args.map(_(argsBuilder).build)*)

    /**
     * @param metadata Metadata about the Kubernetes pod.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesMetadataArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

    /**
     * @param volumes Volumes for a job definition that uses Amazon EKS resources. AWS Batch supports emptyDir, hostPath, and secret volume types.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesArgs.Builder)
    /**
     * @param podProperties Properties for the Kubernetes pod resources of a job. See `podProperties` below.
     * @return builder
     */
    def podProperties(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.builder
      builder.podProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.Builder)
    /**
     * @param envs Environment variables to pass to a container. See EKS Environment below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerEnvArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param resources Type and amount of resources to assign to a container. The supported resources include `memory`, `cpu`, and `nvidia.com/gpu`.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerResourcesArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerResourcesArgs.builder
      builder.resources(args(argsBuilder).build)

    /**
     * @param securityContext Security context for a job. See `securityContext` below.
     * @return builder
     */
    def securityContext(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerSecurityContextArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerSecurityContextArgs.builder
      builder.securityContext(args(argsBuilder).build)

    /**
     * @param volumeMounts Volume mounts for the container.
     * @return builder
     */
    def volumeMounts(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerVolumeMountArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerVolumeMountArgs.builder
      builder.volumeMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.batch.SchedulingPolicyArgs.Builder)
    def fairSharePolicy(args: Endofunction[com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs.Builder]):
        com.pulumi.aws.batch.SchedulingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs.builder
      builder.fairSharePolicy(args(argsBuilder).build)
