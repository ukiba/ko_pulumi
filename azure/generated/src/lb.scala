package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object lb:
  /**
   * Manages a Load Balancer NAT pool.
   * 
   *  &gt; **Note:** This resource cannot be used with with virtual machines, instead use the `azure.lb.NatRule` resource.
   * 
   *  &gt; **Note:** When using this resource, the Load Balancer needs to have a FrontEnd IP Configuration Attached
   */
  def NatPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.lb.NatPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.lb.NatPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.lb.NatPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Load Balancer Resource. */
  def LoadBalancer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.lb.LoadBalancerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.lb.LoadBalancerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.lb.LoadBalancer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a LoadBalancer Probe Resource.
   * 
   *  &gt; **Note:** When using this resource, the Load Balancer needs to have a FrontEnd IP Configuration Attached
   */
  def Probe(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.lb.ProbeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.lb.ProbeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.lb.Probe(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type LbFunctions = com.pulumi.azure.lb.LbFunctions
  object LbFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.lb.LbFunctions.*
  extension (self: LbFunctions.type)
    /** Use this data source to access information about an existing Load Balancer&#39;s Backend Address Pool. */
    def getBackendAddressPool(args: Endofunction[com.pulumi.azure.lb.inputs.GetBackendAddressPoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.lb.outputs.GetBackendAddressPoolResult] =
      val argsBuilder = com.pulumi.azure.lb.inputs.GetBackendAddressPoolArgs.builder
      com.pulumi.azure.lb.LbFunctions.getBackendAddressPool(args(argsBuilder).build)

    /** Use this data source to access information about an existing Load Balancer&#39;s Backend Address Pool. */
    def getBackendAddressPoolPlain(args: Endofunction[com.pulumi.azure.lb.inputs.GetBackendAddressPoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.lb.outputs.GetBackendAddressPoolResult] =
      val argsBuilder = com.pulumi.azure.lb.inputs.GetBackendAddressPoolPlainArgs.builder
      com.pulumi.azure.lb.LbFunctions.getBackendAddressPoolPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Load Balancer */
    def getLB(args: Endofunction[com.pulumi.azure.lb.inputs.GetLBArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.lb.outputs.GetLBResult] =
      val argsBuilder = com.pulumi.azure.lb.inputs.GetLBArgs.builder
      com.pulumi.azure.lb.LbFunctions.getLB(args(argsBuilder).build)

    /** Use this data source to access information about an existing Load Balancer */
    def getLBPlain(args: Endofunction[com.pulumi.azure.lb.inputs.GetLBPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.lb.outputs.GetLBResult] =
      val argsBuilder = com.pulumi.azure.lb.inputs.GetLBPlainArgs.builder
      com.pulumi.azure.lb.LbFunctions.getLBPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Load Balancer Outbound Rule. */
    def getLBOutboundRule(args: Endofunction[com.pulumi.azure.lb.inputs.GetLBOutboundRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.lb.outputs.GetLBOutboundRuleResult] =
      val argsBuilder = com.pulumi.azure.lb.inputs.GetLBOutboundRuleArgs.builder
      com.pulumi.azure.lb.LbFunctions.getLBOutboundRule(args(argsBuilder).build)

    /** Use this data source to access information about an existing Load Balancer Outbound Rule. */
    def getLBOutboundRulePlain(args: Endofunction[com.pulumi.azure.lb.inputs.GetLBOutboundRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.lb.outputs.GetLBOutboundRuleResult] =
      val argsBuilder = com.pulumi.azure.lb.inputs.GetLBOutboundRulePlainArgs.builder
      com.pulumi.azure.lb.LbFunctions.getLBOutboundRulePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Load Balancer Rule. */
    def getLBRule(args: Endofunction[com.pulumi.azure.lb.inputs.GetLBRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.lb.outputs.GetLBRuleResult] =
      val argsBuilder = com.pulumi.azure.lb.inputs.GetLBRuleArgs.builder
      com.pulumi.azure.lb.LbFunctions.getLBRule(args(argsBuilder).build)

    /** Use this data source to access information about an existing Load Balancer Rule. */
    def getLBRulePlain(args: Endofunction[com.pulumi.azure.lb.inputs.GetLBRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.lb.outputs.GetLBRuleResult] =
      val argsBuilder = com.pulumi.azure.lb.inputs.GetLBRulePlainArgs.builder
      com.pulumi.azure.lb.LbFunctions.getLBRulePlain(args(argsBuilder).build)

  /**
   * Manages a Backend Address within a Backend Address Pool.
   * 
   *  &gt; **Note:** Backend Addresses can only be added to a `Standard` SKU Load Balancer.
   */
  def BackendAddressPoolAddress(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.lb.BackendAddressPoolAddressArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.lb.BackendAddressPoolAddressArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.lb.BackendAddressPoolAddress(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Load Balancer Backend Address Pool.
   * 
   *  &gt; **Note:** When using this resource, the Load Balancer needs to have a FrontEnd IP Configuration Attached
   */
  def BackendAddressPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.lb.BackendAddressPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.lb.BackendAddressPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.lb.BackendAddressPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Load Balancer NAT Rule.
   * 
   *  &gt; **Note:** This resource cannot be used with with virtual machine scale sets, instead use the `azure.lb.NatPool` resource.
   * 
   *  &gt; **Note:** When using this resource, the Load Balancer needs to have a FrontEnd IP Configuration Attached
   */
  def NatRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.lb.NatRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.lb.NatRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.lb.NatRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.lb.LoadBalancerArgs.Builder)
    /**
     * @param frontendIpConfigurations One or more `frontendIpConfiguration` blocks as documented below.
     * 
     *  &gt; **Note:** Azure Load Balancer does not allow the complete removal of all previously attached frontend configurations. If you have previously applied with one or more `frontendIpConfiguration` arguments, the removal of them all will result in a replacement  (destroy/create) of the Load Balancer.
     * @return builder
     */
    def frontendIpConfigurations(args: Endofunction[com.pulumi.azure.lb.inputs.LoadBalancerFrontendIpConfigurationArgs.Builder]*):
        com.pulumi.azure.lb.LoadBalancerArgs.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.LoadBalancerFrontendIpConfigurationArgs.builder
      builder.frontendIpConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.lb.LoadBalancerArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Load Balancer Outbound Rule.
   * 
   *  &gt; **Note:** When using this resource, the Load Balancer needs to have a FrontEnd IP Configuration and a Backend Address Pool Attached.
   */
  def OutboundRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.lb.OutboundRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.lb.OutboundRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.lb.OutboundRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.lb.BackendAddressPoolArgs.Builder)
    /**
     * @param tunnelInterfaces One or more `tunnelInterface` blocks as defined below.
     * @return builder
     */
    def tunnelInterfaces(args: Endofunction[com.pulumi.azure.lb.inputs.BackendAddressPoolTunnelInterfaceArgs.Builder]*):
        com.pulumi.azure.lb.BackendAddressPoolArgs.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.BackendAddressPoolTunnelInterfaceArgs.builder
      builder.tunnelInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.lb.OutboundRuleArgs.Builder)
    /**
     * @param frontendIpConfigurations One or more `frontendIpConfiguration` blocks as defined below.
     * @return builder
     */
    def frontendIpConfigurations(args: Endofunction[com.pulumi.azure.lb.inputs.OutboundRuleFrontendIpConfigurationArgs.Builder]*):
        com.pulumi.azure.lb.OutboundRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.OutboundRuleFrontendIpConfigurationArgs.builder
      builder.frontendIpConfigurations(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Load Balancer Rule.
   * 
   *  &gt; **Note:** When using this resource, the Load Balancer needs to have a FrontEnd IP Configuration Attached
   */
  def Rule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.lb.RuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.lb.RuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.lb.Rule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.lb.inputs.OutboundRuleState.Builder)
    /**
     * @param frontendIpConfigurations One or more `frontendIpConfiguration` blocks as defined below.
     * @return builder
     */
    def frontendIpConfigurations(args: Endofunction[com.pulumi.azure.lb.inputs.OutboundRuleFrontendIpConfigurationArgs.Builder]*):
        com.pulumi.azure.lb.inputs.OutboundRuleState.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.OutboundRuleFrontendIpConfigurationArgs.builder
      builder.frontendIpConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.lb.inputs.BackendAddressPoolState.Builder)
    /**
     * @param tunnelInterfaces One or more `tunnelInterface` blocks as defined below.
     * @return builder
     */
    def tunnelInterfaces(args: Endofunction[com.pulumi.azure.lb.inputs.BackendAddressPoolTunnelInterfaceArgs.Builder]*):
        com.pulumi.azure.lb.inputs.BackendAddressPoolState.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.BackendAddressPoolTunnelInterfaceArgs.builder
      builder.tunnelInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.lb.inputs.LoadBalancerState.Builder)
    /**
     * @param frontendIpConfigurations One or more `frontendIpConfiguration` blocks as documented below.
     * 
     *  &gt; **Note:** Azure Load Balancer does not allow the complete removal of all previously attached frontend configurations. If you have previously applied with one or more `frontendIpConfiguration` arguments, the removal of them all will result in a replacement  (destroy/create) of the Load Balancer.
     * @return builder
     */
    def frontendIpConfigurations(args: Endofunction[com.pulumi.azure.lb.inputs.LoadBalancerFrontendIpConfigurationArgs.Builder]*):
        com.pulumi.azure.lb.inputs.LoadBalancerState.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.LoadBalancerFrontendIpConfigurationArgs.builder
      builder.frontendIpConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.lb.inputs.LoadBalancerState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.lb.inputs.BackendAddressPoolAddressState.Builder)
    /**
     * @param inboundNatRulePortMappings A list of `inboundNatRulePortMapping` block as defined below.
     * @return builder
     */
    def inboundNatRulePortMappings(args: Endofunction[com.pulumi.azure.lb.inputs.BackendAddressPoolAddressInboundNatRulePortMappingArgs.Builder]*):
        com.pulumi.azure.lb.inputs.BackendAddressPoolAddressState.Builder =
      def argsBuilder = com.pulumi.azure.lb.inputs.BackendAddressPoolAddressInboundNatRulePortMappingArgs.builder
      builder.inboundNatRulePortMappings(args.map(_(argsBuilder).build)*)
