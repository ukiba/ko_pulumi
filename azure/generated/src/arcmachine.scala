package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object arcmachine:
  /** Manages a Hybrid Compute Machine. */
  inline def ArcMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.arcmachine.ArcMachineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.arcmachine.ArcMachineArgs.builder
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
    com.pulumi.azure.arcmachine.ArcMachine(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ArcmachineFunctions:
    /** Use this data source to access information about an existing Azure Arc machine. */
    inline def get(args: Endofunction[com.pulumi.azure.arcmachine.inputs.GetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.arcmachine.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.arcmachine.inputs.GetArgs.builder
      com.pulumi.azure.arcmachine.ArcmachineFunctions.get(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Azure Arc machine. */
    inline def getPlain(args: Endofunction[com.pulumi.azure.arcmachine.inputs.GetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.arcmachine.outputs.GetResult] =
      val argsBuilder = com.pulumi.azure.arcmachine.inputs.GetPlainArgs.builder
      com.pulumi.azure.arcmachine.ArcmachineFunctions.getPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an Arc Machine Automanage Configuration Profile Assignment. */
  inline def AutomanageConfigurationAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.arcmachine.AutomanageConfigurationAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.arcmachine.AutomanageConfigurationAssignmentArgs.builder
    com.pulumi.azure.arcmachine.AutomanageConfigurationAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Hybrid Compute Machine Extension. */
  inline def Extension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.arcmachine.ExtensionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.arcmachine.ExtensionArgs.builder
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
    com.pulumi.azure.arcmachine.Extension(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
