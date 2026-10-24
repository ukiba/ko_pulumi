package jp.ukiba.ko_pulumi
package gcp

object networksecurity_ext:
  extension (builder: com.pulumi.gcp.networksecurity.AddressGroupIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AddressGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.networksecurity.AddressGroupIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AddressGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.AddressGroupIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AddressGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.networksecurity.AddressGroupIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AddressGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.AuthorizationPolicyArgs.Builder)
    /**
     * @param rules List of rules to match. Note that at least one of the rules must match in order for the action specified in the &#39;action&#39; field to be taken.
     * A rule is a match if there is a matching source and destination. If left blank, the action specified in the action field will be applied on every request.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.networksecurity.AuthorizationPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.AuthzPolicyArgs.Builder)
    /**
     * @param customProvider Required if the action is CUSTOM. Allows delegating authorization decisions to Cloud IAP or to Service Extensions. One of cloudIap or authzExtension must be specified.
     * Structure is documented below.
     * @return builder
     */
    inline def customProvider(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.Builder]):
        com.pulumi.gcp.networksecurity.AuthzPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.builder
      builder.customProvider(args(argsBuilder).build)

    /**
     * @param httpRules A list of authorization HTTP rules to match against the incoming request.A policy match occurs when at least one HTTP rule matches the request or when no HTTP rules are specified in the policy. At least one HTTP Rule is required for Allow or Deny Action.
     * Limited to 5 rules.
     * Structure is documented below.
     * @return builder
     */
    inline def httpRules(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.Builder]*):
        com.pulumi.gcp.networksecurity.AuthzPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.builder
      builder.httpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param networkRules A list of authorization HTTP rules to match against the incoming request.A policy match occurs when at least one HTTP rule matches the request or when no HTTP rules are specified in the policy. At least one HTTP Rule is required for Allow or Deny Action.
     * Limited to 5 rules.
     * Structure is documented below.
     * @return builder
     */
    inline def networkRules(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleArgs.Builder]*):
        com.pulumi.gcp.networksecurity.AuthzPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleArgs.builder
      builder.networkRules(args.map(_(argsBuilder).build)*)

    /**
     * @param target Specifies the set of resources to which this policy should be applied to.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyTargetArgs.Builder]):
        com.pulumi.gcp.networksecurity.AuthzPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.ClientTlsPolicyArgs.Builder)
    /**
     * @param clientCertificate Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     * Structure is documented below.
     * @return builder
     */
    inline def clientCertificate(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.Builder]):
        com.pulumi.gcp.networksecurity.ClientTlsPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.builder
      builder.clientCertificate(args(argsBuilder).build)

    /**
     * @param serverValidationCas Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def serverValidationCas(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.Builder]*):
        com.pulumi.gcp.networksecurity.ClientTlsPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.builder
      builder.serverValidationCas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.FirewallEndpointArgs.Builder)
    /**
     * @param endpointSettings Settings for the endpoint.
     * Structure is documented below.
     * @return builder
     */
    inline def endpointSettings(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.FirewallEndpointEndpointSettingsArgs.Builder]):
        com.pulumi.gcp.networksecurity.FirewallEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.FirewallEndpointEndpointSettingsArgs.builder
      builder.endpointSettings(args(argsBuilder).build)

    /**
     * @param wildfireSettings (Optional, Beta)
     * Settings for WildFire analysis on the firewall endpoint.
     * Structure is documented below.
     * @return builder
     */
    inline def wildfireSettings(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.FirewallEndpointWildfireSettingsArgs.Builder]):
        com.pulumi.gcp.networksecurity.FirewallEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.FirewallEndpointWildfireSettingsArgs.builder
      builder.wildfireSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.SacAttachmentArgs.Builder)
    /**
     * @param symantecOptions Configuration required for Symantec attachments.
     * Structure is documented below.
     * @return builder
     */
    inline def symantecOptions(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SacAttachmentSymantecOptionsArgs.Builder]):
        com.pulumi.gcp.networksecurity.SacAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SacAttachmentSymantecOptionsArgs.builder
      builder.symantecOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.SacRealmArgs.Builder)
    /**
     * @param symantecOptions Configuration required for Symantec realms.
     * Structure is documented below.
     * @return builder
     */
    inline def symantecOptions(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SacRealmSymantecOptionsArgs.Builder]):
        com.pulumi.gcp.networksecurity.SacRealmArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SacRealmSymantecOptionsArgs.builder
      builder.symantecOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.SecurityProfileArgs.Builder)
    /**
     * @param customInterceptProfile The configuration for defining the Intercept Endpoint Group used to
     * intercept traffic to third-party firewall appliances.
     * Structure is documented below.
     * @return builder
     */
    inline def customInterceptProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomInterceptProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.SecurityProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomInterceptProfileArgs.builder
      builder.customInterceptProfile(args(argsBuilder).build)

    /**
     * @param customMirroringProfile The configuration for defining the Mirroring Endpoint Group used to
     * mirror traffic to third-party collectors.
     * Structure is documented below.
     * @return builder
     */
    inline def customMirroringProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomMirroringProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.SecurityProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomMirroringProfileArgs.builder
      builder.customMirroringProfile(args(argsBuilder).build)

    /**
     * @param threatPreventionProfile The threat prevention configuration for the security profile.
     * Structure is documented below.
     * @return builder
     */
    inline def threatPreventionProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.SecurityProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.builder
      builder.threatPreventionProfile(args(argsBuilder).build)

    /**
     * @param urlFilteringProfile The url filtering configuration for the security profile.
     * Structure is documented below.
     * @return builder
     */
    inline def urlFilteringProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.SecurityProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileArgs.builder
      builder.urlFilteringProfile(args(argsBuilder).build)

    /**
     * @param wildfireAnalysisProfile (Optional, Beta)
     * The wildfire analysis configuration for the security profile.
     * Structure is documented below.
     * @return builder
     */
    inline def wildfireAnalysisProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.SecurityProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileArgs.builder
      builder.wildfireAnalysisProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.ServerTlsPolicyArgs.Builder)
    /**
     * @param mtlsPolicy This field is required if the policy is used with external HTTPS load balancers. This field can be empty for Traffic Director.
     * Defines a mechanism to provision peer validation certificates for peer to peer authentication (Mutual TLS - mTLS). If not specified, client certificate will not be requested. The connection is treated as TLS and not mTLS. If allowOpen and mtlsPolicy are set, server allows both plain text and mTLS connections.
     * Structure is documented below.
     * @return builder
     */
    inline def mtlsPolicy(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyArgs.Builder]):
        com.pulumi.gcp.networksecurity.ServerTlsPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyArgs.builder
      builder.mtlsPolicy(args(argsBuilder).build)

    /**
     * @param serverCertificate Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     * Structure is documented below.
     * @return builder
     */
    inline def serverCertificate(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.Builder]):
        com.pulumi.gcp.networksecurity.ServerTlsPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.builder
      builder.serverCertificate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.UllMirroringCollectorRuleArgs.Builder)
    /**
     * @param match Match defines what traffic to mirror.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.UllMirroringCollectorRuleMatchArgs.Builder]):
        com.pulumi.gcp.networksecurity.UllMirroringCollectorRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.UllMirroringCollectorRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AddressGroupIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AddressGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AddressGroupIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AddressGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AddressGroupIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AddressGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AddressGroupIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AddressGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.Builder)
    /**
     * @param destinations List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers.
     * If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the destination.
     * Structure is documented below.
     * @return builder
     */
    inline def destinations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleDestinationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param sources List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ipBlocks match.
     * If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the source.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleSourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleDestinationArgs.Builder)
    /**
     * @param httpHeaderMatch Match against key:value pair in http header. Provides a flexible match based on HTTP headers, for potentially advanced use cases. At least one header should match.
     * Avoid using header matches to make authorization decisions unless there is a strong guarantee that requests arrive through a trusted client or proxy.
     * Structure is documented below.
     * @return builder
     */
    inline def httpHeaderMatch(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleDestinationHttpHeaderMatchArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleDestinationHttpHeaderMatchArgs.builder
      builder.httpHeaderMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyState.Builder)
    /**
     * @param rules List of rules to match. Note that at least one of the rules must match in order for the action specified in the &#39;action&#39; field to be taken.
     * A rule is a match if there is a matching source and destination. If left blank, the action specified in the action field will be applied on every request.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.Builder)
    /**
     * @param authzExtension Delegate authorization decision to user authored Service Extension. Only one of cloudIap or authzExtension can be specified.
     * Structure is documented below.
     * @return builder
     */
    inline def authzExtension(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderAuthzExtensionArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderAuthzExtensionArgs.builder
      builder.authzExtension(args(argsBuilder).build)

    /**
     * @param cloudIap Delegates authorization decisions to Cloud IAP. Applicable only for managed load balancers. Enabling Cloud IAP at the AuthzPolicy level is not compatible with Cloud IAP settings in the BackendService. Enabling IAP in both places will result in request failure. Ensure that IAP is enabled in either the AuthzPolicy or the BackendService but not in both places.
     * Structure is documented below.
     * @return builder
     */
    inline def cloudIap(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderCloudIapArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderCloudIapArgs.builder
      builder.cloudIap(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.Builder)
    /**
     * @param from Describes properties of one or more sources of a request.
     * Structure is documented below.
     * @return builder
     */
    inline def from(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromArgs.builder
      builder.from(args(argsBuilder).build)

    /**
     * @param to Describes properties of one or more targets of a request
     * Structure is documented below.
     * @return builder
     */
    inline def to(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToArgs.builder
      builder.to(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromArgs.Builder)
    /**
     * @param notSources Describes the negated properties of request sources. Matches requests from sources that do not match the criteria specified in this field. At least one of sources or notSources must be specified. Limited to 1 not_source.
     * Structure is documented below.
     * @return builder
     */
    inline def notSources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceArgs.builder
      builder.notSources(args.map(_(argsBuilder).build)*)

    /**
     * @param sources Describes the properties of a request&#39;s sources. At least one of sources or notSources must be specified. Limited to 1 source. A match occurs when ANY source (in sources or notSources) matches the request. Within a single source, the match follows AND semantics across fields and OR semantics within a single field, i.e. a match occurs when ANY principal matches AND ANY ipBlocks match.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceArgs.Builder)
    /**
     * @param ipBlocks A list of IP addresses or IP address ranges to match against the source IP address of the request. Limited to 10 ipBlocks per Authorization Policy
     * Structure is documented below.
     * @return builder
     */
    inline def ipBlocks(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceIpBlockArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceIpBlockArgs.builder
      builder.ipBlocks(args.map(_(argsBuilder).build)*)

    /**
     * @param principals A list of identities derived from the client&#39;s certificate. This field will not match on a request unless mutual TLS is enabled for the Forwarding rule or Gateway. Each identity is a string whose value is matched against the URI SAN, or DNS SAN or the subject field in the client&#39;s certificate. The match can be exact, prefix, suffix or a substring match. One of exact, prefix, suffix or contains must be specified.
     * Limited to 5 principals.
     * Structure is documented below.
     * @return builder
     */
    inline def principals(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourcePrincipalArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourcePrincipalArgs.builder
      builder.principals(args.map(_(argsBuilder).build)*)

    /**
     * @param resources A list of resources to match against the resource of the source VM of a request.
     * Limited to 5 resources.
     * Structure is documented below.
     * @return builder
     */
    inline def resources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourcePrincipalArgs.Builder)
    /**
     * @param principal Required. A non-empty string whose value is matched against the principal value based on the principalSelector.
     * Only exact match can be applied for CLIENT_CERT_URI_SAN, CLIENT_CERT_DNS_NAME_SAN, CLIENT_CERT_COMMON_NAME selectors.
     * Structure is documented below.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourcePrincipalPrincipalArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourcePrincipalArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourcePrincipalPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceArgs.Builder)
    /**
     * @param iamServiceAccount An IAM service account to match against the source service account of the VM sending the request.
     * Structure is documented below.
     * @return builder
     */
    inline def iamServiceAccount(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceIamServiceAccountArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceIamServiceAccountArgs.builder
      builder.iamServiceAccount(args(argsBuilder).build)

    /**
     * @param tagValueIdSet A list of resource tag value permanent IDs to match against the resource manager tags value associated with the source VM of a request.
     * Structure is documented below.
     * @return builder
     */
    inline def tagValueIdSet(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceTagValueIdSetArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceTagValueIdSetArgs.builder
      builder.tagValueIdSet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceArgs.Builder)
    /**
     * @param ipBlocks A list of IP addresses or IP address ranges to match against the source IP address of the request. Limited to 10 ipBlocks per Authorization Policy
     * Structure is documented below.
     * @return builder
     */
    inline def ipBlocks(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceIpBlockArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceIpBlockArgs.builder
      builder.ipBlocks(args.map(_(argsBuilder).build)*)

    /**
     * @param principals A list of identities derived from the client&#39;s certificate. This field will not match on a request unless mutual TLS is enabled for the Forwarding rule or Gateway. Each identity is a string whose value is matched against the URI SAN, or DNS SAN or the subject field in the client&#39;s certificate. The match can be exact, prefix, suffix or a substring match. One of exact, prefix, suffix or contains must be specified.
     * Limited to 5 principals.
     * Structure is documented below.
     * @return builder
     */
    inline def principals(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourcePrincipalArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourcePrincipalArgs.builder
      builder.principals(args.map(_(argsBuilder).build)*)

    /**
     * @param resources A list of resources to match against the resource of the source VM of a request.
     * Limited to 5 resources.
     * Structure is documented below.
     * @return builder
     */
    inline def resources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourcePrincipalArgs.Builder)
    /**
     * @param principal Required. A non-empty string whose value is matched against the principal value based on the principalSelector.
     * Only exact match can be applied for CLIENT_CERT_URI_SAN, CLIENT_CERT_DNS_NAME_SAN, CLIENT_CERT_COMMON_NAME selectors.
     * Structure is documented below.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourcePrincipalPrincipalArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourcePrincipalArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourcePrincipalPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceArgs.Builder)
    /**
     * @param iamServiceAccount An IAM service account to match against the source service account of the VM sending the request.
     * Structure is documented below.
     * @return builder
     */
    inline def iamServiceAccount(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceIamServiceAccountArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceIamServiceAccountArgs.builder
      builder.iamServiceAccount(args(argsBuilder).build)

    /**
     * @param tagValueIdSet A list of resource tag value permanent IDs to match against the resource manager tags value associated with the source VM of a request.
     * Structure is documented below.
     * @return builder
     */
    inline def tagValueIdSet(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceTagValueIdSetArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceTagValueIdSetArgs.builder
      builder.tagValueIdSet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToArgs.Builder)
    /**
     * @param notOperations Describes properties of one or more targets of a request. At least one of operations or notOperations must be specified. Limited to 1 operation.
     * Structure is documented below.
     * @return builder
     */
    inline def notOperations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationArgs.builder
      builder.notOperations(args.map(_(argsBuilder).build)*)

    /**
     * @param operations Describes properties of one or more targets of a request. At least one of operations or notOperations must be specified. Limited to 1 operation.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationArgs.Builder)
    /**
     * @param headerSet A list of headers to match against in http header.
     * Structure is documented below.
     * @return builder
     */
    inline def headerSet(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetArgs.builder
      builder.headerSet(args(argsBuilder).build)

    /**
     * @param hosts A list of HTTP Hosts to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
     * Limited to 10 matches.
     * Structure is documented below.
     * @return builder
     */
    inline def hosts(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHostArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHostArgs.builder
      builder.hosts(args.map(_(argsBuilder).build)*)

    /**
     * @param paths A list of paths to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
     * Limited to 10 matches.
     * Note that this path match includes the query parameters. For gRPC services, this should be a fully-qualified name of the form /package.service/method.
     * Structure is documented below.
     * @return builder
     */
    inline def paths(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationPathArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationPathArgs.builder
      builder.paths(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetArgs.Builder)
    /**
     * @param headers A list of headers to match against in http header. The match can be one of exact, prefix, suffix, or contains (substring match). The match follows AND semantics which means all the headers must match. Matches are always case sensitive unless the ignoreCase is set. Limited to 10 matches.
     * Structure is documented below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs.Builder)
    /**
     * @param value Specifies how the header match will be performed.
     * Structure is documented below.
     * @return builder
     */
    inline def value(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderValueArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.Builder)
    /**
     * @param headerSet A list of headers to match against in http header.
     * Structure is documented below.
     * @return builder
     */
    inline def headerSet(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetArgs.builder
      builder.headerSet(args(argsBuilder).build)

    /**
     * @param hosts A list of HTTP Hosts to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
     * Limited to 10 matches.
     * Structure is documented below.
     * @return builder
     */
    inline def hosts(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHostArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHostArgs.builder
      builder.hosts(args.map(_(argsBuilder).build)*)

    /**
     * @param mcp Defines the MCP protocol attributes to match on. MCP based match is allowed only when the AuthzPolicy points to an AgentGateway.
     * Structure is documented below.
     * @return builder
     */
    inline def mcp(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpArgs.builder
      builder.mcp(args(argsBuilder).build)

    /**
     * @param paths A list of paths to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
     * Limited to 10 matches.
     * Note that this path match includes the query parameters. For gRPC services, this should be a fully-qualified name of the form /package.service/method.
     * Structure is documented below.
     * @return builder
     */
    inline def paths(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationPathArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationPathArgs.builder
      builder.paths(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetArgs.Builder)
    /**
     * @param headers A list of headers to match against in http header. The match can be one of exact, prefix, suffix, or contains (substring match). The match follows AND semantics which means all the headers must match. Matches are always case sensitive unless the ignoreCase is set. Limited to 10 matches.
     * Structure is documented below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetHeaderArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetHeaderArgs.Builder)
    /**
     * @param value Specifies how the header match will be performed.
     * Structure is documented below.
     * @return builder
     */
    inline def value(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetHeaderValueArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetHeaderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetHeaderValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpArgs.Builder)
    /**
     * @param methods Defines a set of MCP methods and associated parameters to match on. It is recommended to use this field to match on tools, prompts and resource accesses while setting the includeBaseProtocolMethods to true to match on all the other MCP protocol methods.
     * Structure is documented below.
     * @return builder
     */
    inline def methods(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpMethodArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpMethodArgs.builder
      builder.methods(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpMethodArgs.Builder)
    /**
     * @param params MCP method parameters to match against.
     * Structure is documented below.
     * @return builder
     */
    inline def params(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpMethodParamArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpMethodArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpMethodParamArgs.builder
      builder.params(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleArgs.Builder)
    /**
     * @param from Describes properties of one or more sources of a request.
     * Structure is documented below.
     * @return builder
     */
    inline def from(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromArgs.builder
      builder.from(args(argsBuilder).build)

    /**
     * @param to Describes properties of one or more targets of a request
     * Structure is documented below.
     * @return builder
     */
    inline def to(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToArgs.builder
      builder.to(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromArgs.Builder)
    /**
     * @param notSources Describes the negated properties of request sources. Matches requests from sources that do not match the criteria specified in this field. At least one of sources or notSources must be specified. Limited to 1 not_source.
     * Structure is documented below.
     * @return builder
     */
    inline def notSources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceArgs.builder
      builder.notSources(args.map(_(argsBuilder).build)*)

    /**
     * @param sources Describes the properties of a request&#39;s sources. At least one of sources or notSources must be specified. Limited to 1 source. A match occurs when ANY source (in sources or notSources) matches the request. Within a single source, the match follows AND semantics across fields and OR semantics within a single field, i.e. a match occurs when ANY principal matches AND ANY ipBlocks match.
     * Structure is documented below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceArgs.Builder)
    /**
     * @param ipBlocks A list of IP addresses or IP address ranges to match against the source IP address of the request. Limited to 10 ipBlocks per Authorization Policy
     * Structure is documented below.
     * @return builder
     */
    inline def ipBlocks(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceIpBlockArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceIpBlockArgs.builder
      builder.ipBlocks(args.map(_(argsBuilder).build)*)

    /**
     * @param principals A list of identities derived from the client&#39;s certificate. This field will not match on a request unless mutual TLS is enabled for the Forwarding rule or Gateway. Each identity is a string whose value is matched against the URI SAN, or DNS SAN or the subject field in the client&#39;s certificate. The match can be exact, prefix, suffix or a substring match. One of exact, prefix, suffix or contains must be specified.
     * Limited to 5 principals.
     * Structure is documented below.
     * @return builder
     */
    inline def principals(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourcePrincipalArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourcePrincipalArgs.builder
      builder.principals(args.map(_(argsBuilder).build)*)

    /**
     * @param resources A list of resources to match against the resource of the source VM of a request.
     * Limited to 5 resources.
     * Structure is documented below.
     * @return builder
     */
    inline def resources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceResourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourcePrincipalArgs.Builder)
    /**
     * @param principal Required. A non-empty string whose value is matched against the principal value based on the principalSelector.
     * Only exact match can be applied for CLIENT_CERT_URI_SAN, CLIENT_CERT_DNS_NAME_SAN, CLIENT_CERT_COMMON_NAME selectors.
     * Structure is documented below.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourcePrincipalPrincipalArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourcePrincipalArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourcePrincipalPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceResourceArgs.Builder)
    /**
     * @param iamServiceAccount An IAM service account to match against the source service account of the VM sending the request.
     * Structure is documented below.
     * @return builder
     */
    inline def iamServiceAccount(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceResourceIamServiceAccountArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceResourceIamServiceAccountArgs.builder
      builder.iamServiceAccount(args(argsBuilder).build)

    /**
     * @param tagValueIdSet A list of resource tag value permanent IDs to match against the resource manager tags value associated with the source VM of a request.
     * Structure is documented below.
     * @return builder
     */
    inline def tagValueIdSet(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceResourceTagValueIdSetArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromNotSourceResourceTagValueIdSetArgs.builder
      builder.tagValueIdSet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceArgs.Builder)
    /**
     * @param ipBlocks A list of IP addresses or IP address ranges to match against the source IP address of the request. Limited to 10 ipBlocks per Authorization Policy
     * Structure is documented below.
     * @return builder
     */
    inline def ipBlocks(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceIpBlockArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceIpBlockArgs.builder
      builder.ipBlocks(args.map(_(argsBuilder).build)*)

    /**
     * @param principals A list of identities derived from the client&#39;s certificate. This field will not match on a request unless mutual TLS is enabled for the Forwarding rule or Gateway. Each identity is a string whose value is matched against the URI SAN, or DNS SAN or the subject field in the client&#39;s certificate. The match can be exact, prefix, suffix or a substring match. One of exact, prefix, suffix or contains must be specified.
     * Limited to 5 principals.
     * Structure is documented below.
     * @return builder
     */
    inline def principals(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourcePrincipalArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourcePrincipalArgs.builder
      builder.principals(args.map(_(argsBuilder).build)*)

    /**
     * @param resources A list of resources to match against the resource of the source VM of a request.
     * Limited to 5 resources.
     * Structure is documented below.
     * @return builder
     */
    inline def resources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceResourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourcePrincipalArgs.Builder)
    /**
     * @param principal Required. A non-empty string whose value is matched against the principal value based on the principalSelector.
     * Only exact match can be applied for CLIENT_CERT_URI_SAN, CLIENT_CERT_DNS_NAME_SAN, CLIENT_CERT_COMMON_NAME selectors.
     * Structure is documented below.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourcePrincipalPrincipalArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourcePrincipalArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourcePrincipalPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceResourceArgs.Builder)
    /**
     * @param iamServiceAccount An IAM service account to match against the source service account of the VM sending the request.
     * Structure is documented below.
     * @return builder
     */
    inline def iamServiceAccount(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceResourceIamServiceAccountArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceResourceIamServiceAccountArgs.builder
      builder.iamServiceAccount(args(argsBuilder).build)

    /**
     * @param tagValueIdSet A list of resource tag value permanent IDs to match against the resource manager tags value associated with the source VM of a request.
     * Structure is documented below.
     * @return builder
     */
    inline def tagValueIdSet(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceResourceTagValueIdSetArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleFromSourceResourceTagValueIdSetArgs.builder
      builder.tagValueIdSet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToArgs.Builder)
    /**
     * @param notOperations Describes properties of one or more targets of a request. At least one of operations or notOperations must be specified. Limited to 1 operation.
     * Structure is documented below.
     * @return builder
     */
    inline def notOperations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToNotOperationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToNotOperationArgs.builder
      builder.notOperations(args.map(_(argsBuilder).build)*)

    /**
     * @param operations Describes properties of one or more targets of a request. At least one of operations or notOperations must be specified. Limited to 1 operation.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToOperationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToNotOperationArgs.Builder)
    /**
     * @param snis Structure is documented below.
     * @return builder
     */
    inline def snis(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToNotOperationSniArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToNotOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToNotOperationSniArgs.builder
      builder.snis(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToOperationArgs.Builder)
    /**
     * @param snis Structure is documented below.
     * @return builder
     */
    inline def snis(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToOperationSniArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleToOperationSniArgs.builder
      builder.snis(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyState.Builder)
    /**
     * @param customProvider Required if the action is CUSTOM. Allows delegating authorization decisions to Cloud IAP or to Service Extensions. One of cloudIap or authzExtension must be specified.
     * Structure is documented below.
     * @return builder
     */
    inline def customProvider(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.builder
      builder.customProvider(args(argsBuilder).build)

    /**
     * @param httpRules A list of authorization HTTP rules to match against the incoming request.A policy match occurs when at least one HTTP rule matches the request or when no HTTP rules are specified in the policy. At least one HTTP Rule is required for Allow or Deny Action.
     * Limited to 5 rules.
     * Structure is documented below.
     * @return builder
     */
    inline def httpRules(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.builder
      builder.httpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param networkRules A list of authorization HTTP rules to match against the incoming request.A policy match occurs when at least one HTTP rule matches the request or when no HTTP rules are specified in the policy. At least one HTTP Rule is required for Allow or Deny Action.
     * Limited to 5 rules.
     * Structure is documented below.
     * @return builder
     */
    inline def networkRules(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyNetworkRuleArgs.builder
      builder.networkRules(args.map(_(argsBuilder).build)*)

    /**
     * @param target Specifies the set of resources to which this policy should be applied to.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyTargetArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.Builder)
    /**
     * @param certificateProviderInstance The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     * Structure is documented below.
     * @return builder
     */
    inline def certificateProviderInstance(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateCertificateProviderInstanceArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateCertificateProviderInstanceArgs.builder
      builder.certificateProviderInstance(args(argsBuilder).build)

    /**
     * @param grpcEndpoint gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcEndpoint(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateGrpcEndpointArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateGrpcEndpointArgs.builder
      builder.grpcEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.Builder)
    /**
     * @param certificateProviderInstance The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     * Structure is documented below.
     * @return builder
     */
    inline def certificateProviderInstance(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaCertificateProviderInstanceArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaCertificateProviderInstanceArgs.builder
      builder.certificateProviderInstance(args(argsBuilder).build)

    /**
     * @param grpcEndpoint gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcEndpoint(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaGrpcEndpointArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaGrpcEndpointArgs.builder
      builder.grpcEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyState.Builder)
    /**
     * @param clientCertificate Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     * Structure is documented below.
     * @return builder
     */
    inline def clientCertificate(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.builder
      builder.clientCertificate(args(argsBuilder).build)

    /**
     * @param serverValidationCas Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def serverValidationCas(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.builder
      builder.serverValidationCas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.FirewallEndpointState.Builder)
    /**
     * @param endpointSettings Settings for the endpoint.
     * Structure is documented below.
     * @return builder
     */
    inline def endpointSettings(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.FirewallEndpointEndpointSettingsArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.FirewallEndpointState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.FirewallEndpointEndpointSettingsArgs.builder
      builder.endpointSettings(args(argsBuilder).build)

    /**
     * @param wildfireSettings (Optional, Beta)
     * Settings for WildFire analysis on the firewall endpoint.
     * Structure is documented below.
     * @return builder
     */
    inline def wildfireSettings(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.FirewallEndpointWildfireSettingsArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.FirewallEndpointState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.FirewallEndpointWildfireSettingsArgs.builder
      builder.wildfireSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.FirewallEndpointWildfireSettingsArgs.Builder)
    /**
     * @param wildfireInlineCloudAnalysisSettings Settings for WildFire inline cloud analysis.
     * Structure is documented below.
     * @return builder
     */
    inline def wildfireInlineCloudAnalysisSettings(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.FirewallEndpointWildfireSettingsWildfireInlineCloudAnalysisSettingsArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.FirewallEndpointWildfireSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.FirewallEndpointWildfireSettingsWildfireInlineCloudAnalysisSettingsArgs.builder
      builder.wildfireInlineCloudAnalysisSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupState.Builder)
    /**
     * @param connectedEndpointGroups The list of endpoint groups that are connected to this resource.
     * Structure is documented below.
     * @return builder
     */
    inline def connectedEndpointGroups(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupConnectedEndpointGroupArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupConnectedEndpointGroupArgs.builder
      builder.connectedEndpointGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param locations The list of locations where the deployment group is present.
     * Structure is documented below.
     * @return builder
     */
    inline def locations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupLocationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationState.Builder)
    /**
     * @param locations The list of locations where the association is configured. This information
     * is retrieved from the linked endpoint group.
     * Structure is documented below.
     * @return builder
     */
    inline def locations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationLocationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

    /**
     * @param locationsDetails (Deprecated)
     * The list of locations where the association is present. This information
     * is retrieved from the linked endpoint group, and not configured as part
     * of the association itself.
     * Structure is documented below.
     * @return builder
     * @deprecated `locationsDetails` is deprecated and will be removed in a future major release. Use `locations` instead.
     */
    @deprecated("`locationsDetails` is deprecated and will be removed in a future major release. Use `locations` instead.") inline def locationsDetails(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationLocationsDetailArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationLocationsDetailArgs.builder
      builder.locationsDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupConnectedDeploymentGroupArgs.Builder)
    /**
     * @param locations (Output)
     * The list of locations where the deployment group is present.
     * Structure is documented below.
     * @return builder
     */
    inline def locations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupConnectedDeploymentGroupLocationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupConnectedDeploymentGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupConnectedDeploymentGroupLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupState.Builder)
    /**
     * @param associations List of associations to this endpoint group.
     * Structure is documented below.
     * @return builder
     */
    inline def associations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationArgs.builder
      builder.associations(args.map(_(argsBuilder).build)*)

    /**
     * @param connectedDeploymentGroups The endpoint group&#39;s view of a connected deployment group.
     * Structure is documented below.
     * @return builder
     */
    inline def connectedDeploymentGroups(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupConnectedDeploymentGroupArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupConnectedDeploymentGroupArgs.builder
      builder.connectedDeploymentGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupState.Builder)
    /**
     * @param connectedEndpointGroups The list of endpoint groups that are connected to this resource.
     * Structure is documented below.
     * @return builder
     */
    inline def connectedEndpointGroups(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupConnectedEndpointGroupArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupConnectedEndpointGroupArgs.builder
      builder.connectedEndpointGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param locations The list of locations where the deployment group is present.
     * Structure is documented below.
     * @return builder
     */
    inline def locations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupLocationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationState.Builder)
    /**
     * @param locations The list of locations where the association is configured. This information
     * is retrieved from the linked endpoint group.
     * Structure is documented below.
     * @return builder
     */
    inline def locations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationLocationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

    /**
     * @param locationsDetails (Deprecated)
     * The list of locations where the association is present. This information
     * is retrieved from the linked endpoint group, and not configured as part
     * of the association itself.
     * Structure is documented below.
     * @return builder
     * @deprecated `locationsDetails` is deprecated and will be removed in a future major release. Use `locations` instead.
     */
    @deprecated("`locationsDetails` is deprecated and will be removed in a future major release. Use `locations` instead.") inline def locationsDetails(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationLocationsDetailArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationLocationsDetailArgs.builder
      builder.locationsDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupConnectedDeploymentGroupArgs.Builder)
    /**
     * @param locations (Output)
     * The list of locations where the deployment group is present.
     * Structure is documented below.
     * @return builder
     */
    inline def locations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupConnectedDeploymentGroupLocationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupConnectedDeploymentGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupConnectedDeploymentGroupLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupState.Builder)
    /**
     * @param associations List of associations to this endpoint group.
     * Structure is documented below.
     * @return builder
     */
    inline def associations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationArgs.builder
      builder.associations(args.map(_(argsBuilder).build)*)

    /**
     * @param connectedDeploymentGroups List of details about the connected deployment groups to this endpoint
     * group.
     * Structure is documented below.
     * @return builder
     */
    inline def connectedDeploymentGroups(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupConnectedDeploymentGroupArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupConnectedDeploymentGroupArgs.builder
      builder.connectedDeploymentGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SacAttachmentState.Builder)
    /**
     * @param symantecOptions Configuration required for Symantec attachments.
     * Structure is documented below.
     * @return builder
     */
    inline def symantecOptions(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SacAttachmentSymantecOptionsArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SacAttachmentState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SacAttachmentSymantecOptionsArgs.builder
      builder.symantecOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SacRealmState.Builder)
    /**
     * @param pairingKeys Key to be shared with SSE service provider during pairing.
     * Structure is documented below.
     * @return builder
     */
    inline def pairingKeys(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SacRealmPairingKeyArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SacRealmState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SacRealmPairingKeyArgs.builder
      builder.pairingKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param symantecOptions Configuration required for Symantec realms.
     * Structure is documented below.
     * @return builder
     */
    inline def symantecOptions(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SacRealmSymantecOptionsArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SacRealmState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SacRealmSymantecOptionsArgs.builder
      builder.symantecOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SecurityProfileState.Builder)
    /**
     * @param customInterceptProfile The configuration for defining the Intercept Endpoint Group used to
     * intercept traffic to third-party firewall appliances.
     * Structure is documented below.
     * @return builder
     */
    inline def customInterceptProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomInterceptProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomInterceptProfileArgs.builder
      builder.customInterceptProfile(args(argsBuilder).build)

    /**
     * @param customMirroringProfile The configuration for defining the Mirroring Endpoint Group used to
     * mirror traffic to third-party collectors.
     * Structure is documented below.
     * @return builder
     */
    inline def customMirroringProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomMirroringProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomMirroringProfileArgs.builder
      builder.customMirroringProfile(args(argsBuilder).build)

    /**
     * @param threatPreventionProfile The threat prevention configuration for the security profile.
     * Structure is documented below.
     * @return builder
     */
    inline def threatPreventionProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.builder
      builder.threatPreventionProfile(args(argsBuilder).build)

    /**
     * @param urlFilteringProfile The url filtering configuration for the security profile.
     * Structure is documented below.
     * @return builder
     */
    inline def urlFilteringProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileArgs.builder
      builder.urlFilteringProfile(args(argsBuilder).build)

    /**
     * @param wildfireAnalysisProfile (Optional, Beta)
     * The wildfire analysis configuration for the security profile.
     * Structure is documented below.
     * @return builder
     */
    inline def wildfireAnalysisProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileArgs.builder
      builder.wildfireAnalysisProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.Builder)
    /**
     * @param antivirusOverrides Defines what action to take for antivirus threats per protocol.
     * Structure is documented below.
     * @return builder
     */
    inline def antivirusOverrides(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileAntivirusOverrideArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileAntivirusOverrideArgs.builder
      builder.antivirusOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param severityOverrides The configuration for overriding threats actions by severity match.
     * Structure is documented below.
     * @return builder
     */
    inline def severityOverrides(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileSeverityOverrideArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileSeverityOverrideArgs.builder
      builder.severityOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param threatOverrides The configuration for overriding threats actions by threat id match.
     * If a threat is matched both by configuration provided in severity overrides
     * and threat overrides, the threat overrides action is applied.
     * Structure is documented below.
     * @return builder
     */
    inline def threatOverrides(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileThreatOverrideArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileThreatOverrideArgs.builder
      builder.threatOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileArgs.Builder)
    /**
     * @param urlFilters The configuration for action to take based on domain name match.
     * A domain name would be checked for matching filters through the list in order of highest to lowest priority,
     * and the first filter that a domain name matches with is the one whose actions gets applied.
     * Structure is documented below.
     * @return builder
     */
    inline def urlFilters(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileUrlFilterArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileUrlFilterArgs.builder
      builder.urlFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileArgs.Builder)
    /**
     * @param wildfireInlineCloudAnalysisRules The configuration for inline cloud analysis of files.
     * Structure is documented below.
     * @return builder
     */
    inline def wildfireInlineCloudAnalysisRules(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineCloudAnalysisRuleArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineCloudAnalysisRuleArgs.builder
      builder.wildfireInlineCloudAnalysisRules(args.map(_(argsBuilder).build)*)

    /**
     * @param wildfireInlineMlOverrides Defines what action to take for WildFire inline ML threats per protocol.
     * Structure is documented below.
     * @return builder
     */
    inline def wildfireInlineMlOverrides(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineMlOverrideArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineMlOverrideArgs.builder
      builder.wildfireInlineMlOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param wildfireInlineMlSetting WildFire inline Machine Learning setting for the Security Profile.
     * Structure is documented below.
     * @return builder
     */
    inline def wildfireInlineMlSetting(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineMlSettingArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineMlSettingArgs.builder
      builder.wildfireInlineMlSetting(args(argsBuilder).build)

    /**
     * @param wildfireOverrides Defines what action to take for WildFire threats per protocol.
     * Structure is documented below.
     * @return builder
     */
    inline def wildfireOverrides(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireOverrideArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireOverrideArgs.builder
      builder.wildfireOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param wildfireSubmissionRules The configuration for file submission to WildFire in cloud.
     * Structure is documented below.
     * @return builder
     */
    inline def wildfireSubmissionRules(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireSubmissionRuleArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireSubmissionRuleArgs.builder
      builder.wildfireSubmissionRules(args.map(_(argsBuilder).build)*)

    /**
     * @param wildfireThreatOverrides The configuration for overriding threats actions by threat id match.
     * Structure is documented below.
     * @return builder
     */
    inline def wildfireThreatOverrides(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireThreatOverrideArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireThreatOverrideArgs.builder
      builder.wildfireThreatOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineCloudAnalysisRuleArgs.Builder)
    /**
     * @param customFileTypes Defines the custom file types to match for a rule. The API will only accept this if `fileSelectionMode` is set to `CUSTOM_FILE_TYPES`
     * Structure is documented below.
     * @return builder
     */
    inline def customFileTypes(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineCloudAnalysisRuleCustomFileTypesArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineCloudAnalysisRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineCloudAnalysisRuleCustomFileTypesArgs.builder
      builder.customFileTypes(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineMlSettingArgs.Builder)
    /**
     * @param fileExceptions File exceptions to exclude from WildFire inline ML.
     * Structure is documented below.
     * @return builder
     */
    inline def fileExceptions(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineMlSettingFileExceptionArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineMlSettingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineMlSettingFileExceptionArgs.builder
      builder.fileExceptions(args.map(_(argsBuilder).build)*)

    /**
     * @param inlineMlConfigs Defines what action to take for a specific file type in WildFire inline ML.
     * Structure is documented below.
     * @return builder
     */
    inline def inlineMlConfigs(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineMlSettingInlineMlConfigArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineMlSettingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireInlineMlSettingInlineMlConfigArgs.builder
      builder.inlineMlConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireSubmissionRuleArgs.Builder)
    /**
     * @param customFileTypes Defines the custom file types to match for a rule. The API will only accept this if `fileSelectionMode` is set to `CUSTOM_FILE_TYPES`
     * Structure is documented below.
     * @return builder
     */
    inline def customFileTypes(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireSubmissionRuleCustomFileTypesArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireSubmissionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileWildfireAnalysisProfileWildfireSubmissionRuleCustomFileTypesArgs.builder
      builder.customFileTypes(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyArgs.Builder)
    /**
     * @param clientValidationCas Required if the policy is to be used with Traffic Director. For external HTTPS load balancers it must be empty.
     * Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def clientValidationCas(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaArgs.builder
      builder.clientValidationCas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaArgs.Builder)
    /**
     * @param certificateProviderInstance Optional if policy is to be used with Traffic Director. For external HTTPS load balancer must be empty.
     * Defines a mechanism to provision server identity (public and private keys). Cannot be combined with allowOpen as a permissive mode that allows both plain text and TLS is not supported.
     * Structure is documented below.
     * @return builder
     */
    inline def certificateProviderInstance(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaCertificateProviderInstanceArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaCertificateProviderInstanceArgs.builder
      builder.certificateProviderInstance(args(argsBuilder).build)

    /**
     * @param grpcEndpoint gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcEndpoint(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaGrpcEndpointArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaGrpcEndpointArgs.builder
      builder.grpcEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.Builder)
    /**
     * @param certificateProviderInstance Optional if policy is to be used with Traffic Director. For external HTTPS load balancer must be empty.
     * Defines a mechanism to provision server identity (public and private keys). Cannot be combined with allowOpen as a permissive mode that allows both plain text and TLS is not supported.
     * Structure is documented below.
     * @return builder
     */
    inline def certificateProviderInstance(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateCertificateProviderInstanceArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateCertificateProviderInstanceArgs.builder
      builder.certificateProviderInstance(args(argsBuilder).build)

    /**
     * @param grpcEndpoint gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcEndpoint(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateGrpcEndpointArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateGrpcEndpointArgs.builder
      builder.grpcEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyState.Builder)
    /**
     * @param mtlsPolicy This field is required if the policy is used with external HTTPS load balancers. This field can be empty for Traffic Director.
     * Defines a mechanism to provision peer validation certificates for peer to peer authentication (Mutual TLS - mTLS). If not specified, client certificate will not be requested. The connection is treated as TLS and not mTLS. If allowOpen and mtlsPolicy are set, server allows both plain text and mTLS connections.
     * Structure is documented below.
     * @return builder
     */
    inline def mtlsPolicy(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyArgs.builder
      builder.mtlsPolicy(args(argsBuilder).build)

    /**
     * @param serverCertificate Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     * Structure is documented below.
     * @return builder
     */
    inline def serverCertificate(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.builder
      builder.serverCertificate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.UllMirroringCollectorRuleState.Builder)
    /**
     * @param match Match defines what traffic to mirror.
     * Structure is documented below.
     * @return builder
     */
    inline def `match`(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.UllMirroringCollectorRuleMatchArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.UllMirroringCollectorRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.UllMirroringCollectorRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)
