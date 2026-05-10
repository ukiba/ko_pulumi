package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object iam:
  /**
   * Three different resources help you manage your IAM policy for Cloud IAM WorkforcePool. Each of these resources serves a different use case:
   * 
   *  * `gcp.iam.WorkforcePoolIamPolicy`: Authoritative. Sets the IAM policy for the workforcepool and replaces any existing policy already attached.
   *  * `gcp.iam.WorkforcePoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workforcepool are preserved.
   *  * `gcp.iam.WorkforcePoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workforcepool are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.iam.WorkforcePoolIamPolicy`: Retrieves the IAM policy for the workforcepool
   * 
   *  &gt; **Note:** `gcp.iam.WorkforcePoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkforcePoolIamBinding` and `gcp.iam.WorkforcePoolIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.iam.WorkforcePoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkforcePoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.iam.WorkforcePoolIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workforcePoolAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkforcePoolIamPolicy("policy", WorkforcePoolIamPolicyArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.iam.WorkforcePoolIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkforcePoolIamBinding("binding", WorkforcePoolIamBindingArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .role("roles/iam.workforcePoolAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.iam.WorkforcePoolIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamMember;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkforcePoolIamMember("member", WorkforcePoolIamMemberArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .role("roles/iam.workforcePoolAdmin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Cloud IAM WorkforcePool
   * 
   *  Three different resources help you manage your IAM policy for Cloud IAM WorkforcePool. Each of these resources serves a different use case:
   * 
   *  * `gcp.iam.WorkforcePoolIamPolicy`: Authoritative. Sets the IAM policy for the workforcepool and replaces any existing policy already attached.
   *  * `gcp.iam.WorkforcePoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workforcepool are preserved.
   *  * `gcp.iam.WorkforcePoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workforcepool are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.iam.WorkforcePoolIamPolicy`: Retrieves the IAM policy for the workforcepool
   * 
   *  &gt; **Note:** `gcp.iam.WorkforcePoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkforcePoolIamBinding` and `gcp.iam.WorkforcePoolIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.iam.WorkforcePoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkforcePoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.iam.WorkforcePoolIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workforcePoolAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkforcePoolIamPolicy("policy", WorkforcePoolIamPolicyArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.iam.WorkforcePoolIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkforcePoolIamBinding("binding", WorkforcePoolIamBindingArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .role("roles/iam.workforcePoolAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.iam.WorkforcePoolIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamMember;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkforcePoolIamMember("member", WorkforcePoolIamMemberArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .role("roles/iam.workforcePoolAdmin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * locations/{{location}}/workforcePools/{{workforce_pool_id}}
   *  * {{location}}/{{workforce_pool_id}}
   *  * {{workforce_pool_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud IAM workforcepool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_iam_workforce_pool_iam_member.editor &#34;locations/{{location}}/workforcePools/{{workforce_pool_id}} roles/iam.workforcePoolViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_iam_workforce_pool_iam_binding.editor &#34;locations/{{location}}/workforcePools/{{workforce_pool_id}} roles/iam.workforcePoolViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:iam/workforcePoolIamMember:WorkforcePoolIamMember editor locations/{{location}}/workforcePools/{{workforce_pool_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkforcePoolIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a managed identity for a workload identity pool namespace.
   * 
   *  To get more information about WorkloadIdentityPoolManagedIdentity, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.workloadIdentityPools.namespaces.managedIdentities)
   *  * How-to Guides
   *      * [Configure managed workload identity authentication for Compute Engine](https://cloud.google.com/iam/docs/create-managed-workload-identities)
   *      * [Configure managed workload identity authentication for GKE](https://cloud.google.com/iam/docs/create-managed-workload-identities-gke)
   */
  def WorkloadIdentityPoolManagedIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolManagedIdentityArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolManagedIdentityArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPoolManagedIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.iam.PrincipalAccessBoundaryPolicyArgs.Builder)
    /**
     * @param details Principal access boundary policy details
     *  Structure is documented below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsArgs.Builder]):
        com.pulumi.gcp.iam.PrincipalAccessBoundaryPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  /**
   * Represents an OAuth Client Credential. Used to authenticate an OAuth Client
   *  while accessing Google Cloud resources on behalf of a Workforce Identity Federation user
   *  by using OAuth 2.0 Protocol.
   * 
   *  To get more information about OauthClientCredential, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.oauthClients.credentials)
   *  * How-to Guides
   *      * [Managing OAuth clients](https://cloud.google.com/iam/docs/workforce-manage-oauth-app#manage-clients)
   */
  def OauthClientCredential(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.OauthClientCredentialArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.OauthClientCredentialArgs.builder
    com.pulumi.gcp.iam.OauthClientCredential(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.iam.WorkforcePoolProviderArgs.Builder)
    /**
     * @param extendedAttributesOauth2Client (Optional, Deprecated)
     *  The configuration for OAuth 2.0 client used to get the extended group
     *  memberships for user identities. Only the `AZURE_AD_GROUPS_ID` attribute
     *  type is supported. Extended groups supports a subset of Google Cloud
     *  services. When the user accesses these services, extended group memberships
     *  override the mapped `google.groups` attribute. Extended group memberships
     *  cannot be used in attribute mapping or attribute condition expressions.
     *  To keep extended group memberships up to date, extended groups are
     *  retrieved when the user signs in and at regular intervals during the user&#39;s
     *  active session. Each user identity in the workforce identity pool must map
     *  to a unique Microsoft Entra ID user.
     *  Structure is documented below.
     * 
     *  &gt; **Warning:** `extendedAttributesOauth2Client` is deprecated. Use SCIM instead.
     * @return builder
     * @deprecated `extendedAttributesOauth2Client` is deprecated. Use SCIM instead.
     */
    @deprecated def extendedAttributesOauth2Client(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.builder
      builder.extendedAttributesOauth2Client(args(argsBuilder).build)

    /**
     * @param extraAttributesOauth2Client The configuration for OAuth 2.0 client used to get the additional user
     *  attributes. This should be used when users can&#39;t get the desired claims
     *  in authentication credentials. Currently this configuration is only
     *  supported with SAML and OIDC protocol.
     *  Structure is documented below.
     * @return builder
     */
    def extraAttributesOauth2Client(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.builder
      builder.extraAttributesOauth2Client(args(argsBuilder).build)

    /**
     * @param oidc Represents an OpenId Connect 1.0 identity provider.
     *  Structure is documented below.
     * @return builder
     */
    def oidc(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    /**
     * @param saml Represents a SAML identity provider.
     *  Structure is documented below.
     * @return builder
     */
    def saml(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderSamlArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderSamlArgs.builder
      builder.saml(args(argsBuilder).build)

  /** A Service Agent within the Workload Identity API. */
  def WorkloadIdentityServiceAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityServiceAgentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityServiceAgentArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityServiceAgent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.iam.WorkloadIdentityPoolArgs.Builder)
    /**
     * @param attestationRules Defines which workloads can receive an identity within a pool. When an AttestationRule is
     *  defined under a managed identity, matching workloads may receive that identity. A maximum of
     *  50 AttestationRules can be set.
     *  Structure is documented below.
     * @return builder
     */
    def attestationRules(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolAttestationRuleArgs.Builder]*):
        com.pulumi.gcp.iam.WorkloadIdentityPoolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolAttestationRuleArgs.builder
      builder.attestationRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inlineCertificateIssuanceConfig Represents configuration for generating mutual TLS (mTLS) certificates for the identities
     *  within this pool. Defines the Certificate Authority (CA) pool resources and configurations
     *  required for issuance and rotation of mTLS workload certificates.
     *  Structure is documented below.
     * @return builder
     */
    def inlineCertificateIssuanceConfig(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineCertificateIssuanceConfigArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineCertificateIssuanceConfigArgs.builder
      builder.inlineCertificateIssuanceConfig(args(argsBuilder).build)

    /**
     * @param inlineTrustConfig Represents config to add additional trusted trust domains. Defines configuration for extending
     *  trust to additional trust domains. By establishing trust with another domain, the current
     *  domain will recognize and accept certificates issued by entities within the trusted domains.
     *  Note that a trust domain automatically trusts itself, eliminating the need for explicit
     *  configuration.
     *  Structure is documented below.
     * @return builder
     */
    def inlineTrustConfig(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigArgs.builder
      builder.inlineTrustConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.AccessBoundaryPolicyArgs.Builder)
    /**
     * @param rules Rules to be applied.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.iam.AccessBoundaryPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.FoldersPolicyBindingArgs.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language
     *  (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     *  CEL are documented at https://github.com/google/cel-spec.
     *  Example (Comparison):
     *  title: \&#34;Summary size limit\&#34;
     *  description: \&#34;Determines if a summary is less than 100 chars\&#34;
     *  expression: \&#34;document.summary.size() &lt; 100\&#34;
     *  Example
     *  (Equality):
     *  title: \&#34;Requestor is owner\&#34;
     *  description: \&#34;Determines if requestor is the document owner\&#34;
     *  expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     *  (Logic):
     *  title: \&#34;Public documents\&#34;
     *  description: \&#34;Determine whether the document should be publicly visible\&#34;
     *  expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     *  Example (Data Manipulation):
     *  title: \&#34;Notification string\&#34;
     *  description: \&#34;Create a notification string with a timestamp.\&#34;
     *  expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     *  The exact variables and functions that may be referenced within an expression are
     *  determined by the service that evaluates it. See the service documentation for
     *  additional information.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.FoldersPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.FoldersPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.FoldersPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     *  Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.iam.inputs.FoldersPolicyBindingTargetArgs.Builder]):
        com.pulumi.gcp.iam.FoldersPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.FoldersPolicyBindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud IAM WorkforcePool. Each of these resources serves a different use case:
   * 
   *  * `gcp.iam.WorkforcePoolIamPolicy`: Authoritative. Sets the IAM policy for the workforcepool and replaces any existing policy already attached.
   *  * `gcp.iam.WorkforcePoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workforcepool are preserved.
   *  * `gcp.iam.WorkforcePoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workforcepool are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.iam.WorkforcePoolIamPolicy`: Retrieves the IAM policy for the workforcepool
   * 
   *  &gt; **Note:** `gcp.iam.WorkforcePoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkforcePoolIamBinding` and `gcp.iam.WorkforcePoolIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.iam.WorkforcePoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkforcePoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.iam.WorkforcePoolIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workforcePoolAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkforcePoolIamPolicy("policy", WorkforcePoolIamPolicyArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.iam.WorkforcePoolIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkforcePoolIamBinding("binding", WorkforcePoolIamBindingArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .role("roles/iam.workforcePoolAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.iam.WorkforcePoolIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamMember;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkforcePoolIamMember("member", WorkforcePoolIamMemberArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .role("roles/iam.workforcePoolAdmin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Cloud IAM WorkforcePool
   * 
   *  Three different resources help you manage your IAM policy for Cloud IAM WorkforcePool. Each of these resources serves a different use case:
   * 
   *  * `gcp.iam.WorkforcePoolIamPolicy`: Authoritative. Sets the IAM policy for the workforcepool and replaces any existing policy already attached.
   *  * `gcp.iam.WorkforcePoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workforcepool are preserved.
   *  * `gcp.iam.WorkforcePoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workforcepool are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.iam.WorkforcePoolIamPolicy`: Retrieves the IAM policy for the workforcepool
   * 
   *  &gt; **Note:** `gcp.iam.WorkforcePoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkforcePoolIamBinding` and `gcp.iam.WorkforcePoolIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.iam.WorkforcePoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkforcePoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.iam.WorkforcePoolIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workforcePoolAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkforcePoolIamPolicy("policy", WorkforcePoolIamPolicyArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.iam.WorkforcePoolIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkforcePoolIamBinding("binding", WorkforcePoolIamBindingArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .role("roles/iam.workforcePoolAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.iam.WorkforcePoolIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamMember;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkforcePoolIamMember("member", WorkforcePoolIamMemberArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .role("roles/iam.workforcePoolAdmin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * locations/{{location}}/workforcePools/{{workforce_pool_id}}
   *  * {{location}}/{{workforce_pool_id}}
   *  * {{workforce_pool_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud IAM workforcepool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_iam_workforce_pool_iam_member.editor &#34;locations/{{location}}/workforcePools/{{workforce_pool_id}} roles/iam.workforcePoolViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_iam_workforce_pool_iam_binding.editor &#34;locations/{{location}}/workforcePools/{{workforce_pool_id}} roles/iam.workforcePoolViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:iam/workforcePoolIamPolicy:WorkforcePoolIamPolicy editor locations/{{location}}/workforcePools/{{workforce_pool_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkforcePoolIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.iam.WorkforcePoolProviderKeyArgs.Builder)
    /**
     * @param keyData Immutable. Public half of the asymmetric key.
     *  Structure is documented below.
     * @return builder
     */
    def keyData(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderKeyKeyDataArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolProviderKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderKeyKeyDataArgs.builder
      builder.keyData(args(argsBuilder).build)

  /**
   * Represents an OAuth Client. Used to access Google Cloud resources on behalf of a
   *  Workforce Identity Federation user by using OAuth 2.0 Protocol to obtain an access
   *  token from Google Cloud.
   * 
   *  To get more information about OauthClient, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.oauthClients)
   *  * How-to Guides
   *      * [Managing OAuth clients](https://cloud.google.com/iam/docs/workforce-manage-oauth-app#manage-clients)
   */
  def OauthClient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.OauthClientArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.OauthClientArgs.builder
    com.pulumi.gcp.iam.OauthClient(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.iam.DenyPolicyArgs.Builder)
    /**
     * @param rules Rules to be applied.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.iam.inputs.DenyPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.iam.DenyPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.DenyPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud IAM WorkforcePool. Each of these resources serves a different use case:
   * 
   *  * `gcp.iam.WorkforcePoolIamPolicy`: Authoritative. Sets the IAM policy for the workforcepool and replaces any existing policy already attached.
   *  * `gcp.iam.WorkforcePoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workforcepool are preserved.
   *  * `gcp.iam.WorkforcePoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workforcepool are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.iam.WorkforcePoolIamPolicy`: Retrieves the IAM policy for the workforcepool
   * 
   *  &gt; **Note:** `gcp.iam.WorkforcePoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkforcePoolIamBinding` and `gcp.iam.WorkforcePoolIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.iam.WorkforcePoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkforcePoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.iam.WorkforcePoolIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workforcePoolAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkforcePoolIamPolicy("policy", WorkforcePoolIamPolicyArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.iam.WorkforcePoolIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkforcePoolIamBinding("binding", WorkforcePoolIamBindingArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .role("roles/iam.workforcePoolAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.iam.WorkforcePoolIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamMember;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkforcePoolIamMember("member", WorkforcePoolIamMemberArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .role("roles/iam.workforcePoolAdmin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Cloud IAM WorkforcePool
   * 
   *  Three different resources help you manage your IAM policy for Cloud IAM WorkforcePool. Each of these resources serves a different use case:
   * 
   *  * `gcp.iam.WorkforcePoolIamPolicy`: Authoritative. Sets the IAM policy for the workforcepool and replaces any existing policy already attached.
   *  * `gcp.iam.WorkforcePoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workforcepool are preserved.
   *  * `gcp.iam.WorkforcePoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workforcepool are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.iam.WorkforcePoolIamPolicy`: Retrieves the IAM policy for the workforcepool
   * 
   *  &gt; **Note:** `gcp.iam.WorkforcePoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkforcePoolIamBinding` and `gcp.iam.WorkforcePoolIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.iam.WorkforcePoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkforcePoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.iam.WorkforcePoolIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workforcePoolAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkforcePoolIamPolicy("policy", WorkforcePoolIamPolicyArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.iam.WorkforcePoolIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkforcePoolIamBinding("binding", WorkforcePoolIamBindingArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .role("roles/iam.workforcePoolAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.iam.WorkforcePoolIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamMember;
   *  import com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkforcePoolIamMember("member", WorkforcePoolIamMemberArgs.builder()
   *              .location(example.location())
   *              .workforcePoolId(example.workforcePoolId())
   *              .role("roles/iam.workforcePoolAdmin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * locations/{{location}}/workforcePools/{{workforce_pool_id}}
   *  * {{location}}/{{workforce_pool_id}}
   *  * {{workforce_pool_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud IAM workforcepool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_iam_workforce_pool_iam_member.editor &#34;locations/{{location}}/workforcePools/{{workforce_pool_id}} roles/iam.workforcePoolViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_iam_workforce_pool_iam_binding.editor &#34;locations/{{location}}/workforcePools/{{workforce_pool_id}} roles/iam.workforcePoolViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:iam/workforcePoolIamBinding:WorkforcePoolIamBinding editor locations/{{location}}/workforcePools/{{workforce_pool_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkforcePoolIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.iam.OrganizationsPolicyBindingArgs.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language
     *  (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     *  CEL are documented at https://github.com/google/cel-spec.
     *  Example (Comparison):
     *  title: \&#34;Summary size limit\&#34;
     *  description: \&#34;Determines if a summary is less than 100 chars\&#34;
     *  expression: \&#34;document.summary.size() &lt; 100\&#34;
     *  Example
     *  (Equality):
     *  title: \&#34;Requestor is owner\&#34;
     *  description: \&#34;Determines if requestor is the document owner\&#34;
     *  expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     *  (Logic):
     *  title: \&#34;Public documents\&#34;
     *  description: \&#34;Determine whether the document should be publicly visible\&#34;
     *  expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     *  Example (Data Manipulation):
     *  title: \&#34;Notification string\&#34;
     *  description: \&#34;Create a notification string with a timestamp.\&#34;
     *  expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     *  The exact variables and functions that may be referenced within an expression are
     *  determined by the service that evaluates it. See the service documentation for
     *  additional information.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.OrganizationsPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     *  Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingTargetArgs.Builder]):
        com.pulumi.gcp.iam.OrganizationsPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  /**
   * A configuration for an external identity provider.
   * 
   *  To get more information about WorkloadIdentityPoolProvider, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.workloadIdentityPools.providers)
   *  * How-to Guides
   *      * [Managing workload identity providers](https://cloud.google.com/iam/docs/manage-workload-identity-pools-providers#managing_workload_identity_providers)
   */
  def WorkloadIdentityPoolProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPoolProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.iam.WorkloadIdentityPoolManagedIdentityArgs.Builder)
    /**
     * @param attestationRules Defines which workloads can receive an identity within a pool. When an AttestationRule is
     *  defined under a managed identity, matching workloads may receive that identity. A maximum of
     *  50 AttestationRules can be set.
     *  Structure is documented below.
     * @return builder
     */
    def attestationRules(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolManagedIdentityAttestationRuleArgs.Builder]*):
        com.pulumi.gcp.iam.WorkloadIdentityPoolManagedIdentityArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolManagedIdentityAttestationRuleArgs.builder
      builder.attestationRules(args.map(_(argsBuilder).build)*)

  /**
   * Represents a SCIM tenant configuration for a Workforce Pool Provider.
   *  The SCIM tenant configuration allows for the synchronization of user/group identities from external identity provider into Google Cloud using the System for Cross-domain Identity Management (SCIM) protocol.
   * 
   *  To get more information about WorkforcePoolProviderScimTenant, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/iam/docs/reference/rest/v1/locations.workforcePools.providers.scimTenants)
   *  * How-to Guides
   *      * [Configure a SCIM Tenant](https://cloud.google.com/iam/docs/workforce-sign-in-microsoft-entra-id-scalable-groups?group_type=extended#extended-attributes)
   */
  def WorkforcePoolProviderScimTenant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolProviderScimTenantArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolProviderScimTenantArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolProviderScimTenant(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a collection of external workforces. Provides namespaces for
   *  federated users that can be referenced in IAM policies.
   * 
   *  To get more information about WorkforcePool, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/locations.workforcePools)
   *  * How-to Guides
   *      * [Manage pools](https://cloud.google.com/iam/docs/manage-workforce-identity-pools-providers#manage_pools)
   * 
   *  &gt; **Note:** Ask your Google Cloud account team to request access to workforce identity federation for
   *  your billing/quota project. The account team notifies you when the project is granted access.
   */
  def WorkforcePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolArgs.builder
    com.pulumi.gcp.iam.WorkforcePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a collection of access boundary policies to apply to a given resource.
   *  **NOTE**: This is a private feature and users should contact GCP support
   *  if they would like to test it.
   */
  def AccessBoundaryPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.AccessBoundaryPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.iam.AccessBoundaryPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.iam.AccessBoundaryPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.Builder)
    /**
     * @param aws An Amazon Web Services identity provider. Not compatible with the property oidc or saml.
     *  Structure is documented below.
     * @return builder
     */
    def aws(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderAwsArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderAwsArgs.builder
      builder.aws(args(argsBuilder).build)

    /**
     * @param oidc An OpenId Connect 1.0 identity provider. Not compatible with the property aws or saml.
     *  Structure is documented below.
     * @return builder
     */
    def oidc(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderOidcArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    /**
     * @param saml An SAML 2.0 identity provider. Not compatible with the property oidc or aws.
     *  Structure is documented below.
     * @return builder
     */
    def saml(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderSamlArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    /**
     * @param x509 An X.509-type identity provider represents a CA. It is trusted to assert a
     *  client identity if the client has a certificate that chains up to this CA.
     *  Structure is documented below.
     * @return builder
     */
    def x509(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509Args.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509Args.builder
      builder.x509(args(argsBuilder).build)

  /**
   * A configuration for an external identity provider.
   * 
   *  To get more information about WorkforcePoolProvider, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/locations.workforcePools.providers)
   *  * How-to Guides
   *      * [Configure a provider within the workforce pool](https://cloud.google.com/iam/docs/manage-workforce-identity-pools-providers#configure_a_provider_within_the_workforce_pool)
   * 
   *  &gt; **Note:** Ask your Google Cloud account team to request access to workforce identity federation for your
   *  billing/quota project. The account team notifies you when the project is granted access.
   */
  def WorkforcePoolProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolProviderArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolProviderArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A policy binding to an organization. This is a Terraform resource, and maps to a policy binding resource in GCP.
   * 
   *  To get more information about OrganizationsPolicyBinding, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v3/organizations.locations.policyBindings)
   *  * How-to Guides
   *      * [Apply a policy binding](https://cloud.google.com/iam/docs/principal-access-boundary-policies-create#create_binding)
   */
  def OrganizationsPolicyBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.OrganizationsPolicyBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.OrganizationsPolicyBindingArgs.builder
    com.pulumi.gcp.iam.OrganizationsPolicyBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.iam.WorkforcePoolArgs.Builder)
    /**
     * @param accessRestrictions Configure access restrictions on the workforce pool users. This is an optional field. If specified web
     *  sign-in can be restricted to given set of services or programmatic sign-in can be disabled for pool users.
     *  Structure is documented below.
     * @return builder
     */
    def accessRestrictions(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsArgs.builder
      builder.accessRestrictions(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud IAM WorkloadIdentityPool. Each of these resources serves a different use case:
   * 
   *  * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Authoritative. Sets the IAM policy for the workloadidentitypool and replaces any existing policy already attached.
   *  * `gcp.iam.WorkloadIdentityPoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workloadidentitypool are preserved.
   *  * `gcp.iam.WorkloadIdentityPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workloadidentitypool are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Retrieves the IAM policy for the workloadidentitypool
   * 
   *  &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkloadIdentityPoolIamBinding` and `gcp.iam.WorkloadIdentityPoolIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkloadIdentityPoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.iam.WorkloadIdentityPoolIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workloadIdentityPoolViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workloadIdentityPoolViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.iam.WorkloadIdentityPoolIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   *  import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(WorkloadIdentityPoolIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.iam.WorkloadIdentityPoolIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   *  import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(WorkloadIdentityPoolIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Cloud IAM WorkloadIdentityPool
   * 
   *  Three different resources help you manage your IAM policy for Cloud IAM WorkloadIdentityPool. Each of these resources serves a different use case:
   * 
   *  * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Authoritative. Sets the IAM policy for the workloadidentitypool and replaces any existing policy already attached.
   *  * `gcp.iam.WorkloadIdentityPoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workloadidentitypool are preserved.
   *  * `gcp.iam.WorkloadIdentityPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workloadidentitypool are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Retrieves the IAM policy for the workloadidentitypool
   * 
   *  &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkloadIdentityPoolIamBinding` and `gcp.iam.WorkloadIdentityPoolIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkloadIdentityPoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.iam.WorkloadIdentityPoolIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workloadIdentityPoolViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workloadIdentityPoolViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.iam.WorkloadIdentityPoolIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   *  import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(WorkloadIdentityPoolIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.iam.WorkloadIdentityPoolIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   *  import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(WorkloadIdentityPoolIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}
   *  * {{project}}/{{workload_identity_pool_id}}
   *  * {{workload_identity_pool_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud IAM workloadidentitypool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_iam_workload_identity_pool_iam_member.editor &#34;projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}} roles/iam.workloadIdentityPoolViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_iam_workload_identity_pool_iam_binding.editor &#34;projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}} roles/iam.workloadIdentityPoolViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:iam/workloadIdentityPoolIamPolicy:WorkloadIdentityPoolIamPolicy editor projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkloadIdentityPoolIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type IamFunctions = com.pulumi.gcp.iam.IamFunctions
  object IamFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.iam.IamFunctions.*
  extension (self: IamFunctions.type)
    /**
     * Use this data source to get information about a Google IAM Role.
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.iam.IamFunctions;
     *  import com.pulumi.gcp.iam.inputs.GetRuleArgs;
     *  import java.util.List;
     *  import java.util.ArrayList;
     *  import java.util.Map;
     *  import java.io.File;
     *  import java.nio.file.Files;
     *  import java.nio.file.Paths;
     * 
     *  public class App {
     *      public static void main(String[] args) {
     *          Pulumi.run(App::stack);
     *      }
     * 
     *      public static void stack(Context ctx) {
     *          final var roleinfo = IamFunctions.getRule(GetRuleArgs.builder()
     *              .name("roles/compute.viewer")
     *              .build());
     * 
     *          ctx.export("theRolePermissions", roleinfo.includedPermissions());
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getRule(args: Endofunction[com.pulumi.gcp.iam.inputs.GetRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetRuleResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetRuleArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getRule(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Google IAM Role.
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.iam.IamFunctions;
     *  import com.pulumi.gcp.iam.inputs.GetRuleArgs;
     *  import java.util.List;
     *  import java.util.ArrayList;
     *  import java.util.Map;
     *  import java.io.File;
     *  import java.nio.file.Files;
     *  import java.nio.file.Paths;
     * 
     *  public class App {
     *      public static void main(String[] args) {
     *          Pulumi.run(App::stack);
     *      }
     * 
     *      public static void stack(Context ctx) {
     *          final var roleinfo = IamFunctions.getRule(GetRuleArgs.builder()
     *              .name("roles/compute.viewer")
     *              .build());
     * 
     *          ctx.export("theRolePermissions", roleinfo.includedPermissions());
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getRulePlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetRuleResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetRulePlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getRulePlain(args(argsBuilder).build)

    /** Retrieve a list of testable permissions for a resource. Testable permissions mean the permissions that user can add or remove in a role at a given resource. The resource can be referenced either via the full resource name or via a URI. */
    def getTestablePermissions(args: Endofunction[com.pulumi.gcp.iam.inputs.GetTestablePermissionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetTestablePermissionsResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetTestablePermissionsArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getTestablePermissions(args(argsBuilder).build)

    /** Retrieve a list of testable permissions for a resource. Testable permissions mean the permissions that user can add or remove in a role at a given resource. The resource can be referenced either via the full resource name or via a URI. */
    def getTestablePermissionsPlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetTestablePermissionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetTestablePermissionsResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetTestablePermissionsPlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getTestablePermissionsPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for workforcepool */
    def getWorkforcePoolIamPolicy(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkforcePoolIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetWorkforcePoolIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkforcePoolIamPolicyArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkforcePoolIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for workforcepool */
    def getWorkforcePoolIamPolicyPlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkforcePoolIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetWorkforcePoolIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkforcePoolIamPolicyPlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkforcePoolIamPolicyPlain(args(argsBuilder).build)

    /**
     * Get a IAM workload identity pool from Google Cloud by its id.
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     * 
     *  &gt; **Note:** The following resource requires the Beta IAM role `roles/iam.workloadIdentityPoolAdmin` in order to succeed. `OWNER` and `EDITOR` roles do not include the necessary permissions.
     */
    def getWorkloadIdentityPool(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPool(args(argsBuilder).build)

    /**
     * Get a IAM workload identity pool from Google Cloud by its id.
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     * 
     *  &gt; **Note:** The following resource requires the Beta IAM role `roles/iam.workloadIdentityPoolAdmin` in order to succeed. `OWNER` and `EDITOR` roles do not include the necessary permissions.
     */
    def getWorkloadIdentityPoolPlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolPlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for workloadidentitypool */
    def getWorkloadIdentityPoolIamPolicy(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolIamPolicyArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for workloadidentitypool */
    def getWorkloadIdentityPoolIamPolicyPlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolIamPolicyPlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolIamPolicyPlain(args(argsBuilder).build)

    /**
     * Get a IAM workload identity provider from Google Cloud by its id.
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getWorkloadIdentityPoolProvider(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolProviderArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolProviderResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolProviderArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolProvider(args(argsBuilder).build)

    /**
     * Get a IAM workload identity provider from Google Cloud by its id.
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getWorkloadIdentityPoolProviderPlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolProviderPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolProviderResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolProviderPlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolProviderPlain(args(argsBuilder).build)

  /**
   * An IAM Principal Access Boundary Policy resource. This resource has no effect on accesses until is bound to a target through policy bindings.
   *  You can see further documentation on policy bindings in:
   *    - [Organizations](https://www.terraform.io/providers/hashicorp/google/latest/docs/resources/iam_organizations_policy_binding)
   *    - [Folders](https://www.terraform.io/providers/hashicorp/google/latest/docs/resources/iam_folders_policy_binding)
   *    - [Projects](https://www.terraform.io/providers/hashicorp/google/latest/docs/resources/iam_projects_policy_binding)
   * 
   *  To get more information about PrincipalAccessBoundaryPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v3/organizations.locations.principalAccessBoundaryPolicies)
   *  * How-to Guides
   *      * [Create and apply Principal Access Boundaries](https://cloud.google.com/iam/docs/principal-access-boundary-policies-create)
   */
  def PrincipalAccessBoundaryPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.PrincipalAccessBoundaryPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.PrincipalAccessBoundaryPolicyArgs.builder
    com.pulumi.gcp.iam.PrincipalAccessBoundaryPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A policy binding to a folder. This is a Terraform resource, and maps to a policy binding resource in GCP.
   * 
   *  To get more information about FoldersPolicyBinding, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v3/folders.locations.policyBindings)
   *  * How-to Guides
   *      * [Apply a policy binding](https://cloud.google.com/iam/docs/principal-access-boundary-policies-create#create_binding)
   */
  def FoldersPolicyBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.FoldersPolicyBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.FoldersPolicyBindingArgs.builder
    com.pulumi.gcp.iam.FoldersPolicyBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud IAM WorkloadIdentityPool. Each of these resources serves a different use case:
   * 
   *  * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Authoritative. Sets the IAM policy for the workloadidentitypool and replaces any existing policy already attached.
   *  * `gcp.iam.WorkloadIdentityPoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workloadidentitypool are preserved.
   *  * `gcp.iam.WorkloadIdentityPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workloadidentitypool are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Retrieves the IAM policy for the workloadidentitypool
   * 
   *  &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkloadIdentityPoolIamBinding` and `gcp.iam.WorkloadIdentityPoolIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkloadIdentityPoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.iam.WorkloadIdentityPoolIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workloadIdentityPoolViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workloadIdentityPoolViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.iam.WorkloadIdentityPoolIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   *  import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(WorkloadIdentityPoolIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.iam.WorkloadIdentityPoolIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   *  import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(WorkloadIdentityPoolIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Cloud IAM WorkloadIdentityPool
   * 
   *  Three different resources help you manage your IAM policy for Cloud IAM WorkloadIdentityPool. Each of these resources serves a different use case:
   * 
   *  * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Authoritative. Sets the IAM policy for the workloadidentitypool and replaces any existing policy already attached.
   *  * `gcp.iam.WorkloadIdentityPoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workloadidentitypool are preserved.
   *  * `gcp.iam.WorkloadIdentityPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workloadidentitypool are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Retrieves the IAM policy for the workloadidentitypool
   * 
   *  &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkloadIdentityPoolIamBinding` and `gcp.iam.WorkloadIdentityPoolIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkloadIdentityPoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.iam.WorkloadIdentityPoolIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workloadIdentityPoolViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workloadIdentityPoolViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.iam.WorkloadIdentityPoolIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   *  import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(WorkloadIdentityPoolIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.iam.WorkloadIdentityPoolIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   *  import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(WorkloadIdentityPoolIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}
   *  * {{project}}/{{workload_identity_pool_id}}
   *  * {{workload_identity_pool_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud IAM workloadidentitypool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_iam_workload_identity_pool_iam_member.editor &#34;projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}} roles/iam.workloadIdentityPoolViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_iam_workload_identity_pool_iam_binding.editor &#34;projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}} roles/iam.workloadIdentityPoolViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:iam/workloadIdentityPoolIamBinding:WorkloadIdentityPoolIamBinding editor projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkloadIdentityPoolIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a collection of denial policies to apply to a given resource.
   * 
   *  To get more information about DenyPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v2/policies)
   *  * How-to Guides
   *      * [Permissions supported in deny policies](https://cloud.google.com/iam/docs/deny-permissions-support)
   */
  def DenyPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.DenyPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.iam.DenyPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.iam.DenyPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A policy binding to a project. This is a Terraform resource, and maps to a policy binding resource in GCP.
   * 
   *  To get more information about ProjectsPolicyBinding, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v3/projects.locations.policyBindings)
   *  * How-to Guides
   *      * [Apply a policy binding](https://cloud.google.com/iam/docs/principal-access-boundary-policies-create#create_binding)
   */
  def ProjectsPolicyBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.ProjectsPolicyBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.ProjectsPolicyBindingArgs.builder
    com.pulumi.gcp.iam.ProjectsPolicyBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud IAM WorkloadIdentityPool. Each of these resources serves a different use case:
   * 
   *  * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Authoritative. Sets the IAM policy for the workloadidentitypool and replaces any existing policy already attached.
   *  * `gcp.iam.WorkloadIdentityPoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workloadidentitypool are preserved.
   *  * `gcp.iam.WorkloadIdentityPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workloadidentitypool are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Retrieves the IAM policy for the workloadidentitypool
   * 
   *  &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkloadIdentityPoolIamBinding` and `gcp.iam.WorkloadIdentityPoolIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkloadIdentityPoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.iam.WorkloadIdentityPoolIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workloadIdentityPoolViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workloadIdentityPoolViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.iam.WorkloadIdentityPoolIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   *  import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(WorkloadIdentityPoolIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.iam.WorkloadIdentityPoolIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   *  import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(WorkloadIdentityPoolIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Cloud IAM WorkloadIdentityPool
   * 
   *  Three different resources help you manage your IAM policy for Cloud IAM WorkloadIdentityPool. Each of these resources serves a different use case:
   * 
   *  * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Authoritative. Sets the IAM policy for the workloadidentitypool and replaces any existing policy already attached.
   *  * `gcp.iam.WorkloadIdentityPoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workloadidentitypool are preserved.
   *  * `gcp.iam.WorkloadIdentityPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workloadidentitypool are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Retrieves the IAM policy for the workloadidentitypool
   * 
   *  &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkloadIdentityPoolIamBinding` and `gcp.iam.WorkloadIdentityPoolIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkloadIdentityPoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.iam.WorkloadIdentityPoolIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workloadIdentityPoolViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/iam.workloadIdentityPoolViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.iam.WorkloadIdentityPoolIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   *  import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(WorkloadIdentityPoolIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.iam.WorkloadIdentityPoolIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   *  import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   *  import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *              .project(example.project())
   *              .workloadIdentityPoolId(example.workloadIdentityPoolId())
   *              .role("roles/iam.workloadIdentityPoolViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(WorkloadIdentityPoolIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}
   *  * {{project}}/{{workload_identity_pool_id}}
   *  * {{workload_identity_pool_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud IAM workloadidentitypool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_iam_workload_identity_pool_iam_member.editor &#34;projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}} roles/iam.workloadIdentityPoolViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_iam_workload_identity_pool_iam_binding.editor &#34;projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}} roles/iam.workloadIdentityPoolViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:iam/workloadIdentityPoolIamMember:WorkloadIdentityPoolIamMember editor projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkloadIdentityPoolIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a namespace for a workload identity pool. Namespaces are used to segment identities
   *  within the pool.
   * 
   *  To get more information about WorkloadIdentityPoolNamespace, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.workloadIdentityPools.namespaces)
   *  * How-to Guides
   *      * [Configure managed workload identity authentication for Compute Engine](https://cloud.google.com/iam/docs/create-managed-workload-identities)
   *      * [Configure managed workload identity authentication for GKE](https://cloud.google.com/iam/docs/create-managed-workload-identities-gke)
   */
  def WorkloadIdentityPoolNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolNamespaceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolNamespaceArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPoolNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.iam.ProjectsPolicyBindingArgs.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language
     *  (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     *  CEL are documented at https://github.com/google/cel-spec.
     *  Example (Comparison):
     *  title: \&#34;Summary size limit\&#34;
     *  description: \&#34;Determines if a summary is less than 100 chars\&#34;
     *  expression: \&#34;document.summary.size() &lt; 100\&#34;
     *  Example
     *  (Equality):
     *  title: \&#34;Requestor is owner\&#34;
     *  description: \&#34;Determines if requestor is the document owner\&#34;
     *  expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     *  (Logic):
     *  title: \&#34;Public documents\&#34;
     *  description: \&#34;Determine whether the document should be publicly visible\&#34;
     *  expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     *  Example (Data Manipulation):
     *  title: \&#34;Notification string\&#34;
     *  description: \&#34;Create a notification string with a timestamp.\&#34;
     *  expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     *  The exact variables and functions that may be referenced within an expression are
     *  determined by the service that evaluates it. See the service documentation for
     *  additional information.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.ProjectsPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     *  Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingTargetArgs.Builder]):
        com.pulumi.gcp.iam.ProjectsPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Represents a public key configuration for a Workforce Pool Provider. The key can be configured in your identity provider to encrypt SAML assertions.
   *  Google holds the corresponding private key, which it uses to decrypt encrypted tokens.
   * 
   *  To get more information about WorkforcePoolProviderKey, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/locations.workforcePools.providers.keys)
   *  * How-to Guides
   *      * [Configure a provider within the workforce pool](https://cloud.google.com/iam/docs/manage-workforce-identity-pools-providers#configure_a_provider_within_the_workforce_pool)
   *      * [Workforce Identity Federation Overview](https://cloud.google.com/iam/docs/workforce-identity-federation)
   */
  def WorkforcePoolProviderKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolProviderKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolProviderKeyArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolProviderKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.Builder)
    /**
     * @param clientSecret The OAuth 2.0 client secret for retrieving extra attributes from the identity provider. Required to get the Access Token using client credentials grant flow.
     * @return builder
     */
    def clientSecret(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientClientSecretArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientClientSecretArgs.builder
      builder.clientSecret(args(argsBuilder).build)

    /**
     * @param queryParameters Represents the parameters to control which claims are fetched from an IdP.
     * @return builder
     */
    def queryParameters(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientQueryParametersArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientQueryParametersArgs.builder
      builder.queryParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolNamespaceState.Builder)
    /**
     * @param ownerServices Defines the owner that is allowed to mutate this resource. If present, this resource can only
     *  be mutated by the owner.
     *  Structure is documented below.
     * @return builder
     */
    def ownerServices(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolNamespaceOwnerServiceArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolNamespaceState.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolNamespaceOwnerServiceArgs.builder
      builder.ownerServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderState.Builder)
    /**
     * @param aws An Amazon Web Services identity provider. Not compatible with the property oidc or saml.
     *  Structure is documented below.
     * @return builder
     */
    def aws(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderAwsArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderAwsArgs.builder
      builder.aws(args(argsBuilder).build)

    /**
     * @param oidc An OpenId Connect 1.0 identity provider. Not compatible with the property aws or saml.
     *  Structure is documented below.
     * @return builder
     */
    def oidc(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderOidcArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    /**
     * @param saml An SAML 2.0 identity provider. Not compatible with the property oidc or aws.
     *  Structure is documented below.
     * @return builder
     */
    def saml(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderSamlArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    /**
     * @param x509 An X.509-type identity provider represents a CA. It is trusted to assert a
     *  client identity if the client has a certificate that chains up to this CA.
     *  Structure is documented below.
     * @return builder
     */
    def x509(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509Args.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509Args.builder
      builder.x509(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.DenyPolicyRuleDenyRuleArgs.Builder)
    /**
     * @param denialCondition User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     *  Structure is documented below.
     * @return builder
     */
    def denialCondition(args: Endofunction[com.pulumi.gcp.iam.inputs.DenyPolicyRuleDenyRuleDenialConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.DenyPolicyRuleDenyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.DenyPolicyRuleDenyRuleDenialConditionArgs.builder
      builder.denialCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.DenyPolicyRuleArgs.Builder)
    /**
     * @param denyRule A deny rule in an IAM deny policy.
     *  Structure is documented below.
     * @return builder
     */
    def denyRule(args: Endofunction[com.pulumi.gcp.iam.inputs.DenyPolicyRuleDenyRuleArgs.Builder]):
        com.pulumi.gcp.iam.inputs.DenyPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.DenyPolicyRuleDenyRuleArgs.builder
      builder.denyRule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreArgs.Builder)
    /**
     * @param intermediateCas Set of intermediate CA certificates used for building the trust chain to
     *  trust anchor.
     *  IMPORTANT: Intermediate CAs are only supported when configuring x509 federation.
     *  Structure is documented below.
     * @return builder
     */
    def intermediateCas(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreIntermediateCaArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreIntermediateCaArgs.builder
      builder.intermediateCas(args.map(_(argsBuilder).build)*)

    /**
     * @param trustAnchors List of Trust Anchors to be used while performing validation
     *  against a given TrustStore. The incoming end entity&#39;s certificate
     *  must be chained up to one of the trust anchors here.
     *  Structure is documented below.
     * @return builder
     */
    def trustAnchors(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs.builder
      builder.trustAnchors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyState.Builder)
    /**
     * @param details Principal access boundary policy details
     *  Structure is documented below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsArgs.Builder]):
        com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.DenyPolicyState.Builder)
    /**
     * @param rules Rules to be applied.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.iam.inputs.DenyPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.DenyPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.DenyPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderKeyState.Builder)
    /**
     * @param keyData Immutable. Public half of the asymmetric key.
     *  Structure is documented below.
     * @return builder
     */
    def keyData(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderKeyKeyDataArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderKeyState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderKeyKeyDataArgs.builder
      builder.keyData(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderState.Builder)
    /**
     * @param extendedAttributesOauth2Client (Optional, Deprecated)
     *  The configuration for OAuth 2.0 client used to get the extended group
     *  memberships for user identities. Only the `AZURE_AD_GROUPS_ID` attribute
     *  type is supported. Extended groups supports a subset of Google Cloud
     *  services. When the user accesses these services, extended group memberships
     *  override the mapped `google.groups` attribute. Extended group memberships
     *  cannot be used in attribute mapping or attribute condition expressions.
     *  To keep extended group memberships up to date, extended groups are
     *  retrieved when the user signs in and at regular intervals during the user&#39;s
     *  active session. Each user identity in the workforce identity pool must map
     *  to a unique Microsoft Entra ID user.
     *  Structure is documented below.
     * 
     *  &gt; **Warning:** `extendedAttributesOauth2Client` is deprecated. Use SCIM instead.
     * @return builder
     * @deprecated `extendedAttributesOauth2Client` is deprecated. Use SCIM instead.
     */
    @deprecated def extendedAttributesOauth2Client(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.builder
      builder.extendedAttributesOauth2Client(args(argsBuilder).build)

    /**
     * @param extraAttributesOauth2Client The configuration for OAuth 2.0 client used to get the additional user
     *  attributes. This should be used when users can&#39;t get the desired claims
     *  in authentication credentials. Currently this configuration is only
     *  supported with SAML and OIDC protocol.
     *  Structure is documented below.
     * @return builder
     */
    def extraAttributesOauth2Client(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientArgs.builder
      builder.extraAttributesOauth2Client(args(argsBuilder).build)

    /**
     * @param oidc Represents an OpenId Connect 1.0 identity provider.
     *  Structure is documented below.
     * @return builder
     */
    def oidc(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    /**
     * @param saml Represents a SAML identity provider.
     *  Structure is documented below.
     * @return builder
     */
    def saml(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderSamlArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderSamlArgs.builder
      builder.saml(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityServiceAgentState.Builder)
    /**
     * @param serviceAgents The list of ServiceAgents generated by the API call.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAgents(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityServiceAgentServiceAgentArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityServiceAgentState.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityServiceAgentServiceAgentArgs.builder
      builder.serviceAgents(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolState.Builder)
    /**
     * @param accessRestrictions Configure access restrictions on the workforce pool users. This is an optional field. If specified web
     *  sign-in can be restricted to given set of services or programmatic sign-in can be disabled for pool users.
     *  Structure is documented below.
     * @return builder
     */
    def accessRestrictions(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsArgs.builder
      builder.accessRestrictions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolState.Builder)
    /**
     * @param attestationRules Defines which workloads can receive an identity within a pool. When an AttestationRule is
     *  defined under a managed identity, matching workloads may receive that identity. A maximum of
     *  50 AttestationRules can be set.
     *  Structure is documented below.
     * @return builder
     */
    def attestationRules(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolAttestationRuleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolState.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolAttestationRuleArgs.builder
      builder.attestationRules(args.map(_(argsBuilder).build)*)

    /**
     * @param inlineCertificateIssuanceConfig Represents configuration for generating mutual TLS (mTLS) certificates for the identities
     *  within this pool. Defines the Certificate Authority (CA) pool resources and configurations
     *  required for issuance and rotation of mTLS workload certificates.
     *  Structure is documented below.
     * @return builder
     */
    def inlineCertificateIssuanceConfig(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineCertificateIssuanceConfigArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineCertificateIssuanceConfigArgs.builder
      builder.inlineCertificateIssuanceConfig(args(argsBuilder).build)

    /**
     * @param inlineTrustConfig Represents config to add additional trusted trust domains. Defines configuration for extending
     *  trust to additional trust domains. By establishing trust with another domain, the current
     *  domain will recognize and accept certificates issued by entities within the trusted domains.
     *  Note that a trust domain automatically trusts itself, eliminating the need for explicit
     *  configuration.
     *  Structure is documented below.
     * @return builder
     */
    def inlineTrustConfig(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigArgs.builder
      builder.inlineTrustConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleArgs.Builder)
    /**
     * @param availabilityCondition The availability condition further constrains the access allowed by the access boundary rule.
     *  Structure is documented below.
     * @return builder
     */
    def availabilityCondition(args: Endofunction[com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleAvailabilityConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleAvailabilityConditionArgs.builder
      builder.availabilityCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsArgs.Builder)
    /**
     * @param rules A list of principal access boundary policy rules. The number of rules in a policy is limited to 500.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsRuleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.PrincipalAccessBoundaryPolicyDetailsRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsArgs.Builder)
    /**
     * @param allowedServices Services allowed for web sign-in with the workforce pool.
     *  If not set by default there are no restrictions.
     *  Structure is documented below.
     * @return builder
     */
    def allowedServices(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsAllowedServiceArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsAllowedServiceArgs.builder
      builder.allowedServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleArgs.Builder)
    /**
     * @param trustAnchors List of Trust Anchors to be used while performing validation against a given
     *  `TrustStore`. The incoming end entity&#39;s certificate must be chained up to one of the
     *  trust anchors here.
     *  Structure is documented below.
     * @return builder
     */
    def trustAnchors(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleTrustAnchorArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleTrustAnchorArgs.builder
      builder.trustAnchors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolManagedIdentityState.Builder)
    /**
     * @param attestationRules Defines which workloads can receive an identity within a pool. When an AttestationRule is
     *  defined under a managed identity, matching workloads may receive that identity. A maximum of
     *  50 AttestationRules can be set.
     *  Structure is documented below.
     * @return builder
     */
    def attestationRules(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolManagedIdentityAttestationRuleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolManagedIdentityState.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolManagedIdentityAttestationRuleArgs.builder
      builder.attestationRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleArgs.Builder)
    /**
     * @param accessBoundaryRule An access boundary rule in an IAM policy.
     *  Structure is documented below.
     * @return builder
     */
    def accessBoundaryRule(args: Endofunction[com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleArgs.Builder]):
        com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleArgs.builder
      builder.accessBoundaryRule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcClientSecretArgs.Builder)
    /**
     * @param value The value of the client secret.
     *  Structure is documented below.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcClientSecretValueArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcClientSecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcClientSecretValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientClientSecretArgs.Builder)
    /**
     * @param value The value of the client secret.
     *  Structure is documented below.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientClientSecretValueArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientClientSecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientClientSecretValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.FoldersPolicyBindingState.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language
     *  (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     *  CEL are documented at https://github.com/google/cel-spec.
     *  Example (Comparison):
     *  title: \&#34;Summary size limit\&#34;
     *  description: \&#34;Determines if a summary is less than 100 chars\&#34;
     *  expression: \&#34;document.summary.size() &lt; 100\&#34;
     *  Example
     *  (Equality):
     *  title: \&#34;Requestor is owner\&#34;
     *  description: \&#34;Determines if requestor is the document owner\&#34;
     *  expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     *  (Logic):
     *  title: \&#34;Public documents\&#34;
     *  description: \&#34;Determine whether the document should be publicly visible\&#34;
     *  expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     *  Example (Data Manipulation):
     *  title: \&#34;Notification string\&#34;
     *  description: \&#34;Create a notification string with a timestamp.\&#34;
     *  expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     *  The exact variables and functions that may be referenced within an expression are
     *  determined by the service that evaluates it. See the service documentation for
     *  additional information.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.FoldersPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.FoldersPolicyBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.FoldersPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     *  Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.iam.inputs.FoldersPolicyBindingTargetArgs.Builder]):
        com.pulumi.gcp.iam.inputs.FoldersPolicyBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.FoldersPolicyBindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingState.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language
     *  (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     *  CEL are documented at https://github.com/google/cel-spec.
     *  Example (Comparison):
     *  title: \&#34;Summary size limit\&#34;
     *  description: \&#34;Determines if a summary is less than 100 chars\&#34;
     *  expression: \&#34;document.summary.size() &lt; 100\&#34;
     *  Example
     *  (Equality):
     *  title: \&#34;Requestor is owner\&#34;
     *  description: \&#34;Determines if requestor is the document owner\&#34;
     *  expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     *  (Logic):
     *  title: \&#34;Public documents\&#34;
     *  description: \&#34;Determine whether the document should be publicly visible\&#34;
     *  expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     *  Example (Data Manipulation):
     *  title: \&#34;Notification string\&#34;
     *  description: \&#34;Create a notification string with a timestamp.\&#34;
     *  expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     *  The exact variables and functions that may be referenced within an expression are
     *  determined by the service that evaluates it. See the service documentation for
     *  additional information.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     *  Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingTargetArgs.Builder]):
        com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.OrganizationsPolicyBindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.Builder)
    /**
     * @param clientSecret The OAuth 2.0 client secret for retrieving extended attributes from the identity provider. Required to get the Access Token using client credentials grant flow.
     * @return builder
     */
    def clientSecret(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientClientSecretArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientClientSecretArgs.builder
      builder.clientSecret(args(argsBuilder).build)

    /**
     * @param queryParameters Represents the parameters to control which claims are fetched from an IdP.
     * @return builder
     */
    def queryParameters(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientQueryParametersArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtendedAttributesOauth2ClientQueryParametersArgs.builder
      builder.queryParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientClientSecretArgs.Builder)
    /**
     * @param value The value of the client secret.
     *  Structure is documented below.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientClientSecretValueArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientClientSecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderExtraAttributesOauth2ClientClientSecretValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigArgs.Builder)
    /**
     * @param additionalTrustBundles Maps specific trust domains (e.g., &#34;example.com&#34;) to their corresponding `TrustStore`
     *  objects, which contain the trusted root certificates for that domain. There can be a
     *  maximum of `10` trust domain entries in this map.
     *  Note that a trust domain automatically trusts itself and don&#39;t need to be specified here.
     *  If however, this `WorkloadIdentityPool`&#39;s trust domain contains any trust anchors in the
     *  `additionalTrustBundles` map, those trust anchors will be *appended to* the Trust Bundle
     *  automatically derived from your `InlineCertificateIssuanceConfig`&#39;s `caPools`.
     *  Structure is documented below.
     * @return builder
     */
    def additionalTrustBundles(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleArgs.builder
      builder.additionalTrustBundles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyState.Builder)
    /**
     * @param rules Rules to be applied.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509Args.Builder)
    /**
     * @param trustStore A Trust store, use this trust store as a wrapper to config the trust
     *  anchor and optional intermediate cas to help build the trust chain for
     *  the incoming end entity certificate. Follow the x509 guidelines to
     *  define those PEM encoded certs. Only 1 trust store is currently
     *  supported.
     * @return builder
     */
    def trustStore(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509Args.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderX509TrustStoreArgs.builder
      builder.trustStore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.Builder)
    /**
     * @param clientSecret The optional client secret. Required to enable Authorization Code flow for web sign-in.
     *  Structure is documented below.
     * @return builder
     */
    def clientSecret(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcClientSecretArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcClientSecretArgs.builder
      builder.clientSecret(args(argsBuilder).build)

    /**
     * @param webSsoConfig Configuration for web single sign-on for the OIDC provider. Here, web sign-in refers to console sign-in and gcloud sign-in through the browser.
     *  Structure is documented below.
     * @return builder
     */
    def webSsoConfig(args: Endofunction[com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcWebSsoConfigArgs.Builder]):
        com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcArgs.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.WorkforcePoolProviderOidcWebSsoConfigArgs.builder
      builder.webSsoConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingState.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language
     *  (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of
     *  CEL are documented at https://github.com/google/cel-spec.
     *  Example (Comparison):
     *  title: \&#34;Summary size limit\&#34;
     *  description: \&#34;Determines if a summary is less than 100 chars\&#34;
     *  expression: \&#34;document.summary.size() &lt; 100\&#34;
     *  Example
     *  (Equality):
     *  title: \&#34;Requestor is owner\&#34;
     *  description: \&#34;Determines if requestor is the document owner\&#34;
     *  expression: \&#34;document.owner == request.auth.claims.email\&#34;  Example
     *  (Logic):
     *  title: \&#34;Public documents\&#34;
     *  description: \&#34;Determine whether the document should be publicly visible\&#34;
     *  expression: \&#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;\&#34;
     *  Example (Data Manipulation):
     *  title: \&#34;Notification string\&#34;
     *  description: \&#34;Create a notification string with a timestamp.\&#34;
     *  expression: \&#34;&#39;New message received at &#39; + string(document.create_time)\&#34;
     *  The exact variables and functions that may be referenced within an expression are
     *  determined by the service that evaluates it. See the service documentation for
     *  additional information.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param target Target is the full resource name of the resource to which the policy will be bound. Immutable once set.
     *  Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingTargetArgs.Builder]):
        com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.iam.inputs.ProjectsPolicyBindingTargetArgs.builder
      builder.target(args(argsBuilder).build)

  /**
   * Represents a collection of external workload identities. You can define IAM policies to
   *  grant these identities access to Google Cloud resources.
   * 
   *  To get more information about WorkloadIdentityPool, see:
   * 
   *  * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.workloadIdentityPools)
   *  * How-to Guides
   *      * [Configure managed workload identity authentication for Compute Engine](https://cloud.google.com/iam/docs/create-managed-workload-identities)
   *      * [Configure managed workload identity authentication for GKE](https://cloud.google.com/iam/docs/create-managed-workload-identities-gke)
   *      * [Managing workload identity pools](https://cloud.google.com/iam/docs/manage-workload-identity-pools-providers#pools)
   */
  def WorkloadIdentityPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a SCIM Token for a Workforce Pool Provider Scim Tenant.
   *  The SCIM Token is used for authenticating SCIM provisioning requests during the synchronization of user/group identities from external identity provider into Google Cloud using the System for Cross-domain Identity Management (SCIM) protocol. This needs to be provided in the Secret (Long Lived) Token field when configuring SCIM on an IdP.
   * 
   *  To get more information about WorkforcePoolProviderScimToken, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/iam/docs/reference/rest/v1/locations.workforcePools.providers.scimTenants.tokens)
   *  * How-to Guides
   *      * [Create a SCIM Token for the SCIM Tenant](https://cloud.google.com/iam/docs/workforce-sign-in-microsoft-entra-id-scalable-groups?group_type=extended#extended-attributes)
   */
  def WorkforcePoolProviderScimToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolProviderScimTokenArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolProviderScimTokenArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolProviderScimToken(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
