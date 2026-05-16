package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object loadtest:
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

  /** Manages a Load Test Service. */
  def LoadTest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.loadtest.LoadTestArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.loadtest.LoadTestArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.loadtest.LoadTest(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.loadtest.LoadTestArgs.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Changing this forces a new Load Test to be created.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.loadtest.inputs.LoadTestEncryptionArgs.Builder]):
        com.pulumi.azure.loadtest.LoadTestArgs.Builder =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.LoadTestEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Load Test.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.loadtest.inputs.LoadTestIdentityArgs.Builder]):
        com.pulumi.azure.loadtest.LoadTestArgs.Builder =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.LoadTestIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.loadtest.LoadTestArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.loadtest.inputs.LoadTestState.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Changing this forces a new Load Test to be created.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.loadtest.inputs.LoadTestEncryptionArgs.Builder]):
        com.pulumi.azure.loadtest.inputs.LoadTestState.Builder =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.LoadTestEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Load Test.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.loadtest.inputs.LoadTestIdentityArgs.Builder]):
        com.pulumi.azure.loadtest.inputs.LoadTestState.Builder =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.LoadTestIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.loadtest.inputs.LoadTestState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.loadtest.inputs.LoadTestEncryptionArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Load Test to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.loadtest.inputs.LoadTestEncryptionIdentityArgs.Builder]):
        com.pulumi.azure.loadtest.inputs.LoadTestEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.loadtest.inputs.LoadTestEncryptionIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
