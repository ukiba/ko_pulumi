package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object agentregistry:
  object AgentregistryFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about an AWS Agent Registry registry. */
    inline def getRegistry(args: Endofunction[com.pulumi.aws.agentregistry.inputs.GetRegistryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.agentregistry.outputs.GetRegistryResult] =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.GetRegistryArgs.builder
      com.pulumi.aws.agentregistry.AgentregistryFunctions.getRegistry(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an AWS Agent Registry registry. */
    inline def getRegistryPlain(args: Endofunction[com.pulumi.aws.agentregistry.inputs.GetRegistryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.agentregistry.outputs.GetRegistryResult] =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.GetRegistryPlainArgs.builder
      com.pulumi.aws.agentregistry.AgentregistryFunctions.getRegistryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages an AWS Agent Registry registry.
   * 
   * A registry allows developers to discover, manage, and govern reusable agentic components such as tools, prompts, guardrails, and knowledge bases.
   */
  def Registry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.agentregistry.RegistryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.agentregistry.RegistryArgs.builder
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
    com.pulumi.aws.agentregistry.Registry(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
