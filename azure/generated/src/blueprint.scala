package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object blueprint:
  /**
   * Manages a Blueprint Assignment resource
   * 
   * &gt; **NOTE:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
   * 
   * &gt; **NOTE:** Azure Blueprint Assignments can only be applied to Subscriptions.  Assignments to Management Groups is not currently supported by the service or by this provider.
   */
  inline def Assignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.blueprint.AssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.blueprint.AssignmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.blueprint.Assignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object BlueprintFunctions:
    /**
     * Use this data source to access information about an existing Azure Blueprint Definition
     * 
     * &gt; **Note:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
     */
    inline def getDefinition(args: Endofunction[com.pulumi.azure.blueprint.inputs.GetDefinitionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.blueprint.outputs.GetDefinitionResult] =
      val argsBuilder = com.pulumi.azure.blueprint.inputs.GetDefinitionArgs.builder
      com.pulumi.azure.blueprint.BlueprintFunctions.getDefinition(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to access information about an existing Azure Blueprint Definition
     * 
     * &gt; **Note:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
     */
    inline def getDefinitionPlain(args: Endofunction[com.pulumi.azure.blueprint.inputs.GetDefinitionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.blueprint.outputs.GetDefinitionResult] =
      val argsBuilder = com.pulumi.azure.blueprint.inputs.GetDefinitionPlainArgs.builder
      com.pulumi.azure.blueprint.BlueprintFunctions.getDefinitionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to access information about an existing Blueprint Published Version
     * 
     * &gt; **Note:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
     */
    inline def getPublishedVersion(args: Endofunction[com.pulumi.azure.blueprint.inputs.GetPublishedVersionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.blueprint.outputs.GetPublishedVersionResult] =
      val argsBuilder = com.pulumi.azure.blueprint.inputs.GetPublishedVersionArgs.builder
      com.pulumi.azure.blueprint.BlueprintFunctions.getPublishedVersion(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to access information about an existing Blueprint Published Version
     * 
     * &gt; **Note:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
     */
    inline def getPublishedVersionPlain(args: Endofunction[com.pulumi.azure.blueprint.inputs.GetPublishedVersionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.blueprint.outputs.GetPublishedVersionResult] =
      val argsBuilder = com.pulumi.azure.blueprint.inputs.GetPublishedVersionPlainArgs.builder
      com.pulumi.azure.blueprint.BlueprintFunctions.getPublishedVersionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
