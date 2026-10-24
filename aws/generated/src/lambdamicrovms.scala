package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object lambdamicrovms:
  /** Manages an AWS Lambda MicroVMs Image. Use this resource to define the base image, application code, and runtime configuration from which MicroVMs are launched. */
  inline def Image(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambdamicrovms.ImageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lambdamicrovms.ImageArgs.builder
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
    com.pulumi.aws.lambdamicrovms.Image(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object LambdamicrovmsFunctions:
    /** Provides details about an AWS Lambda MicroVMs Image Version. */
    inline def getImageVersion(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.GetImageVersionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambdamicrovms.outputs.GetImageVersionResult] =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.GetImageVersionArgs.builder
      com.pulumi.aws.lambdamicrovms.LambdamicrovmsFunctions.getImageVersion(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an AWS Lambda MicroVMs Image Version. */
    inline def getImageVersionPlain(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.GetImageVersionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambdamicrovms.outputs.GetImageVersionResult] =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.GetImageVersionPlainArgs.builder
      com.pulumi.aws.lambdamicrovms.LambdamicrovmsFunctions.getImageVersionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages an AWS Lambda MicroVMs MicroVM. Use this resource to run a MicroVM from a MicroVM image, which provisions a dedicated HTTPS endpoint and starts your application from the image snapshot.
   * 
   * &gt; MicroVMs are immutable. Because the service has no update operation, changing any argument terminates the MicroVM and runs a new one.
   */
  inline def Microvm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambdamicrovms.MicrovmArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lambdamicrovms.MicrovmArgs.builder
    com.pulumi.aws.lambdamicrovms.Microvm(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
