package jp.ukiba.ko_pulumi
package gcp

object agentregistry_ext:
  extension (builder: com.pulumi.gcp.agentregistry.BindingArgs.Builder)
    /**
     * @param authProviderBinding The auth provider of the Binding.
     * Structure is documented below.
     * @return builder
     */
    inline def authProviderBinding(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.BindingAuthProviderBindingArgs.Builder]):
        com.pulumi.gcp.agentregistry.BindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.BindingAuthProviderBindingArgs.builder
      builder.authProviderBinding(args(argsBuilder).build)

    /**
     * @param source The source of the Binding.
     * Structure is documented below.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.BindingSourceArgs.Builder]):
        com.pulumi.gcp.agentregistry.BindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.BindingSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param target The target of the Binding.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.BindingTargetArgs.Builder]):
        com.pulumi.gcp.agentregistry.BindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.BindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.agentregistry.ServiceArgs.Builder)
    /**
     * @param agentSpec The spec of the Agent. When set, the type of the Service is Agent.
     * Structure is documented below.
     * @return builder
     */
    inline def agentSpec(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceAgentSpecArgs.Builder]):
        com.pulumi.gcp.agentregistry.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceAgentSpecArgs.builder
      builder.agentSpec(args(argsBuilder).build)

    /**
     * @param endpointSpec The spec of the Endpoint. When set, the type of the Service is Endpoint.
     * Structure is documented below.
     * @return builder
     */
    inline def endpointSpec(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceEndpointSpecArgs.Builder]):
        com.pulumi.gcp.agentregistry.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceEndpointSpecArgs.builder
      builder.endpointSpec(args(argsBuilder).build)

    /**
     * @param interfaces The connection details for the Service.
     * Structure is documented below.
     * @return builder
     */
    inline def interfaces(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceInterfaceArgs.Builder]*):
        com.pulumi.gcp.agentregistry.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceInterfaceArgs.builder
      builder.interfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param mcpServerSpec The spec of the MCP Server. When set, the type of the Service is MCP Server.
     * Structure is documented below.
     * @return builder
     */
    inline def mcpServerSpec(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceMcpServerSpecArgs.Builder]):
        com.pulumi.gcp.agentregistry.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceMcpServerSpecArgs.builder
      builder.mcpServerSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.agentregistry.inputs.BindingState.Builder)
    /**
     * @param authProviderBinding The auth provider of the Binding.
     * Structure is documented below.
     * @return builder
     */
    inline def authProviderBinding(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.BindingAuthProviderBindingArgs.Builder]):
        com.pulumi.gcp.agentregistry.inputs.BindingState.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.BindingAuthProviderBindingArgs.builder
      builder.authProviderBinding(args(argsBuilder).build)

    /**
     * @param source The source of the Binding.
     * Structure is documented below.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.BindingSourceArgs.Builder]):
        com.pulumi.gcp.agentregistry.inputs.BindingState.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.BindingSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param target The target of the Binding.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.BindingTargetArgs.Builder]):
        com.pulumi.gcp.agentregistry.inputs.BindingState.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.BindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.agentregistry.inputs.ServiceState.Builder)
    /**
     * @param agentSpec The spec of the Agent. When set, the type of the Service is Agent.
     * Structure is documented below.
     * @return builder
     */
    inline def agentSpec(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceAgentSpecArgs.Builder]):
        com.pulumi.gcp.agentregistry.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceAgentSpecArgs.builder
      builder.agentSpec(args(argsBuilder).build)

    /**
     * @param endpointSpec The spec of the Endpoint. When set, the type of the Service is Endpoint.
     * Structure is documented below.
     * @return builder
     */
    inline def endpointSpec(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceEndpointSpecArgs.Builder]):
        com.pulumi.gcp.agentregistry.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceEndpointSpecArgs.builder
      builder.endpointSpec(args(argsBuilder).build)

    /**
     * @param interfaces The connection details for the Service.
     * Structure is documented below.
     * @return builder
     */
    inline def interfaces(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceInterfaceArgs.Builder]*):
        com.pulumi.gcp.agentregistry.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceInterfaceArgs.builder
      builder.interfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param mcpServerSpec The spec of the MCP Server. When set, the type of the Service is MCP Server.
     * Structure is documented below.
     * @return builder
     */
    inline def mcpServerSpec(args: Endofunction[com.pulumi.gcp.agentregistry.inputs.ServiceMcpServerSpecArgs.Builder]):
        com.pulumi.gcp.agentregistry.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.agentregistry.inputs.ServiceMcpServerSpecArgs.builder
      builder.mcpServerSpec(args(argsBuilder).build)
