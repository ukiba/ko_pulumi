package jp.ukiba.ko_pulumi
package aws

object networkmanager_ext:
  extension (builder: com.pulumi.aws.networkmanager.ConnectAttachmentArgs.Builder)
    /**
     * @param options Options block. See options for more information.
     * @return builder
     */
    inline def options(args: Endofunction[com.pulumi.aws.networkmanager.inputs.ConnectAttachmentOptionsArgs.Builder]):
        com.pulumi.aws.networkmanager.ConnectAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.ConnectAttachmentOptionsArgs.builder
      builder.options(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.ConnectPeerArgs.Builder)
    /**
     * @param bgpOptions Connect peer BGP options. See bgpOptions for more information.
     * @return builder
     */
    inline def bgpOptions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.ConnectPeerBgpOptionsArgs.Builder]):
        com.pulumi.aws.networkmanager.ConnectPeerArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.ConnectPeerBgpOptionsArgs.builder
      builder.bgpOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.DeviceArgs.Builder)
    /**
     * @param awsLocation AWS location of the device. Documented below.
     * @return builder
     */
    inline def awsLocation(args: Endofunction[com.pulumi.aws.networkmanager.inputs.DeviceAwsLocationArgs.Builder]):
        com.pulumi.aws.networkmanager.DeviceArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.DeviceAwsLocationArgs.builder
      builder.awsLocation(args(argsBuilder).build)

    /**
     * @param location Location of the device. Documented below.
     * @return builder
     */
    inline def location(args: Endofunction[com.pulumi.aws.networkmanager.inputs.DeviceLocationArgs.Builder]):
        com.pulumi.aws.networkmanager.DeviceArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.DeviceLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.DxGatewayAttachmentArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.networkmanager.inputs.DxGatewayAttachmentTimeoutsArgs.Builder]):
        com.pulumi.aws.networkmanager.DxGatewayAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.DxGatewayAttachmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.LinkArgs.Builder)
    /**
     * @param bandwidth Upload speed and download speed in Mbps. See below.
     * @return builder
     */
    inline def bandwidth(args: Endofunction[com.pulumi.aws.networkmanager.inputs.LinkBandwidthArgs.Builder]):
        com.pulumi.aws.networkmanager.LinkArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.LinkBandwidthArgs.builder
      builder.bandwidth(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.SiteArgs.Builder)
    /**
     * @param location Site location. See below.
     * @return builder
     */
    inline def location(args: Endofunction[com.pulumi.aws.networkmanager.inputs.SiteLocationArgs.Builder]):
        com.pulumi.aws.networkmanager.SiteArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.SiteLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.VpcAttachmentArgs.Builder)
    /**
     * @param options Options for the VPC attachment. See below.
     * @return builder
     */
    inline def options(args: Endofunction[com.pulumi.aws.networkmanager.inputs.VpcAttachmentOptionsArgs.Builder]):
        com.pulumi.aws.networkmanager.VpcAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.VpcAttachmentOptionsArgs.builder
      builder.options(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.ConnectAttachmentState.Builder)
    /**
     * @param options Options block. See options for more information.
     * @return builder
     */
    inline def options(args: Endofunction[com.pulumi.aws.networkmanager.inputs.ConnectAttachmentOptionsArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.ConnectAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.ConnectAttachmentOptionsArgs.builder
      builder.options(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.ConnectPeerConfigurationArgs.Builder)
    inline def bgpConfigurations(args: Endofunction[com.pulumi.aws.networkmanager.inputs.ConnectPeerConfigurationBgpConfigurationArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.ConnectPeerConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.ConnectPeerConfigurationBgpConfigurationArgs.builder
      builder.bgpConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.ConnectPeerState.Builder)
    /**
     * @param bgpOptions Connect peer BGP options. See bgpOptions for more information.
     * @return builder
     */
    inline def bgpOptions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.ConnectPeerBgpOptionsArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.ConnectPeerState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.ConnectPeerBgpOptionsArgs.builder
      builder.bgpOptions(args(argsBuilder).build)

    /**
     * @param configurations Configuration of the Connect peer.
     * @return builder
     */
    inline def configurations(args: Endofunction[com.pulumi.aws.networkmanager.inputs.ConnectPeerConfigurationArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.ConnectPeerState.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.ConnectPeerConfigurationArgs.builder
      builder.configurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.CoreNetworkState.Builder)
    /**
     * @param edges One or more blocks detailing the edges within a core network. Detailed below.
     * @return builder
     */
    inline def edges(args: Endofunction[com.pulumi.aws.networkmanager.inputs.CoreNetworkEdgeArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.CoreNetworkState.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.CoreNetworkEdgeArgs.builder
      builder.edges(args.map(_(argsBuilder).build)*)

    /**
     * @param segments One or more blocks detailing the segments within a core network. Detailed below.
     * @return builder
     */
    inline def segments(args: Endofunction[com.pulumi.aws.networkmanager.inputs.CoreNetworkSegmentArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.CoreNetworkState.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.CoreNetworkSegmentArgs.builder
      builder.segments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.DeviceState.Builder)
    /**
     * @param awsLocation AWS location of the device. Documented below.
     * @return builder
     */
    inline def awsLocation(args: Endofunction[com.pulumi.aws.networkmanager.inputs.DeviceAwsLocationArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.DeviceState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.DeviceAwsLocationArgs.builder
      builder.awsLocation(args(argsBuilder).build)

    /**
     * @param location Location of the device. Documented below.
     * @return builder
     */
    inline def location(args: Endofunction[com.pulumi.aws.networkmanager.inputs.DeviceLocationArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.DeviceState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.DeviceLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.DxGatewayAttachmentState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.networkmanager.inputs.DxGatewayAttachmentTimeoutsArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.DxGatewayAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.DxGatewayAttachmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder)
    /**
     * @param attachmentPolicies In a core network, all attachments use the block argument `attachmentPolicies` section to map an attachment to a segment. Instead of manually associating a segment to each attachment, attachments use tags, and then the tags are used to associate the attachment to the specified segment. Detailed below.
     * @return builder
     */
    inline def attachmentPolicies(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyArgs.builder
      builder.attachmentPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param attachmentRoutingPolicyRules Block argument that applies routing policies to attachments. Available in policy version `2025.11` and later. Detailed below.
     * @return builder
     */
    inline def attachmentRoutingPolicyRules(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleArgs.builder
      builder.attachmentRoutingPolicyRules(args.map(_(argsBuilder).build)*)

    /**
     * @param coreNetworkConfigurations The core network configuration section defines the Regions where a core network should operate. For AWS Regions that are defined in the policy, the core network creates a Core Network Edge where you can connect attachments. After it&#39;s created, each Core Network Edge is peered with every other defined Region and is configured with consistent segment and routing across all Regions. Regions cannot be removed until the associated attachments are deleted. Detailed below.
     * @return builder
     */
    inline def coreNetworkConfigurations(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationArgs.builder
      builder.coreNetworkConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param networkFunctionGroups Block argument that defines the service insertion actions you want to include. Detailed below.
     * @return builder
     */
    inline def networkFunctionGroups(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentNetworkFunctionGroupArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentNetworkFunctionGroupArgs.builder
      builder.networkFunctionGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param routingPolicies Block argument that defines routing policies for controlling route propagation. Routing policies allow you to filter, modify, and control BGP routes advertised to and from your core network. Available in policy version `2025.11` and later. Detailed below.
     * @return builder
     */
    inline def routingPolicies(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyArgs.builder
      builder.routingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param segmentActions A block argument, `segmentActions` define how routing works between segments. By default, attachments can only communicate with other attachments in the same segment. Detailed below.
     * @return builder
     */
    inline def segmentActions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionArgs.builder
      builder.segmentActions(args.map(_(argsBuilder).build)*)

    /**
     * @param segments Block argument that defines the different segments in the network. Here you can provide descriptions, change defaults, and provide explicit Regional operational and route filters. The names defined for each segment are used in the `segmentActions` and `attachmentPolicies` section. Each segment is created, and operates, as a completely separated routing domain. By default, attachments can only communicate with other attachments in the same segment. Detailed below.
     * @return builder
     */
    inline def segments(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentArgs.builder
      builder.segments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicy.Builder)
    /**
     * @param action Action to take when a condition is true. Detailed Below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyAction.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicy.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyAction.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param conditions A block argument. Detailed Below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyCondition.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicy.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyCondition.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyArgs.Builder)
    /**
     * @param action Action to take when a condition is true. Detailed Below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyActionArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param conditions A block argument. Detailed Below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyConditionArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicyConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRule.Builder)
    /**
     * @param action Block defining the action to take when conditions match. Detailed below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleAction.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRule.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleAction.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param conditions A block argument. Detailed below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleCondition.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRule.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleCondition.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleArgs.Builder)
    /**
     * @param action Block defining the action to take when conditions match. Detailed below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleActionArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param conditions A block argument. Detailed below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleConditionArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfiguration.Builder)
    /**
     * @param edgeLocations A block value of AWS Region locations where you&#39;re creating Core Network Edges. Detailed below.
     * @return builder
     */
    inline def edgeLocations(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfiguration.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation.builder
      builder.edgeLocations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationArgs.Builder)
    /**
     * @param edgeLocations A block value of AWS Region locations where you&#39;re creating Core Network Edges. Detailed below.
     * @return builder
     */
    inline def edgeLocations(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs.builder
      builder.edgeLocations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentPlainArgs.Builder)
    /**
     * @param attachmentPolicies In a core network, all attachments use the block argument `attachmentPolicies` section to map an attachment to a segment. Instead of manually associating a segment to each attachment, attachments use tags, and then the tags are used to associate the attachment to the specified segment. Detailed below.
     * @return builder
     */
    inline def attachmentPolicies(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicy.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentPolicy.builder
      builder.attachmentPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param attachmentRoutingPolicyRules Block argument that applies routing policies to attachments. Available in policy version `2025.11` and later. Detailed below.
     * @return builder
     */
    inline def attachmentRoutingPolicyRules(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRule.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentAttachmentRoutingPolicyRule.builder
      builder.attachmentRoutingPolicyRules(args.map(_(argsBuilder).build)*)

    /**
     * @param coreNetworkConfigurations The core network configuration section defines the Regions where a core network should operate. For AWS Regions that are defined in the policy, the core network creates a Core Network Edge where you can connect attachments. After it&#39;s created, each Core Network Edge is peered with every other defined Region and is configured with consistent segment and routing across all Regions. Regions cannot be removed until the associated attachments are deleted. Detailed below.
     * @return builder
     */
    inline def coreNetworkConfigurations(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfiguration.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentCoreNetworkConfiguration.builder
      builder.coreNetworkConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param networkFunctionGroups Block argument that defines the service insertion actions you want to include. Detailed below.
     * @return builder
     */
    inline def networkFunctionGroups(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentNetworkFunctionGroup.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentNetworkFunctionGroup.builder
      builder.networkFunctionGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param routingPolicies Block argument that defines routing policies for controlling route propagation. Routing policies allow you to filter, modify, and control BGP routes advertised to and from your core network. Available in policy version `2025.11` and later. Detailed below.
     * @return builder
     */
    inline def routingPolicies(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicy.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicy.builder
      builder.routingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param segmentActions A block argument, `segmentActions` define how routing works between segments. By default, attachments can only communicate with other attachments in the same segment. Detailed below.
     * @return builder
     */
    inline def segmentActions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentAction.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentAction.builder
      builder.segmentActions(args.map(_(argsBuilder).build)*)

    /**
     * @param segments Block argument that defines the different segments in the network. Here you can provide descriptions, change defaults, and provide explicit Regional operational and route filters. The names defined for each segment are used in the `segmentActions` and `attachmentPolicies` section. Each segment is created, and operates, as a completely separated routing domain. By default, attachments can only communicate with other attachments in the same segment. Detailed below.
     * @return builder
     */
    inline def segments(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegment.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegment.builder
      builder.segments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicy.Builder)
    /**
     * @param routingPolicyRules List of routing policy rules. Each rule defines match conditions and actions. Detailed below.
     * @return builder
     */
    inline def routingPolicyRules(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRule.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicy.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRule.builder
      builder.routingPolicyRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyArgs.Builder)
    /**
     * @param routingPolicyRules List of routing policy rules. Each rule defines match conditions and actions. Detailed below.
     * @return builder
     */
    inline def routingPolicyRules(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleArgs.builder
      builder.routingPolicyRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRule.Builder)
    /**
     * @param ruleDefinition Defines the match conditions and actions for the rule. Detailed below.
     * @return builder
     */
    inline def ruleDefinition(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinition.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRule.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinition.builder
      builder.ruleDefinition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleArgs.Builder)
    /**
     * @param ruleDefinition Defines the match conditions and actions for the rule. Detailed below.
     * @return builder
     */
    inline def ruleDefinition(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionArgs.builder
      builder.ruleDefinition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinition.Builder)
    /**
     * @param action Block defining the action to take when conditions match. Detailed below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionAction.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinition.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionAction.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param matchConditions List of conditions to match against routes. Detailed below.
     * @return builder
     */
    inline def matchConditions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionMatchCondition.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinition.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionMatchCondition.builder
      builder.matchConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionArgs.Builder)
    /**
     * @param action Block defining the action to take when conditions match. Detailed below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionActionArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param matchConditions List of conditions to match against routes. Detailed below.
     * @return builder
     */
    inline def matchConditions(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionMatchConditionArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentRoutingPolicyRoutingPolicyRuleRuleDefinitionMatchConditionArgs.builder
      builder.matchConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentAction.Builder)
    /**
     * @param edgeLocationAssociation Associates routing policies with specific edge location pairs. Available in policy version `2025.11` and later. Detailed below.
     * @return builder
     */
    inline def edgeLocationAssociation(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionEdgeLocationAssociation.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentAction.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionEdgeLocationAssociation.builder
      builder.edgeLocationAssociation(args(argsBuilder).build)

    /**
     * @param via The network function groups and any edge overrides associated with the action.
     * @return builder
     */
    inline def via(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionVia.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentAction.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionVia.builder
      builder.via(args(argsBuilder).build)

    /**
     * @param whenSentTo The destination segments for the `send-via` or `send-to` `action`.
     * @return builder
     */
    inline def whenSentTo(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionWhenSentTo.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentAction.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionWhenSentTo.builder
      builder.whenSentTo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionArgs.Builder)
    /**
     * @param edgeLocationAssociation Associates routing policies with specific edge location pairs. Available in policy version `2025.11` and later. Detailed below.
     * @return builder
     */
    inline def edgeLocationAssociation(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionEdgeLocationAssociationArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionEdgeLocationAssociationArgs.builder
      builder.edgeLocationAssociation(args(argsBuilder).build)

    /**
     * @param via The network function groups and any edge overrides associated with the action.
     * @return builder
     */
    inline def via(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaArgs.builder
      builder.via(args(argsBuilder).build)

    /**
     * @param whenSentTo The destination segments for the `send-via` or `send-to` `action`.
     * @return builder
     */
    inline def whenSentTo(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionWhenSentToArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionWhenSentToArgs.builder
      builder.whenSentTo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionVia.Builder)
    /**
     * @param withEdgeOverrides Any edge overrides and the preferred edge to use.
     * @return builder
     */
    inline def withEdgeOverrides(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverride.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionVia.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverride.builder
      builder.withEdgeOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaArgs.Builder)
    /**
     * @param withEdgeOverrides Any edge overrides and the preferred edge to use.
     * @return builder
     */
    inline def withEdgeOverrides(args: Endofunction[com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverrideArgs.Builder]*):
        com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentSegmentActionViaWithEdgeOverrideArgs.builder
      builder.withEdgeOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.networkmanager.inputs.LinkState.Builder)
    /**
     * @param bandwidth Upload speed and download speed in Mbps. See below.
     * @return builder
     */
    inline def bandwidth(args: Endofunction[com.pulumi.aws.networkmanager.inputs.LinkBandwidthArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.LinkState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.LinkBandwidthArgs.builder
      builder.bandwidth(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.SiteState.Builder)
    /**
     * @param location Site location. See below.
     * @return builder
     */
    inline def location(args: Endofunction[com.pulumi.aws.networkmanager.inputs.SiteLocationArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.SiteState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.SiteLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkmanager.inputs.VpcAttachmentState.Builder)
    /**
     * @param options Options for the VPC attachment. See below.
     * @return builder
     */
    inline def options(args: Endofunction[com.pulumi.aws.networkmanager.inputs.VpcAttachmentOptionsArgs.Builder]):
        com.pulumi.aws.networkmanager.inputs.VpcAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.networkmanager.inputs.VpcAttachmentOptionsArgs.builder
      builder.options(args(argsBuilder).build)
