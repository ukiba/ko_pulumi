package jp.ukiba.ko_pulumi
package gcp

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

    /** Get information about an Agent Registry Agent. */
    inline def getAgent(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.GetAgentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.agentregistry.outputs.GetAgentResult] =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.GetAgentArgs.builder
      com.pulumi.gcp.agentregistry.AgentregistryFunctions.getAgent(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get information about an Agent Registry Agent. */
    inline def getAgentPlain(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.GetAgentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.agentregistry.outputs.GetAgentResult] =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.GetAgentPlainArgs.builder
      com.pulumi.gcp.agentregistry.AgentregistryFunctions.getAgentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get information about an Agent Registry Endpoint. */
    inline def getEndpoint(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.GetEndpointArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.agentregistry.outputs.GetEndpointResult] =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.GetEndpointArgs.builder
      com.pulumi.gcp.agentregistry.AgentregistryFunctions.getEndpoint(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get information about an Agent Registry Endpoint. */
    inline def getEndpointPlain(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.GetEndpointPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.agentregistry.outputs.GetEndpointResult] =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.GetEndpointPlainArgs.builder
      com.pulumi.gcp.agentregistry.AgentregistryFunctions.getEndpointPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get information about an Agent Registry MCP Server. */
    inline def getMcpServer(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.GetMcpServerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.agentregistry.outputs.GetMcpServerResult] =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.GetMcpServerArgs.builder
      com.pulumi.gcp.agentregistry.AgentregistryFunctions.getMcpServer(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get information about an Agent Registry MCP Server. */
    inline def getMcpServerPlain(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.GetMcpServerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.agentregistry.outputs.GetMcpServerResult] =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.GetMcpServerPlainArgs.builder
      com.pulumi.gcp.agentregistry.AgentregistryFunctions.getMcpServerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Represents a user-defined Binding. */
  def Binding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.agentregistry.BindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.agentregistry.BindingArgs.builder
    com.pulumi.gcp.agentregistry.Binding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Service manages a service in a management boundary */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.agentregistry.ServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.agentregistry.ServiceArgs.builder
    com.pulumi.gcp.agentregistry.Service(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
