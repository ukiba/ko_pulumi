package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object accesscontextmanager:
  /**
   * An AccessLevel is a label that can be applied to requests to GCP services,
   * along with a list of requirements necessary for the label to be applied.
   * 
   * To get more information about AccessLevel, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
   * * How-to Guides
   *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
   * 
   * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   * you must specify a `billingProject` and set `userProjectOverride` to true
   * in the provider configuration. Otherwise the ACM API will return a 403 error.
   * Your account must have the `serviceusage.services.use` permission on the
   * `billingProject` you defined.
   */
  def AccessLevel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessLevelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessLevelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.accesscontextmanager.AccessLevel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Allows configuring a single access level condition to be appended to an access level&#39;s conditions.
   * This resource is intended to be used in cases where it is not possible to compile a full list
   * of conditions to include in a `gcp.accesscontextmanager.AccessLevel` resource,
   * to enable them to be added separately.
   * 
   * &gt; **Note:** If this resource is used alongside a `gcp.accesscontextmanager.AccessLevel` resource,
   * the access level resource must have a `lifecycle` block with `ignoreChanges = [basic[0].conditions]` so
   * they don&#39;t fight over which service accounts should be included.
   * 
   * To get more information about AccessLevelCondition, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
   * * How-to Guides
   *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
   * 
   * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   * you must specify a `billingProject` and set `userProjectOverride` to true
   * in the provider configuration. Otherwise the ACM API will return a 403 error.
   * Your account must have the `serviceusage.services.use` permission on the
   * `billingProject` you defined.
   */
  def AccessLevelCondition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessLevelConditionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessLevelConditionArgs.builder
    com.pulumi.gcp.accesscontextmanager.AccessLevelCondition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Replace all existing Access Levels in an Access Policy with the Access Levels provided. This is done atomically.
   * This is a bulk edit of all Access Levels and may override existing Access Levels created by `gcp.accesscontextmanager.AccessLevel`,
   * thus causing a permadiff if used alongside `gcp.accesscontextmanager.AccessLevel` on the same parent.
   * 
   * To get more information about AccessLevels, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
   * * How-to Guides
   *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
   * 
   * &gt; **Warning:** This resource is authoritative over the access levels under an access policy. Due to a limitation in Terraform,
   * it will overwrite all preexisting access levels during a create opration without displaying the old values on
   * the left side of plan. To prevent this, we recommend importing the resource before applying it if overwriting
   * preexisting rules, as the plan will correctly display the complete changes to your access policy if the
   * resource is present in state.
   */
  def AccessLevels(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessLevelsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessLevelsArgs.builder
    com.pulumi.gcp.accesscontextmanager.AccessLevels(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * AccessPolicy is a container for AccessLevels (which define the necessary
   * attributes to use GCP services) and ServicePerimeters (which define
   * regions of services able to freely pass data within a perimeter). An
   * access policy is globally visible within an organization, and the
   * restrictions it specifies apply to all projects within an organization.
   * 
   * To get more information about AccessPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies)
   * * How-to Guides
   *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
   * 
   * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   * you must specify a `billingProject` and set `userProjectOverride` to true
   * in the provider configuration. Otherwise the ACM API will return a 403 error.
   * Your account must have the `serviceusage.services.use` permission on the
   * `billingProject` you defined.
   * 
   * &gt; **Note:** When importing this resource by ID, use only the numeric access policy ID
   * (for example, `123456789`) and omit the `accessPolicies/` prefix.
   */
  def AccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.AccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Authoritative. Sets the IAM policy for the accesspolicy and replaces any existing policy already attached.
   * * `gcp.accesscontextmanager.AccessPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the accesspolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.accesscontextmanager.AccessPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the accesspolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Retrieves the IAM policy for the accesspolicy
   * 
   * &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamPolicy` **cannot** be used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamBinding` and `gcp.accesscontextmanager.AccessPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamBinding` resources **can be** used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamPolicy
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
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs;
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
   *                 .role("roles/accesscontextmanager.policyAdmin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AccessPolicyIamPolicy("policy", AccessPolicyIamPolicyArgs.builder()
   *             .name(access_policy.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs;
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
   *         var binding = new AccessPolicyIamBinding("binding", AccessPolicyIamBindingArgs.builder()
   *             .name(access_policy.get("name"))
   *             .role("roles/accesscontextmanager.policyAdmin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs;
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
   *         var member = new AccessPolicyIamMember("member", AccessPolicyIamMemberArgs.builder()
   *             .name(access_policy.get("name"))
   *             .role("roles/accesscontextmanager.policyAdmin")
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
   * # IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy
   * 
   * Three different resources help you manage your IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Authoritative. Sets the IAM policy for the accesspolicy and replaces any existing policy already attached.
   * * `gcp.accesscontextmanager.AccessPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the accesspolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.accesscontextmanager.AccessPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the accesspolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Retrieves the IAM policy for the accesspolicy
   * 
   * &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamPolicy` **cannot** be used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamBinding` and `gcp.accesscontextmanager.AccessPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamBinding` resources **can be** used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamPolicy
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
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs;
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
   *                 .role("roles/accesscontextmanager.policyAdmin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AccessPolicyIamPolicy("policy", AccessPolicyIamPolicyArgs.builder()
   *             .name(access_policy.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs;
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
   *         var binding = new AccessPolicyIamBinding("binding", AccessPolicyIamBindingArgs.builder()
   *             .name(access_policy.get("name"))
   *             .role("roles/accesscontextmanager.policyAdmin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs;
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
   *         var member = new AccessPolicyIamMember("member", AccessPolicyIamMemberArgs.builder()
   *             .name(access_policy.get("name"))
   *             .role("roles/accesscontextmanager.policyAdmin")
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
   * * accessPolicies/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Access Context Manager (VPC Service Controls) accesspolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_access_context_manager_access_policy_iam_member.editor &#34;accessPolicies/{{access_policy}} roles/accesscontextmanager.policyAdmin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_access_context_manager_access_policy_iam_binding.editor &#34;accessPolicies/{{access_policy}} roles/accesscontextmanager.policyAdmin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:accesscontextmanager/accessPolicyIamBinding:AccessPolicyIamBinding editor accessPolicies/{{access_policy}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AccessPolicyIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Authoritative. Sets the IAM policy for the accesspolicy and replaces any existing policy already attached.
   * * `gcp.accesscontextmanager.AccessPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the accesspolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.accesscontextmanager.AccessPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the accesspolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Retrieves the IAM policy for the accesspolicy
   * 
   * &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamPolicy` **cannot** be used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamBinding` and `gcp.accesscontextmanager.AccessPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamBinding` resources **can be** used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamPolicy
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
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs;
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
   *                 .role("roles/accesscontextmanager.policyAdmin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AccessPolicyIamPolicy("policy", AccessPolicyIamPolicyArgs.builder()
   *             .name(access_policy.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs;
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
   *         var binding = new AccessPolicyIamBinding("binding", AccessPolicyIamBindingArgs.builder()
   *             .name(access_policy.get("name"))
   *             .role("roles/accesscontextmanager.policyAdmin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs;
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
   *         var member = new AccessPolicyIamMember("member", AccessPolicyIamMemberArgs.builder()
   *             .name(access_policy.get("name"))
   *             .role("roles/accesscontextmanager.policyAdmin")
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
   * # IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy
   * 
   * Three different resources help you manage your IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Authoritative. Sets the IAM policy for the accesspolicy and replaces any existing policy already attached.
   * * `gcp.accesscontextmanager.AccessPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the accesspolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.accesscontextmanager.AccessPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the accesspolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Retrieves the IAM policy for the accesspolicy
   * 
   * &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamPolicy` **cannot** be used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamBinding` and `gcp.accesscontextmanager.AccessPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamBinding` resources **can be** used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamPolicy
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
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs;
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
   *                 .role("roles/accesscontextmanager.policyAdmin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AccessPolicyIamPolicy("policy", AccessPolicyIamPolicyArgs.builder()
   *             .name(access_policy.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs;
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
   *         var binding = new AccessPolicyIamBinding("binding", AccessPolicyIamBindingArgs.builder()
   *             .name(access_policy.get("name"))
   *             .role("roles/accesscontextmanager.policyAdmin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs;
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
   *         var member = new AccessPolicyIamMember("member", AccessPolicyIamMemberArgs.builder()
   *             .name(access_policy.get("name"))
   *             .role("roles/accesscontextmanager.policyAdmin")
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
   * * accessPolicies/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Access Context Manager (VPC Service Controls) accesspolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_access_context_manager_access_policy_iam_member.editor &#34;accessPolicies/{{access_policy}} roles/accesscontextmanager.policyAdmin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_access_context_manager_access_policy_iam_binding.editor &#34;accessPolicies/{{access_policy}} roles/accesscontextmanager.policyAdmin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:accesscontextmanager/accessPolicyIamMember:AccessPolicyIamMember editor accessPolicies/{{access_policy}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AccessPolicyIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Authoritative. Sets the IAM policy for the accesspolicy and replaces any existing policy already attached.
   * * `gcp.accesscontextmanager.AccessPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the accesspolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.accesscontextmanager.AccessPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the accesspolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Retrieves the IAM policy for the accesspolicy
   * 
   * &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamPolicy` **cannot** be used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamBinding` and `gcp.accesscontextmanager.AccessPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamBinding` resources **can be** used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamPolicy
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
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs;
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
   *                 .role("roles/accesscontextmanager.policyAdmin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AccessPolicyIamPolicy("policy", AccessPolicyIamPolicyArgs.builder()
   *             .name(access_policy.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs;
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
   *         var binding = new AccessPolicyIamBinding("binding", AccessPolicyIamBindingArgs.builder()
   *             .name(access_policy.get("name"))
   *             .role("roles/accesscontextmanager.policyAdmin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs;
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
   *         var member = new AccessPolicyIamMember("member", AccessPolicyIamMemberArgs.builder()
   *             .name(access_policy.get("name"))
   *             .role("roles/accesscontextmanager.policyAdmin")
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
   * # IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy
   * 
   * Three different resources help you manage your IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Authoritative. Sets the IAM policy for the accesspolicy and replaces any existing policy already attached.
   * * `gcp.accesscontextmanager.AccessPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the accesspolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.accesscontextmanager.AccessPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the accesspolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Retrieves the IAM policy for the accesspolicy
   * 
   * &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamPolicy` **cannot** be used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamBinding` and `gcp.accesscontextmanager.AccessPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamBinding` resources **can be** used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamPolicy
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
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs;
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
   *                 .role("roles/accesscontextmanager.policyAdmin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AccessPolicyIamPolicy("policy", AccessPolicyIamPolicyArgs.builder()
   *             .name(access_policy.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs;
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
   *         var binding = new AccessPolicyIamBinding("binding", AccessPolicyIamBindingArgs.builder()
   *             .name(access_policy.get("name"))
   *             .role("roles/accesscontextmanager.policyAdmin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.accesscontextmanager.AccessPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember;
   * import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs;
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
   *         var member = new AccessPolicyIamMember("member", AccessPolicyIamMemberArgs.builder()
   *             .name(access_policy.get("name"))
   *             .role("roles/accesscontextmanager.policyAdmin")
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
   * * accessPolicies/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Access Context Manager (VPC Service Controls) accesspolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_access_context_manager_access_policy_iam_member.editor &#34;accessPolicies/{{access_policy}} roles/accesscontextmanager.policyAdmin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_access_context_manager_access_policy_iam_binding.editor &#34;accessPolicies/{{access_policy}} roles/accesscontextmanager.policyAdmin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:accesscontextmanager/accessPolicyIamPolicy:AccessPolicyIamPolicy editor accessPolicies/{{access_policy}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AccessPolicyIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object AccesscontextmanagerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get information about an Access Context Manager AccessPolicy. */
    inline def getAccessPolicy(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.accesscontextmanager.outputs.GetAccessPolicyResult] =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyArgs.builder
      com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions.getAccessPolicy(args(argsBuilder).build)

    /** Get information about an Access Context Manager AccessPolicy. */
    inline def getAccessPolicyPlain(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.accesscontextmanager.outputs.GetAccessPolicyResult] =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyPlainArgs.builder
      com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions.getAccessPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for accesspolicy */
    inline def getAccessPolicyIamPolicy(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.accesscontextmanager.outputs.GetAccessPolicyIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyIamPolicyArgs.builder
      com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions.getAccessPolicyIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for accesspolicy */
    inline def getAccessPolicyIamPolicyPlain(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.accesscontextmanager.outputs.GetAccessPolicyIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyIamPolicyPlainArgs.builder
      com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions.getAccessPolicyIamPolicyPlain(args(argsBuilder).build)

    /** Get information about a VPC Service Controls supported service, including its supported methods. */
    inline def getSupportedService(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GetSupportedServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.accesscontextmanager.outputs.GetSupportedServiceResult] =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GetSupportedServiceArgs.builder
      com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions.getSupportedService(args(argsBuilder).build)

    /** Get information about a VPC Service Controls supported service, including its supported methods. */
    inline def getSupportedServicePlain(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GetSupportedServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.accesscontextmanager.outputs.GetSupportedServiceResult] =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GetSupportedServicePlainArgs.builder
      com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions.getSupportedServicePlain(args(argsBuilder).build)

  /**
   * An authorized organizations description describes a list of organizations
   * (1) that have been authorized to use certain asset (for example, device) data
   * owned by different organizations at the enforcement points, or (2) with certain
   * asset (for example, device) have been authorized to access the resources in
   * another organization at the enforcement points.
   * 
   * To get more information about AuthorizedOrgsDesc, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.authorizedOrgsDescs)
   * * How-to Guides
   *     * [gcloud docs](https://cloud.google.com/beyondcorp-enterprise/docs/cross-org-authorization)
   * 
   * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   * you must specify a `billingProject` and set `userProjectOverride` to true
   * in the provider configuration. Otherwise the ACM API will return a 403 error.
   * Your account must have the `serviceusage.services.use` permission on the
   * `billingProject` you defined.
   */
  def AuthorizedOrgsDesc(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AuthorizedOrgsDescArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.accesscontextmanager.AuthorizedOrgsDescArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.accesscontextmanager.AuthorizedOrgsDesc(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * This resource has been deprecated, please refer to ServicePerimeterEgressPolicy.
   * 
   * To get more information about EgressPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#egresspolicy)
   * 
   * ## Import
   * 
   * EgressPolicy can be imported using any of these accepted formats:
   * 
   * * `{{egress_policy_name}}/{{resource}}`
   * 
   * When using the `pulumi import` command, EgressPolicy can be imported using one of the formats above. For example:
   * 
   * ```sh
   * \$ pulumi import gcp:accesscontextmanager/egressPolicy:EgressPolicy default {{egress_policy_name}}/{{resource}}
   * ```
   */
  def EgressPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.EgressPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.EgressPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.EgressPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Restricts access to Cloud Console and Google Cloud APIs for a set of users using Context-Aware Access.
   * 
   * To get more information about GcpUserAccessBinding, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/organizations.gcpUserAccessBindings)
   */
  def GcpUserAccessBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.GcpUserAccessBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.GcpUserAccessBindingArgs.builder
    com.pulumi.gcp.accesscontextmanager.GcpUserAccessBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * This resource has been deprecated, please refer to ServicePerimeterIngressPolicy.
   * 
   * To get more information about IngressPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#ingresspolicy)
   * 
   * ## Import
   * 
   * IngressPolicy can be imported using any of these accepted formats:
   * 
   * * `{{ingress_policy_name}}/{{resource}}`
   * 
   * When using the `pulumi import` command, IngressPolicy can be imported using one of the formats above. For example:
   * 
   * ```sh
   * \$ pulumi import gcp:accesscontextmanager/ingressPolicy:IngressPolicy default {{ingress_policy_name}}/{{resource}}
   * ```
   */
  def IngressPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.IngressPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.IngressPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.IngressPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * ServicePerimeter describes a set of GCP resources which can freely import
   * and export data amongst themselves, but not export outside of the
   * ServicePerimeter. If a request with a source within this ServicePerimeter
   * has a target outside of the ServicePerimeter, the request will be blocked.
   * Otherwise the request is allowed. There are two types of Service Perimeter
   * - Regular and Bridge. Regular Service Perimeters cannot overlap, a single
   *   GCP project can only belong to a single regular Service Perimeter. Service
   *   Perimeter Bridges can contain only GCP projects as members, a single GCP
   *   project may belong to multiple Service Perimeter Bridges.
   * 
   * To get more information about ServicePerimeter, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters)
   * * How-to Guides
   *     * [Guide to Ingress and Egress Rules](https://cloud.google.com/vpc-service-controls/docs/ingress-egress-rules)
   *     * [Service Perimeter Quickstart](https://cloud.google.com/vpc-service-controls/docs/quickstart)
   * 
   * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   * you must specify a `billingProject` and set `userProjectOverride` to true
   * in the provider configuration. Otherwise the ACM API will return a 403 error.
   * Your account must have the `serviceusage.services.use` permission on the
   * `billingProject` you defined.
   */
  def ServicePerimeter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.accesscontextmanager.ServicePerimeter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manage a single EgressPolicy in the spec (dry-run) configuration for a service perimeter.
   * EgressPolicies match requests based on egressFrom and egressTo stanzas.
   * For an EgressPolicy to match, both egressFrom and egressTo stanzas must be matched.
   * If an EgressPolicy matches a request, the request is allowed to span the ServicePerimeter
   * boundary. For example, an EgressPolicy can be used to allow VMs on networks
   * within the ServicePerimeter to access a defined set of projects outside the
   * perimeter in certain contexts (e.g. to read data from a Cloud Storage bucket
   * or query against a BigQuery dataset).
   * 
   * &gt; **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
   * the service perimeter resource must have a `lifecycle` block with `ignoreChanges = [spec[0].egress_policies]` so
   * they don&#39;t fight over which egress rules should be in the policy.
   * 
   * To get more information about ServicePerimeterDryRunEgressPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#egresspolicy)
   * * How-to Guides
   *     * [Guide to Ingress and Egress Rules](https://cloud.google.com/vpc-service-controls/docs/ingress-egress-rules)
   */
  def ServicePerimeterDryRunEgressPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunEgressPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunEgressPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunEgressPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manage a single IngressPolicy in the spec (dry-run) configuration for a service perimeter.
   * IngressPolicies match requests based on ingressFrom and ingressTo stanzas. For an ingress policy to match,
   * both the ingressFrom and ingressTo stanzas must be matched. If an IngressPolicy matches a request,
   * the request is allowed through the perimeter boundary from outside the perimeter.
   * For example, access from the internet can be allowed either based on an AccessLevel or,
   * for traffic hosted on Google Cloud, the project of the source network.
   * For access from private networks, using the project of the hosting network is required.
   * Individual ingress policies can be limited by restricting which services and/
   * or actions they match using the ingressTo field.
   * 
   * &gt; **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
   * the service perimeter resource must have a `lifecycle` block with `ignoreChanges = [spec[0].ingress_policies]` so
   * they don&#39;t fight over which ingress rules should be in the policy.
   * 
   * To get more information about ServicePerimeterDryRunIngressPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#ingresspolicy)
   * * How-to Guides
   *     * [Guide to Ingress and Egress Rules](https://cloud.google.com/vpc-service-controls/docs/ingress-egress-rules)
   */
  def ServicePerimeterDryRunIngressPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunIngressPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunIngressPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunIngressPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Allows configuring a single GCP resource that should be inside of the `spec` block of a dry run service perimeter.
   * This resource is intended to be used in cases where it is not possible to compile a full list
   * of projects to include in a `gcp.accesscontextmanager.ServicePerimeter` resource,
   * to enable them to be added separately.
   * If your perimeter is NOT in dry-run mode use `gcp.accesscontextmanager.ServicePerimeterResource` instead.
   * 
   * &gt; **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
   * the service perimeter resource must have a `lifecycle` block with `ignoreChanges = [spec[0].resources]` so
   * they don&#39;t fight over which resources should be in the policy.
   * 
   * To get more information about ServicePerimeterDryRunResource, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters)
   * * How-to Guides
   *     * [Service Perimeter Quickstart](https://cloud.google.com/vpc-service-controls/docs/quickstart)
   * 
   * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   * you must specify a `billingProject` and set `userProjectOverride` to true
   * in the provider configuration. Otherwise the ACM API will return a 403 error.
   * Your account must have the `serviceusage.services.use` permission on the
   * `billingProject` you defined.
   */
  def ServicePerimeterDryRunResource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunResourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunResourceArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunResource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manage a single EgressPolicy in the status (enforced) configuration for a service perimeter.
   * EgressPolicies match requests based on egressFrom and egressTo stanzas.
   * For an EgressPolicy to match, both egressFrom and egressTo stanzas must be matched.
   * If an EgressPolicy matches a request, the request is allowed to span the ServicePerimeter
   * boundary. For example, an EgressPolicy can be used to allow VMs on networks
   * within the ServicePerimeter to access a defined set of projects outside the
   * perimeter in certain contexts (e.g. to read data from a Cloud Storage bucket
   * or query against a BigQuery dataset).
   * 
   * &gt; **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
   * the service perimeter resource must have a `lifecycle` block with `ignoreChanges = [status[0].egress_policies]` so
   * they don&#39;t fight over which egress rules should be in the policy.
   * 
   * To get more information about ServicePerimeterEgressPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#egresspolicy)
   * * How-to Guides
   *     * [Guide to Ingress and Egress Rules](https://cloud.google.com/vpc-service-controls/docs/ingress-egress-rules)
   */
  def ServicePerimeterEgressPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterEgressPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterEgressPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeterEgressPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manage a single IngressPolicy in the status (enforced) configuration for a service perimeter.
   * IngressPolicies match requests based on ingressFrom and ingressTo stanzas. For an ingress policy to match,
   * both the ingressFrom and ingressTo stanzas must be matched. If an IngressPolicy matches a request,
   * the request is allowed through the perimeter boundary from outside the perimeter.
   * For example, access from the internet can be allowed either based on an AccessLevel or,
   * for traffic hosted on Google Cloud, the project of the source network.
   * For access from private networks, using the project of the hosting network is required.
   * Individual ingress policies can be limited by restricting which services and/
   * or actions they match using the ingressTo field.
   * 
   * &gt; **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
   * the service perimeter resource must have a `lifecycle` block with `ignoreChanges = [status[0].ingress_policies]` so
   * they don&#39;t fight over which ingress rules should be in the policy.
   * 
   * To get more information about ServicePerimeterIngressPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#ingresspolicy)
   * * How-to Guides
   *     * [Guide to Ingress and Egress Rules](https://cloud.google.com/vpc-service-controls/docs/ingress-egress-rules)
   */
  def ServicePerimeterIngressPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterIngressPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterIngressPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeterIngressPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Allows configuring a single GCP resource that should be inside the `status` block of a service perimeter.
   * This resource is intended to be used in cases where it is not possible to compile a full list
   * of projects to include in a `gcp.accesscontextmanager.ServicePerimeter` resource,
   * to enable them to be added separately.
   * If your perimeter is in dry-run mode use `gcp.accesscontextmanager.ServicePerimeterDryRunResource` instead.
   * 
   * &gt; **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
   * the service perimeter resource must have a `lifecycle` block with `ignoreChanges = [status[0].resources]` so
   * they don&#39;t fight over which resources should be in the policy.
   * 
   * To get more information about ServicePerimeterResource, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters)
   * * How-to Guides
   *     * [Service Perimeter Quickstart](https://cloud.google.com/vpc-service-controls/docs/quickstart)
   * 
   * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   * you must specify a `billingProject` and set `userProjectOverride` to true
   * in the provider configuration. Otherwise the ACM API will return a 403 error.
   * Your account must have the `serviceusage.services.use` permission on the
   * `billingProject` you defined.
   */
  def ServicePerimeterResource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterResourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterResourceArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeterResource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Replace all existing Service Perimeters in an Access Policy with the Service Perimeters provided. This is done atomically.
   * This is a bulk edit of all Service Perimeters and may override existing Service Perimeters created by `gcp.accesscontextmanager.ServicePerimeter`,
   * thus causing a permadiff if used alongside `gcp.accesscontextmanager.ServicePerimeter` on the same parent.
   * 
   * To get more information about ServicePerimeters, see:
   * 
   * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters)
   * * How-to Guides
   *     * [Guide to Ingress and Egress Rules](https://cloud.google.com/vpc-service-controls/docs/ingress-egress-rules)
   *     * [Service Perimeter Quickstart](https://cloud.google.com/vpc-service-controls/docs/quickstart)
   */
  def ServicePerimeters(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimetersArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimetersArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeters(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
