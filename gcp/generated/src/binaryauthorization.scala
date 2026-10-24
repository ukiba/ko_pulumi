package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object binaryauthorization:
  /**
   * An attestor that attests to container image artifacts.
   * 
   * To get more information about Attestor, see:
   * 
   * * [API documentation](https://cloud.google.com/binary-authorization/docs/reference/rest/)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/binary-authorization/)
   */
  def Attestor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.binaryauthorization.AttestorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.binaryauthorization.AttestorArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.binaryauthorization.Attestor(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Binary Authorization Attestor. Each of these resources serves a different use case:
   * 
   * * `gcp.binaryauthorization.AttestorIamPolicy`: Authoritative. Sets the IAM policy for the attestor and replaces any existing policy already attached.
   * * `gcp.binaryauthorization.AttestorIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the attestor are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.binaryauthorization.AttestorIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the attestor are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.binaryauthorization.AttestorIamPolicy`: Retrieves the IAM policy for the attestor
   * 
   * &gt; **Note:** `gcp.binaryauthorization.AttestorIamPolicy` **cannot** be used in conjunction with `gcp.binaryauthorization.AttestorIamBinding` and `gcp.binaryauthorization.AttestorIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.binaryauthorization.AttestorIamBinding` resources **can be** used in conjunction with `gcp.binaryauthorization.AttestorIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.binaryauthorization.AttestorIamPolicy
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
   * import com.pulumi.gcp.binaryauthorization.AttestorIamPolicy;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs;
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
   *         var policy = new AttestorIamPolicy("policy", AttestorIamPolicyArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.binaryauthorization.AttestorIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamBinding;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs;
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
   *         var binding = new AttestorIamBinding("binding", AttestorIamBindingArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.binaryauthorization.AttestorIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamMember;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs;
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
   *         var member = new AttestorIamMember("member", AttestorIamMemberArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
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
   * # IAM policy for Binary Authorization Attestor
   * 
   * Three different resources help you manage your IAM policy for Binary Authorization Attestor. Each of these resources serves a different use case:
   * 
   * * `gcp.binaryauthorization.AttestorIamPolicy`: Authoritative. Sets the IAM policy for the attestor and replaces any existing policy already attached.
   * * `gcp.binaryauthorization.AttestorIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the attestor are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.binaryauthorization.AttestorIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the attestor are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.binaryauthorization.AttestorIamPolicy`: Retrieves the IAM policy for the attestor
   * 
   * &gt; **Note:** `gcp.binaryauthorization.AttestorIamPolicy` **cannot** be used in conjunction with `gcp.binaryauthorization.AttestorIamBinding` and `gcp.binaryauthorization.AttestorIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.binaryauthorization.AttestorIamBinding` resources **can be** used in conjunction with `gcp.binaryauthorization.AttestorIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.binaryauthorization.AttestorIamPolicy
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
   * import com.pulumi.gcp.binaryauthorization.AttestorIamPolicy;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs;
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
   *         var policy = new AttestorIamPolicy("policy", AttestorIamPolicyArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.binaryauthorization.AttestorIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamBinding;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs;
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
   *         var binding = new AttestorIamBinding("binding", AttestorIamBindingArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.binaryauthorization.AttestorIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamMember;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs;
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
   *         var member = new AttestorIamMember("member", AttestorIamMemberArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
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
   * * projects/{{project}}/attestors/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Binary Authorization attestor IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_binary_authorization_attestor_iam_member.editor &#34;projects/{{project}}/attestors/{{attestor}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_binary_authorization_attestor_iam_binding.editor &#34;projects/{{project}}/attestors/{{attestor}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:binaryauthorization/attestorIamBinding:AttestorIamBinding editor projects/{{project}}/attestors/{{attestor}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AttestorIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs.builder
    com.pulumi.gcp.binaryauthorization.AttestorIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Binary Authorization Attestor. Each of these resources serves a different use case:
   * 
   * * `gcp.binaryauthorization.AttestorIamPolicy`: Authoritative. Sets the IAM policy for the attestor and replaces any existing policy already attached.
   * * `gcp.binaryauthorization.AttestorIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the attestor are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.binaryauthorization.AttestorIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the attestor are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.binaryauthorization.AttestorIamPolicy`: Retrieves the IAM policy for the attestor
   * 
   * &gt; **Note:** `gcp.binaryauthorization.AttestorIamPolicy` **cannot** be used in conjunction with `gcp.binaryauthorization.AttestorIamBinding` and `gcp.binaryauthorization.AttestorIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.binaryauthorization.AttestorIamBinding` resources **can be** used in conjunction with `gcp.binaryauthorization.AttestorIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.binaryauthorization.AttestorIamPolicy
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
   * import com.pulumi.gcp.binaryauthorization.AttestorIamPolicy;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs;
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
   *         var policy = new AttestorIamPolicy("policy", AttestorIamPolicyArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.binaryauthorization.AttestorIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamBinding;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs;
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
   *         var binding = new AttestorIamBinding("binding", AttestorIamBindingArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.binaryauthorization.AttestorIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamMember;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs;
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
   *         var member = new AttestorIamMember("member", AttestorIamMemberArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
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
   * # IAM policy for Binary Authorization Attestor
   * 
   * Three different resources help you manage your IAM policy for Binary Authorization Attestor. Each of these resources serves a different use case:
   * 
   * * `gcp.binaryauthorization.AttestorIamPolicy`: Authoritative. Sets the IAM policy for the attestor and replaces any existing policy already attached.
   * * `gcp.binaryauthorization.AttestorIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the attestor are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.binaryauthorization.AttestorIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the attestor are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.binaryauthorization.AttestorIamPolicy`: Retrieves the IAM policy for the attestor
   * 
   * &gt; **Note:** `gcp.binaryauthorization.AttestorIamPolicy` **cannot** be used in conjunction with `gcp.binaryauthorization.AttestorIamBinding` and `gcp.binaryauthorization.AttestorIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.binaryauthorization.AttestorIamBinding` resources **can be** used in conjunction with `gcp.binaryauthorization.AttestorIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.binaryauthorization.AttestorIamPolicy
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
   * import com.pulumi.gcp.binaryauthorization.AttestorIamPolicy;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs;
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
   *         var policy = new AttestorIamPolicy("policy", AttestorIamPolicyArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.binaryauthorization.AttestorIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamBinding;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs;
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
   *         var binding = new AttestorIamBinding("binding", AttestorIamBindingArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.binaryauthorization.AttestorIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamMember;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs;
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
   *         var member = new AttestorIamMember("member", AttestorIamMemberArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
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
   * * projects/{{project}}/attestors/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Binary Authorization attestor IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_binary_authorization_attestor_iam_member.editor &#34;projects/{{project}}/attestors/{{attestor}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_binary_authorization_attestor_iam_binding.editor &#34;projects/{{project}}/attestors/{{attestor}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:binaryauthorization/attestorIamMember:AttestorIamMember editor projects/{{project}}/attestors/{{attestor}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AttestorIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs.builder
    com.pulumi.gcp.binaryauthorization.AttestorIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Binary Authorization Attestor. Each of these resources serves a different use case:
   * 
   * * `gcp.binaryauthorization.AttestorIamPolicy`: Authoritative. Sets the IAM policy for the attestor and replaces any existing policy already attached.
   * * `gcp.binaryauthorization.AttestorIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the attestor are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.binaryauthorization.AttestorIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the attestor are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.binaryauthorization.AttestorIamPolicy`: Retrieves the IAM policy for the attestor
   * 
   * &gt; **Note:** `gcp.binaryauthorization.AttestorIamPolicy` **cannot** be used in conjunction with `gcp.binaryauthorization.AttestorIamBinding` and `gcp.binaryauthorization.AttestorIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.binaryauthorization.AttestorIamBinding` resources **can be** used in conjunction with `gcp.binaryauthorization.AttestorIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.binaryauthorization.AttestorIamPolicy
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
   * import com.pulumi.gcp.binaryauthorization.AttestorIamPolicy;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs;
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
   *         var policy = new AttestorIamPolicy("policy", AttestorIamPolicyArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.binaryauthorization.AttestorIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamBinding;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs;
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
   *         var binding = new AttestorIamBinding("binding", AttestorIamBindingArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.binaryauthorization.AttestorIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamMember;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs;
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
   *         var member = new AttestorIamMember("member", AttestorIamMemberArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
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
   * # IAM policy for Binary Authorization Attestor
   * 
   * Three different resources help you manage your IAM policy for Binary Authorization Attestor. Each of these resources serves a different use case:
   * 
   * * `gcp.binaryauthorization.AttestorIamPolicy`: Authoritative. Sets the IAM policy for the attestor and replaces any existing policy already attached.
   * * `gcp.binaryauthorization.AttestorIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the attestor are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.binaryauthorization.AttestorIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the attestor are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.binaryauthorization.AttestorIamPolicy`: Retrieves the IAM policy for the attestor
   * 
   * &gt; **Note:** `gcp.binaryauthorization.AttestorIamPolicy` **cannot** be used in conjunction with `gcp.binaryauthorization.AttestorIamBinding` and `gcp.binaryauthorization.AttestorIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.binaryauthorization.AttestorIamBinding` resources **can be** used in conjunction with `gcp.binaryauthorization.AttestorIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.binaryauthorization.AttestorIamPolicy
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
   * import com.pulumi.gcp.binaryauthorization.AttestorIamPolicy;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs;
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
   *         var policy = new AttestorIamPolicy("policy", AttestorIamPolicyArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.binaryauthorization.AttestorIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamBinding;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs;
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
   *         var binding = new AttestorIamBinding("binding", AttestorIamBindingArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.binaryauthorization.AttestorIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamMember;
   * import com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs;
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
   *         var member = new AttestorIamMember("member", AttestorIamMemberArgs.builder()
   *             .project(attestor.get("project"))
   *             .attestor(attestor.get("name"))
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
   * * projects/{{project}}/attestors/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Binary Authorization attestor IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_binary_authorization_attestor_iam_member.editor &#34;projects/{{project}}/attestors/{{attestor}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_binary_authorization_attestor_iam_binding.editor &#34;projects/{{project}}/attestors/{{attestor}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:binaryauthorization/attestorIamPolicy:AttestorIamPolicy editor projects/{{project}}/attestors/{{attestor}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AttestorIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs.builder
    com.pulumi.gcp.binaryauthorization.AttestorIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object BinaryauthorizationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for attestor */
    inline def getAttestorIamPolicy(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.GetAttestorIamPolicyArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.binaryauthorization.outputs.GetAttestorIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.GetAttestorIamPolicyArgs.builder
      com.pulumi.gcp.binaryauthorization.BinaryauthorizationFunctions.getAttestorIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for attestor */
    inline def getAttestorIamPolicyPlain(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.GetAttestorIamPolicyPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.binaryauthorization.outputs.GetAttestorIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.GetAttestorIamPolicyPlainArgs.builder
      com.pulumi.gcp.binaryauthorization.BinaryauthorizationFunctions.getAttestorIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * A policy for container image binary authorization.
   * 
   * To get more information about Policy, see:
   * 
   * * [API documentation](https://cloud.google.com/binary-authorization/docs/reference/rest/)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/binary-authorization/)
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.binaryauthorization.PolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.binaryauthorization.PolicyArgs.builder
    com.pulumi.gcp.binaryauthorization.Policy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
