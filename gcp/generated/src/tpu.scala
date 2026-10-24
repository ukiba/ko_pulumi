package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object tpu:
  object TpuFunctions:
    /** Get accelerator types available for a project. For more information see the [official documentation](https://cloud.google.com/tpu/docs/) and [API](https://cloud.google.com/tpu/docs/reference/rest/v2/projects.locations.acceleratorTypes). */
    inline def getV2AcceleratorTypes(args: Endofunction[com.pulumi.gcp.tpu.inputs.GetV2AcceleratorTypesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.tpu.outputs.GetV2AcceleratorTypesResult] =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.GetV2AcceleratorTypesArgs.builder
      com.pulumi.gcp.tpu.TpuFunctions.getV2AcceleratorTypes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get accelerator types available for a project. For more information see the [official documentation](https://cloud.google.com/tpu/docs/) and [API](https://cloud.google.com/tpu/docs/reference/rest/v2/projects.locations.acceleratorTypes). */
    inline def getV2AcceleratorTypesPlain(args: Endofunction[com.pulumi.gcp.tpu.inputs.GetV2AcceleratorTypesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.tpu.outputs.GetV2AcceleratorTypesResult] =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.GetV2AcceleratorTypesPlainArgs.builder
      com.pulumi.gcp.tpu.TpuFunctions.getV2AcceleratorTypesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get runtime versions available for a project. For more information see the [official documentation](https://cloud.google.com/tpu/docs/) and [API](https://cloud.google.com/tpu/docs/reference/rest/v2/projects.locations.runtimeVersions). */
    inline def getV2RuntimeVersions(args: Endofunction[com.pulumi.gcp.tpu.inputs.GetV2RuntimeVersionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.tpu.outputs.GetV2RuntimeVersionsResult] =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.GetV2RuntimeVersionsArgs.builder
      com.pulumi.gcp.tpu.TpuFunctions.getV2RuntimeVersions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get runtime versions available for a project. For more information see the [official documentation](https://cloud.google.com/tpu/docs/) and [API](https://cloud.google.com/tpu/docs/reference/rest/v2/projects.locations.runtimeVersions). */
    inline def getV2RuntimeVersionsPlain(args: Endofunction[com.pulumi.gcp.tpu.inputs.GetV2RuntimeVersionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.tpu.outputs.GetV2RuntimeVersionsResult] =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.GetV2RuntimeVersionsPlainArgs.builder
      com.pulumi.gcp.tpu.TpuFunctions.getV2RuntimeVersionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * A Cloud TPU Queued Resource.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about QueuedResource, see:
   * 
   * * [API documentation](https://cloud.google.com/tpu/docs/reference/rest/v2/projects.locations.queuedResources)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/tpu/docs/)
   */
  def V2QueuedResource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.tpu.V2QueuedResourceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.tpu.V2QueuedResourceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.tpu.V2QueuedResource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Cloud TPU VM instance.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Vm, see:
   * 
   * * [API documentation](https://cloud.google.com/tpu/docs/reference/rest/v2/projects.locations.nodes)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/tpu/docs/)
   */
  def V2Vm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.tpu.V2VmArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.tpu.V2VmArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.tpu.V2Vm(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
