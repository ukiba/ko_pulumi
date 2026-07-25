package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object agentregistry:
  object AgentregistryFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get information about an Agent Registry Agent. */
    inline def getAgent(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.GetAgentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.agentregistry.outputs.GetAgentResult] =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.GetAgentArgs.builder
      com.pulumi.gcp.agentregistry.AgentregistryFunctions.getAgent(args(argsBuilder).build)

    /** Get information about an Agent Registry Agent. */
    inline def getAgentPlain(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.GetAgentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.agentregistry.outputs.GetAgentResult] =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.GetAgentPlainArgs.builder
      com.pulumi.gcp.agentregistry.AgentregistryFunctions.getAgentPlain(args(argsBuilder).build)

    /** Get information about an Agent Registry Endpoint. */
    inline def getEndpoint(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.GetEndpointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.agentregistry.outputs.GetEndpointResult] =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.GetEndpointArgs.builder
      com.pulumi.gcp.agentregistry.AgentregistryFunctions.getEndpoint(args(argsBuilder).build)

    /** Get information about an Agent Registry Endpoint. */
    inline def getEndpointPlain(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.GetEndpointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.agentregistry.outputs.GetEndpointResult] =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.GetEndpointPlainArgs.builder
      com.pulumi.gcp.agentregistry.AgentregistryFunctions.getEndpointPlain(args(argsBuilder).build)

    /** Get information about an Agent Registry MCP Server. */
    inline def getMcpServer(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.GetMcpServerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.agentregistry.outputs.GetMcpServerResult] =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.GetMcpServerArgs.builder
      com.pulumi.gcp.agentregistry.AgentregistryFunctions.getMcpServer(args(argsBuilder).build)

    /** Get information about an Agent Registry MCP Server. */
    inline def getMcpServerPlain(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.GetMcpServerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.agentregistry.outputs.GetMcpServerResult] =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.GetMcpServerPlainArgs.builder
      com.pulumi.gcp.agentregistry.AgentregistryFunctions.getMcpServerPlain(args(argsBuilder).build)

  /** Represents a user-defined Binding. */
  def Binding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.agentregistry.BindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.agentregistry.BindingArgs.builder
    com.pulumi.gcp.agentregistry.Binding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.agentregistry.BindingArgs.Builder)
    /**
     * @param authProviderBinding The auth provider of the Binding.
     * Structure is documented below.
     * @return builder
     */
    def authProviderBinding(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.BindingAuthProviderBindingArgs.Builder]):
        com.pulumi.gcp.agentregistry.BindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.BindingAuthProviderBindingArgs.builder
      builder.authProviderBinding(args(argsBuilder).build)

    /**
     * @param source The source of the Binding.
     * Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.BindingSourceArgs.Builder]):
        com.pulumi.gcp.agentregistry.BindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.BindingSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param target The target of the Binding.
     * Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.BindingTargetArgs.Builder]):
        com.pulumi.gcp.agentregistry.BindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.BindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  /** Service manages a service in a management boundary */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.agentregistry.ServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.agentregistry.ServiceArgs.builder
    com.pulumi.gcp.agentregistry.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.agentregistry.ServiceArgs.Builder)
    /**
     * @param agentSpec The spec of the Agent. When set, the type of the Service is Agent.
     * Structure is documented below.
     * @return builder
     */
    def agentSpec(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceAgentSpecArgs.Builder]):
        com.pulumi.gcp.agentregistry.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceAgentSpecArgs.builder
      builder.agentSpec(args(argsBuilder).build)

    /**
     * @param endpointSpec The spec of the Endpoint. When set, the type of the Service is Endpoint.
     * Structure is documented below.
     * @return builder
     */
    def endpointSpec(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceEndpointSpecArgs.Builder]):
        com.pulumi.gcp.agentregistry.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceEndpointSpecArgs.builder
      builder.endpointSpec(args(argsBuilder).build)

    /**
     * @param interfaces The connection details for the Service.
     * Structure is documented below.
     * @return builder
     */
    def interfaces(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceInterfaceArgs.Builder]*):
        com.pulumi.gcp.agentregistry.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceInterfaceArgs.builder
      builder.interfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param mcpServerSpec The spec of the MCP Server. When set, the type of the Service is MCP Server.
     * Structure is documented below.
     * @return builder
     */
    def mcpServerSpec(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceMcpServerSpecArgs.Builder]):
        com.pulumi.gcp.agentregistry.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceMcpServerSpecArgs.builder
      builder.mcpServerSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.agentregistry.inputs.BindingState.Builder)
    /**
     * @param authProviderBinding The auth provider of the Binding.
     * Structure is documented below.
     * @return builder
     */
    def authProviderBinding(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.BindingAuthProviderBindingArgs.Builder]):
        com.pulumi.gcp.agentregistry.inputs.BindingState.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.BindingAuthProviderBindingArgs.builder
      builder.authProviderBinding(args(argsBuilder).build)

    /**
     * @param source The source of the Binding.
     * Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.BindingSourceArgs.Builder]):
        com.pulumi.gcp.agentregistry.inputs.BindingState.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.BindingSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param target The target of the Binding.
     * Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.BindingTargetArgs.Builder]):
        com.pulumi.gcp.agentregistry.inputs.BindingState.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.BindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.agentregistry.inputs.ServiceState.Builder)
    /**
     * @param agentSpec The spec of the Agent. When set, the type of the Service is Agent.
     * Structure is documented below.
     * @return builder
     */
    def agentSpec(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceAgentSpecArgs.Builder]):
        com.pulumi.gcp.agentregistry.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceAgentSpecArgs.builder
      builder.agentSpec(args(argsBuilder).build)

    /**
     * @param endpointSpec The spec of the Endpoint. When set, the type of the Service is Endpoint.
     * Structure is documented below.
     * @return builder
     */
    def endpointSpec(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceEndpointSpecArgs.Builder]):
        com.pulumi.gcp.agentregistry.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceEndpointSpecArgs.builder
      builder.endpointSpec(args(argsBuilder).build)

    /**
     * @param interfaces The connection details for the Service.
     * Structure is documented below.
     * @return builder
     */
    def interfaces(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceInterfaceArgs.Builder]*):
        com.pulumi.gcp.agentregistry.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceInterfaceArgs.builder
      builder.interfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param mcpServerSpec The spec of the MCP Server. When set, the type of the Service is MCP Server.
     * Structure is documented below.
     * @return builder
     */
    def mcpServerSpec(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceMcpServerSpecArgs.Builder]):
        com.pulumi.gcp.agentregistry.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceMcpServerSpecArgs.builder
      builder.mcpServerSpec(args(argsBuilder).build)
