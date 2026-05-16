package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object cloudcontrol:
  object CloudcontrolFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details for a Cloud Control API Resource. The reading of these resources is proxied through Cloud Control API handlers to the backend service. */
    inline def getResource(args: Endofunction[com.pulumi.aws.cloudcontrol.inputs.GetResourceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudcontrol.outputs.GetResourceResult] =
      val argsBuilder = com.pulumi.aws.cloudcontrol.inputs.GetResourceArgs.builder
      com.pulumi.aws.cloudcontrol.CloudcontrolFunctions.getResource(args(argsBuilder).build)

    /** Provides details for a Cloud Control API Resource. The reading of these resources is proxied through Cloud Control API handlers to the backend service. */
    inline def getResourcePlain(args: Endofunction[com.pulumi.aws.cloudcontrol.inputs.GetResourcePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudcontrol.outputs.GetResourceResult] =
      val argsBuilder = com.pulumi.aws.cloudcontrol.inputs.GetResourcePlainArgs.builder
      com.pulumi.aws.cloudcontrol.CloudcontrolFunctions.getResourcePlain(args(argsBuilder).build)

  /** Manages a Cloud Control API Resource. The configuration and lifecycle handling of these resources is proxied through Cloud Control API handlers to the backend service. */
  def Resource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudcontrol.ResourceArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudcontrol.ResourceArgs.builder
    com.pulumi.aws.cloudcontrol.Resource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
