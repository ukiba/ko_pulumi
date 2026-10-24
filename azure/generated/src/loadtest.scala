package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object loadtest:
  /** Manages a Load Test Service. */
  def LoadTest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.loadtest.LoadTestArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loadtest.LoadTestArgs.builder
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
    com.pulumi.azure.loadtest.LoadTest(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object LoadtestFunctions:
    /** Use this data source to access information about a Load Test Service. */
    inline def get(args: Endofunction[com.pulumi.azure.loadtest.inputs.GetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.loadtest.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.GetArgs.builder
      com.pulumi.azure.loadtest.LoadtestFunctions.get(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about a Load Test Service. */
    inline def getPlain(args: Endofunction[com.pulumi.azure.loadtest.inputs.GetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.loadtest.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.GetPlainArgs.builder
      com.pulumi.azure.loadtest.LoadtestFunctions.getPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
