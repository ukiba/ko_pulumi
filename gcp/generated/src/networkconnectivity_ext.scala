package jp.ukiba.ko_pulumi
package gcp

object networkconnectivity_ext:
  extension (builder: com.pulumi.gcp.networkconnectivity.DestinationArgs.Builder)
    /**
     * @param endpoints The list of DestinationEndpoint resources configured for the IP prefix.
     * Structure is documented below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.DestinationEndpointArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.DestinationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.DestinationEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.GroupArgs.Builder)
    /**
     * @param autoAccept Optional. The auto-accept setting for this group.
     * Structure is documented below.
     * @return builder
     */
    def autoAccept(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.GroupAutoAcceptArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.GroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.GroupAutoAcceptArgs.builder
      builder.autoAccept(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.HubArgs.Builder)
    /**
     * @param exportPscConfig (Optional, Beta)
     * Config for more granular control of Private Service Connect transitivity. Only takes effect when `exportPsc` is true.
     * If `exportPsc` is true, at least one of `publishedServicesAndRegionalGoogleApis` and `globalGoogleApis` must be true.
     * Structure is documented below.
     * @return builder
     */
    def exportPscConfig(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.HubExportPscConfigArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.HubArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.HubExportPscConfigArgs.builder
      builder.exportPscConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.HubIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.HubIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.HubIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.HubIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.HubIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.HubIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.HubIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.HubIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.InternalRangeArgs.Builder)
    /**
     * @param allocationOptions Options for automatically allocating a free range with a size given by prefixLength.
     * Structure is documented below.
     * @return builder
     */
    def allocationOptions(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.InternalRangeAllocationOptionsArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.InternalRangeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.InternalRangeAllocationOptionsArgs.builder
      builder.allocationOptions(args(argsBuilder).build)

    /**
     * @param migration Specification for migration with source and target resource names.
     * Structure is documented below.
     * @return builder
     */
    def migration(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.InternalRangeMigrationArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.InternalRangeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.InternalRangeMigrationArgs.builder
      builder.migration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.MulticloudDataTransferConfigArgs.Builder)
    /**
     * @param services Maps services to their current or planned states. Service names are keys,
     * and the associated values describe the state of the service.
     * Structure is documented below.
     * @return builder
     */
    def services(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.MulticloudDataTransferConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceArgs.builder
      builder.services(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.PolicyBasedRouteArgs.Builder)
    /**
     * @param filter The filter to match L4 traffic.
     * Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteFilterArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.PolicyBasedRouteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param interconnectAttachment The interconnect attachments that this policy-based route applies to.
     * Structure is documented below.
     * @return builder
     */
    def interconnectAttachment(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteInterconnectAttachmentArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.PolicyBasedRouteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteInterconnectAttachmentArgs.builder
      builder.interconnectAttachment(args(argsBuilder).build)

    /**
     * @param virtualMachine VM instances to which this policy-based route applies to.
     * Structure is documented below.
     * @return builder
     */
    def virtualMachine(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteVirtualMachineArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.PolicyBasedRouteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteVirtualMachineArgs.builder
      builder.virtualMachine(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.ServiceConnectionPolicyArgs.Builder)
    /**
     * @param pscConfig Configuration used for Private Service Connect connections. Used when Infrastructure is PSC.
     * Structure is documented below.
     * @return builder
     */
    def pscConfig(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConfigArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.ServiceConnectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConfigArgs.builder
      builder.pscConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder)
    /**
     * @param gateway This is a gateway that can apply specialized processing to traffic going through it.
     * Structure is documented below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param linkedInterconnectAttachments A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
     * Structure is documented below.
     * @return builder
     */
    def linkedInterconnectAttachments(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedInterconnectAttachmentsArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedInterconnectAttachmentsArgs.builder
      builder.linkedInterconnectAttachments(args(argsBuilder).build)

    /**
     * @param linkedProducerVpcNetwork Producer VPC network that is associated with the spoke.
     * Structure is documented below.
     * @return builder
     */
    def linkedProducerVpcNetwork(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedProducerVpcNetworkArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedProducerVpcNetworkArgs.builder
      builder.linkedProducerVpcNetwork(args(argsBuilder).build)

    /**
     * @param linkedRouterApplianceInstances The URIs of linked Router appliance resources
     * Structure is documented below.
     * @return builder
     */
    def linkedRouterApplianceInstances(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs.builder
      builder.linkedRouterApplianceInstances(args(argsBuilder).build)

    /**
     * @param linkedVpcNetwork VPC network that is associated with the spoke.
     * Structure is documented below.
     * @return builder
     */
    def linkedVpcNetwork(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpcNetworkArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpcNetworkArgs.builder
      builder.linkedVpcNetwork(args(argsBuilder).build)

    /**
     * @param linkedVpnTunnels The URIs of linked VPN tunnel resources
     * Structure is documented below.
     * @return builder
     */
    def linkedVpnTunnels(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpnTunnelsArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpnTunnelsArgs.builder
      builder.linkedVpnTunnels(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.DestinationState.Builder)
    /**
     * @param endpoints The list of DestinationEndpoint resources configured for the IP prefix.
     * Structure is documented below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.DestinationEndpointArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.DestinationState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.DestinationEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param stateTimelines The timeline of the expected `Destination` states or the current rest
     * state. If a state change is expected, the value is `ADDING`,
     * `DELETING` or `SUSPENDING`, depending on the action specified.
     * Structure is documented below.
     * @return builder
     */
    def stateTimelines(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.DestinationStateTimelineArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.DestinationState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.DestinationStateTimelineArgs.builder
      builder.stateTimelines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.DestinationStateTimelineArgs.Builder)
    /**
     * @param states (Output)
     * The state and activation time details of the resource state.
     * Structure is documented below.
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.DestinationStateTimelineStateArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.DestinationStateTimelineArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.DestinationStateTimelineStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.GroupState.Builder)
    /**
     * @param autoAccept Optional. The auto-accept setting for this group.
     * Structure is documented below.
     * @return builder
     */
    def autoAccept(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.GroupAutoAcceptArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.GroupAutoAcceptArgs.builder
      builder.autoAccept(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.HubIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.HubIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.HubIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.HubIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.HubIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.HubIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.HubIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.HubIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.HubState.Builder)
    /**
     * @param exportPscConfig (Optional, Beta)
     * Config for more granular control of Private Service Connect transitivity. Only takes effect when `exportPsc` is true.
     * If `exportPsc` is true, at least one of `publishedServicesAndRegionalGoogleApis` and `globalGoogleApis` must be true.
     * Structure is documented below.
     * @return builder
     */
    def exportPscConfig(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.HubExportPscConfigArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.HubExportPscConfigArgs.builder
      builder.exportPscConfig(args(argsBuilder).build)

    /**
     * @param routingVpcs The VPC network associated with this hub&#39;s spokes. All of the VPN tunnels, VLAN attachments, and router appliance instances referenced by this hub&#39;s spokes must belong to this VPC network. This field is read-only. Network Connectivity Center automatically populates it based on the set of spokes attached to the hub.
     * Structure is documented below.
     * @return builder
     */
    def routingVpcs(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.HubRoutingVpcArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.HubState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.HubRoutingVpcArgs.builder
      builder.routingVpcs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.InternalRangeState.Builder)
    /**
     * @param allocationOptions Options for automatically allocating a free range with a size given by prefixLength.
     * Structure is documented below.
     * @return builder
     */
    def allocationOptions(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.InternalRangeAllocationOptionsArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.InternalRangeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.InternalRangeAllocationOptionsArgs.builder
      builder.allocationOptions(args(argsBuilder).build)

    /**
     * @param migration Specification for migration with source and target resource names.
     * Structure is documented below.
     * @return builder
     */
    def migration(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.InternalRangeMigrationArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.InternalRangeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.InternalRangeMigrationArgs.builder
      builder.migration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceArgs.Builder)
    /**
     * @param states (Output)
     * The state and activation time details for the service.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedServicesStates&#34;&gt;&lt;/a&gt;The `states` block contains:
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceStateArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigState.Builder)
    /**
     * @param services Maps services to their current or planned states. Service names are keys,
     * and the associated values describe the state of the service.
     * Structure is documented below.
     * @return builder
     */
    def services(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceArgs.builder
      builder.services(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteState.Builder)
    /**
     * @param filter The filter to match L4 traffic.
     * Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteFilterArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param interconnectAttachment The interconnect attachments that this policy-based route applies to.
     * Structure is documented below.
     * @return builder
     */
    def interconnectAttachment(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteInterconnectAttachmentArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteInterconnectAttachmentArgs.builder
      builder.interconnectAttachment(args(argsBuilder).build)

    /**
     * @param virtualMachine VM instances to which this policy-based route applies to.
     * Structure is documented below.
     * @return builder
     */
    def virtualMachine(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteVirtualMachineArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteVirtualMachineArgs.builder
      builder.virtualMachine(args(argsBuilder).build)

    /**
     * @param warnings If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * Structure is documented below.
     * @return builder
     */
    def warnings(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteWarningArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteWarningArgs.builder
      builder.warnings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionArgs.Builder)
    /**
     * @param error The most recent error during operating this connection.
     * Structure is documented below.
     * @return builder
     */
    def error(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionErrorArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionErrorArgs.builder
      builder.error(args(argsBuilder).build)

    /**
     * @param errorInfo The error info for the latest error during operating this connection.
     * Structure is documented below.
     * @return builder
     */
    def errorInfo(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionErrorInfoArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionErrorInfoArgs.builder
      builder.errorInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyState.Builder)
    /**
     * @param pscConfig Configuration used for Private Service Connect connections. Used when Infrastructure is PSC.
     * Structure is documented below.
     * @return builder
     */
    def pscConfig(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConfigArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConfigArgs.builder
      builder.pscConfig(args(argsBuilder).build)

    /**
     * @param pscConnections Information about each Private Service Connect connection.
     * Structure is documented below.
     * @return builder
     */
    def pscConnections(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionArgs.builder
      builder.pscConnections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayArgs.Builder)
    /**
     * @param ipRangeReservations A list of IP ranges that are reserved for this gateway&#39;s internal infrastructure.
     * Structure is documented below.
     * @return builder
     */
    def ipRangeReservations(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayIpRangeReservationArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayIpRangeReservationArgs.builder
      builder.ipRangeReservations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs.Builder)
    /**
     * @param instances The list of router appliance instances
     * Structure is documented below.
     * @return builder
     */
    def instances(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesInstanceArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesInstanceArgs.builder
      builder.instances(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder)
    /**
     * @param gateway This is a gateway that can apply specialized processing to traffic going through it.
     * Structure is documented below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param linkedInterconnectAttachments A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
     * Structure is documented below.
     * @return builder
     */
    def linkedInterconnectAttachments(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedInterconnectAttachmentsArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedInterconnectAttachmentsArgs.builder
      builder.linkedInterconnectAttachments(args(argsBuilder).build)

    /**
     * @param linkedProducerVpcNetwork Producer VPC network that is associated with the spoke.
     * Structure is documented below.
     * @return builder
     */
    def linkedProducerVpcNetwork(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedProducerVpcNetworkArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedProducerVpcNetworkArgs.builder
      builder.linkedProducerVpcNetwork(args(argsBuilder).build)

    /**
     * @param linkedRouterApplianceInstances The URIs of linked Router appliance resources
     * Structure is documented below.
     * @return builder
     */
    def linkedRouterApplianceInstances(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs.builder
      builder.linkedRouterApplianceInstances(args(argsBuilder).build)

    /**
     * @param linkedVpcNetwork VPC network that is associated with the spoke.
     * Structure is documented below.
     * @return builder
     */
    def linkedVpcNetwork(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpcNetworkArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpcNetworkArgs.builder
      builder.linkedVpcNetwork(args(argsBuilder).build)

    /**
     * @param linkedVpnTunnels The URIs of linked VPN tunnel resources
     * Structure is documented below.
     * @return builder
     */
    def linkedVpnTunnels(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpnTunnelsArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpnTunnelsArgs.builder
      builder.linkedVpnTunnels(args(argsBuilder).build)

    /**
     * @param reasons The reasons for the current state in the lifecycle
     * Structure is documented below.
     * @return builder
     */
    def reasons(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeReasonArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeReasonArgs.builder
      builder.reasons(args.map(_(argsBuilder).build)*)
