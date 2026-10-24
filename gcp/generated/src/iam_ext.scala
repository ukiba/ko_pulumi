package jp.ukiba.ko_pulumi
package gcp

object iam_ext:
  extension (builder: com.pulumi.gcp.iam.AccessBoundaryPolicyArgs.Builder)
    /**
     * @param rules Rules to be applied.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.iam.AccessBoundaryPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.DenyPolicyArgs.Builder)
    /**
     * @param rules Rules to be applied.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.iam.inputs.DenyPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.iam.DenyPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.DenyPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.FolderAccessPolicyArgs.Builder)
    /**
     * @param details Access policy details.
     * Structure is documented below.
     * @return builder
     */
    inline def details(args: Endofunction[com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsArgs.Builder]):
        com.pulumi.gcp.iam.FolderAccessPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.FoldersPolicyBindingArgs.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language
     * (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     * CEL are documented at https://github.com/google/cel-spec.
     * Example (Comparison):
     * title: \&#34;Summary size limit\&#34;
     * description: \&#34;Determines if a summary is less than 100 chars\&#34;
     * expression: \&#34;document.summary.size() &lt; 100\&#34;
     * Example
     * (Equality):
     * title: \&#34;Requestor is owner\&#34;
     * description: \&#34;Determines if requestor is the document owner\&#34;
     * expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     * (Logic):
     * title: \&#34;Public documents\&#34;
     * description: \&#34;Determine whether the document should be publicly visible\&#34;
     * expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     * Example (Data Manipulation):
     * title: \&#34;Notification string\&#34;
     * description: \&#34;Create a notification string with a timestamp.\&#34;
     * expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     * The exact variables and functions that may be referenced within an expression are
     * determined by the service that evaluates it. See the service documentation for
     * additional information.
     * Conditions are currently only supported when the bound policy is a principal access boundary policy.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.FoldersPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.FoldersPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.FoldersPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     * Exactly one of `principalSet` (for principal access boundary policy bindings) or
     * `resource` (for access policy bindings) must be set.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.iam.inputs.FoldersPolicyBindingTargetArgs.Builder]):
        com.pulumi.gcp.iam.FoldersPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.FoldersPolicyBindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.OrganizationAccessPolicyArgs.Builder)
    /**
     * @param details Access policy details.
     * Structure is documented below.
     * @return builder
     */
    inline def details(args: Endofunction[com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsArgs.Builder]):
        com.pulumi.gcp.iam.OrganizationAccessPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.OrganizationsPolicyBindingArgs.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language
     * (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     * CEL are documented at https://github.com/google/cel-spec.
     * Example (Comparison):
     * title: \&#34;Summary size limit\&#34;
     * description: \&#34;Determines if a summary is less than 100 chars\&#34;
     * expression: \&#34;document.summary.size() &lt; 100\&#34;
     * Example
     * (Equality):
     * title: \&#34;Requestor is owner\&#34;
     * description: \&#34;Determines if requestor is the document owner\&#34;
     * expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     * (Logic):
     * title: \&#34;Public documents\&#34;
     * description: \&#34;Determine whether the document should be publicly visible\&#34;
     * expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     * Example (Data Manipulation):
     * title: \&#34;Notification string\&#34;
     * description: \&#34;Create a notification string with a timestamp.\&#34;
     * expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     * The exact variables and functions that may be referenced within an expression are
     * determined by the service that evaluates it. See the service documentation for
     * additional information.
     * Conditions are currently only supported when the bound policy is a principal access boundary policy.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.OrganizationsPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     * Exactly one of `principalSet` (for principal access boundary policy bindings) or
     * `resource` (for access policy bindings) must be set.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingTargetArgs.Builder]):
        com.pulumi.gcp.iam.OrganizationsPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.PrincipalAccessBoundaryPolicyArgs.Builder)
    /**
     * @param details Principal access boundary policy details
     * Structure is documented below.
     * @return builder
     */
    inline def details(args: Endofunction[com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsArgs.Builder]):
        com.pulumi.gcp.iam.PrincipalAccessBoundaryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.ProjectAccessPolicyArgs.Builder)
    /**
     * @param details Access policy details.
     * Structure is documented below.
     * @return builder
     */
    inline def details(args: Endofunction[com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsArgs.Builder]):
        com.pulumi.gcp.iam.ProjectAccessPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.ProjectsPolicyBindingArgs.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language
     * (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     * CEL are documented at https://github.com/google/cel-spec.
     * Example (Comparison):
     * title: \&#34;Summary size limit\&#34;
     * description: \&#34;Determines if a summary is less than 100 chars\&#34;
     * expression: \&#34;document.summary.size() &lt; 100\&#34;
     * Example
     * (Equality):
     * title: \&#34;Requestor is owner\&#34;
     * description: \&#34;Determines if requestor is the document owner\&#34;
     * expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     * (Logic):
     * title: \&#34;Public documents\&#34;
     * description: \&#34;Determine whether the document should be publicly visible\&#34;
     * expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     * Example (Data Manipulation):
     * title: \&#34;Notification string\&#34;
     * description: \&#34;Create a notification string with a timestamp.\&#34;
     * expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     * The exact variables and functions that may be referenced within an expression are
     * determined by the service that evaluates it. See the service documentation for
     * additional information.
     * Conditions are currently only supported when the bound policy is a principal access boundary policy.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.ProjectsPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     * Exactly one of `principalSet` (for principal access boundary policy bindings) or
     * `resource` (for access policy bindings) must be set.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingTargetArgs.Builder]):
        com.pulumi.gcp.iam.ProjectsPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.WorkforcePoolArgs.Builder)
    /**
     * @param accessRestrictions Configure access restrictions on the workforce pool users. This is an optional field. If specified web
     * sign-in can be restricted to given set of services or programmatic sign-in can be disabled for pool users.
     * Structure is documented below.
     * @return builder
     */
    inline def accessRestrictions(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsArgs.builder
      builder.accessRestrictions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.WorkforcePoolProviderArgs.Builder)
    /**
     * @param extendedAttributesOauth2Client (Optional, Deprecated)
     * The configuration for OAuth 2.0 client used to get the extended group
     * memberships for user identities. Only the `AZURE_AD_GROUPS_ID` attribute
     * type is supported. Extended groups supports a subset of Google Cloud
     * services. When the user accesses these services, extended group memberships
     * override the mapped `google.groups` attribute. Extended group memberships
     * cannot be used in attribute mapping or attribute condition expressions.
     * To keep extended group memberships up to date, extended groups are
     * retrieved when the user signs in and at regular intervals during the user&#39;s
     * active session. Each user identity in the workforce identity pool must map
     * to a unique Microsoft Entra ID user.
     * Structure is documented below.
     * 
     * &gt; **Warning:** `extendedAttributesOauth2Client` is deprecated. Use SCIM instead.
     * @return builder
     * @deprecated `extendedAttributesOauth2Client` is deprecated. Use SCIM instead.
     */
    @deprecated("`extendedAttributesOauth2Client` is deprecated. Use SCIM instead.") inline def extendedAttributesOauth2Client(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.builder
      builder.extendedAttributesOauth2Client(args(argsBuilder).build)

    /**
     * @param extraAttributesOauth2Client The configuration for OAuth 2.0 client used to get the additional user
     * attributes. This should be used when users can&#39;t get the desired claims
     * in authentication credentials. Currently this configuration is only
     * supported with SAML and OIDC protocol.
     * Structure is documented below.
     * @return builder
     */
    inline def extraAttributesOauth2Client(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.builder
      builder.extraAttributesOauth2Client(args(argsBuilder).build)

    /**
     * @param oidc Represents an OpenId Connect 1.0 identity provider.
     * Structure is documented below.
     * @return builder
     */
    inline def oidc(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    /**
     * @param saml Represents a SAML identity provider.
     * Structure is documented below.
     * @return builder
     */
    inline def saml(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderSamlArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderSamlArgs.builder
      builder.saml(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.WorkforcePoolProviderKeyArgs.Builder)
    /**
     * @param keyData Immutable. Public half of the asymmetric key.
     * Structure is documented below.
     * @return builder
     */
    inline def keyData(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderKeyKeyDataArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolProviderKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderKeyKeyDataArgs.builder
      builder.keyData(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.WorkloadIdentityPoolArgs.Builder)
    /**
     * @param attestationRules Defines which workloads can receive an identity within a pool. When an AttestationRule is
     * defined under a managed identity, matching workloads may receive that identity. A maximum of
     * 50 AttestationRules can be set.
     * Structure is documented below.
     * @return builder
     */
    inline def attestationRules(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolAttestationRuleArgs.Builder]*):
        com.pulumi.gcp.iam.WorkloadIdentityPoolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolAttestationRuleArgs.builder
      builder.attestationRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inlineCertificateIssuanceConfig Represents configuration for generating mutual TLS (mTLS) certificates for the identities
     * within this pool. Defines the Certificate Authority (CA) pool resources and configurations
     * required for issuance and rotation of mTLS workload certificates.
     * Structure is documented below.
     * @return builder
     */
    inline def inlineCertificateIssuanceConfig(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineCertificateIssuanceConfigArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineCertificateIssuanceConfigArgs.builder
      builder.inlineCertificateIssuanceConfig(args(argsBuilder).build)

    /**
     * @param inlineTrustConfig Represents config to add additional trusted trust domains. Defines configuration for extending
     * trust to additional trust domains. By establishing trust with another domain, the current
     * domain will recognize and accept certificates issued by entities within the trusted domains.
     * Note that a trust domain automatically trusts itself, eliminating the need for explicit
     * configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def inlineTrustConfig(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigArgs.builder
      builder.inlineTrustConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.WorkloadIdentityPoolManagedIdentityArgs.Builder)
    /**
     * @param attestationRules Defines which workloads can receive an identity within a pool. When an AttestationRule is
     * defined under a managed identity, matching workloads may receive that identity. A maximum of
     * 50 AttestationRules can be set.
     * Structure is documented below.
     * @return builder
     */
    inline def attestationRules(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolManagedIdentityAttestationRuleArgs.Builder]*):
        com.pulumi.gcp.iam.WorkloadIdentityPoolManagedIdentityArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolManagedIdentityAttestationRuleArgs.builder
      builder.attestationRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.Builder)
    /**
     * @param aws An Amazon Web Services identity provider. Not compatible with the property oidc or saml.
     * Structure is documented below.
     * @return builder
     */
    inline def aws(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderAwsArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderAwsArgs.builder
      builder.aws(args(argsBuilder).build)

    /**
     * @param oidc An OpenId Connect 1.0 identity provider. Not compatible with the property aws or saml.
     * Structure is documented below.
     * @return builder
     */
    inline def oidc(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderOidcArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    /**
     * @param saml An SAML 2.0 identity provider. Not compatible with the property oidc or aws.
     * Structure is documented below.
     * @return builder
     */
    inline def saml(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderSamlArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    /**
     * @param x509 An X.509-type identity provider represents a CA. It is trusted to assert a
     * client identity if the client has a certificate that chains up to this CA.
     * Structure is documented below.
     * @return builder
     */
    inline def x509(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509Args.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509Args.builder
      builder.x509(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleArgs.Builder)
    /**
     * @param availabilityCondition The availability condition further constrains the access allowed by the access boundary rule.
     * Structure is documented below.
     * @return builder
     */
    inline def availabilityCondition(args: Endofunction[com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleAvailabilityConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleAvailabilityConditionArgs.builder
      builder.availabilityCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleArgs.Builder)
    /**
     * @param accessBoundaryRule An access boundary rule in an IAM policy.
     * Structure is documented below.
     * @return builder
     */
    inline def accessBoundaryRule(args: Endofunction[com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleArgs.Builder]):
        com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleArgs.builder
      builder.accessBoundaryRule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyState.Builder)
    /**
     * @param rules Rules to be applied.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.DenyPolicyRuleArgs.Builder)
    /**
     * @param denyRule A deny rule in an IAM deny policy.
     * Structure is documented below.
     * @return builder
     */
    inline def denyRule(args: Endofunction[com.pulumi.gcp.iam.inputs.DenyPolicyRuleDenyRuleArgs.Builder]):
        com.pulumi.gcp.iam.inputs.DenyPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.DenyPolicyRuleDenyRuleArgs.builder
      builder.denyRule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.DenyPolicyRuleDenyRuleArgs.Builder)
    /**
     * @param denialCondition User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * Structure is documented below.
     * @return builder
     */
    inline def denialCondition(args: Endofunction[com.pulumi.gcp.iam.inputs.DenyPolicyRuleDenyRuleDenialConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.DenyPolicyRuleDenyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.DenyPolicyRuleDenyRuleDenialConditionArgs.builder
      builder.denialCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.DenyPolicyState.Builder)
    /**
     * @param rules Rules to be applied.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.iam.inputs.DenyPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.DenyPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.DenyPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsArgs.Builder)
    /**
     * @param rules A list of access policy rules.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsRuleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsRuleArgs.Builder)
    /**
     * @param conditions The conditions that determine whether this rule applies to a request.
     * Conditions are identified by their key, which is the FQDN of the service
     * that they are relevant to. For example:
     * 
     * Each rule is evaluated independently. If this rule does not apply
     * to a request, other rules might still apply.
     * Currently supported keys are as follows:
     * * `eventarc.googleapis.com`: Can use `CEL` functions that evaluate
     *   resource fields.
     * * `iam.googleapis.com`: Can use `CEL` functions that evaluate
     *   [resource
     *   tags](https://cloud.google.com/iam/help/conditions/resource-tags) and
     *   combine them using boolean and logical operators. Other functions and
     *   operators are not supported.
     *   Structure is documented below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsRuleConditionArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param operation Attributes that are used to determine whether this rule applies to a
     * request.
     * Structure is documented below.
     * @return builder
     */
    inline def operation(args: Endofunction[com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsRuleOperationArgs.Builder]):
        com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsRuleOperationArgs.builder
      builder.operation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.FolderAccessPolicyState.Builder)
    /**
     * @param details Access policy details.
     * Structure is documented below.
     * @return builder
     */
    inline def details(args: Endofunction[com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsArgs.Builder]):
        com.pulumi.gcp.iam.inputs.FolderAccessPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.FolderAccessPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.FoldersPolicyBindingState.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language
     * (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     * CEL are documented at https://github.com/google/cel-spec.
     * Example (Comparison):
     * title: \&#34;Summary size limit\&#34;
     * description: \&#34;Determines if a summary is less than 100 chars\&#34;
     * expression: \&#34;document.summary.size() &lt; 100\&#34;
     * Example
     * (Equality):
     * title: \&#34;Requestor is owner\&#34;
     * description: \&#34;Determines if requestor is the document owner\&#34;
     * expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     * (Logic):
     * title: \&#34;Public documents\&#34;
     * description: \&#34;Determine whether the document should be publicly visible\&#34;
     * expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     * Example (Data Manipulation):
     * title: \&#34;Notification string\&#34;
     * description: \&#34;Create a notification string with a timestamp.\&#34;
     * expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     * The exact variables and functions that may be referenced within an expression are
     * determined by the service that evaluates it. See the service documentation for
     * additional information.
     * Conditions are currently only supported when the bound policy is a principal access boundary policy.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.FoldersPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.FoldersPolicyBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.FoldersPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     * Exactly one of `principalSet` (for principal access boundary policy bindings) or
     * `resource` (for access policy bindings) must be set.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.iam.inputs.FoldersPolicyBindingTargetArgs.Builder]):
        com.pulumi.gcp.iam.inputs.FoldersPolicyBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.FoldersPolicyBindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsArgs.Builder)
    /**
     * @param rules A list of access policy rules.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsRuleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsRuleArgs.Builder)
    /**
     * @param conditions The conditions that determine whether this rule applies to a request.
     * Conditions are identified by their key, which is the FQDN of the service
     * that they are relevant to. For example:
     * 
     * Each rule is evaluated independently. If this rule does not apply
     * to a request, other rules might still apply.
     * Currently supported keys are as follows:
     * * `eventarc.googleapis.com`: Can use `CEL` functions that evaluate
     *   resource fields.
     * * `iam.googleapis.com`: Can use `CEL` functions that evaluate
     *   [resource
     *   tags](https://cloud.google.com/iam/help/conditions/resource-tags) and
     *   combine them using boolean and logical operators. Other functions and
     *   operators are not supported.
     *   Structure is documented below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsRuleConditionArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param operation Attributes that are used to determine whether this rule applies to a
     * request.
     * Structure is documented below.
     * @return builder
     */
    inline def operation(args: Endofunction[com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsRuleOperationArgs.Builder]):
        com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsRuleOperationArgs.builder
      builder.operation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyState.Builder)
    /**
     * @param details Access policy details.
     * Structure is documented below.
     * @return builder
     */
    inline def details(args: Endofunction[com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsArgs.Builder]):
        com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.OrganizationAccessPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingState.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language
     * (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     * CEL are documented at https://github.com/google/cel-spec.
     * Example (Comparison):
     * title: \&#34;Summary size limit\&#34;
     * description: \&#34;Determines if a summary is less than 100 chars\&#34;
     * expression: \&#34;document.summary.size() &lt; 100\&#34;
     * Example
     * (Equality):
     * title: \&#34;Requestor is owner\&#34;
     * description: \&#34;Determines if requestor is the document owner\&#34;
     * expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     * (Logic):
     * title: \&#34;Public documents\&#34;
     * description: \&#34;Determine whether the document should be publicly visible\&#34;
     * expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     * Example (Data Manipulation):
     * title: \&#34;Notification string\&#34;
     * description: \&#34;Create a notification string with a timestamp.\&#34;
     * expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     * The exact variables and functions that may be referenced within an expression are
     * determined by the service that evaluates it. See the service documentation for
     * additional information.
     * Conditions are currently only supported when the bound policy is a principal access boundary policy.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     * Exactly one of `principalSet` (for principal access boundary policy bindings) or
     * `resource` (for access policy bindings) must be set.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingTargetArgs.Builder]):
        com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsArgs.Builder)
    /**
     * @param rules A list of principal access boundary policy rules. The number of rules in a policy is limited to 500.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsRuleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyState.Builder)
    /**
     * @param details Principal access boundary policy details
     * Structure is documented below.
     * @return builder
     */
    inline def details(args: Endofunction[com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsArgs.Builder]):
        com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsArgs.Builder)
    /**
     * @param rules A list of access policy rules.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsRuleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsRuleArgs.Builder)
    /**
     * @param conditions The conditions that determine whether this rule applies to a request.
     * Conditions are identified by their key, which is the FQDN of the service
     * that they are relevant to. For example:
     * 
     * Each rule is evaluated independently. If this rule does not apply
     * to a request, other rules might still apply.
     * Currently supported keys are as follows:
     * * `eventarc.googleapis.com`: Can use `CEL` functions that evaluate
     *   resource fields.
     * * `iam.googleapis.com`: Can use `CEL` functions that evaluate
     *   [resource
     *   tags](https://cloud.google.com/iam/help/conditions/resource-tags) and
     *   combine them using boolean and logical operators. Other functions and
     *   operators are not supported.
     *   Structure is documented below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsRuleConditionArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param operation Attributes that are used to determine whether this rule applies to a
     * request.
     * Structure is documented below.
     * @return builder
     */
    inline def operation(args: Endofunction[com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsRuleOperationArgs.Builder]):
        com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsRuleOperationArgs.builder
      builder.operation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.ProjectAccessPolicyState.Builder)
    /**
     * @param details Access policy details.
     * Structure is documented below.
     * @return builder
     */
    inline def details(args: Endofunction[com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsArgs.Builder]):
        com.pulumi.gcp.iam.inputs.ProjectAccessPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.ProjectAccessPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingState.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language
     * (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     * CEL are documented at https://github.com/google/cel-spec.
     * Example (Comparison):
     * title: \&#34;Summary size limit\&#34;
     * description: \&#34;Determines if a summary is less than 100 chars\&#34;
     * expression: \&#34;document.summary.size() &lt; 100\&#34;
     * Example
     * (Equality):
     * title: \&#34;Requestor is owner\&#34;
     * description: \&#34;Determines if requestor is the document owner\&#34;
     * expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     * (Logic):
     * title: \&#34;Public documents\&#34;
     * description: \&#34;Determine whether the document should be publicly visible\&#34;
     * expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     * Example (Data Manipulation):
     * title: \&#34;Notification string\&#34;
     * description: \&#34;Create a notification string with a timestamp.\&#34;
     * expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     * The exact variables and functions that may be referenced within an expression are
     * determined by the service that evaluates it. See the service documentation for
     * additional information.
     * Conditions are currently only supported when the bound policy is a principal access boundary policy.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     * Exactly one of `principalSet` (for principal access boundary policy bindings) or
     * `resource` (for access policy bindings) must be set.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingTargetArgs.Builder]):
        com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsArgs.Builder)
    /**
     * @param allowedServices Services allowed for web sign-in with the workforce pool.
     * If not set by default there are no restrictions.
     * Structure is documented below.
     * @return builder
     */
    inline def allowedServices(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsAllowedServiceArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsAllowedServiceArgs.builder
      builder.allowedServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.Builder)
    /**
     * @param clientSecret The OAuth 2.0 client secret for retrieving extended attributes from the identity provider. Required to get the Access Token using client credentials grant flow.
     * @return builder
     */
    inline def clientSecret(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientClientSecretArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientClientSecretArgs.builder
      builder.clientSecret(args(argsBuilder).build)

    /**
     * @param queryParameters Represents the parameters to control which claims are fetched from an IdP.
     * @return builder
     */
    inline def queryParameters(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientQueryParametersArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientQueryParametersArgs.builder
      builder.queryParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientClientSecretArgs.Builder)
    /**
     * @param value The value of the client secret.
     * Structure is documented below.
     * @return builder
     */
    inline def value(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientClientSecretValueArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientClientSecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientClientSecretValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.Builder)
    /**
     * @param clientSecret The OAuth 2.0 client secret for retrieving extra attributes from the identity provider. Required to get the Access Token using client credentials grant flow.
     * @return builder
     */
    inline def clientSecret(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientClientSecretArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientClientSecretArgs.builder
      builder.clientSecret(args(argsBuilder).build)

    /**
     * @param queryParameters Represents the parameters to control which claims are fetched from an IdP.
     * @return builder
     */
    inline def queryParameters(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientQueryParametersArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientQueryParametersArgs.builder
      builder.queryParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientClientSecretArgs.Builder)
    /**
     * @param value The value of the client secret.
     * Structure is documented below.
     * @return builder
     */
    inline def value(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientClientSecretValueArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientClientSecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientClientSecretValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderKeyState.Builder)
    /**
     * @param keyData Immutable. Public half of the asymmetric key.
     * Structure is documented below.
     * @return builder
     */
    inline def keyData(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderKeyKeyDataArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderKeyState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderKeyKeyDataArgs.builder
      builder.keyData(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.Builder)
    /**
     * @param clientSecret The optional client secret. Required to enable Authorization Code flow for web sign-in.
     * Structure is documented below.
     * @return builder
     */
    inline def clientSecret(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcClientSecretArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcClientSecretArgs.builder
      builder.clientSecret(args(argsBuilder).build)

    /**
     * @param webSsoConfig Configuration for web single sign-on for the OIDC provider. Here, web sign-in refers to console sign-in and gcloud sign-in through the browser.
     * Structure is documented below.
     * @return builder
     */
    inline def webSsoConfig(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcWebSsoConfigArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcWebSsoConfigArgs.builder
      builder.webSsoConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcClientSecretArgs.Builder)
    /**
     * @param value The value of the client secret.
     * Structure is documented below.
     * @return builder
     */
    inline def value(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcClientSecretValueArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcClientSecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcClientSecretValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderState.Builder)
    /**
     * @param extendedAttributesOauth2Client (Optional, Deprecated)
     * The configuration for OAuth 2.0 client used to get the extended group
     * memberships for user identities. Only the `AZURE_AD_GROUPS_ID` attribute
     * type is supported. Extended groups supports a subset of Google Cloud
     * services. When the user accesses these services, extended group memberships
     * override the mapped `google.groups` attribute. Extended group memberships
     * cannot be used in attribute mapping or attribute condition expressions.
     * To keep extended group memberships up to date, extended groups are
     * retrieved when the user signs in and at regular intervals during the user&#39;s
     * active session. Each user identity in the workforce identity pool must map
     * to a unique Microsoft Entra ID user.
     * Structure is documented below.
     * 
     * &gt; **Warning:** `extendedAttributesOauth2Client` is deprecated. Use SCIM instead.
     * @return builder
     * @deprecated `extendedAttributesOauth2Client` is deprecated. Use SCIM instead.
     */
    @deprecated("`extendedAttributesOauth2Client` is deprecated. Use SCIM instead.") inline def extendedAttributesOauth2Client(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.builder
      builder.extendedAttributesOauth2Client(args(argsBuilder).build)

    /**
     * @param extraAttributesOauth2Client The configuration for OAuth 2.0 client used to get the additional user
     * attributes. This should be used when users can&#39;t get the desired claims
     * in authentication credentials. Currently this configuration is only
     * supported with SAML and OIDC protocol.
     * Structure is documented below.
     * @return builder
     */
    inline def extraAttributesOauth2Client(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.builder
      builder.extraAttributesOauth2Client(args(argsBuilder).build)

    /**
     * @param oidc Represents an OpenId Connect 1.0 identity provider.
     * Structure is documented below.
     * @return builder
     */
    inline def oidc(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    /**
     * @param saml Represents a SAML identity provider.
     * Structure is documented below.
     * @return builder
     */
    inline def saml(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderSamlArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderSamlArgs.builder
      builder.saml(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolState.Builder)
    /**
     * @param accessRestrictions Configure access restrictions on the workforce pool users. This is an optional field. If specified web
     * sign-in can be restricted to given set of services or programmatic sign-in can be disabled for pool users.
     * Structure is documented below.
     * @return builder
     */
    inline def accessRestrictions(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsArgs.builder
      builder.accessRestrictions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleArgs.Builder)
    /**
     * @param trustAnchors List of Trust Anchors to be used while performing validation against a given
     * `TrustStore`. The incoming end entity&#39;s certificate must be chained up to one of the
     * trust anchors here.
     * Structure is documented below.
     * @return builder
     */
    inline def trustAnchors(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleTrustAnchorArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleTrustAnchorArgs.builder
      builder.trustAnchors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigArgs.Builder)
    /**
     * @param additionalTrustBundles Maps specific trust domains (e.g., &#34;example.com&#34;) to their corresponding `TrustStore`
     * objects, which contain the trusted root certificates for that domain. There can be a
     * maximum of `10` trust domain entries in this map.
     * Note that a trust domain automatically trusts itself and don&#39;t need to be specified here.
     * If however, this `WorkloadIdentityPool`&#39;s trust domain contains any trust anchors in the
     * `additionalTrustBundles` map, those trust anchors will be *appended to* the Trust Bundle
     * automatically derived from your `InlineCertificateIssuanceConfig`&#39;s `caPools`.
     * Structure is documented below.
     * @return builder
     */
    inline def additionalTrustBundles(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleArgs.builder
      builder.additionalTrustBundles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolManagedIdentityState.Builder)
    /**
     * @param attestationRules Defines which workloads can receive an identity within a pool. When an AttestationRule is
     * defined under a managed identity, matching workloads may receive that identity. A maximum of
     * 50 AttestationRules can be set.
     * Structure is documented below.
     * @return builder
     */
    inline def attestationRules(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolManagedIdentityAttestationRuleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolManagedIdentityState.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolManagedIdentityAttestationRuleArgs.builder
      builder.attestationRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolNamespaceState.Builder)
    /**
     * @param ownerServices Defines the owner that is allowed to mutate this resource. If present, this resource can only
     * be mutated by the owner.
     * Structure is documented below.
     * @return builder
     */
    inline def ownerServices(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolNamespaceOwnerServiceArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolNamespaceState.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolNamespaceOwnerServiceArgs.builder
      builder.ownerServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderState.Builder)
    /**
     * @param aws An Amazon Web Services identity provider. Not compatible with the property oidc or saml.
     * Structure is documented below.
     * @return builder
     */
    inline def aws(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderAwsArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderAwsArgs.builder
      builder.aws(args(argsBuilder).build)

    /**
     * @param oidc An OpenId Connect 1.0 identity provider. Not compatible with the property aws or saml.
     * Structure is documented below.
     * @return builder
     */
    inline def oidc(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderOidcArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    /**
     * @param saml An SAML 2.0 identity provider. Not compatible with the property oidc or aws.
     * Structure is documented below.
     * @return builder
     */
    inline def saml(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderSamlArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    /**
     * @param x509 An X.509-type identity provider represents a CA. It is trusted to assert a
     * client identity if the client has a certificate that chains up to this CA.
     * Structure is documented below.
     * @return builder
     */
    inline def x509(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509Args.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509Args.builder
      builder.x509(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509Args.Builder)
    /**
     * @param trustStore A Trust store, use this trust store as a wrapper to config the trust
     * anchor and optional intermediate cas to help build the trust chain for
     * the incoming end entity certificate. Follow the x509 guidelines to
     * define those PEM encoded certs. Only 1 trust store is currently
     * supported.
     * @return builder
     */
    inline def trustStore(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509Args.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreArgs.builder
      builder.trustStore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreArgs.Builder)
    /**
     * @param intermediateCas Set of intermediate CA certificates used for building the trust chain to
     * trust anchor.
     * IMPORTANT: Intermediate CAs are only supported when configuring x509 federation.
     * Structure is documented below.
     * @return builder
     */
    inline def intermediateCas(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreIntermediateCaArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreIntermediateCaArgs.builder
      builder.intermediateCas(args.map(_(argsBuilder).build)*)

    /**
     * @param trustAnchors List of Trust Anchors to be used while performing validation
     * against a given TrustStore. The incoming end entity&#39;s certificate
     * must be chained up to one of the trust anchors here.
     * Structure is documented below.
     * @return builder
     */
    inline def trustAnchors(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs.builder
      builder.trustAnchors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolState.Builder)
    /**
     * @param attestationRules Defines which workloads can receive an identity within a pool. When an AttestationRule is
     * defined under a managed identity, matching workloads may receive that identity. A maximum of
     * 50 AttestationRules can be set.
     * Structure is documented below.
     * @return builder
     */
    inline def attestationRules(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolAttestationRuleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolState.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolAttestationRuleArgs.builder
      builder.attestationRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inlineCertificateIssuanceConfig Represents configuration for generating mutual TLS (mTLS) certificates for the identities
     * within this pool. Defines the Certificate Authority (CA) pool resources and configurations
     * required for issuance and rotation of mTLS workload certificates.
     * Structure is documented below.
     * @return builder
     */
    inline def inlineCertificateIssuanceConfig(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineCertificateIssuanceConfigArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineCertificateIssuanceConfigArgs.builder
      builder.inlineCertificateIssuanceConfig(args(argsBuilder).build)

    /**
     * @param inlineTrustConfig Represents config to add additional trusted trust domains. Defines configuration for extending
     * trust to additional trust domains. By establishing trust with another domain, the current
     * domain will recognize and accept certificates issued by entities within the trusted domains.
     * Note that a trust domain automatically trusts itself, eliminating the need for explicit
     * configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def inlineTrustConfig(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigArgs.builder
      builder.inlineTrustConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityServiceAgentState.Builder)
    /**
     * @param serviceAgents The list of ServiceAgents generated by the API call.
     * Structure is documented below.
     * @return builder
     */
    inline def serviceAgents(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityServiceAgentServiceAgentArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityServiceAgentState.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityServiceAgentServiceAgentArgs.builder
      builder.serviceAgents(args.map(_(argsBuilder).build)*)
