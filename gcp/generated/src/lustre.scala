package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object lustre:
  /**
   * A Managed Lustre instance
   * 
   * To get more information about Instance, see:
   * 
   * * [API documentation](https://cloud.google.com/managed-lustre/docs/reference/rest/v1/projects.locations.instances)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/managed-lustre/docs/create-instance)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.lustre.InstanceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.lustre.InstanceArgs.builder
    com.pulumi.gcp.lustre.Instance(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object LustreFunctions:
    /** Use this data source to get information about a Lustre instance. For more information see the [API docs](https://docs.cloud.google.com/managed-lustre/docs/reference/rest/v1/projects.locations.instances). */
    inline def getInstance(args: Endofunction[com.pulumi.gcp.lustre.inputs.GetInstanceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.lustre.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.GetInstanceArgs.builder
      com.pulumi.gcp.lustre.LustreFunctions.getInstance(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about a Lustre instance. For more information see the [API docs](https://docs.cloud.google.com/managed-lustre/docs/reference/rest/v1/projects.locations.instances). */
    inline def getInstancePlain(args: Endofunction[com.pulumi.gcp.lustre.inputs.GetInstancePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.lustre.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.lustre.inputs.GetInstancePlainArgs.builder
      com.pulumi.gcp.lustre.LustreFunctions.getInstancePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
