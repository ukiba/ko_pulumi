package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object arc:
  object ArcFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Arc Resource Bridge Appliance. */
    inline def getResourceBridgeAppliance(args: Endofunction[com.pulumi.azure.arc.inputs.GetResourceBridgeApplianceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.arc.outputs.GetResourceBridgeApplianceResult] =
      val argsBuilder = com.pulumi.azure.arc.inputs.GetResourceBridgeApplianceArgs.builder
      com.pulumi.azure.arc.ArcFunctions.getResourceBridgeAppliance(args(argsBuilder).build)

    /** Use this data source to access information about an existing Arc Resource Bridge Appliance. */
    inline def getResourceBridgeAppliancePlain(args: Endofunction[com.pulumi.azure.arc.inputs.GetResourceBridgeAppliancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.arc.outputs.GetResourceBridgeApplianceResult] =
      val argsBuilder = com.pulumi.azure.arc.inputs.GetResourceBridgeAppliancePlainArgs.builder
      com.pulumi.azure.arc.ArcFunctions.getResourceBridgeAppliancePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.arc.ResourceBridgeApplianceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arc.inputs.ResourceBridgeApplianceIdentityArgs.Builder]):
        com.pulumi.azure.arc.ResourceBridgeApplianceArgs.Builder =
      val argsBuilder = com.pulumi.azure.arc.inputs.ResourceBridgeApplianceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.arc.ResourceBridgeApplianceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Arc Resource Bridge Appliance. */
  def ResourceBridgeAppliance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.arc.ResourceBridgeApplianceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.arc.ResourceBridgeApplianceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.arc.ResourceBridgeAppliance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Arc Private Link Scope. */
  def PrivateLinkScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.arc.PrivateLinkScopeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.arc.PrivateLinkScopeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.arc.PrivateLinkScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.arc.inputs.ResourceBridgeApplianceState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arc.inputs.ResourceBridgeApplianceIdentityArgs.Builder]):
        com.pulumi.azure.arc.inputs.ResourceBridgeApplianceState.Builder =
      val argsBuilder = com.pulumi.azure.arc.inputs.ResourceBridgeApplianceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.arc.inputs.ResourceBridgeApplianceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
