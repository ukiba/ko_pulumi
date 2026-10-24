package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object dataplex:
  /** An Aspect Type is a template for creating Aspects. */
  def AspectType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AspectTypeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.AspectTypeArgs.builder
    com.pulumi.gcp.dataplex.AspectType(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
   * * `gcp.dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
   * 
   * &gt; **Note:** `gcp.dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AspectTypeIamBinding` and `gcp.dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.AspectTypeIamPolicy
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
   * import com.pulumi.gcp.dataplex.AspectTypeIamPolicy;
   * import com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AspectTypeIamPolicy("policy", AspectTypeIamPolicyArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AspectTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AspectTypeIamBinding;
   * import com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs;
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
   *         var binding = new AspectTypeIamBinding("binding", AspectTypeIamBindingArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AspectTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AspectTypeIamMember;
   * import com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs;
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
   *         var member = new AspectTypeIamMember("member", AspectTypeIamMemberArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex AspectType
   * 
   * Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
   * * `gcp.dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
   * 
   * &gt; **Note:** `gcp.dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AspectTypeIamBinding` and `gcp.dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.AspectTypeIamPolicy
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
   * import com.pulumi.gcp.dataplex.AspectTypeIamPolicy;
   * import com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AspectTypeIamPolicy("policy", AspectTypeIamPolicyArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AspectTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AspectTypeIamBinding;
   * import com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs;
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
   *         var binding = new AspectTypeIamBinding("binding", AspectTypeIamBindingArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AspectTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AspectTypeIamMember;
   * import com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs;
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
   *         var member = new AspectTypeIamMember("member", AspectTypeIamMemberArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
   * * {{project}}/{{location}}/{{aspect_type_id}}
   * * {{location}}/{{aspect_type_id}}
   * * {{aspect_type_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex aspecttype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_aspect_type_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_aspect_type_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/aspectTypeIamBinding:AspectTypeIamBinding editor projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AspectTypeIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs.builder
    com.pulumi.gcp.dataplex.AspectTypeIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
   * * `gcp.dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
   * 
   * &gt; **Note:** `gcp.dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AspectTypeIamBinding` and `gcp.dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.AspectTypeIamPolicy
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
   * import com.pulumi.gcp.dataplex.AspectTypeIamPolicy;
   * import com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AspectTypeIamPolicy("policy", AspectTypeIamPolicyArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AspectTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AspectTypeIamBinding;
   * import com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs;
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
   *         var binding = new AspectTypeIamBinding("binding", AspectTypeIamBindingArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AspectTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AspectTypeIamMember;
   * import com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs;
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
   *         var member = new AspectTypeIamMember("member", AspectTypeIamMemberArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex AspectType
   * 
   * Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
   * * `gcp.dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
   * 
   * &gt; **Note:** `gcp.dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AspectTypeIamBinding` and `gcp.dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.AspectTypeIamPolicy
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
   * import com.pulumi.gcp.dataplex.AspectTypeIamPolicy;
   * import com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AspectTypeIamPolicy("policy", AspectTypeIamPolicyArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AspectTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AspectTypeIamBinding;
   * import com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs;
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
   *         var binding = new AspectTypeIamBinding("binding", AspectTypeIamBindingArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AspectTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AspectTypeIamMember;
   * import com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs;
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
   *         var member = new AspectTypeIamMember("member", AspectTypeIamMemberArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
   * * {{project}}/{{location}}/{{aspect_type_id}}
   * * {{location}}/{{aspect_type_id}}
   * * {{aspect_type_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex aspecttype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_aspect_type_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_aspect_type_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/aspectTypeIamMember:AspectTypeIamMember editor projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AspectTypeIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs.builder
    com.pulumi.gcp.dataplex.AspectTypeIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
   * * `gcp.dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
   * 
   * &gt; **Note:** `gcp.dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AspectTypeIamBinding` and `gcp.dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.AspectTypeIamPolicy
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
   * import com.pulumi.gcp.dataplex.AspectTypeIamPolicy;
   * import com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AspectTypeIamPolicy("policy", AspectTypeIamPolicyArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AspectTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AspectTypeIamBinding;
   * import com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs;
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
   *         var binding = new AspectTypeIamBinding("binding", AspectTypeIamBindingArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AspectTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AspectTypeIamMember;
   * import com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs;
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
   *         var member = new AspectTypeIamMember("member", AspectTypeIamMemberArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex AspectType
   * 
   * Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
   * * `gcp.dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
   * 
   * &gt; **Note:** `gcp.dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AspectTypeIamBinding` and `gcp.dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.AspectTypeIamPolicy
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
   * import com.pulumi.gcp.dataplex.AspectTypeIamPolicy;
   * import com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AspectTypeIamPolicy("policy", AspectTypeIamPolicyArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AspectTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AspectTypeIamBinding;
   * import com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs;
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
   *         var binding = new AspectTypeIamBinding("binding", AspectTypeIamBindingArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AspectTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AspectTypeIamMember;
   * import com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs;
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
   *         var member = new AspectTypeIamMember("member", AspectTypeIamMemberArgs.builder()
   *             .project(testAspectTypeBasic.get("project"))
   *             .location(testAspectTypeBasic.get("location"))
   *             .aspectTypeId(testAspectTypeBasic.get("aspectTypeId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
   * * {{project}}/{{location}}/{{aspect_type_id}}
   * * {{location}}/{{aspect_type_id}}
   * * {{aspect_type_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex aspecttype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_aspect_type_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_aspect_type_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/aspectTypeIamPolicy:AspectTypeIamPolicy editor projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AspectTypeIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.AspectTypeIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** The Dataplex Asset resource */
  def Asset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AssetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataplex.AssetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataplex.Asset(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Asset. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.AssetIamPolicy`: Authoritative. Sets the IAM policy for the asset and replaces any existing policy already attached.
   * * `gcp.dataplex.AssetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the asset are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.AssetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the asset are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.AssetIamPolicy`: Retrieves the IAM policy for the asset
   * 
   * &gt; **Note:** `gcp.dataplex.AssetIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AssetIamBinding` and `gcp.dataplex.AssetIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.AssetIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AssetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.AssetIamPolicy
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
   * import com.pulumi.gcp.dataplex.AssetIamPolicy;
   * import com.pulumi.gcp.dataplex.AssetIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AssetIamPolicy("policy", AssetIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AssetIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AssetIamBinding;
   * import com.pulumi.gcp.dataplex.AssetIamBindingArgs;
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
   *         var binding = new AssetIamBinding("binding", AssetIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AssetIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AssetIamMember;
   * import com.pulumi.gcp.dataplex.AssetIamMemberArgs;
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
   *         var member = new AssetIamMember("member", AssetIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Asset
   * 
   * Three different resources help you manage your IAM policy for Dataplex Asset. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.AssetIamPolicy`: Authoritative. Sets the IAM policy for the asset and replaces any existing policy already attached.
   * * `gcp.dataplex.AssetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the asset are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.AssetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the asset are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.AssetIamPolicy`: Retrieves the IAM policy for the asset
   * 
   * &gt; **Note:** `gcp.dataplex.AssetIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AssetIamBinding` and `gcp.dataplex.AssetIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.AssetIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AssetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.AssetIamPolicy
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
   * import com.pulumi.gcp.dataplex.AssetIamPolicy;
   * import com.pulumi.gcp.dataplex.AssetIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AssetIamPolicy("policy", AssetIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AssetIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AssetIamBinding;
   * import com.pulumi.gcp.dataplex.AssetIamBindingArgs;
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
   *         var binding = new AssetIamBinding("binding", AssetIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AssetIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AssetIamMember;
   * import com.pulumi.gcp.dataplex.AssetIamMemberArgs;
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
   *         var member = new AssetIamMember("member", AssetIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{name}}
   * * {{project}}/{{location}}/{{lake}}/{{dataplex_zone}}/{{name}}
   * * {{location}}/{{lake}}/{{dataplex_zone}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex asset IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_asset_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_asset_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/assetIamBinding:AssetIamBinding editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AssetIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AssetIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.AssetIamBindingArgs.builder
    com.pulumi.gcp.dataplex.AssetIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Asset. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.AssetIamPolicy`: Authoritative. Sets the IAM policy for the asset and replaces any existing policy already attached.
   * * `gcp.dataplex.AssetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the asset are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.AssetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the asset are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.AssetIamPolicy`: Retrieves the IAM policy for the asset
   * 
   * &gt; **Note:** `gcp.dataplex.AssetIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AssetIamBinding` and `gcp.dataplex.AssetIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.AssetIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AssetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.AssetIamPolicy
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
   * import com.pulumi.gcp.dataplex.AssetIamPolicy;
   * import com.pulumi.gcp.dataplex.AssetIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AssetIamPolicy("policy", AssetIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AssetIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AssetIamBinding;
   * import com.pulumi.gcp.dataplex.AssetIamBindingArgs;
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
   *         var binding = new AssetIamBinding("binding", AssetIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AssetIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AssetIamMember;
   * import com.pulumi.gcp.dataplex.AssetIamMemberArgs;
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
   *         var member = new AssetIamMember("member", AssetIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Asset
   * 
   * Three different resources help you manage your IAM policy for Dataplex Asset. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.AssetIamPolicy`: Authoritative. Sets the IAM policy for the asset and replaces any existing policy already attached.
   * * `gcp.dataplex.AssetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the asset are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.AssetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the asset are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.AssetIamPolicy`: Retrieves the IAM policy for the asset
   * 
   * &gt; **Note:** `gcp.dataplex.AssetIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AssetIamBinding` and `gcp.dataplex.AssetIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.AssetIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AssetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.AssetIamPolicy
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
   * import com.pulumi.gcp.dataplex.AssetIamPolicy;
   * import com.pulumi.gcp.dataplex.AssetIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AssetIamPolicy("policy", AssetIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AssetIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AssetIamBinding;
   * import com.pulumi.gcp.dataplex.AssetIamBindingArgs;
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
   *         var binding = new AssetIamBinding("binding", AssetIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AssetIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AssetIamMember;
   * import com.pulumi.gcp.dataplex.AssetIamMemberArgs;
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
   *         var member = new AssetIamMember("member", AssetIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{name}}
   * * {{project}}/{{location}}/{{lake}}/{{dataplex_zone}}/{{name}}
   * * {{location}}/{{lake}}/{{dataplex_zone}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex asset IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_asset_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_asset_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/assetIamMember:AssetIamMember editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AssetIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AssetIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.AssetIamMemberArgs.builder
    com.pulumi.gcp.dataplex.AssetIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Asset. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.AssetIamPolicy`: Authoritative. Sets the IAM policy for the asset and replaces any existing policy already attached.
   * * `gcp.dataplex.AssetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the asset are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.AssetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the asset are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.AssetIamPolicy`: Retrieves the IAM policy for the asset
   * 
   * &gt; **Note:** `gcp.dataplex.AssetIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AssetIamBinding` and `gcp.dataplex.AssetIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.AssetIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AssetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.AssetIamPolicy
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
   * import com.pulumi.gcp.dataplex.AssetIamPolicy;
   * import com.pulumi.gcp.dataplex.AssetIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AssetIamPolicy("policy", AssetIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AssetIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AssetIamBinding;
   * import com.pulumi.gcp.dataplex.AssetIamBindingArgs;
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
   *         var binding = new AssetIamBinding("binding", AssetIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AssetIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AssetIamMember;
   * import com.pulumi.gcp.dataplex.AssetIamMemberArgs;
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
   *         var member = new AssetIamMember("member", AssetIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Asset
   * 
   * Three different resources help you manage your IAM policy for Dataplex Asset. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.AssetIamPolicy`: Authoritative. Sets the IAM policy for the asset and replaces any existing policy already attached.
   * * `gcp.dataplex.AssetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the asset are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.AssetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the asset are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.AssetIamPolicy`: Retrieves the IAM policy for the asset
   * 
   * &gt; **Note:** `gcp.dataplex.AssetIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AssetIamBinding` and `gcp.dataplex.AssetIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.AssetIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AssetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.AssetIamPolicy
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
   * import com.pulumi.gcp.dataplex.AssetIamPolicy;
   * import com.pulumi.gcp.dataplex.AssetIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new AssetIamPolicy("policy", AssetIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AssetIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AssetIamBinding;
   * import com.pulumi.gcp.dataplex.AssetIamBindingArgs;
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
   *         var binding = new AssetIamBinding("binding", AssetIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.AssetIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.AssetIamMember;
   * import com.pulumi.gcp.dataplex.AssetIamMemberArgs;
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
   *         var member = new AssetIamMember("member", AssetIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("dataplexZone"))
   *             .asset(example.get("name"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{name}}
   * * {{project}}/{{location}}/{{lake}}/{{dataplex_zone}}/{{name}}
   * * {{location}}/{{lake}}/{{dataplex_zone}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex asset IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_asset_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_asset_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/assetIamPolicy:AssetIamPolicy editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AssetIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AssetIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.AssetIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.AssetIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &gt; **Warning:** `gcp.dataplex.DataAsset` is deprecated and will be removed in a future major release. Please use `gcp.dataplex.DataProductDataAsset` resource instead.
   * 
   * A data asset resource that can be packaged and shared via a data product.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about DataAsset, see:
   * 
   * * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.dataProducts.dataAssets)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dataplex/docs)
   */
  def DataAsset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DataAssetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.DataAssetArgs.builder
    com.pulumi.gcp.dataplex.DataAsset(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A data product is a curated collection of data assets, packaged to address
   * specific use cases.
   * 
   * To get more information about DataProduct, see:
   * 
   * * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.dataProducts)
   * * How-to Guides
   *     * [Introduction to Data Products](https://cloud.google.com/dataplex/docs/data-products-overview)
   */
  def DataProduct(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DataProductArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.DataProductArgs.builder
    com.pulumi.gcp.dataplex.DataProduct(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A data asset resource that can be packaged and shared via a data product.
   * 
   * To get more information about DataProductDataAsset, see:
   * 
   * * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.dataProducts.dataAssets)
   * * How-to Guides
   *     * [Official Documentation](https://docs.cloud.google.com/dataplex/docs/manage-data-products)
   */
  def DataProductDataAsset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DataProductDataAssetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.DataProductDataAssetArgs.builder
    com.pulumi.gcp.dataplex.DataProductDataAsset(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex DataProduct. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.DataProductIamPolicy`: Authoritative. Sets the IAM policy for the dataproduct and replaces any existing policy already attached.
   * * `gcp.dataplex.DataProductIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataproduct are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.DataProductIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataproduct are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.DataProductIamPolicy`: Retrieves the IAM policy for the dataproduct
   * 
   * &gt; **Note:** `gcp.dataplex.DataProductIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DataProductIamBinding` and `gcp.dataplex.DataProductIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.DataProductIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DataProductIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.DataProductIamPolicy
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
   * import com.pulumi.gcp.dataplex.DataProductIamPolicy;
   * import com.pulumi.gcp.dataplex.DataProductIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DataProductIamPolicy("policy", DataProductIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DataProductIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DataProductIamBinding;
   * import com.pulumi.gcp.dataplex.DataProductIamBindingArgs;
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
   *         var binding = new DataProductIamBinding("binding", DataProductIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DataProductIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DataProductIamMember;
   * import com.pulumi.gcp.dataplex.DataProductIamMemberArgs;
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
   *         var member = new DataProductIamMember("member", DataProductIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex DataProduct
   * 
   * Three different resources help you manage your IAM policy for Dataplex DataProduct. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.DataProductIamPolicy`: Authoritative. Sets the IAM policy for the dataproduct and replaces any existing policy already attached.
   * * `gcp.dataplex.DataProductIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataproduct are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.DataProductIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataproduct are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.DataProductIamPolicy`: Retrieves the IAM policy for the dataproduct
   * 
   * &gt; **Note:** `gcp.dataplex.DataProductIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DataProductIamBinding` and `gcp.dataplex.DataProductIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.DataProductIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DataProductIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.DataProductIamPolicy
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
   * import com.pulumi.gcp.dataplex.DataProductIamPolicy;
   * import com.pulumi.gcp.dataplex.DataProductIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DataProductIamPolicy("policy", DataProductIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DataProductIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DataProductIamBinding;
   * import com.pulumi.gcp.dataplex.DataProductIamBindingArgs;
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
   *         var binding = new DataProductIamBinding("binding", DataProductIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DataProductIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DataProductIamMember;
   * import com.pulumi.gcp.dataplex.DataProductIamMemberArgs;
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
   *         var member = new DataProductIamMember("member", DataProductIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/dataProducts/{{data_product_id}}
   * * {{project}}/{{location}}/{{data_product_id}}
   * * {{location}}/{{data_product_id}}
   * * {{data_product_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex dataproduct IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_data_product_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataProducts/{{data_product_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_data_product_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataProducts/{{data_product_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/dataProductIamBinding:DataProductIamBinding editor projects/{{project}}/locations/{{location}}/dataProducts/{{data_product_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DataProductIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DataProductIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.DataProductIamBindingArgs.builder
    com.pulumi.gcp.dataplex.DataProductIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex DataProduct. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.DataProductIamPolicy`: Authoritative. Sets the IAM policy for the dataproduct and replaces any existing policy already attached.
   * * `gcp.dataplex.DataProductIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataproduct are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.DataProductIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataproduct are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.DataProductIamPolicy`: Retrieves the IAM policy for the dataproduct
   * 
   * &gt; **Note:** `gcp.dataplex.DataProductIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DataProductIamBinding` and `gcp.dataplex.DataProductIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.DataProductIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DataProductIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.DataProductIamPolicy
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
   * import com.pulumi.gcp.dataplex.DataProductIamPolicy;
   * import com.pulumi.gcp.dataplex.DataProductIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DataProductIamPolicy("policy", DataProductIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DataProductIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DataProductIamBinding;
   * import com.pulumi.gcp.dataplex.DataProductIamBindingArgs;
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
   *         var binding = new DataProductIamBinding("binding", DataProductIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DataProductIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DataProductIamMember;
   * import com.pulumi.gcp.dataplex.DataProductIamMemberArgs;
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
   *         var member = new DataProductIamMember("member", DataProductIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex DataProduct
   * 
   * Three different resources help you manage your IAM policy for Dataplex DataProduct. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.DataProductIamPolicy`: Authoritative. Sets the IAM policy for the dataproduct and replaces any existing policy already attached.
   * * `gcp.dataplex.DataProductIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataproduct are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.DataProductIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataproduct are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.DataProductIamPolicy`: Retrieves the IAM policy for the dataproduct
   * 
   * &gt; **Note:** `gcp.dataplex.DataProductIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DataProductIamBinding` and `gcp.dataplex.DataProductIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.DataProductIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DataProductIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.DataProductIamPolicy
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
   * import com.pulumi.gcp.dataplex.DataProductIamPolicy;
   * import com.pulumi.gcp.dataplex.DataProductIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DataProductIamPolicy("policy", DataProductIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DataProductIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DataProductIamBinding;
   * import com.pulumi.gcp.dataplex.DataProductIamBindingArgs;
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
   *         var binding = new DataProductIamBinding("binding", DataProductIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DataProductIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DataProductIamMember;
   * import com.pulumi.gcp.dataplex.DataProductIamMemberArgs;
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
   *         var member = new DataProductIamMember("member", DataProductIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/dataProducts/{{data_product_id}}
   * * {{project}}/{{location}}/{{data_product_id}}
   * * {{location}}/{{data_product_id}}
   * * {{data_product_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex dataproduct IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_data_product_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataProducts/{{data_product_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_data_product_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataProducts/{{data_product_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/dataProductIamMember:DataProductIamMember editor projects/{{project}}/locations/{{location}}/dataProducts/{{data_product_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DataProductIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DataProductIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.DataProductIamMemberArgs.builder
    com.pulumi.gcp.dataplex.DataProductIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex DataProduct. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.DataProductIamPolicy`: Authoritative. Sets the IAM policy for the dataproduct and replaces any existing policy already attached.
   * * `gcp.dataplex.DataProductIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataproduct are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.DataProductIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataproduct are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.DataProductIamPolicy`: Retrieves the IAM policy for the dataproduct
   * 
   * &gt; **Note:** `gcp.dataplex.DataProductIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DataProductIamBinding` and `gcp.dataplex.DataProductIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.DataProductIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DataProductIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.DataProductIamPolicy
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
   * import com.pulumi.gcp.dataplex.DataProductIamPolicy;
   * import com.pulumi.gcp.dataplex.DataProductIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DataProductIamPolicy("policy", DataProductIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DataProductIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DataProductIamBinding;
   * import com.pulumi.gcp.dataplex.DataProductIamBindingArgs;
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
   *         var binding = new DataProductIamBinding("binding", DataProductIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DataProductIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DataProductIamMember;
   * import com.pulumi.gcp.dataplex.DataProductIamMemberArgs;
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
   *         var member = new DataProductIamMember("member", DataProductIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex DataProduct
   * 
   * Three different resources help you manage your IAM policy for Dataplex DataProduct. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.DataProductIamPolicy`: Authoritative. Sets the IAM policy for the dataproduct and replaces any existing policy already attached.
   * * `gcp.dataplex.DataProductIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataproduct are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.DataProductIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataproduct are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.DataProductIamPolicy`: Retrieves the IAM policy for the dataproduct
   * 
   * &gt; **Note:** `gcp.dataplex.DataProductIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DataProductIamBinding` and `gcp.dataplex.DataProductIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.DataProductIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DataProductIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.DataProductIamPolicy
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
   * import com.pulumi.gcp.dataplex.DataProductIamPolicy;
   * import com.pulumi.gcp.dataplex.DataProductIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DataProductIamPolicy("policy", DataProductIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DataProductIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DataProductIamBinding;
   * import com.pulumi.gcp.dataplex.DataProductIamBindingArgs;
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
   *         var binding = new DataProductIamBinding("binding", DataProductIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DataProductIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DataProductIamMember;
   * import com.pulumi.gcp.dataplex.DataProductIamMemberArgs;
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
   *         var member = new DataProductIamMember("member", DataProductIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataProductId(example.get("dataProductId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/dataProducts/{{data_product_id}}
   * * {{project}}/{{location}}/{{data_product_id}}
   * * {{location}}/{{data_product_id}}
   * * {{data_product_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex dataproduct IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_data_product_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataProducts/{{data_product_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_data_product_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataProducts/{{data_product_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/dataProductIamPolicy:DataProductIamPolicy editor projects/{{project}}/locations/{{location}}/dataProducts/{{data_product_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DataProductIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DataProductIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.DataProductIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.DataProductIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object DataplexFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for aspecttype */
    inline def getAspectTypeIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetAspectTypeIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetAspectTypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetAspectTypeIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getAspectTypeIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for aspecttype */
    inline def getAspectTypeIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetAspectTypeIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetAspectTypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetAspectTypeIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getAspectTypeIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for asset */
    inline def getAssetIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetAssetIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetAssetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetAssetIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getAssetIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for asset */
    inline def getAssetIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetAssetIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetAssetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetAssetIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getAssetIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for dataproduct */
    inline def getDataProductIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetDataProductIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetDataProductIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetDataProductIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getDataProductIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for dataproduct */
    inline def getDataProductIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetDataProductIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetDataProductIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetDataProductIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getDataProductIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the generated data quality rules for the creating a new data quality scan.
     * For more information see
     * the [official documentation](https://cloud.google.com/dataplex/docs)
     * and [API](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.dataScans/generateDataQualityRules).
     * 
     * ## example
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.dataplex.DataplexFunctions;
     * import com.pulumi.gcp.dataplex.inputs.GetDataQualityRulesArgs;
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
     *         final var dqrs = DataplexFunctions.getDataQualityRules(GetDataQualityRulesArgs.builder()
     *             .project("my-project")
     *             .location("use-central1")
     *             .dataScanId("my-datascan-profile")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     */
    inline def getDataQualityRules(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetDataQualityRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetDataQualityRulesResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetDataQualityRulesArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getDataQualityRules(args(argsBuilder).build)

    /**
     * Retrieves the generated data quality rules for the creating a new data quality scan.
     * For more information see
     * the [official documentation](https://cloud.google.com/dataplex/docs)
     * and [API](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.dataScans/generateDataQualityRules).
     * 
     * ## example
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.dataplex.DataplexFunctions;
     * import com.pulumi.gcp.dataplex.inputs.GetDataQualityRulesArgs;
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
     *         final var dqrs = DataplexFunctions.getDataQualityRules(GetDataQualityRulesArgs.builder()
     *             .project("my-project")
     *             .location("use-central1")
     *             .dataScanId("my-datascan-profile")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     */
    inline def getDataQualityRulesPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetDataQualityRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetDataQualityRulesResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetDataQualityRulesPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getDataQualityRulesPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for datascan */
    inline def getDatascanIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetDatascanIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetDatascanIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetDatascanIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getDatascanIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for datascan */
    inline def getDatascanIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetDatascanIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetDatascanIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetDatascanIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getDatascanIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for entrygroup */
    inline def getEntryGroupIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetEntryGroupIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetEntryGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetEntryGroupIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getEntryGroupIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for entrygroup */
    inline def getEntryGroupIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetEntryGroupIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetEntryGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetEntryGroupIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getEntryGroupIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for entrytype */
    inline def getEntryTypeIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetEntryTypeIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetEntryTypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetEntryTypeIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getEntryTypeIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for entrytype */
    inline def getEntryTypeIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetEntryTypeIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetEntryTypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetEntryTypeIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getEntryTypeIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for glossary */
    inline def getGlossaryIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetGlossaryIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetGlossaryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetGlossaryIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getGlossaryIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for glossary */
    inline def getGlossaryIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetGlossaryIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetGlossaryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetGlossaryIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getGlossaryIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for lake */
    inline def getLakeIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetLakeIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetLakeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetLakeIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getLakeIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for lake */
    inline def getLakeIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetLakeIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetLakeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetLakeIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getLakeIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for task */
    inline def getTaskIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetTaskIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetTaskIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetTaskIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getTaskIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for task */
    inline def getTaskIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetTaskIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetTaskIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetTaskIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getTaskIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for zone */
    inline def getZoneIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetZoneIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetZoneIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetZoneIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getZoneIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for zone */
    inline def getZoneIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetZoneIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetZoneIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetZoneIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getZoneIamPolicyPlain(args(argsBuilder).build)

  /**
   * Represents a user-visible job which provides the insights for the related data source.
   * 
   * To get more information about Datascan, see:
   * 
   * * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dataplex/docs)
   */
  def Datascan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DatascanArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.DatascanArgs.builder
    com.pulumi.gcp.dataplex.Datascan(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Datascan. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.DatascanIamPolicy`: Authoritative. Sets the IAM policy for the datascan and replaces any existing policy already attached.
   * * `gcp.dataplex.DatascanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datascan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.DatascanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datascan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.DatascanIamPolicy`: Retrieves the IAM policy for the datascan
   * 
   * &gt; **Note:** `gcp.dataplex.DatascanIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DatascanIamBinding` and `gcp.dataplex.DatascanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.DatascanIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DatascanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.DatascanIamPolicy
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
   * import com.pulumi.gcp.dataplex.DatascanIamPolicy;
   * import com.pulumi.gcp.dataplex.DatascanIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DatascanIamPolicy("policy", DatascanIamPolicyArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DatascanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DatascanIamBinding;
   * import com.pulumi.gcp.dataplex.DatascanIamBindingArgs;
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
   *         var binding = new DatascanIamBinding("binding", DatascanIamBindingArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DatascanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DatascanIamMember;
   * import com.pulumi.gcp.dataplex.DatascanIamMemberArgs;
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
   *         var member = new DatascanIamMember("member", DatascanIamMemberArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Datascan
   * 
   * Three different resources help you manage your IAM policy for Dataplex Datascan. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.DatascanIamPolicy`: Authoritative. Sets the IAM policy for the datascan and replaces any existing policy already attached.
   * * `gcp.dataplex.DatascanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datascan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.DatascanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datascan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.DatascanIamPolicy`: Retrieves the IAM policy for the datascan
   * 
   * &gt; **Note:** `gcp.dataplex.DatascanIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DatascanIamBinding` and `gcp.dataplex.DatascanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.DatascanIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DatascanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.DatascanIamPolicy
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
   * import com.pulumi.gcp.dataplex.DatascanIamPolicy;
   * import com.pulumi.gcp.dataplex.DatascanIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DatascanIamPolicy("policy", DatascanIamPolicyArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DatascanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DatascanIamBinding;
   * import com.pulumi.gcp.dataplex.DatascanIamBindingArgs;
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
   *         var binding = new DatascanIamBinding("binding", DatascanIamBindingArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DatascanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DatascanIamMember;
   * import com.pulumi.gcp.dataplex.DatascanIamMemberArgs;
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
   *         var member = new DatascanIamMember("member", DatascanIamMemberArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}}
   * * {{project}}/{{location}}/{{data_scan_id}}
   * * {{location}}/{{data_scan_id}}
   * * {{data_scan_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex datascan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_datascan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_datascan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/datascanIamBinding:DatascanIamBinding editor projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DatascanIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DatascanIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.DatascanIamBindingArgs.builder
    com.pulumi.gcp.dataplex.DatascanIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Datascan. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.DatascanIamPolicy`: Authoritative. Sets the IAM policy for the datascan and replaces any existing policy already attached.
   * * `gcp.dataplex.DatascanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datascan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.DatascanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datascan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.DatascanIamPolicy`: Retrieves the IAM policy for the datascan
   * 
   * &gt; **Note:** `gcp.dataplex.DatascanIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DatascanIamBinding` and `gcp.dataplex.DatascanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.DatascanIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DatascanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.DatascanIamPolicy
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
   * import com.pulumi.gcp.dataplex.DatascanIamPolicy;
   * import com.pulumi.gcp.dataplex.DatascanIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DatascanIamPolicy("policy", DatascanIamPolicyArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DatascanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DatascanIamBinding;
   * import com.pulumi.gcp.dataplex.DatascanIamBindingArgs;
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
   *         var binding = new DatascanIamBinding("binding", DatascanIamBindingArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DatascanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DatascanIamMember;
   * import com.pulumi.gcp.dataplex.DatascanIamMemberArgs;
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
   *         var member = new DatascanIamMember("member", DatascanIamMemberArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Datascan
   * 
   * Three different resources help you manage your IAM policy for Dataplex Datascan. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.DatascanIamPolicy`: Authoritative. Sets the IAM policy for the datascan and replaces any existing policy already attached.
   * * `gcp.dataplex.DatascanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datascan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.DatascanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datascan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.DatascanIamPolicy`: Retrieves the IAM policy for the datascan
   * 
   * &gt; **Note:** `gcp.dataplex.DatascanIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DatascanIamBinding` and `gcp.dataplex.DatascanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.DatascanIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DatascanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.DatascanIamPolicy
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
   * import com.pulumi.gcp.dataplex.DatascanIamPolicy;
   * import com.pulumi.gcp.dataplex.DatascanIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DatascanIamPolicy("policy", DatascanIamPolicyArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DatascanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DatascanIamBinding;
   * import com.pulumi.gcp.dataplex.DatascanIamBindingArgs;
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
   *         var binding = new DatascanIamBinding("binding", DatascanIamBindingArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DatascanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DatascanIamMember;
   * import com.pulumi.gcp.dataplex.DatascanIamMemberArgs;
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
   *         var member = new DatascanIamMember("member", DatascanIamMemberArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}}
   * * {{project}}/{{location}}/{{data_scan_id}}
   * * {{location}}/{{data_scan_id}}
   * * {{data_scan_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex datascan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_datascan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_datascan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/datascanIamMember:DatascanIamMember editor projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DatascanIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DatascanIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.DatascanIamMemberArgs.builder
    com.pulumi.gcp.dataplex.DatascanIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Datascan. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.DatascanIamPolicy`: Authoritative. Sets the IAM policy for the datascan and replaces any existing policy already attached.
   * * `gcp.dataplex.DatascanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datascan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.DatascanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datascan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.DatascanIamPolicy`: Retrieves the IAM policy for the datascan
   * 
   * &gt; **Note:** `gcp.dataplex.DatascanIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DatascanIamBinding` and `gcp.dataplex.DatascanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.DatascanIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DatascanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.DatascanIamPolicy
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
   * import com.pulumi.gcp.dataplex.DatascanIamPolicy;
   * import com.pulumi.gcp.dataplex.DatascanIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DatascanIamPolicy("policy", DatascanIamPolicyArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DatascanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DatascanIamBinding;
   * import com.pulumi.gcp.dataplex.DatascanIamBindingArgs;
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
   *         var binding = new DatascanIamBinding("binding", DatascanIamBindingArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DatascanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DatascanIamMember;
   * import com.pulumi.gcp.dataplex.DatascanIamMemberArgs;
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
   *         var member = new DatascanIamMember("member", DatascanIamMemberArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Datascan
   * 
   * Three different resources help you manage your IAM policy for Dataplex Datascan. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.DatascanIamPolicy`: Authoritative. Sets the IAM policy for the datascan and replaces any existing policy already attached.
   * * `gcp.dataplex.DatascanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datascan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.DatascanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datascan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.DatascanIamPolicy`: Retrieves the IAM policy for the datascan
   * 
   * &gt; **Note:** `gcp.dataplex.DatascanIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DatascanIamBinding` and `gcp.dataplex.DatascanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.DatascanIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DatascanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.DatascanIamPolicy
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
   * import com.pulumi.gcp.dataplex.DatascanIamPolicy;
   * import com.pulumi.gcp.dataplex.DatascanIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DatascanIamPolicy("policy", DatascanIamPolicyArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DatascanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DatascanIamBinding;
   * import com.pulumi.gcp.dataplex.DatascanIamBindingArgs;
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
   *         var binding = new DatascanIamBinding("binding", DatascanIamBindingArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.DatascanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.DatascanIamMember;
   * import com.pulumi.gcp.dataplex.DatascanIamMemberArgs;
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
   *         var member = new DatascanIamMember("member", DatascanIamMemberArgs.builder()
   *             .project(basicProfile.get("project"))
   *             .location(basicProfile.get("location"))
   *             .dataScanId(basicProfile.get("dataScanId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}}
   * * {{project}}/{{location}}/{{data_scan_id}}
   * * {{location}}/{{data_scan_id}}
   * * {{data_scan_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex datascan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_datascan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_datascan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/datascanIamPolicy:DatascanIamPolicy editor projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DatascanIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DatascanIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.DatascanIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.DatascanIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An entry represents a data asset for which you capture metadata, such as a BigQuery table.
   * The primary constituents of an entry are aspects, which provide thematically coherent information.
   * Examples include a table&#39;s schema, sensitive data protection profile, data quality information, or a simple tag.
   * 
   * **Important Considerations:**
   * 
   * * There is a limit of 99 aspects per entry.
   * * The entry resource has to use project numbers and not project IDs. Therefore, if
   *   a dependency was already provisioned using project ID, it needs to be referenced explicitly as a resource name
   *   containing the project number.
   * 
   * To get more information about Entry, see:
   * 
   * * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.entryGroups.entries)
   * * How-to Guides
   *     * [Manage entries and ingest custom sources](https://cloud.google.com/dataplex/docs/ingest-custom-sources)
   */
  def Entry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryArgs.builder
    com.pulumi.gcp.dataplex.Entry(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** An Entry Group represents a logical grouping of one or more Entries. */
  def EntryGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryGroupArgs.builder
    com.pulumi.gcp.dataplex.EntryGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex EntryGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   * * `gcp.dataplex.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   * &gt; **Note:** `gcp.dataplex.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryGroupIamBinding` and `gcp.dataplex.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.EntryGroupIamPolicy
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
   * import com.pulumi.gcp.dataplex.EntryGroupIamPolicy;
   * import com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryGroupIamBinding;
   * import com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs;
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
   *         var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryGroupIamMember;
   * import com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs;
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
   *         var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex EntryGroup
   * 
   * Three different resources help you manage your IAM policy for Dataplex EntryGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   * * `gcp.dataplex.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   * &gt; **Note:** `gcp.dataplex.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryGroupIamBinding` and `gcp.dataplex.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.EntryGroupIamPolicy
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
   * import com.pulumi.gcp.dataplex.EntryGroupIamPolicy;
   * import com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryGroupIamBinding;
   * import com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs;
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
   *         var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryGroupIamMember;
   * import com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs;
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
   *         var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}}
   * * {{project}}/{{location}}/{{entry_group_id}}
   * * {{location}}/{{entry_group_id}}
   * * {{entry_group_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex entrygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_entry_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_entry_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/entryGroupIamBinding:EntryGroupIamBinding editor projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryGroupIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs.builder
    com.pulumi.gcp.dataplex.EntryGroupIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex EntryGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   * * `gcp.dataplex.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   * &gt; **Note:** `gcp.dataplex.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryGroupIamBinding` and `gcp.dataplex.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.EntryGroupIamPolicy
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
   * import com.pulumi.gcp.dataplex.EntryGroupIamPolicy;
   * import com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryGroupIamBinding;
   * import com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs;
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
   *         var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryGroupIamMember;
   * import com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs;
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
   *         var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex EntryGroup
   * 
   * Three different resources help you manage your IAM policy for Dataplex EntryGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   * * `gcp.dataplex.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   * &gt; **Note:** `gcp.dataplex.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryGroupIamBinding` and `gcp.dataplex.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.EntryGroupIamPolicy
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
   * import com.pulumi.gcp.dataplex.EntryGroupIamPolicy;
   * import com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryGroupIamBinding;
   * import com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs;
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
   *         var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryGroupIamMember;
   * import com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs;
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
   *         var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}}
   * * {{project}}/{{location}}/{{entry_group_id}}
   * * {{location}}/{{entry_group_id}}
   * * {{entry_group_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex entrygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_entry_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_entry_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/entryGroupIamMember:EntryGroupIamMember editor projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryGroupIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs.builder
    com.pulumi.gcp.dataplex.EntryGroupIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex EntryGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   * * `gcp.dataplex.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   * &gt; **Note:** `gcp.dataplex.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryGroupIamBinding` and `gcp.dataplex.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.EntryGroupIamPolicy
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
   * import com.pulumi.gcp.dataplex.EntryGroupIamPolicy;
   * import com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryGroupIamBinding;
   * import com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs;
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
   *         var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryGroupIamMember;
   * import com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs;
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
   *         var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex EntryGroup
   * 
   * Three different resources help you manage your IAM policy for Dataplex EntryGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   * * `gcp.dataplex.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   * &gt; **Note:** `gcp.dataplex.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryGroupIamBinding` and `gcp.dataplex.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.EntryGroupIamPolicy
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
   * import com.pulumi.gcp.dataplex.EntryGroupIamPolicy;
   * import com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryGroupIamBinding;
   * import com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs;
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
   *         var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryGroupIamMember;
   * import com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs;
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
   *         var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *             .project(testEntryGroupBasic.get("project"))
   *             .location(testEntryGroupBasic.get("location"))
   *             .entryGroupId(testEntryGroupBasic.get("entryGroupId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}}
   * * {{project}}/{{location}}/{{entry_group_id}}
   * * {{location}}/{{entry_group_id}}
   * * {{entry_group_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex entrygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_entry_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_entry_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/entryGroupIamPolicy:EntryGroupIamPolicy editor projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryGroupIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.EntryGroupIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * EntryLink represents a link between two Entries.
   * 
   * To get more information about EntryLink, see:
   * 
   * * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.entryGroups.entryLinks)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dataplex/docs)
   */
  def EntryLink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryLinkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryLinkArgs.builder
    com.pulumi.gcp.dataplex.EntryLink(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** An Entry Type is a template for creating Entries. */
  def EntryType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryTypeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryTypeArgs.builder
    com.pulumi.gcp.dataplex.EntryType(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex EntryType. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.EntryTypeIamPolicy`: Authoritative. Sets the IAM policy for the entrytype and replaces any existing policy already attached.
   * * `gcp.dataplex.EntryTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrytype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.EntryTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrytype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.EntryTypeIamPolicy`: Retrieves the IAM policy for the entrytype
   * 
   * &gt; **Note:** `gcp.dataplex.EntryTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryTypeIamBinding` and `gcp.dataplex.EntryTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.EntryTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.EntryTypeIamPolicy
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
   * import com.pulumi.gcp.dataplex.EntryTypeIamPolicy;
   * import com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new EntryTypeIamPolicy("policy", EntryTypeIamPolicyArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryTypeIamBinding;
   * import com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs;
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
   *         var binding = new EntryTypeIamBinding("binding", EntryTypeIamBindingArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryTypeIamMember;
   * import com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs;
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
   *         var member = new EntryTypeIamMember("member", EntryTypeIamMemberArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex EntryType
   * 
   * Three different resources help you manage your IAM policy for Dataplex EntryType. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.EntryTypeIamPolicy`: Authoritative. Sets the IAM policy for the entrytype and replaces any existing policy already attached.
   * * `gcp.dataplex.EntryTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrytype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.EntryTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrytype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.EntryTypeIamPolicy`: Retrieves the IAM policy for the entrytype
   * 
   * &gt; **Note:** `gcp.dataplex.EntryTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryTypeIamBinding` and `gcp.dataplex.EntryTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.EntryTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.EntryTypeIamPolicy
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
   * import com.pulumi.gcp.dataplex.EntryTypeIamPolicy;
   * import com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new EntryTypeIamPolicy("policy", EntryTypeIamPolicyArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryTypeIamBinding;
   * import com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs;
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
   *         var binding = new EntryTypeIamBinding("binding", EntryTypeIamBindingArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryTypeIamMember;
   * import com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs;
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
   *         var member = new EntryTypeIamMember("member", EntryTypeIamMemberArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}}
   * * {{project}}/{{location}}/{{entry_type_id}}
   * * {{location}}/{{entry_type_id}}
   * * {{entry_type_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex entrytype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_entry_type_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_entry_type_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/entryTypeIamBinding:EntryTypeIamBinding editor projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryTypeIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs.builder
    com.pulumi.gcp.dataplex.EntryTypeIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex EntryType. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.EntryTypeIamPolicy`: Authoritative. Sets the IAM policy for the entrytype and replaces any existing policy already attached.
   * * `gcp.dataplex.EntryTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrytype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.EntryTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrytype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.EntryTypeIamPolicy`: Retrieves the IAM policy for the entrytype
   * 
   * &gt; **Note:** `gcp.dataplex.EntryTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryTypeIamBinding` and `gcp.dataplex.EntryTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.EntryTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.EntryTypeIamPolicy
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
   * import com.pulumi.gcp.dataplex.EntryTypeIamPolicy;
   * import com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new EntryTypeIamPolicy("policy", EntryTypeIamPolicyArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryTypeIamBinding;
   * import com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs;
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
   *         var binding = new EntryTypeIamBinding("binding", EntryTypeIamBindingArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryTypeIamMember;
   * import com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs;
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
   *         var member = new EntryTypeIamMember("member", EntryTypeIamMemberArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex EntryType
   * 
   * Three different resources help you manage your IAM policy for Dataplex EntryType. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.EntryTypeIamPolicy`: Authoritative. Sets the IAM policy for the entrytype and replaces any existing policy already attached.
   * * `gcp.dataplex.EntryTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrytype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.EntryTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrytype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.EntryTypeIamPolicy`: Retrieves the IAM policy for the entrytype
   * 
   * &gt; **Note:** `gcp.dataplex.EntryTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryTypeIamBinding` and `gcp.dataplex.EntryTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.EntryTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.EntryTypeIamPolicy
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
   * import com.pulumi.gcp.dataplex.EntryTypeIamPolicy;
   * import com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new EntryTypeIamPolicy("policy", EntryTypeIamPolicyArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryTypeIamBinding;
   * import com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs;
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
   *         var binding = new EntryTypeIamBinding("binding", EntryTypeIamBindingArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryTypeIamMember;
   * import com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs;
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
   *         var member = new EntryTypeIamMember("member", EntryTypeIamMemberArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}}
   * * {{project}}/{{location}}/{{entry_type_id}}
   * * {{location}}/{{entry_type_id}}
   * * {{entry_type_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex entrytype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_entry_type_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_entry_type_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/entryTypeIamMember:EntryTypeIamMember editor projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryTypeIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs.builder
    com.pulumi.gcp.dataplex.EntryTypeIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex EntryType. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.EntryTypeIamPolicy`: Authoritative. Sets the IAM policy for the entrytype and replaces any existing policy already attached.
   * * `gcp.dataplex.EntryTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrytype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.EntryTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrytype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.EntryTypeIamPolicy`: Retrieves the IAM policy for the entrytype
   * 
   * &gt; **Note:** `gcp.dataplex.EntryTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryTypeIamBinding` and `gcp.dataplex.EntryTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.EntryTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.EntryTypeIamPolicy
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
   * import com.pulumi.gcp.dataplex.EntryTypeIamPolicy;
   * import com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new EntryTypeIamPolicy("policy", EntryTypeIamPolicyArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryTypeIamBinding;
   * import com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs;
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
   *         var binding = new EntryTypeIamBinding("binding", EntryTypeIamBindingArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryTypeIamMember;
   * import com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs;
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
   *         var member = new EntryTypeIamMember("member", EntryTypeIamMemberArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex EntryType
   * 
   * Three different resources help you manage your IAM policy for Dataplex EntryType. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.EntryTypeIamPolicy`: Authoritative. Sets the IAM policy for the entrytype and replaces any existing policy already attached.
   * * `gcp.dataplex.EntryTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrytype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.EntryTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrytype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.EntryTypeIamPolicy`: Retrieves the IAM policy for the entrytype
   * 
   * &gt; **Note:** `gcp.dataplex.EntryTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryTypeIamBinding` and `gcp.dataplex.EntryTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.EntryTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.EntryTypeIamPolicy
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
   * import com.pulumi.gcp.dataplex.EntryTypeIamPolicy;
   * import com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new EntryTypeIamPolicy("policy", EntryTypeIamPolicyArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryTypeIamBinding;
   * import com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs;
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
   *         var binding = new EntryTypeIamBinding("binding", EntryTypeIamBindingArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.EntryTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.EntryTypeIamMember;
   * import com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs;
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
   *         var member = new EntryTypeIamMember("member", EntryTypeIamMemberArgs.builder()
   *             .project(testEntryTypeBasic.get("project"))
   *             .location(testEntryTypeBasic.get("location"))
   *             .entryTypeId(testEntryTypeBasic.get("entryTypeId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}}
   * * {{project}}/{{location}}/{{entry_type_id}}
   * * {{location}}/{{entry_type_id}}
   * * {{entry_type_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex entrytype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_entry_type_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_entry_type_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/entryTypeIamPolicy:EntryTypeIamPolicy editor projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryTypeIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.EntryTypeIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Represents a collection of categories and terms defined by the user. Glossary is a top level resource and is the GCP parent resource of all the categories and terms within it. */
  def Glossary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.GlossaryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.GlossaryArgs.builder
    com.pulumi.gcp.dataplex.Glossary(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Represents a collection of categories and terms within a Glossary that are related to each other. */
  def GlossaryCategory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.GlossaryCategoryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.GlossaryCategoryArgs.builder
    com.pulumi.gcp.dataplex.GlossaryCategory(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Glossary. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.GlossaryIamPolicy`: Authoritative. Sets the IAM policy for the glossary and replaces any existing policy already attached.
   * * `gcp.dataplex.GlossaryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the glossary are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.GlossaryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the glossary are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.GlossaryIamPolicy`: Retrieves the IAM policy for the glossary
   * 
   * &gt; **Note:** `gcp.dataplex.GlossaryIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.GlossaryIamBinding` and `gcp.dataplex.GlossaryIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.GlossaryIamBinding` resources **can be** used in conjunction with `gcp.dataplex.GlossaryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.GlossaryIamPolicy
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
   * import com.pulumi.gcp.dataplex.GlossaryIamPolicy;
   * import com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new GlossaryIamPolicy("policy", GlossaryIamPolicyArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.GlossaryIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.GlossaryIamBinding;
   * import com.pulumi.gcp.dataplex.GlossaryIamBindingArgs;
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
   *         var binding = new GlossaryIamBinding("binding", GlossaryIamBindingArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.GlossaryIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.GlossaryIamMember;
   * import com.pulumi.gcp.dataplex.GlossaryIamMemberArgs;
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
   *         var member = new GlossaryIamMember("member", GlossaryIamMemberArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Glossary
   * 
   * Three different resources help you manage your IAM policy for Dataplex Glossary. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.GlossaryIamPolicy`: Authoritative. Sets the IAM policy for the glossary and replaces any existing policy already attached.
   * * `gcp.dataplex.GlossaryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the glossary are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.GlossaryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the glossary are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.GlossaryIamPolicy`: Retrieves the IAM policy for the glossary
   * 
   * &gt; **Note:** `gcp.dataplex.GlossaryIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.GlossaryIamBinding` and `gcp.dataplex.GlossaryIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.GlossaryIamBinding` resources **can be** used in conjunction with `gcp.dataplex.GlossaryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.GlossaryIamPolicy
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
   * import com.pulumi.gcp.dataplex.GlossaryIamPolicy;
   * import com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new GlossaryIamPolicy("policy", GlossaryIamPolicyArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.GlossaryIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.GlossaryIamBinding;
   * import com.pulumi.gcp.dataplex.GlossaryIamBindingArgs;
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
   *         var binding = new GlossaryIamBinding("binding", GlossaryIamBindingArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.GlossaryIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.GlossaryIamMember;
   * import com.pulumi.gcp.dataplex.GlossaryIamMemberArgs;
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
   *         var member = new GlossaryIamMember("member", GlossaryIamMemberArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}
   * * {{project}}/{{location}}/{{glossary_id}}
   * * {{location}}/{{glossary_id}}
   * * {{glossary_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex glossary IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_glossary_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_glossary_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/glossaryIamBinding:GlossaryIamBinding editor projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def GlossaryIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.GlossaryIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.GlossaryIamBindingArgs.builder
    com.pulumi.gcp.dataplex.GlossaryIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Glossary. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.GlossaryIamPolicy`: Authoritative. Sets the IAM policy for the glossary and replaces any existing policy already attached.
   * * `gcp.dataplex.GlossaryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the glossary are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.GlossaryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the glossary are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.GlossaryIamPolicy`: Retrieves the IAM policy for the glossary
   * 
   * &gt; **Note:** `gcp.dataplex.GlossaryIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.GlossaryIamBinding` and `gcp.dataplex.GlossaryIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.GlossaryIamBinding` resources **can be** used in conjunction with `gcp.dataplex.GlossaryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.GlossaryIamPolicy
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
   * import com.pulumi.gcp.dataplex.GlossaryIamPolicy;
   * import com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new GlossaryIamPolicy("policy", GlossaryIamPolicyArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.GlossaryIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.GlossaryIamBinding;
   * import com.pulumi.gcp.dataplex.GlossaryIamBindingArgs;
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
   *         var binding = new GlossaryIamBinding("binding", GlossaryIamBindingArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.GlossaryIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.GlossaryIamMember;
   * import com.pulumi.gcp.dataplex.GlossaryIamMemberArgs;
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
   *         var member = new GlossaryIamMember("member", GlossaryIamMemberArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Glossary
   * 
   * Three different resources help you manage your IAM policy for Dataplex Glossary. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.GlossaryIamPolicy`: Authoritative. Sets the IAM policy for the glossary and replaces any existing policy already attached.
   * * `gcp.dataplex.GlossaryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the glossary are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.GlossaryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the glossary are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.GlossaryIamPolicy`: Retrieves the IAM policy for the glossary
   * 
   * &gt; **Note:** `gcp.dataplex.GlossaryIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.GlossaryIamBinding` and `gcp.dataplex.GlossaryIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.GlossaryIamBinding` resources **can be** used in conjunction with `gcp.dataplex.GlossaryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.GlossaryIamPolicy
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
   * import com.pulumi.gcp.dataplex.GlossaryIamPolicy;
   * import com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new GlossaryIamPolicy("policy", GlossaryIamPolicyArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.GlossaryIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.GlossaryIamBinding;
   * import com.pulumi.gcp.dataplex.GlossaryIamBindingArgs;
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
   *         var binding = new GlossaryIamBinding("binding", GlossaryIamBindingArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.GlossaryIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.GlossaryIamMember;
   * import com.pulumi.gcp.dataplex.GlossaryIamMemberArgs;
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
   *         var member = new GlossaryIamMember("member", GlossaryIamMemberArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}
   * * {{project}}/{{location}}/{{glossary_id}}
   * * {{location}}/{{glossary_id}}
   * * {{glossary_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex glossary IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_glossary_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_glossary_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/glossaryIamMember:GlossaryIamMember editor projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def GlossaryIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.GlossaryIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.GlossaryIamMemberArgs.builder
    com.pulumi.gcp.dataplex.GlossaryIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Glossary. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.GlossaryIamPolicy`: Authoritative. Sets the IAM policy for the glossary and replaces any existing policy already attached.
   * * `gcp.dataplex.GlossaryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the glossary are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.GlossaryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the glossary are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.GlossaryIamPolicy`: Retrieves the IAM policy for the glossary
   * 
   * &gt; **Note:** `gcp.dataplex.GlossaryIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.GlossaryIamBinding` and `gcp.dataplex.GlossaryIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.GlossaryIamBinding` resources **can be** used in conjunction with `gcp.dataplex.GlossaryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.GlossaryIamPolicy
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
   * import com.pulumi.gcp.dataplex.GlossaryIamPolicy;
   * import com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new GlossaryIamPolicy("policy", GlossaryIamPolicyArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.GlossaryIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.GlossaryIamBinding;
   * import com.pulumi.gcp.dataplex.GlossaryIamBindingArgs;
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
   *         var binding = new GlossaryIamBinding("binding", GlossaryIamBindingArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.GlossaryIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.GlossaryIamMember;
   * import com.pulumi.gcp.dataplex.GlossaryIamMemberArgs;
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
   *         var member = new GlossaryIamMember("member", GlossaryIamMemberArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Glossary
   * 
   * Three different resources help you manage your IAM policy for Dataplex Glossary. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.GlossaryIamPolicy`: Authoritative. Sets the IAM policy for the glossary and replaces any existing policy already attached.
   * * `gcp.dataplex.GlossaryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the glossary are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.GlossaryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the glossary are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.GlossaryIamPolicy`: Retrieves the IAM policy for the glossary
   * 
   * &gt; **Note:** `gcp.dataplex.GlossaryIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.GlossaryIamBinding` and `gcp.dataplex.GlossaryIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.GlossaryIamBinding` resources **can be** used in conjunction with `gcp.dataplex.GlossaryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.GlossaryIamPolicy
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
   * import com.pulumi.gcp.dataplex.GlossaryIamPolicy;
   * import com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new GlossaryIamPolicy("policy", GlossaryIamPolicyArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.GlossaryIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.GlossaryIamBinding;
   * import com.pulumi.gcp.dataplex.GlossaryIamBindingArgs;
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
   *         var binding = new GlossaryIamBinding("binding", GlossaryIamBindingArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.GlossaryIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.GlossaryIamMember;
   * import com.pulumi.gcp.dataplex.GlossaryIamMemberArgs;
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
   *         var member = new GlossaryIamMember("member", GlossaryIamMemberArgs.builder()
   *             .project(glossaryTestId.get("project"))
   *             .location(glossaryTestId.get("location"))
   *             .glossaryId(glossaryTestId.get("glossaryId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}
   * * {{project}}/{{location}}/{{glossary_id}}
   * * {{location}}/{{glossary_id}}
   * * {{glossary_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex glossary IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_glossary_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_glossary_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/glossaryIamPolicy:GlossaryIamPolicy editor projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def GlossaryIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.GlossaryIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Represents a collection of terms within a Glossary that are related to each other. */
  def GlossaryTerm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.GlossaryTermArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.GlossaryTermArgs.builder
    com.pulumi.gcp.dataplex.GlossaryTerm(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** The Dataplex Lake resource */
  def Lake(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.LakeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataplex.LakeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataplex.Lake(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Lake. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.LakeIamPolicy`: Authoritative. Sets the IAM policy for the lake and replaces any existing policy already attached.
   * * `gcp.dataplex.LakeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the lake are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.LakeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the lake are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.LakeIamPolicy`: Retrieves the IAM policy for the lake
   * 
   * &gt; **Note:** `gcp.dataplex.LakeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.LakeIamBinding` and `gcp.dataplex.LakeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.LakeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.LakeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.LakeIamPolicy
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
   * import com.pulumi.gcp.dataplex.LakeIamPolicy;
   * import com.pulumi.gcp.dataplex.LakeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new LakeIamPolicy("policy", LakeIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.LakeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.LakeIamBinding;
   * import com.pulumi.gcp.dataplex.LakeIamBindingArgs;
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
   *         var binding = new LakeIamBinding("binding", LakeIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.LakeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.LakeIamMember;
   * import com.pulumi.gcp.dataplex.LakeIamMemberArgs;
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
   *         var member = new LakeIamMember("member", LakeIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Lake
   * 
   * Three different resources help you manage your IAM policy for Dataplex Lake. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.LakeIamPolicy`: Authoritative. Sets the IAM policy for the lake and replaces any existing policy already attached.
   * * `gcp.dataplex.LakeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the lake are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.LakeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the lake are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.LakeIamPolicy`: Retrieves the IAM policy for the lake
   * 
   * &gt; **Note:** `gcp.dataplex.LakeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.LakeIamBinding` and `gcp.dataplex.LakeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.LakeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.LakeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.LakeIamPolicy
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
   * import com.pulumi.gcp.dataplex.LakeIamPolicy;
   * import com.pulumi.gcp.dataplex.LakeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new LakeIamPolicy("policy", LakeIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.LakeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.LakeIamBinding;
   * import com.pulumi.gcp.dataplex.LakeIamBindingArgs;
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
   *         var binding = new LakeIamBinding("binding", LakeIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.LakeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.LakeIamMember;
   * import com.pulumi.gcp.dataplex.LakeIamMemberArgs;
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
   *         var member = new LakeIamMember("member", LakeIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/lakes/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex lake IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_lake_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_lake_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/lakeIamBinding:LakeIamBinding editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def LakeIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.LakeIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.LakeIamBindingArgs.builder
    com.pulumi.gcp.dataplex.LakeIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Lake. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.LakeIamPolicy`: Authoritative. Sets the IAM policy for the lake and replaces any existing policy already attached.
   * * `gcp.dataplex.LakeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the lake are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.LakeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the lake are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.LakeIamPolicy`: Retrieves the IAM policy for the lake
   * 
   * &gt; **Note:** `gcp.dataplex.LakeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.LakeIamBinding` and `gcp.dataplex.LakeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.LakeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.LakeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.LakeIamPolicy
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
   * import com.pulumi.gcp.dataplex.LakeIamPolicy;
   * import com.pulumi.gcp.dataplex.LakeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new LakeIamPolicy("policy", LakeIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.LakeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.LakeIamBinding;
   * import com.pulumi.gcp.dataplex.LakeIamBindingArgs;
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
   *         var binding = new LakeIamBinding("binding", LakeIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.LakeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.LakeIamMember;
   * import com.pulumi.gcp.dataplex.LakeIamMemberArgs;
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
   *         var member = new LakeIamMember("member", LakeIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Lake
   * 
   * Three different resources help you manage your IAM policy for Dataplex Lake. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.LakeIamPolicy`: Authoritative. Sets the IAM policy for the lake and replaces any existing policy already attached.
   * * `gcp.dataplex.LakeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the lake are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.LakeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the lake are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.LakeIamPolicy`: Retrieves the IAM policy for the lake
   * 
   * &gt; **Note:** `gcp.dataplex.LakeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.LakeIamBinding` and `gcp.dataplex.LakeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.LakeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.LakeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.LakeIamPolicy
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
   * import com.pulumi.gcp.dataplex.LakeIamPolicy;
   * import com.pulumi.gcp.dataplex.LakeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new LakeIamPolicy("policy", LakeIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.LakeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.LakeIamBinding;
   * import com.pulumi.gcp.dataplex.LakeIamBindingArgs;
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
   *         var binding = new LakeIamBinding("binding", LakeIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.LakeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.LakeIamMember;
   * import com.pulumi.gcp.dataplex.LakeIamMemberArgs;
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
   *         var member = new LakeIamMember("member", LakeIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/lakes/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex lake IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_lake_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_lake_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/lakeIamMember:LakeIamMember editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def LakeIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.LakeIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.LakeIamMemberArgs.builder
    com.pulumi.gcp.dataplex.LakeIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Lake. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.LakeIamPolicy`: Authoritative. Sets the IAM policy for the lake and replaces any existing policy already attached.
   * * `gcp.dataplex.LakeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the lake are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.LakeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the lake are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.LakeIamPolicy`: Retrieves the IAM policy for the lake
   * 
   * &gt; **Note:** `gcp.dataplex.LakeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.LakeIamBinding` and `gcp.dataplex.LakeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.LakeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.LakeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.LakeIamPolicy
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
   * import com.pulumi.gcp.dataplex.LakeIamPolicy;
   * import com.pulumi.gcp.dataplex.LakeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new LakeIamPolicy("policy", LakeIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.LakeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.LakeIamBinding;
   * import com.pulumi.gcp.dataplex.LakeIamBindingArgs;
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
   *         var binding = new LakeIamBinding("binding", LakeIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.LakeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.LakeIamMember;
   * import com.pulumi.gcp.dataplex.LakeIamMemberArgs;
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
   *         var member = new LakeIamMember("member", LakeIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Lake
   * 
   * Three different resources help you manage your IAM policy for Dataplex Lake. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.LakeIamPolicy`: Authoritative. Sets the IAM policy for the lake and replaces any existing policy already attached.
   * * `gcp.dataplex.LakeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the lake are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.LakeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the lake are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.LakeIamPolicy`: Retrieves the IAM policy for the lake
   * 
   * &gt; **Note:** `gcp.dataplex.LakeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.LakeIamBinding` and `gcp.dataplex.LakeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.LakeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.LakeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.LakeIamPolicy
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
   * import com.pulumi.gcp.dataplex.LakeIamPolicy;
   * import com.pulumi.gcp.dataplex.LakeIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new LakeIamPolicy("policy", LakeIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.LakeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.LakeIamBinding;
   * import com.pulumi.gcp.dataplex.LakeIamBindingArgs;
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
   *         var binding = new LakeIamBinding("binding", LakeIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.LakeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.LakeIamMember;
   * import com.pulumi.gcp.dataplex.LakeIamMemberArgs;
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
   *         var member = new LakeIamMember("member", LakeIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("name"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/lakes/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex lake IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_lake_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_lake_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/lakeIamPolicy:LakeIamPolicy editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def LakeIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.LakeIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.LakeIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.LakeIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** A Dataplex Metadata Feed monitors Dataplex metadata entries in a specified scope and publishes notifications of changes to a Cloud Pub/Sub topic. */
  def MetadataFeed(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.MetadataFeedArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.MetadataFeedArgs.builder
    com.pulumi.gcp.dataplex.MetadataFeed(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Dataplex task represents the work that you want Dataplex to do on a schedule. It encapsulates code, parameters, and the schedule.
   * 
   * To get more information about Task, see:
   * 
   * * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.lakes.tasks)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dataplex/docs)
   */
  def Task(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.TaskArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.TaskArgs.builder
    com.pulumi.gcp.dataplex.Task(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
   * * `gcp.dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
   * 
   * &gt; **Note:** `gcp.dataplex.TaskIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.TaskIamBinding` and `gcp.dataplex.TaskIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.TaskIamBinding` resources **can be** used in conjunction with `gcp.dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.TaskIamPolicy
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
   * import com.pulumi.gcp.dataplex.TaskIamPolicy;
   * import com.pulumi.gcp.dataplex.TaskIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new TaskIamPolicy("policy", TaskIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.TaskIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.TaskIamBinding;
   * import com.pulumi.gcp.dataplex.TaskIamBindingArgs;
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
   *         var binding = new TaskIamBinding("binding", TaskIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.TaskIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.TaskIamMember;
   * import com.pulumi.gcp.dataplex.TaskIamMemberArgs;
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
   *         var member = new TaskIamMember("member", TaskIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Task
   * 
   * Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
   * * `gcp.dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
   * 
   * &gt; **Note:** `gcp.dataplex.TaskIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.TaskIamBinding` and `gcp.dataplex.TaskIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.TaskIamBinding` resources **can be** used in conjunction with `gcp.dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.TaskIamPolicy
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
   * import com.pulumi.gcp.dataplex.TaskIamPolicy;
   * import com.pulumi.gcp.dataplex.TaskIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new TaskIamPolicy("policy", TaskIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.TaskIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.TaskIamBinding;
   * import com.pulumi.gcp.dataplex.TaskIamBindingArgs;
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
   *         var binding = new TaskIamBinding("binding", TaskIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.TaskIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.TaskIamMember;
   * import com.pulumi.gcp.dataplex.TaskIamMemberArgs;
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
   *         var member = new TaskIamMember("member", TaskIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
   * * {{project}}/{{location}}/{{lake}}/{{task_id}}
   * * {{location}}/{{lake}}/{{task_id}}
   * * {{task_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex task IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_task_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_task_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/taskIamBinding:TaskIamBinding editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TaskIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.TaskIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.TaskIamBindingArgs.builder
    com.pulumi.gcp.dataplex.TaskIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
   * * `gcp.dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
   * 
   * &gt; **Note:** `gcp.dataplex.TaskIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.TaskIamBinding` and `gcp.dataplex.TaskIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.TaskIamBinding` resources **can be** used in conjunction with `gcp.dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.TaskIamPolicy
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
   * import com.pulumi.gcp.dataplex.TaskIamPolicy;
   * import com.pulumi.gcp.dataplex.TaskIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new TaskIamPolicy("policy", TaskIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.TaskIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.TaskIamBinding;
   * import com.pulumi.gcp.dataplex.TaskIamBindingArgs;
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
   *         var binding = new TaskIamBinding("binding", TaskIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.TaskIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.TaskIamMember;
   * import com.pulumi.gcp.dataplex.TaskIamMemberArgs;
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
   *         var member = new TaskIamMember("member", TaskIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Task
   * 
   * Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
   * * `gcp.dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
   * 
   * &gt; **Note:** `gcp.dataplex.TaskIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.TaskIamBinding` and `gcp.dataplex.TaskIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.TaskIamBinding` resources **can be** used in conjunction with `gcp.dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.TaskIamPolicy
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
   * import com.pulumi.gcp.dataplex.TaskIamPolicy;
   * import com.pulumi.gcp.dataplex.TaskIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new TaskIamPolicy("policy", TaskIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.TaskIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.TaskIamBinding;
   * import com.pulumi.gcp.dataplex.TaskIamBindingArgs;
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
   *         var binding = new TaskIamBinding("binding", TaskIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.TaskIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.TaskIamMember;
   * import com.pulumi.gcp.dataplex.TaskIamMemberArgs;
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
   *         var member = new TaskIamMember("member", TaskIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
   * * {{project}}/{{location}}/{{lake}}/{{task_id}}
   * * {{location}}/{{lake}}/{{task_id}}
   * * {{task_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex task IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_task_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_task_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/taskIamMember:TaskIamMember editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TaskIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.TaskIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.TaskIamMemberArgs.builder
    com.pulumi.gcp.dataplex.TaskIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
   * * `gcp.dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
   * 
   * &gt; **Note:** `gcp.dataplex.TaskIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.TaskIamBinding` and `gcp.dataplex.TaskIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.TaskIamBinding` resources **can be** used in conjunction with `gcp.dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.TaskIamPolicy
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
   * import com.pulumi.gcp.dataplex.TaskIamPolicy;
   * import com.pulumi.gcp.dataplex.TaskIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new TaskIamPolicy("policy", TaskIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.TaskIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.TaskIamBinding;
   * import com.pulumi.gcp.dataplex.TaskIamBindingArgs;
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
   *         var binding = new TaskIamBinding("binding", TaskIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.TaskIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.TaskIamMember;
   * import com.pulumi.gcp.dataplex.TaskIamMemberArgs;
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
   *         var member = new TaskIamMember("member", TaskIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Task
   * 
   * Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
   * * `gcp.dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
   * 
   * &gt; **Note:** `gcp.dataplex.TaskIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.TaskIamBinding` and `gcp.dataplex.TaskIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.TaskIamBinding` resources **can be** used in conjunction with `gcp.dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.TaskIamPolicy
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
   * import com.pulumi.gcp.dataplex.TaskIamPolicy;
   * import com.pulumi.gcp.dataplex.TaskIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new TaskIamPolicy("policy", TaskIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.TaskIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.TaskIamBinding;
   * import com.pulumi.gcp.dataplex.TaskIamBindingArgs;
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
   *         var binding = new TaskIamBinding("binding", TaskIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.TaskIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.TaskIamMember;
   * import com.pulumi.gcp.dataplex.TaskIamMemberArgs;
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
   *         var member = new TaskIamMember("member", TaskIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .taskId(example.get("taskId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
   * * {{project}}/{{location}}/{{lake}}/{{task_id}}
   * * {{location}}/{{lake}}/{{task_id}}
   * * {{task_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex task IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_task_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_task_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/taskIamPolicy:TaskIamPolicy editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TaskIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.TaskIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.TaskIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.TaskIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** The Dataplex Zone resource */
  def Zone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.ZoneArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataplex.ZoneArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataplex.Zone(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
   * * `gcp.dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
   * 
   * &gt; **Note:** `gcp.dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.ZoneIamBinding` and `gcp.dataplex.ZoneIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.ZoneIamBinding` resources **can be** used in conjunction with `gcp.dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.ZoneIamPolicy
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
   * import com.pulumi.gcp.dataplex.ZoneIamPolicy;
   * import com.pulumi.gcp.dataplex.ZoneIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ZoneIamPolicy("policy", ZoneIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.ZoneIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.ZoneIamBinding;
   * import com.pulumi.gcp.dataplex.ZoneIamBindingArgs;
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
   *         var binding = new ZoneIamBinding("binding", ZoneIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.ZoneIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.ZoneIamMember;
   * import com.pulumi.gcp.dataplex.ZoneIamMemberArgs;
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
   *         var member = new ZoneIamMember("member", ZoneIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Zone
   * 
   * Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
   * * `gcp.dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
   * 
   * &gt; **Note:** `gcp.dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.ZoneIamBinding` and `gcp.dataplex.ZoneIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.ZoneIamBinding` resources **can be** used in conjunction with `gcp.dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.ZoneIamPolicy
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
   * import com.pulumi.gcp.dataplex.ZoneIamPolicy;
   * import com.pulumi.gcp.dataplex.ZoneIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ZoneIamPolicy("policy", ZoneIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.ZoneIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.ZoneIamBinding;
   * import com.pulumi.gcp.dataplex.ZoneIamBindingArgs;
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
   *         var binding = new ZoneIamBinding("binding", ZoneIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.ZoneIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.ZoneIamMember;
   * import com.pulumi.gcp.dataplex.ZoneIamMemberArgs;
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
   *         var member = new ZoneIamMember("member", ZoneIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{name}}
   * * {{project}}/{{location}}/{{lake}}/{{name}}
   * * {{location}}/{{lake}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex zone IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_zone_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_zone_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/zoneIamBinding:ZoneIamBinding editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ZoneIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.ZoneIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.ZoneIamBindingArgs.builder
    com.pulumi.gcp.dataplex.ZoneIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
   * * `gcp.dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
   * 
   * &gt; **Note:** `gcp.dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.ZoneIamBinding` and `gcp.dataplex.ZoneIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.ZoneIamBinding` resources **can be** used in conjunction with `gcp.dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.ZoneIamPolicy
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
   * import com.pulumi.gcp.dataplex.ZoneIamPolicy;
   * import com.pulumi.gcp.dataplex.ZoneIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ZoneIamPolicy("policy", ZoneIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.ZoneIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.ZoneIamBinding;
   * import com.pulumi.gcp.dataplex.ZoneIamBindingArgs;
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
   *         var binding = new ZoneIamBinding("binding", ZoneIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.ZoneIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.ZoneIamMember;
   * import com.pulumi.gcp.dataplex.ZoneIamMemberArgs;
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
   *         var member = new ZoneIamMember("member", ZoneIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Zone
   * 
   * Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
   * * `gcp.dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
   * 
   * &gt; **Note:** `gcp.dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.ZoneIamBinding` and `gcp.dataplex.ZoneIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.ZoneIamBinding` resources **can be** used in conjunction with `gcp.dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.ZoneIamPolicy
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
   * import com.pulumi.gcp.dataplex.ZoneIamPolicy;
   * import com.pulumi.gcp.dataplex.ZoneIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ZoneIamPolicy("policy", ZoneIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.ZoneIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.ZoneIamBinding;
   * import com.pulumi.gcp.dataplex.ZoneIamBindingArgs;
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
   *         var binding = new ZoneIamBinding("binding", ZoneIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.ZoneIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.ZoneIamMember;
   * import com.pulumi.gcp.dataplex.ZoneIamMemberArgs;
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
   *         var member = new ZoneIamMember("member", ZoneIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{name}}
   * * {{project}}/{{location}}/{{lake}}/{{name}}
   * * {{location}}/{{lake}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex zone IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_zone_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_zone_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/zoneIamMember:ZoneIamMember editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ZoneIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.ZoneIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.ZoneIamMemberArgs.builder
    com.pulumi.gcp.dataplex.ZoneIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
   * * `gcp.dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
   * 
   * &gt; **Note:** `gcp.dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.ZoneIamBinding` and `gcp.dataplex.ZoneIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.ZoneIamBinding` resources **can be** used in conjunction with `gcp.dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.ZoneIamPolicy
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
   * import com.pulumi.gcp.dataplex.ZoneIamPolicy;
   * import com.pulumi.gcp.dataplex.ZoneIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ZoneIamPolicy("policy", ZoneIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.ZoneIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.ZoneIamBinding;
   * import com.pulumi.gcp.dataplex.ZoneIamBindingArgs;
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
   *         var binding = new ZoneIamBinding("binding", ZoneIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.ZoneIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.ZoneIamMember;
   * import com.pulumi.gcp.dataplex.ZoneIamMemberArgs;
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
   *         var member = new ZoneIamMember("member", ZoneIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Dataplex Zone
   * 
   * Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
   * 
   * * `gcp.dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
   * * `gcp.dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
   * 
   * &gt; **Note:** `gcp.dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.ZoneIamBinding` and `gcp.dataplex.ZoneIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataplex.ZoneIamBinding` resources **can be** used in conjunction with `gcp.dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataplex.ZoneIamPolicy
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
   * import com.pulumi.gcp.dataplex.ZoneIamPolicy;
   * import com.pulumi.gcp.dataplex.ZoneIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ZoneIamPolicy("policy", ZoneIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.ZoneIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.ZoneIamBinding;
   * import com.pulumi.gcp.dataplex.ZoneIamBindingArgs;
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
   *         var binding = new ZoneIamBinding("binding", ZoneIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataplex.ZoneIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataplex.ZoneIamMember;
   * import com.pulumi.gcp.dataplex.ZoneIamMemberArgs;
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
   *         var member = new ZoneIamMember("member", ZoneIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .lake(example.get("lake"))
   *             .dataplexZone(example.get("name"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{name}}
   * * {{project}}/{{location}}/{{lake}}/{{name}}
   * * {{location}}/{{lake}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataplex zone IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataplex_zone_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataplex_zone_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataplex/zoneIamPolicy:ZoneIamPolicy editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ZoneIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.ZoneIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataplex.ZoneIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.ZoneIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
