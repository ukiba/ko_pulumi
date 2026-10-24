package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cloudbuild:
  /**
   * BitbucketServerConfig represents the configuration for a Bitbucket Server.
   * 
   * To get more information about BitbucketServerConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/build/docs/api/reference/rest/v1/projects.locations.bitbucketServerConfigs)
   * * How-to Guides
   *     * [Connect to a Bitbucket Server host](https://cloud.google.com/build/docs/automating-builds/bitbucket/connect-host-bitbucket-server)
   */
  def BitbucketServerConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.cloudbuild.BitbucketServerConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.cloudbuild.BitbucketServerConfigArgs.builder
    com.pulumi.gcp.cloudbuild.BitbucketServerConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object CloudbuildFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * To get more information about Cloudbuild Trigger, see:
     * 
     * * [API documentation](https://cloud.google.com/build/docs/api/reference/rest/v1/projects.triggers)
     * * How-to Guides
     *     * [Official Documentation](https://cloud.google.com/build/docs/automating-builds/create-manage-triggers)
     */
    inline def getTrigger(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.GetTriggerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudbuild.outputs.GetTriggerResult] =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.GetTriggerArgs.builder
      com.pulumi.gcp.cloudbuild.CloudbuildFunctions.getTrigger(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * To get more information about Cloudbuild Trigger, see:
     * 
     * * [API documentation](https://cloud.google.com/build/docs/api/reference/rest/v1/projects.triggers)
     * * How-to Guides
     *     * [Official Documentation](https://cloud.google.com/build/docs/automating-builds/create-manage-triggers)
     */
    inline def getTriggerPlain(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.GetTriggerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudbuild.outputs.GetTriggerResult] =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.GetTriggerPlainArgs.builder
      com.pulumi.gcp.cloudbuild.CloudbuildFunctions.getTriggerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * To get more information about Cloudbuild worker pool, see:
     * 
     * * [API documentation](https://docs.cloud.google.com/build/docs/api/reference/rest/v1/projects.locations.workerPools)
     * * How-to Guides
     *     * [Official Documentation](https://cloud.google.com/build/docs/automating-builds/create-manage-triggers)
     */
    inline def getWorkerPool(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.GetWorkerPoolArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudbuild.outputs.GetWorkerPoolResult] =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.GetWorkerPoolArgs.builder
      com.pulumi.gcp.cloudbuild.CloudbuildFunctions.getWorkerPool(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * To get more information about Cloudbuild worker pool, see:
     * 
     * * [API documentation](https://docs.cloud.google.com/build/docs/api/reference/rest/v1/projects.locations.workerPools)
     * * How-to Guides
     *     * [Official Documentation](https://cloud.google.com/build/docs/automating-builds/create-manage-triggers)
     */
    inline def getWorkerPoolPlain(args: Endofunction[com.pulumi.gcp.cloudbuild.inputs.GetWorkerPoolPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudbuild.outputs.GetWorkerPoolResult] =
      val argsBuilder = com.pulumi.gcp.cloudbuild.inputs.GetWorkerPoolPlainArgs.builder
      com.pulumi.gcp.cloudbuild.CloudbuildFunctions.getWorkerPoolPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Configuration for an automated build in response to source repository changes.
   * 
   * To get more information about Trigger, see:
   * 
   * * [API documentation](https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.triggers)
   * * How-to Guides
   *     * [Automating builds using build triggers](https://cloud.google.com/cloud-build/docs/running-builds/automate-builds)
   * 
   * &gt; **Note:** You can retrieve the email of the Cloud Build Service Account used in jobs by using the `gcp.projects.ServiceIdentity` resource.
   */
  def Trigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.cloudbuild.TriggerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudbuild.TriggerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudbuild.Trigger(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Definition of custom Cloud Build WorkerPools for running jobs with custom configuration and custom networking. */
  def WorkerPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.cloudbuild.WorkerPoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudbuild.WorkerPoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudbuild.WorkerPool(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
