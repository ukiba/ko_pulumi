package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object managedapplication:
  /** Manages a Managed Application. */
  inline def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.managedapplication.ApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.managedapplication.ApplicationArgs.builder
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
    com.pulumi.azure.managedapplication.Application(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Managed Application Definition. */
  inline def Definition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.managedapplication.DefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.managedapplication.DefinitionArgs.builder
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
    com.pulumi.azure.managedapplication.Definition(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ManagedapplicationFunctions:
    /** Uses this data source to access information about an existing Managed Application Definition. */
    inline def getDefinition(args: Endofunction[com.pulumi.azure.managedapplication.inputs.GetDefinitionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.managedapplication.outputs.GetDefinitionResult] =
      val argsBuilder = com.pulumi.azure.managedapplication.inputs.GetDefinitionArgs.builder
      com.pulumi.azure.managedapplication.ManagedapplicationFunctions.getDefinition(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Uses this data source to access information about an existing Managed Application Definition. */
    inline def getDefinitionPlain(args: Endofunction[com.pulumi.azure.managedapplication.inputs.GetDefinitionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.managedapplication.outputs.GetDefinitionResult] =
      val argsBuilder = com.pulumi.azure.managedapplication.inputs.GetDefinitionPlainArgs.builder
      com.pulumi.azure.managedapplication.ManagedapplicationFunctions.getDefinitionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
