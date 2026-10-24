package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object iam:
  /**
   * Represents a collection of access boundary policies to apply to a given resource.
   * **NOTE**: This is a private feature and users should contact GCP support
   * if they would like to test it.
   */
  def AccessBoundaryPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.AccessBoundaryPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.iam.AccessBoundaryPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.iam.AccessBoundaryPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a collection of denial policies to apply to a given resource.
   * 
   * To get more information about DenyPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v2/policies)
   * * How-to Guides
   *     * [Permissions supported in deny policies](https://cloud.google.com/iam/docs/deny-permissions-support)
   */
  def DenyPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.DenyPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.iam.DenyPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.iam.DenyPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents an IAM v3 Access Policy parented by a Folder. This policy defines rules
   * that allow or deny access to resources within the specified folder based on principals and conditions.
   * See the Cloud IAM documentation for more details on Access Policies.
   * 
   * To get more information about FolderAccessPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v3/folders.locations.accessPolicies)
   */
  def FolderAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.FolderAccessPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.FolderAccessPolicyArgs.builder
    com.pulumi.gcp.iam.FolderAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A policy binding to a folder. This is a Terraform resource, and maps to a policy binding resource in GCP.
   * 
   * To get more information about FoldersPolicyBinding, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v3/folders.locations.policyBindings)
   * * How-to Guides
   *     * [Apply a policy binding](https://cloud.google.com/iam/docs/principal-access-boundary-policies-create#create_binding)
   */
  def FoldersPolicyBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.FoldersPolicyBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.FoldersPolicyBindingArgs.builder
    com.pulumi.gcp.iam.FoldersPolicyBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object IamFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to get information about a Google IAM Role.
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.iam.IamFunctions;
     * import com.pulumi.gcp.iam.inputs.GetRuleArgs;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var roleinfo = IamFunctions.getRule(GetRuleArgs.builder()
     *             .name("roles/compute.viewer")
     *             .build());
     * 
     *         ctx.export("theRolePermissions", roleinfo.includedPermissions());
     *     }
     * }
     * }
     * </pre>
     */
    inline def getRule(args: Endofunction[com.pulumi.gcp.iam.inputs.GetRuleArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetRuleResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetRuleArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get information about a Google IAM Role.
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.iam.IamFunctions;
     * import com.pulumi.gcp.iam.inputs.GetRuleArgs;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var roleinfo = IamFunctions.getRule(GetRuleArgs.builder()
     *             .name("roles/compute.viewer")
     *             .build());
     * 
     *         ctx.export("theRolePermissions", roleinfo.includedPermissions());
     *     }
     * }
     * }
     * </pre>
     */
    inline def getRulePlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetRulePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetRuleResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetRulePlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieve a list of testable permissions for a resource. Testable permissions mean the permissions that user can add or remove in a role at a given resource. The resource can be referenced either via the full resource name or via a URI. */
    inline def getTestablePermissions(args: Endofunction[com.pulumi.gcp.iam.inputs.GetTestablePermissionsArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetTestablePermissionsResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetTestablePermissionsArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getTestablePermissions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve a list of testable permissions for a resource. Testable permissions mean the permissions that user can add or remove in a role at a given resource. The resource can be referenced either via the full resource name or via a URI. */
    inline def getTestablePermissionsPlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetTestablePermissionsPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetTestablePermissionsResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetTestablePermissionsPlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getTestablePermissionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for workforcepool */
    inline def getWorkforcePoolIamPolicy(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkforcePoolIamPolicyArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetWorkforcePoolIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkforcePoolIamPolicyArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkforcePoolIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for workforcepool */
    inline def getWorkforcePoolIamPolicyPlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkforcePoolIamPolicyPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetWorkforcePoolIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkforcePoolIamPolicyPlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkforcePoolIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get a IAM workload identity pool from Google Cloud by its id.
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     * 
     * &gt; **Note:** The following resource requires the Beta IAM role `roles/iam.workloadIdentityPoolAdmin` in order to succeed. `OWNER` and `EDITOR` roles do not include the necessary permissions.
     */
    inline def getWorkloadIdentityPool(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPool(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get a IAM workload identity pool from Google Cloud by its id.
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     * 
     * &gt; **Note:** The following resource requires the Beta IAM role `roles/iam.workloadIdentityPoolAdmin` in order to succeed. `OWNER` and `EDITOR` roles do not include the necessary permissions.
     */
    inline def getWorkloadIdentityPoolPlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolPlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for workloadidentitypool */
    inline def getWorkloadIdentityPoolIamPolicy(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolIamPolicyArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolIamPolicyArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for workloadidentitypool */
    inline def getWorkloadIdentityPoolIamPolicyPlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolIamPolicyPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolIamPolicyPlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get the JSON Web Key Set (JWKS) public keys (`/openid/jwks`) for an Agent Workload Identity Pool from GCP. */
    inline def getWorkloadIdentityPoolJwks(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolJwksArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolJwksResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolJwksArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolJwks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get the JSON Web Key Set (JWKS) public keys (`/openid/jwks`) for an Agent Workload Identity Pool from GCP. */
    inline def getWorkloadIdentityPoolJwksPlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolJwksPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolJwksResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolJwksPlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolJwksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get the OpenID provider configuration (`/.well-known/openid-configuration`) for an Agent Workload Identity Pool from Google Cloud. */
    inline def getWorkloadIdentityPoolOpenidConfig(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolOpenidConfigArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolOpenidConfigResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolOpenidConfigArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolOpenidConfig(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get the OpenID provider configuration (`/.well-known/openid-configuration`) for an Agent Workload Identity Pool from Google Cloud. */
    inline def getWorkloadIdentityPoolOpenidConfigPlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolOpenidConfigPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolOpenidConfigResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolOpenidConfigPlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolOpenidConfigPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get a IAM workload identity provider from Google Cloud by its id.
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getWorkloadIdentityPoolProvider(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolProviderArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolProviderResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolProviderArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolProvider(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get a IAM workload identity provider from Google Cloud by its id.
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getWorkloadIdentityPoolProviderPlain(args: Endofunction[com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolProviderPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolProviderResult] =
      val argsBuilder = com.pulumi.gcp.iam.inputs.GetWorkloadIdentityPoolProviderPlainArgs.builder
      com.pulumi.gcp.iam.IamFunctions.getWorkloadIdentityPoolProviderPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Represents an OAuth Client. Used to access Google Cloud resources on behalf of a
   * Workforce Identity Federation user by using OAuth 2.0 Protocol to obtain an access
   * token from Google Cloud.
   * 
   * To get more information about OauthClient, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.oauthClients)
   * * How-to Guides
   *     * [Managing OAuth clients](https://cloud.google.com/iam/docs/workforce-manage-oauth-app#manage-clients)
   */
  def OauthClient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.OauthClientArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.OauthClientArgs.builder
    com.pulumi.gcp.iam.OauthClient(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents an OAuth Client Credential. Used to authenticate an OAuth Client
   * while accessing Google Cloud resources on behalf of a Workforce Identity Federation user
   * by using OAuth 2.0 Protocol.
   * 
   * To get more information about OauthClientCredential, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.oauthClients.credentials)
   * * How-to Guides
   *     * [Managing OAuth clients](https://cloud.google.com/iam/docs/workforce-manage-oauth-app#manage-clients)
   */
  def OauthClientCredential(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.OauthClientCredentialArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.OauthClientCredentialArgs.builder
    com.pulumi.gcp.iam.OauthClientCredential(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents an IAM v3 Access Policy parented by a Google Cloud Organization. This policy
   * defines rules that allow or deny access to resources within the specified organization based on principals and conditions.
   * See the Cloud IAM documentation for more details on Access Policies.
   * 
   * To get more information about OrganizationAccessPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v3/organizations.locations.accessPolicies)
   */
  def OrganizationAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.OrganizationAccessPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.OrganizationAccessPolicyArgs.builder
    com.pulumi.gcp.iam.OrganizationAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A policy binding to an organization. This is a Terraform resource, and maps to a policy binding resource in GCP.
   * 
   * To get more information about OrganizationsPolicyBinding, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v3/organizations.locations.policyBindings)
   * * How-to Guides
   *     * [Apply a policy binding](https://cloud.google.com/iam/docs/principal-access-boundary-policies-create#create_binding)
   */
  def OrganizationsPolicyBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.OrganizationsPolicyBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.OrganizationsPolicyBindingArgs.builder
    com.pulumi.gcp.iam.OrganizationsPolicyBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An IAM Principal Access Boundary Policy resource. This resource has no effect on accesses until is bound to a target through policy bindings.
   * You can see further documentation on policy bindings in:
   *   - [Organizations](https://www.terraform.io/providers/hashicorp/google/latest/docs/resources/iam_organizations_policy_binding)
   *   - [Folders](https://www.terraform.io/providers/hashicorp/google/latest/docs/resources/iam_folders_policy_binding)
   *   - [Projects](https://www.terraform.io/providers/hashicorp/google/latest/docs/resources/iam_projects_policy_binding)
   * 
   * To get more information about PrincipalAccessBoundaryPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v3/organizations.locations.principalAccessBoundaryPolicies)
   * * How-to Guides
   *     * [Create and apply Principal Access Boundaries](https://cloud.google.com/iam/docs/principal-access-boundary-policies-create)
   */
  def PrincipalAccessBoundaryPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.PrincipalAccessBoundaryPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.PrincipalAccessBoundaryPolicyArgs.builder
    com.pulumi.gcp.iam.PrincipalAccessBoundaryPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents an IAM v3 Access Policy parented by a Project. This policy defines rules
   * that allow or deny access to resources within the specified project based on principals and conditions.
   * See the Cloud IAM documentation for more details on Access Policies.
   * 
   * To get more information about ProjectAccessPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v3/projects.locations.accessPolicies)
   */
  def ProjectAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.ProjectAccessPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.ProjectAccessPolicyArgs.builder
    com.pulumi.gcp.iam.ProjectAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A policy binding to a project. This is a Terraform resource, and maps to a policy binding resource in GCP.
   * 
   * To get more information about ProjectsPolicyBinding, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v3/projects.locations.policyBindings)
   * * How-to Guides
   *     * [Apply a policy binding](https://cloud.google.com/iam/docs/principal-access-boundary-policies-create#create_binding)
   */
  def ProjectsPolicyBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.ProjectsPolicyBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.ProjectsPolicyBindingArgs.builder
    com.pulumi.gcp.iam.ProjectsPolicyBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a collection of external workforces. Provides namespaces for
   * federated users that can be referenced in IAM policies.
   * 
   * To get more information about WorkforcePool, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/locations.workforcePools)
   * * How-to Guides
   *     * [Manage pools](https://cloud.google.com/iam/docs/manage-workforce-identity-pools-providers#manage_pools)
   * 
   * &gt; **Note:** Ask your Google Cloud account team to request access to workforce identity federation for
   * your billing/quota project. The account team notifies you when the project is granted access.
   */
  def WorkforcePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolArgs.builder
    com.pulumi.gcp.iam.WorkforcePool(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud IAM WorkforcePool. Each of these resources serves a different use case:
   * 
   * * `gcp.iam.WorkforcePoolIamPolicy`: Authoritative. Sets the IAM policy for the workforcepool and replaces any existing policy already attached.
   * * `gcp.iam.WorkforcePoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workforcepool are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.iam.WorkforcePoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workforcepool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.iam.WorkforcePoolIamPolicy`: Retrieves the IAM policy for the workforcepool
   * 
   * &gt; **Note:** `gcp.iam.WorkforcePoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkforcePoolIamBinding` and `gcp.iam.WorkforcePoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.iam.WorkforcePoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkforcePoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.iam.WorkforcePoolIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.iam.WorkforcePoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workforcePoolAdmin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkforcePoolIamPolicy("policy", WorkforcePoolIamPolicyArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.iam.WorkforcePoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkforcePoolIamBinding;
   * import com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkforcePoolIamBinding("binding", WorkforcePoolIamBindingArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .role("roles/iam.workforcePoolAdmin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.iam.WorkforcePoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkforcePoolIamMember;
   * import com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkforcePoolIamMember("member", WorkforcePoolIamMemberArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .role("roles/iam.workforcePoolAdmin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * ---
   * 
   * # IAM policy for Cloud IAM WorkforcePool
   * 
   * Three different resources help you manage your IAM policy for Cloud IAM WorkforcePool. Each of these resources serves a different use case:
   * 
   * * `gcp.iam.WorkforcePoolIamPolicy`: Authoritative. Sets the IAM policy for the workforcepool and replaces any existing policy already attached.
   * * `gcp.iam.WorkforcePoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workforcepool are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.iam.WorkforcePoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workforcepool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.iam.WorkforcePoolIamPolicy`: Retrieves the IAM policy for the workforcepool
   * 
   * &gt; **Note:** `gcp.iam.WorkforcePoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkforcePoolIamBinding` and `gcp.iam.WorkforcePoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.iam.WorkforcePoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkforcePoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.iam.WorkforcePoolIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.iam.WorkforcePoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workforcePoolAdmin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkforcePoolIamPolicy("policy", WorkforcePoolIamPolicyArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.iam.WorkforcePoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkforcePoolIamBinding;
   * import com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkforcePoolIamBinding("binding", WorkforcePoolIamBindingArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .role("roles/iam.workforcePoolAdmin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.iam.WorkforcePoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkforcePoolIamMember;
   * import com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkforcePoolIamMember("member", WorkforcePoolIamMemberArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .role("roles/iam.workforcePoolAdmin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * locations/{{location}}/workforcePools/{{workforce_pool_id}}
   * * {{location}}/{{workforce_pool_id}}
   * * {{workforce_pool_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud IAM workforcepool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_iam_workforce_pool_iam_member.editor &#34;locations/{{location}}/workforcePools/{{workforce_pool_id}} roles/iam.workforcePoolViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_iam_workforce_pool_iam_binding.editor &#34;locations/{{location}}/workforcePools/{{workforce_pool_id}} roles/iam.workforcePoolViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:iam/workforcePoolIamBinding:WorkforcePoolIamBinding editor locations/{{location}}/workforcePools/{{workforce_pool_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkforcePoolIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud IAM WorkforcePool. Each of these resources serves a different use case:
   * 
   * * `gcp.iam.WorkforcePoolIamPolicy`: Authoritative. Sets the IAM policy for the workforcepool and replaces any existing policy already attached.
   * * `gcp.iam.WorkforcePoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workforcepool are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.iam.WorkforcePoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workforcepool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.iam.WorkforcePoolIamPolicy`: Retrieves the IAM policy for the workforcepool
   * 
   * &gt; **Note:** `gcp.iam.WorkforcePoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkforcePoolIamBinding` and `gcp.iam.WorkforcePoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.iam.WorkforcePoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkforcePoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.iam.WorkforcePoolIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.iam.WorkforcePoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workforcePoolAdmin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkforcePoolIamPolicy("policy", WorkforcePoolIamPolicyArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.iam.WorkforcePoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkforcePoolIamBinding;
   * import com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkforcePoolIamBinding("binding", WorkforcePoolIamBindingArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .role("roles/iam.workforcePoolAdmin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.iam.WorkforcePoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkforcePoolIamMember;
   * import com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkforcePoolIamMember("member", WorkforcePoolIamMemberArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .role("roles/iam.workforcePoolAdmin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * ---
   * 
   * # IAM policy for Cloud IAM WorkforcePool
   * 
   * Three different resources help you manage your IAM policy for Cloud IAM WorkforcePool. Each of these resources serves a different use case:
   * 
   * * `gcp.iam.WorkforcePoolIamPolicy`: Authoritative. Sets the IAM policy for the workforcepool and replaces any existing policy already attached.
   * * `gcp.iam.WorkforcePoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workforcepool are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.iam.WorkforcePoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workforcepool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.iam.WorkforcePoolIamPolicy`: Retrieves the IAM policy for the workforcepool
   * 
   * &gt; **Note:** `gcp.iam.WorkforcePoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkforcePoolIamBinding` and `gcp.iam.WorkforcePoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.iam.WorkforcePoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkforcePoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.iam.WorkforcePoolIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.iam.WorkforcePoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workforcePoolAdmin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkforcePoolIamPolicy("policy", WorkforcePoolIamPolicyArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.iam.WorkforcePoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkforcePoolIamBinding;
   * import com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkforcePoolIamBinding("binding", WorkforcePoolIamBindingArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .role("roles/iam.workforcePoolAdmin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.iam.WorkforcePoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkforcePoolIamMember;
   * import com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkforcePoolIamMember("member", WorkforcePoolIamMemberArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .role("roles/iam.workforcePoolAdmin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * locations/{{location}}/workforcePools/{{workforce_pool_id}}
   * * {{location}}/{{workforce_pool_id}}
   * * {{workforce_pool_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud IAM workforcepool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_iam_workforce_pool_iam_member.editor &#34;locations/{{location}}/workforcePools/{{workforce_pool_id}} roles/iam.workforcePoolViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_iam_workforce_pool_iam_binding.editor &#34;locations/{{location}}/workforcePools/{{workforce_pool_id}} roles/iam.workforcePoolViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:iam/workforcePoolIamMember:WorkforcePoolIamMember editor locations/{{location}}/workforcePools/{{workforce_pool_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkforcePoolIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud IAM WorkforcePool. Each of these resources serves a different use case:
   * 
   * * `gcp.iam.WorkforcePoolIamPolicy`: Authoritative. Sets the IAM policy for the workforcepool and replaces any existing policy already attached.
   * * `gcp.iam.WorkforcePoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workforcepool are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.iam.WorkforcePoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workforcepool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.iam.WorkforcePoolIamPolicy`: Retrieves the IAM policy for the workforcepool
   * 
   * &gt; **Note:** `gcp.iam.WorkforcePoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkforcePoolIamBinding` and `gcp.iam.WorkforcePoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.iam.WorkforcePoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkforcePoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.iam.WorkforcePoolIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.iam.WorkforcePoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workforcePoolAdmin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkforcePoolIamPolicy("policy", WorkforcePoolIamPolicyArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.iam.WorkforcePoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkforcePoolIamBinding;
   * import com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkforcePoolIamBinding("binding", WorkforcePoolIamBindingArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .role("roles/iam.workforcePoolAdmin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.iam.WorkforcePoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkforcePoolIamMember;
   * import com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkforcePoolIamMember("member", WorkforcePoolIamMemberArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .role("roles/iam.workforcePoolAdmin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * ---
   * 
   * # IAM policy for Cloud IAM WorkforcePool
   * 
   * Three different resources help you manage your IAM policy for Cloud IAM WorkforcePool. Each of these resources serves a different use case:
   * 
   * * `gcp.iam.WorkforcePoolIamPolicy`: Authoritative. Sets the IAM policy for the workforcepool and replaces any existing policy already attached.
   * * `gcp.iam.WorkforcePoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workforcepool are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.iam.WorkforcePoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workforcepool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.iam.WorkforcePoolIamPolicy`: Retrieves the IAM policy for the workforcepool
   * 
   * &gt; **Note:** `gcp.iam.WorkforcePoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkforcePoolIamBinding` and `gcp.iam.WorkforcePoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.iam.WorkforcePoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkforcePoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.iam.WorkforcePoolIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.iam.WorkforcePoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workforcePoolAdmin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkforcePoolIamPolicy("policy", WorkforcePoolIamPolicyArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.iam.WorkforcePoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkforcePoolIamBinding;
   * import com.pulumi.gcp.iam.WorkforcePoolIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkforcePoolIamBinding("binding", WorkforcePoolIamBindingArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .role("roles/iam.workforcePoolAdmin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.iam.WorkforcePoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkforcePoolIamMember;
   * import com.pulumi.gcp.iam.WorkforcePoolIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkforcePoolIamMember("member", WorkforcePoolIamMemberArgs.builder()
   *             .location(example.get("location"))
   *             .workforcePoolId(example.get("workforcePoolId"))
   *             .role("roles/iam.workforcePoolAdmin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * locations/{{location}}/workforcePools/{{workforce_pool_id}}
   * * {{location}}/{{workforce_pool_id}}
   * * {{workforce_pool_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud IAM workforcepool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_iam_workforce_pool_iam_member.editor &#34;locations/{{location}}/workforcePools/{{workforce_pool_id}} roles/iam.workforcePoolViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_iam_workforce_pool_iam_binding.editor &#34;locations/{{location}}/workforcePools/{{workforce_pool_id}} roles/iam.workforcePoolViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:iam/workforcePoolIamPolicy:WorkforcePoolIamPolicy editor locations/{{location}}/workforcePools/{{workforce_pool_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkforcePoolIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolIamPolicyArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A configuration for an external identity provider.
   * 
   * To get more information about WorkforcePoolProvider, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/locations.workforcePools.providers)
   * * How-to Guides
   *     * [Configure a provider within the workforce pool](https://cloud.google.com/iam/docs/manage-workforce-identity-pools-providers#configure_a_provider_within_the_workforce_pool)
   * 
   * &gt; **Note:** Ask your Google Cloud account team to request access to workforce identity federation for your
   * billing/quota project. The account team notifies you when the project is granted access.
   * 
   * &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `oidc.client_secret.value.plain_text_wo`, `extra_attributes_oauth2_client.client_secret.value.plain_text_wo`, `extended_attributes_oauth2_client.client_secret.value.plain_text_wo`.
   * Read more about Write-only Arguments.
   */
  def WorkforcePoolProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolProviderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolProviderArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolProvider(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a public key configuration for a Workforce Pool Provider. The key can be configured in your identity provider to encrypt SAML assertions.
   * Google holds the corresponding private key, which it uses to decrypt encrypted tokens.
   * 
   * To get more information about WorkforcePoolProviderKey, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/locations.workforcePools.providers.keys)
   * * How-to Guides
   *     * [Configure a provider within the workforce pool](https://cloud.google.com/iam/docs/manage-workforce-identity-pools-providers#configure_a_provider_within_the_workforce_pool)
   *     * [Workforce Identity Federation Overview](https://cloud.google.com/iam/docs/workforce-identity-federation)
   */
  def WorkforcePoolProviderKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolProviderKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolProviderKeyArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolProviderKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a SCIM tenant configuration for a Workforce Pool Provider.
   * The SCIM tenant configuration allows for the synchronization of user/group identities from external identity provider into Google Cloud using the System for Cross-domain Identity Management (SCIM) protocol.
   * 
   * To get more information about WorkforcePoolProviderScimTenant, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/iam/docs/reference/rest/v1/locations.workforcePools.providers.scimTenants)
   * * How-to Guides
   *     * [Configure a SCIM Tenant](https://cloud.google.com/iam/docs/workforce-sign-in-microsoft-entra-id-scalable-groups?group_type=extended#extended-attributes)
   */
  def WorkforcePoolProviderScimTenant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolProviderScimTenantArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolProviderScimTenantArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolProviderScimTenant(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a SCIM Token for a Workforce Pool Provider Scim Tenant.
   * The SCIM Token is used for authenticating SCIM provisioning requests during the synchronization of user/group identities from external identity provider into Google Cloud using the System for Cross-domain Identity Management (SCIM) protocol. This needs to be provided in the Secret (Long Lived) Token field when configuring SCIM on an IdP.
   * 
   * To get more information about WorkforcePoolProviderScimToken, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/iam/docs/reference/rest/v1/locations.workforcePools.providers.scimTenants.tokens)
   * * How-to Guides
   *     * [Create a SCIM Token for the SCIM Tenant](https://cloud.google.com/iam/docs/workforce-sign-in-microsoft-entra-id-scalable-groups?group_type=extended#extended-attributes)
   */
  def WorkforcePoolProviderScimToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkforcePoolProviderScimTokenArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkforcePoolProviderScimTokenArgs.builder
    com.pulumi.gcp.iam.WorkforcePoolProviderScimToken(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a collection of external workload identities. You can define IAM policies to
   * grant these identities access to Google Cloud resources.
   * 
   * To get more information about WorkloadIdentityPool, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.workloadIdentityPools)
   * * How-to Guides
   *     * [Configure managed workload identity authentication for Compute Engine](https://cloud.google.com/iam/docs/create-managed-workload-identities)
   *     * [Configure managed workload identity authentication for GKE](https://cloud.google.com/iam/docs/create-managed-workload-identities-gke)
   *     * [Managing workload identity pools](https://cloud.google.com/iam/docs/manage-workload-identity-pools-providers#pools)
   */
  def WorkloadIdentityPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPool(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud IAM WorkloadIdentityPool. Each of these resources serves a different use case:
   * 
   * * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Authoritative. Sets the IAM policy for the workloadidentitypool and replaces any existing policy already attached.
   * * `gcp.iam.WorkloadIdentityPoolIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the workloadidentitypool are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.iam.WorkloadIdentityPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the workloadidentitypool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Retrieves the IAM policy for the workloadidentitypool
   * 
   * &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkloadIdentityPoolIamBinding` and `gcp.iam.WorkloadIdentityPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkloadIdentityPoolIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.iam.WorkloadIdentityPoolIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workloadIdentityPoolViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workloadIdentityPoolViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.iam.WorkloadIdentityPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(WorkloadIdentityPoolIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.iam.WorkloadIdentityPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(WorkloadIdentityPoolIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## This resource supports User Project Overrides.
   * 
   * -
   * 
   * # IAM policy for Cloud IAM WorkloadIdentityPool
   * 
   * Three different resources help you manage your IAM policy for Cloud IAM WorkloadIdentityPool. Each of these resources serves a different use case:
   * 
   * * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Authoritative. Sets the IAM policy for the workloadidentitypool and replaces any existing policy already attached.
   * * `gcp.iam.WorkloadIdentityPoolIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the workloadidentitypool are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.iam.WorkloadIdentityPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the workloadidentitypool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Retrieves the IAM policy for the workloadidentitypool
   * 
   * &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkloadIdentityPoolIamBinding` and `gcp.iam.WorkloadIdentityPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkloadIdentityPoolIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.iam.WorkloadIdentityPoolIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workloadIdentityPoolViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workloadIdentityPoolViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.iam.WorkloadIdentityPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(WorkloadIdentityPoolIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.iam.WorkloadIdentityPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(WorkloadIdentityPoolIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}
   * * {{project}}/{{workload_identity_pool_id}}
   * * {{workload_identity_pool_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud IAM workloadidentitypool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_iam_workload_identity_pool_iam_member.editor &#34;projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}} roles/iam.workloadIdentityPoolViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_iam_workload_identity_pool_iam_binding.editor &#34;projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}} roles/iam.workloadIdentityPoolViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:iam/workloadIdentityPoolIamBinding:WorkloadIdentityPoolIamBinding editor projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkloadIdentityPoolIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud IAM WorkloadIdentityPool. Each of these resources serves a different use case:
   * 
   * * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Authoritative. Sets the IAM policy for the workloadidentitypool and replaces any existing policy already attached.
   * * `gcp.iam.WorkloadIdentityPoolIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the workloadidentitypool are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.iam.WorkloadIdentityPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the workloadidentitypool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Retrieves the IAM policy for the workloadidentitypool
   * 
   * &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkloadIdentityPoolIamBinding` and `gcp.iam.WorkloadIdentityPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkloadIdentityPoolIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.iam.WorkloadIdentityPoolIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workloadIdentityPoolViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workloadIdentityPoolViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.iam.WorkloadIdentityPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(WorkloadIdentityPoolIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.iam.WorkloadIdentityPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(WorkloadIdentityPoolIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## This resource supports User Project Overrides.
   * 
   * -
   * 
   * # IAM policy for Cloud IAM WorkloadIdentityPool
   * 
   * Three different resources help you manage your IAM policy for Cloud IAM WorkloadIdentityPool. Each of these resources serves a different use case:
   * 
   * * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Authoritative. Sets the IAM policy for the workloadidentitypool and replaces any existing policy already attached.
   * * `gcp.iam.WorkloadIdentityPoolIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the workloadidentitypool are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.iam.WorkloadIdentityPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the workloadidentitypool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Retrieves the IAM policy for the workloadidentitypool
   * 
   * &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkloadIdentityPoolIamBinding` and `gcp.iam.WorkloadIdentityPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkloadIdentityPoolIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.iam.WorkloadIdentityPoolIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workloadIdentityPoolViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workloadIdentityPoolViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.iam.WorkloadIdentityPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(WorkloadIdentityPoolIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.iam.WorkloadIdentityPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(WorkloadIdentityPoolIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}
   * * {{project}}/{{workload_identity_pool_id}}
   * * {{workload_identity_pool_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud IAM workloadidentitypool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_iam_workload_identity_pool_iam_member.editor &#34;projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}} roles/iam.workloadIdentityPoolViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_iam_workload_identity_pool_iam_binding.editor &#34;projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}} roles/iam.workloadIdentityPoolViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:iam/workloadIdentityPoolIamMember:WorkloadIdentityPoolIamMember editor projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkloadIdentityPoolIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud IAM WorkloadIdentityPool. Each of these resources serves a different use case:
   * 
   * * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Authoritative. Sets the IAM policy for the workloadidentitypool and replaces any existing policy already attached.
   * * `gcp.iam.WorkloadIdentityPoolIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the workloadidentitypool are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.iam.WorkloadIdentityPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the workloadidentitypool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Retrieves the IAM policy for the workloadidentitypool
   * 
   * &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkloadIdentityPoolIamBinding` and `gcp.iam.WorkloadIdentityPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkloadIdentityPoolIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.iam.WorkloadIdentityPoolIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workloadIdentityPoolViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workloadIdentityPoolViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.iam.WorkloadIdentityPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(WorkloadIdentityPoolIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.iam.WorkloadIdentityPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(WorkloadIdentityPoolIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## This resource supports User Project Overrides.
   * 
   * -
   * 
   * # IAM policy for Cloud IAM WorkloadIdentityPool
   * 
   * Three different resources help you manage your IAM policy for Cloud IAM WorkloadIdentityPool. Each of these resources serves a different use case:
   * 
   * * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Authoritative. Sets the IAM policy for the workloadidentitypool and replaces any existing policy already attached.
   * * `gcp.iam.WorkloadIdentityPoolIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the workloadidentitypool are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.iam.WorkloadIdentityPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the workloadidentitypool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.iam.WorkloadIdentityPoolIamPolicy`: Retrieves the IAM policy for the workloadidentitypool
   * 
   * &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamPolicy` **cannot** be used in conjunction with `gcp.iam.WorkloadIdentityPoolIamBinding` and `gcp.iam.WorkloadIdentityPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.iam.WorkloadIdentityPoolIamBinding` resources **can be** used in conjunction with `gcp.iam.WorkloadIdentityPoolIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.iam.WorkloadIdentityPoolIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workloadIdentityPoolViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/iam.workloadIdentityPoolViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new WorkloadIdentityPoolIamPolicy("policy", WorkloadIdentityPoolIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.iam.WorkloadIdentityPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBinding;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamBindingArgs;
   * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkloadIdentityPoolIamBinding("binding", WorkloadIdentityPoolIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(WorkloadIdentityPoolIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.iam.WorkloadIdentityPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMember;
   * import com.pulumi.gcp.iam.WorkloadIdentityPoolIamMemberArgs;
   * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkloadIdentityPoolIamMember("member", WorkloadIdentityPoolIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .workloadIdentityPoolId(example.get("workloadIdentityPoolId"))
   *             .role("roles/iam.workloadIdentityPoolViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(WorkloadIdentityPoolIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}
   * * {{project}}/{{workload_identity_pool_id}}
   * * {{workload_identity_pool_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud IAM workloadidentitypool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_iam_workload_identity_pool_iam_member.editor &#34;projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}} roles/iam.workloadIdentityPoolViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_iam_workload_identity_pool_iam_binding.editor &#34;projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}} roles/iam.workloadIdentityPoolViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:iam/workloadIdentityPoolIamPolicy:WorkloadIdentityPoolIamPolicy editor projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkloadIdentityPoolIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicyArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPoolIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a managed identity for a workload identity pool namespace.
   * 
   * To get more information about WorkloadIdentityPoolManagedIdentity, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.workloadIdentityPools.namespaces.managedIdentities)
   * * How-to Guides
   *     * [Configure managed workload identity authentication for Compute Engine](https://cloud.google.com/iam/docs/create-managed-workload-identities)
   *     * [Configure managed workload identity authentication for GKE](https://cloud.google.com/iam/docs/create-managed-workload-identities-gke)
   */
  def WorkloadIdentityPoolManagedIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolManagedIdentityArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolManagedIdentityArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPoolManagedIdentity(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a namespace for a workload identity pool. Namespaces are used to segment identities
   * within the pool.
   * 
   * To get more information about WorkloadIdentityPoolNamespace, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.workloadIdentityPools.namespaces)
   * * How-to Guides
   *     * [Configure managed workload identity authentication for Compute Engine](https://cloud.google.com/iam/docs/create-managed-workload-identities)
   *     * [Configure managed workload identity authentication for GKE](https://cloud.google.com/iam/docs/create-managed-workload-identities-gke)
   */
  def WorkloadIdentityPoolNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolNamespaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolNamespaceArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPoolNamespace(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A configuration for an external identity provider.
   * 
   * To get more information about WorkloadIdentityPoolProvider, see:
   * 
   * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.workloadIdentityPools.providers)
   * * How-to Guides
   *     * [Managing workload identity providers](https://cloud.google.com/iam/docs/manage-workload-identity-pools-providers#managing_workload_identity_providers)
   */
  def WorkloadIdentityPoolProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityPoolProvider(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** A Service Agent within the Workload Identity API. */
  def WorkloadIdentityServiceAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.iam.WorkloadIdentityServiceAgentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.iam.WorkloadIdentityServiceAgentArgs.builder
    com.pulumi.gcp.iam.WorkloadIdentityServiceAgent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
