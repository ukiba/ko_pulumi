package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object managedapplication:
  /** Manages a Managed Application. */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.managedapplication.ApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.managedapplication.ApplicationArgs.Builder)
    /**
     * @param plan One `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.managedapplication.inputs.ApplicationPlanArgs.Builder]):
        com.pulumi.azure.managedapplication.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedapplication.inputs.ApplicationPlanArgs.builder
      builder.plan(args(argsBuilder).build)

  /** Manages a Managed Application Definition. */
  def Definition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.managedapplication.DefinitionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.managedapplication.DefinitionArgs.Builder)
    /**
     * @param authorizations One or more `authorization` block defined below.
     * @return builder
     */
    def authorizations(args: Endofunction[com.pulumi.azure.managedapplication.inputs.DefinitionAuthorizationArgs.Builder]*):
        com.pulumi.azure.managedapplication.DefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.managedapplication.inputs.DefinitionAuthorizationArgs.builder
      builder.authorizations(args.map(_(argsBuilder).build)*)

  object ManagedapplicationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Uses this data source to access information about an existing Managed Application Definition. */
    inline def getDefinition(args: Endofunction[com.pulumi.azure.managedapplication.inputs.GetDefinitionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.managedapplication.outputs.GetDefinitionResult] =
      val argsBuilder = com.pulumi.azure.managedapplication.inputs.GetDefinitionArgs.builder
      com.pulumi.azure.managedapplication.ManagedapplicationFunctions.getDefinition(args(argsBuilder).build)

    /** Uses this data source to access information about an existing Managed Application Definition. */
    inline def getDefinitionPlain(args: Endofunction[com.pulumi.azure.managedapplication.inputs.GetDefinitionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.managedapplication.outputs.GetDefinitionResult] =
      val argsBuilder = com.pulumi.azure.managedapplication.inputs.GetDefinitionPlainArgs.builder
      com.pulumi.azure.managedapplication.ManagedapplicationFunctions.getDefinitionPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.managedapplication.inputs.ApplicationState.Builder)
    /**
     * @param plan One `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.managedapplication.inputs.ApplicationPlanArgs.Builder]):
        com.pulumi.azure.managedapplication.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.azure.managedapplication.inputs.ApplicationPlanArgs.builder
      builder.plan(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.managedapplication.inputs.DefinitionState.Builder)
    /**
     * @param authorizations One or more `authorization` block defined below.
     * @return builder
     */
    def authorizations(args: Endofunction[com.pulumi.azure.managedapplication.inputs.DefinitionAuthorizationArgs.Builder]*):
        com.pulumi.azure.managedapplication.inputs.DefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.managedapplication.inputs.DefinitionAuthorizationArgs.builder
      builder.authorizations(args.map(_(argsBuilder).build)*)
