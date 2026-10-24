package jp.ukiba.ko_pulumi
package gcp

object iap_ext:
  extension (builder: com.pulumi.gcp.iap.AgentRegistryAgentIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryAgentIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.AgentRegistryAgentIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryAgentIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.AgentRegistryAgentIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryAgentIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.AgentRegistryAgentIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryAgentIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.AgentRegistryEndpointIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryEndpointIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.AgentRegistryEndpointIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryEndpointIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.AgentRegistryEndpointIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryEndpointIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.AgentRegistryEndpointIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryEndpointIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.AgentRegistryIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.AgentRegistryIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.AgentRegistryIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.AgentRegistryIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.AgentRegistryMcpServerIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryMcpServerIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.AgentRegistryMcpServerIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryMcpServerIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.AgentRegistryMcpServerIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryMcpServerIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.AgentRegistryMcpServerIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryMcpServerIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.AppEngineServiceIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AppEngineServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.AppEngineServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AppEngineServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.AppEngineServiceIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AppEngineServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.AppEngineServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AppEngineServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.AppEngineVersionIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AppEngineVersionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.AppEngineVersionIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AppEngineVersionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.AppEngineVersionIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AppEngineVersionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.AppEngineVersionIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AppEngineVersionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.LocationWebIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.LocationWebIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.LocationWebIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.LocationWebIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.LocationWebIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.LocationWebIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.LocationWebIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.LocationWebIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.SettingsArgs.Builder)
    /**
     * @param accessSettings Top level wrapper for all access related setting in IAP.
     * Structure is documented below.
     * @return builder
     */
    def accessSettings(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsAccessSettingsArgs.Builder]):
        com.pulumi.gcp.iap.SettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsAccessSettingsArgs.builder
      builder.accessSettings(args(argsBuilder).build)

    /**
     * @param applicationSettings Top level wrapper for all application related settings in IAP.
     * Structure is documented below.
     * @return builder
     */
    def applicationSettings(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsArgs.Builder]):
        com.pulumi.gcp.iap.SettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsArgs.builder
      builder.applicationSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.TunnelDestGroupIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.TunnelDestGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.TunnelDestGroupIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.TunnelDestGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.TunnelDestGroupIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.TunnelDestGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.TunnelDestGroupIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.TunnelDestGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.TunnelIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.TunnelIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.TunnelIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.TunnelIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.TunnelIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.TunnelIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.TunnelIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.TunnelIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.TunnelInstanceIAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.TunnelInstanceIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.TunnelInstanceIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.TunnelInstanceIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.TunnelInstanceIAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.TunnelInstanceIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.TunnelInstanceIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.TunnelInstanceIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebBackendServiceIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebBackendServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebBackendServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebBackendServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebBackendServiceIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebBackendServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebBackendServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebBackendServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebCloudRunServiceIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebCloudRunServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebCloudRunServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebCloudRunServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebCloudRunServiceIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebCloudRunServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebCloudRunServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebCloudRunServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebForwardingRuleServiceIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebForwardingRuleServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebForwardingRuleServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebForwardingRuleServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebForwardingRuleServiceIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebForwardingRuleServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebForwardingRuleServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebForwardingRuleServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebRegionBackendServiceIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebRegionBackendServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebRegionBackendServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebRegionBackendServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebRegionBackendServiceIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebRegionBackendServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebRegionBackendServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebRegionBackendServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebRegionForwardingRuleServiceIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebRegionForwardingRuleServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebRegionForwardingRuleServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebRegionForwardingRuleServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebRegionForwardingRuleServiceIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebRegionForwardingRuleServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebRegionForwardingRuleServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebRegionForwardingRuleServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebTypeAppEngingIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebTypeAppEngingIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebTypeAppEngingIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebTypeAppEngingIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebTypeAppEngingIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebTypeAppEngingIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebTypeAppEngingIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebTypeAppEngingIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebTypeComputeIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebTypeComputeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebTypeComputeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebTypeComputeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.WebTypeComputeIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebTypeComputeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.WebTypeComputeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebTypeComputeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.AgentRegistryAgentIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryAgentIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.AgentRegistryAgentIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryAgentIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.AgentRegistryAgentIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryAgentIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.AgentRegistryAgentIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryAgentIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.AgentRegistryEndpointIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryEndpointIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.AgentRegistryEndpointIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryEndpointIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.AgentRegistryEndpointIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryEndpointIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.AgentRegistryEndpointIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryEndpointIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.AgentRegistryIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.AgentRegistryIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.AgentRegistryIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.AgentRegistryIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.AgentRegistryMcpServerIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryMcpServerIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.AgentRegistryMcpServerIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryMcpServerIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.AgentRegistryMcpServerIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AgentRegistryMcpServerIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.AgentRegistryMcpServerIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AgentRegistryMcpServerIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.AppEngineServiceIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AppEngineServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.AppEngineServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AppEngineServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.AppEngineServiceIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AppEngineServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.AppEngineServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AppEngineServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.AppEngineVersionIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AppEngineVersionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.AppEngineVersionIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AppEngineVersionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.AppEngineVersionIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.AppEngineVersionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.AppEngineVersionIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.AppEngineVersionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.LocationWebIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.LocationWebIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.LocationWebIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.LocationWebIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.LocationWebIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.LocationWebIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.LocationWebIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.LocationWebIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.SettingsAccessSettingsArgs.Builder)
    /**
     * @param allowedDomainsSettings Settings to configure and enable allowed domains.
     * Structure is documented below.
     * @return builder
     */
    def allowedDomainsSettings(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsAccessSettingsAllowedDomainsSettingsArgs.Builder]):
        com.pulumi.gcp.iap.inputs.SettingsAccessSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsAccessSettingsAllowedDomainsSettingsArgs.builder
      builder.allowedDomainsSettings(args(argsBuilder).build)

    /**
     * @param corsSettings Configuration to allow cross-origin requests via IAP.
     * Structure is documented below.
     * @return builder
     */
    def corsSettings(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsAccessSettingsCorsSettingsArgs.Builder]):
        com.pulumi.gcp.iap.inputs.SettingsAccessSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsAccessSettingsCorsSettingsArgs.builder
      builder.corsSettings(args(argsBuilder).build)

    /**
     * @param gcipSettings GCIP claims and endpoint configurations for 3p identity providers.
     * * Enabling gcipSetting significantly changes the way IAP authenticates users. Identity Platform does not support IAM, so IAP will not enforce any IAM policies for requests to your application.
     *   Structure is documented below.
     * @return builder
     */
    def gcipSettings(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsAccessSettingsGcipSettingsArgs.Builder]):
        com.pulumi.gcp.iap.inputs.SettingsAccessSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsAccessSettingsGcipSettingsArgs.builder
      builder.gcipSettings(args(argsBuilder).build)

    /**
     * @param oauthSettings Settings to configure IAP&#39;s OAuth behavior.
     * Structure is documented below.
     * @return builder
     */
    def oauthSettings(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsAccessSettingsOauthSettingsArgs.Builder]):
        com.pulumi.gcp.iap.inputs.SettingsAccessSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsAccessSettingsOauthSettingsArgs.builder
      builder.oauthSettings(args(argsBuilder).build)

    /**
     * @param reauthSettings Settings to configure reauthentication policies in IAP.
     * Structure is documented below.
     * @return builder
     */
    def reauthSettings(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsAccessSettingsReauthSettingsArgs.Builder]):
        com.pulumi.gcp.iap.inputs.SettingsAccessSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsAccessSettingsReauthSettingsArgs.builder
      builder.reauthSettings(args(argsBuilder).build)

    /**
     * @param workforceIdentitySettings Settings to configure the workforce identity federation, including workforce pools
     * and OAuth 2.0 settings.
     * Structure is documented below.
     * @return builder
     */
    def workforceIdentitySettings(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsAccessSettingsWorkforceIdentitySettingsArgs.Builder]):
        com.pulumi.gcp.iap.inputs.SettingsAccessSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsAccessSettingsWorkforceIdentitySettingsArgs.builder
      builder.workforceIdentitySettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.SettingsAccessSettingsWorkforceIdentitySettingsArgs.Builder)
    /**
     * @param oauth2 OAuth 2.0 settings for IAP to perform OIDC flow with workforce identity
     * federation services.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedAccessSettingsWorkforceIdentitySettingsOauth2&#34;&gt;&lt;/a&gt;The `oauth2` block supports:
     * @return builder
     */
    def oauth2(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsAccessSettingsWorkforceIdentitySettingsOauth2Args.Builder]):
        com.pulumi.gcp.iap.inputs.SettingsAccessSettingsWorkforceIdentitySettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsAccessSettingsWorkforceIdentitySettingsOauth2Args.builder
      builder.oauth2(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsArgs.Builder)
    /**
     * @param accessDeniedPageSettings Customization for Access Denied page. IAP allows customers to define a custom URI
     * to use as the error page when access is denied to users. If IAP prevents access
     * to this page, the default IAP error page will be displayed instead.
     * Structure is documented below.
     * @return builder
     */
    def accessDeniedPageSettings(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsAccessDeniedPageSettingsArgs.Builder]):
        com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsAccessDeniedPageSettingsArgs.builder
      builder.accessDeniedPageSettings(args(argsBuilder).build)

    /**
     * @param attributePropagationSettings Settings to configure attribute propagation.
     * Structure is documented below.
     * @return builder
     */
    def attributePropagationSettings(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsAttributePropagationSettingsArgs.Builder]):
        com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsAttributePropagationSettingsArgs.builder
      builder.attributePropagationSettings(args(argsBuilder).build)

    /**
     * @param csmSettings Settings to configure IAP&#39;s behavior for a service mesh.
     * Structure is documented below.
     * @return builder
     */
    def csmSettings(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsCsmSettingsArgs.Builder]):
        com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsCsmSettingsArgs.builder
      builder.csmSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.SettingsState.Builder)
    /**
     * @param accessSettings Top level wrapper for all access related setting in IAP.
     * Structure is documented below.
     * @return builder
     */
    def accessSettings(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsAccessSettingsArgs.Builder]):
        com.pulumi.gcp.iap.inputs.SettingsState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsAccessSettingsArgs.builder
      builder.accessSettings(args(argsBuilder).build)

    /**
     * @param applicationSettings Top level wrapper for all application related settings in IAP.
     * Structure is documented below.
     * @return builder
     */
    def applicationSettings(args: Endofunction[com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsArgs.Builder]):
        com.pulumi.gcp.iap.inputs.SettingsState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsArgs.builder
      builder.applicationSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.TunnelDestGroupIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.TunnelDestGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.TunnelDestGroupIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.TunnelDestGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.TunnelDestGroupIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.TunnelDestGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.TunnelDestGroupIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.TunnelDestGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.TunnelIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.TunnelIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.TunnelIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.TunnelIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.TunnelIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.TunnelIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.TunnelIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.TunnelIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.TunnelInstanceIAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.TunnelInstanceIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.TunnelInstanceIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.TunnelInstanceIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.TunnelInstanceIAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.TunnelInstanceIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.TunnelInstanceIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.TunnelInstanceIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebBackendServiceIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebBackendServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebBackendServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebBackendServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebBackendServiceIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebBackendServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebBackendServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebBackendServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebCloudRunServiceIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebCloudRunServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebCloudRunServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebCloudRunServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebCloudRunServiceIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebCloudRunServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebCloudRunServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebCloudRunServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebForwardingRuleServiceIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebForwardingRuleServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebForwardingRuleServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebForwardingRuleServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebForwardingRuleServiceIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebForwardingRuleServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebForwardingRuleServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebForwardingRuleServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebRegionBackendServiceIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebRegionBackendServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebRegionBackendServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebRegionBackendServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebRegionBackendServiceIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebRegionBackendServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebRegionBackendServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebRegionBackendServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebRegionForwardingRuleServiceIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebRegionForwardingRuleServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebRegionForwardingRuleServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebRegionForwardingRuleServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebRegionForwardingRuleServiceIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebRegionForwardingRuleServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebRegionForwardingRuleServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebRegionForwardingRuleServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebTypeAppEngingIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebTypeAppEngingIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebTypeAppEngingIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebTypeAppEngingIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebTypeAppEngingIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebTypeAppEngingIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebTypeAppEngingIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebTypeAppEngingIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebTypeComputeIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebTypeComputeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebTypeComputeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebTypeComputeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iap.inputs.WebTypeComputeIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iap.inputs.WebTypeComputeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iap.inputs.WebTypeComputeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iap.inputs.WebTypeComputeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
