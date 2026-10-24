package jp.ukiba.ko_pulumi
package azure

object lb_ext:
  extension (builder: com.pulumi.azure.lb.BackendAddressPoolArgs.Builder)
    /**
     * @param tunnelInterfaces One or more `tunnelInterface` blocks as defined below.
     * @return builder
     */
    inline def tunnelInterfaces(args: Endofunction[com.pulumi.azure.lb.inputs.BackendAddressPoolTunnelInterfaceArgs.Builder]*):
        com.pulumi.azure.lb.BackendAddressPoolArgs.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.BackendAddressPoolTunnelInterfaceArgs.builder
      builder.tunnelInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.lb.LoadBalancerArgs.Builder)
    /**
     * @param frontendIpConfigurations One or more `frontendIpConfiguration` blocks as documented below.
     * 
     * &gt; **Note:** Azure Load Balancer does not allow the complete removal of all previously attached frontend configurations. If you have previously applied with one or more `frontendIpConfiguration` arguments, the removal of them all will result in a replacement  (destroy/create) of the Load Balancer.
     * @return builder
     */
    inline def frontendIpConfigurations(args: Endofunction[com.pulumi.azure.lb.inputs.LoadBalancerFrontendIpConfigurationArgs.Builder]*):
        com.pulumi.azure.lb.LoadBalancerArgs.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.LoadBalancerFrontendIpConfigurationArgs.builder
      builder.frontendIpConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.lb.OutboundRuleArgs.Builder)
    /**
     * @param frontendIpConfigurations One or more `frontendIpConfiguration` blocks as defined below.
     * @return builder
     */
    inline def frontendIpConfigurations(args: Endofunction[com.pulumi.azure.lb.inputs.OutboundRuleFrontendIpConfigurationArgs.Builder]*):
        com.pulumi.azure.lb.OutboundRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.OutboundRuleFrontendIpConfigurationArgs.builder
      builder.frontendIpConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.lb.inputs.BackendAddressPoolAddressState.Builder)
    /**
     * @param inboundNatRulePortMappings A list of `inboundNatRulePortMapping` block as defined below.
     * @return builder
     */
    inline def inboundNatRulePortMappings(args: Endofunction[com.pulumi.azure.lb.inputs.BackendAddressPoolAddressInboundNatRulePortMappingArgs.Builder]*):
        com.pulumi.azure.lb.inputs.BackendAddressPoolAddressState.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.BackendAddressPoolAddressInboundNatRulePortMappingArgs.builder
      builder.inboundNatRulePortMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.lb.inputs.BackendAddressPoolState.Builder)
    /**
     * @param tunnelInterfaces One or more `tunnelInterface` blocks as defined below.
     * @return builder
     */
    inline def tunnelInterfaces(args: Endofunction[com.pulumi.azure.lb.inputs.BackendAddressPoolTunnelInterfaceArgs.Builder]*):
        com.pulumi.azure.lb.inputs.BackendAddressPoolState.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.BackendAddressPoolTunnelInterfaceArgs.builder
      builder.tunnelInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.lb.inputs.LoadBalancerState.Builder)
    /**
     * @param frontendIpConfigurations One or more `frontendIpConfiguration` blocks as documented below.
     * 
     * &gt; **Note:** Azure Load Balancer does not allow the complete removal of all previously attached frontend configurations. If you have previously applied with one or more `frontendIpConfiguration` arguments, the removal of them all will result in a replacement  (destroy/create) of the Load Balancer.
     * @return builder
     */
    inline def frontendIpConfigurations(args: Endofunction[com.pulumi.azure.lb.inputs.LoadBalancerFrontendIpConfigurationArgs.Builder]*):
        com.pulumi.azure.lb.inputs.LoadBalancerState.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.LoadBalancerFrontendIpConfigurationArgs.builder
      builder.frontendIpConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.lb.inputs.OutboundRuleState.Builder)
    /**
     * @param frontendIpConfigurations One or more `frontendIpConfiguration` blocks as defined below.
     * @return builder
     */
    inline def frontendIpConfigurations(args: Endofunction[com.pulumi.azure.lb.inputs.OutboundRuleFrontendIpConfigurationArgs.Builder]*):
        com.pulumi.azure.lb.inputs.OutboundRuleState.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.OutboundRuleFrontendIpConfigurationArgs.builder
      builder.frontendIpConfigurations(args.map(_(argsBuilder).build)*)
