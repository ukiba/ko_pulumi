package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object workstations:
  /**
   * A single instance of a developer workstation with its own persistent storage.
   * 
   * To get more information about Workstation, see:
   * 
   * * [API documentation](https://cloud.google.com/workstations/docs/reference/rest/v1/projects.locations.workstationClusters.workstationConfigs.workstations)
   * * How-to Guides
   *     * [Workstations](https://cloud.google.com/workstations/docs/)
   */
  def Workstation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationArgs.builder
    com.pulumi.gcp.workstations.Workstation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A grouping of workstation configurations and the associated workstations in that region.
   * 
   * To get more information about WorkstationCluster, see:
   * 
   * * [API documentation](https://cloud.google.com/workstations/docs/reference/rest/v1/projects.locations.workstationClusters/create)
   * * How-to Guides
   *     * [Workstations](https://cloud.google.com/workstations/docs/)
   */
  def WorkstationCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationClusterArgs.builder
    com.pulumi.gcp.workstations.WorkstationCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A set of configuration options describing how a workstation will be run. Workstation configurations are intended to be shared across multiple workstations.
   * 
   * To get more information about WorkstationConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/workstations/docs/reference/rest/v1/projects.locations.workstationClusters.workstationConfigs/create)
   * * How-to Guides
   *     * [Workstations](https://cloud.google.com/workstations/docs/)
   */
  def WorkstationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationConfigArgs.builder
    com.pulumi.gcp.workstations.WorkstationConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Workstations WorkstationConfig. Each of these resources serves a different use case:
   * 
   * * `gcp.workstations.WorkstationConfigIamPolicy`: Authoritative. Sets the IAM policy for the workstationconfig and replaces any existing policy already attached.
   * * `gcp.workstations.WorkstationConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstationconfig are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.workstations.WorkstationConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstationconfig are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.workstations.WorkstationConfigIamPolicy`: Retrieves the IAM policy for the workstationconfig
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationConfigIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationConfigIamBinding` and `gcp.workstations.WorkstationConfigIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationConfigIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.workstations.WorkstationConfigIamPolicy
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
   * import com.pulumi.gcp.workstations.WorkstationConfigIamPolicy;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new WorkstationConfigIamPolicy("policy", WorkstationConfigIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationConfigIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamBinding;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkstationConfigIamBinding("binding", WorkstationConfigIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationConfigIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamMember;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkstationConfigIamMember("member", WorkstationConfigIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
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
   * # IAM policy for Cloud Workstations WorkstationConfig
   * 
   * Three different resources help you manage your IAM policy for Cloud Workstations WorkstationConfig. Each of these resources serves a different use case:
   * 
   * * `gcp.workstations.WorkstationConfigIamPolicy`: Authoritative. Sets the IAM policy for the workstationconfig and replaces any existing policy already attached.
   * * `gcp.workstations.WorkstationConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstationconfig are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.workstations.WorkstationConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstationconfig are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.workstations.WorkstationConfigIamPolicy`: Retrieves the IAM policy for the workstationconfig
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationConfigIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationConfigIamBinding` and `gcp.workstations.WorkstationConfigIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationConfigIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.workstations.WorkstationConfigIamPolicy
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
   * import com.pulumi.gcp.workstations.WorkstationConfigIamPolicy;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new WorkstationConfigIamPolicy("policy", WorkstationConfigIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationConfigIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamBinding;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkstationConfigIamBinding("binding", WorkstationConfigIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationConfigIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamMember;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkstationConfigIamMember("member", WorkstationConfigIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
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
   * * projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
   * * {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
   * * {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
   * * {{workstation_config_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Workstations workstationconfig IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_workstations_workstation_config_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_workstations_workstation_config_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:workstations/workstationConfigIamBinding:WorkstationConfigIamBinding editor projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkstationConfigIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs.builder
    com.pulumi.gcp.workstations.WorkstationConfigIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Workstations WorkstationConfig. Each of these resources serves a different use case:
   * 
   * * `gcp.workstations.WorkstationConfigIamPolicy`: Authoritative. Sets the IAM policy for the workstationconfig and replaces any existing policy already attached.
   * * `gcp.workstations.WorkstationConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstationconfig are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.workstations.WorkstationConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstationconfig are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.workstations.WorkstationConfigIamPolicy`: Retrieves the IAM policy for the workstationconfig
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationConfigIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationConfigIamBinding` and `gcp.workstations.WorkstationConfigIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationConfigIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.workstations.WorkstationConfigIamPolicy
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
   * import com.pulumi.gcp.workstations.WorkstationConfigIamPolicy;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new WorkstationConfigIamPolicy("policy", WorkstationConfigIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationConfigIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamBinding;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkstationConfigIamBinding("binding", WorkstationConfigIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationConfigIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamMember;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkstationConfigIamMember("member", WorkstationConfigIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
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
   * # IAM policy for Cloud Workstations WorkstationConfig
   * 
   * Three different resources help you manage your IAM policy for Cloud Workstations WorkstationConfig. Each of these resources serves a different use case:
   * 
   * * `gcp.workstations.WorkstationConfigIamPolicy`: Authoritative. Sets the IAM policy for the workstationconfig and replaces any existing policy already attached.
   * * `gcp.workstations.WorkstationConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstationconfig are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.workstations.WorkstationConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstationconfig are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.workstations.WorkstationConfigIamPolicy`: Retrieves the IAM policy for the workstationconfig
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationConfigIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationConfigIamBinding` and `gcp.workstations.WorkstationConfigIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationConfigIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.workstations.WorkstationConfigIamPolicy
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
   * import com.pulumi.gcp.workstations.WorkstationConfigIamPolicy;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new WorkstationConfigIamPolicy("policy", WorkstationConfigIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationConfigIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamBinding;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkstationConfigIamBinding("binding", WorkstationConfigIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationConfigIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamMember;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkstationConfigIamMember("member", WorkstationConfigIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
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
   * * projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
   * * {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
   * * {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
   * * {{workstation_config_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Workstations workstationconfig IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_workstations_workstation_config_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_workstations_workstation_config_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:workstations/workstationConfigIamMember:WorkstationConfigIamMember editor projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkstationConfigIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs.builder
    com.pulumi.gcp.workstations.WorkstationConfigIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Workstations WorkstationConfig. Each of these resources serves a different use case:
   * 
   * * `gcp.workstations.WorkstationConfigIamPolicy`: Authoritative. Sets the IAM policy for the workstationconfig and replaces any existing policy already attached.
   * * `gcp.workstations.WorkstationConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstationconfig are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.workstations.WorkstationConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstationconfig are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.workstations.WorkstationConfigIamPolicy`: Retrieves the IAM policy for the workstationconfig
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationConfigIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationConfigIamBinding` and `gcp.workstations.WorkstationConfigIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationConfigIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.workstations.WorkstationConfigIamPolicy
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
   * import com.pulumi.gcp.workstations.WorkstationConfigIamPolicy;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new WorkstationConfigIamPolicy("policy", WorkstationConfigIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationConfigIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamBinding;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkstationConfigIamBinding("binding", WorkstationConfigIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationConfigIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamMember;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkstationConfigIamMember("member", WorkstationConfigIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
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
   * # IAM policy for Cloud Workstations WorkstationConfig
   * 
   * Three different resources help you manage your IAM policy for Cloud Workstations WorkstationConfig. Each of these resources serves a different use case:
   * 
   * * `gcp.workstations.WorkstationConfigIamPolicy`: Authoritative. Sets the IAM policy for the workstationconfig and replaces any existing policy already attached.
   * * `gcp.workstations.WorkstationConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstationconfig are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.workstations.WorkstationConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstationconfig are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.workstations.WorkstationConfigIamPolicy`: Retrieves the IAM policy for the workstationconfig
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationConfigIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationConfigIamBinding` and `gcp.workstations.WorkstationConfigIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationConfigIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.workstations.WorkstationConfigIamPolicy
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
   * import com.pulumi.gcp.workstations.WorkstationConfigIamPolicy;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new WorkstationConfigIamPolicy("policy", WorkstationConfigIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationConfigIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamBinding;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkstationConfigIamBinding("binding", WorkstationConfigIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationConfigIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamMember;
   * import com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkstationConfigIamMember("member", WorkstationConfigIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
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
   * * projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
   * * {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
   * * {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
   * * {{workstation_config_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Workstations workstationconfig IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_workstations_workstation_config_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_workstations_workstation_config_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:workstations/workstationConfigIamPolicy:WorkstationConfigIamPolicy editor projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkstationConfigIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs.builder
    com.pulumi.gcp.workstations.WorkstationConfigIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Workstations Workstation. Each of these resources serves a different use case:
   * 
   * * `gcp.workstations.WorkstationIamPolicy`: Authoritative. Sets the IAM policy for the workstation and replaces any existing policy already attached.
   * * `gcp.workstations.WorkstationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstation are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.workstations.WorkstationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstation are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.workstations.WorkstationIamPolicy`: Retrieves the IAM policy for the workstation
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationIamBinding` and `gcp.workstations.WorkstationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.workstations.WorkstationIamPolicy
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
   * import com.pulumi.gcp.workstations.WorkstationIamPolicy;
   * import com.pulumi.gcp.workstations.WorkstationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new WorkstationIamPolicy("policy", WorkstationIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationIamBinding;
   * import com.pulumi.gcp.workstations.WorkstationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkstationIamBinding("binding", WorkstationIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationIamMember;
   * import com.pulumi.gcp.workstations.WorkstationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkstationIamMember("member", WorkstationIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
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
   * # IAM policy for Cloud Workstations Workstation
   * 
   * Three different resources help you manage your IAM policy for Cloud Workstations Workstation. Each of these resources serves a different use case:
   * 
   * * `gcp.workstations.WorkstationIamPolicy`: Authoritative. Sets the IAM policy for the workstation and replaces any existing policy already attached.
   * * `gcp.workstations.WorkstationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstation are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.workstations.WorkstationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstation are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.workstations.WorkstationIamPolicy`: Retrieves the IAM policy for the workstation
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationIamBinding` and `gcp.workstations.WorkstationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.workstations.WorkstationIamPolicy
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
   * import com.pulumi.gcp.workstations.WorkstationIamPolicy;
   * import com.pulumi.gcp.workstations.WorkstationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new WorkstationIamPolicy("policy", WorkstationIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationIamBinding;
   * import com.pulumi.gcp.workstations.WorkstationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkstationIamBinding("binding", WorkstationIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationIamMember;
   * import com.pulumi.gcp.workstations.WorkstationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkstationIamMember("member", WorkstationIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
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
   * * projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
   * * {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
   * * {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
   * * {{workstation_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Workstations workstation IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_workstations_workstation_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_workstations_workstation_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:workstations/workstationIamBinding:WorkstationIamBinding editor projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkstationIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationIamBindingArgs.builder
    com.pulumi.gcp.workstations.WorkstationIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Workstations Workstation. Each of these resources serves a different use case:
   * 
   * * `gcp.workstations.WorkstationIamPolicy`: Authoritative. Sets the IAM policy for the workstation and replaces any existing policy already attached.
   * * `gcp.workstations.WorkstationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstation are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.workstations.WorkstationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstation are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.workstations.WorkstationIamPolicy`: Retrieves the IAM policy for the workstation
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationIamBinding` and `gcp.workstations.WorkstationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.workstations.WorkstationIamPolicy
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
   * import com.pulumi.gcp.workstations.WorkstationIamPolicy;
   * import com.pulumi.gcp.workstations.WorkstationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new WorkstationIamPolicy("policy", WorkstationIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationIamBinding;
   * import com.pulumi.gcp.workstations.WorkstationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkstationIamBinding("binding", WorkstationIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationIamMember;
   * import com.pulumi.gcp.workstations.WorkstationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkstationIamMember("member", WorkstationIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
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
   * # IAM policy for Cloud Workstations Workstation
   * 
   * Three different resources help you manage your IAM policy for Cloud Workstations Workstation. Each of these resources serves a different use case:
   * 
   * * `gcp.workstations.WorkstationIamPolicy`: Authoritative. Sets the IAM policy for the workstation and replaces any existing policy already attached.
   * * `gcp.workstations.WorkstationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstation are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.workstations.WorkstationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstation are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.workstations.WorkstationIamPolicy`: Retrieves the IAM policy for the workstation
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationIamBinding` and `gcp.workstations.WorkstationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.workstations.WorkstationIamPolicy
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
   * import com.pulumi.gcp.workstations.WorkstationIamPolicy;
   * import com.pulumi.gcp.workstations.WorkstationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new WorkstationIamPolicy("policy", WorkstationIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationIamBinding;
   * import com.pulumi.gcp.workstations.WorkstationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkstationIamBinding("binding", WorkstationIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationIamMember;
   * import com.pulumi.gcp.workstations.WorkstationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkstationIamMember("member", WorkstationIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
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
   * * projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
   * * {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
   * * {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
   * * {{workstation_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Workstations workstation IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_workstations_workstation_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_workstations_workstation_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:workstations/workstationIamMember:WorkstationIamMember editor projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkstationIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationIamMemberArgs.builder
    com.pulumi.gcp.workstations.WorkstationIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Workstations Workstation. Each of these resources serves a different use case:
   * 
   * * `gcp.workstations.WorkstationIamPolicy`: Authoritative. Sets the IAM policy for the workstation and replaces any existing policy already attached.
   * * `gcp.workstations.WorkstationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstation are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.workstations.WorkstationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstation are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.workstations.WorkstationIamPolicy`: Retrieves the IAM policy for the workstation
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationIamBinding` and `gcp.workstations.WorkstationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.workstations.WorkstationIamPolicy
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
   * import com.pulumi.gcp.workstations.WorkstationIamPolicy;
   * import com.pulumi.gcp.workstations.WorkstationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new WorkstationIamPolicy("policy", WorkstationIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationIamBinding;
   * import com.pulumi.gcp.workstations.WorkstationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkstationIamBinding("binding", WorkstationIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationIamMember;
   * import com.pulumi.gcp.workstations.WorkstationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkstationIamMember("member", WorkstationIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
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
   * # IAM policy for Cloud Workstations Workstation
   * 
   * Three different resources help you manage your IAM policy for Cloud Workstations Workstation. Each of these resources serves a different use case:
   * 
   * * `gcp.workstations.WorkstationIamPolicy`: Authoritative. Sets the IAM policy for the workstation and replaces any existing policy already attached.
   * * `gcp.workstations.WorkstationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstation are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.workstations.WorkstationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstation are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.workstations.WorkstationIamPolicy`: Retrieves the IAM policy for the workstation
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationIamBinding` and `gcp.workstations.WorkstationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.workstations.WorkstationIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.workstations.WorkstationIamPolicy
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
   * import com.pulumi.gcp.workstations.WorkstationIamPolicy;
   * import com.pulumi.gcp.workstations.WorkstationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new WorkstationIamPolicy("policy", WorkstationIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationIamBinding;
   * import com.pulumi.gcp.workstations.WorkstationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new WorkstationIamBinding("binding", WorkstationIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.workstations.WorkstationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.workstations.WorkstationIamMember;
   * import com.pulumi.gcp.workstations.WorkstationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new WorkstationIamMember("member", WorkstationIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .workstationClusterId(default_.get("workstationClusterId"))
   *             .workstationConfigId(default_.get("workstationConfigId"))
   *             .workstationId(default_.get("workstationId"))
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
   * * projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
   * * {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
   * * {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
   * * {{workstation_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Workstations workstation IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_workstations_workstation_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_workstations_workstation_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:workstations/workstationIamPolicy:WorkstationIamPolicy editor projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkstationIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationIamPolicyArgs.builder
    com.pulumi.gcp.workstations.WorkstationIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object WorkstationsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for workstationconfig */
    inline def getWorkstationConfigIamPolicy(args: Endofunction[com.pulumi.gcp.workstations.inputs.GetWorkstationConfigIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.workstations.outputs.GetWorkstationConfigIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.GetWorkstationConfigIamPolicyArgs.builder
      com.pulumi.gcp.workstations.WorkstationsFunctions.getWorkstationConfigIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for workstationconfig */
    inline def getWorkstationConfigIamPolicyPlain(args: Endofunction[com.pulumi.gcp.workstations.inputs.GetWorkstationConfigIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.workstations.outputs.GetWorkstationConfigIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.GetWorkstationConfigIamPolicyPlainArgs.builder
      com.pulumi.gcp.workstations.WorkstationsFunctions.getWorkstationConfigIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for workstation */
    inline def getWorkstationIamPolicy(args: Endofunction[com.pulumi.gcp.workstations.inputs.GetWorkstationIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.workstations.outputs.GetWorkstationIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.GetWorkstationIamPolicyArgs.builder
      com.pulumi.gcp.workstations.WorkstationsFunctions.getWorkstationIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for workstation */
    inline def getWorkstationIamPolicyPlain(args: Endofunction[com.pulumi.gcp.workstations.inputs.GetWorkstationIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.workstations.outputs.GetWorkstationIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.GetWorkstationIamPolicyPlainArgs.builder
      com.pulumi.gcp.workstations.WorkstationsFunctions.getWorkstationIamPolicyPlain(args(argsBuilder).build)
