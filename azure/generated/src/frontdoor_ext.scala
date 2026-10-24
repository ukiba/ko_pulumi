package jp.ukiba.ko_pulumi
package azure

object frontdoor_ext:
  extension (builder: com.pulumi.azure.frontdoor.CustomHttpsConfigurationArgs.Builder)
    /**
     * @param customHttpsConfiguration A `customHttpsConfiguration` block as defined above.
     * @return builder
     */
    inline def customHttpsConfiguration(args: Endofunction[com.pulumi.azure.frontdoor.inputs.CustomHttpsConfigurationCustomHttpsConfigurationArgs.Builder]):
        com.pulumi.azure.frontdoor.CustomHttpsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.frontdoor.inputs.CustomHttpsConfigurationCustomHttpsConfigurationArgs.builder
      builder.customHttpsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.frontdoor.FirewallPolicyArgs.Builder)
    /**
     * @param customRules One or more `customRule` blocks as defined below.
     * @return builder
     */
    inline def customRules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.FirewallPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleArgs.builder
      builder.customRules(args.map(_(argsBuilder).build)*)

    /**
     * @param managedRules One or more `managedRule` blocks as defined below.
     * @return builder
     */
    inline def managedRules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.FirewallPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.builder
      builder.managedRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.FrontdoorArgs.Builder)
    /**
     * @param backendPoolHealthProbes A `backendPoolHealthProbe` block as defined below.
     * @return builder
     */
    inline def backendPoolHealthProbes(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolHealthProbeArgs.Builder]*):
        com.pulumi.azure.frontdoor.FrontdoorArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolHealthProbeArgs.builder
      builder.backendPoolHealthProbes(args.map(_(argsBuilder).build)*)

    /**
     * @param backendPoolLoadBalancings A `backendPoolLoadBalancing` block as defined below.
     * @return builder
     */
    inline def backendPoolLoadBalancings(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolLoadBalancingArgs.Builder]*):
        com.pulumi.azure.frontdoor.FrontdoorArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolLoadBalancingArgs.builder
      builder.backendPoolLoadBalancings(args.map(_(argsBuilder).build)*)

    /**
     * @param backendPoolSettings A `backendPoolSettings` block as defined below.
     * @return builder
     */
    inline def backendPoolSettings(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolSettingArgs.Builder]*):
        com.pulumi.azure.frontdoor.FrontdoorArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolSettingArgs.builder
      builder.backendPoolSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param backendPools A `backendPool` block as defined below.
     * 
     * &gt; Azure by default allows specifying up to 50 Backend Pools - but this quota can be increased via Microsoft Support.
     * @return builder
     */
    inline def backendPools(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolArgs.Builder]*):
        com.pulumi.azure.frontdoor.FrontdoorArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolArgs.builder
      builder.backendPools(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendEndpoints A `frontendEndpoint` block as defined below.
     * @return builder
     */
    inline def frontendEndpoints(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorFrontendEndpointArgs.Builder]*):
        com.pulumi.azure.frontdoor.FrontdoorArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorFrontendEndpointArgs.builder
      builder.frontendEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param routingRules A `routingRule` block as defined below.
     * @return builder
     */
    inline def routingRules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.FrontdoorArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.RulesEngineArgs.Builder)
    /**
     * @param rules A `rule` block as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.RulesEngineArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.CustomHttpsConfigurationState.Builder)
    /**
     * @param customHttpsConfiguration A `customHttpsConfiguration` block as defined above.
     * @return builder
     */
    inline def customHttpsConfiguration(args: Endofunction[com.pulumi.azure.frontdoor.inputs.CustomHttpsConfigurationCustomHttpsConfigurationArgs.Builder]):
        com.pulumi.azure.frontdoor.inputs.CustomHttpsConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.frontdoor.inputs.CustomHttpsConfigurationCustomHttpsConfigurationArgs.builder
      builder.customHttpsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleArgs.Builder)
    /**
     * @param matchConditions One or more `matchCondition` block defined below. Can support up to `10` `matchCondition` blocks.
     * @return builder
     */
    inline def matchConditions(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleMatchConditionArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleMatchConditionArgs.builder
      builder.matchConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.Builder)
    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleExclusionArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `override` blocks as defined below.
     * @return builder
     */
    inline def overrides(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideArgs.Builder)
    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideExclusionArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

    /**
     * @param rules One or more `rule` blocks as defined below. If none are specified, all of the rules in the group will be disabled.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideRuleArgs.Builder)
    /**
     * @param exclusions One or more `exclusion` blocks as defined below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideRuleExclusionArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideRuleExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FirewallPolicyState.Builder)
    /**
     * @param customRules One or more `customRule` blocks as defined below.
     * @return builder
     */
    inline def customRules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyCustomRuleArgs.builder
      builder.customRules(args.map(_(argsBuilder).build)*)

    /**
     * @param managedRules One or more `managedRule` blocks as defined below.
     * @return builder
     */
    inline def managedRules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FirewallPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleArgs.builder
      builder.managedRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolArgs.Builder)
    /**
     * @param backends A `backend` block as defined below.
     * @return builder
     */
    inline def backends(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolBackendArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolBackendArgs.builder
      builder.backends(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.Builder)
    /**
     * @param forwardingConfiguration A `forwardingConfiguration` block as defined below.
     * @return builder
     */
    inline def forwardingConfiguration(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleForwardingConfigurationArgs.Builder]):
        com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleForwardingConfigurationArgs.builder
      builder.forwardingConfiguration(args(argsBuilder).build)

    /**
     * @param redirectConfiguration A `redirectConfiguration` block as defined below.
     * @return builder
     */
    inline def redirectConfiguration(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleRedirectConfigurationArgs.Builder]):
        com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleRedirectConfigurationArgs.builder
      builder.redirectConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder)
    /**
     * @param backendPoolHealthProbes A `backendPoolHealthProbe` block as defined below.
     * @return builder
     */
    inline def backendPoolHealthProbes(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolHealthProbeArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolHealthProbeArgs.builder
      builder.backendPoolHealthProbes(args.map(_(argsBuilder).build)*)

    /**
     * @param backendPoolLoadBalancings A `backendPoolLoadBalancing` block as defined below.
     * @return builder
     */
    inline def backendPoolLoadBalancings(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolLoadBalancingArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolLoadBalancingArgs.builder
      builder.backendPoolLoadBalancings(args.map(_(argsBuilder).build)*)

    /**
     * @param backendPoolSettings A `backendPoolSettings` block as defined below.
     * @return builder
     */
    inline def backendPoolSettings(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolSettingArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolSettingArgs.builder
      builder.backendPoolSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param backendPools A `backendPool` block as defined below.
     * 
     * &gt; Azure by default allows specifying up to 50 Backend Pools - but this quota can be increased via Microsoft Support.
     * @return builder
     */
    inline def backendPools(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorBackendPoolArgs.builder
      builder.backendPools(args.map(_(argsBuilder).build)*)

    inline def explicitResourceOrders(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorExplicitResourceOrderArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorExplicitResourceOrderArgs.builder
      builder.explicitResourceOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendEndpoints A `frontendEndpoint` block as defined below.
     * @return builder
     */
    inline def frontendEndpoints(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorFrontendEndpointArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorFrontendEndpointArgs.builder
      builder.frontendEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param routingRules A `routingRule` block as defined below.
     * @return builder
     */
    inline def routingRules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.FrontdoorState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.FrontdoorRoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionArgs.Builder)
    /**
     * @param requestHeaders A `requestHeader` block as defined below.
     * @return builder
     */
    inline def requestHeaders(args: Endofunction[com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionRequestHeaderArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionRequestHeaderArgs.builder
      builder.requestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param responseHeaders A `responseHeader` block as defined below.
     * @return builder
     */
    inline def responseHeaders(args: Endofunction[com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionResponseHeaderArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionResponseHeaderArgs.builder
      builder.responseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.Builder)
    /**
     * @param action An `action` block as defined below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionArgs.Builder]):
        com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.frontdoor.inputs.RulesEngineRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param matchConditions One or more `matchCondition` block as defined below.
     * @return builder
     */
    inline def matchConditions(args: Endofunction[com.pulumi.azure.frontdoor.inputs.RulesEngineRuleMatchConditionArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.RulesEngineRuleMatchConditionArgs.builder
      builder.matchConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.frontdoor.inputs.RulesEngineState.Builder)
    /**
     * @param rules A `rule` block as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.Builder]*):
        com.pulumi.azure.frontdoor.inputs.RulesEngineState.Builder =
      def argsBuilder = com.pulumi.azure.frontdoor.inputs.RulesEngineRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)
