package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object networksecurity:
  /**
   * AddressGroup is a resource that specifies how a collection of IP/DNS used in Firewall Policy.
   * 
   * To get more information about AddressGroup, see:
   * 
   * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-security/rest/v1beta1/organizations.locations.addressGroups)
   * * How-to Guides
   *     * [Use AddressGroups](https://cloud.google.com/vpc/docs/use-address-groups-firewall-policies)
   */
  inline def AddressGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.AddressGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.AddressGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.AddressGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Network Security ProjectAddressGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.networksecurity.AddressGroupIamPolicy`: Authoritative. Sets the IAM policy for the projectaddressgroup and replaces any existing policy already attached.
   * * `gcp.networksecurity.AddressGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the projectaddressgroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.networksecurity.AddressGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the projectaddressgroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.networksecurity.AddressGroupIamPolicy`: Retrieves the IAM policy for the projectaddressgroup
   * 
   * &gt; **Note:** `gcp.networksecurity.AddressGroupIamPolicy` **cannot** be used in conjunction with `gcp.networksecurity.AddressGroupIamBinding` and `gcp.networksecurity.AddressGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.networksecurity.AddressGroupIamBinding` resources **can be** used in conjunction with `gcp.networksecurity.AddressGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.networksecurity.AddressGroupIamPolicy
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/{{location}}/addressGroups/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Network Security projectaddressgroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_network_security_address_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}} roles/compute.networkAdmin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_network_security_address_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}} roles/compute.networkAdmin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:networksecurity/addressGroupIamBinding:AddressGroupIamBinding editor projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def AddressGroupIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.AddressGroupIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.AddressGroupIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.AddressGroupIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Network Security ProjectAddressGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.networksecurity.AddressGroupIamPolicy`: Authoritative. Sets the IAM policy for the projectaddressgroup and replaces any existing policy already attached.
   * * `gcp.networksecurity.AddressGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the projectaddressgroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.networksecurity.AddressGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the projectaddressgroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.networksecurity.AddressGroupIamPolicy`: Retrieves the IAM policy for the projectaddressgroup
   * 
   * &gt; **Note:** `gcp.networksecurity.AddressGroupIamPolicy` **cannot** be used in conjunction with `gcp.networksecurity.AddressGroupIamBinding` and `gcp.networksecurity.AddressGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.networksecurity.AddressGroupIamBinding` resources **can be** used in conjunction with `gcp.networksecurity.AddressGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.networksecurity.AddressGroupIamPolicy
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/{{location}}/addressGroups/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Network Security projectaddressgroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_network_security_address_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}} roles/compute.networkAdmin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_network_security_address_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}} roles/compute.networkAdmin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:networksecurity/addressGroupIamMember:AddressGroupIamMember editor projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def AddressGroupIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.AddressGroupIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.AddressGroupIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.AddressGroupIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Network Security ProjectAddressGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.networksecurity.AddressGroupIamPolicy`: Authoritative. Sets the IAM policy for the projectaddressgroup and replaces any existing policy already attached.
   * * `gcp.networksecurity.AddressGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the projectaddressgroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.networksecurity.AddressGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the projectaddressgroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.networksecurity.AddressGroupIamPolicy`: Retrieves the IAM policy for the projectaddressgroup
   * 
   * &gt; **Note:** `gcp.networksecurity.AddressGroupIamPolicy` **cannot** be used in conjunction with `gcp.networksecurity.AddressGroupIamBinding` and `gcp.networksecurity.AddressGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.networksecurity.AddressGroupIamBinding` resources **can be** used in conjunction with `gcp.networksecurity.AddressGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.networksecurity.AddressGroupIamPolicy
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/{{location}}/addressGroups/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Network Security projectaddressgroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_network_security_address_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}} roles/compute.networkAdmin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_network_security_address_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}} roles/compute.networkAdmin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:networksecurity/addressGroupIamPolicy:AddressGroupIamPolicy editor projects/{{project}}/locations/{{location}}/addressGroups/{{project_address_group}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def AddressGroupIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.AddressGroupIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.AddressGroupIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.AddressGroupIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * AuthorizationPolicy is a resource that specifies how a server should authorize incoming connections. This resource in itself does not change the configuration unless it&#39;s attached to a target https proxy or endpoint config selector resource.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about AuthorizationPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-security/rest/v1beta1/projects.locations.authorizationPolicies)
   */
  inline def AuthorizationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.AuthorizationPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.AuthorizationPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.AuthorizationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * AuthzPolicy is a resource that allows to forward traffic to a callout backend designed to scan the traffic for security purposes.
   * 
   * To get more information about AuthzPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/load-balancing/docs/reference/network-security/rest/v1beta1/projects.locations.authzPolicies)
   */
  inline def AuthzPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.AuthzPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.AuthzPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.AuthzPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * BackendAuthenticationConfig groups the TrustConfig together with other settings that control how the load balancer authenticates, and expresses its identity to the backend.
   * 
   * To get more information about BackendAuthenticationConfig, see:
   * * How-to Guides
   *     * [Backend mTLS](https://cloud.google.com/load-balancing/docs/backend-authenticated-tls-backend-mtls#backend-authentication-config)
   */
  inline def BackendAuthenticationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.BackendAuthenticationConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.BackendAuthenticationConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.BackendAuthenticationConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * ClientTlsPolicy is a resource that specifies how a client should authenticate connections to backends of a service. This resource itself does not affect configuration unless it is attached to a backend service resource.
   * 
   * To get more information about ClientTlsPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-security/rest/v1beta1/projects.locations.clientTlsPolicies)
   * * How-to Guides
   *     * [Service Security](https://cloud.google.com/traffic-director/docs/security-use-cases)
   */
  inline def ClientTlsPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.ClientTlsPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.ClientTlsPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.ClientTlsPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * DNS Armor is a fully-managed service that provides DNS-layer security for your Google Cloud workloads.
   * 
   * To get more information about DnsThreatDetector, see:
   * 
   * * [API documentation](https://cloud.google.com/dns/docs/create-threat-detector)
   * * How-to Guides
   *     * [DNS Threat Detector](https://cloud.google.com/dns/docs/threat-detection)
   */
  inline def DnsThreatDetector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.DnsThreatDetectorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.DnsThreatDetectorArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.DnsThreatDetector(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Firewall endpoint is a Cloud Firewall resource that enables
   * layer 7 advanced protection capabilities, such as intrusion prevention,
   * in your network.
   * 
   * To get more information about FirewallEndpoint, see:
   * 
   * * [API documentation](https://cloud.google.com/firewall/docs/reference/network-security/rest/v1/organizations.locations.firewallEndpoints)
   * * How-to Guides
   *     * [Create and associate firewall endpoints](https://cloud.google.com/firewall/docs/configure-firewall-endpoints)
   *     * [Firewall endpoint overview](https://cloud.google.com/firewall/docs/about-firewall-endpoints)
   * 
   * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   * you must specify a `billingProjectId` and set `userProjectOverride` to true
   * in the provider configuration. Otherwise the ACM API will return a 403 error.
   * Your account must have the `serviceusage.services.use` permission on the
   * `billingProjectId` you defined.
   */
  inline def FirewallEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.FirewallEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.FirewallEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.FirewallEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Firewall endpoint association links a firewall endpoint to a VPC network in
   * the same zone. After you define this association, Cloud Firewall forwards the
   * zonal workload traffic in your VPC network that requires layer 7 inspection to
   * the attached firewall endpoint.
   * 
   * To get more information about FirewallEndpointAssociation, see:
   * 
   * * [API documentation](https://cloud.google.com/firewall/docs/reference/network-security/rest/v1/projects.locations.firewallEndpointAssociations#FirewallEndpointAssociation)
   * * How-to Guides
   *     * [Create and associate firewall endpoints](https://cloud.google.com/firewall/docs/configure-firewall-endpoints)
   *     * [Firewall endpoint overview](https://cloud.google.com/firewall/docs/about-firewall-endpoints)
   * 
   * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   * you must specify a `billingProjectId` and set `userProjectOverride` to true
   * in the provider configuration. Otherwise the ACM API will return a 403 error.
   * Your account must have the `serviceusage.services.use` permission on the
   * `billingProjectId` you defined.
   */
  inline def FirewallEndpointAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.FirewallEndpointAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.FirewallEndpointAssociationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.FirewallEndpointAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The GatewaySecurityPolicy resource contains a collection of GatewaySecurityPolicyRules and associated metadata.
   * 
   * To get more information about GatewaySecurityPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/secure-web-proxy/docs/reference/network-security/rest/v1/projects.locations.gatewaySecurityPolicies)
   */
  inline def GatewaySecurityPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.GatewaySecurityPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.GatewaySecurityPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.GatewaySecurityPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The GatewaySecurityPolicyRule resource is in a nested collection within a GatewaySecurityPolicy and represents
   * a traffic matching condition and associated action to perform.
   * 
   * To get more information about GatewaySecurityPolicyRule, see:
   * 
   * * [API documentation](https://cloud.google.com/secure-web-proxy/docs/reference/network-security/rest/v1/projects.locations.gatewaySecurityPolicies.rules)
   */
  inline def GatewaySecurityPolicyRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.GatewaySecurityPolicyRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.GatewaySecurityPolicyRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.GatewaySecurityPolicyRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A deployment represents a zonal intercept backend ready to accept
   * GENEVE-encapsulated traffic, e.g. a zonal instance group fronted by an
   * internal passthrough load balancer. Deployments are always part of a
   * global deployment group which represents a global intercept service.
   */
  inline def InterceptDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.InterceptDeploymentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networksecurity.InterceptDeploymentArgs.builder
    com.pulumi.gcp.networksecurity.InterceptDeployment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A deployment group aggregates many zonal intercept backends (deployments)
   * into a single global intercept service. Consumers can connect this service
   * using an endpoint group.
   */
  inline def InterceptDeploymentGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.InterceptDeploymentGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networksecurity.InterceptDeploymentGroupArgs.builder
    com.pulumi.gcp.networksecurity.InterceptDeploymentGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An endpoint group is a consumer frontend for a deployment group (backend).
   * In order to configure intercept for a network, consumers must create:
   * - An association between their network and the endpoint group.
   * - A security profile that points to the endpoint group.
   * - A firewall rule that references the security profile (group).
   */
  inline def InterceptEndpointGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.InterceptEndpointGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networksecurity.InterceptEndpointGroupArgs.builder
    com.pulumi.gcp.networksecurity.InterceptEndpointGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An endpoint group association represents a link between a network and an
   * endpoint group in the organization.
   * 
   * Creating an association creates the networking infrastructure linking the
   * network to the endpoint group, but does not enable intercept by itself.
   * To enable intercept, the user must also create a network firewall policy
   * containing intercept rules and associate it with the network.
   */
  inline def InterceptEndpointGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.InterceptEndpointGroupAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networksecurity.InterceptEndpointGroupAssociationArgs.builder
    com.pulumi.gcp.networksecurity.InterceptEndpointGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A deployment represents a zonal mirroring backend ready to accept
   * GENEVE-encapsulated replica traffic, e.g. a zonal instance group fronted by
   * an internal passthrough load balancer. Deployments are always part of a
   * global deployment group which represents a global mirroring service.
   * 
   * To get more information about MirroringDeployment, see:
   * 
   * * [API documentation](https://cloud.google.com/network-security-integration/docs/reference/rest/v1/projects.locations.mirroringDeployments)
   * * How-to Guides
   *     * [Mirroring deployment overview](https://cloud.google.com/network-security-integration/docs/out-of-band/deployments-overview)
   */
  inline def MirroringDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.MirroringDeploymentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networksecurity.MirroringDeploymentArgs.builder
    com.pulumi.gcp.networksecurity.MirroringDeployment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A deployment group aggregates many zonal mirroring backends (deployments)
   * into a single global mirroring service. Consumers can connect this service
   * using an endpoint group.
   * 
   * To get more information about MirroringDeploymentGroup, see:
   * 
   * * [API documentation](https://cloud.google.com/network-security-integration/docs/reference/rest/v1/projects.locations.mirroringDeploymentGroups)
   * * How-to Guides
   *     * [Mirroring deployment group overview](https://cloud.google.com/network-security-integration/docs/out-of-band/deployment-groups-overview)
   */
  inline def MirroringDeploymentGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.MirroringDeploymentGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networksecurity.MirroringDeploymentGroupArgs.builder
    com.pulumi.gcp.networksecurity.MirroringDeploymentGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An endpoint is a managed mirroring collector that provides enhanced packet
   * enrichment capabilities and support for multiple replica destinations.
   * Endpoints are always part of a global endpoint group which represents a
   * global &#34;mirroring broker&#34; service.
   */
  inline def MirroringEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.MirroringEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networksecurity.MirroringEndpointArgs.builder
    com.pulumi.gcp.networksecurity.MirroringEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An endpoint group is a consumer frontend for a deployment group (backend).
   * In order to configure mirroring for a network, consumers must create:
   * - An association between their network and the endpoint group.
   * - A security profile that points to the endpoint group.
   * - A mirroring rule that references the security profile (group).
   * 
   * To get more information about MirroringEndpointGroup, see:
   * 
   * * [API documentation](https://cloud.google.com/network-security-integration/docs/reference/rest/v1/projects.locations.mirroringEndpointGroups)
   * * How-to Guides
   *     * [Mirroring endpoint group overview](https://cloud.google.com/network-security-integration/docs/out-of-band/endpoint-groups-overview)
   */
  inline def MirroringEndpointGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.MirroringEndpointGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networksecurity.MirroringEndpointGroupArgs.builder
    com.pulumi.gcp.networksecurity.MirroringEndpointGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An endpoint group association represents a link between a network and an
   * endpoint group in the organization.
   * 
   * Creating an association creates the networking infrastructure linking the
   * network to the endpoint group, but does not enable mirroring by itself.
   * To enable mirroring, the user must also create a network firewall policy
   * containing mirroring rules and associate it with the network.
   * 
   * To get more information about MirroringEndpointGroupAssociation, see:
   * 
   * * [API documentation](https://cloud.google.com/network-security-integration/docs/reference/rest/v1/projects.locations.mirroringEndpointGroupAssociations)
   * * How-to Guides
   *     * [Mirroring endpoint group association overview](https://cloud.google.com/network-security-integration/docs/out-of-band/endpoint-groups-overview#mirroring-endpoint-group-association)
   */
  inline def MirroringEndpointGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.MirroringEndpointGroupAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networksecurity.MirroringEndpointGroupAssociationArgs.builder
    com.pulumi.gcp.networksecurity.MirroringEndpointGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object NetworksecurityFunctions:
    /** Retrieves the current IAM policy data for projectaddressgroup */
    inline def getAddressGroupIamPolicy(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.GetAddressGroupIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.networksecurity.outputs.GetAddressGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.GetAddressGroupIamPolicyArgs.builder
      com.pulumi.gcp.networksecurity.NetworksecurityFunctions.getAddressGroupIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for projectaddressgroup */
    inline def getAddressGroupIamPolicyPlain(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.GetAddressGroupIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.networksecurity.outputs.GetAddressGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.GetAddressGroupIamPolicyPlainArgs.builder
      com.pulumi.gcp.networksecurity.NetworksecurityFunctions.getAddressGroupIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * AddressGroups are used to group IP addresses together for use in firewall policies. This data source allows you to list address groups in a project or organization and location.
     * 
     * To get more information about Address Groups, see:
     * 
     * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/networkFirewallPolicies)
     * * How-to Guides
     *     * [Official Documentation](https://cloud.google.com/firewall/docs/about-address-groups)
     */
    inline def getAddressGroups(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.GetAddressGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.networksecurity.outputs.GetAddressGroupsResult] =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.GetAddressGroupsArgs.builder
      com.pulumi.gcp.networksecurity.NetworksecurityFunctions.getAddressGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * AddressGroups are used to group IP addresses together for use in firewall policies. This data source allows you to list address groups in a project or organization and location.
     * 
     * To get more information about Address Groups, see:
     * 
     * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/networkFirewallPolicies)
     * * How-to Guides
     *     * [Official Documentation](https://cloud.google.com/firewall/docs/about-address-groups)
     */
    inline def getAddressGroupsPlain(args: Endofunction[com.pulumi.gcp.networksecurity.inputs.GetAddressGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.networksecurity.outputs.GetAddressGroupsResult] =
      val argsBuilder = com.pulumi.gcp.networksecurity.inputs.GetAddressGroupsPlainArgs.builder
      com.pulumi.gcp.networksecurity.NetworksecurityFunctions.getAddressGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Represents a Secure Access Connect (SAC) attachment resource
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about SacAttachment, see:
   * 
   * * [API documentation](https://cloud.google.com/secure-access-connect/docs/reference/network-security/rest/v1beta1/projects.locations.sacAttachments)
   * * How-to Guides
   *     * [QUICKSTART_TITLE](https://cloud.google.com/secure-access-connect/docs/overview)
   */
  inline def SacAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.SacAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.SacAttachmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.SacAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Secure Access Connect Realm resource
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about SacRealm, see:
   * 
   * * [API documentation](https://cloud.google.com/secure-access-connect/docs/reference/network-security/rest/v1beta1/projects.locations.sacRealms)
   * * How-to Guides
   *     * [QUICKSTART_TITLE](https://cloud.google.com/secure-access-connect/docs/overview)
   */
  inline def SacRealm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.SacRealmArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.SacRealmArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.SacRealm(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A security profile defines the behavior associated to a profile type.
   * 
   * To get more information about SecurityProfile, see:
   * 
   * * [API documentation](https://cloud.google.com/firewall/docs/reference/network-security/rest/v1/organizations.locations.securityProfiles)
   * * How-to Guides
   *     * [Create and manage security profiles](https://cloud.google.com/firewall/docs/configure-security-profiles)
   */
  inline def SecurityProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.SecurityProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.SecurityProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.SecurityProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A security profile group defines a container for security profiles.
   * 
   * To get more information about SecurityProfileGroup, see:
   * 
   * * [API documentation](https://cloud.google.com/firewall/docs/reference/network-security/rest/v1/organizations.locations.securityProfileGroups)
   * * How-to Guides
   *     * [Create and manage security profile groups](https://cloud.google.com/firewall/docs/configure-security-profile-groups)
   *     * [Security profile groups overview](https://cloud.google.com/firewall/docs/about-security-profile-groups)
   */
  inline def SecurityProfileGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.SecurityProfileGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.SecurityProfileGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.SecurityProfileGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * ServerTlsPolicy is a resource that specifies how a server should authenticate incoming requests. This resource itself does not affect configuration unless it is attached to a target HTTPS proxy or endpoint config selector resource.
   * 
   * To get more information about ServerTlsPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-security/rest/v1beta1/projects.locations.serverTlsPolicies)
   * * How-to Guides
   *     * [Use ServerTlsPolicy](https://cloud.google.com/load-balancing/docs/mtls)
   */
  inline def ServerTlsPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.ServerTlsPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.ServerTlsPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.ServerTlsPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The TlsInspectionPolicy resource contains references to CA pools in Certificate Authority Service and associated metadata.
   * 
   * To get more information about TlsInspectionPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/secure-web-proxy/docs/reference/network-security/rest/v1/projects.locations.tlsInspectionPolicies)
   * * How-to Guides
   *     * [Use TlsInspectionPolicy](https://cloud.google.com/secure-web-proxy/docs/tls-inspection-overview)
   */
  inline def TlsInspectionPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.TlsInspectionPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.TlsInspectionPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.TlsInspectionPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Mirroring Collector is a logical representation of an appliance that collects
   * mirrored traffic.
   */
  inline def UllMirroringCollector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.UllMirroringCollectorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networksecurity.UllMirroringCollectorArgs.builder
    com.pulumi.gcp.networksecurity.UllMirroringCollector(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** UllMirroringCollectorRule is a resource that defines what traffic should be mirrored. */
  inline def UllMirroringCollectorRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.UllMirroringCollectorRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networksecurity.UllMirroringCollectorRuleArgs.builder
    com.pulumi.gcp.networksecurity.UllMirroringCollectorRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Mirroring Engine is a logical representation of the underlying infrastructure
   * that is used to manage and monitor the ULL Mirroring setup.
   */
  inline def UllMirroringEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.UllMirroringEngineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networksecurity.UllMirroringEngineArgs.builder
    com.pulumi.gcp.networksecurity.UllMirroringEngine(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * UrlList proto helps users to set reusable, independently manageable lists of hosts, host patterns, URLs, URL patterns.
   * 
   * To get more information about UrlLists, see:
   * 
   * * [API documentation](https://cloud.google.com/secure-web-proxy/docs/reference/network-security/rest/v1/projects.locations.urlLists)
   * * How-to Guides
   *     * Use UrlLists
   */
  inline def UrlList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networksecurity.UrlListArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networksecurity.UrlListArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networksecurity.UrlList(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
