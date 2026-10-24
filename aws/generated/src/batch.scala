package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object batch:
  object BatchFunctions:
    /**
     * The Batch Compute Environment data source allows access to details of a specific
     * compute environment within AWS Batch.
     */
    inline def getComputeEnvironment(args: Endofunction[com.pulumi.aws.batch.inputs.GetComputeEnvironmentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.batch.outputs.GetComputeEnvironmentResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetComputeEnvironmentArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getComputeEnvironment(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * The Batch Compute Environment data source allows access to details of a specific
     * compute environment within AWS Batch.
     */
    inline def getComputeEnvironmentPlain(args: Endofunction[com.pulumi.aws.batch.inputs.GetComputeEnvironmentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.batch.outputs.GetComputeEnvironmentResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetComputeEnvironmentPlainArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getComputeEnvironmentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS Batch Job Definition. */
    inline def getJobDefinition(args: Endofunction[com.pulumi.aws.batch.inputs.GetJobDefinitionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.batch.outputs.GetJobDefinitionResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetJobDefinitionArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getJobDefinition(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Batch Job Definition. */
    inline def getJobDefinitionPlain(args: Endofunction[com.pulumi.aws.batch.inputs.GetJobDefinitionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.batch.outputs.GetJobDefinitionResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetJobDefinitionPlainArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getJobDefinitionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * The Batch Job Queue data source allows access to details of a specific
     * job queue within AWS Batch.
     */
    inline def getJobQueue(args: Endofunction[com.pulumi.aws.batch.inputs.GetJobQueueArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.batch.outputs.GetJobQueueResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetJobQueueArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getJobQueue(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * The Batch Job Queue data source allows access to details of a specific
     * job queue within AWS Batch.
     */
    inline def getJobQueuePlain(args: Endofunction[com.pulumi.aws.batch.inputs.GetJobQueuePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.batch.outputs.GetJobQueueResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetJobQueuePlainArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getJobQueuePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** The Batch Scheduling Policy data source allows access to details of a specific Scheduling Policy within AWS Batch. */
    inline def getSchedulingPolicy(args: Endofunction[com.pulumi.aws.batch.inputs.GetSchedulingPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.batch.outputs.GetSchedulingPolicyResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetSchedulingPolicyArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getSchedulingPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The Batch Scheduling Policy data source allows access to details of a specific Scheduling Policy within AWS Batch. */
    inline def getSchedulingPolicyPlain(args: Endofunction[com.pulumi.aws.batch.inputs.GetSchedulingPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.batch.outputs.GetSchedulingPolicyResult] =
      val argsBuilder = com.pulumi.aws.batch.inputs.GetSchedulingPolicyPlainArgs.builder
      com.pulumi.aws.batch.BatchFunctions.getSchedulingPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Creates a AWS Batch compute environment. Compute environments contain the Amazon ECS container instances that are used to run containerized batch jobs.
   * 
   * For information about AWS Batch, see [What is AWS Batch?](http://docs.aws.amazon.com/batch/latest/userguide/what-is-batch.html).
   * For information about compute environment, see [Compute Environments](http://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html).
   * 
   * &gt; **Note:** To prevent a race condition during environment deletion, make sure to set `dependsOn` to the related `aws.iam.RolePolicyAttachment`;
   * otherwise, the policy may be destroyed too soon and the compute environment will then get stuck in the `DELETING` state, see [Troubleshooting AWS Batch](http://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html).
   */
  inline def ComputeEnvironment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.batch.ComputeEnvironmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.batch.ComputeEnvironmentArgs.builder
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
    com.pulumi.aws.batch.ComputeEnvironment(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Batch Job Definition resource. */
  inline def JobDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.batch.JobDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.batch.JobDefinitionArgs.builder
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
    com.pulumi.aws.batch.JobDefinition(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Batch Job Queue resource. */
  inline def JobQueue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.batch.JobQueueArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.batch.JobQueueArgs.builder
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
    com.pulumi.aws.batch.JobQueue(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Batch Scheduling Policy resource. */
  inline def SchedulingPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.batch.SchedulingPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.batch.SchedulingPolicyArgs.builder
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
    com.pulumi.aws.batch.SchedulingPolicy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
