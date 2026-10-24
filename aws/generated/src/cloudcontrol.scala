package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cloudcontrol:
  object CloudcontrolFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details for a Cloud Control API Resource. The reading of these resources is proxied through Cloud Control API handlers to the backend service. */
    inline def getResource(args: Endofunction[com.pulumi.aws.cloudcontrol.inputs.GetResourceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudcontrol.outputs.GetResourceResult] =
      val argsBuilder = com.pulumi.aws.cloudcontrol.inputs.GetResourceArgs.builder
      com.pulumi.aws.cloudcontrol.CloudcontrolFunctions.getResource(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details for a Cloud Control API Resource. The reading of these resources is proxied through Cloud Control API handlers to the backend service. */
    inline def getResourcePlain(args: Endofunction[com.pulumi.aws.cloudcontrol.inputs.GetResourcePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudcontrol.outputs.GetResourceResult] =
      val argsBuilder = com.pulumi.aws.cloudcontrol.inputs.GetResourcePlainArgs.builder
      com.pulumi.aws.cloudcontrol.CloudcontrolFunctions.getResourcePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Cloud Control API Resource. The configuration and lifecycle handling of these resources is proxied through Cloud Control API handlers to the backend service. */
  def Resource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudcontrol.ResourceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudcontrol.ResourceArgs.builder
    com.pulumi.aws.cloudcontrol.Resource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
