package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object dataproc:
  /** Describes an autoscaling policy for Dataproc cluster autoscaler. */
  def AutoscalingPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.AutoscalingPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.AutoscalingPolicyArgs.builder
    com.pulumi.gcp.dataproc.AutoscalingPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc AutoscalingPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.AutoscalingPolicyIamPolicy`: Authoritative. Sets the IAM policy for the autoscalingpolicy and replaces any existing policy already attached.
   * * `gcp.dataproc.AutoscalingPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the autoscalingpolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.AutoscalingPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the autoscalingpolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.AutoscalingPolicyIamPolicy`: Retrieves the IAM policy for the autoscalingpolicy
   * 
   * &gt; **Note:** `gcp.dataproc.AutoscalingPolicyIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.AutoscalingPolicyIamBinding` and `gcp.dataproc.AutoscalingPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.AutoscalingPolicyIamBinding` resources **can be** used in conjunction with `gcp.dataproc.AutoscalingPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamPolicy
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
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicy;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AutoscalingPolicyIamPolicy("policy", AutoscalingPolicyIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamBinding;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AutoscalingPolicyIamBinding("binding", AutoscalingPolicyIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamMember;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AutoscalingPolicyIamMember("member", AutoscalingPolicyIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
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
   * # IAM policy for Dataproc AutoscalingPolicy
   * 
   * Three different resources help you manage your IAM policy for Dataproc AutoscalingPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.AutoscalingPolicyIamPolicy`: Authoritative. Sets the IAM policy for the autoscalingpolicy and replaces any existing policy already attached.
   * * `gcp.dataproc.AutoscalingPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the autoscalingpolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.AutoscalingPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the autoscalingpolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.AutoscalingPolicyIamPolicy`: Retrieves the IAM policy for the autoscalingpolicy
   * 
   * &gt; **Note:** `gcp.dataproc.AutoscalingPolicyIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.AutoscalingPolicyIamBinding` and `gcp.dataproc.AutoscalingPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.AutoscalingPolicyIamBinding` resources **can be** used in conjunction with `gcp.dataproc.AutoscalingPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamPolicy
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
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicy;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AutoscalingPolicyIamPolicy("policy", AutoscalingPolicyIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamBinding;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AutoscalingPolicyIamBinding("binding", AutoscalingPolicyIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamMember;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AutoscalingPolicyIamMember("member", AutoscalingPolicyIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
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
   * * projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}}
   * * {{project}}/{{location}}/{{policy_id}}
   * * {{location}}/{{policy_id}}
   * * {{policy_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc autoscalingpolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_autoscaling_policy_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_autoscaling_policy_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/autoscalingPolicyIamBinding:AutoscalingPolicyIamBinding editor projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AutoscalingPolicyIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.AutoscalingPolicyIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.AutoscalingPolicyIamBindingArgs.builder
    com.pulumi.gcp.dataproc.AutoscalingPolicyIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc AutoscalingPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.AutoscalingPolicyIamPolicy`: Authoritative. Sets the IAM policy for the autoscalingpolicy and replaces any existing policy already attached.
   * * `gcp.dataproc.AutoscalingPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the autoscalingpolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.AutoscalingPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the autoscalingpolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.AutoscalingPolicyIamPolicy`: Retrieves the IAM policy for the autoscalingpolicy
   * 
   * &gt; **Note:** `gcp.dataproc.AutoscalingPolicyIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.AutoscalingPolicyIamBinding` and `gcp.dataproc.AutoscalingPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.AutoscalingPolicyIamBinding` resources **can be** used in conjunction with `gcp.dataproc.AutoscalingPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamPolicy
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
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicy;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AutoscalingPolicyIamPolicy("policy", AutoscalingPolicyIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamBinding;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AutoscalingPolicyIamBinding("binding", AutoscalingPolicyIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamMember;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AutoscalingPolicyIamMember("member", AutoscalingPolicyIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
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
   * # IAM policy for Dataproc AutoscalingPolicy
   * 
   * Three different resources help you manage your IAM policy for Dataproc AutoscalingPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.AutoscalingPolicyIamPolicy`: Authoritative. Sets the IAM policy for the autoscalingpolicy and replaces any existing policy already attached.
   * * `gcp.dataproc.AutoscalingPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the autoscalingpolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.AutoscalingPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the autoscalingpolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.AutoscalingPolicyIamPolicy`: Retrieves the IAM policy for the autoscalingpolicy
   * 
   * &gt; **Note:** `gcp.dataproc.AutoscalingPolicyIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.AutoscalingPolicyIamBinding` and `gcp.dataproc.AutoscalingPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.AutoscalingPolicyIamBinding` resources **can be** used in conjunction with `gcp.dataproc.AutoscalingPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamPolicy
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
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicy;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AutoscalingPolicyIamPolicy("policy", AutoscalingPolicyIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamBinding;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AutoscalingPolicyIamBinding("binding", AutoscalingPolicyIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamMember;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AutoscalingPolicyIamMember("member", AutoscalingPolicyIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
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
   * * projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}}
   * * {{project}}/{{location}}/{{policy_id}}
   * * {{location}}/{{policy_id}}
   * * {{policy_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc autoscalingpolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_autoscaling_policy_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_autoscaling_policy_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/autoscalingPolicyIamMember:AutoscalingPolicyIamMember editor projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AutoscalingPolicyIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.AutoscalingPolicyIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.AutoscalingPolicyIamMemberArgs.builder
    com.pulumi.gcp.dataproc.AutoscalingPolicyIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc AutoscalingPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.AutoscalingPolicyIamPolicy`: Authoritative. Sets the IAM policy for the autoscalingpolicy and replaces any existing policy already attached.
   * * `gcp.dataproc.AutoscalingPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the autoscalingpolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.AutoscalingPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the autoscalingpolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.AutoscalingPolicyIamPolicy`: Retrieves the IAM policy for the autoscalingpolicy
   * 
   * &gt; **Note:** `gcp.dataproc.AutoscalingPolicyIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.AutoscalingPolicyIamBinding` and `gcp.dataproc.AutoscalingPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.AutoscalingPolicyIamBinding` resources **can be** used in conjunction with `gcp.dataproc.AutoscalingPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamPolicy
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
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicy;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AutoscalingPolicyIamPolicy("policy", AutoscalingPolicyIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamBinding;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AutoscalingPolicyIamBinding("binding", AutoscalingPolicyIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamMember;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AutoscalingPolicyIamMember("member", AutoscalingPolicyIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
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
   * # IAM policy for Dataproc AutoscalingPolicy
   * 
   * Three different resources help you manage your IAM policy for Dataproc AutoscalingPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.AutoscalingPolicyIamPolicy`: Authoritative. Sets the IAM policy for the autoscalingpolicy and replaces any existing policy already attached.
   * * `gcp.dataproc.AutoscalingPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the autoscalingpolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.AutoscalingPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the autoscalingpolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.AutoscalingPolicyIamPolicy`: Retrieves the IAM policy for the autoscalingpolicy
   * 
   * &gt; **Note:** `gcp.dataproc.AutoscalingPolicyIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.AutoscalingPolicyIamBinding` and `gcp.dataproc.AutoscalingPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.AutoscalingPolicyIamBinding` resources **can be** used in conjunction with `gcp.dataproc.AutoscalingPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamPolicy
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
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicy;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AutoscalingPolicyIamPolicy("policy", AutoscalingPolicyIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamBinding;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AutoscalingPolicyIamBinding("binding", AutoscalingPolicyIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.AutoscalingPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamMember;
   * import com.pulumi.gcp.dataproc.AutoscalingPolicyIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AutoscalingPolicyIamMember("member", AutoscalingPolicyIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .policyId(basic.get("policyId"))
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
   * * projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}}
   * * {{project}}/{{location}}/{{policy_id}}
   * * {{location}}/{{policy_id}}
   * * {{policy_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc autoscalingpolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_autoscaling_policy_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_autoscaling_policy_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/autoscalingPolicyIamPolicy:AutoscalingPolicyIamPolicy editor projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AutoscalingPolicyIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicyArgs.builder
    com.pulumi.gcp.dataproc.AutoscalingPolicyIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Dataproc Serverless Batches lets you run Spark workloads without requiring you to
   * provision and manage your own Dataproc cluster.
   * 
   * To get more information about Batch, see:
   * 
   * * [API documentation](https://cloud.google.com/dataproc-serverless/docs/reference/rest/v1/projects.locations.batches)
   * * How-to Guides
   *     * [Dataproc Serverless Batches Intro](https://cloud.google.com/dataproc-serverless/docs/overview)
   */
  def Batch(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.BatchArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.BatchArgs.builder
    com.pulumi.gcp.dataproc.Batch(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Cloud Dataproc cluster resource within GCP.
   * 
   * * [API documentation](https://cloud.google.com/dataproc/docs/reference/rest/v1/projects.regions.clusters)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dataproc/docs)
   * 
   * &gt; **Warning:** Due to limitations of the API, all arguments except
   * `labels`,`cluster_config.worker_config.num_instances` and `cluster_config.preemptible_worker_config.num_instances` are non-updatable. Changing `cluster_config.worker_config.min_num_instances` will be ignored. Changing others will cause recreation of the
   * whole cluster!
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataproc.ClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataproc.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage IAM policies on dataproc clusters. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.ClusterIAMPolicy`: Authoritative. Sets the IAM policy for the cluster and replaces any existing policy already attached.
   * * `gcp.dataproc.ClusterIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the cluster are preserved.
   * * `gcp.dataproc.ClusterIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the cluster are preserved.
   * 
   * &gt; **Note:** `gcp.dataproc.ClusterIAMPolicy` **cannot** be used in conjunction with `gcp.dataproc.ClusterIAMBinding` and `gcp.dataproc.ClusterIAMMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the cluster as `gcp.dataproc.ClusterIAMPolicy` replaces the entire policy.
   * 
   * &gt; **Note:** `gcp.dataproc.ClusterIAMBinding` resources **can be** used in conjunction with `gcp.dataproc.ClusterIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.ClusterIAMPolicy
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
   * import com.pulumi.gcp.dataproc.ClusterIAMPolicy;
   * import com.pulumi.gcp.dataproc.ClusterIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var editor = new ClusterIAMPolicy("editor", ClusterIAMPolicyArgs.builder()
   *             .project("your-project")
   *             .region("your-region")
   *             .cluster("your-dataproc-cluster")
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.ClusterIAMBinding;
   * import com.pulumi.gcp.dataproc.ClusterIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new ClusterIAMBinding("editor", ClusterIAMBindingArgs.builder()
   *             .cluster("your-dataproc-cluster")
   *             .role("roles/editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.ClusterIAMMember;
   * import com.pulumi.gcp.dataproc.ClusterIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new ClusterIAMMember("editor", ClusterIAMMemberArgs.builder()
   *             .cluster("your-dataproc-cluster")
   *             .role("roles/editor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMPolicy
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
   * import com.pulumi.gcp.dataproc.ClusterIAMPolicy;
   * import com.pulumi.gcp.dataproc.ClusterIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var editor = new ClusterIAMPolicy("editor", ClusterIAMPolicyArgs.builder()
   *             .project("your-project")
   *             .region("your-region")
   *             .cluster("your-dataproc-cluster")
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.ClusterIAMBinding;
   * import com.pulumi.gcp.dataproc.ClusterIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new ClusterIAMBinding("editor", ClusterIAMBindingArgs.builder()
   *             .cluster("your-dataproc-cluster")
   *             .role("roles/editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.ClusterIAMMember;
   * import com.pulumi.gcp.dataproc.ClusterIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new ClusterIAMMember("editor", ClusterIAMMemberArgs.builder()
   *             .cluster("your-dataproc-cluster")
   *             .role("roles/editor")
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
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ClusterIAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.ClusterIAMBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.ClusterIAMBindingArgs.builder
    com.pulumi.gcp.dataproc.ClusterIAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage IAM policies on dataproc clusters. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.ClusterIAMPolicy`: Authoritative. Sets the IAM policy for the cluster and replaces any existing policy already attached.
   * * `gcp.dataproc.ClusterIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the cluster are preserved.
   * * `gcp.dataproc.ClusterIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the cluster are preserved.
   * 
   * &gt; **Note:** `gcp.dataproc.ClusterIAMPolicy` **cannot** be used in conjunction with `gcp.dataproc.ClusterIAMBinding` and `gcp.dataproc.ClusterIAMMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the cluster as `gcp.dataproc.ClusterIAMPolicy` replaces the entire policy.
   * 
   * &gt; **Note:** `gcp.dataproc.ClusterIAMBinding` resources **can be** used in conjunction with `gcp.dataproc.ClusterIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.ClusterIAMPolicy
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
   * import com.pulumi.gcp.dataproc.ClusterIAMPolicy;
   * import com.pulumi.gcp.dataproc.ClusterIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var editor = new ClusterIAMPolicy("editor", ClusterIAMPolicyArgs.builder()
   *             .project("your-project")
   *             .region("your-region")
   *             .cluster("your-dataproc-cluster")
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.ClusterIAMBinding;
   * import com.pulumi.gcp.dataproc.ClusterIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new ClusterIAMBinding("editor", ClusterIAMBindingArgs.builder()
   *             .cluster("your-dataproc-cluster")
   *             .role("roles/editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.ClusterIAMMember;
   * import com.pulumi.gcp.dataproc.ClusterIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new ClusterIAMMember("editor", ClusterIAMMemberArgs.builder()
   *             .cluster("your-dataproc-cluster")
   *             .role("roles/editor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMPolicy
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
   * import com.pulumi.gcp.dataproc.ClusterIAMPolicy;
   * import com.pulumi.gcp.dataproc.ClusterIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var editor = new ClusterIAMPolicy("editor", ClusterIAMPolicyArgs.builder()
   *             .project("your-project")
   *             .region("your-region")
   *             .cluster("your-dataproc-cluster")
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.ClusterIAMBinding;
   * import com.pulumi.gcp.dataproc.ClusterIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new ClusterIAMBinding("editor", ClusterIAMBindingArgs.builder()
   *             .cluster("your-dataproc-cluster")
   *             .role("roles/editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.ClusterIAMMember;
   * import com.pulumi.gcp.dataproc.ClusterIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new ClusterIAMMember("editor", ClusterIAMMemberArgs.builder()
   *             .cluster("your-dataproc-cluster")
   *             .role("roles/editor")
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
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ClusterIAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.ClusterIAMMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.ClusterIAMMemberArgs.builder
    com.pulumi.gcp.dataproc.ClusterIAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage IAM policies on dataproc clusters. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.ClusterIAMPolicy`: Authoritative. Sets the IAM policy for the cluster and replaces any existing policy already attached.
   * * `gcp.dataproc.ClusterIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the cluster are preserved.
   * * `gcp.dataproc.ClusterIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the cluster are preserved.
   * 
   * &gt; **Note:** `gcp.dataproc.ClusterIAMPolicy` **cannot** be used in conjunction with `gcp.dataproc.ClusterIAMBinding` and `gcp.dataproc.ClusterIAMMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the cluster as `gcp.dataproc.ClusterIAMPolicy` replaces the entire policy.
   * 
   * &gt; **Note:** `gcp.dataproc.ClusterIAMBinding` resources **can be** used in conjunction with `gcp.dataproc.ClusterIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.ClusterIAMPolicy
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
   * import com.pulumi.gcp.dataproc.ClusterIAMPolicy;
   * import com.pulumi.gcp.dataproc.ClusterIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var editor = new ClusterIAMPolicy("editor", ClusterIAMPolicyArgs.builder()
   *             .project("your-project")
   *             .region("your-region")
   *             .cluster("your-dataproc-cluster")
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.ClusterIAMBinding;
   * import com.pulumi.gcp.dataproc.ClusterIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new ClusterIAMBinding("editor", ClusterIAMBindingArgs.builder()
   *             .cluster("your-dataproc-cluster")
   *             .role("roles/editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.ClusterIAMMember;
   * import com.pulumi.gcp.dataproc.ClusterIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new ClusterIAMMember("editor", ClusterIAMMemberArgs.builder()
   *             .cluster("your-dataproc-cluster")
   *             .role("roles/editor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMPolicy
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
   * import com.pulumi.gcp.dataproc.ClusterIAMPolicy;
   * import com.pulumi.gcp.dataproc.ClusterIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var editor = new ClusterIAMPolicy("editor", ClusterIAMPolicyArgs.builder()
   *             .project("your-project")
   *             .region("your-region")
   *             .cluster("your-dataproc-cluster")
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.ClusterIAMBinding;
   * import com.pulumi.gcp.dataproc.ClusterIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new ClusterIAMBinding("editor", ClusterIAMBindingArgs.builder()
   *             .cluster("your-dataproc-cluster")
   *             .role("roles/editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.ClusterIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.ClusterIAMMember;
   * import com.pulumi.gcp.dataproc.ClusterIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new ClusterIAMMember("editor", ClusterIAMMemberArgs.builder()
   *             .cluster("your-dataproc-cluster")
   *             .role("roles/editor")
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
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ClusterIAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.ClusterIAMPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.ClusterIAMPolicyArgs.builder
    com.pulumi.gcp.dataproc.ClusterIAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object DataprocFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for autoscalingpolicy */
    inline def getAutoscalingPolicyIamPolicy(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetAutoscalingPolicyIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataproc.outputs.GetAutoscalingPolicyIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetAutoscalingPolicyIamPolicyArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getAutoscalingPolicyIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for autoscalingpolicy */
    inline def getAutoscalingPolicyIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetAutoscalingPolicyIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataproc.outputs.GetAutoscalingPolicyIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetAutoscalingPolicyIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getAutoscalingPolicyIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Dataproc cluster.
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
     * import com.pulumi.gcp.dataproc.DataprocFunctions;
     * import com.pulumi.gcp.dataproc.inputs.GetClusterIamPolicyArgs;
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
     *         final var policy = DataprocFunctions.getClusterIamPolicy(GetClusterIamPolicyArgs.builder()
     *             .cluster(cluster.get("name"))
     *             .region("us-central1")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     */
    inline def getClusterIamPolicy(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetClusterIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataproc.outputs.GetClusterIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetClusterIamPolicyArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getClusterIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Dataproc cluster.
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
     * import com.pulumi.gcp.dataproc.DataprocFunctions;
     * import com.pulumi.gcp.dataproc.inputs.GetClusterIamPolicyArgs;
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
     *         final var policy = DataprocFunctions.getClusterIamPolicy(GetClusterIamPolicyArgs.builder()
     *             .cluster(cluster.get("name"))
     *             .region("us-central1")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     */
    inline def getClusterIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetClusterIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataproc.outputs.GetClusterIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetClusterIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getClusterIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Dataproc job.
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
     * import com.pulumi.gcp.dataproc.DataprocFunctions;
     * import com.pulumi.gcp.dataproc.inputs.GetJobIamPolicyArgs;
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
     *         final var policy = DataprocFunctions.getJobIamPolicy(GetJobIamPolicyArgs.builder()
     *             .jobId(pyspark.get("reference")[0].get("jobId"))
     *             .region("us-central1")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     */
    inline def getJobIamPolicy(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetJobIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataproc.outputs.GetJobIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetJobIamPolicyArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getJobIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Dataproc job.
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
     * import com.pulumi.gcp.dataproc.DataprocFunctions;
     * import com.pulumi.gcp.dataproc.inputs.GetJobIamPolicyArgs;
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
     *         final var policy = DataprocFunctions.getJobIamPolicy(GetJobIamPolicyArgs.builder()
     *             .jobId(pyspark.get("reference")[0].get("jobId"))
     *             .region("us-central1")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     */
    inline def getJobIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetJobIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataproc.outputs.GetJobIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetJobIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getJobIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for database */
    inline def getMetastoreDatabaseIamPolicy(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetMetastoreDatabaseIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataproc.outputs.GetMetastoreDatabaseIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetMetastoreDatabaseIamPolicyArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getMetastoreDatabaseIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for database */
    inline def getMetastoreDatabaseIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetMetastoreDatabaseIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataproc.outputs.GetMetastoreDatabaseIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetMetastoreDatabaseIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getMetastoreDatabaseIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for federation */
    inline def getMetastoreFederationIamPolicy(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetMetastoreFederationIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataproc.outputs.GetMetastoreFederationIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetMetastoreFederationIamPolicyArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getMetastoreFederationIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for federation */
    inline def getMetastoreFederationIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetMetastoreFederationIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataproc.outputs.GetMetastoreFederationIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetMetastoreFederationIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getMetastoreFederationIamPolicyPlain(args(argsBuilder).build)

    /** Get a Dataproc Metastore service from Google Cloud by its id and location. */
    inline def getMetastoreService(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetMetastoreServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataproc.outputs.GetMetastoreServiceResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetMetastoreServiceArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getMetastoreService(args(argsBuilder).build)

    /** Get a Dataproc Metastore service from Google Cloud by its id and location. */
    inline def getMetastoreServicePlain(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetMetastoreServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataproc.outputs.GetMetastoreServiceResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetMetastoreServicePlainArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getMetastoreServicePlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for service */
    inline def getMetastoreServiceIamPolicy(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetMetastoreServiceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataproc.outputs.GetMetastoreServiceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetMetastoreServiceIamPolicyArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getMetastoreServiceIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for service */
    inline def getMetastoreServiceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetMetastoreServiceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataproc.outputs.GetMetastoreServiceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetMetastoreServiceIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getMetastoreServiceIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for table */
    inline def getMetastoreTableIamPolicy(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetMetastoreTableIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataproc.outputs.GetMetastoreTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetMetastoreTableIamPolicyArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getMetastoreTableIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for table */
    inline def getMetastoreTableIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataproc.inputs.GetMetastoreTableIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataproc.outputs.GetMetastoreTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataproc.inputs.GetMetastoreTableIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataproc.DataprocFunctions.getMetastoreTableIamPolicyPlain(args(argsBuilder).build)

  /**
   * An ApplicationEnvironment contains shared configuration that may be referenced by multiple SparkApplications.
   * 
   * To get more information about ApplicationEnvironment, see:
   * 
   * * [API documentation](https://cloud.google.com/dataproc-gdc/docs/reference/rest/v1/projects.locations.applicationEnvironments)
   * * How-to Guides
   *     * [Dataproc Intro](https://cloud.google.com/dataproc/)
   */
  def GdcApplicationEnvironment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.GdcApplicationEnvironmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.GdcApplicationEnvironmentArgs.builder
    com.pulumi.gcp.dataproc.GdcApplicationEnvironment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A service instance is an instance of the Dataproc operator running on a GDC cluster.
   * 
   * To get more information about ServiceInstance, see:
   * 
   * * [API documentation](https://cloud.google.com/dataproc-gdc/docs/reference/rest/v1/projects.locations.serviceInstances)
   * * How-to Guides
   *     * [Dataproc Intro](https://cloud.google.com/dataproc/)
   */
  def GdcServiceInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.GdcServiceInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.GdcServiceInstanceArgs.builder
    com.pulumi.gcp.dataproc.GdcServiceInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A Spark application is a single Spark workload run on a GDC cluster.
   * 
   * To get more information about SparkApplication, see:
   * 
   * * [API documentation](https://cloud.google.com/dataproc-gdc/docs/reference/rest/v1/projects.locations.serviceInstances.sparkApplications)
   * * How-to Guides
   *     * [Dataproc Intro](https://cloud.google.com/dataproc/)
   */
  def GdcSparkApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.GdcSparkApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.GdcSparkApplicationArgs.builder
    com.pulumi.gcp.dataproc.GdcSparkApplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a job resource within a Dataproc cluster within GCE. For more information see
   * [the official dataproc documentation](https://cloud.google.com/dataproc/).
   * 
   * &gt; **Note:** This resource does not support &#39;update&#39; and changing any attributes will cause the resource to be recreated.
   */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.JobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.JobArgs.builder
    com.pulumi.gcp.dataproc.Job(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage IAM policies on dataproc jobs. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.JobIAMPolicy`: Authoritative. Sets the IAM policy for the job and replaces any existing policy already attached.
   * * `gcp.dataproc.JobIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the job are preserved.
   * * `gcp.dataproc.JobIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the job are preserved.
   * 
   * &gt; **Note:** `gcp.dataproc.JobIAMPolicy` **cannot** be used in conjunction with `gcp.dataproc.JobIAMBinding` and `gcp.dataproc.JobIAMMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the job as `gcp.dataproc.JobIAMPolicy` replaces the entire policy.
   * 
   * &gt; **Note:** `gcp.dataproc.JobIAMBinding` resources **can be** used in conjunction with `gcp.dataproc.JobIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.JobIAMPolicy
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
   * import com.pulumi.gcp.dataproc.JobIAMPolicy;
   * import com.pulumi.gcp.dataproc.JobIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var editor = new JobIAMPolicy("editor", JobIAMPolicyArgs.builder()
   *             .project("your-project")
   *             .region("your-region")
   *             .jobId("your-dataproc-job")
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.JobIAMBinding;
   * import com.pulumi.gcp.dataproc.JobIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new JobIAMBinding("editor", JobIAMBindingArgs.builder()
   *             .jobId("your-dataproc-job")
   *             .role("roles/editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.JobIAMMember;
   * import com.pulumi.gcp.dataproc.JobIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new JobIAMMember("editor", JobIAMMemberArgs.builder()
   *             .jobId("your-dataproc-job")
   *             .role("roles/editor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMPolicy
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
   * import com.pulumi.gcp.dataproc.JobIAMPolicy;
   * import com.pulumi.gcp.dataproc.JobIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var editor = new JobIAMPolicy("editor", JobIAMPolicyArgs.builder()
   *             .project("your-project")
   *             .region("your-region")
   *             .jobId("your-dataproc-job")
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.JobIAMBinding;
   * import com.pulumi.gcp.dataproc.JobIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new JobIAMBinding("editor", JobIAMBindingArgs.builder()
   *             .jobId("your-dataproc-job")
   *             .role("roles/editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.JobIAMMember;
   * import com.pulumi.gcp.dataproc.JobIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new JobIAMMember("editor", JobIAMMemberArgs.builder()
   *             .jobId("your-dataproc-job")
   *             .role("roles/editor")
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
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def JobIAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.JobIAMBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.JobIAMBindingArgs.builder
    com.pulumi.gcp.dataproc.JobIAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage IAM policies on dataproc jobs. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.JobIAMPolicy`: Authoritative. Sets the IAM policy for the job and replaces any existing policy already attached.
   * * `gcp.dataproc.JobIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the job are preserved.
   * * `gcp.dataproc.JobIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the job are preserved.
   * 
   * &gt; **Note:** `gcp.dataproc.JobIAMPolicy` **cannot** be used in conjunction with `gcp.dataproc.JobIAMBinding` and `gcp.dataproc.JobIAMMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the job as `gcp.dataproc.JobIAMPolicy` replaces the entire policy.
   * 
   * &gt; **Note:** `gcp.dataproc.JobIAMBinding` resources **can be** used in conjunction with `gcp.dataproc.JobIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.JobIAMPolicy
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
   * import com.pulumi.gcp.dataproc.JobIAMPolicy;
   * import com.pulumi.gcp.dataproc.JobIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var editor = new JobIAMPolicy("editor", JobIAMPolicyArgs.builder()
   *             .project("your-project")
   *             .region("your-region")
   *             .jobId("your-dataproc-job")
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.JobIAMBinding;
   * import com.pulumi.gcp.dataproc.JobIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new JobIAMBinding("editor", JobIAMBindingArgs.builder()
   *             .jobId("your-dataproc-job")
   *             .role("roles/editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.JobIAMMember;
   * import com.pulumi.gcp.dataproc.JobIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new JobIAMMember("editor", JobIAMMemberArgs.builder()
   *             .jobId("your-dataproc-job")
   *             .role("roles/editor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMPolicy
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
   * import com.pulumi.gcp.dataproc.JobIAMPolicy;
   * import com.pulumi.gcp.dataproc.JobIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var editor = new JobIAMPolicy("editor", JobIAMPolicyArgs.builder()
   *             .project("your-project")
   *             .region("your-region")
   *             .jobId("your-dataproc-job")
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.JobIAMBinding;
   * import com.pulumi.gcp.dataproc.JobIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new JobIAMBinding("editor", JobIAMBindingArgs.builder()
   *             .jobId("your-dataproc-job")
   *             .role("roles/editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.JobIAMMember;
   * import com.pulumi.gcp.dataproc.JobIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new JobIAMMember("editor", JobIAMMemberArgs.builder()
   *             .jobId("your-dataproc-job")
   *             .role("roles/editor")
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
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def JobIAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.JobIAMMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.JobIAMMemberArgs.builder
    com.pulumi.gcp.dataproc.JobIAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage IAM policies on dataproc jobs. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.JobIAMPolicy`: Authoritative. Sets the IAM policy for the job and replaces any existing policy already attached.
   * * `gcp.dataproc.JobIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the job are preserved.
   * * `gcp.dataproc.JobIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the job are preserved.
   * 
   * &gt; **Note:** `gcp.dataproc.JobIAMPolicy` **cannot** be used in conjunction with `gcp.dataproc.JobIAMBinding` and `gcp.dataproc.JobIAMMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the job as `gcp.dataproc.JobIAMPolicy` replaces the entire policy.
   * 
   * &gt; **Note:** `gcp.dataproc.JobIAMBinding` resources **can be** used in conjunction with `gcp.dataproc.JobIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.JobIAMPolicy
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
   * import com.pulumi.gcp.dataproc.JobIAMPolicy;
   * import com.pulumi.gcp.dataproc.JobIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var editor = new JobIAMPolicy("editor", JobIAMPolicyArgs.builder()
   *             .project("your-project")
   *             .region("your-region")
   *             .jobId("your-dataproc-job")
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.JobIAMBinding;
   * import com.pulumi.gcp.dataproc.JobIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new JobIAMBinding("editor", JobIAMBindingArgs.builder()
   *             .jobId("your-dataproc-job")
   *             .role("roles/editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.JobIAMMember;
   * import com.pulumi.gcp.dataproc.JobIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new JobIAMMember("editor", JobIAMMemberArgs.builder()
   *             .jobId("your-dataproc-job")
   *             .role("roles/editor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMPolicy
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
   * import com.pulumi.gcp.dataproc.JobIAMPolicy;
   * import com.pulumi.gcp.dataproc.JobIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var editor = new JobIAMPolicy("editor", JobIAMPolicyArgs.builder()
   *             .project("your-project")
   *             .region("your-region")
   *             .jobId("your-dataproc-job")
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.JobIAMBinding;
   * import com.pulumi.gcp.dataproc.JobIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new JobIAMBinding("editor", JobIAMBindingArgs.builder()
   *             .jobId("your-dataproc-job")
   *             .role("roles/editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.JobIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.JobIAMMember;
   * import com.pulumi.gcp.dataproc.JobIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var editor = new JobIAMMember("editor", JobIAMMemberArgs.builder()
   *             .jobId("your-dataproc-job")
   *             .role("roles/editor")
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
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def JobIAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.JobIAMPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.JobIAMPolicyArgs.builder
    com.pulumi.gcp.dataproc.JobIAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc Metastore Database. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreDatabaseIamPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreDatabaseIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreDatabaseIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreDatabaseIamPolicy`: Retrieves the IAM policy for the database
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreDatabaseIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreDatabaseIamBinding` and `gcp.dataproc.MetastoreDatabaseIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreDatabaseIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreDatabaseIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreDatabaseIamPolicy("policy", MetastoreDatabaseIamPolicyArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreDatabaseIamBinding("binding", MetastoreDatabaseIamBindingArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreDatabaseIamMember("member", MetastoreDatabaseIamMemberArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
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
   * # IAM policy for Dataproc Metastore Database
   * 
   * Three different resources help you manage your IAM policy for Dataproc Metastore Database. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreDatabaseIamPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreDatabaseIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreDatabaseIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreDatabaseIamPolicy`: Retrieves the IAM policy for the database
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreDatabaseIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreDatabaseIamBinding` and `gcp.dataproc.MetastoreDatabaseIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreDatabaseIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreDatabaseIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreDatabaseIamPolicy("policy", MetastoreDatabaseIamPolicyArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreDatabaseIamBinding("binding", MetastoreDatabaseIamBindingArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreDatabaseIamMember("member", MetastoreDatabaseIamMemberArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
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
   * * projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{name}}
   * * {{project}}/{{location}}/{{serviceId}}/{{name}}
   * * {{location}}/{{serviceId}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc Metastore database IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_database_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{database}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_database_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{database}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/metastoreDatabaseIamBinding:MetastoreDatabaseIamBinding editor projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{database}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MetastoreDatabaseIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreDatabaseIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreDatabaseIamBindingArgs.builder
    com.pulumi.gcp.dataproc.MetastoreDatabaseIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc Metastore Database. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreDatabaseIamPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreDatabaseIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreDatabaseIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreDatabaseIamPolicy`: Retrieves the IAM policy for the database
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreDatabaseIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreDatabaseIamBinding` and `gcp.dataproc.MetastoreDatabaseIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreDatabaseIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreDatabaseIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreDatabaseIamPolicy("policy", MetastoreDatabaseIamPolicyArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreDatabaseIamBinding("binding", MetastoreDatabaseIamBindingArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreDatabaseIamMember("member", MetastoreDatabaseIamMemberArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
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
   * # IAM policy for Dataproc Metastore Database
   * 
   * Three different resources help you manage your IAM policy for Dataproc Metastore Database. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreDatabaseIamPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreDatabaseIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreDatabaseIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreDatabaseIamPolicy`: Retrieves the IAM policy for the database
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreDatabaseIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreDatabaseIamBinding` and `gcp.dataproc.MetastoreDatabaseIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreDatabaseIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreDatabaseIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreDatabaseIamPolicy("policy", MetastoreDatabaseIamPolicyArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreDatabaseIamBinding("binding", MetastoreDatabaseIamBindingArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreDatabaseIamMember("member", MetastoreDatabaseIamMemberArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
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
   * * projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{name}}
   * * {{project}}/{{location}}/{{serviceId}}/{{name}}
   * * {{location}}/{{serviceId}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc Metastore database IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_database_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{database}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_database_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{database}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/metastoreDatabaseIamMember:MetastoreDatabaseIamMember editor projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{database}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MetastoreDatabaseIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreDatabaseIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreDatabaseIamMemberArgs.builder
    com.pulumi.gcp.dataproc.MetastoreDatabaseIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc Metastore Database. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreDatabaseIamPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreDatabaseIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreDatabaseIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreDatabaseIamPolicy`: Retrieves the IAM policy for the database
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreDatabaseIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreDatabaseIamBinding` and `gcp.dataproc.MetastoreDatabaseIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreDatabaseIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreDatabaseIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreDatabaseIamPolicy("policy", MetastoreDatabaseIamPolicyArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreDatabaseIamBinding("binding", MetastoreDatabaseIamBindingArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreDatabaseIamMember("member", MetastoreDatabaseIamMemberArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
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
   * # IAM policy for Dataproc Metastore Database
   * 
   * Three different resources help you manage your IAM policy for Dataproc Metastore Database. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreDatabaseIamPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreDatabaseIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreDatabaseIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreDatabaseIamPolicy`: Retrieves the IAM policy for the database
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreDatabaseIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreDatabaseIamBinding` and `gcp.dataproc.MetastoreDatabaseIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreDatabaseIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreDatabaseIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreDatabaseIamPolicy("policy", MetastoreDatabaseIamPolicyArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreDatabaseIamBinding("binding", MetastoreDatabaseIamBindingArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreDatabaseIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreDatabaseIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreDatabaseIamMember("member", MetastoreDatabaseIamMemberArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .database(hive.get("hiveConfig")[0].get("properties").get("database"))
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
   * * projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{name}}
   * * {{project}}/{{location}}/{{serviceId}}/{{name}}
   * * {{location}}/{{serviceId}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc Metastore database IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_database_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{database}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_database_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{database}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/metastoreDatabaseIamPolicy:MetastoreDatabaseIamPolicy editor projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{database}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MetastoreDatabaseIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicyArgs.builder
    com.pulumi.gcp.dataproc.MetastoreDatabaseIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A managed metastore federation. */
  def MetastoreFederation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreFederationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreFederationArgs.builder
    com.pulumi.gcp.dataproc.MetastoreFederation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc Metastore Federation. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreFederationIamPolicy`: Authoritative. Sets the IAM policy for the federation and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreFederationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the federation are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreFederationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the federation are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreFederationIamPolicy`: Retrieves the IAM policy for the federation
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreFederationIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreFederationIamBinding` and `gcp.dataproc.MetastoreFederationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreFederationIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreFederationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreFederationIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreFederationIamPolicy("policy", MetastoreFederationIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreFederationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreFederationIamBinding("binding", MetastoreFederationIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreFederationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreFederationIamMember("member", MetastoreFederationIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
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
   * # IAM policy for Dataproc Metastore Federation
   * 
   * Three different resources help you manage your IAM policy for Dataproc Metastore Federation. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreFederationIamPolicy`: Authoritative. Sets the IAM policy for the federation and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreFederationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the federation are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreFederationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the federation are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreFederationIamPolicy`: Retrieves the IAM policy for the federation
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreFederationIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreFederationIamBinding` and `gcp.dataproc.MetastoreFederationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreFederationIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreFederationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreFederationIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreFederationIamPolicy("policy", MetastoreFederationIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreFederationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreFederationIamBinding("binding", MetastoreFederationIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreFederationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreFederationIamMember("member", MetastoreFederationIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
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
   * * projects/{{project}}/locations/{{location}}/federations/{{federation_id}}
   * * {{project}}/{{location}}/{{federation_id}}
   * * {{location}}/{{federation_id}}
   * * {{federation_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc Metastore federation IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_federation_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/federations/{{federation_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_federation_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/federations/{{federation_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/metastoreFederationIamBinding:MetastoreFederationIamBinding editor projects/{{project}}/locations/{{location}}/federations/{{federation_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MetastoreFederationIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreFederationIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreFederationIamBindingArgs.builder
    com.pulumi.gcp.dataproc.MetastoreFederationIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc Metastore Federation. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreFederationIamPolicy`: Authoritative. Sets the IAM policy for the federation and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreFederationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the federation are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreFederationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the federation are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreFederationIamPolicy`: Retrieves the IAM policy for the federation
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreFederationIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreFederationIamBinding` and `gcp.dataproc.MetastoreFederationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreFederationIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreFederationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreFederationIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreFederationIamPolicy("policy", MetastoreFederationIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreFederationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreFederationIamBinding("binding", MetastoreFederationIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreFederationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreFederationIamMember("member", MetastoreFederationIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
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
   * # IAM policy for Dataproc Metastore Federation
   * 
   * Three different resources help you manage your IAM policy for Dataproc Metastore Federation. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreFederationIamPolicy`: Authoritative. Sets the IAM policy for the federation and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreFederationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the federation are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreFederationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the federation are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreFederationIamPolicy`: Retrieves the IAM policy for the federation
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreFederationIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreFederationIamBinding` and `gcp.dataproc.MetastoreFederationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreFederationIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreFederationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreFederationIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreFederationIamPolicy("policy", MetastoreFederationIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreFederationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreFederationIamBinding("binding", MetastoreFederationIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreFederationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreFederationIamMember("member", MetastoreFederationIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
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
   * * projects/{{project}}/locations/{{location}}/federations/{{federation_id}}
   * * {{project}}/{{location}}/{{federation_id}}
   * * {{location}}/{{federation_id}}
   * * {{federation_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc Metastore federation IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_federation_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/federations/{{federation_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_federation_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/federations/{{federation_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/metastoreFederationIamMember:MetastoreFederationIamMember editor projects/{{project}}/locations/{{location}}/federations/{{federation_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MetastoreFederationIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreFederationIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreFederationIamMemberArgs.builder
    com.pulumi.gcp.dataproc.MetastoreFederationIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc Metastore Federation. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreFederationIamPolicy`: Authoritative. Sets the IAM policy for the federation and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreFederationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the federation are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreFederationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the federation are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreFederationIamPolicy`: Retrieves the IAM policy for the federation
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreFederationIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreFederationIamBinding` and `gcp.dataproc.MetastoreFederationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreFederationIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreFederationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreFederationIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreFederationIamPolicy("policy", MetastoreFederationIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreFederationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreFederationIamBinding("binding", MetastoreFederationIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreFederationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreFederationIamMember("member", MetastoreFederationIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
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
   * # IAM policy for Dataproc Metastore Federation
   * 
   * Three different resources help you manage your IAM policy for Dataproc Metastore Federation. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreFederationIamPolicy`: Authoritative. Sets the IAM policy for the federation and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreFederationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the federation are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreFederationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the federation are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreFederationIamPolicy`: Retrieves the IAM policy for the federation
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreFederationIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreFederationIamBinding` and `gcp.dataproc.MetastoreFederationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreFederationIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreFederationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreFederationIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreFederationIamPolicy("policy", MetastoreFederationIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreFederationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreFederationIamBinding("binding", MetastoreFederationIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreFederationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreFederationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreFederationIamMember("member", MetastoreFederationIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .federationId(default_.get("federationId"))
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
   * * projects/{{project}}/locations/{{location}}/federations/{{federation_id}}
   * * {{project}}/{{location}}/{{federation_id}}
   * * {{location}}/{{federation_id}}
   * * {{federation_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc Metastore federation IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_federation_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/federations/{{federation_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_federation_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/federations/{{federation_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/metastoreFederationIamPolicy:MetastoreFederationIamPolicy editor projects/{{project}}/locations/{{location}}/federations/{{federation_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MetastoreFederationIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreFederationIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreFederationIamPolicyArgs.builder
    com.pulumi.gcp.dataproc.MetastoreFederationIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A managed metastore service that serves metadata queries.
   * 
   * To get more information about Service, see:
   * 
   * * [API documentation](https://cloud.google.com/dataproc-metastore/docs/reference/rest/v1/projects.locations.services)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dataproc-metastore/docs/overview)
   */
  def MetastoreService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreServiceArgs.builder
    com.pulumi.gcp.dataproc.MetastoreService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc Metastore Service. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreServiceIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreServiceIamBinding` and `gcp.dataproc.MetastoreServiceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreServiceIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreServiceIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreServiceIamPolicy("policy", MetastoreServiceIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreServiceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreServiceIamBinding("binding", MetastoreServiceIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreServiceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreServiceIamMember("member", MetastoreServiceIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
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
   * # IAM policy for Dataproc Metastore Service
   * 
   * Three different resources help you manage your IAM policy for Dataproc Metastore Service. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreServiceIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreServiceIamBinding` and `gcp.dataproc.MetastoreServiceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreServiceIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreServiceIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreServiceIamPolicy("policy", MetastoreServiceIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreServiceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreServiceIamBinding("binding", MetastoreServiceIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreServiceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreServiceIamMember("member", MetastoreServiceIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
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
   * * projects/{{project}}/locations/{{location}}/services/{{service_id}}
   * * {{project}}/{{location}}/{{service_id}}
   * * {{location}}/{{service_id}}
   * * {{service_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc Metastore service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_service_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_service_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/metastoreServiceIamBinding:MetastoreServiceIamBinding editor projects/{{project}}/locations/{{location}}/services/{{service_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MetastoreServiceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreServiceIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreServiceIamBindingArgs.builder
    com.pulumi.gcp.dataproc.MetastoreServiceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc Metastore Service. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreServiceIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreServiceIamBinding` and `gcp.dataproc.MetastoreServiceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreServiceIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreServiceIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreServiceIamPolicy("policy", MetastoreServiceIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreServiceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreServiceIamBinding("binding", MetastoreServiceIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreServiceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreServiceIamMember("member", MetastoreServiceIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
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
   * # IAM policy for Dataproc Metastore Service
   * 
   * Three different resources help you manage your IAM policy for Dataproc Metastore Service. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreServiceIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreServiceIamBinding` and `gcp.dataproc.MetastoreServiceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreServiceIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreServiceIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreServiceIamPolicy("policy", MetastoreServiceIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreServiceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreServiceIamBinding("binding", MetastoreServiceIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreServiceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreServiceIamMember("member", MetastoreServiceIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
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
   * * projects/{{project}}/locations/{{location}}/services/{{service_id}}
   * * {{project}}/{{location}}/{{service_id}}
   * * {{location}}/{{service_id}}
   * * {{service_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc Metastore service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_service_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_service_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/metastoreServiceIamMember:MetastoreServiceIamMember editor projects/{{project}}/locations/{{location}}/services/{{service_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MetastoreServiceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreServiceIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreServiceIamMemberArgs.builder
    com.pulumi.gcp.dataproc.MetastoreServiceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc Metastore Service. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreServiceIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreServiceIamBinding` and `gcp.dataproc.MetastoreServiceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreServiceIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreServiceIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreServiceIamPolicy("policy", MetastoreServiceIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreServiceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreServiceIamBinding("binding", MetastoreServiceIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreServiceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreServiceIamMember("member", MetastoreServiceIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
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
   * # IAM policy for Dataproc Metastore Service
   * 
   * Three different resources help you manage your IAM policy for Dataproc Metastore Service. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreServiceIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreServiceIamBinding` and `gcp.dataproc.MetastoreServiceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreServiceIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreServiceIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreServiceIamPolicy("policy", MetastoreServiceIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreServiceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreServiceIamBinding("binding", MetastoreServiceIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreServiceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreServiceIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreServiceIamMember("member", MetastoreServiceIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .serviceId(default_.get("serviceId"))
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
   * * projects/{{project}}/locations/{{location}}/services/{{service_id}}
   * * {{project}}/{{location}}/{{service_id}}
   * * {{location}}/{{service_id}}
   * * {{service_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc Metastore service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_service_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_service_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/metastoreServiceIamPolicy:MetastoreServiceIamPolicy editor projects/{{project}}/locations/{{location}}/services/{{service_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MetastoreServiceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreServiceIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreServiceIamPolicyArgs.builder
    com.pulumi.gcp.dataproc.MetastoreServiceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc Metastore Table. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreTableIamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreTableIamPolicy`: Retrieves the IAM policy for the table
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreTableIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreTableIamBinding` and `gcp.dataproc.MetastoreTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreTableIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreTableIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreTableIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreTableIamPolicy("policy", MetastoreTableIamPolicyArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreTableIamBinding("binding", MetastoreTableIamBindingArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreTableIamMember("member", MetastoreTableIamMemberArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
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
   * # IAM policy for Dataproc Metastore Table
   * 
   * Three different resources help you manage your IAM policy for Dataproc Metastore Table. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreTableIamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreTableIamPolicy`: Retrieves the IAM policy for the table
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreTableIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreTableIamBinding` and `gcp.dataproc.MetastoreTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreTableIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreTableIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreTableIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreTableIamPolicy("policy", MetastoreTableIamPolicyArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreTableIamBinding("binding", MetastoreTableIamBindingArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreTableIamMember("member", MetastoreTableIamMemberArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
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
   * * projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{databaseId}}/tables/{{name}}
   * * {{project}}/{{location}}/{{serviceId}}/{{databaseId}}/{{name}}
   * * {{location}}/{{serviceId}}/{{databaseId}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc Metastore table IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_table_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{databaseId}}/tables/{{table}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_table_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{databaseId}}/tables/{{table}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/metastoreTableIamBinding:MetastoreTableIamBinding editor projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{databaseId}}/tables/{{table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MetastoreTableIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreTableIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreTableIamBindingArgs.builder
    com.pulumi.gcp.dataproc.MetastoreTableIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc Metastore Table. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreTableIamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreTableIamPolicy`: Retrieves the IAM policy for the table
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreTableIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreTableIamBinding` and `gcp.dataproc.MetastoreTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreTableIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreTableIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreTableIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreTableIamPolicy("policy", MetastoreTableIamPolicyArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreTableIamBinding("binding", MetastoreTableIamBindingArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreTableIamMember("member", MetastoreTableIamMemberArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
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
   * # IAM policy for Dataproc Metastore Table
   * 
   * Three different resources help you manage your IAM policy for Dataproc Metastore Table. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreTableIamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreTableIamPolicy`: Retrieves the IAM policy for the table
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreTableIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreTableIamBinding` and `gcp.dataproc.MetastoreTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreTableIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreTableIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreTableIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreTableIamPolicy("policy", MetastoreTableIamPolicyArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreTableIamBinding("binding", MetastoreTableIamBindingArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreTableIamMember("member", MetastoreTableIamMemberArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
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
   * * projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{databaseId}}/tables/{{name}}
   * * {{project}}/{{location}}/{{serviceId}}/{{databaseId}}/{{name}}
   * * {{location}}/{{serviceId}}/{{databaseId}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc Metastore table IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_table_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{databaseId}}/tables/{{table}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_table_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{databaseId}}/tables/{{table}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/metastoreTableIamMember:MetastoreTableIamMember editor projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{databaseId}}/tables/{{table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MetastoreTableIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreTableIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreTableIamMemberArgs.builder
    com.pulumi.gcp.dataproc.MetastoreTableIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Dataproc Metastore Table. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreTableIamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreTableIamPolicy`: Retrieves the IAM policy for the table
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreTableIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreTableIamBinding` and `gcp.dataproc.MetastoreTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreTableIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreTableIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreTableIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreTableIamPolicy("policy", MetastoreTableIamPolicyArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreTableIamBinding("binding", MetastoreTableIamBindingArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreTableIamMember("member", MetastoreTableIamMemberArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
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
   * # IAM policy for Dataproc Metastore Table
   * 
   * Three different resources help you manage your IAM policy for Dataproc Metastore Table. Each of these resources serves a different use case:
   * 
   * * `gcp.dataproc.MetastoreTableIamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
   * * `gcp.dataproc.MetastoreTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dataproc.MetastoreTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dataproc.MetastoreTableIamPolicy`: Retrieves the IAM policy for the table
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreTableIamPolicy` **cannot** be used in conjunction with `gcp.dataproc.MetastoreTableIamBinding` and `gcp.dataproc.MetastoreTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dataproc.MetastoreTableIamBinding` resources **can be** used in conjunction with `gcp.dataproc.MetastoreTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.dataproc.MetastoreTableIamPolicy
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
   * import com.pulumi.gcp.dataproc.MetastoreTableIamPolicy;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new MetastoreTableIamPolicy("policy", MetastoreTableIamPolicyArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamBinding;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new MetastoreTableIamBinding("binding", MetastoreTableIamBindingArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.dataproc.MetastoreTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamMember;
   * import com.pulumi.gcp.dataproc.MetastoreTableIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new MetastoreTableIamMember("member", MetastoreTableIamMemberArgs.builder()
   *             .project(dpmsService.get("project"))
   *             .location(dpmsService.get("location"))
   *             .serviceId(dpmsService.get("serviceId"))
   *             .databaseId(hive.get("hiveConfig")[0].get("properties").get("database"))
   *             .table(hive.get("hiveConfig")[0].get("properties").get("table"))
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
   * * projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{databaseId}}/tables/{{name}}
   * * {{project}}/{{location}}/{{serviceId}}/{{databaseId}}/{{name}}
   * * {{location}}/{{serviceId}}/{{databaseId}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Dataproc Metastore table IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_table_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{databaseId}}/tables/{{table}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dataproc_metastore_table_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{databaseId}}/tables/{{table}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dataproc/metastoreTableIamPolicy:MetastoreTableIamPolicy editor projects/{{project}}/locations/{{location}}/services/{{serviceId}}/databases/{{databaseId}}/tables/{{table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MetastoreTableIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.MetastoreTableIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dataproc.MetastoreTableIamPolicyArgs.builder
    com.pulumi.gcp.dataproc.MetastoreTableIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A Dataproc Serverless session template defines the configuration settings for
   * creating one or more Dataproc Serverless interactive sessions.
   * 
   * To get more information about SessionTemplate, see:
   * 
   * * [API documentation](https://cloud.google.com/dataproc-serverless/docs/reference/rest/v1/projects.locations.sessionTemplates)
   * * How-to Guides
   *     * [Dataproc Serverless Session Templates](https://cloud.google.com/dataproc-serverless/docs/guides/create-serverless-sessions-templates#create-dataproc-serverless-session-template)
   */
  def SessionTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.SessionTemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataproc.SessionTemplateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataproc.SessionTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A Workflow Template is a reusable workflow configuration. It defines a graph of jobs with information on where to run those jobs. */
  def WorkflowTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataproc.WorkflowTemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataproc.WorkflowTemplateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataproc.WorkflowTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
