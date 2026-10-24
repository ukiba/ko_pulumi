package jp.ukiba.ko_pulumi
package aws

object vpclattice_ext:
  extension (builder: com.pulumi.aws.vpclattice.ListenerArgs.Builder)
    /**
     * @param defaultAction Default action block for the default listener rule. Default action blocks are defined below.
     * @return builder
     */
    inline def defaultAction(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.Builder]):
        com.pulumi.aws.vpclattice.ListenerArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.builder
      builder.defaultAction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.ListenerRuleArgs.Builder)
    /**
     * @param action Action for the listener rule. See `action` Block for details.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.Builder]):
        com.pulumi.aws.vpclattice.ListenerRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match Rule match. See `match` Block for details.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchArgs.Builder]):
        com.pulumi.aws.vpclattice.ListenerRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.ResourceConfigurationArgs.Builder)
    /**
     * @param resourceConfigurationDefinition Details of the Resource Configuration. See `resourceConfigurationDefinition` Block for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def resourceConfigurationDefinition(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.Builder]):
        com.pulumi.aws.vpclattice.ResourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.builder
      builder.resourceConfigurationDefinition(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpclattice.ResourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.ResourceGatewayArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceGatewayTimeoutsArgs.Builder]):
        com.pulumi.aws.vpclattice.ResourceGatewayArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceGatewayTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.ServiceNetworkResourceAssociationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpclattice.ServiceNetworkResourceAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.ServiceNetworkVpcAssociationArgs.Builder)
    /**
     * @param dnsOptions Configuration block for DNS option. See `dnsOptions` block below for details.
     * @return builder
     */
    inline def dnsOptions(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ServiceNetworkVpcAssociationDnsOptionsArgs.Builder]):
        com.pulumi.aws.vpclattice.ServiceNetworkVpcAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ServiceNetworkVpcAssociationDnsOptionsArgs.builder
      builder.dnsOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.TargetGroupArgs.Builder)
    /**
     * @param config Target group configuration. See `config` Block below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs.Builder]):
        com.pulumi.aws.vpclattice.TargetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.TargetGroupAttachmentArgs.Builder)
    /**
     * @param target Target to register with the target group. See `target` Block for details.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.aws.vpclattice.inputs.TargetGroupAttachmentTargetArgs.Builder]):
        com.pulumi.aws.vpclattice.TargetGroupAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.TargetGroupAttachmentTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.Builder)
    /**
     * @param fixedResponse Configuration block for returning a fixed response. See `fixedResponse` Block below.
     * @return builder
     */
    inline def fixedResponse(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionFixedResponseArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionFixedResponseArgs.builder
      builder.fixedResponse(args(argsBuilder).build)

    /**
     * @param forwards Route requests to one or more target groups. See `forward` Block below.
     * 
     * &gt; **NOTE:** You must specify exactly one of the following argument blocks: `fixedResponse` or `forward`.
     * @return builder
     */
    inline def forwards(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionForwardArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionForwardArgs.builder
      builder.forwards(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionForwardArgs.Builder)
    /**
     * @param targetGroups One or more target group blocks. See `targetGroups` Block below.
     * @return builder
     */
    inline def targetGroups(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionForwardTargetGroupArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionForwardTargetGroupArgs.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.Builder)
    /**
     * @param fixedResponse Rule action that returns a custom HTTP response. See `fixedResponse` Block for details.
     * @return builder
     */
    inline def fixedResponse(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleActionFixedResponseArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleActionFixedResponseArgs.builder
      builder.fixedResponse(args(argsBuilder).build)

    /**
     * @param forward Forward action. Traffic that matches the rule is forwarded to the specified target groups. See `forward` Block for details.
     * @return builder
     */
    inline def forward(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleActionForwardArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleActionForwardArgs.builder
      builder.forward(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleActionForwardArgs.Builder)
    /**
     * @param targetGroups Target groups that traffic matching the rule is forwarded to. See `targetGroups` Block for details.
     * @return builder
     */
    inline def targetGroups(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleActionForwardTargetGroupArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleActionForwardArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleActionForwardTargetGroupArgs.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchArgs.Builder)
    /**
     * @param httpMatch HTTP criteria that a rule must match. See `httpMatch` Block for details.
     * @return builder
     */
    inline def httpMatch(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchArgs.builder
      builder.httpMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchArgs.Builder)
    /**
     * @param headerMatches Header matches that match incoming requests based on the request header value before applying the rule action. See `headerMatches` Block for details.
     * @return builder
     */
    inline def headerMatches(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchHeaderMatchArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchHeaderMatchArgs.builder
      builder.headerMatches(args.map(_(argsBuilder).build)*)

    /**
     * @param pathMatch Path match. See `pathMatch` Block for details.
     * @return builder
     */
    inline def pathMatch(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchPathMatchArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchPathMatchArgs.builder
      builder.pathMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchHeaderMatchArgs.Builder)
    /**
     * @param match Header match type. See `match.http_match.header_matches.match` Block for details.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchHeaderMatchMatchArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchHeaderMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchHeaderMatchMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchPathMatchArgs.Builder)
    /**
     * @param match Path match type. See `match.http_match.path_match.match` Block for details.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchPathMatchMatchArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchPathMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchHttpMatchPathMatchMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerRuleState.Builder)
    /**
     * @param action Action for the listener rule. See `action` Block for details.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match Rule match. See `match` Block for details.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerRuleState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ListenerState.Builder)
    /**
     * @param defaultAction Default action block for the default listener rule. Default action blocks are defined below.
     * @return builder
     */
    inline def defaultAction(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ListenerState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs.builder
      builder.defaultAction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.Builder)
    /**
     * @param arnResource Resource DNS Configuration. See `arnResource` Block for details.
     * @return builder
     */
    inline def arnResource(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArnResourceArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArnResourceArgs.builder
      builder.arnResource(args(argsBuilder).build)

    /**
     * @param dnsResource Resource DNS Configuration. See `dnsResource` Block for details.
     * @return builder
     */
    inline def dnsResource(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionDnsResourceArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionDnsResourceArgs.builder
      builder.dnsResource(args(argsBuilder).build)

    /**
     * @param ipResource Resource DNS Configuration. See `ipResource` Block for details.
     * @return builder
     */
    inline def ipResource(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionIpResourceArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionIpResourceArgs.builder
      builder.ipResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ResourceConfigurationState.Builder)
    /**
     * @param resourceConfigurationDefinition Details of the Resource Configuration. See `resourceConfigurationDefinition` Block for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def resourceConfigurationDefinition(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ResourceConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationResourceConfigurationDefinitionArgs.builder
      builder.resourceConfigurationDefinition(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ResourceConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ResourceGatewayState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ResourceGatewayTimeoutsArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ResourceGatewayState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ResourceGatewayTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationState.Builder)
    /**
     * @param dnsEntries DNS entry of the association in the service network.
     * @return builder
     */
    inline def dnsEntries(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationDnsEntryArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationState.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationDnsEntryArgs.builder
      builder.dnsEntries(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ServiceNetworkResourceAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ServiceNetworkServiceAssociationState.Builder)
    /**
     * @param dnsEntries DNS name of the service.
     * @return builder
     */
    inline def dnsEntries(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ServiceNetworkServiceAssociationDnsEntryArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ServiceNetworkServiceAssociationState.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ServiceNetworkServiceAssociationDnsEntryArgs.builder
      builder.dnsEntries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ServiceNetworkVpcAssociationState.Builder)
    /**
     * @param dnsOptions Configuration block for DNS option. See `dnsOptions` block below for details.
     * @return builder
     */
    inline def dnsOptions(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ServiceNetworkVpcAssociationDnsOptionsArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.ServiceNetworkVpcAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.ServiceNetworkVpcAssociationDnsOptionsArgs.builder
      builder.dnsOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.ServiceState.Builder)
    /**
     * @param dnsEntries DNS name of the service.
     * @return builder
     */
    inline def dnsEntries(args: Endofunction[com.pulumi.aws.vpclattice.inputs.ServiceDnsEntryArgs.Builder]*):
        com.pulumi.aws.vpclattice.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.vpclattice.inputs.ServiceDnsEntryArgs.builder
      builder.dnsEntries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.vpclattice.inputs.TargetGroupAttachmentState.Builder)
    /**
     * @param target Target to register with the target group. See `target` Block for details.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.aws.vpclattice.inputs.TargetGroupAttachmentTargetArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.TargetGroupAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.TargetGroupAttachmentTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs.Builder)
    /**
     * @param healthCheck Health check configuration. See `healthCheck` Block below.
     * @return builder
     */
    inline def healthCheck(args: Endofunction[com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckArgs.Builder)
    /**
     * @param matcher Codes to use when checking for a successful response from a target. See `matcher` Block below.
     * @return builder
     */
    inline def matcher(args: Endofunction[com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckMatcherArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckArgs.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckMatcherArgs.builder
      builder.matcher(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpclattice.inputs.TargetGroupState.Builder)
    /**
     * @param config Target group configuration. See `config` Block below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs.Builder]):
        com.pulumi.aws.vpclattice.inputs.TargetGroupState.Builder =
      val argsBuilder = com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs.builder
      builder.config(args(argsBuilder).build)
