package jp.ukiba.ko_pulumi
package aws

object batch_ext:
  extension (builder: com.pulumi.aws.batch.ComputeEnvironmentArgs.Builder)
    /**
     * @param computeResources Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
     * @return builder
     */
    inline def computeResources(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.Builder]):
        com.pulumi.aws.batch.ComputeEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.builder
      builder.computeResources(args(argsBuilder).build)

    /**
     * @param eksConfiguration Details for the Amazon EKS cluster that supports the compute environment. See details below.
     * @return builder
     */
    inline def eksConfiguration(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentEksConfigurationArgs.Builder]):
        com.pulumi.aws.batch.ComputeEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentEksConfigurationArgs.builder
      builder.eksConfiguration(args(argsBuilder).build)

    /**
     * @param updatePolicy Infrastructure update policy for the compute environment. See details below.
     * @return builder
     */
    inline def updatePolicy(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentUpdatePolicyArgs.Builder]):
        com.pulumi.aws.batch.ComputeEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentUpdatePolicyArgs.builder
      builder.updatePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.JobDefinitionArgs.Builder)
    /**
     * @param eksProperties Valid EKS properties. This parameter is only valid if the `type` parameter is `container`.
     * @return builder
     */
    inline def eksProperties(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesArgs.Builder]):
        com.pulumi.aws.batch.JobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesArgs.builder
      builder.eksProperties(args(argsBuilder).build)

    /**
     * @param retryStrategy Retry strategy to use for failed jobs that are submitted with this job definition. Maximum number of `retryStrategy` is `1`.  Defined below.
     * @return builder
     */
    inline def retryStrategy(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyArgs.Builder]):
        com.pulumi.aws.batch.JobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyArgs.builder
      builder.retryStrategy(args(argsBuilder).build)

    /**
     * @param timeout Timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
     * @return builder
     */
    inline def timeout(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionTimeoutArgs.Builder]):
        com.pulumi.aws.batch.JobDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.JobQueueArgs.Builder)
    /**
     * @param computeEnvironmentOrders Set of compute environments mapped to a job queue and their order relative to each other. The job scheduler uses this parameter to determine which compute environment runs a specific job. Compute environments must be in the VALID state before you can associate them with a job queue. You can associate up to three compute environments with a job queue.
     * @return builder
     */
    inline def computeEnvironmentOrders(args: Endofunction[com.pulumi.aws.batch.inputs.JobQueueComputeEnvironmentOrderArgs.Builder]*):
        com.pulumi.aws.batch.JobQueueArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobQueueComputeEnvironmentOrderArgs.builder
      builder.computeEnvironmentOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param jobStateTimeLimitActions Set of job state time limit actions mapped to a job queue. Specifies an action that AWS Batch will take after the job has remained at the head of the queue in the specified state for longer than the specified time.
     * @return builder
     */
    inline def jobStateTimeLimitActions(args: Endofunction[com.pulumi.aws.batch.inputs.JobQueueJobStateTimeLimitActionArgs.Builder]*):
        com.pulumi.aws.batch.JobQueueArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobQueueJobStateTimeLimitActionArgs.builder
      builder.jobStateTimeLimitActions(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.batch.inputs.JobQueueTimeoutsArgs.Builder]):
        com.pulumi.aws.batch.JobQueueArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobQueueTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.SchedulingPolicyArgs.Builder)
    /**
     * @param fairSharePolicy Fair share scheduling policy details. The `fairSharePolicy` block is documented below.
     * @return builder
     */
    inline def fairSharePolicy(args: Endofunction[com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs.Builder]):
        com.pulumi.aws.batch.SchedulingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs.builder
      builder.fairSharePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.Builder)
    /**
     * @param ec2Configurations Provides information used to select AMIs for EC2 instances in the compute environment. If Ec2Configuration isn&#39;t specified, the default is ECS_AL2. This parameter isn&#39;t applicable to jobs that are running on Fargate resources, and shouldn&#39;t be specified.
     * @return builder
     */
    inline def ec2Configurations(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesEc2ConfigurationArgs.Builder]*):
        com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesEc2ConfigurationArgs.builder
      builder.ec2Configurations(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplate Launch template to use for your compute resources. See details below. This parameter isn&#39;t applicable to jobs running on Fargate resources, and shouldn&#39;t be specified.
     * @return builder
     */
    inline def launchTemplate(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesLaunchTemplateArgs.Builder]):
        com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.ComputeEnvironmentState.Builder)
    /**
     * @param computeResources Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
     * @return builder
     */
    inline def computeResources(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.Builder]):
        com.pulumi.aws.batch.inputs.ComputeEnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs.builder
      builder.computeResources(args(argsBuilder).build)

    /**
     * @param eksConfiguration Details for the Amazon EKS cluster that supports the compute environment. See details below.
     * @return builder
     */
    inline def eksConfiguration(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentEksConfigurationArgs.Builder]):
        com.pulumi.aws.batch.inputs.ComputeEnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentEksConfigurationArgs.builder
      builder.eksConfiguration(args(argsBuilder).build)

    /**
     * @param updatePolicy Infrastructure update policy for the compute environment. See details below.
     * @return builder
     */
    inline def updatePolicy(args: Endofunction[com.pulumi.aws.batch.inputs.ComputeEnvironmentUpdatePolicyArgs.Builder]):
        com.pulumi.aws.batch.inputs.ComputeEnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.ComputeEnvironmentUpdatePolicyArgs.builder
      builder.updatePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesArgs.Builder)
    /**
     * @param podProperties Properties for the Kubernetes pod resources of a job. See `podProperties` below.
     * @return builder
     */
    inline def podProperties(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.builder
      builder.podProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder)
    /**
     * @param containers Properties of the container that&#39;s used on the Amazon EKS pod. See `containers` below.
     * @return builder
     */
    inline def containers(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param imagePullSecrets List of Kubernetes secret resources. See `imagePullSecret` below.
     * @return builder
     */
    inline def imagePullSecrets(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesImagePullSecretArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesImagePullSecretArgs.builder
      builder.imagePullSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param initContainers Containers which run before application containers, always runs to completion, and must complete successfully before the next container starts. These containers are registered with the Amazon EKS Connector agent and persists the registration information in the Kubernetes backend data store. See `initContainers` below.
     * @return builder
     */
    inline def initContainers(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.builder
      builder.initContainers(args.map(_(argsBuilder).build)*)

    /**
     * @param metadata Metadata about the Kubernetes pod. See `metadata` below.
     * @return builder
     */
    inline def metadata(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesMetadataArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

    /**
     * @param volumes Volumes for a job definition that uses Amazon EKS resources. See `volumes` below.
     * @return builder
     */
    inline def volumes(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.Builder)
    /**
     * @param envs Environment variables to pass to a container. See `env` below.
     * @return builder
     */
    inline def envs(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerEnvArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param resources Type and amount of resources to assign to a container. See `resources` below.
     * @return builder
     */
    inline def resources(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerResourcesArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerResourcesArgs.builder
      builder.resources(args(argsBuilder).build)

    /**
     * @param securityContext Security context for a job. See `securityContext` below.
     * @return builder
     */
    inline def securityContext(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerSecurityContextArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerSecurityContextArgs.builder
      builder.securityContext(args(argsBuilder).build)

    /**
     * @param volumeMounts Volume mounts for the container. See `volumeMounts` below.
     * @return builder
     */
    inline def volumeMounts(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerVolumeMountArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesContainerVolumeMountArgs.builder
      builder.volumeMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.Builder)
    /**
     * @param envs Environment variables to pass to a container. See `env` below.
     * @return builder
     */
    inline def envs(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerEnvArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param resources Type and amount of resources to assign to a container. See `resources` below.
     * @return builder
     */
    inline def resources(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerResourcesArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerResourcesArgs.builder
      builder.resources(args(argsBuilder).build)

    /**
     * @param securityContext Security context for a job. See `securityContext` below.
     * @return builder
     */
    inline def securityContext(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerSecurityContextArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerSecurityContextArgs.builder
      builder.securityContext(args(argsBuilder).build)

    /**
     * @param volumeMounts Volume mounts for the container. See `volumeMounts` below.
     * @return builder
     */
    inline def volumeMounts(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerVolumeMountArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesInitContainerVolumeMountArgs.builder
      builder.volumeMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeArgs.Builder)
    /**
     * @param emptyDir Empty directory to mount on the pod. See `emptyDir` below.
     * @return builder
     */
    inline def emptyDir(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeEmptyDirArgs.builder
      builder.emptyDir(args(argsBuilder).build)

    /**
     * @param hostPath Path on the host that&#39;s mounted to the pod. See `hostPath` below.
     * @return builder
     */
    inline def hostPath(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs.builder
      builder.hostPath(args(argsBuilder).build)

    /**
     * @param secret Secret to mount as a volume. See `secret` below.
     * @return builder
     */
    inline def secret(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesPodPropertiesVolumeSecretArgs.builder
      builder.secret(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyArgs.Builder)
    /**
     * @param evaluateOnExits Evaluate on exit conditions under which the job should be retried or failed. If this parameter is specified, then the `attempts` parameter must also be specified. You may specify up to 5 configuration blocks.
     * @return builder
     */
    inline def evaluateOnExits(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyEvaluateOnExitArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyEvaluateOnExitArgs.builder
      builder.evaluateOnExits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.batch.inputs.JobDefinitionState.Builder)
    /**
     * @param eksProperties Valid EKS properties. This parameter is only valid if the `type` parameter is `container`.
     * @return builder
     */
    inline def eksProperties(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionEksPropertiesArgs.builder
      builder.eksProperties(args(argsBuilder).build)

    /**
     * @param retryStrategy Retry strategy to use for failed jobs that are submitted with this job definition. Maximum number of `retryStrategy` is `1`.  Defined below.
     * @return builder
     */
    inline def retryStrategy(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionRetryStrategyArgs.builder
      builder.retryStrategy(args(argsBuilder).build)

    /**
     * @param timeout Timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
     * @return builder
     */
    inline def timeout(args: Endofunction[com.pulumi.aws.batch.inputs.JobDefinitionTimeoutArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobDefinitionTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.JobQueueState.Builder)
    /**
     * @param computeEnvironmentOrders Set of compute environments mapped to a job queue and their order relative to each other. The job scheduler uses this parameter to determine which compute environment runs a specific job. Compute environments must be in the VALID state before you can associate them with a job queue. You can associate up to three compute environments with a job queue.
     * @return builder
     */
    inline def computeEnvironmentOrders(args: Endofunction[com.pulumi.aws.batch.inputs.JobQueueComputeEnvironmentOrderArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobQueueState.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobQueueComputeEnvironmentOrderArgs.builder
      builder.computeEnvironmentOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param jobStateTimeLimitActions Set of job state time limit actions mapped to a job queue. Specifies an action that AWS Batch will take after the job has remained at the head of the queue in the specified state for longer than the specified time.
     * @return builder
     */
    inline def jobStateTimeLimitActions(args: Endofunction[com.pulumi.aws.batch.inputs.JobQueueJobStateTimeLimitActionArgs.Builder]*):
        com.pulumi.aws.batch.inputs.JobQueueState.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.JobQueueJobStateTimeLimitActionArgs.builder
      builder.jobStateTimeLimitActions(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.batch.inputs.JobQueueTimeoutsArgs.Builder]):
        com.pulumi.aws.batch.inputs.JobQueueState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.JobQueueTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs.Builder)
    /**
     * @param shareDistributions One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `shareDistribution` block is documented below.
     * @return builder
     */
    inline def shareDistributions(args: Endofunction[com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyShareDistributionArgs.Builder]*):
        com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyShareDistributionArgs.builder
      builder.shareDistributions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.batch.inputs.SchedulingPolicyState.Builder)
    /**
     * @param fairSharePolicy Fair share scheduling policy details. The `fairSharePolicy` block is documented below.
     * @return builder
     */
    inline def fairSharePolicy(args: Endofunction[com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs.Builder]):
        com.pulumi.aws.batch.inputs.SchedulingPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyArgs.builder
      builder.fairSharePolicy(args(argsBuilder).build)
