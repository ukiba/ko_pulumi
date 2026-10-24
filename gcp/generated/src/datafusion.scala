package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object datafusion:
  object DatafusionFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for instance */
    inline def getInstanceIamPolicy(args: Endofunction[com.pulumi.gcp.datafusion.inputs.GetInstanceIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.datafusion.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.GetInstanceIamPolicyArgs.builder
      com.pulumi.gcp.datafusion.DatafusionFunctions.getInstanceIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for instance */
    inline def getInstanceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.datafusion.inputs.GetInstanceIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.datafusion.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.GetInstanceIamPolicyPlainArgs.builder
      com.pulumi.gcp.datafusion.DatafusionFunctions.getInstanceIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Represents a Data Fusion instance.
   * 
   * To get more information about Instance, see:
   * 
   * * [API documentation](https://cloud.google.com/data-fusion/docs/reference/rest/v1beta1/projects.locations.instances)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/data-fusion/docs/)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.datafusion.InstanceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.datafusion.InstanceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.datafusion.Instance(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
