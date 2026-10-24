package jp.ukiba.ko_pulumi
package aws

object networkfirewall_ext:
  extension (builder: com.pulumi.aws.networkfirewall.ContainerAssociationArgs.Builder)
    /**
     * @param containerMonitoringConfigurations One or more monitoring configurations, up to 5. See `containerMonitoringConfiguration` Block below.
     * @return builder
     */
    inline def containerMonitoringConfigurations(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.ContainerAssociationContainerMonitoringConfigurationArgs.Builder]*):
        com.pulumi.aws.networkfirewall.ContainerAssociationArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.ContainerAssociationContainerMonitoringConfigurationArgs.builder
      builder.containerMonitoringConfigurations(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.ContainerAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.networkfirewall.ContainerAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.ContainerAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.FirewallArgs.Builder)
    /**
     * @param availabilityZoneMappings Required when creating a transit gateway-attached firewall. Set of configuration blocks describing the availability availability where you want to create firewall endpoints for a transit gateway-attached firewall.
     * @return builder
     */
    inline def availabilityZoneMappings(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallAvailabilityZoneMappingArgs.Builder]*):
        com.pulumi.aws.networkfirewall.FirewallArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallAvailabilityZoneMappingArgs.builder
      builder.availabilityZoneMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param encryptionConfiguration KMS encryption configuration settings. See Encryption Configuration below for details.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.networkfirewall.FirewallArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param subnetMappings Required when creating a VPC attached firewall. Set of configuration blocks describing the public subnets. Each subnet must belong to a different Availability Zone in the VPC. AWS Network Firewall creates a firewall endpoint in each subnet. See Subnet Mapping below for details.
     * @return builder
     */
    inline def subnetMappings(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallSubnetMappingArgs.Builder]*):
        com.pulumi.aws.networkfirewall.FirewallArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallSubnetMappingArgs.builder
      builder.subnetMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.FirewallPolicyArgs.Builder)
    /**
     * @param encryptionConfiguration KMS encryption configuration settings. See Encryption Configuration below for details.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.networkfirewall.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param firewallPolicy A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
     * @return builder
     */
    inline def firewallPolicy(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyArgs.Builder]):
        com.pulumi.aws.networkfirewall.FirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyArgs.builder
      builder.firewallPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.FirewallTransitGatewayAttachmentAccepterArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallTransitGatewayAttachmentAccepterTimeoutsArgs.Builder]):
        com.pulumi.aws.networkfirewall.FirewallTransitGatewayAttachmentAccepterArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallTransitGatewayAttachmentAccepterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.LoggingConfigurationArgs.Builder)
    /**
     * @param loggingConfiguration A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
     * @return builder
     */
    inline def loggingConfiguration(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.LoggingConfigurationLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.networkfirewall.LoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.LoggingConfigurationLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.RuleGroupArgs.Builder)
    /**
     * @param encryptionConfiguration KMS encryption configuration settings. See Encryption Configuration below for details.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.networkfirewall.RuleGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param ruleGroup A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
     * @return builder
     */
    inline def ruleGroup(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs.Builder]):
        com.pulumi.aws.networkfirewall.RuleGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs.builder
      builder.ruleGroup(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.TlsInspectionConfigurationArgs.Builder)
    /**
     * @param encryptionConfigurations Encryption configuration block. Detailed below.
     * @return builder
     */
    inline def encryptionConfigurations(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.networkfirewall.TlsInspectionConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.networkfirewall.TlsInspectionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param tlsInspectionConfiguration TLS inspection configuration block. Detailed below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def tlsInspectionConfiguration(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationArgs.Builder]):
        com.pulumi.aws.networkfirewall.TlsInspectionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationArgs.builder
      builder.tlsInspectionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.VpcEndpointAssociationArgs.Builder)
    /**
     * @param subnetMapping The ID for a subnet that&#39;s used in an association with a firewall. See Subnet Mapping below for details.
     * @return builder
     */
    inline def subnetMapping(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationSubnetMappingArgs.Builder]):
        com.pulumi.aws.networkfirewall.VpcEndpointAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationSubnetMappingArgs.builder
      builder.subnetMapping(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.networkfirewall.VpcEndpointAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.ContainerAssociationContainerMonitoringConfigurationArgs.Builder)
    /**
     * @param attributeFilters Key-value pairs that filter which containers within the cluster are monitored. For Amazon EKS, filter by namespace and Kubernetes labels. For Amazon ECS, filter by container instance attributes; attribute filters only match containers on the EC2 launch type, not Fargate. See `attributeFilter` Block below.
     * @return builder
     */
    inline def attributeFilters(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.ContainerAssociationContainerMonitoringConfigurationAttributeFilterArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.ContainerAssociationContainerMonitoringConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.ContainerAssociationContainerMonitoringConfigurationAttributeFilterArgs.builder
      builder.attributeFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.ContainerAssociationState.Builder)
    /**
     * @param containerMonitoringConfigurations One or more monitoring configurations, up to 5. See `containerMonitoringConfiguration` Block below.
     * @return builder
     */
    inline def containerMonitoringConfigurations(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.ContainerAssociationContainerMonitoringConfigurationArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.ContainerAssociationState.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.ContainerAssociationContainerMonitoringConfigurationArgs.builder
      builder.containerMonitoringConfigurations(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.ContainerAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.ContainerAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.ContainerAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusArgs.Builder)
    /**
     * @param syncStates Set of subnets configured for use by the firewall.
     * @return builder
     */
    inline def syncStates(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusSyncStateArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusSyncStateArgs.builder
      builder.syncStates(args.map(_(argsBuilder).build)*)

    /**
     * @param transitGatewayAttachmentSyncStates Set of transit gateway configured for use by the firewall.
     * @return builder
     */
    inline def transitGatewayAttachmentSyncStates(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusTransitGatewayAttachmentSyncStateArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusTransitGatewayAttachmentSyncStateArgs.builder
      builder.transitGatewayAttachmentSyncStates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusSyncStateArgs.Builder)
    /**
     * @param attachments Nested list describing the attachment status of the firewall&#39;s association with a single VPC subnet.
     * @return builder
     */
    inline def attachments(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusSyncStateAttachmentArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusSyncStateArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusSyncStateAttachmentArgs.builder
      builder.attachments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyArgs.Builder)
    /**
     * @param policyVariables . Contains variables that you can use to override default Suricata settings in your firewall policy. See Rule Variables for details.
     * @return builder
     */
    inline def policyVariables(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyPolicyVariablesArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyPolicyVariablesArgs.builder
      builder.policyVariables(args(argsBuilder).build)

    /**
     * @param statefulEngineOptions A configuration block that defines options on how the policy handles stateful rules. See Stateful Engine Options below for details.
     * @return builder
     */
    inline def statefulEngineOptions(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs.builder
      builder.statefulEngineOptions(args(argsBuilder).build)

    /**
     * @param statefulRuleGroupReferences Set of configuration blocks containing references to the stateful rule groups that are used in the policy. See Stateful Rule Group Reference below for details.
     * @return builder
     */
    inline def statefulRuleGroupReferences(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs.builder
      builder.statefulRuleGroupReferences(args.map(_(argsBuilder).build)*)

    /**
     * @param statelessCustomActions Set of configuration blocks describing the custom action definitions that are available for use in the firewall policy&#39;s `statelessDefaultActions`. See Stateless Custom Action below for details.
     * @return builder
     */
    inline def statelessCustomActions(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionArgs.builder
      builder.statelessCustomActions(args.map(_(argsBuilder).build)*)

    /**
     * @param statelessRuleGroupReferences Set of configuration blocks containing references to the stateless rule groups that are used in the policy. See Stateless Rule Group Reference below for details.
     * @return builder
     */
    inline def statelessRuleGroupReferences(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceArgs.builder
      builder.statelessRuleGroupReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyPolicyVariablesArgs.Builder)
    inline def ruleVariables(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyPolicyVariablesRuleVariableArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyPolicyVariablesArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyPolicyVariablesRuleVariableArgs.builder
      builder.ruleVariables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyPolicyVariablesRuleVariableArgs.Builder)
    /**
     * @param ipSet A configuration block that defines a set of IP addresses. See IP Set below for details.
     * @return builder
     */
    inline def ipSet(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyPolicyVariablesRuleVariableIpSetArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyPolicyVariablesRuleVariableArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyPolicyVariablesRuleVariableIpSetArgs.builder
      builder.ipSet(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs.Builder)
    /**
     * @param flowTimeouts Amount of time that can pass without any traffic sent through the firewall before the firewall determines that the connection is idle.
     * @return builder
     */
    inline def flowTimeouts(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulEngineOptionsFlowTimeoutsArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulEngineOptionsFlowTimeoutsArgs.builder
      builder.flowTimeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs.Builder)
    /**
     * @param override Configuration block for override values
     * @return builder
     */
    inline def `override`(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceOverrideArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceOverrideArgs.builder
      builder.`override`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs.Builder)
    /**
     * @param publishMetricAction A configuration block describing the stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet. You can pair this custom action with any of the standard stateless rule actions. See Publish Metric Action below for details.
     * @return builder
     */
    inline def publishMetricAction(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs.builder
      builder.publishMetricAction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs.Builder)
    /**
     * @param dimensions Set of configuration blocks describing dimension settings to use for Amazon CloudWatch custom metrics. See Dimension below for more details.
     * @return builder
     */
    inline def dimensions(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimensionArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionArgs.Builder)
    /**
     * @param actionDefinition A configuration block describing the custom action associated with the `actionName`. See Action Definition below for details.
     * @return builder
     */
    inline def actionDefinition(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs.builder
      builder.actionDefinition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.FirewallPolicyState.Builder)
    /**
     * @param encryptionConfiguration KMS encryption configuration settings. See Encryption Configuration below for details.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param firewallPolicy A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
     * @return builder
     */
    inline def firewallPolicy(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.FirewallPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyArgs.builder
      builder.firewallPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.FirewallState.Builder)
    /**
     * @param availabilityZoneMappings Required when creating a transit gateway-attached firewall. Set of configuration blocks describing the availability availability where you want to create firewall endpoints for a transit gateway-attached firewall.
     * @return builder
     */
    inline def availabilityZoneMappings(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallAvailabilityZoneMappingArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.FirewallState.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallAvailabilityZoneMappingArgs.builder
      builder.availabilityZoneMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param encryptionConfiguration KMS encryption configuration settings. See Encryption Configuration below for details.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.FirewallState.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param firewallStatuses Nested list of information about the current status of the firewall.
     * @return builder
     */
    inline def firewallStatuses(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.FirewallState.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusArgs.builder
      builder.firewallStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param subnetMappings Required when creating a VPC attached firewall. Set of configuration blocks describing the public subnets. Each subnet must belong to a different Availability Zone in the VPC. AWS Network Firewall creates a firewall endpoint in each subnet. See Subnet Mapping below for details.
     * @return builder
     */
    inline def subnetMappings(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallSubnetMappingArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.FirewallState.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallSubnetMappingArgs.builder
      builder.subnetMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.FirewallTransitGatewayAttachmentAccepterState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.FirewallTransitGatewayAttachmentAccepterTimeoutsArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.FirewallTransitGatewayAttachmentAccepterState.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.FirewallTransitGatewayAttachmentAccepterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.LoggingConfigurationLoggingConfigurationArgs.Builder)
    /**
     * @param logDestinationConfigs Set of configuration blocks describing the logging details for a firewall. See Log Destination Config below for details. At most, only Three blocks can be specified; one for `FLOW` logs and one for `ALERT` logs and one for `TLS` logs.
     * @return builder
     */
    inline def logDestinationConfigs(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.LoggingConfigurationLoggingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs.builder
      builder.logDestinationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.LoggingConfigurationState.Builder)
    /**
     * @param loggingConfiguration A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
     * @return builder
     */
    inline def loggingConfiguration(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.LoggingConfigurationLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.LoggingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.LoggingConfigurationLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs.Builder)
    /**
     * @param referenceSets A configuration block that defines the IP Set References for the rule group. See Reference Sets below for details. Please notes that there can only be a maximum of 5 `referenceSets` in a `ruleGroup`. See the [AWS documentation](https://docs.aws.amazon.com/network-firewall/latest/developerguide/rule-groups-ip-set-references.html#rule-groups-ip-set-reference-limits) for details.
     * @return builder
     */
    inline def referenceSets(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupReferenceSetsArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupReferenceSetsArgs.builder
      builder.referenceSets(args(argsBuilder).build)

    /**
     * @param ruleVariables A configuration block that defines additional settings available to use in the rules defined in the rule group. Can only be specified for **stateful** rule groups. See Rule Variables below for details.
     * @return builder
     */
    inline def ruleVariables(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesArgs.builder
      builder.ruleVariables(args(argsBuilder).build)

    /**
     * @param rulesSource A configuration block that defines the stateful or stateless rules for the rule group. See Rules Source below for details.
     * @return builder
     */
    inline def rulesSource(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceArgs.builder
      builder.rulesSource(args(argsBuilder).build)

    /**
     * @param statefulRuleOptions A configuration block that defines stateful rule options for the rule group. See Stateful Rule Options below for details.
     * @return builder
     */
    inline def statefulRuleOptions(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupStatefulRuleOptionsArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupStatefulRuleOptionsArgs.builder
      builder.statefulRuleOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupReferenceSetsArgs.Builder)
    inline def ipSetReferences(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupReferenceSetsIpSetReferenceArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupReferenceSetsArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupReferenceSetsIpSetReferenceArgs.builder
      builder.ipSetReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupReferenceSetsIpSetReferenceArgs.Builder)
    /**
     * @param ipSetReferences Set of configuration blocks that define the IP Reference information. See IP Set Reference below for details.
     * @return builder
     */
    inline def ipSetReferences(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupReferenceSetsIpSetReferenceArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs.builder
      builder.ipSetReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesArgs.Builder)
    /**
     * @param ipSets Set of configuration blocks that define IP address information. See IP Sets below for details.
     * @return builder
     */
    inline def ipSets(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesIpSetArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesIpSetArgs.builder
      builder.ipSets(args.map(_(argsBuilder).build)*)

    /**
     * @param portSets Set of configuration blocks that define port range information. See Port Sets below for details.
     * @return builder
     */
    inline def portSets(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesPortSetArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesPortSetArgs.builder
      builder.portSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesIpSetArgs.Builder)
    /**
     * @param ipSet A configuration block that defines a set of IP addresses. See IP Set below for details.
     * @return builder
     */
    inline def ipSet(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesIpSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs.builder
      builder.ipSet(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesPortSetArgs.Builder)
    /**
     * @param portSet A configuration block that defines a set of port ranges. See Port Set below for details.
     * @return builder
     */
    inline def portSet(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesPortSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs.builder
      builder.portSet(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceArgs.Builder)
    /**
     * @param rulesSourceList A configuration block containing **stateful** inspection criteria for a domain list rule group. See Rules Source List below for details.
     * @return builder
     */
    inline def rulesSourceList(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceRulesSourceListArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceRulesSourceListArgs.builder
      builder.rulesSourceList(args(argsBuilder).build)

    /**
     * @param statefulRules Set of configuration blocks containing **stateful** inspection criteria for 5-tuple rules to be used together in a rule group. See Stateful Rule below for details.
     * @return builder
     */
    inline def statefulRules(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatefulRuleArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatefulRuleArgs.builder
      builder.statefulRules(args.map(_(argsBuilder).build)*)

    /**
     * @param statelessRulesAndCustomActions A configuration block containing **stateless** inspection criteria for a stateless rule group. See Stateless Rules and Custom Actions below for details.
     * @return builder
     */
    inline def statelessRulesAndCustomActions(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs.builder
      builder.statelessRulesAndCustomActions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatefulRuleArgs.Builder)
    /**
     * @param header A configuration block containing the stateful 5-tuple inspection criteria for the rule, used to inspect traffic flows. See Header below for details.
     * @return builder
     */
    inline def header(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatefulRuleHeaderArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatefulRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatefulRuleHeaderArgs.builder
      builder.header(args(argsBuilder).build)

    /**
     * @param ruleOptions Set of configuration blocks containing additional settings for a stateful rule. See Rule Option below for details.
     * @return builder
     */
    inline def ruleOptions(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatefulRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionArgs.builder
      builder.ruleOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs.Builder)
    /**
     * @param customActions Set of configuration blocks containing custom action definitions that are available for use by the set of `stateless rule`. See Custom Action below for details.
     * @return builder
     */
    inline def customActions(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs.builder
      builder.customActions(args.map(_(argsBuilder).build)*)

    /**
     * @param statelessRules Set of configuration blocks containing the stateless rules for use in the stateless rule group. See Stateless Rule below for details.
     * @return builder
     */
    inline def statelessRules(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleArgs.builder
      builder.statelessRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs.Builder)
    /**
     * @param publishMetricAction A configuration block describing the stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet. You can pair this custom action with any of the standard stateless rule actions. See Publish Metric Action below for details.
     * @return builder
     */
    inline def publishMetricAction(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionArgs.builder
      builder.publishMetricAction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionArgs.Builder)
    /**
     * @param dimensions Set of configuration blocks containing the dimension settings to use for Amazon CloudWatch custom metrics. See Dimension below for details.
     * @return builder
     */
    inline def dimensions(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs.Builder)
    /**
     * @param actionDefinition A configuration block describing the custom action associated with the `actionName`. See Action Definition below for details.
     * @return builder
     */
    inline def actionDefinition(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs.builder
      builder.actionDefinition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleArgs.Builder)
    /**
     * @param ruleDefinition A configuration block defining the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches the criteria. See Rule Definition below for details.
     * @return builder
     */
    inline def ruleDefinition(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs.builder
      builder.ruleDefinition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs.Builder)
    /**
     * @param matchAttributes A configuration block containing criteria for AWS Network Firewall to use to inspect an individual packet in stateless rule inspection. See Match Attributes below for details.
     * @return builder
     */
    inline def matchAttributes(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs.builder
      builder.matchAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs.Builder)
    /**
     * @param destinationPorts Set of configuration blocks describing the destination ports to inspect for. If not specified, this matches with any destination port. See Destination Port below for details.
     * @return builder
     */
    inline def destinationPorts(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs.builder
      builder.destinationPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param destinations Set of configuration blocks describing the destination IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. See Destination below for details.
     * @return builder
     */
    inline def destinations(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param sourcePorts Set of configuration blocks describing the source ports to inspect for. If not specified, this matches with any source port. See Source Port below for details.
     * @return builder
     */
    inline def sourcePorts(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortArgs.builder
      builder.sourcePorts(args.map(_(argsBuilder).build)*)

    /**
     * @param sources Set of configuration blocks describing the source IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. See Source below for details.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    /**
     * @param tcpFlags Set of configuration blocks containing the TCP flags and masks to inspect for. If not specified, this matches with any settings.
     * @return builder
     */
    inline def tcpFlags(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs.builder
      builder.tcpFlags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.RuleGroupState.Builder)
    /**
     * @param encryptionConfiguration KMS encryption configuration settings. See Encryption Configuration below for details.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupState.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param ruleGroup A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
     * @return builder
     */
    inline def ruleGroup(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.RuleGroupState.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupArgs.builder
      builder.ruleGroup(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationState.Builder)
    /**
     * @param certificateAuthorities Certificate Manager certificate block. See Certificate Authority below for details.
     * @return builder
     */
    inline def certificateAuthorities(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationCertificateAuthorityArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationCertificateAuthorityArgs.builder
      builder.certificateAuthorities(args.map(_(argsBuilder).build)*)

    /**
     * @param certificates List of certificate blocks describing certificates associated with the TLS inspection configuration. See Certificates below for details.
     * @return builder
     */
    inline def certificates(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationCertificateArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

    /**
     * @param encryptionConfigurations Encryption configuration block. Detailed below.
     * @return builder
     */
    inline def encryptionConfigurations(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param tlsInspectionConfiguration TLS inspection configuration block. Detailed below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def tlsInspectionConfiguration(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationArgs.builder
      builder.tlsInspectionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationArgs.Builder)
    /**
     * @param serverCertificateConfiguration Server certificate configurations that are associated with the TLS configuration. Detailed below.
     * @return builder
     */
    inline def serverCertificateConfiguration(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationArgs.builder
      builder.serverCertificateConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationArgs.Builder)
    /**
     * @param checkCertificateRevocationStatus Check Certificate Revocation Status block. Detailed below.
     * @return builder
     */
    inline def checkCertificateRevocationStatus(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationCheckCertificateRevocationStatusArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationCheckCertificateRevocationStatusArgs.builder
      builder.checkCertificateRevocationStatus(args(argsBuilder).build)

    /**
     * @param scopes Scope block. Detailed below.
     * @return builder
     */
    inline def scopes(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeArgs.builder
      builder.scopes(args.map(_(argsBuilder).build)*)

    /**
     * @param serverCertificates Server certificates to use for inbound SSL/TLS inspection. See [Using SSL/TLS certificates with TLS inspection configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html).
     * @return builder
     */
    inline def serverCertificates(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationServerCertificateArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationServerCertificateArgs.builder
      builder.serverCertificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeArgs.Builder)
    /**
     * @param destinationPorts Set of configuration blocks describing the destination ports to inspect for. If not specified, this matches with any destination port. See Destination Ports below for details.
     * @return builder
     */
    inline def destinationPorts(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPortArgs.builder
      builder.destinationPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param destinations Set of configuration blocks describing the destination IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. See Destination below for details.
     * @return builder
     */
    inline def destinations(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param sourcePorts Set of configuration blocks describing the source ports to inspect for. If not specified, this matches with any source port. See Source Ports below for details.
     * @return builder
     */
    inline def sourcePorts(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeSourcePortArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeSourcePortArgs.builder
      builder.sourcePorts(args.map(_(argsBuilder).build)*)

    /**
     * @param sources Set of configuration blocks describing the source IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. See Source below for details.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeSourceArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationState.Builder)
    /**
     * @param subnetMapping The ID for a subnet that&#39;s used in an association with a firewall. See Subnet Mapping below for details.
     * @return builder
     */
    inline def subnetMapping(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationSubnetMappingArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationSubnetMappingArgs.builder
      builder.subnetMapping(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcEndpointAssociationStatuses Nested list of information about the current status of the VPC Endpoint Association.
     * @return builder
     */
    inline def vpcEndpointAssociationStatuses(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationVpcEndpointAssociationStatusArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationState.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationVpcEndpointAssociationStatusArgs.builder
      builder.vpcEndpointAssociationStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationVpcEndpointAssociationStatusArgs.Builder)
    /**
     * @param associationSyncStates Set of subnets configured for use by the VPC Endpoint Association.
     * @return builder
     */
    inline def associationSyncStates(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationVpcEndpointAssociationStatusAssociationSyncStateArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationVpcEndpointAssociationStatusArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationVpcEndpointAssociationStatusAssociationSyncStateArgs.builder
      builder.associationSyncStates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationVpcEndpointAssociationStatusAssociationSyncStateArgs.Builder)
    /**
     * @param attachments Nested list describing the attachment status of the firewall&#39;s VPC Endpoint Association with a single VPC subnet.
     * @return builder
     */
    inline def attachments(args: Endofunction[com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationVpcEndpointAssociationStatusAssociationSyncStateAttachmentArgs.Builder]*):
        com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationVpcEndpointAssociationStatusAssociationSyncStateArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkfirewall.inputs.VpcEndpointAssociationVpcEndpointAssociationStatusAssociationSyncStateAttachmentArgs.builder
      builder.attachments(args.map(_(argsBuilder).build)*)
