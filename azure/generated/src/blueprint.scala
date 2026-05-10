package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object blueprint:
  /**
   * Manages a Blueprint Assignment resource
   * 
   *  &gt; **NOTE:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
   * 
   *  &gt; **NOTE:** Azure Blueprint Assignments can only be applied to Subscriptions.  Assignments to Management Groups is not currently supported by the service or by this provider.
   */
  def Assignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.blueprint.AssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.blueprint.AssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.blueprint.Assignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type BlueprintFunctions = com.pulumi.azure.blueprint.BlueprintFunctions
  object BlueprintFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.blueprint.BlueprintFunctions.*
  extension (self: BlueprintFunctions.type)
    /**
     * Use this data source to access information about an existing Azure Blueprint Definition
     * 
     *  &gt; **Note:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
     */
    def getDefinition(args: Endofunction[com.pulumi.azure.blueprint.inputs.GetDefinitionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.blueprint.outputs.GetDefinitionResult] =
      val argsBuilder = com.pulumi.azure.blueprint.inputs.GetDefinitionArgs.builder
      com.pulumi.azure.blueprint.BlueprintFunctions.getDefinition(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Azure Blueprint Definition
     * 
     *  &gt; **Note:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
     */
    def getDefinitionPlain(args: Endofunction[com.pulumi.azure.blueprint.inputs.GetDefinitionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.blueprint.outputs.GetDefinitionResult] =
      val argsBuilder = com.pulumi.azure.blueprint.inputs.GetDefinitionPlainArgs.builder
      com.pulumi.azure.blueprint.BlueprintFunctions.getDefinitionPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Blueprint Published Version
     * 
     *  &gt; **Note:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
     */
    def getPublishedVersion(args: Endofunction[com.pulumi.azure.blueprint.inputs.GetPublishedVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.blueprint.outputs.GetPublishedVersionResult] =
      val argsBuilder = com.pulumi.azure.blueprint.inputs.GetPublishedVersionArgs.builder
      com.pulumi.azure.blueprint.BlueprintFunctions.getPublishedVersion(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Blueprint Published Version
     * 
     *  &gt; **Note:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
     */
    def getPublishedVersionPlain(args: Endofunction[com.pulumi.azure.blueprint.inputs.GetPublishedVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.blueprint.outputs.GetPublishedVersionResult] =
      val argsBuilder = com.pulumi.azure.blueprint.inputs.GetPublishedVersionPlainArgs.builder
      com.pulumi.azure.blueprint.BlueprintFunctions.getPublishedVersionPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.blueprint.AssignmentArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.blueprint.inputs.AssignmentIdentityArgs.Builder]):
        com.pulumi.azure.blueprint.AssignmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.blueprint.inputs.AssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.blueprint.inputs.AssignmentState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.blueprint.inputs.AssignmentIdentityArgs.Builder]):
        com.pulumi.azure.blueprint.inputs.AssignmentState.Builder =
      val argsBuilder = com.pulumi.azure.blueprint.inputs.AssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
