package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object gkebackup:
  /**
   * A BackupChannel imposes constraints on where clusters can be backed up.
   * The BackupChannel should be in the same project and region
   * as the cluster being backed up.
   * The backup can be created only in destination_project.
   * 
   * To get more information about BackupChannel, see:
   * 
   * * [API documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/reference/rest/v1/projects.locations.backupChannels)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke)
   */
  def BackupChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.BackupChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.BackupChannelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.BackupChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Represents a Backup Plan instance.
   * 
   * To get more information about BackupPlan, see:
   * 
   * * [API documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/reference/rest/v1/projects.locations.backupPlans)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke)
   */
  def BackupPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.BackupPlanArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.BackupPlanArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.BackupPlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Backup for GKE BackupPlan. Each of these resources serves a different use case:
   * 
   * * `gcp.gkebackup.BackupPlanIamPolicy`: Authoritative. Sets the IAM policy for the backupplan and replaces any existing policy already attached.
   * * `gcp.gkebackup.BackupPlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the backupplan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gkebackup.BackupPlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the backupplan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gkebackup.BackupPlanIamPolicy`: Retrieves the IAM policy for the backupplan
   * 
   * &gt; **Note:** `gcp.gkebackup.BackupPlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.BackupPlanIamBinding` and `gcp.gkebackup.BackupPlanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gkebackup.BackupPlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.BackupPlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gkebackup.BackupPlanIamPolicy
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
   * import com.pulumi.gcp.gkebackup.BackupPlanIamPolicy;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new BackupPlanIamPolicy("policy", BackupPlanIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.BackupPlanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamBinding;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BackupPlanIamBinding("binding", BackupPlanIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.BackupPlanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamMember;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BackupPlanIamMember("member", BackupPlanIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
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
   * # IAM policy for Backup for GKE BackupPlan
   * 
   * Three different resources help you manage your IAM policy for Backup for GKE BackupPlan. Each of these resources serves a different use case:
   * 
   * * `gcp.gkebackup.BackupPlanIamPolicy`: Authoritative. Sets the IAM policy for the backupplan and replaces any existing policy already attached.
   * * `gcp.gkebackup.BackupPlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the backupplan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gkebackup.BackupPlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the backupplan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gkebackup.BackupPlanIamPolicy`: Retrieves the IAM policy for the backupplan
   * 
   * &gt; **Note:** `gcp.gkebackup.BackupPlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.BackupPlanIamBinding` and `gcp.gkebackup.BackupPlanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gkebackup.BackupPlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.BackupPlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gkebackup.BackupPlanIamPolicy
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
   * import com.pulumi.gcp.gkebackup.BackupPlanIamPolicy;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new BackupPlanIamPolicy("policy", BackupPlanIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.BackupPlanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamBinding;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BackupPlanIamBinding("binding", BackupPlanIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.BackupPlanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamMember;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BackupPlanIamMember("member", BackupPlanIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
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
   * * projects/{{project}}/locations/{{location}}/backupPlans/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Backup for GKE backupplan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_gke_backup_backup_plan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_gke_backup_backup_plan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:gkebackup/backupPlanIamBinding:BackupPlanIamBinding editor projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def BackupPlanIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.BackupPlanIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Backup for GKE BackupPlan. Each of these resources serves a different use case:
   * 
   * * `gcp.gkebackup.BackupPlanIamPolicy`: Authoritative. Sets the IAM policy for the backupplan and replaces any existing policy already attached.
   * * `gcp.gkebackup.BackupPlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the backupplan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gkebackup.BackupPlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the backupplan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gkebackup.BackupPlanIamPolicy`: Retrieves the IAM policy for the backupplan
   * 
   * &gt; **Note:** `gcp.gkebackup.BackupPlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.BackupPlanIamBinding` and `gcp.gkebackup.BackupPlanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gkebackup.BackupPlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.BackupPlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gkebackup.BackupPlanIamPolicy
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
   * import com.pulumi.gcp.gkebackup.BackupPlanIamPolicy;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new BackupPlanIamPolicy("policy", BackupPlanIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.BackupPlanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamBinding;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BackupPlanIamBinding("binding", BackupPlanIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.BackupPlanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamMember;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BackupPlanIamMember("member", BackupPlanIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
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
   * # IAM policy for Backup for GKE BackupPlan
   * 
   * Three different resources help you manage your IAM policy for Backup for GKE BackupPlan. Each of these resources serves a different use case:
   * 
   * * `gcp.gkebackup.BackupPlanIamPolicy`: Authoritative. Sets the IAM policy for the backupplan and replaces any existing policy already attached.
   * * `gcp.gkebackup.BackupPlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the backupplan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gkebackup.BackupPlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the backupplan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gkebackup.BackupPlanIamPolicy`: Retrieves the IAM policy for the backupplan
   * 
   * &gt; **Note:** `gcp.gkebackup.BackupPlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.BackupPlanIamBinding` and `gcp.gkebackup.BackupPlanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gkebackup.BackupPlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.BackupPlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gkebackup.BackupPlanIamPolicy
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
   * import com.pulumi.gcp.gkebackup.BackupPlanIamPolicy;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new BackupPlanIamPolicy("policy", BackupPlanIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.BackupPlanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamBinding;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BackupPlanIamBinding("binding", BackupPlanIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.BackupPlanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamMember;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BackupPlanIamMember("member", BackupPlanIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
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
   * * projects/{{project}}/locations/{{location}}/backupPlans/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Backup for GKE backupplan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_gke_backup_backup_plan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_gke_backup_backup_plan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:gkebackup/backupPlanIamMember:BackupPlanIamMember editor projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def BackupPlanIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.BackupPlanIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Backup for GKE BackupPlan. Each of these resources serves a different use case:
   * 
   * * `gcp.gkebackup.BackupPlanIamPolicy`: Authoritative. Sets the IAM policy for the backupplan and replaces any existing policy already attached.
   * * `gcp.gkebackup.BackupPlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the backupplan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gkebackup.BackupPlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the backupplan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gkebackup.BackupPlanIamPolicy`: Retrieves the IAM policy for the backupplan
   * 
   * &gt; **Note:** `gcp.gkebackup.BackupPlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.BackupPlanIamBinding` and `gcp.gkebackup.BackupPlanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gkebackup.BackupPlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.BackupPlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gkebackup.BackupPlanIamPolicy
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
   * import com.pulumi.gcp.gkebackup.BackupPlanIamPolicy;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new BackupPlanIamPolicy("policy", BackupPlanIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.BackupPlanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamBinding;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BackupPlanIamBinding("binding", BackupPlanIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.BackupPlanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamMember;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BackupPlanIamMember("member", BackupPlanIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
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
   * # IAM policy for Backup for GKE BackupPlan
   * 
   * Three different resources help you manage your IAM policy for Backup for GKE BackupPlan. Each of these resources serves a different use case:
   * 
   * * `gcp.gkebackup.BackupPlanIamPolicy`: Authoritative. Sets the IAM policy for the backupplan and replaces any existing policy already attached.
   * * `gcp.gkebackup.BackupPlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the backupplan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gkebackup.BackupPlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the backupplan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gkebackup.BackupPlanIamPolicy`: Retrieves the IAM policy for the backupplan
   * 
   * &gt; **Note:** `gcp.gkebackup.BackupPlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.BackupPlanIamBinding` and `gcp.gkebackup.BackupPlanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gkebackup.BackupPlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.BackupPlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gkebackup.BackupPlanIamPolicy
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
   * import com.pulumi.gcp.gkebackup.BackupPlanIamPolicy;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new BackupPlanIamPolicy("policy", BackupPlanIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.BackupPlanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamBinding;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BackupPlanIamBinding("binding", BackupPlanIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.BackupPlanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamMember;
   * import com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BackupPlanIamMember("member", BackupPlanIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .name(basic.get("name"))
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
   * * projects/{{project}}/locations/{{location}}/backupPlans/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Backup for GKE backupplan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_gke_backup_backup_plan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_gke_backup_backup_plan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:gkebackup/backupPlanIamPolicy:BackupPlanIamPolicy editor projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def BackupPlanIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.BackupPlanIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object GkebackupFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for backupplan */
    inline def getBackupPlanIamPolicy(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.GetBackupPlanIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.gkebackup.outputs.GetBackupPlanIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.GetBackupPlanIamPolicyArgs.builder
      com.pulumi.gcp.gkebackup.GkebackupFunctions.getBackupPlanIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for backupplan */
    inline def getBackupPlanIamPolicyPlain(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.GetBackupPlanIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gkebackup.outputs.GetBackupPlanIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.GetBackupPlanIamPolicyPlainArgs.builder
      com.pulumi.gcp.gkebackup.GkebackupFunctions.getBackupPlanIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for restoreplan */
    inline def getRestorePlanIamPolicy(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.GetRestorePlanIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.gkebackup.outputs.GetRestorePlanIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.GetRestorePlanIamPolicyArgs.builder
      com.pulumi.gcp.gkebackup.GkebackupFunctions.getRestorePlanIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for restoreplan */
    inline def getRestorePlanIamPolicyPlain(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.GetRestorePlanIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gkebackup.outputs.GetRestorePlanIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.GetRestorePlanIamPolicyPlainArgs.builder
      com.pulumi.gcp.gkebackup.GkebackupFunctions.getRestorePlanIamPolicyPlain(args(argsBuilder).build)

  /**
   * A RestoreChannel imposes constraints on where backups can be restored.
   * The RestoreChannel should be in the same project and region
   * as the backups. The backups can only be restored in the
   * destination_project.
   * 
   * To get more information about RestoreChannel, see:
   * 
   * * [API documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/reference/rest/v1/projects.locations.restoreChannels)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke)
   */
  def RestoreChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.RestoreChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.RestoreChannelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.RestoreChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Represents a Restore Plan instance.
   * 
   * To get more information about RestorePlan, see:
   * 
   * * [API documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/reference/rest/v1/projects.locations.restorePlans)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke)
   */
  def RestorePlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.RestorePlanArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.RestorePlanArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.RestorePlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Backup for GKE RestorePlan. Each of these resources serves a different use case:
   * 
   * * `gcp.gkebackup.RestorePlanIamPolicy`: Authoritative. Sets the IAM policy for the restoreplan and replaces any existing policy already attached.
   * * `gcp.gkebackup.RestorePlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the restoreplan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gkebackup.RestorePlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the restoreplan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gkebackup.RestorePlanIamPolicy`: Retrieves the IAM policy for the restoreplan
   * 
   * &gt; **Note:** `gcp.gkebackup.RestorePlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.RestorePlanIamBinding` and `gcp.gkebackup.RestorePlanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gkebackup.RestorePlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.RestorePlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gkebackup.RestorePlanIamPolicy
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
   * import com.pulumi.gcp.gkebackup.RestorePlanIamPolicy;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new RestorePlanIamPolicy("policy", RestorePlanIamPolicyArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.RestorePlanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamBinding;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RestorePlanIamBinding("binding", RestorePlanIamBindingArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.RestorePlanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamMember;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RestorePlanIamMember("member", RestorePlanIamMemberArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
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
   * # IAM policy for Backup for GKE RestorePlan
   * 
   * Three different resources help you manage your IAM policy for Backup for GKE RestorePlan. Each of these resources serves a different use case:
   * 
   * * `gcp.gkebackup.RestorePlanIamPolicy`: Authoritative. Sets the IAM policy for the restoreplan and replaces any existing policy already attached.
   * * `gcp.gkebackup.RestorePlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the restoreplan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gkebackup.RestorePlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the restoreplan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gkebackup.RestorePlanIamPolicy`: Retrieves the IAM policy for the restoreplan
   * 
   * &gt; **Note:** `gcp.gkebackup.RestorePlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.RestorePlanIamBinding` and `gcp.gkebackup.RestorePlanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gkebackup.RestorePlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.RestorePlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gkebackup.RestorePlanIamPolicy
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
   * import com.pulumi.gcp.gkebackup.RestorePlanIamPolicy;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new RestorePlanIamPolicy("policy", RestorePlanIamPolicyArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.RestorePlanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamBinding;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RestorePlanIamBinding("binding", RestorePlanIamBindingArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.RestorePlanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamMember;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RestorePlanIamMember("member", RestorePlanIamMemberArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
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
   * * projects/{{project}}/locations/{{location}}/restorePlans/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Backup for GKE restoreplan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_gke_backup_restore_plan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_gke_backup_restore_plan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:gkebackup/restorePlanIamBinding:RestorePlanIamBinding editor projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RestorePlanIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.RestorePlanIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Backup for GKE RestorePlan. Each of these resources serves a different use case:
   * 
   * * `gcp.gkebackup.RestorePlanIamPolicy`: Authoritative. Sets the IAM policy for the restoreplan and replaces any existing policy already attached.
   * * `gcp.gkebackup.RestorePlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the restoreplan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gkebackup.RestorePlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the restoreplan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gkebackup.RestorePlanIamPolicy`: Retrieves the IAM policy for the restoreplan
   * 
   * &gt; **Note:** `gcp.gkebackup.RestorePlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.RestorePlanIamBinding` and `gcp.gkebackup.RestorePlanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gkebackup.RestorePlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.RestorePlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gkebackup.RestorePlanIamPolicy
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
   * import com.pulumi.gcp.gkebackup.RestorePlanIamPolicy;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new RestorePlanIamPolicy("policy", RestorePlanIamPolicyArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.RestorePlanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamBinding;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RestorePlanIamBinding("binding", RestorePlanIamBindingArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.RestorePlanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamMember;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RestorePlanIamMember("member", RestorePlanIamMemberArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
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
   * # IAM policy for Backup for GKE RestorePlan
   * 
   * Three different resources help you manage your IAM policy for Backup for GKE RestorePlan. Each of these resources serves a different use case:
   * 
   * * `gcp.gkebackup.RestorePlanIamPolicy`: Authoritative. Sets the IAM policy for the restoreplan and replaces any existing policy already attached.
   * * `gcp.gkebackup.RestorePlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the restoreplan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gkebackup.RestorePlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the restoreplan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gkebackup.RestorePlanIamPolicy`: Retrieves the IAM policy for the restoreplan
   * 
   * &gt; **Note:** `gcp.gkebackup.RestorePlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.RestorePlanIamBinding` and `gcp.gkebackup.RestorePlanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gkebackup.RestorePlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.RestorePlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gkebackup.RestorePlanIamPolicy
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
   * import com.pulumi.gcp.gkebackup.RestorePlanIamPolicy;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new RestorePlanIamPolicy("policy", RestorePlanIamPolicyArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.RestorePlanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamBinding;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RestorePlanIamBinding("binding", RestorePlanIamBindingArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.RestorePlanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamMember;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RestorePlanIamMember("member", RestorePlanIamMemberArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
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
   * * projects/{{project}}/locations/{{location}}/restorePlans/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Backup for GKE restoreplan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_gke_backup_restore_plan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_gke_backup_restore_plan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:gkebackup/restorePlanIamMember:RestorePlanIamMember editor projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RestorePlanIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.RestorePlanIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Backup for GKE RestorePlan. Each of these resources serves a different use case:
   * 
   * * `gcp.gkebackup.RestorePlanIamPolicy`: Authoritative. Sets the IAM policy for the restoreplan and replaces any existing policy already attached.
   * * `gcp.gkebackup.RestorePlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the restoreplan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gkebackup.RestorePlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the restoreplan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gkebackup.RestorePlanIamPolicy`: Retrieves the IAM policy for the restoreplan
   * 
   * &gt; **Note:** `gcp.gkebackup.RestorePlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.RestorePlanIamBinding` and `gcp.gkebackup.RestorePlanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gkebackup.RestorePlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.RestorePlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gkebackup.RestorePlanIamPolicy
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
   * import com.pulumi.gcp.gkebackup.RestorePlanIamPolicy;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new RestorePlanIamPolicy("policy", RestorePlanIamPolicyArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.RestorePlanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamBinding;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RestorePlanIamBinding("binding", RestorePlanIamBindingArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.RestorePlanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamMember;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RestorePlanIamMember("member", RestorePlanIamMemberArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
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
   * # IAM policy for Backup for GKE RestorePlan
   * 
   * Three different resources help you manage your IAM policy for Backup for GKE RestorePlan. Each of these resources serves a different use case:
   * 
   * * `gcp.gkebackup.RestorePlanIamPolicy`: Authoritative. Sets the IAM policy for the restoreplan and replaces any existing policy already attached.
   * * `gcp.gkebackup.RestorePlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the restoreplan are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gkebackup.RestorePlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the restoreplan are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gkebackup.RestorePlanIamPolicy`: Retrieves the IAM policy for the restoreplan
   * 
   * &gt; **Note:** `gcp.gkebackup.RestorePlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.RestorePlanIamBinding` and `gcp.gkebackup.RestorePlanIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gkebackup.RestorePlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.RestorePlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gkebackup.RestorePlanIamPolicy
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
   * import com.pulumi.gcp.gkebackup.RestorePlanIamPolicy;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new RestorePlanIamPolicy("policy", RestorePlanIamPolicyArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.RestorePlanIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamBinding;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RestorePlanIamBinding("binding", RestorePlanIamBindingArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gkebackup.RestorePlanIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamMember;
   * import com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RestorePlanIamMember("member", RestorePlanIamMemberArgs.builder()
   *             .project(allNs.get("project"))
   *             .location(allNs.get("location"))
   *             .name(allNs.get("name"))
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
   * * projects/{{project}}/locations/{{location}}/restorePlans/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Backup for GKE restoreplan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_gke_backup_restore_plan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_gke_backup_restore_plan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:gkebackup/restorePlanIamPolicy:RestorePlanIamPolicy editor projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RestorePlanIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.RestorePlanIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
