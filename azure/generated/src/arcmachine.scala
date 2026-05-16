package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object arcmachine:
  /** Manages a Hybrid Compute Machine Extension. */
  def Extension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.arcmachine.ExtensionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.arcmachine.ExtensionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.arcmachine.Extension(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Hybrid Compute Machine. */
  def ArcMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.arcmachine.ArcMachineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.arcmachine.ArcMachineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.arcmachine.ArcMachine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Arc Machine Automanage Configuration Profile Assignment. */
  def AutomanageConfigurationAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.arcmachine.AutomanageConfigurationAssignmentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.arcmachine.AutomanageConfigurationAssignmentArgs.builder
    com.pulumi.azure.arcmachine.AutomanageConfigurationAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.arcmachine.ArcMachineArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arcmachine.inputs.ArcMachineIdentityArgs.Builder]):
        com.pulumi.azure.arcmachine.ArcMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.arcmachine.inputs.ArcMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.arcmachine.ArcMachineArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  object ArcmachineFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Azure Arc machine. */
    inline def get(args: Endofunction[com.pulumi.azure.arcmachine.inputs.GetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.arcmachine.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.arcmachine.inputs.GetArgs.builder
      com.pulumi.azure.arcmachine.ArcmachineFunctions.get(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Arc machine. */
    inline def getPlain(args: Endofunction[com.pulumi.azure.arcmachine.inputs.GetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.arcmachine.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.arcmachine.inputs.GetPlainArgs.builder
      com.pulumi.azure.arcmachine.ArcmachineFunctions.getPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.arcmachine.inputs.ArcMachineState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arcmachine.inputs.ArcMachineIdentityArgs.Builder]):
        com.pulumi.azure.arcmachine.inputs.ArcMachineState.Builder =
      val argsBuilder = com.pulumi.azure.arcmachine.inputs.ArcMachineIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.arcmachine.inputs.ArcMachineState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
