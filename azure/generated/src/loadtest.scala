package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object loadtest:
  /** Manages a Load Test Service. */
  def LoadTest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loadtest.LoadTestArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object LoadtestFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about a Load Test Service. */
    inline def get(args: Endofunction[com.pulumi.azure.loadtest.inputs.GetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.loadtest.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.GetArgs.builder
      com.pulumi.azure.loadtest.LoadtestFunctions.get(args(argsBuilder).build)

    /** Use this data source to access information about a Load Test Service. */
    inline def getPlain(args: Endofunction[com.pulumi.azure.loadtest.inputs.GetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.loadtest.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.GetPlainArgs.builder
      com.pulumi.azure.loadtest.LoadtestFunctions.getPlain(args(argsBuilder).build)
