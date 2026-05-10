package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object networksecurity:
  /**
   * The GatewaySecurityPolicy resource contains a collection of GatewaySecurityPolicyRules and associated metadata.
   * 
   *  To get more information about GatewaySecurityPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/secure-web-proxy/docs/reference/network-security/rest/v1/projects.locations.gatewaySecurityPolicies)
   */
  def GatewaySecurityPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.GatewaySecurityPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.GatewaySecurityPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.GatewaySecurityPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Network Security ProjectAddressGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.networksecurity.AddressGroupIamPolicy`: Authoritative. Sets the IAM policy for the projectaddressgroup and replaces any existing policy already attached.
   *  * `gcp.networksecurity.AddressGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the projectaddressgroup are preserved.
   *  * `gcp.networksecurity.AddressGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the projectaddressgroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.networksecurity.AddressGroupIamPolicy`: Retrieves the IAM policy for the projectaddressgroup
   * 
   *  &gt; **Note:** `gcp.networksecurity.AddressGroupIamPolicy` **cannot** be used in conjunction with `gcp.networksecurity.AddressGroupIamBinding` and `gcp.networksecurity.AddressGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.networksecurity.AddressGroupIamBinding` resources **can be** used in conjunction with `gcp.networksecurity.AddressGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.networksecurity.AddressGroupIamPolicy
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/locations/{{location}}/addressGroups/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Network Security projectaddressgroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_network_security_address_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}} roles/compute.networkAdmin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_network_security_address_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}} roles/compute.networkAdmin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:networksecurity/addressGroupIamBinding:AddressGroupIamBinding editor projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AddressGroupIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.AddressGroupIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.AddressGroupIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.AddressGroupIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type NetworksecurityFunctions = com.pulumi.gcp.networksecurity.NetworksecurityFunctions
  object NetworksecurityFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.networksecurity.NetworksecurityFunctions.*
  extension (self: NetworksecurityFunctions.type)
    /** Retrieves the current IAM policy data for projectaddressgroup */
    def getAddressGroupIamPolicy(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.GetAddressGroupIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.networksecurity.outputs.GetAddressGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.GetAddressGroupIamPolicyArgs.builder
      com.pulumi.gcp.networksecurity.NetworksecurityFunctions.getAddressGroupIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for projectaddressgroup */
    def getAddressGroupIamPolicyPlain(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.GetAddressGroupIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.networksecurity.outputs.GetAddressGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.GetAddressGroupIamPolicyPlainArgs.builder
      com.pulumi.gcp.networksecurity.NetworksecurityFunctions.getAddressGroupIamPolicyPlain(args(argsBuilder).build)

    /**
     * AddressGroups are used to group IP addresses together for use in firewall policies. This data source allows you to list address groups in a project or organization and location.
     * 
     *  To get more information about Address Groups, see:
     * 
     *  * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/networkFirewallPolicies)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/firewall/docs/about-address-groups)
     */
    def getAddressGroups(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.GetAddressGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.networksecurity.outputs.GetAddressGroupsResult] =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.GetAddressGroupsArgs.builder
      com.pulumi.gcp.networksecurity.NetworksecurityFunctions.getAddressGroups(args(argsBuilder).build)

    /**
     * AddressGroups are used to group IP addresses together for use in firewall policies. This data source allows you to list address groups in a project or organization and location.
     * 
     *  To get more information about Address Groups, see:
     * 
     *  * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/networkFirewallPolicies)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/firewall/docs/about-address-groups)
     */
    def getAddressGroupsPlain(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.GetAddressGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.networksecurity.outputs.GetAddressGroupsResult] =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.GetAddressGroupsPlainArgs.builder
      com.pulumi.gcp.networksecurity.NetworksecurityFunctions.getAddressGroupsPlain(args(argsBuilder).build)

  /**
   * A deployment represents a zonal intercept backend ready to accept
   *  GENEVE-encapsulated traffic, e.g. a zonal instance group fronted by an
   *  internal passthrough load balancer. Deployments are always part of a
   *  global deployment group which represents a global intercept service.
   */
  def InterceptDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.InterceptDeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networksecurity.InterceptDeploymentArgs.builder
    com.pulumi.gcp.networksecurity.InterceptDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networksecurity.SacRealmArgs.Builder)
    /**
     * @param symantecOptions Configuration required for Symantec realms.
     *  Structure is documented below.
     * @return builder
     */
    def symantecOptions(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SacRealmSymantecOptionsArgs.Builder]):
        com.pulumi.gcp.networksecurity.SacRealmArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SacRealmSymantecOptionsArgs.builder
      builder.symantecOptions(args(argsBuilder).build)

  /**
   * ClientTlsPolicy is a resource that specifies how a client should authenticate connections to backends of a service. This resource itself does not affect configuration unless it is attached to a backend service resource.
   * 
   *  To get more information about ClientTlsPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-security/rest/v1beta1/projects.locations.clientTlsPolicies)
   *  * How-to Guides
   *      * [Service Security](https://cloud.google.com/traffic-director/docs/security-use-cases)
   */
  def ClientTlsPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.ClientTlsPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.ClientTlsPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.ClientTlsPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Mirroring Engine is a logical representation of the underlying infrastructure
   *  that is used to manage and monitor the ULL Mirroring setup.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def UllMirroringEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.UllMirroringEngineArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networksecurity.UllMirroringEngineArgs.builder
    com.pulumi.gcp.networksecurity.UllMirroringEngine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An endpoint group association represents a link between a network and an
   *  endpoint group in the organization.
   * 
   *  Creating an association creates the networking infrastructure linking the
   *  network to the endpoint group, but does not enable mirroring by itself.
   *  To enable mirroring, the user must also create a network firewall policy
   *  containing mirroring rules and associate it with the network.
   * 
   *  To get more information about MirroringEndpointGroupAssociation, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-security-integration/docs/reference/rest/v1/projects.locations.mirroringEndpointGroupAssociations)
   *  * How-to Guides
   *      * [Mirroring endpoint group association overview](https://cloud.google.com/network-security-integration/docs/out-of-band/endpoint-groups-overview#mirroring-endpoint-group-association)
   */
  def MirroringEndpointGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.MirroringEndpointGroupAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networksecurity.MirroringEndpointGroupAssociationArgs.builder
    com.pulumi.gcp.networksecurity.MirroringEndpointGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Secure Access Connect Realm resource
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about SacRealm, see:
   * 
   *  * [API documentation](https://cloud.google.com/secure-access-connect/docs/reference/network-security/rest/v1beta1/projects.locations.sacRealms)
   *  * How-to Guides
   *      * [QUICKSTART_TITLE](https://cloud.google.com/secure-access-connect/docs/overview)
   */
  def SacRealm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.SacRealmArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.SacRealmArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.SacRealm(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networksecurity.UllMirroringCollectorRuleArgs.Builder)
    /**
     * @param match Match defines what traffic to mirror.
     *  Structure is documented below.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.UllMirroringCollectorRuleMatchArgs.Builder]):
        com.pulumi.gcp.networksecurity.UllMirroringCollectorRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.UllMirroringCollectorRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.ServerTlsPolicyArgs.Builder)
    /**
     * @param mtlsPolicy This field is required if the policy is used with external HTTPS load balancers. This field can be empty for Traffic Director.
     *  Defines a mechanism to provision peer validation certificates for peer to peer authentication (Mutual TLS - mTLS). If not specified, client certificate will not be requested. The connection is treated as TLS and not mTLS. If allowOpen and mtlsPolicy are set, server allows both plain text and mTLS connections.
     *  Structure is documented below.
     * @return builder
     */
    def mtlsPolicy(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyArgs.Builder]):
        com.pulumi.gcp.networksecurity.ServerTlsPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyArgs.builder
      builder.mtlsPolicy(args(argsBuilder).build)

    /**
     * @param serverCertificate Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     *  Structure is documented below.
     * @return builder
     */
    def serverCertificate(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.Builder]):
        com.pulumi.gcp.networksecurity.ServerTlsPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.builder
      builder.serverCertificate(args(argsBuilder).build)

  /**
   * UrlList proto helps users to set reusable, independently manageable lists of hosts, host patterns, URLs, URL patterns.
   * 
   *  To get more information about UrlLists, see:
   * 
   *  * [API documentation](https://cloud.google.com/secure-web-proxy/docs/reference/network-security/rest/v1/projects.locations.urlLists)
   *  * How-to Guides
   *      * Use UrlLists
   */
  def UrlList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.UrlListArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.UrlListArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.UrlList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A deployment group aggregates many zonal intercept backends (deployments)
   *  into a single global intercept service. Consumers can connect this service
   *  using an endpoint group.
   */
  def InterceptDeploymentGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.InterceptDeploymentGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networksecurity.InterceptDeploymentGroupArgs.builder
    com.pulumi.gcp.networksecurity.InterceptDeploymentGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networksecurity.ClientTlsPolicyArgs.Builder)
    /**
     * @param clientCertificate Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     *  Structure is documented below.
     * @return builder
     */
    def clientCertificate(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.Builder]):
        com.pulumi.gcp.networksecurity.ClientTlsPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.builder
      builder.clientCertificate(args(argsBuilder).build)

    /**
     * @param serverValidationCas Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
     *  Structure is documented below.
     * @return builder
     */
    def serverValidationCas(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.Builder]*):
        com.pulumi.gcp.networksecurity.ClientTlsPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.builder
      builder.serverValidationCas(args.map(_(argsBuilder).build)*)

  /**
   * DNS Armor is a fully-managed service that provides DNS-layer security for your Google Cloud workloads.
   * 
   *  To get more information about DnsThreatDetector, see:
   * 
   *  * [API documentation](https://cloud.google.com/dns/docs/create-threat-detector)
   *  * How-to Guides
   *      * [DNS Threat Detector](https://cloud.google.com/dns/docs/threat-detection)
   */
  def DnsThreatDetector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.DnsThreatDetectorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.DnsThreatDetectorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.DnsThreatDetector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networksecurity.AddressGroupIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AddressGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.networksecurity.AddressGroupIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AddressGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * AuthorizationPolicy is a resource that specifies how a server should authorize incoming connections. This resource in itself does not change the configuration unless it&#39;s attached to a target https proxy or endpoint config selector resource.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about AuthorizationPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-security/rest/v1beta1/projects.locations.authorizationPolicies)
   */
  def AuthorizationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.AuthorizationPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.AuthorizationPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.AuthorizationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networksecurity.FirewallEndpointArgs.Builder)
    /**
     * @param endpointSettings Settings for the endpoint.
     *  Structure is documented below.
     * @return builder
     */
    def endpointSettings(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.FirewallEndpointEndpointSettingsArgs.Builder]):
        com.pulumi.gcp.networksecurity.FirewallEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.FirewallEndpointEndpointSettingsArgs.builder
      builder.endpointSettings(args(argsBuilder).build)

  /**
   * A Mirroring Collector is a logical representation of an appliance that collects
   *  mirrored traffic.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def UllMirroringCollector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.UllMirroringCollectorArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networksecurity.UllMirroringCollectorArgs.builder
    com.pulumi.gcp.networksecurity.UllMirroringCollector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networksecurity.AuthorizationPolicyArgs.Builder)
    /**
     * @param rules List of rules to match. Note that at least one of the rules must match in order for the action specified in the &#39;action&#39; field to be taken.
     *  A rule is a match if there is a matching source and destination. If left blank, the action specified in the action field will be applied on every request.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.networksecurity.AuthorizationPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.SacAttachmentArgs.Builder)
    /**
     * @param symantecOptions Configuration required for Symantec attachments.
     *  Structure is documented below.
     * @return builder
     */
    def symantecOptions(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SacAttachmentSymantecOptionsArgs.Builder]):
        com.pulumi.gcp.networksecurity.SacAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SacAttachmentSymantecOptionsArgs.builder
      builder.symantecOptions(args(argsBuilder).build)

  /**
   * ServerTlsPolicy is a resource that specifies how a server should authenticate incoming requests. This resource itself does not affect configuration unless it is attached to a target HTTPS proxy or endpoint config selector resource.
   * 
   *  To get more information about ServerTlsPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-security/rest/v1beta1/projects.locations.serverTlsPolicies)
   *  * How-to Guides
   *      * [Use ServerTlsPolicy](https://cloud.google.com/load-balancing/docs/mtls)
   */
  def ServerTlsPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.ServerTlsPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.ServerTlsPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.ServerTlsPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A deployment represents a zonal mirroring backend ready to accept
   *  GENEVE-encapsulated replica traffic, e.g. a zonal instance group fronted by
   *  an internal passthrough load balancer. Deployments are always part of a
   *  global deployment group which represents a global mirroring service.
   * 
   *  To get more information about MirroringDeployment, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-security-integration/docs/reference/rest/v1/projects.locations.mirroringDeployments)
   *  * How-to Guides
   *      * [Mirroring deployment overview](https://cloud.google.com/network-security-integration/docs/out-of-band/deployments-overview)
   */
  def MirroringDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.MirroringDeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networksecurity.MirroringDeploymentArgs.builder
    com.pulumi.gcp.networksecurity.MirroringDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * AddressGroup is a resource that specifies how a collection of IP/DNS used in Firewall Policy.
   * 
   *  To get more information about AddressGroup, see:
   * 
   *  * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-security/rest/v1beta1/organizations.locations.addressGroups)
   *  * How-to Guides
   *      * [Use AddressGroups](https://cloud.google.com/vpc/docs/use-address-groups-firewall-policies)
   */
  def AddressGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.AddressGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.AddressGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.AddressGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Network Security ProjectAddressGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.networksecurity.AddressGroupIamPolicy`: Authoritative. Sets the IAM policy for the projectaddressgroup and replaces any existing policy already attached.
   *  * `gcp.networksecurity.AddressGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the projectaddressgroup are preserved.
   *  * `gcp.networksecurity.AddressGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the projectaddressgroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.networksecurity.AddressGroupIamPolicy`: Retrieves the IAM policy for the projectaddressgroup
   * 
   *  &gt; **Note:** `gcp.networksecurity.AddressGroupIamPolicy` **cannot** be used in conjunction with `gcp.networksecurity.AddressGroupIamBinding` and `gcp.networksecurity.AddressGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.networksecurity.AddressGroupIamBinding` resources **can be** used in conjunction with `gcp.networksecurity.AddressGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.networksecurity.AddressGroupIamPolicy
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/locations/{{location}}/addressGroups/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Network Security projectaddressgroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_network_security_address_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}} roles/compute.networkAdmin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_network_security_address_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}} roles/compute.networkAdmin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:networksecurity/addressGroupIamMember:AddressGroupIamMember editor projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AddressGroupIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.AddressGroupIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.AddressGroupIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.AddressGroupIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * AuthzPolicy is a resource that allows to forward traffic to a callout backend designed to scan the traffic for security purposes.
   * 
   *  To get more information about AuthzPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/load-balancing/docs/reference/network-security/rest/v1beta1/projects.locations.authzPolicies)
   */
  def AuthzPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.AuthzPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.AuthzPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.AuthzPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Firewall endpoint is a Cloud Firewall resource that enables
   *  layer 7 advanced protection capabilities, such as intrusion prevention,
   *  in your network.
   * 
   *  To get more information about FirewallEndpoint, see:
   * 
   *  * [API documentation](https://cloud.google.com/firewall/docs/reference/network-security/rest/v1/organizations.locations.firewallEndpoints)
   *  * How-to Guides
   *      * [Create and associate firewall endpoints](https://cloud.google.com/firewall/docs/configure-firewall-endpoints)
   *      * [Firewall endpoint overview](https://cloud.google.com/firewall/docs/about-firewall-endpoints)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   *  you must specify a `billingProjectId` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the ACM API will return a 403 error.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProjectId` you defined.
   */
  def FirewallEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.FirewallEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.FirewallEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.FirewallEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networksecurity.SecurityProfileArgs.Builder)
    /**
     * @param customInterceptProfile The configuration for defining the Intercept Endpoint Group used to
     *  intercept traffic to third-party firewall appliances.
     *  Structure is documented below.
     * @return builder
     */
    def customInterceptProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomInterceptProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.SecurityProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomInterceptProfileArgs.builder
      builder.customInterceptProfile(args(argsBuilder).build)

    /**
     * @param customMirroringProfile The configuration for defining the Mirroring Endpoint Group used to
     *  mirror traffic to third-party collectors.
     *  Structure is documented below.
     * @return builder
     */
    def customMirroringProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomMirroringProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.SecurityProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomMirroringProfileArgs.builder
      builder.customMirroringProfile(args(argsBuilder).build)

    /**
     * @param threatPreventionProfile The threat prevention configuration for the security profile.
     *  Structure is documented below.
     * @return builder
     */
    def threatPreventionProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.SecurityProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.builder
      builder.threatPreventionProfile(args(argsBuilder).build)

    /**
     * @param urlFilteringProfile The url filtering configuration for the security profile.
     *  Structure is documented below.
     * @return builder
     */
    def urlFilteringProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.SecurityProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileArgs.builder
      builder.urlFilteringProfile(args(argsBuilder).build)

  /**
   * An endpoint group association represents a link between a network and an
   *  endpoint group in the organization.
   * 
   *  Creating an association creates the networking infrastructure linking the
   *  network to the endpoint group, but does not enable intercept by itself.
   *  To enable intercept, the user must also create a network firewall policy
   *  containing intercept rules and associate it with the network.
   */
  def InterceptEndpointGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.InterceptEndpointGroupAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networksecurity.InterceptEndpointGroupAssociationArgs.builder
    com.pulumi.gcp.networksecurity.InterceptEndpointGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A deployment group aggregates many zonal mirroring backends (deployments)
   *  into a single global mirroring service. Consumers can connect this service
   *  using an endpoint group.
   * 
   *  To get more information about MirroringDeploymentGroup, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-security-integration/docs/reference/rest/v1/projects.locations.mirroringDeploymentGroups)
   *  * How-to Guides
   *      * [Mirroring deployment group overview](https://cloud.google.com/network-security-integration/docs/out-of-band/deployment-groups-overview)
   */
  def MirroringDeploymentGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.MirroringDeploymentGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networksecurity.MirroringDeploymentGroupArgs.builder
    com.pulumi.gcp.networksecurity.MirroringDeploymentGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The GatewaySecurityPolicyRule resource is in a nested collection within a GatewaySecurityPolicy and represents
   *  a traffic matching condition and associated action to perform.
   * 
   *  To get more information about GatewaySecurityPolicyRule, see:
   * 
   *  * [API documentation](https://cloud.google.com/secure-web-proxy/docs/reference/network-security/rest/v1/projects.locations.gatewaySecurityPolicies.rules)
   */
  def GatewaySecurityPolicyRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.GatewaySecurityPolicyRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.GatewaySecurityPolicyRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.GatewaySecurityPolicyRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * BackendAuthenticationConfig groups the TrustConfig together with other settings that control how the load balancer authenticates, and expresses its identity to the backend.
   * 
   *  To get more information about BackendAuthenticationConfig, see:
   *  * How-to Guides
   *      * [Backend mTLS](https://cloud.google.com/load-balancing/docs/backend-authenticated-tls-backend-mtls#backend-authentication-config)
   */
  def BackendAuthenticationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.BackendAuthenticationConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.BackendAuthenticationConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.BackendAuthenticationConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a Secure Access Connect (SAC) attachment resource
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about SacAttachment, see:
   * 
   *  * [API documentation](https://cloud.google.com/secure-access-connect/docs/reference/network-security/rest/v1beta1/projects.locations.sacAttachments)
   *  * How-to Guides
   *      * [QUICKSTART_TITLE](https://cloud.google.com/secure-access-connect/docs/overview)
   */
  def SacAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.SacAttachmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.SacAttachmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.SacAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networksecurity.AddressGroupIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AddressGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.networksecurity.AddressGroupIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AddressGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A security profile defines the behavior associated to a profile type.
   * 
   *  To get more information about SecurityProfile, see:
   * 
   *  * [API documentation](https://cloud.google.com/firewall/docs/reference/network-security/rest/v1/organizations.locations.securityProfiles)
   *  * How-to Guides
   *      * [Create and manage security profiles](https://cloud.google.com/firewall/docs/configure-security-profiles)
   */
  def SecurityProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.SecurityProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.SecurityProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.SecurityProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An endpoint group is a consumer frontend for a deployment group (backend).
   *  In order to configure intercept for a network, consumers must create:
   *  - An association between their network and the endpoint group.
   *  - A security profile that points to the endpoint group.
   *  - A firewall rule that references the security profile (group).
   */
  def InterceptEndpointGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.InterceptEndpointGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networksecurity.InterceptEndpointGroupArgs.builder
    com.pulumi.gcp.networksecurity.InterceptEndpointGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Network Security ProjectAddressGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.networksecurity.AddressGroupIamPolicy`: Authoritative. Sets the IAM policy for the projectaddressgroup and replaces any existing policy already attached.
   *  * `gcp.networksecurity.AddressGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the projectaddressgroup are preserved.
   *  * `gcp.networksecurity.AddressGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the projectaddressgroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.networksecurity.AddressGroupIamPolicy`: Retrieves the IAM policy for the projectaddressgroup
   * 
   *  &gt; **Note:** `gcp.networksecurity.AddressGroupIamPolicy` **cannot** be used in conjunction with `gcp.networksecurity.AddressGroupIamBinding` and `gcp.networksecurity.AddressGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.networksecurity.AddressGroupIamBinding` resources **can be** used in conjunction with `gcp.networksecurity.AddressGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.networksecurity.AddressGroupIamPolicy
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/locations/{{location}}/addressGroups/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Network Security projectaddressgroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_network_security_address_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}} roles/compute.networkAdmin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_network_security_address_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}} roles/compute.networkAdmin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:networksecurity/addressGroupIamPolicy:AddressGroupIamPolicy editor projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AddressGroupIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.AddressGroupIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.AddressGroupIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.AddressGroupIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networksecurity.AuthzPolicyArgs.Builder)
    /**
     * @param customProvider Required if the action is CUSTOM. Allows delegating authorization decisions to Cloud IAP or to Service Extensions. One of cloudIap or authzExtension must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def customProvider(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.Builder]):
        com.pulumi.gcp.networksecurity.AuthzPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.builder
      builder.customProvider(args(argsBuilder).build)

    /**
     * @param httpRules A list of authorization HTTP rules to match against the incoming request.A policy match occurs when at least one HTTP rule matches the request or when no HTTP rules are specified in the policy. At least one HTTP Rule is required for Allow or Deny Action.
     *  Limited to 5 rules.
     *  Structure is documented below.
     * @return builder
     */
    def httpRules(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.Builder]*):
        com.pulumi.gcp.networksecurity.AuthzPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.builder
      builder.httpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param target Specifies the set of resources to which this policy should be applied to.
     *  Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyTargetArgs.Builder]):
        com.pulumi.gcp.networksecurity.AuthzPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyTargetArgs.builder
      builder.target(args(argsBuilder).build)

  /**
   * Firewall endpoint association links a firewall endpoint to a VPC network in
   *  the same zone. After you define this association, Cloud Firewall forwards the
   *  zonal workload traffic in your VPC network that requires layer 7 inspection to
   *  the attached firewall endpoint.
   * 
   *  To get more information about FirewallEndpointAssociation, see:
   * 
   *  * [API documentation](https://cloud.google.com/firewall/docs/reference/network-security/rest/v1/projects.locations.firewallEndpointAssociations#FirewallEndpointAssociation)
   *  * How-to Guides
   *      * [Create and associate firewall endpoints](https://cloud.google.com/firewall/docs/configure-firewall-endpoints)
   *      * [Firewall endpoint overview](https://cloud.google.com/firewall/docs/about-firewall-endpoints)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   *  you must specify a `billingProjectId` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the ACM API will return a 403 error.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProjectId` you defined.
   */
  def FirewallEndpointAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.FirewallEndpointAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.FirewallEndpointAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.FirewallEndpointAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The TlsInspectionPolicy resource contains references to CA pools in Certificate Authority Service and associated metadata.
   * 
   *  To get more information about TlsInspectionPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/secure-web-proxy/docs/reference/network-security/rest/v1/projects.locations.tlsInspectionPolicies)
   *  * How-to Guides
   *      * [Use TlsInspectionPolicy](https://cloud.google.com/secure-web-proxy/docs/tls-inspection-overview)
   */
  def TlsInspectionPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.TlsInspectionPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.TlsInspectionPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.TlsInspectionPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * UllMirroringCollectorRule is a resource that defines what traffic should be mirrored.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def UllMirroringCollectorRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.UllMirroringCollectorRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networksecurity.UllMirroringCollectorRuleArgs.builder
    com.pulumi.gcp.networksecurity.UllMirroringCollectorRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An endpoint is a managed mirroring collector that provides enhanced packet
   *  enrichment capabilities and support for multiple replica destinations.
   *  Endpoints are always part of a global endpoint group which represents a
   *  global &#34;mirroring broker&#34; service.
   */
  def MirroringEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.MirroringEndpointArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networksecurity.MirroringEndpointArgs.builder
    com.pulumi.gcp.networksecurity.MirroringEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An endpoint group is a consumer frontend for a deployment group (backend).
   *  In order to configure mirroring for a network, consumers must create:
   *  - An association between their network and the endpoint group.
   *  - A security profile that points to the endpoint group.
   *  - A mirroring rule that references the security profile (group).
   * 
   *  To get more information about MirroringEndpointGroup, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-security-integration/docs/reference/rest/v1/projects.locations.mirroringEndpointGroups)
   *  * How-to Guides
   *      * [Mirroring endpoint group overview](https://cloud.google.com/network-security-integration/docs/out-of-band/endpoint-groups-overview)
   */
  def MirroringEndpointGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.MirroringEndpointGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networksecurity.MirroringEndpointGroupArgs.builder
    com.pulumi.gcp.networksecurity.MirroringEndpointGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AddressGroupIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AddressGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AddressGroupIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AddressGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SecurityProfileState.Builder)
    /**
     * @param customInterceptProfile The configuration for defining the Intercept Endpoint Group used to
     *  intercept traffic to third-party firewall appliances.
     *  Structure is documented below.
     * @return builder
     */
    def customInterceptProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomInterceptProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomInterceptProfileArgs.builder
      builder.customInterceptProfile(args(argsBuilder).build)

    /**
     * @param customMirroringProfile The configuration for defining the Mirroring Endpoint Group used to
     *  mirror traffic to third-party collectors.
     *  Structure is documented below.
     * @return builder
     */
    def customMirroringProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomMirroringProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileCustomMirroringProfileArgs.builder
      builder.customMirroringProfile(args(argsBuilder).build)

    /**
     * @param threatPreventionProfile The threat prevention configuration for the security profile.
     *  Structure is documented below.
     * @return builder
     */
    def threatPreventionProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.builder
      builder.threatPreventionProfile(args(argsBuilder).build)

    /**
     * @param urlFilteringProfile The url filtering configuration for the security profile.
     *  Structure is documented below.
     * @return builder
     */
    def urlFilteringProfile(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileArgs.builder
      builder.urlFilteringProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupConnectedDeploymentGroupArgs.Builder)
    /**
     * @param locations (Output)
     *  The list of locations where the deployment group is present.
     *  Structure is documented below.
     * @return builder
     */
    def locations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupConnectedDeploymentGroupLocationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupConnectedDeploymentGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupConnectedDeploymentGroupLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupState.Builder)
    /**
     * @param connectedEndpointGroups The list of endpoint groups that are connected to this resource.
     *  Structure is documented below.
     * @return builder
     */
    def connectedEndpointGroups(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupConnectedEndpointGroupArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupConnectedEndpointGroupArgs.builder
      builder.connectedEndpointGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param locations The list of locations where the deployment group is present.
     *  Structure is documented below.
     * @return builder
     */
    def locations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupLocationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptDeploymentGroupLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyState.Builder)
    /**
     * @param clientCertificate Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     *  Structure is documented below.
     * @return builder
     */
    def clientCertificate(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.builder
      builder.clientCertificate(args(argsBuilder).build)

    /**
     * @param serverValidationCas Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
     *  Structure is documented below.
     * @return builder
     */
    def serverValidationCas(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.builder
      builder.serverValidationCas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpArgs.Builder)
    /**
     * @param methods Defines a set of MCP methods and associated parameters to match on. It is recommended to use this field to match on tools, prompts and resource accesses while setting the includeBaseProtocolMethods to true to match on all the other MCP protocol methods.
     *  Structure is documented below.
     * @return builder
     */
    def methods(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpMethodArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpMethodArgs.builder
      builder.methods(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.Builder)
    /**
     * @param destinations List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers.
     *  If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the destination.
     *  Structure is documented below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleDestinationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param sources List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ipBlocks match.
     *  If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the source.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleSourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyState.Builder)
    /**
     * @param mtlsPolicy This field is required if the policy is used with external HTTPS load balancers. This field can be empty for Traffic Director.
     *  Defines a mechanism to provision peer validation certificates for peer to peer authentication (Mutual TLS - mTLS). If not specified, client certificate will not be requested. The connection is treated as TLS and not mTLS. If allowOpen and mtlsPolicy are set, server allows both plain text and mTLS connections.
     *  Structure is documented below.
     * @return builder
     */
    def mtlsPolicy(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyArgs.builder
      builder.mtlsPolicy(args(argsBuilder).build)

    /**
     * @param serverCertificate Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     *  Structure is documented below.
     * @return builder
     */
    def serverCertificate(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.builder
      builder.serverCertificate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceArgs.Builder)
    /**
     * @param iamServiceAccount An IAM service account to match against the source service account of the VM sending the request.
     *  Structure is documented below.
     * @return builder
     */
    def iamServiceAccount(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceIamServiceAccountArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceIamServiceAccountArgs.builder
      builder.iamServiceAccount(args(argsBuilder).build)

    /**
     * @param tagValueIdSet A list of resource tag value permanent IDs to match against the resource manager tags value associated with the source VM of a request.
     *  Structure is documented below.
     * @return builder
     */
    def tagValueIdSet(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceTagValueIdSetArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceTagValueIdSetArgs.builder
      builder.tagValueIdSet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleDestinationArgs.Builder)
    /**
     * @param httpHeaderMatch Match against key:value pair in http header. Provides a flexible match based on HTTP headers, for potentially advanced use cases. At least one header should match.
     *  Avoid using header matches to make authorization decisions unless there is a strong guarantee that requests arrive through a trusted client or proxy.
     *  Structure is documented below.
     * @return builder
     */
    def httpHeaderMatch(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleDestinationHttpHeaderMatchArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleDestinationHttpHeaderMatchArgs.builder
      builder.httpHeaderMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceArgs.Builder)
    /**
     * @param iamServiceAccount An IAM service account to match against the source service account of the VM sending the request.
     *  Structure is documented below.
     * @return builder
     */
    def iamServiceAccount(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceIamServiceAccountArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceIamServiceAccountArgs.builder
      builder.iamServiceAccount(args(argsBuilder).build)

    /**
     * @param tagValueIdSet A list of resource tag value permanent IDs to match against the resource manager tags value associated with the source VM of a request.
     *  Structure is documented below.
     * @return builder
     */
    def tagValueIdSet(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceTagValueIdSetArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceTagValueIdSetArgs.builder
      builder.tagValueIdSet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileArgs.Builder)
    /**
     * @param urlFilters The configuration for action to take based on domain name match.
     *  A domain name would be checked for matching filters through the list in order of highest to lowest priority,
     *  and the first filter that a domain name matches with is the one whose actions gets applied.
     *  Structure is documented below.
     * @return builder
     */
    def urlFilters(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileUrlFilterArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileUrlFilteringProfileUrlFilterArgs.builder
      builder.urlFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SacAttachmentState.Builder)
    /**
     * @param symantecOptions Configuration required for Symantec attachments.
     *  Structure is documented below.
     * @return builder
     */
    def symantecOptions(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SacAttachmentSymantecOptionsArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SacAttachmentState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SacAttachmentSymantecOptionsArgs.builder
      builder.symantecOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyState.Builder)
    /**
     * @param customProvider Required if the action is CUSTOM. Allows delegating authorization decisions to Cloud IAP or to Service Extensions. One of cloudIap or authzExtension must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def customProvider(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.builder
      builder.customProvider(args(argsBuilder).build)

    /**
     * @param httpRules A list of authorization HTTP rules to match against the incoming request.A policy match occurs when at least one HTTP rule matches the request or when no HTTP rules are specified in the policy. At least one HTTP Rule is required for Allow or Deny Action.
     *  Limited to 5 rules.
     *  Structure is documented below.
     * @return builder
     */
    def httpRules(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.builder
      builder.httpRules(args.map(_(argsBuilder).build)*)

    /**
     * @param target Specifies the set of resources to which this policy should be applied to.
     *  Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyTargetArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.UllMirroringCollectorRuleState.Builder)
    /**
     * @param match Match defines what traffic to mirror.
     *  Structure is documented below.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.UllMirroringCollectorRuleMatchArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.UllMirroringCollectorRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.UllMirroringCollectorRuleMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourcePrincipalArgs.Builder)
    /**
     * @param principal Required. A non-empty string whose value is matched against the principal value based on the principalSelector.
     *  Only exact match can be applied for CLIENT_CERT_URI_SAN, CLIENT_CERT_DNS_NAME_SAN, CLIENT_CERT_COMMON_NAME selectors.
     *  Structure is documented below.
     * @return builder
     */
    def principal(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourcePrincipalPrincipalArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourcePrincipalArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourcePrincipalPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.Builder)
    /**
     * @param authzExtension Delegate authorization decision to user authored Service Extension. Only one of cloudIap or authzExtension can be specified.
     *  Structure is documented below.
     * @return builder
     */
    def authzExtension(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderAuthzExtensionArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderAuthzExtensionArgs.builder
      builder.authzExtension(args(argsBuilder).build)

    /**
     * @param cloudIap Delegates authorization decisions to Cloud IAP. Applicable only for managed load balancers. Enabling Cloud IAP at the AuthzPolicy level is not compatible with Cloud IAP settings in the BackendService. Enabling IAP in both places will result in request failure. Ensure that IAP is enabled in either the AuthzPolicy or the BackendService but not in both places.
     *  Structure is documented below.
     * @return builder
     */
    def cloudIap(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderCloudIapArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyCustomProviderCloudIapArgs.builder
      builder.cloudIap(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.Builder)
    /**
     * @param certificateProviderInstance The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     *  Structure is documented below.
     * @return builder
     */
    def certificateProviderInstance(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaCertificateProviderInstanceArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaCertificateProviderInstanceArgs.builder
      builder.certificateProviderInstance(args(argsBuilder).build)

    /**
     * @param grpcEndpoint gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     *  Structure is documented below.
     * @return builder
     */
    def grpcEndpoint(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaGrpcEndpointArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyServerValidationCaGrpcEndpointArgs.builder
      builder.grpcEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.Builder)
    /**
     * @param headerSet A list of headers to match against in http header.
     *  Structure is documented below.
     * @return builder
     */
    def headerSet(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetArgs.builder
      builder.headerSet(args(argsBuilder).build)

    /**
     * @param hosts A list of HTTP Hosts to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
     *  Limited to 10 matches.
     *  Structure is documented below.
     * @return builder
     */
    def hosts(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHostArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHostArgs.builder
      builder.hosts(args.map(_(argsBuilder).build)*)

    /**
     * @param mcp Defines the MCP protocol attributes to match on. MCP based match is allowed only when the AuthzPolicy points to an AgentGateway.
     *  Structure is documented below.
     * @return builder
     */
    def mcp(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpArgs.builder
      builder.mcp(args(argsBuilder).build)

    /**
     * @param paths A list of paths to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
     *  Limited to 10 matches.
     *  Note that this path match includes the query parameters. For gRPC services, this should be a fully-qualified name of the form /package.service/method.
     *  Structure is documented below.
     * @return builder
     */
    def paths(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationPathArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationPathArgs.builder
      builder.paths(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationArgs.Builder)
    /**
     * @param headerSet A list of headers to match against in http header.
     *  Structure is documented below.
     * @return builder
     */
    def headerSet(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetArgs.builder
      builder.headerSet(args(argsBuilder).build)

    /**
     * @param hosts A list of HTTP Hosts to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
     *  Limited to 10 matches.
     *  Structure is documented below.
     * @return builder
     */
    def hosts(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHostArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHostArgs.builder
      builder.hosts(args.map(_(argsBuilder).build)*)

    /**
     * @param paths A list of paths to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
     *  Limited to 10 matches.
     *  Note that this path match includes the query parameters. For gRPC services, this should be a fully-qualified name of the form /package.service/method.
     *  Structure is documented below.
     * @return builder
     */
    def paths(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationPathArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationPathArgs.builder
      builder.paths(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.Builder)
    /**
     * @param antivirusOverrides Defines what action to take for antivirus threats per protocol.
     *  Structure is documented below.
     * @return builder
     */
    def antivirusOverrides(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileAntivirusOverrideArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileAntivirusOverrideArgs.builder
      builder.antivirusOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param severityOverrides The configuration for overriding threats actions by severity match.
     *  Structure is documented below.
     * @return builder
     */
    def severityOverrides(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileSeverityOverrideArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileSeverityOverrideArgs.builder
      builder.severityOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param threatOverrides The configuration for overriding threats actions by threat id match.
     *  If a threat is matched both by configuration provided in severity overrides
     *  and threat overrides, the threat overrides action is applied.
     *  Structure is documented below.
     * @return builder
     */
    def threatOverrides(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileThreatOverrideArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SecurityProfileThreatPreventionProfileThreatOverrideArgs.builder
      builder.threatOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceArgs.Builder)
    /**
     * @param ipBlocks A list of IP addresses or IP address ranges to match against the source IP address of the request. Limited to 10 ipBlocks per Authorization Policy
     *  Structure is documented below.
     * @return builder
     */
    def ipBlocks(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceIpBlockArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceIpBlockArgs.builder
      builder.ipBlocks(args.map(_(argsBuilder).build)*)

    /**
     * @param principals A list of identities derived from the client&#39;s certificate. This field will not match on a request unless mutual TLS is enabled for the Forwarding rule or Gateway. Each identity is a string whose value is matched against the URI SAN, or DNS SAN or the subject field in the client&#39;s certificate. The match can be exact, prefix, suffix or a substring match. One of exact, prefix, suffix or contains must be specified.
     *  Limited to 5 principals.
     *  Structure is documented below.
     * @return builder
     */
    def principals(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourcePrincipalArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourcePrincipalArgs.builder
      builder.principals(args.map(_(argsBuilder).build)*)

    /**
     * @param resources A list of resources to match against the resource of the source VM of a request.
     *  Limited to 5 resources.
     *  Structure is documented below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaArgs.Builder)
    /**
     * @param certificateProviderInstance Optional if policy is to be used with Traffic Director. For external HTTPS load balancer must be empty.
     *  Defines a mechanism to provision server identity (public and private keys). Cannot be combined with allowOpen as a permissive mode that allows both plain text and TLS is not supported.
     *  Structure is documented below.
     * @return builder
     */
    def certificateProviderInstance(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaCertificateProviderInstanceArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaCertificateProviderInstanceArgs.builder
      builder.certificateProviderInstance(args(argsBuilder).build)

    /**
     * @param grpcEndpoint gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     *  Structure is documented below.
     * @return builder
     */
    def grpcEndpoint(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaGrpcEndpointArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaGrpcEndpointArgs.builder
      builder.grpcEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.FirewallEndpointState.Builder)
    /**
     * @param endpointSettings Settings for the endpoint.
     *  Structure is documented below.
     * @return builder
     */
    def endpointSettings(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.FirewallEndpointEndpointSettingsArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.FirewallEndpointState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.FirewallEndpointEndpointSettingsArgs.builder
      builder.endpointSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupState.Builder)
    /**
     * @param associations List of associations to this endpoint group.
     *  Structure is documented below.
     * @return builder
     */
    def associations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationArgs.builder
      builder.associations(args.map(_(argsBuilder).build)*)

    /**
     * @param connectedDeploymentGroups List of details about the connected deployment groups to this endpoint
     *  group.
     *  Structure is documented below.
     * @return builder
     */
    def connectedDeploymentGroups(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupConnectedDeploymentGroupArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupConnectedDeploymentGroupArgs.builder
      builder.connectedDeploymentGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromArgs.Builder)
    /**
     * @param notSources Describes the negated properties of request sources. Matches requests from sources that do not match the criteria specified in this field. At least one of sources or notSources must be specified. Limited to 1 not_source.
     *  Structure is documented below.
     * @return builder
     */
    def notSources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceArgs.builder
      builder.notSources(args.map(_(argsBuilder).build)*)

    /**
     * @param sources Describes the properties of a request&#39;s sources. At least one of sources or notSources must be specified. Limited to 1 source. A match occurs when ANY source (in sources or notSources) matches the request. Within a single source, the match follows AND semantics across fields and OR semantics within a single field, i.e. a match occurs when ANY principal matches AND ANY ipBlocks match.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AddressGroupIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AddressGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AddressGroupIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AddressGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs.Builder)
    /**
     * @param value Specifies how the header match will be performed.
     *  Structure is documented below.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderValueArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupConnectedDeploymentGroupArgs.Builder)
    /**
     * @param locations (Output)
     *  The list of locations where the deployment group is present.
     *  Structure is documented below.
     * @return builder
     */
    def locations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupConnectedDeploymentGroupLocationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupConnectedDeploymentGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupConnectedDeploymentGroupLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyState.Builder)
    /**
     * @param rules List of rules to match. Note that at least one of the rules must match in order for the action specified in the &#39;action&#39; field to be taken.
     *  A rule is a match if there is a matching source and destination. If left blank, the action specified in the action field will be applied on every request.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthorizationPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpMethodArgs.Builder)
    /**
     * @param params MCP method parameters to match against.
     *  Structure is documented below.
     * @return builder
     */
    def params(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpMethodParamArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpMethodArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationMcpMethodParamArgs.builder
      builder.params(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetArgs.Builder)
    /**
     * @param headers A list of headers to match against in http header. The match can be one of exact, prefix, suffix, or contains (substring match). The match follows AND semantics which means all the headers must match. Matches are always case sensitive unless the ignoreCase is set. Limited to 10 matches.
     *  Structure is documented below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetHeaderArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupState.Builder)
    /**
     * @param connectedEndpointGroups The list of endpoint groups that are connected to this resource.
     *  Structure is documented below.
     * @return builder
     */
    def connectedEndpointGroups(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupConnectedEndpointGroupArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupConnectedEndpointGroupArgs.builder
      builder.connectedEndpointGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param locations The list of locations where the deployment group is present.
     *  Structure is documented below.
     * @return builder
     */
    def locations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupLocationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentGroupLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToArgs.Builder)
    /**
     * @param notOperations Describes the negated properties of the targets of a request. Matches requests for operations that do not match the criteria specified in this field. At least one of operations or notOperations must be specified. Limited to 1 not_operation.
     *  Structure is documented below.
     * @return builder
     */
    def notOperations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationArgs.builder
      builder.notOperations(args.map(_(argsBuilder).build)*)

    /**
     * @param operations Describes properties of one or more targets of a request. At least one of operations or notOperations must be specified. Limited to 1 operation. A match occurs when ANY operation (in operations or notOperations) matches. Within an operation, the match follows AND semantics across fields and OR semantics within a field, i.e. a match occurs when ANY path matches AND ANY header matches and ANY method matches.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationState.Builder)
    /**
     * @param locations The list of locations where the association is configured. This information
     *  is retrieved from the linked endpoint group.
     *  Structure is documented below.
     * @return builder
     */
    def locations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationLocationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

    /**
     * @param locationsDetails (Deprecated)
     *  The list of locations where the association is present. This information
     *  is retrieved from the linked endpoint group, and not configured as part
     *  of the association itself.
     *  Structure is documented below.
     * @return builder
     * @deprecated `locationsDetails` is deprecated and will be removed in a future major release. Use `locations` instead.
     */
    @deprecated def locationsDetails(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationLocationsDetailArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupAssociationLocationsDetailArgs.builder
      builder.locationsDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.Builder)
    /**
     * @param from Describes properties of one or more sources of a request.
     *  Structure is documented below.
     * @return builder
     */
    def from(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromArgs.builder
      builder.from(args(argsBuilder).build)

    /**
     * @param to Describes properties of one or more targets of a request
     *  Structure is documented below.
     * @return builder
     */
    def to(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToArgs.builder
      builder.to(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.SacRealmState.Builder)
    /**
     * @param pairingKeys Key to be shared with SSE service provider during pairing.
     *  Structure is documented below.
     * @return builder
     */
    def pairingKeys(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SacRealmPairingKeyArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.SacRealmState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.SacRealmPairingKeyArgs.builder
      builder.pairingKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param symantecOptions Configuration required for Symantec realms.
     *  Structure is documented below.
     * @return builder
     */
    def symantecOptions(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.SacRealmSymantecOptionsArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.SacRealmState.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.SacRealmSymantecOptionsArgs.builder
      builder.symantecOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyArgs.Builder)
    /**
     * @param clientValidationCas Required if the policy is to be used with Traffic Director. For external HTTPS load balancers it must be empty.
     *  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
     *  Structure is documented below.
     * @return builder
     */
    def clientValidationCas(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyMtlsPolicyClientValidationCaArgs.builder
      builder.clientValidationCas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetHeaderArgs.Builder)
    /**
     * @param value Specifies how the header match will be performed.
     *  Structure is documented below.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetHeaderValueArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetHeaderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetHeaderValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetArgs.Builder)
    /**
     * @param headers A list of headers to match against in http header. The match can be one of exact, prefix, suffix, or contains (substring match). The match follows AND semantics which means all the headers must match. Matches are always case sensitive unless the ignoreCase is set. Limited to 10 matches.
     *  Structure is documented below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToNotOperationHeaderSetHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.Builder)
    /**
     * @param certificateProviderInstance Optional if policy is to be used with Traffic Director. For external HTTPS load balancer must be empty.
     *  Defines a mechanism to provision server identity (public and private keys). Cannot be combined with allowOpen as a permissive mode that allows both plain text and TLS is not supported.
     *  Structure is documented below.
     * @return builder
     */
    def certificateProviderInstance(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateCertificateProviderInstanceArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateCertificateProviderInstanceArgs.builder
      builder.certificateProviderInstance(args(argsBuilder).build)

    /**
     * @param grpcEndpoint gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     *  Structure is documented below.
     * @return builder
     */
    def grpcEndpoint(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateGrpcEndpointArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ServerTlsPolicyServerCertificateGrpcEndpointArgs.builder
      builder.grpcEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.Builder)
    /**
     * @param certificateProviderInstance The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     *  Structure is documented below.
     * @return builder
     */
    def certificateProviderInstance(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateCertificateProviderInstanceArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateCertificateProviderInstanceArgs.builder
      builder.certificateProviderInstance(args(argsBuilder).build)

    /**
     * @param grpcEndpoint gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     *  Structure is documented below.
     * @return builder
     */
    def grpcEndpoint(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateGrpcEndpointArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.ClientTlsPolicyClientCertificateGrpcEndpointArgs.builder
      builder.grpcEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourcePrincipalArgs.Builder)
    /**
     * @param principal Required. A non-empty string whose value is matched against the principal value based on the principalSelector.
     *  Only exact match can be applied for CLIENT_CERT_URI_SAN, CLIENT_CERT_DNS_NAME_SAN, CLIENT_CERT_COMMON_NAME selectors.
     *  Structure is documented below.
     * @return builder
     */
    def principal(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourcePrincipalPrincipalArgs.Builder]):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourcePrincipalArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourcePrincipalPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupState.Builder)
    /**
     * @param associations List of associations to this endpoint group.
     *  Structure is documented below.
     * @return builder
     */
    def associations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationArgs.builder
      builder.associations(args.map(_(argsBuilder).build)*)

    /**
     * @param connectedDeploymentGroups The endpoint group&#39;s view of a connected deployment group.
     *  Structure is documented below.
     * @return builder
     */
    def connectedDeploymentGroups(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupConnectedDeploymentGroupArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupConnectedDeploymentGroupArgs.builder
      builder.connectedDeploymentGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceArgs.Builder)
    /**
     * @param ipBlocks A list of IP addresses or IP address ranges to match against the source IP address of the request. Limited to 10 ipBlocks per Authorization Policy
     *  Structure is documented below.
     * @return builder
     */
    def ipBlocks(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceIpBlockArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceIpBlockArgs.builder
      builder.ipBlocks(args.map(_(argsBuilder).build)*)

    /**
     * @param principals A list of identities derived from the client&#39;s certificate. This field will not match on a request unless mutual TLS is enabled for the Forwarding rule or Gateway. Each identity is a string whose value is matched against the URI SAN, or DNS SAN or the subject field in the client&#39;s certificate. The match can be exact, prefix, suffix or a substring match. One of exact, prefix, suffix or contains must be specified.
     *  Limited to 5 principals.
     *  Structure is documented below.
     * @return builder
     */
    def principals(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourcePrincipalArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourcePrincipalArgs.builder
      builder.principals(args.map(_(argsBuilder).build)*)

    /**
     * @param resources A list of resources to match against the resource of the source VM of a request.
     *  Limited to 5 resources.
     *  Structure is documented below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleFromNotSourceResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationState.Builder)
    /**
     * @param locations The list of locations where the association is configured. This information
     *  is retrieved from the linked endpoint group.
     *  Structure is documented below.
     * @return builder
     */
    def locations(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationLocationArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

    /**
     * @param locationsDetails (Deprecated)
     *  The list of locations where the association is present. This information
     *  is retrieved from the linked endpoint group, and not configured as part
     *  of the association itself.
     *  Structure is documented below.
     * @return builder
     * @deprecated `locationsDetails` is deprecated and will be removed in a future major release. Use `locations` instead.
     */
    @deprecated def locationsDetails(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationLocationsDetailArgs.Builder]*):
        com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationState.Builder =
      def argsBuilder = com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupAssociationLocationsDetailArgs.builder
      builder.locationsDetails(args.map(_(argsBuilder).build)*)

  /**
   * A security profile group defines a container for security profiles.
   * 
   *  To get more information about SecurityProfileGroup, see:
   * 
   *  * [API documentation](https://cloud.google.com/firewall/docs/reference/network-security/rest/v1/organizations.locations.securityProfileGroups)
   *  * How-to Guides
   *      * [Create and manage security profile groups](https://cloud.google.com/firewall/docs/configure-security-profile-groups)
   *      * [Security profile groups overview](https://cloud.google.com/firewall/docs/about-security-profile-groups)
   */
  def SecurityProfileGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.SecurityProfileGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.SecurityProfileGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.SecurityProfileGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
