package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object tpu:
  object TpuFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get accelerator types available for a project. For more information see the [official documentation](https://cloud.google.com/tpu/docs/) and [API](https://cloud.google.com/tpu/docs/reference/rest/v2/projects.locations.acceleratorTypes). */
    inline def getV2AcceleratorTypes(args: Endofunction[com.pulumi.gcp.tpu.inputs.GetV2AcceleratorTypesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.tpu.outputs.GetV2AcceleratorTypesResult] =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.GetV2AcceleratorTypesArgs.builder
      com.pulumi.gcp.tpu.TpuFunctions.getV2AcceleratorTypes(args(argsBuilder).build)

    /** Get accelerator types available for a project. For more information see the [official documentation](https://cloud.google.com/tpu/docs/) and [API](https://cloud.google.com/tpu/docs/reference/rest/v2/projects.locations.acceleratorTypes). */
    inline def getV2AcceleratorTypesPlain(args: Endofunction[com.pulumi.gcp.tpu.inputs.GetV2AcceleratorTypesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.tpu.outputs.GetV2AcceleratorTypesResult] =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.GetV2AcceleratorTypesPlainArgs.builder
      com.pulumi.gcp.tpu.TpuFunctions.getV2AcceleratorTypesPlain(args(argsBuilder).build)

    /** Get runtime versions available for a project. For more information see the [official documentation](https://cloud.google.com/tpu/docs/) and [API](https://cloud.google.com/tpu/docs/reference/rest/v2/projects.locations.runtimeVersions). */
    inline def getV2RuntimeVersions(args: Endofunction[com.pulumi.gcp.tpu.inputs.GetV2RuntimeVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.tpu.outputs.GetV2RuntimeVersionsResult] =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.GetV2RuntimeVersionsArgs.builder
      com.pulumi.gcp.tpu.TpuFunctions.getV2RuntimeVersions(args(argsBuilder).build)

    /** Get runtime versions available for a project. For more information see the [official documentation](https://cloud.google.com/tpu/docs/) and [API](https://cloud.google.com/tpu/docs/reference/rest/v2/projects.locations.runtimeVersions). */
    inline def getV2RuntimeVersionsPlain(args: Endofunction[com.pulumi.gcp.tpu.inputs.GetV2RuntimeVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.tpu.outputs.GetV2RuntimeVersionsResult] =
      val argsBuilder = com.pulumi.gcp.tpu.inputs.GetV2RuntimeVersionsPlainArgs.builder
      com.pulumi.gcp.tpu.TpuFunctions.getV2RuntimeVersionsPlain(args(argsBuilder).build)

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
  def V2QueuedResource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.tpu.V2QueuedResourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.tpu.V2QueuedResourceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.tpu.V2QueuedResource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def V2Vm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.tpu.V2VmArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.tpu.V2VmArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.tpu.V2Vm(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
