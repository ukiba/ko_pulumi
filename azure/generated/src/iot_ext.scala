package jp.ukiba.ko_pulumi
package azure

object iot_ext:
  extension (builder: com.pulumi.azure.iot.IoTHubArgs.Builder)
    inline def cloudToDevice(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceArgs.Builder]):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceArgs.builder
      builder.cloudToDevice(args(argsBuilder).build)

    /**
     * @param endpoints An `endpoint` block as defined below.
     * @return builder
     */
    inline def endpoints(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubEndpointArgs.Builder]*):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    inline def enrichments(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubEnrichmentArgs.Builder]*):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubEnrichmentArgs.builder
      builder.enrichments(args.map(_(argsBuilder).build)*)

    /**
     * @param fallbackRoute A `fallbackRoute` block as defined below. If the fallback route is enabled, messages that don&#39;t match any of the supplied routes are automatically sent to this route. Defaults to messages/events.
     * 
     * &gt; **Note:** If `fallbackRoute` isn&#39;t explicitly specified, the fallback route wouldn&#39;t be enabled by default.
     * @return builder
     */
    inline def fallbackRoute(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubFallbackRouteArgs.Builder]):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubFallbackRouteArgs.builder
      builder.fallbackRoute(args(argsBuilder).build)

    /**
     * @param fileUpload A `fileUpload` block as defined below.
     * @return builder
     */
    inline def fileUpload(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubFileUploadArgs.Builder]):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubFileUploadArgs.builder
      builder.fileUpload(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubIdentityArgs.Builder]):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRuleSets A `networkRuleSet` block as defined below.
     * @return builder
     */
    inline def networkRuleSets(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetArgs.Builder]*):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetArgs.builder
      builder.networkRuleSets(args.map(_(argsBuilder).build)*)

    inline def routes(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubRouteArgs.Builder]*):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubSkuArgs.Builder]):
        com.pulumi.azure.iot.IoTHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.iot.IotHubDeviceUpdateAccountArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDeviceUpdateAccountIdentityArgs.Builder]):
        com.pulumi.azure.iot.IotHubDeviceUpdateAccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IotHubDeviceUpdateAccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.iot.IotHubDeviceUpdateInstanceArgs.Builder)
    /**
     * @param diagnosticStorageAccount A `diagnosticStorageAccount` block as defined below.
     * @return builder
     */
    inline def diagnosticStorageAccount(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDeviceUpdateInstanceDiagnosticStorageAccountArgs.Builder]):
        com.pulumi.azure.iot.IotHubDeviceUpdateInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IotHubDeviceUpdateInstanceDiagnosticStorageAccountArgs.builder
      builder.diagnosticStorageAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.iot.IotHubDpsArgs.Builder)
    /**
     * @param ipFilterRules An `ipFilterRule` block as defined below.
     * @return builder
     */
    inline def ipFilterRules(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDpsIpFilterRuleArgs.Builder]*):
        com.pulumi.azure.iot.IotHubDpsArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IotHubDpsIpFilterRuleArgs.builder
      builder.ipFilterRules(args.map(_(argsBuilder).build)*)

    /**
     * @param linkedHubs A `linkedHub` block as defined below.
     * @return builder
     */
    inline def linkedHubs(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDpsLinkedHubArgs.Builder]*):
        com.pulumi.azure.iot.IotHubDpsArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IotHubDpsLinkedHubArgs.builder
      builder.linkedHubs(args.map(_(argsBuilder).build)*)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDpsSkuArgs.Builder]):
        com.pulumi.azure.iot.IotHubDpsArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IotHubDpsSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.iot.SecurityDeviceGroupArgs.Builder)
    /**
     * @param allowRule an `allowRule` blocks as defined below.
     * @return builder
     */
    inline def allowRule(args: Endofunction[com.pulumi.azure.iot.inputs.SecurityDeviceGroupAllowRuleArgs.Builder]):
        com.pulumi.azure.iot.SecurityDeviceGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.SecurityDeviceGroupAllowRuleArgs.builder
      builder.allowRule(args(argsBuilder).build)

    /**
     * @param rangeRules One or more `rangeRule` blocks as defined below.
     * @return builder
     */
    inline def rangeRules(args: Endofunction[com.pulumi.azure.iot.inputs.SecurityDeviceGroupRangeRuleArgs.Builder]*):
        com.pulumi.azure.iot.SecurityDeviceGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.SecurityDeviceGroupRangeRuleArgs.builder
      builder.rangeRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.iot.SecuritySolutionArgs.Builder)
    /**
     * @param additionalWorkspaces A `additionalWorkspace` block as defined below.
     * @return builder
     */
    inline def additionalWorkspaces(args: Endofunction[com.pulumi.azure.iot.inputs.SecuritySolutionAdditionalWorkspaceArgs.Builder]*):
        com.pulumi.azure.iot.SecuritySolutionArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.SecuritySolutionAdditionalWorkspaceArgs.builder
      builder.additionalWorkspaces(args.map(_(argsBuilder).build)*)

    /**
     * @param recommendationsEnabled A `recommendationsEnabled` block of options to enable or disable as defined below.
     * @return builder
     */
    inline def recommendationsEnabled(args: Endofunction[com.pulumi.azure.iot.inputs.SecuritySolutionRecommendationsEnabledArgs.Builder]):
        com.pulumi.azure.iot.SecuritySolutionArgs.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.SecuritySolutionRecommendationsEnabledArgs.builder
      builder.recommendationsEnabled(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceArgs.Builder)
    /**
     * @param feedbacks A `feedback` block as defined below.
     * @return builder
     */
    inline def feedbacks(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceFeedbackArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceFeedbackArgs.builder
      builder.feedbacks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetArgs.Builder)
    /**
     * @param ipRules One or more `ipRule` blocks as defined below.
     * @return builder
     */
    inline def ipRules(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetIpRuleArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.iot.inputs.IoTHubState.Builder)
    inline def cloudToDevice(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceArgs.Builder]):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubCloudToDeviceArgs.builder
      builder.cloudToDevice(args(argsBuilder).build)

    /**
     * @param endpoints An `endpoint` block as defined below.
     * @return builder
     */
    inline def endpoints(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubEndpointArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    inline def enrichments(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubEnrichmentArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubEnrichmentArgs.builder
      builder.enrichments(args.map(_(argsBuilder).build)*)

    /**
     * @param fallbackRoute A `fallbackRoute` block as defined below. If the fallback route is enabled, messages that don&#39;t match any of the supplied routes are automatically sent to this route. Defaults to messages/events.
     * 
     * &gt; **Note:** If `fallbackRoute` isn&#39;t explicitly specified, the fallback route wouldn&#39;t be enabled by default.
     * @return builder
     */
    inline def fallbackRoute(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubFallbackRouteArgs.Builder]):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubFallbackRouteArgs.builder
      builder.fallbackRoute(args(argsBuilder).build)

    /**
     * @param fileUpload A `fileUpload` block as defined below.
     * @return builder
     */
    inline def fileUpload(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubFileUploadArgs.Builder]):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubFileUploadArgs.builder
      builder.fileUpload(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubIdentityArgs.Builder]):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRuleSets A `networkRuleSet` block as defined below.
     * @return builder
     */
    inline def networkRuleSets(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubNetworkRuleSetArgs.builder
      builder.networkRuleSets(args.map(_(argsBuilder).build)*)

    inline def routes(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubRouteArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

    /**
     * @param sharedAccessPolicies One or more `sharedAccessPolicy` blocks as defined below.
     * @return builder
     */
    inline def sharedAccessPolicies(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubSharedAccessPolicyArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IoTHubSharedAccessPolicyArgs.builder
      builder.sharedAccessPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.iot.inputs.IoTHubSkuArgs.Builder]):
        com.pulumi.azure.iot.inputs.IoTHubState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IoTHubSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.iot.inputs.IotHubDeviceUpdateAccountState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDeviceUpdateAccountIdentityArgs.Builder]):
        com.pulumi.azure.iot.inputs.IotHubDeviceUpdateAccountState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IotHubDeviceUpdateAccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.iot.inputs.IotHubDeviceUpdateInstanceState.Builder)
    /**
     * @param diagnosticStorageAccount A `diagnosticStorageAccount` block as defined below.
     * @return builder
     */
    inline def diagnosticStorageAccount(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDeviceUpdateInstanceDiagnosticStorageAccountArgs.Builder]):
        com.pulumi.azure.iot.inputs.IotHubDeviceUpdateInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IotHubDeviceUpdateInstanceDiagnosticStorageAccountArgs.builder
      builder.diagnosticStorageAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.iot.inputs.IotHubDpsState.Builder)
    /**
     * @param ipFilterRules An `ipFilterRule` block as defined below.
     * @return builder
     */
    inline def ipFilterRules(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDpsIpFilterRuleArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IotHubDpsState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IotHubDpsIpFilterRuleArgs.builder
      builder.ipFilterRules(args.map(_(argsBuilder).build)*)

    /**
     * @param linkedHubs A `linkedHub` block as defined below.
     * @return builder
     */
    inline def linkedHubs(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDpsLinkedHubArgs.Builder]*):
        com.pulumi.azure.iot.inputs.IotHubDpsState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.IotHubDpsLinkedHubArgs.builder
      builder.linkedHubs(args.map(_(argsBuilder).build)*)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    inline def sku(args: Endofunction[com.pulumi.azure.iot.inputs.IotHubDpsSkuArgs.Builder]):
        com.pulumi.azure.iot.inputs.IotHubDpsState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.IotHubDpsSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.iot.inputs.SecurityDeviceGroupState.Builder)
    /**
     * @param allowRule an `allowRule` blocks as defined below.
     * @return builder
     */
    inline def allowRule(args: Endofunction[com.pulumi.azure.iot.inputs.SecurityDeviceGroupAllowRuleArgs.Builder]):
        com.pulumi.azure.iot.inputs.SecurityDeviceGroupState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.SecurityDeviceGroupAllowRuleArgs.builder
      builder.allowRule(args(argsBuilder).build)

    /**
     * @param rangeRules One or more `rangeRule` blocks as defined below.
     * @return builder
     */
    inline def rangeRules(args: Endofunction[com.pulumi.azure.iot.inputs.SecurityDeviceGroupRangeRuleArgs.Builder]*):
        com.pulumi.azure.iot.inputs.SecurityDeviceGroupState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.SecurityDeviceGroupRangeRuleArgs.builder
      builder.rangeRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.iot.inputs.SecuritySolutionState.Builder)
    /**
     * @param additionalWorkspaces A `additionalWorkspace` block as defined below.
     * @return builder
     */
    inline def additionalWorkspaces(args: Endofunction[com.pulumi.azure.iot.inputs.SecuritySolutionAdditionalWorkspaceArgs.Builder]*):
        com.pulumi.azure.iot.inputs.SecuritySolutionState.Builder =
      def argsBuilder = com.pulumi.azure.iot.inputs.SecuritySolutionAdditionalWorkspaceArgs.builder
      builder.additionalWorkspaces(args.map(_(argsBuilder).build)*)

    /**
     * @param recommendationsEnabled A `recommendationsEnabled` block of options to enable or disable as defined below.
     * @return builder
     */
    inline def recommendationsEnabled(args: Endofunction[com.pulumi.azure.iot.inputs.SecuritySolutionRecommendationsEnabledArgs.Builder]):
        com.pulumi.azure.iot.inputs.SecuritySolutionState.Builder =
      val argsBuilder = com.pulumi.azure.iot.inputs.SecuritySolutionRecommendationsEnabledArgs.builder
      builder.recommendationsEnabled(args(argsBuilder).build)
