package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object accesscontextmanager:
  /**
   * Allows configuring a single GCP resource that should be inside the `status` block of a service perimeter.
   *  This resource is intended to be used in cases where it is not possible to compile a full list
   *  of projects to include in a `gcp.accesscontextmanager.ServicePerimeter` resource,
   *  to enable them to be added separately.
   *  If your perimeter is in dry-run mode use `gcp.accesscontextmanager.ServicePerimeterDryRunResource` instead.
   * 
   *  &gt; **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
   *  the service perimeter resource must have a `lifecycle` block with `ignoreChanges = [status[0].resources]` so
   *  they don&#39;t fight over which resources should be in the policy.
   * 
   *  To get more information about ServicePerimeterResource, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters)
   *  * How-to Guides
   *      * [Service Perimeter Quickstart](https://cloud.google.com/vpc-service-controls/docs/quickstart)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   *  you must specify a `billingProject` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the ACM API will return a 403 error.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProject` you defined.
   */
  def ServicePerimeterResource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterResourceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterResourceArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeterResource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy. Each of these resources serves a different use case:
   * 
   *  * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Authoritative. Sets the IAM policy for the accesspolicy and replaces any existing policy already attached.
   *  * `gcp.accesscontextmanager.AccessPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the accesspolicy are preserved.
   *  * `gcp.accesscontextmanager.AccessPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the accesspolicy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Retrieves the IAM policy for the accesspolicy
   * 
   *  &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamPolicy` **cannot** be used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamBinding` and `gcp.accesscontextmanager.AccessPolicyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamBinding` resources **can be** used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamPolicy
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
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs;
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
   *                  .role("roles/accesscontextmanager.policyAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new AccessPolicyIamPolicy("policy", AccessPolicyIamPolicyArgs.builder()
   *              .name(access_policy.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs;
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
   *          var binding = new AccessPolicyIamBinding("binding", AccessPolicyIamBindingArgs.builder()
   *              .name(access_policy.name())
   *              .role("roles/accesscontextmanager.policyAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs;
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
   *          var member = new AccessPolicyIamMember("member", AccessPolicyIamMemberArgs.builder()
   *              .name(access_policy.name())
   *              .role("roles/accesscontextmanager.policyAdmin")
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
   *  # IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy
   * 
   *  Three different resources help you manage your IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy. Each of these resources serves a different use case:
   * 
   *  * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Authoritative. Sets the IAM policy for the accesspolicy and replaces any existing policy already attached.
   *  * `gcp.accesscontextmanager.AccessPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the accesspolicy are preserved.
   *  * `gcp.accesscontextmanager.AccessPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the accesspolicy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Retrieves the IAM policy for the accesspolicy
   * 
   *  &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamPolicy` **cannot** be used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamBinding` and `gcp.accesscontextmanager.AccessPolicyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamBinding` resources **can be** used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamPolicy
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
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs;
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
   *                  .role("roles/accesscontextmanager.policyAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new AccessPolicyIamPolicy("policy", AccessPolicyIamPolicyArgs.builder()
   *              .name(access_policy.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs;
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
   *          var binding = new AccessPolicyIamBinding("binding", AccessPolicyIamBindingArgs.builder()
   *              .name(access_policy.name())
   *              .role("roles/accesscontextmanager.policyAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs;
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
   *          var member = new AccessPolicyIamMember("member", AccessPolicyIamMemberArgs.builder()
   *              .name(access_policy.name())
   *              .role("roles/accesscontextmanager.policyAdmin")
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
   *  * accessPolicies/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Access Context Manager (VPC Service Controls) accesspolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_access_context_manager_access_policy_iam_member.editor &#34;accessPolicies/{{access_policy}} roles/accesscontextmanager.policyAdmin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_access_context_manager_access_policy_iam_binding.editor &#34;accessPolicies/{{access_policy}} roles/accesscontextmanager.policyAdmin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:accesscontextmanager/accessPolicyIamMember:AccessPolicyIamMember editor accessPolicies/{{access_policy}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AccessPolicyIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.AccessLevelConditionArgs.Builder)
    /**
     * @param devicePolicy Device specific restrictions, all restrictions must hold for
     *  the Condition to be true. If not specified, all devices are
     *  allowed.
     *  Structure is documented below.
     * @return builder
     */
    def devicePolicy(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.AccessLevelConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyArgs.builder
      builder.devicePolicy(args(argsBuilder).build)

    /**
     * @param vpcNetworkSources The request must originate from one of the provided VPC networks in Google Cloud. Cannot specify this field together with `ipSubnetworks`.
     *  Structure is documented below.
     * @return builder
     */
    def vpcNetworkSources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.AccessLevelConditionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceArgs.builder
      builder.vpcNetworkSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunIngressPolicyArgs.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     *  to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     *  this `IngressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.AccessLevelsArgs.Builder)
    /**
     * @param accessLevels The desired Access Levels that should replace all existing Access Levels in the Access Policy.
     *  Structure is documented below.
     * @return builder
     */
    def accessLevels(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.AccessLevelsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.builder
      builder.accessLevels(args.map(_(argsBuilder).build)*)

  /**
   * Replace all existing Service Perimeters in an Access Policy with the Service Perimeters provided. This is done atomically.
   *  This is a bulk edit of all Service Perimeters and may override existing Service Perimeters created by `gcp.accesscontextmanager.ServicePerimeter`,
   *  thus causing a permadiff if used alongside `gcp.accesscontextmanager.ServicePerimeter` on the same parent.
   * 
   *  To get more information about ServicePerimeters, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters)
   *  * How-to Guides
   *      * [Guide to Ingress and Egress Rules](https://cloud.google.com/vpc-service-controls/docs/ingress-egress-rules)
   *      * [Service Perimeter Quickstart](https://cloud.google.com/vpc-service-controls/docs/quickstart)
   */
  def ServicePerimeters(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimetersArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimetersArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeters(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy. Each of these resources serves a different use case:
   * 
   *  * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Authoritative. Sets the IAM policy for the accesspolicy and replaces any existing policy already attached.
   *  * `gcp.accesscontextmanager.AccessPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the accesspolicy are preserved.
   *  * `gcp.accesscontextmanager.AccessPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the accesspolicy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Retrieves the IAM policy for the accesspolicy
   * 
   *  &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamPolicy` **cannot** be used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamBinding` and `gcp.accesscontextmanager.AccessPolicyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamBinding` resources **can be** used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamPolicy
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
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs;
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
   *                  .role("roles/accesscontextmanager.policyAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new AccessPolicyIamPolicy("policy", AccessPolicyIamPolicyArgs.builder()
   *              .name(access_policy.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs;
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
   *          var binding = new AccessPolicyIamBinding("binding", AccessPolicyIamBindingArgs.builder()
   *              .name(access_policy.name())
   *              .role("roles/accesscontextmanager.policyAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs;
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
   *          var member = new AccessPolicyIamMember("member", AccessPolicyIamMemberArgs.builder()
   *              .name(access_policy.name())
   *              .role("roles/accesscontextmanager.policyAdmin")
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
   *  # IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy
   * 
   *  Three different resources help you manage your IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy. Each of these resources serves a different use case:
   * 
   *  * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Authoritative. Sets the IAM policy for the accesspolicy and replaces any existing policy already attached.
   *  * `gcp.accesscontextmanager.AccessPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the accesspolicy are preserved.
   *  * `gcp.accesscontextmanager.AccessPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the accesspolicy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Retrieves the IAM policy for the accesspolicy
   * 
   *  &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamPolicy` **cannot** be used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamBinding` and `gcp.accesscontextmanager.AccessPolicyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamBinding` resources **can be** used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamPolicy
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
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs;
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
   *                  .role("roles/accesscontextmanager.policyAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new AccessPolicyIamPolicy("policy", AccessPolicyIamPolicyArgs.builder()
   *              .name(access_policy.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs;
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
   *          var binding = new AccessPolicyIamBinding("binding", AccessPolicyIamBindingArgs.builder()
   *              .name(access_policy.name())
   *              .role("roles/accesscontextmanager.policyAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs;
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
   *          var member = new AccessPolicyIamMember("member", AccessPolicyIamMemberArgs.builder()
   *              .name(access_policy.name())
   *              .role("roles/accesscontextmanager.policyAdmin")
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
   *  * accessPolicies/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Access Context Manager (VPC Service Controls) accesspolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_access_context_manager_access_policy_iam_member.editor &#34;accessPolicies/{{access_policy}} roles/accesscontextmanager.policyAdmin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_access_context_manager_access_policy_iam_binding.editor &#34;accessPolicies/{{access_policy}} roles/accesscontextmanager.policyAdmin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:accesscontextmanager/accessPolicyIamPolicy:AccessPolicyIamPolicy editor accessPolicies/{{access_policy}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AccessPolicyIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Allows configuring a single access level condition to be appended to an access level&#39;s conditions.
   *  This resource is intended to be used in cases where it is not possible to compile a full list
   *  of conditions to include in a `gcp.accesscontextmanager.AccessLevel` resource,
   *  to enable them to be added separately.
   * 
   *  &gt; **Note:** If this resource is used alongside a `gcp.accesscontextmanager.AccessLevel` resource,
   *  the access level resource must have a `lifecycle` block with `ignoreChanges = [basic[0].conditions]` so
   *  they don&#39;t fight over which service accounts should be included.
   * 
   *  To get more information about AccessLevelCondition, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
   *  * How-to Guides
   *      * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   *  you must specify a `billingProject` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the ACM API will return a 403 error.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProject` you defined.
   */
  def AccessLevelCondition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessLevelConditionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessLevelConditionArgs.builder
    com.pulumi.gcp.accesscontextmanager.AccessLevelCondition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * This resource has been deprecated, please refer to ServicePerimeterIngressPolicy.
   * 
   *  To get more information about IngressPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#ingresspolicy)
   * 
   *  ## Import
   * 
   *  IngressPolicy can be imported using any of these accepted formats:
   * 
   *  * `{{ingress_policy_name}}/{{resource}}`
   * 
   *  When using the `pulumi import` command, IngressPolicy can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:accesscontextmanager/ingressPolicy:IngressPolicy default {{ingress_policy_name}}/{{resource}}
   *  ```
   */
  def IngressPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.IngressPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.IngressPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.IngressPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * AccessPolicy is a container for AccessLevels (which define the necessary
   *  attributes to use GCP services) and ServicePerimeters (which define
   *  regions of services able to freely pass data within a perimeter). An
   *  access policy is globally visible within an organization, and the
   *  restrictions it specifies apply to all projects within an organization.
   * 
   *  To get more information about AccessPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies)
   *  * How-to Guides
   *      * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   *  you must specify a `billingProject` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the ACM API will return a 403 error.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProject` you defined.
   */
  def AccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.AccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * ServicePerimeter describes a set of GCP resources which can freely import
   *  and export data amongst themselves, but not export outside of the
   *  ServicePerimeter. If a request with a source within this ServicePerimeter
   *  has a target outside of the ServicePerimeter, the request will be blocked.
   *  Otherwise the request is allowed. There are two types of Service Perimeter
   *  - Regular and Bridge. Regular Service Perimeters cannot overlap, a single
   *    GCP project can only belong to a single regular Service Perimeter. Service
   *    Perimeter Bridges can contain only GCP projects as members, a single GCP
   *    project may belong to multiple Service Perimeter Bridges.
   * 
   *  To get more information about ServicePerimeter, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters)
   *  * How-to Guides
   *      * [Guide to Ingress and Egress Rules](https://cloud.google.com/vpc-service-controls/docs/ingress-egress-rules)
   *      * [Service Perimeter Quickstart](https://cloud.google.com/vpc-service-controls/docs/quickstart)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   *  you must specify a `billingProject` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the ACM API will return a 403 error.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProject` you defined.
   */
  def ServicePerimeter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.accesscontextmanager.ServicePerimeter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.ServicePerimetersArgs.Builder)
    /**
     * @param servicePerimeters The desired Service Perimeters that should replace all existing Service Perimeters in the Access Policy.
     *  Structure is documented below.
     * @return builder
     */
    def servicePerimeters(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.ServicePerimetersArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.builder
      builder.servicePerimeters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.ServicePerimeterEgressPolicyArgs.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     *  cause this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.AccessLevelArgs.Builder)
    /**
     * @param basic A set of predefined conditions for the access level and a combining function.
     *  Structure is documented below.
     * @return builder
     */
    def basic(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.AccessLevelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicArgs.builder
      builder.basic(args(argsBuilder).build)

    /**
     * @param custom Custom access level conditions are set using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request.
     *  See CEL spec at: https://github.com/google/cel-spec.
     *  Structure is documented below.
     * @return builder
     */
    def custom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.AccessLevelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomArgs.builder
      builder.custom(args(argsBuilder).build)

  /**
   * Restricts access to Cloud Console and Google Cloud APIs for a set of users using Context-Aware Access.
   * 
   *  To get more information about GcpUserAccessBinding, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/organizations.gcpUserAccessBindings)
   */
  def GcpUserAccessBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.GcpUserAccessBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.GcpUserAccessBindingArgs.builder
    com.pulumi.gcp.accesscontextmanager.GcpUserAccessBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An authorized organizations description describes a list of organizations
   *  (1) that have been authorized to use certain asset (for example, device) data
   *  owned by different organizations at the enforcement points, or (2) with certain
   *  asset (for example, device) have been authorized to access the resources in
   *  another organization at the enforcement points.
   * 
   *  To get more information about AuthorizedOrgsDesc, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.authorizedOrgsDescs)
   *  * How-to Guides
   *      * [gcloud docs](https://cloud.google.com/beyondcorp-enterprise/docs/cross-org-authorization)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   *  you must specify a `billingProject` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the ACM API will return a 403 error.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProject` you defined.
   */
  def AuthorizedOrgsDesc(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AuthorizedOrgsDescArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.accesscontextmanager.AuthorizedOrgsDescArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.accesscontextmanager.AuthorizedOrgsDesc(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manage a single EgressPolicy in the spec (dry-run) configuration for a service perimeter.
   *  EgressPolicies match requests based on egressFrom and egressTo stanzas.
   *  For an EgressPolicy to match, both egressFrom and egressTo stanzas must be matched.
   *  If an EgressPolicy matches a request, the request is allowed to span the ServicePerimeter
   *  boundary. For example, an EgressPolicy can be used to allow VMs on networks
   *  within the ServicePerimeter to access a defined set of projects outside the
   *  perimeter in certain contexts (e.g. to read data from a Cloud Storage bucket
   *  or query against a BigQuery dataset).
   * 
   *  &gt; **Note:** By default, updates to this resource will remove the EgressPolicy from the
   *  from the perimeter and add it back in a non-atomic manner. To ensure that the new EgressPolicy
   *  is added before the old one is removed, add a `lifecycle` block with `createBeforeDestroy = true` to this resource.
   *  **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
   *  the service perimeter resource must have a `lifecycle` block with `ignoreChanges = [spec[0].egress_policies]` so
   *  they don&#39;t fight over which egress rules should be in the policy.
   * 
   *  To get more information about ServicePerimeterDryRunEgressPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#egresspolicy)
   *  * How-to Guides
   *      * [Guide to Ingress and Egress Rules](https://cloud.google.com/vpc-service-controls/docs/ingress-egress-rules)
   */
  def ServicePerimeterDryRunEgressPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunEgressPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunEgressPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunEgressPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Replace all existing Access Levels in an Access Policy with the Access Levels provided. This is done atomically.
   *  This is a bulk edit of all Access Levels and may override existing Access Levels created by `gcp.accesscontextmanager.AccessLevel`,
   *  thus causing a permadiff if used alongside `gcp.accesscontextmanager.AccessLevel` on the same parent.
   * 
   *  To get more information about AccessLevels, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
   *  * How-to Guides
   *      * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
   * 
   *  &gt; **Warning:** This resource is authoritative over the access levels under an access policy. Due to a limitation in Terraform,
   *  it will overwrite all preexisting access levels during a create opration without displaying the old values on
   *  the left side of plan. To prevent this, we recommend importing the resource before applying it if overwriting
   *  preexisting rules, as the plan will correctly display the complete changes to your access policy if the
   *  resource is present in state.
   */
  def AccessLevels(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessLevelsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessLevelsArgs.builder
    com.pulumi.gcp.accesscontextmanager.AccessLevels(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.ServicePerimeterIngressPolicyArgs.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     *  to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     *  this `IngressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Allows configuring a single GCP resource that should be inside of the `spec` block of a dry run service perimeter.
   *  This resource is intended to be used in cases where it is not possible to compile a full list
   *  of projects to include in a `gcp.accesscontextmanager.ServicePerimeter` resource,
   *  to enable them to be added separately.
   *  If your perimeter is NOT in dry-run mode use `gcp.accesscontextmanager.ServicePerimeterResource` instead.
   * 
   *  &gt; **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
   *  the service perimeter resource must have a `lifecycle` block with `ignoreChanges = [spec[0].resources]` so
   *  they don&#39;t fight over which resources should be in the policy.
   * 
   *  To get more information about ServicePerimeterDryRunResource, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters)
   *  * How-to Guides
   *      * [Service Perimeter Quickstart](https://cloud.google.com/vpc-service-controls/docs/quickstart)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   *  you must specify a `billingProject` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the ACM API will return a 403 error.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProject` you defined.
   */
  def ServicePerimeterDryRunResource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunResourceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunResourceArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunResource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An AccessLevel is a label that can be applied to requests to GCP services,
   *  along with a list of requirements necessary for the label to be applied.
   * 
   *  To get more information about AccessLevel, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
   *  * How-to Guides
   *      * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   *  you must specify a `billingProject` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the ACM API will return a 403 error.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProject` you defined.
   */
  def AccessLevel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessLevelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessLevelArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.accesscontextmanager.AccessLevel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * This resource has been deprecated, please refer to ServicePerimeterEgressPolicy.
   * 
   *  To get more information about EgressPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#egresspolicy)
   * 
   *  ## Import
   * 
   *  EgressPolicy can be imported using any of these accepted formats:
   * 
   *  * `{{egress_policy_name}}/{{resource}}`
   * 
   *  When using the `pulumi import` command, EgressPolicy can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:accesscontextmanager/egressPolicy:EgressPolicy default {{egress_policy_name}}/{{resource}}
   *  ```
   */
  def EgressPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.EgressPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.EgressPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.EgressPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.ServicePerimeterArgs.Builder)
    /**
     * @param spec Proposed (or dry run) ServicePerimeter configuration.
     *  This configuration allows to specify and test ServicePerimeter configuration
     *  without enforcing actual access restrictions. Only allowed to be set when
     *  the `useExplicitDryRunSpec` flag is set.
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.builder
      builder.spec(args(argsBuilder).build)

    /**
     * @param status ServicePerimeter configuration. Specifies sets of resources,
     *  restricted services and access levels that determine
     *  perimeter content and boundaries.
     *  Structure is documented below.
     * @return builder
     */
    def status(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.builder
      builder.status(args(argsBuilder).build)

  type AccesscontextmanagerFunctions = com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions
  object AccesscontextmanagerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions.*
  extension (self: AccesscontextmanagerFunctions.type)
    /** Get information about an Access Context Manager AccessPolicy. */
    def getAccessPolicy(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.accesscontextmanager.outputs.GetAccessPolicyResult] =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyArgs.builder
      com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions.getAccessPolicy(args(argsBuilder).build)

    /** Get information about an Access Context Manager AccessPolicy. */
    def getAccessPolicyPlain(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.accesscontextmanager.outputs.GetAccessPolicyResult] =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyPlainArgs.builder
      com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions.getAccessPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for accesspolicy */
    def getAccessPolicyIamPolicy(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.accesscontextmanager.outputs.GetAccessPolicyIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyIamPolicyArgs.builder
      com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions.getAccessPolicyIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for accesspolicy */
    def getAccessPolicyIamPolicyPlain(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.accesscontextmanager.outputs.GetAccessPolicyIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GetAccessPolicyIamPolicyPlainArgs.builder
      com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions.getAccessPolicyIamPolicyPlain(args(argsBuilder).build)

    /** Get information about a VPC Service Controls supported service, including its supported methods. */
    def getSupportedService(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GetSupportedServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.accesscontextmanager.outputs.GetSupportedServiceResult] =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GetSupportedServiceArgs.builder
      com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions.getSupportedService(args(argsBuilder).build)

    /** Get information about a VPC Service Controls supported service, including its supported methods. */
    def getSupportedServicePlain(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GetSupportedServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.accesscontextmanager.outputs.GetSupportedServiceResult] =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GetSupportedServicePlainArgs.builder
      com.pulumi.gcp.accesscontextmanager.AccesscontextmanagerFunctions.getSupportedServicePlain(args(argsBuilder).build)

  /**
   * Manage a single IngressPolicy in the spec (dry-run) configuration for a service perimeter.
   *  IngressPolicies match requests based on ingressFrom and ingressTo stanzas. For an ingress policy to match,
   *  both the ingressFrom and ingressTo stanzas must be matched. If an IngressPolicy matches a request,
   *  the request is allowed through the perimeter boundary from outside the perimeter.
   *  For example, access from the internet can be allowed either based on an AccessLevel or,
   *  for traffic hosted on Google Cloud, the project of the source network.
   *  For access from private networks, using the project of the hosting network is required.
   *  Individual ingress policies can be limited by restricting which services and/
   *  or actions they match using the ingressTo field.
   * 
   *  &gt; **Note:** By default, updates to this resource will remove the IngressPolicy from the
   *  from the perimeter and add it back in a non-atomic manner. To ensure that the new IngressPolicy
   *  is added before the old one is removed, add a `lifecycle` block with `createBeforeDestroy = true` to this resource.
   *  **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
   *  the service perimeter resource must have a `lifecycle` block with `ignoreChanges = [spec[0].ingress_policies]` so
   *  they don&#39;t fight over which ingress rules should be in the policy.
   * 
   *  To get more information about ServicePerimeterDryRunIngressPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#ingresspolicy)
   *  * How-to Guides
   *      * [Guide to Ingress and Egress Rules](https://cloud.google.com/vpc-service-controls/docs/ingress-egress-rules)
   */
  def ServicePerimeterDryRunIngressPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunIngressPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunIngressPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunIngressPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunEgressPolicyArgs.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     *  cause this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.ServicePerimeterDryRunEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.GcpUserAccessBindingArgs.Builder)
    /**
     * @param scopedAccessSettings Optional. A list of scoped access settings that set this binding&#39;s restrictions on a subset of applications.
     *  Structure is documented below.
     * @return builder
     */
    def scopedAccessSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.GcpUserAccessBindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.builder
      builder.scopedAccessSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param sessionSettings Optional. The Google Cloud session length (GCSL) policy for the group key.
     *  Structure is documented below.
     * @return builder
     */
    def sessionSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingSessionSettingsArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.GcpUserAccessBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingSessionSettingsArgs.builder
      builder.sessionSettings(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy. Each of these resources serves a different use case:
   * 
   *  * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Authoritative. Sets the IAM policy for the accesspolicy and replaces any existing policy already attached.
   *  * `gcp.accesscontextmanager.AccessPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the accesspolicy are preserved.
   *  * `gcp.accesscontextmanager.AccessPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the accesspolicy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Retrieves the IAM policy for the accesspolicy
   * 
   *  &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamPolicy` **cannot** be used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamBinding` and `gcp.accesscontextmanager.AccessPolicyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamBinding` resources **can be** used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamPolicy
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
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs;
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
   *                  .role("roles/accesscontextmanager.policyAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new AccessPolicyIamPolicy("policy", AccessPolicyIamPolicyArgs.builder()
   *              .name(access_policy.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs;
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
   *          var binding = new AccessPolicyIamBinding("binding", AccessPolicyIamBindingArgs.builder()
   *              .name(access_policy.name())
   *              .role("roles/accesscontextmanager.policyAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs;
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
   *          var member = new AccessPolicyIamMember("member", AccessPolicyIamMemberArgs.builder()
   *              .name(access_policy.name())
   *              .role("roles/accesscontextmanager.policyAdmin")
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
   *  # IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy
   * 
   *  Three different resources help you manage your IAM policy for Access Context Manager (VPC Service Controls) AccessPolicy. Each of these resources serves a different use case:
   * 
   *  * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Authoritative. Sets the IAM policy for the accesspolicy and replaces any existing policy already attached.
   *  * `gcp.accesscontextmanager.AccessPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the accesspolicy are preserved.
   *  * `gcp.accesscontextmanager.AccessPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the accesspolicy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.accesscontextmanager.AccessPolicyIamPolicy`: Retrieves the IAM policy for the accesspolicy
   * 
   *  &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamPolicy` **cannot** be used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamBinding` and `gcp.accesscontextmanager.AccessPolicyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.accesscontextmanager.AccessPolicyIamBinding` resources **can be** used in conjunction with `gcp.accesscontextmanager.AccessPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamPolicy
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
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicy;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamPolicyArgs;
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
   *                  .role("roles/accesscontextmanager.policyAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new AccessPolicyIamPolicy("policy", AccessPolicyIamPolicyArgs.builder()
   *              .name(access_policy.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs;
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
   *          var binding = new AccessPolicyIamBinding("binding", AccessPolicyIamBindingArgs.builder()
   *              .name(access_policy.name())
   *              .role("roles/accesscontextmanager.policyAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.accesscontextmanager.AccessPolicyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMember;
   *  import com.pulumi.gcp.accesscontextmanager.AccessPolicyIamMemberArgs;
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
   *          var member = new AccessPolicyIamMember("member", AccessPolicyIamMemberArgs.builder()
   *              .name(access_policy.name())
   *              .role("roles/accesscontextmanager.policyAdmin")
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
   *  * accessPolicies/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Access Context Manager (VPC Service Controls) accesspolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_access_context_manager_access_policy_iam_member.editor &#34;accessPolicies/{{access_policy}} roles/accesscontextmanager.policyAdmin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_access_context_manager_access_policy_iam_binding.editor &#34;accessPolicies/{{access_policy}} roles/accesscontextmanager.policyAdmin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:accesscontextmanager/accessPolicyIamBinding:AccessPolicyIamBinding editor accessPolicies/{{access_policy}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AccessPolicyIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.accesscontextmanager.AccessPolicyIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manage a single IngressPolicy in the status (enforced) configuration for a service perimeter.
   *  IngressPolicies match requests based on ingressFrom and ingressTo stanzas. For an ingress policy to match,
   *  both the ingressFrom and ingressTo stanzas must be matched. If an IngressPolicy matches a request,
   *  the request is allowed through the perimeter boundary from outside the perimeter.
   *  For example, access from the internet can be allowed either based on an AccessLevel or,
   *  for traffic hosted on Google Cloud, the project of the source network.
   *  For access from private networks, using the project of the hosting network is required.
   *  Individual ingress policies can be limited by restricting which services and/
   *  or actions they match using the ingressTo field.
   * 
   *  &gt; **Note:** By default, updates to this resource will remove the IngressPolicy from the
   *  from the perimeter and add it back in a non-atomic manner. To ensure that the new IngressPolicy
   *  is added before the old one is removed, add a `lifecycle` block with `createBeforeDestroy = true` to this resource.
   *  **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
   *  the service perimeter resource must have a `lifecycle` block with `ignoreChanges = [status[0].ingress_policies]` so
   *  they don&#39;t fight over which ingress rules should be in the policy.
   * 
   *  To get more information about ServicePerimeterIngressPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#ingresspolicy)
   *  * How-to Guides
   *      * [Guide to Ingress and Egress Rules](https://cloud.google.com/vpc-service-controls/docs/ingress-egress-rules)
   */
  def ServicePerimeterIngressPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterIngressPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterIngressPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeterIngressPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.Builder)
    /**
     * @param basic A set of predefined conditions for the access level and a combining function.
     *  Structure is documented below.
     * @return builder
     */
    def basic(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicArgs.builder
      builder.basic(args(argsBuilder).build)

    /**
     * @param custom Custom access level conditions are set using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request.
     *  See CEL spec at: https://github.com/google/cel-spec.
     *  Structure is documented below.
     * @return builder
     */
    def custom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomArgs.builder
      builder.custom(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionArgs.Builder)
    /**
     * @param devicePolicy Device specific restrictions, all restrictions must hold for
     *  the Condition to be true. If not specified, all devices are
     *  allowed.
     *  Structure is documented below.
     * @return builder
     */
    def devicePolicy(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyArgs.builder
      builder.devicePolicy(args(argsBuilder).build)

    /**
     * @param vpcNetworkSources The request must originate from one of the provided VPC networks in Google Cloud. Cannot specify this field together with `ipSubnetworks`.
     *  Structure is documented below.
     * @return builder
     */
    def vpcNetworkSources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionVpcNetworkSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionVpcNetworkSourceArgs.builder
      builder.vpcNetworkSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs.Builder)
    /**
     * @param sources Sources that this EgressPolicy authorizes access from.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong to
     *  the service specified by serviceName field. A single `MethodSelector` entry
     *  with `*` specified for the method field will allow all methods AND
     *  permissions for the service specified in `serviceName`.
     *  Structure is documented below.
     * @return builder
     */
    def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyArgs.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     *  cause this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeArgs.Builder)
    /**
     * @param clientScope Optional. Client scope for this access scope.
     *  Structure is documented below.
     * @return builder
     */
    def clientScope(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeClientScopeArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeClientScopeArgs.builder
      builder.clientScope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     *  are allowed to perform in this `ServicePerimeter`.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicArgs.Builder)
    /**
     * @param conditions A set of requirements for the AccessLevel to be granted.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomArgs.Builder)
    /**
     * @param expr Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language.
     *  This page details the objects and attributes that are used to the build the CEL expressions for
     *  custom access levels - https://cloud.google.com/access-context-manager/docs/custom-access-level-spec.
     *  Structure is documented below.
     * @return builder
     */
    def expr(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomExprArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomExprArgs.builder
      builder.expr(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionVpcNetworkSourceArgs.Builder)
    /**
     * @param vpcSubnetwork Sub networks within a VPC network.
     *  Structure is documented below.
     * @return builder
     */
    def vpcSubnetwork(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionVpcNetworkSourceVpcSubnetworkArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionVpcNetworkSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionVpcNetworkSourceVpcSubnetworkArgs.builder
      builder.vpcSubnetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyState.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     *  to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     *  this `IngressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     *  to the service specified by `serviceName` field. A single MethodSelector
     *  entry with `*` specified for the `method` field will allow all methods
     *  AND permissions for the service specified in `serviceName`.
     *  Structure is documented below.
     * @return builder
     */
    def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceArgs.Builder)
    /**
     * @param vpcSubnetwork Sub networks within a VPC network.
     *  Structure is documented below.
     * @return builder
     */
    def vpcSubnetwork(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceVpcSubnetworkArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceVpcSubnetworkArgs.builder
      builder.vpcSubnetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusArgs.Builder)
    /**
     * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may
     *  have multiple EgressPolicies, each of which is evaluated separately.
     *  Access is granted if any EgressPolicy grants it. Must be empty for
     *  a perimeter bridge.
     *  Structure is documented below.
     * @return builder
     */
    def egressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyArgs.builder
      builder.egressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param ingressPolicies List of `IngressPolicies` to apply to the perimeter. A perimeter may
     *  have multiple `IngressPolicies`, each of which is evaluated
     *  separately. Access is granted if any `Ingress Policy` grants it.
     *  Must be empty for a perimeter bridge.
     *  Structure is documented below.
     * @return builder
     */
    def ingressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyArgs.builder
      builder.ingressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcAccessibleServices Specifies how APIs are allowed to communicate within the Service
     *  Perimeter.
     *  Structure is documented below.
     * @return builder
     */
    def vpcAccessibleServices(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesArgs.builder
      builder.vpcAccessibleServices(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` that this egress rule applies to. A request matches
     *  if it contains an operation/service in this list.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyArgs.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     *  cause this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     *  to the service specified by `serviceName` field. A single MethodSelector
     *  entry with `*` specified for the `method` field will allow all methods
     *  AND permissions for the service specified in `serviceName`.
     *  Structure is documented below.
     * @return builder
     */
    def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionState.Builder)
    /**
     * @param devicePolicy Device specific restrictions, all restrictions must hold for
     *  the Condition to be true. If not specified, all devices are
     *  allowed.
     *  Structure is documented below.
     * @return builder
     */
    def devicePolicy(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyArgs.builder
      builder.devicePolicy(args(argsBuilder).build)

    /**
     * @param vpcNetworkSources The request must originate from one of the provided VPC networks in Google Cloud. Cannot specify this field together with `ipSubnetworks`.
     *  Structure is documented below.
     * @return builder
     */
    def vpcNetworkSources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionState.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionVpcNetworkSourceArgs.builder
      builder.vpcNetworkSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.Builder)
    /**
     * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may
     *  have multiple EgressPolicies, each of which is evaluated separately.
     *  Access is granted if any EgressPolicy grants it. Must be empty for
     *  a perimeter bridge.
     *  Structure is documented below.
     * @return builder
     */
    def egressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyArgs.builder
      builder.egressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param ingressPolicies List of `IngressPolicies` to apply to the perimeter. A perimeter may
     *  have multiple `IngressPolicies`, each of which is evaluated
     *  separately. Access is granted if any `Ingress Policy` grants it.
     *  Must be empty for a perimeter bridge.
     *  Structure is documented below.
     * @return builder
     */
    def ingressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyArgs.builder
      builder.ingressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcAccessibleServices Specifies how APIs are allowed to communicate within the Service
     *  Perimeter.
     *  Structure is documented below.
     * @return builder
     */
    def vpcAccessibleServices(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesArgs.builder
      builder.vpcAccessibleServices(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeClientScopeArgs.Builder)
    /**
     * @param restrictedClientApplication Optional. The application that is subject to this binding&#39;s scope. Only one of clientId or name should be specified.
     *  Structure is documented below.
     * @return builder
     */
    def restrictedClientApplication(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeClientScopeRestrictedClientApplicationArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeClientScopeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeClientScopeRestrictedClientApplicationArgs.builder
      builder.restrictedClientApplication(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomArgs.Builder)
    /**
     * @param expr Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language.
     *  This page details the objects and attributes that are used to the build the CEL expressions for
     *  custom access levels - https://cloud.google.com/access-context-manager/docs/custom-access-level-spec.
     *  Structure is documented below.
     * @return builder
     */
    def expr(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomExprArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomExprArgs.builder
      builder.expr(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingState.Builder)
    /**
     * @param scopedAccessSettings Optional. A list of scoped access settings that set this binding&#39;s restrictions on a subset of applications.
     *  Structure is documented below.
     * @return builder
     */
    def scopedAccessSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingState.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.builder
      builder.scopedAccessSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param sessionSettings Optional. The Google Cloud session length (GCSL) policy for the group key.
     *  Structure is documented below.
     * @return builder
     */
    def sessionSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingSessionSettingsArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingSessionSettingsArgs.builder
      builder.sessionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.Builder)
    /**
     * @param activeSettings Optional. Access settings for this scoped access settings. This field may be empty if dryRunSettings is set.
     *  Structure is documented below.
     * @return builder
     */
    def activeSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingActiveSettingsArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingActiveSettingsArgs.builder
      builder.activeSettings(args(argsBuilder).build)

    /**
     * @param dryRunSettings Optional. Dry-run access settings for this scoped access settings. This field may be empty if activeSettings is set. Cannot contain session settings.
     *  Structure is documented below.
     * @return builder
     */
    def dryRunSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs.builder
      builder.dryRunSettings(args(argsBuilder).build)

    /**
     * @param scope Optional. Application, etc. to which the access settings will be applied to. Implicitly, this is the scoped access settings key; as such, it must be unique and non-empty.
     *  Structure is documented below.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` that this egress rule applies to. A request matches
     *  if it contains an operation/service in this list.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromArgs.Builder)
    /**
     * @param sources Sources that this `IngressPolicy` authorizes access from.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyArgs.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     *  to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     *  this `IngressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyState.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     *  cause this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.Builder)
    /**
     * @param spec Proposed (or dry run) ServicePerimeter configuration.
     *  This configuration allows to specify and test ServicePerimeter configuration
     *  without enforcing actual access restrictions. Only allowed to be set when
     *  the `useExplicitDryRunSpec` flag is set.
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecArgs.builder
      builder.spec(args(argsBuilder).build)

    /**
     * @param status ServicePerimeter configuration. Specifies sets of resources,
     *  restricted services and access levels that determine
     *  perimeter content and boundaries.
     *  Structure is documented below.
     * @return builder
     */
    def status(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusArgs.builder
      builder.status(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs.Builder)
    /**
     * @param sources Sources that this `IngressPolicy` authorizes access from.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyArgs.Builder)
    /**
     * @param osConstraints A list of allowed OS versions.
     *  An empty list allows all types and all versions.
     *  Structure is documented below.
     * @return builder
     */
    def osConstraints(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyOsConstraintArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionDevicePolicyOsConstraintArgs.builder
      builder.osConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingActiveSettingsArgs.Builder)
    /**
     * @param sessionSettings Optional. Session settings applied to user access on a given AccessScope.
     *  Structure is documented below.
     * @return builder
     */
    def sessionSettings(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingActiveSettingsSessionSettingsArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingActiveSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.GcpUserAccessBindingScopedAccessSettingActiveSettingsSessionSettingsArgs.builder
      builder.sessionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.Builder)
    /**
     * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may
     *  have multiple EgressPolicies, each of which is evaluated separately.
     *  Access is granted if any EgressPolicy grants it. Must be empty for
     *  a perimeter bridge.
     *  Structure is documented below.
     * @return builder
     */
    def egressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyArgs.builder
      builder.egressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param ingressPolicies List of `IngressPolicies` to apply to the perimeter. A perimeter may
     *  have multiple `IngressPolicies`, each of which is evaluated
     *  separately. Access is granted if any `Ingress Policy` grants it.
     *  Must be empty for a perimeter bridge.
     *  Structure is documented below.
     * @return builder
     */
    def ingressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyArgs.builder
      builder.ingressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcAccessibleServices Specifies how APIs are allowed to communicate within the Service
     *  Perimeter.
     *  Structure is documented below.
     * @return builder
     */
    def vpcAccessibleServices(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusVpcAccessibleServicesArgs.builder
      builder.vpcAccessibleServices(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsState.Builder)
    /**
     * @param accessLevels The desired Access Levels that should replace all existing Access Levels in the Access Policy.
     *  Structure is documented below.
     * @return builder
     */
    def accessLevels(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsState.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs.builder
      builder.accessLevels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyArgs.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     *  to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     *  this `IngressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     *  to the service specified by `serviceName` field. A single MethodSelector
     *  entry with `*` specified for the `method` field will allow all methods
     *  AND permissions for the service specified in `serviceName`.
     *  Structure is documented below.
     * @return builder
     */
    def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyArgs.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     *  to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     *  this `IngressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyArgs.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     *  to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     *  this `IngressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecArgs.Builder)
    /**
     * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may
     *  have multiple EgressPolicies, each of which is evaluated separately.
     *  Access is granted if any EgressPolicy grants it. Must be empty for
     *  a perimeter bridge.
     *  Structure is documented below.
     * @return builder
     */
    def egressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyArgs.builder
      builder.egressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param ingressPolicies List of `IngressPolicies` to apply to the perimeter. A perimeter may
     *  have multiple `IngressPolicies`, each of which is evaluated
     *  separately. Access is granted if any `Ingress Policy` grants it.
     *  Must be empty for a perimeter bridge.
     *  Structure is documented below.
     * @return builder
     */
    def ingressPolicies(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyArgs.builder
      builder.ingressPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcAccessibleServices Specifies how APIs are allowed to communicate within the Service
     *  Perimeter.
     *  Structure is documented below.
     * @return builder
     */
    def vpcAccessibleServices(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs.builder
      builder.vpcAccessibleServices(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSourceArgs.Builder)
    /**
     * @param vpcSubnetwork Sub networks within a VPC network.
     *  Structure is documented below.
     * @return builder
     */
    def vpcSubnetwork(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSourceVpcSubnetworkArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSourceVpcSubnetworkArgs.builder
      builder.vpcSubnetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromArgs.Builder)
    /**
     * @param sources Sources that this `IngressPolicy` authorizes access from.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` that this egress rule applies to. A request matches
     *  if it contains an operation/service in this list.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromArgs.Builder)
    /**
     * @param sources Sources that this `IngressPolicy` authorizes access from.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` that this egress rule applies to. A request matches
     *  if it contains an operation/service in this list.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyState.Builder)
    /**
     * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
     *  to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressFromArgs.builder
      builder.ingressFrom(args(argsBuilder).build)

    /**
     * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
     *  this `IngressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def ingressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToArgs.builder
      builder.ingressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersState.Builder)
    /**
     * @param servicePerimeters The desired Service Perimeters that should replace all existing Service Perimeters in the Access Policy.
     *  Structure is documented below.
     * @return builder
     */
    def servicePerimeters(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersState.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterArgs.builder
      builder.servicePerimeters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromArgs.Builder)
    /**
     * @param sources Sources that this `IngressPolicy` authorizes access from.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterState.Builder)
    /**
     * @param spec Proposed (or dry run) ServicePerimeter configuration.
     *  This configuration allows to specify and test ServicePerimeter configuration
     *  without enforcing actual access restrictions. Only allowed to be set when
     *  the `useExplicitDryRunSpec` flag is set.
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs.builder
      builder.spec(args(argsBuilder).build)

    /**
     * @param status ServicePerimeter configuration. Specifies sets of resources,
     *  restricted services and access levels that determine
     *  perimeter content and boundaries.
     *  Structure is documented below.
     * @return builder
     */
    def status(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs.builder
      builder.status(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyArgs.Builder)
    /**
     * @param osConstraints A list of allowed OS versions.
     *  An empty list allows all types and all versions.
     *  Structure is documented below.
     * @return builder
     */
    def osConstraints(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyOsConstraintArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyOsConstraintArgs.builder
      builder.osConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicArgs.Builder)
    /**
     * @param conditions A set of requirements for the AccessLevel to be granted.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` that this egress rule applies to. A request matches
     *  if it contains an operation/service in this list.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionArgs.Builder)
    /**
     * @param devicePolicy Device specific restrictions, all restrictions must hold for
     *  the Condition to be true. If not specified, all devices are
     *  allowed.
     *  Structure is documented below.
     * @return builder
     */
    def devicePolicy(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionDevicePolicyArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionDevicePolicyArgs.builder
      builder.devicePolicy(args(argsBuilder).build)

    /**
     * @param vpcNetworkSources The request must originate from one of the provided VPC networks in Google Cloud. Cannot specify this field together with `ipSubnetworks`.
     *  Structure is documented below.
     * @return builder
     */
    def vpcNetworkSources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSourceArgs.builder
      builder.vpcNetworkSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromArgs.Builder)
    /**
     * @param sources Sources that this `IngressPolicy` authorizes access from.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     *  to the service specified by `serviceName` field. A single MethodSelector
     *  entry with `*` specified for the `method` field will allow all methods
     *  AND permissions for the service specified in `serviceName`.
     *  Structure is documented below.
     * @return builder
     */
    def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     *  to the service specified by `serviceName` field. A single MethodSelector
     *  entry with `*` specified for the `method` field will allow all methods
     *  AND permissions for the service specified in `serviceName`.
     *  Structure is documented below.
     * @return builder
     */
    def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     *  to the service specified by `serviceName` field. A single MethodSelector
     *  entry with `*` specified for the `method` field will allow all methods
     *  AND permissions for the service specified in `serviceName`.
     *  Structure is documented below.
     * @return builder
     */
    def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     *  are allowed to perform in this `ServicePerimeter`.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunIngressPolicyIngressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromArgs.Builder)
    /**
     * @param sources Sources that this EgressPolicy authorizes access from.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong to
     *  the service specified by serviceName field. A single `MethodSelector` entry
     *  with `*` specified for the method field will allow all methods AND
     *  permissions for the service specified in `serviceName`.
     *  Structure is documented below.
     * @return builder
     */
    def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyIngressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelState.Builder)
    /**
     * @param basic A set of predefined conditions for the access level and a combining function.
     *  Structure is documented below.
     * @return builder
     */
    def basic(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicArgs.builder
      builder.basic(args(argsBuilder).build)

    /**
     * @param custom Custom access level conditions are set using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request.
     *  See CEL spec at: https://github.com/google/cel-spec.
     *  Structure is documented below.
     * @return builder
     */
    def custom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomArgs.builder
      builder.custom(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyArgs.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     *  cause this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromArgs.Builder)
    /**
     * @param sources Sources that this EgressPolicy authorizes access from.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     *  are allowed to perform in this `ServicePerimeter`.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     *  to the service specified by `serviceName` field. A single MethodSelector
     *  entry with `*` specified for the `method` field will allow all methods
     *  AND permissions for the service specified in `serviceName`.
     *  Structure is documented below.
     * @return builder
     */
    def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionDevicePolicyArgs.Builder)
    /**
     * @param osConstraints A list of allowed OS versions.
     *  An empty list allows all types and all versions.
     *  Structure is documented below.
     * @return builder
     */
    def osConstraints(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionDevicePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs.builder
      builder.osConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     *  to the service specified by `serviceName` field. A single MethodSelector
     *  entry with `*` specified for the `method` field will allow all methods
     *  AND permissions for the service specified in `serviceName`.
     *  Structure is documented below.
     * @return builder
     */
    def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     *  are allowed to perform in this `ServicePerimeter`.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromArgs.Builder)
    /**
     * @param sources Sources that this EgressPolicy authorizes access from.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     *  are allowed to perform in this `ServicePerimeter`.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs.Builder)
    /**
     * @param sources Sources that this EgressPolicy authorizes access from.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     *  to the service specified by `serviceName` field. A single MethodSelector
     *  entry with `*` specified for the `method` field will allow all methods
     *  AND permissions for the service specified in `serviceName`.
     *  Structure is documented below.
     * @return builder
     */
    def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` the sources specified in corresponding `IngressFrom`
     *  are allowed to perform in this `ServicePerimeter`.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs.Builder)
    /**
     * @param sources Sources that this EgressPolicy authorizes access from.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromSourceArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyState.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     *  cause this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToArgs.Builder)
    /**
     * @param operations A list of `ApiOperations` that this egress rule applies to. A request matches
     *  if it contains an operation/service in this list.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToOperationArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterDryRunEgressPolicyEgressToOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyArgs.Builder)
    /**
     * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressFrom(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromArgs.builder
      builder.egressFrom(args(argsBuilder).build)

    /**
     * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
     *  cause this `EgressPolicy` to apply.
     *  Structure is documented below.
     * @return builder
     */
    def egressTo(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToArgs.Builder]):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToArgs.builder
      builder.egressTo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs.Builder)
    /**
     * @param methodSelectors API methods or permissions to allow. Method or permission must belong
     *  to the service specified by `serviceName` field. A single MethodSelector
     *  entry with `*` specified for the `method` field will allow all methods
     *  AND permissions for the service specified in `serviceName`.
     *  Structure is documented below.
     * @return builder
     */
    def methodSelectors(args: Endofunction[com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs.Builder]*):
        com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs.builder
      builder.methodSelectors(args.map(_(argsBuilder).build)*)

  /**
   * Manage a single EgressPolicy in the status (enforced) configuration for a service perimeter.
   *  EgressPolicies match requests based on egressFrom and egressTo stanzas.
   *  For an EgressPolicy to match, both egressFrom and egressTo stanzas must be matched.
   *  If an EgressPolicy matches a request, the request is allowed to span the ServicePerimeter
   *  boundary. For example, an EgressPolicy can be used to allow VMs on networks
   *  within the ServicePerimeter to access a defined set of projects outside the
   *  perimeter in certain contexts (e.g. to read data from a Cloud Storage bucket
   *  or query against a BigQuery dataset).
   * 
   *  &gt; **Note:** By default, updates to this resource will remove the EgressPolicy from the
   *  from the perimeter and add it back in a non-atomic manner. To ensure that the new EgressPolicy
   *  is added before the old one is removed, add a `lifecycle` block with `createBeforeDestroy = true` to this resource.
   *  **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
   *  the service perimeter resource must have a `lifecycle` block with `ignoreChanges = [status[0].egress_policies]` so
   *  they don&#39;t fight over which egress rules should be in the policy.
   * 
   *  To get more information about ServicePerimeterEgressPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#egresspolicy)
   *  * How-to Guides
   *      * [Guide to Ingress and Egress Rules](https://cloud.google.com/vpc-service-controls/docs/ingress-egress-rules)
   */
  def ServicePerimeterEgressPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.accesscontextmanager.ServicePerimeterEgressPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.accesscontextmanager.ServicePerimeterEgressPolicyArgs.builder
    com.pulumi.gcp.accesscontextmanager.ServicePerimeterEgressPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
