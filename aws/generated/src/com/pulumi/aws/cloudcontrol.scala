package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object cloudcontrol:
  type CloudcontrolFunctions = com.pulumi.aws.cloudcontrol.CloudcontrolFunctions
  object CloudcontrolFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.cloudcontrol.CloudcontrolFunctions.*
  extension (self: CloudcontrolFunctions.type)
    /** Provides details for a Cloud Control API Resource. The reading of these resources is proxied through Cloud Control API handlers to the backend service. */
    def getResource(args: Endofunction[com.pulumi.aws.cloudcontrol.inputs.GetResourceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudcontrol.outputs.GetResourceResult] =
      val argsBuilder = com.pulumi.aws.cloudcontrol.inputs.GetResourceArgs.builder
      com.pulumi.aws.cloudcontrol.CloudcontrolFunctions.getResource(args(argsBuilder).build)

    /** Provides details for a Cloud Control API Resource. The reading of these resources is proxied through Cloud Control API handlers to the backend service. */
    def getResourcePlain(args: Endofunction[com.pulumi.aws.cloudcontrol.inputs.GetResourcePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudcontrol.outputs.GetResourceResult] =
      val argsBuilder = com.pulumi.aws.cloudcontrol.inputs.GetResourcePlainArgs.builder
      com.pulumi.aws.cloudcontrol.CloudcontrolFunctions.getResourcePlain(args(argsBuilder).build)

  /** Manages a Cloud Control API Resource. The configuration and lifecycle handling of these resources is proxied through Cloud Control API handlers to the backend service. */
  def Resource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudcontrol.ResourceArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudcontrol.ResourceArgs.builder
    
    com.pulumi.aws.cloudcontrol.Resource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
