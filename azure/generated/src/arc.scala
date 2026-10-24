package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object arc:
  object ArcFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Arc Resource Bridge Appliance. */
    inline def getResourceBridgeAppliance(args: Endofunction[com.pulumi.azure.arc.inputs.GetResourceBridgeApplianceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.arc.outputs.GetResourceBridgeApplianceResult] =
      val argsBuilder = com.pulumi.azure.arc.inputs.GetResourceBridgeApplianceArgs.builder
      com.pulumi.azure.arc.ArcFunctions.getResourceBridgeAppliance(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Arc Resource Bridge Appliance. */
    inline def getResourceBridgeAppliancePlain(args: Endofunction[com.pulumi.azure.arc.inputs.GetResourceBridgeAppliancePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.arc.outputs.GetResourceBridgeApplianceResult] =
      val argsBuilder = com.pulumi.azure.arc.inputs.GetResourceBridgeAppliancePlainArgs.builder
      com.pulumi.azure.arc.ArcFunctions.getResourceBridgeAppliancePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an Azure Arc Private Link Scope. */
  def PrivateLinkScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.arc.PrivateLinkScopeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.arc.PrivateLinkScopeArgs.builder
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
    com.pulumi.azure.arc.PrivateLinkScope(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Arc Resource Bridge Appliance. */
  def ResourceBridgeAppliance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.arc.ResourceBridgeApplianceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.arc.ResourceBridgeApplianceArgs.builder
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
    com.pulumi.azure.arc.ResourceBridgeAppliance(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
