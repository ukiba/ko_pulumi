package jp.ukiba.ko_pulumi
package gcp

object beyondcorp_ext:
  extension (builder: com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationArgs.Builder)
    /**
     * @param endpointMatchers Required. Endpoint matchers associated with an application.
     * A combination of hostname and ports as endpoint matcher is used to match
     * the application.
     * Match conditions for OR logic.
     * An array of match conditions to allow for multiple matching criteria.
     * The rule is considered a match if one the conditions are met.
     * The conditions can be one of the following combination
     * (Hostname), (Hostname &amp; Ports)
     * EXAMPLES:
     * Hostname - (&#34;*.abc.com&#34;), (&#34;xyz.abc.com&#34;)
     * Hostname and Ports - (&#34;abc.com&#34; and &#34;22&#34;), (&#34;abc.com&#34; and &#34;22,33&#34;) etc
     * Structure is documented below.
     * @return builder
     */
    def endpointMatchers(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationEndpointMatcherArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationEndpointMatcherArgs.builder
      builder.endpointMatchers(args.map(_(argsBuilder).build)*)

    /**
     * @param upstreams Optional. List of which upstream resource(s) to forward traffic to.
     * Structure is documented below.
     * @return builder
     */
    def upstreams(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.builder
      builder.upstreams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.Builder)
    /**
     * @param hubs Optional. Map of Hubs that represents regional data path deployment with GCP region
     * as a key.
     * Structure is documented below.
     * @return builder
     */
    def hubs(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubArgs.builder
      builder.hubs(args.map(_(argsBuilder).build)*)

    /**
     * @param logging Settings related to Cloud Logging.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayLoggingArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param proxyProtocolConfig Shared proxy configuration for all apps.
     * Structure is documented below.
     * @return builder
     */
    def proxyProtocolConfig(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigArgs.builder
      builder.proxyProtocolConfig(args(argsBuilder).build)

    /**
     * @param serviceDiscovery Settings related to the Service Discovery.
     * Structure is documented below.
     * @return builder
     */
    def serviceDiscovery(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryArgs.builder
      builder.serviceDiscovery(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationState.Builder)
    /**
     * @param endpointMatchers Required. Endpoint matchers associated with an application.
     * A combination of hostname and ports as endpoint matcher is used to match
     * the application.
     * Match conditions for OR logic.
     * An array of match conditions to allow for multiple matching criteria.
     * The rule is considered a match if one the conditions are met.
     * The conditions can be one of the following combination
     * (Hostname), (Hostname &amp; Ports)
     * EXAMPLES:
     * Hostname - (&#34;*.abc.com&#34;), (&#34;xyz.abc.com&#34;)
     * Hostname and Ports - (&#34;abc.com&#34; and &#34;22&#34;), (&#34;abc.com&#34; and &#34;22,33&#34;) etc
     * Structure is documented below.
     * @return builder
     */
    def endpointMatchers(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationEndpointMatcherArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationState.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationEndpointMatcherArgs.builder
      builder.endpointMatchers(args.map(_(argsBuilder).build)*)

    /**
     * @param upstreams Optional. List of which upstream resource(s) to forward traffic to.
     * Structure is documented below.
     * @return builder
     */
    def upstreams(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationState.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.builder
      builder.upstreams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder)
    /**
     * @param egressPolicy Optional. Routing policy information.
     * Structure is documented below.
     * @return builder
     */
    def egressPolicy(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamEgressPolicyArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamEgressPolicyArgs.builder
      builder.egressPolicy(args(argsBuilder).build)

    /**
     * @param external List of the external endpoints to forward traffic to.
     * Structure is documented below.
     * @return builder
     */
    def external(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamExternalArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamExternalArgs.builder
      builder.external(args(argsBuilder).build)

    /**
     * @param network Network to forward traffic to.
     * Structure is documented below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamNetworkArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param proxyProtocol Shared proxy configuration for all apps.
     * Structure is documented below.
     * @return builder
     */
    def proxyProtocol(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolArgs.builder
      builder.proxyProtocol(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamExternalArgs.Builder)
    /**
     * @param endpoints List of the endpoints to forward traffic to.
     * Structure is documented below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamExternalEndpointArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamExternalArgs.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamExternalEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolArgs.Builder)
    /**
     * @param contextualHeaders Configuration for the contextual headers.
     * Structure is documented below.
     * @return builder
     */
    def contextualHeaders(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersArgs.builder
      builder.contextualHeaders(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersArgs.Builder)
    /**
     * @param deviceInfo Device info configuration.
     * Structure is documented below.
     * @return builder
     */
    def deviceInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersDeviceInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersDeviceInfoArgs.builder
      builder.deviceInfo(args(argsBuilder).build)

    /**
     * @param groupInfo Group info configuration.
     * Structure is documented below.
     * @return builder
     */
    def groupInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersGroupInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersGroupInfoArgs.builder
      builder.groupInfo(args(argsBuilder).build)

    /**
     * @param userInfo User info configuration.
     * Structure is documented below.
     * @return builder
     */
    def userInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersUserInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersUserInfoArgs.builder
      builder.userInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubArgs.Builder)
    /**
     * @param internetGateway Internet Gateway configuration.
     * Structure is documented below.
     * @return builder
     */
    def internetGateway(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubInternetGatewayArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubInternetGatewayArgs.builder
      builder.internetGateway(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigArgs.Builder)
    /**
     * @param contextualHeaders Configuration for the contextual headers.
     * Structure is documented below.
     * @return builder
     */
    def contextualHeaders(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersArgs.builder
      builder.contextualHeaders(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersArgs.Builder)
    /**
     * @param deviceInfo Device info configuration.
     * Structure is documented below.
     * @return builder
     */
    def deviceInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersDeviceInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersDeviceInfoArgs.builder
      builder.deviceInfo(args(argsBuilder).build)

    /**
     * @param groupInfo Group info configuration.
     * Structure is documented below.
     * @return builder
     */
    def groupInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersGroupInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersGroupInfoArgs.builder
      builder.groupInfo(args(argsBuilder).build)

    /**
     * @param userInfo User info configuration.
     * Structure is documented below.
     * @return builder
     */
    def userInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersUserInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersUserInfoArgs.builder
      builder.userInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryApiGatewayArgs.Builder)
    /**
     * @param resourceOverride Enables fetching resource model updates to alter service behavior per Chrome profile.
     * Structure is documented below.
     * @return builder
     */
    def resourceOverride(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryApiGatewayResourceOverrideArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryApiGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryApiGatewayResourceOverrideArgs.builder
      builder.resourceOverride(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryArgs.Builder)
    /**
     * @param apiGateway External API configuration.
     * Structure is documented below.
     * @return builder
     */
    def apiGateway(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryApiGatewayArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryApiGatewayArgs.builder
      builder.apiGateway(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayState.Builder)
    /**
     * @param hubs Optional. Map of Hubs that represents regional data path deployment with GCP region
     * as a key.
     * Structure is documented below.
     * @return builder
     */
    def hubs(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayState.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubArgs.builder
      builder.hubs(args.map(_(argsBuilder).build)*)

    /**
     * @param logging Settings related to Cloud Logging.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayLoggingArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param proxyProtocolConfig Shared proxy configuration for all apps.
     * Structure is documented below.
     * @return builder
     */
    def proxyProtocolConfig(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigArgs.builder
      builder.proxyProtocolConfig(args(argsBuilder).build)

    /**
     * @param serviceDiscovery Settings related to the Service Discovery.
     * Structure is documented below.
     * @return builder
     */
    def serviceDiscovery(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryArgs.builder
      builder.serviceDiscovery(args(argsBuilder).build)
