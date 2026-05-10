package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object gkebackup:
  extension (builder: com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Backup for GKE RestorePlan. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkebackup.RestorePlanIamPolicy`: Authoritative. Sets the IAM policy for the restoreplan and replaces any existing policy already attached.
   *  * `gcp.gkebackup.RestorePlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the restoreplan are preserved.
   *  * `gcp.gkebackup.RestorePlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the restoreplan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkebackup.RestorePlanIamPolicy`: Retrieves the IAM policy for the restoreplan
   * 
   *  &gt; **Note:** `gcp.gkebackup.RestorePlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.RestorePlanIamBinding` and `gcp.gkebackup.RestorePlanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkebackup.RestorePlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.RestorePlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkebackup.RestorePlanIamPolicy
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
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamPolicy;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RestorePlanIamPolicy("policy", RestorePlanIamPolicyArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.RestorePlanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamBinding;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs;
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
   *          var binding = new RestorePlanIamBinding("binding", RestorePlanIamBindingArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.RestorePlanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamMember;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs;
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
   *          var member = new RestorePlanIamMember("member", RestorePlanIamMemberArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
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
   *  # IAM policy for Backup for GKE RestorePlan
   * 
   *  Three different resources help you manage your IAM policy for Backup for GKE RestorePlan. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkebackup.RestorePlanIamPolicy`: Authoritative. Sets the IAM policy for the restoreplan and replaces any existing policy already attached.
   *  * `gcp.gkebackup.RestorePlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the restoreplan are preserved.
   *  * `gcp.gkebackup.RestorePlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the restoreplan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkebackup.RestorePlanIamPolicy`: Retrieves the IAM policy for the restoreplan
   * 
   *  &gt; **Note:** `gcp.gkebackup.RestorePlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.RestorePlanIamBinding` and `gcp.gkebackup.RestorePlanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkebackup.RestorePlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.RestorePlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkebackup.RestorePlanIamPolicy
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
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamPolicy;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RestorePlanIamPolicy("policy", RestorePlanIamPolicyArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.RestorePlanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamBinding;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs;
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
   *          var binding = new RestorePlanIamBinding("binding", RestorePlanIamBindingArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.RestorePlanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamMember;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs;
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
   *          var member = new RestorePlanIamMember("member", RestorePlanIamMemberArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .role("roles/viewer")
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
   *  * projects/{{project}}/locations/{{location}}/restorePlans/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Backup for GKE restoreplan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_backup_restore_plan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_backup_restore_plan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkebackup/restorePlanIamMember:RestorePlanIamMember editor projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RestorePlanIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.RestorePlanIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Backup for GKE RestorePlan. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkebackup.RestorePlanIamPolicy`: Authoritative. Sets the IAM policy for the restoreplan and replaces any existing policy already attached.
   *  * `gcp.gkebackup.RestorePlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the restoreplan are preserved.
   *  * `gcp.gkebackup.RestorePlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the restoreplan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkebackup.RestorePlanIamPolicy`: Retrieves the IAM policy for the restoreplan
   * 
   *  &gt; **Note:** `gcp.gkebackup.RestorePlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.RestorePlanIamBinding` and `gcp.gkebackup.RestorePlanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkebackup.RestorePlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.RestorePlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkebackup.RestorePlanIamPolicy
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
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamPolicy;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RestorePlanIamPolicy("policy", RestorePlanIamPolicyArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.RestorePlanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamBinding;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs;
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
   *          var binding = new RestorePlanIamBinding("binding", RestorePlanIamBindingArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.RestorePlanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamMember;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs;
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
   *          var member = new RestorePlanIamMember("member", RestorePlanIamMemberArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
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
   *  # IAM policy for Backup for GKE RestorePlan
   * 
   *  Three different resources help you manage your IAM policy for Backup for GKE RestorePlan. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkebackup.RestorePlanIamPolicy`: Authoritative. Sets the IAM policy for the restoreplan and replaces any existing policy already attached.
   *  * `gcp.gkebackup.RestorePlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the restoreplan are preserved.
   *  * `gcp.gkebackup.RestorePlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the restoreplan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkebackup.RestorePlanIamPolicy`: Retrieves the IAM policy for the restoreplan
   * 
   *  &gt; **Note:** `gcp.gkebackup.RestorePlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.RestorePlanIamBinding` and `gcp.gkebackup.RestorePlanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkebackup.RestorePlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.RestorePlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkebackup.RestorePlanIamPolicy
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
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamPolicy;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RestorePlanIamPolicy("policy", RestorePlanIamPolicyArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.RestorePlanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamBinding;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs;
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
   *          var binding = new RestorePlanIamBinding("binding", RestorePlanIamBindingArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.RestorePlanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamMember;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs;
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
   *          var member = new RestorePlanIamMember("member", RestorePlanIamMemberArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .role("roles/viewer")
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
   *  * projects/{{project}}/locations/{{location}}/restorePlans/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Backup for GKE restoreplan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_backup_restore_plan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_backup_restore_plan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkebackup/restorePlanIamBinding:RestorePlanIamBinding editor projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RestorePlanIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.RestorePlanIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a Backup Plan instance.
   * 
   *  To get more information about BackupPlan, see:
   * 
   *  * [API documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/reference/rest/v1/projects.locations.backupPlans)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke)
   */
  def BackupPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.BackupPlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.BackupPlanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.BackupPlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkebackup.RestorePlanArgs.Builder)
    /**
     * @param restoreConfig Defines the configuration of Restores created via this RestorePlan.
     *  Structure is documented below.
     * @return builder
     */
    def restoreConfig(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder]):
        com.pulumi.gcp.gkebackup.RestorePlanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.builder
      builder.restoreConfig(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Backup for GKE RestorePlan. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkebackup.RestorePlanIamPolicy`: Authoritative. Sets the IAM policy for the restoreplan and replaces any existing policy already attached.
   *  * `gcp.gkebackup.RestorePlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the restoreplan are preserved.
   *  * `gcp.gkebackup.RestorePlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the restoreplan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkebackup.RestorePlanIamPolicy`: Retrieves the IAM policy for the restoreplan
   * 
   *  &gt; **Note:** `gcp.gkebackup.RestorePlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.RestorePlanIamBinding` and `gcp.gkebackup.RestorePlanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkebackup.RestorePlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.RestorePlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkebackup.RestorePlanIamPolicy
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
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamPolicy;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RestorePlanIamPolicy("policy", RestorePlanIamPolicyArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.RestorePlanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamBinding;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs;
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
   *          var binding = new RestorePlanIamBinding("binding", RestorePlanIamBindingArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.RestorePlanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamMember;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs;
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
   *          var member = new RestorePlanIamMember("member", RestorePlanIamMemberArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
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
   *  # IAM policy for Backup for GKE RestorePlan
   * 
   *  Three different resources help you manage your IAM policy for Backup for GKE RestorePlan. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkebackup.RestorePlanIamPolicy`: Authoritative. Sets the IAM policy for the restoreplan and replaces any existing policy already attached.
   *  * `gcp.gkebackup.RestorePlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the restoreplan are preserved.
   *  * `gcp.gkebackup.RestorePlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the restoreplan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkebackup.RestorePlanIamPolicy`: Retrieves the IAM policy for the restoreplan
   * 
   *  &gt; **Note:** `gcp.gkebackup.RestorePlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.RestorePlanIamBinding` and `gcp.gkebackup.RestorePlanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkebackup.RestorePlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.RestorePlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkebackup.RestorePlanIamPolicy
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
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamPolicy;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RestorePlanIamPolicy("policy", RestorePlanIamPolicyArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.RestorePlanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamBinding;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs;
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
   *          var binding = new RestorePlanIamBinding("binding", RestorePlanIamBindingArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.RestorePlanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamMember;
   *  import com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs;
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
   *          var member = new RestorePlanIamMember("member", RestorePlanIamMemberArgs.builder()
   *              .project(allNs.project())
   *              .location(allNs.location())
   *              .name(allNs.name())
   *              .role("roles/viewer")
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
   *  * projects/{{project}}/locations/{{location}}/restorePlans/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Backup for GKE restoreplan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_backup_restore_plan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_backup_restore_plan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkebackup/restorePlanIamPolicy:RestorePlanIamPolicy editor projects/{{project}}/locations/{{location}}/restorePlans/{{restore_plan}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RestorePlanIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.RestorePlanIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.RestorePlanIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Backup for GKE BackupPlan. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkebackup.BackupPlanIamPolicy`: Authoritative. Sets the IAM policy for the backupplan and replaces any existing policy already attached.
   *  * `gcp.gkebackup.BackupPlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the backupplan are preserved.
   *  * `gcp.gkebackup.BackupPlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the backupplan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkebackup.BackupPlanIamPolicy`: Retrieves the IAM policy for the backupplan
   * 
   *  &gt; **Note:** `gcp.gkebackup.BackupPlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.BackupPlanIamBinding` and `gcp.gkebackup.BackupPlanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkebackup.BackupPlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.BackupPlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkebackup.BackupPlanIamPolicy
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
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamPolicy;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new BackupPlanIamPolicy("policy", BackupPlanIamPolicyArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.BackupPlanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamBinding;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs;
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
   *          var binding = new BackupPlanIamBinding("binding", BackupPlanIamBindingArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.BackupPlanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamMember;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs;
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
   *          var member = new BackupPlanIamMember("member", BackupPlanIamMemberArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
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
   *  # IAM policy for Backup for GKE BackupPlan
   * 
   *  Three different resources help you manage your IAM policy for Backup for GKE BackupPlan. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkebackup.BackupPlanIamPolicy`: Authoritative. Sets the IAM policy for the backupplan and replaces any existing policy already attached.
   *  * `gcp.gkebackup.BackupPlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the backupplan are preserved.
   *  * `gcp.gkebackup.BackupPlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the backupplan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkebackup.BackupPlanIamPolicy`: Retrieves the IAM policy for the backupplan
   * 
   *  &gt; **Note:** `gcp.gkebackup.BackupPlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.BackupPlanIamBinding` and `gcp.gkebackup.BackupPlanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkebackup.BackupPlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.BackupPlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkebackup.BackupPlanIamPolicy
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
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamPolicy;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new BackupPlanIamPolicy("policy", BackupPlanIamPolicyArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.BackupPlanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamBinding;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs;
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
   *          var binding = new BackupPlanIamBinding("binding", BackupPlanIamBindingArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.BackupPlanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamMember;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs;
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
   *          var member = new BackupPlanIamMember("member", BackupPlanIamMemberArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .role("roles/viewer")
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
   *  * projects/{{project}}/locations/{{location}}/backupPlans/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Backup for GKE backupplan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_backup_backup_plan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_backup_backup_plan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkebackup/backupPlanIamBinding:BackupPlanIamBinding editor projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def BackupPlanIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.BackupPlanIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Represents a Restore Plan instance.
   * 
   *  To get more information about RestorePlan, see:
   * 
   *  * [API documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/reference/rest/v1/projects.locations.restorePlans)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke)
   */
  def RestorePlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.RestorePlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.RestorePlanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.RestorePlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Backup for GKE BackupPlan. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkebackup.BackupPlanIamPolicy`: Authoritative. Sets the IAM policy for the backupplan and replaces any existing policy already attached.
   *  * `gcp.gkebackup.BackupPlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the backupplan are preserved.
   *  * `gcp.gkebackup.BackupPlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the backupplan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkebackup.BackupPlanIamPolicy`: Retrieves the IAM policy for the backupplan
   * 
   *  &gt; **Note:** `gcp.gkebackup.BackupPlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.BackupPlanIamBinding` and `gcp.gkebackup.BackupPlanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkebackup.BackupPlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.BackupPlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkebackup.BackupPlanIamPolicy
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
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamPolicy;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new BackupPlanIamPolicy("policy", BackupPlanIamPolicyArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.BackupPlanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamBinding;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs;
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
   *          var binding = new BackupPlanIamBinding("binding", BackupPlanIamBindingArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.BackupPlanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamMember;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs;
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
   *          var member = new BackupPlanIamMember("member", BackupPlanIamMemberArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
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
   *  # IAM policy for Backup for GKE BackupPlan
   * 
   *  Three different resources help you manage your IAM policy for Backup for GKE BackupPlan. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkebackup.BackupPlanIamPolicy`: Authoritative. Sets the IAM policy for the backupplan and replaces any existing policy already attached.
   *  * `gcp.gkebackup.BackupPlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the backupplan are preserved.
   *  * `gcp.gkebackup.BackupPlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the backupplan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkebackup.BackupPlanIamPolicy`: Retrieves the IAM policy for the backupplan
   * 
   *  &gt; **Note:** `gcp.gkebackup.BackupPlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.BackupPlanIamBinding` and `gcp.gkebackup.BackupPlanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkebackup.BackupPlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.BackupPlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkebackup.BackupPlanIamPolicy
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
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamPolicy;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new BackupPlanIamPolicy("policy", BackupPlanIamPolicyArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.BackupPlanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamBinding;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs;
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
   *          var binding = new BackupPlanIamBinding("binding", BackupPlanIamBindingArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.BackupPlanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamMember;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs;
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
   *          var member = new BackupPlanIamMember("member", BackupPlanIamMemberArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .role("roles/viewer")
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
   *  * projects/{{project}}/locations/{{location}}/backupPlans/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Backup for GKE backupplan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_backup_backup_plan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_backup_backup_plan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkebackup/backupPlanIamPolicy:BackupPlanIamPolicy editor projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def BackupPlanIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.BackupPlanIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.BackupPlanArgs.Builder)
    /**
     * @param backupConfig Defines the configuration of Backups created via this BackupPlan.
     *  Structure is documented below.
     * @return builder
     */
    def backupConfig(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder]):
        com.pulumi.gcp.gkebackup.BackupPlanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.builder
      builder.backupConfig(args(argsBuilder).build)

    /**
     * @param backupSchedule Defines a schedule for automatic Backup creation via this BackupPlan.
     *  Structure is documented below.
     * @return builder
     */
    def backupSchedule(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleArgs.Builder]):
        com.pulumi.gcp.gkebackup.BackupPlanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleArgs.builder
      builder.backupSchedule(args(argsBuilder).build)

    /**
     * @param retentionPolicy RetentionPolicy governs lifecycle of Backups created under this plan.
     *  Structure is documented below.
     * @return builder
     */
    def retentionPolicy(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanRetentionPolicyArgs.Builder]):
        com.pulumi.gcp.gkebackup.BackupPlanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  /**
   * A RestoreChannel imposes constraints on where backups can be restored.
   *  The RestoreChannel should be in the same project and region
   *  as the backups. The backups can only be restored in the
   *  destination_project.
   * 
   *  To get more information about RestoreChannel, see:
   * 
   *  * [API documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/reference/rest/v1/projects.locations.restoreChannels)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke)
   */
  def RestoreChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.RestoreChannelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.RestoreChannelArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.RestoreChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Backup for GKE BackupPlan. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkebackup.BackupPlanIamPolicy`: Authoritative. Sets the IAM policy for the backupplan and replaces any existing policy already attached.
   *  * `gcp.gkebackup.BackupPlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the backupplan are preserved.
   *  * `gcp.gkebackup.BackupPlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the backupplan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkebackup.BackupPlanIamPolicy`: Retrieves the IAM policy for the backupplan
   * 
   *  &gt; **Note:** `gcp.gkebackup.BackupPlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.BackupPlanIamBinding` and `gcp.gkebackup.BackupPlanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkebackup.BackupPlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.BackupPlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkebackup.BackupPlanIamPolicy
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
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamPolicy;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new BackupPlanIamPolicy("policy", BackupPlanIamPolicyArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.BackupPlanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamBinding;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs;
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
   *          var binding = new BackupPlanIamBinding("binding", BackupPlanIamBindingArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.BackupPlanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamMember;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs;
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
   *          var member = new BackupPlanIamMember("member", BackupPlanIamMemberArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
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
   *  # IAM policy for Backup for GKE BackupPlan
   * 
   *  Three different resources help you manage your IAM policy for Backup for GKE BackupPlan. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkebackup.BackupPlanIamPolicy`: Authoritative. Sets the IAM policy for the backupplan and replaces any existing policy already attached.
   *  * `gcp.gkebackup.BackupPlanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the backupplan are preserved.
   *  * `gcp.gkebackup.BackupPlanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the backupplan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkebackup.BackupPlanIamPolicy`: Retrieves the IAM policy for the backupplan
   * 
   *  &gt; **Note:** `gcp.gkebackup.BackupPlanIamPolicy` **cannot** be used in conjunction with `gcp.gkebackup.BackupPlanIamBinding` and `gcp.gkebackup.BackupPlanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkebackup.BackupPlanIamBinding` resources **can be** used in conjunction with `gcp.gkebackup.BackupPlanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkebackup.BackupPlanIamPolicy
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
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamPolicy;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamPolicyArgs;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new BackupPlanIamPolicy("policy", BackupPlanIamPolicyArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.BackupPlanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamBinding;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs;
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
   *          var binding = new BackupPlanIamBinding("binding", BackupPlanIamBindingArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkebackup.BackupPlanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamMember;
   *  import com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs;
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
   *          var member = new BackupPlanIamMember("member", BackupPlanIamMemberArgs.builder()
   *              .project(basic.project())
   *              .location(basic.location())
   *              .name(basic.name())
   *              .role("roles/viewer")
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
   *  * projects/{{project}}/locations/{{location}}/backupPlans/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Backup for GKE backupplan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_backup_backup_plan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_backup_backup_plan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkebackup/backupPlanIamMember:BackupPlanIamMember editor projects/{{project}}/locations/{{location}}/backupPlans/{{backup_plan}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def BackupPlanIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.BackupPlanIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type GkebackupFunctions = com.pulumi.gcp.gkebackup.GkebackupFunctions
  object GkebackupFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.gkebackup.GkebackupFunctions.*
  extension (self: GkebackupFunctions.type)
    /** Retrieves the current IAM policy data for backupplan */
    def getBackupPlanIamPolicy(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.GetBackupPlanIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.gkebackup.outputs.GetBackupPlanIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.GetBackupPlanIamPolicyArgs.builder
      com.pulumi.gcp.gkebackup.GkebackupFunctions.getBackupPlanIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for backupplan */
    def getBackupPlanIamPolicyPlain(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.GetBackupPlanIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gkebackup.outputs.GetBackupPlanIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.GetBackupPlanIamPolicyPlainArgs.builder
      com.pulumi.gcp.gkebackup.GkebackupFunctions.getBackupPlanIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for restoreplan */
    def getRestorePlanIamPolicy(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.GetRestorePlanIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.gkebackup.outputs.GetRestorePlanIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.GetRestorePlanIamPolicyArgs.builder
      com.pulumi.gcp.gkebackup.GkebackupFunctions.getRestorePlanIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for restoreplan */
    def getRestorePlanIamPolicyPlain(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.GetRestorePlanIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gkebackup.outputs.GetRestorePlanIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.GetRestorePlanIamPolicyPlainArgs.builder
      com.pulumi.gcp.gkebackup.GkebackupFunctions.getRestorePlanIamPolicyPlain(args(argsBuilder).build)

  /**
   * A BackupChannel imposes constraints on where clusters can be backed up.
   *  The BackupChannel should be in the same project and region
   *  as the cluster being backed up.
   *  The backup can be created only in destination_project.
   * 
   *  To get more information about BackupChannel, see:
   * 
   *  * [API documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/reference/rest/v1/projects.locations.backupChannels)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke)
   */
  def BackupChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkebackup.BackupChannelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkebackup.BackupChannelArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkebackup.BackupChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanState.Builder)
    /**
     * @param restoreConfig Defines the configuration of Restores created via this RestorePlan.
     *  Structure is documented below.
     * @return builder
     */
    def restoreConfig(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.builder
      builder.restoreConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowArgs.Builder)
    /**
     * @param daysOfWeek The exclusion window occurs on these days of each week in UTC.
     *  Only one of singleOccurrenceDate, daily and daysOfWeek may be set.
     *  Structure is documented below.
     * @return builder
     */
    def daysOfWeek(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowDaysOfWeekArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowDaysOfWeekArgs.builder
      builder.daysOfWeek(args(argsBuilder).build)

    /**
     * @param singleOccurrenceDate No recurrence. The exclusion window occurs only once and on this date in UTC.
     *  Only one of singleOccurrenceDate, daily and daysOfWeek may be set.
     *  Structure is documented below.
     * @return builder
     */
    def singleOccurrenceDate(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowSingleOccurrenceDateArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowSingleOccurrenceDateArgs.builder
      builder.singleOccurrenceDate(args(argsBuilder).build)

    /**
     * @param startTime Specifies the start time of the window using time of the day in UTC.
     *  Structure is documented below.
     * @return builder
     */
    def startTime(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowStartTimeArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder)
    /**
     * @param encryptionKey This defines a customer managed encryption key that will be used to encrypt the &#34;config&#34;
     *  portion (the Kubernetes resources) of Backups created via this plan.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionKey(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigEncryptionKeyArgs.builder
      builder.encryptionKey(args(argsBuilder).build)

    /**
     * @param selectedApplications A list of namespaced Kubernetes Resources.
     *  Structure is documented below.
     * @return builder
     */
    def selectedApplications(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedApplicationsArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedApplicationsArgs.builder
      builder.selectedApplications(args(argsBuilder).build)

    /**
     * @param selectedNamespaceLabels If set, include just the resources in the listed namespace Labels.
     *  Structure is documented below.
     * @return builder
     */
    def selectedNamespaceLabels(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespaceLabelsArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespaceLabelsArgs.builder
      builder.selectedNamespaceLabels(args(argsBuilder).build)

    /**
     * @param selectedNamespaces If set, include just the resources in the listed namespaces.
     *  Structure is documented below.
     * @return builder
     */
    def selectedNamespaces(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespacesArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespacesArgs.builder
      builder.selectedNamespaces(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedApplicationsArgs.Builder)
    /**
     * @param namespacedNames A list of namespaced Kubernetes resources.
     *  Structure is documented below.
     * @return builder
     */
    def namespacedNames(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedApplicationsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs.builder
      builder.namespacedNames(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleArgs.Builder)
    /**
     * @param fieldActions A list of transformation rule actions to take against candidate
     *  resources. Actions are executed in order defined - this order
     *  matters, as they could potentially interfere with each other and
     *  the first operation could affect the outcome of the second operation.
     *  Structure is documented below.
     * @return builder
     */
    def fieldActions(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleFieldActionArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleFieldActionArgs.builder
      builder.fieldActions(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceFilter This field is used to specify a set of fields that should be used to
     *  determine which resources in backup should be acted upon by the
     *  supplied transformation rule actions, and this will ensure that only
     *  specific resources are affected by transformation rule actions.
     *  Structure is documented below.
     * @return builder
     */
    def resourceFilter(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterArgs.builder
      builder.resourceFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyArgs.Builder)
    /**
     * @param requiring The requiring group kind requires that the satisfying
     *  group kind be restored first.
     *  Structure is documented below.
     * @return builder
     */
    def requiring(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyRequiringArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyRequiringArgs.builder
      builder.requiring(args(argsBuilder).build)

    /**
     * @param satisfying The satisfying group kind must be restored first
     *  in order to satisfy the dependency.
     *  Structure is documented below.
     * @return builder
     */
    def satisfying(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs.builder
      builder.satisfying(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedApplicationsArgs.Builder)
    /**
     * @param namespacedNames A list of namespaced Kubernetes resources.
     *  Structure is documented below.
     * @return builder
     */
    def namespacedNames(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedApplicationsNamespacedNameArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedApplicationsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedApplicationsNamespacedNameArgs.builder
      builder.namespacedNames(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder)
    /**
     * @param clusterResourceRestoreScope Identifies the cluster-scoped resources to restore from the Backup.
     *  Structure is documented below.
     * @return builder
     */
    def clusterResourceRestoreScope(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs.builder
      builder.clusterResourceRestoreScope(args(argsBuilder).build)

    /**
     * @param excludedNamespaces A list of selected namespaces excluded from restoration.
     *  All namespaces except those in this list will be restored.
     *  Structure is documented below.
     * @return builder
     */
    def excludedNamespaces(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigExcludedNamespacesArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigExcludedNamespacesArgs.builder
      builder.excludedNamespaces(args(argsBuilder).build)

    /**
     * @param restoreOrder It contains custom ordering to use on a Restore.
     *  Structure is documented below.
     * @return builder
     */
    def restoreOrder(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderArgs.builder
      builder.restoreOrder(args(argsBuilder).build)

    /**
     * @param selectedApplications A list of selected ProtectedApplications to restore.
     *  The listed ProtectedApplications and all the resources
     *  to which they refer will be restored.
     *  Structure is documented below.
     * @return builder
     */
    def selectedApplications(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedApplicationsArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedApplicationsArgs.builder
      builder.selectedApplications(args(argsBuilder).build)

    /**
     * @param selectedNamespaces A list of selected namespaces to restore from the Backup.
     *  The listed Namespaces and all resources contained in them will be restored.
     *  Structure is documented below.
     * @return builder
     */
    def selectedNamespaces(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedNamespacesArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedNamespacesArgs.builder
      builder.selectedNamespaces(args(argsBuilder).build)

    /**
     * @param transformationRules A list of transformation rules to be applied against Kubernetes
     *  resources as they are selected for restoration from a Backup.
     *  Rules are executed in order defined - this order matters,
     *  as changes made by a rule may impact the filtering logic of subsequent
     *  rules. An empty list means no transformation will occur.
     *  Structure is documented below.
     * @return builder
     */
    def transformationRules(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleArgs.builder
      builder.transformationRules(args.map(_(argsBuilder).build)*)

    /**
     * @param volumeDataRestorePolicyBindings A table that binds volumes by their scope to a restore policy. Bindings
     *  must have a unique scope. Any volumes not scoped in the bindings are
     *  subject to the policy defined in volume_data_restore_policy.
     *  Structure is documented below.
     * @return builder
     */
    def volumeDataRestorePolicyBindings(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigVolumeDataRestorePolicyBindingArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigVolumeDataRestorePolicyBindingArgs.builder
      builder.volumeDataRestorePolicyBindings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespaceLabelsArgs.Builder)
    /**
     * @param resourceLabels A list of Kubernetes Namespace labels.
     *  Structure is documented below.
     * @return builder
     */
    def resourceLabels(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespaceLabelsResourceLabelArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespaceLabelsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespaceLabelsResourceLabelArgs.builder
      builder.resourceLabels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigArgs.Builder)
    /**
     * @param exclusionWindows User specified time windows during which backup can NOT happen for this BackupPlan.
     *  Backups should start and finish outside of any given exclusion window. Note: backup
     *  jobs will be scheduled to start and finish outside the duration of the window as
     *  much as possible, but running jobs will not get canceled when it runs into the window.
     *  All the time and date values in exclusionWindows entry in the API are in UTC. We
     *  only allow &lt;=1 recurrence (daily or weekly) exclusion window for a BackupPlan while no
     *  restriction on number of single occurrence windows.
     *  Structure is documented below.
     * @return builder
     */
    def exclusionWindows(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowArgs.builder
      builder.exclusionWindows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterArgs.Builder)
    /**
     * @param groupKinds (Filtering parameter) Any resource subject to transformation must
     *  belong to one of the listed &#34;types&#34;. If this field is not provided,
     *  no type filtering will be performed
     *  (all resources of all types matching previous filtering parameters
     *  will be candidates for transformation).
     *  Structure is documented below.
     * @return builder
     */
    def groupKinds(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterGroupKindArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterGroupKindArgs.builder
      builder.groupKinds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanState.Builder)
    /**
     * @param backupConfig Defines the configuration of Backups created via this BackupPlan.
     *  Structure is documented below.
     * @return builder
     */
    def backupConfig(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.builder
      builder.backupConfig(args(argsBuilder).build)

    /**
     * @param backupSchedule Defines a schedule for automatic Backup creation via this BackupPlan.
     *  Structure is documented below.
     * @return builder
     */
    def backupSchedule(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleArgs.builder
      builder.backupSchedule(args(argsBuilder).build)

    /**
     * @param retentionPolicy RetentionPolicy governs lifecycle of Backups created under this plan.
     *  Structure is documented below.
     * @return builder
     */
    def retentionPolicy(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanRetentionPolicyArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleArgs.Builder)
    /**
     * @param rpoConfig Defines the RPO schedule configuration for this BackupPlan. This is mutually
     *  exclusive with the cronSchedule field since at most one schedule can be defined
     *  for a BackupPLan. If this is defined, then backupRetainDays must also be defined.
     *  Structure is documented below.
     * @return builder
     */
    def rpoConfig(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigArgs.builder
      builder.rpoConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderArgs.Builder)
    /**
     * @param groupKindDependencies A list of group kind dependency pairs
     *  that is used by Backup for GKE to
     *  generate a group kind restore order.
     *  Structure is documented below.
     * @return builder
     */
    def groupKindDependencies(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyArgs.builder
      builder.groupKindDependencies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs.Builder)
    /**
     * @param excludedGroupKinds A list of cluster-scoped resource group kinds to NOT restore from the backup.
     *  If specified, all valid cluster-scoped resources will be restored except
     *  for those specified in the list.
     *  Mutually exclusive to any other field in `clusterResourceRestoreScope`.
     *  Structure is documented below.
     * @return builder
     */
    def excludedGroupKinds(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeExcludedGroupKindArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeExcludedGroupKindArgs.builder
      builder.excludedGroupKinds(args.map(_(argsBuilder).build)*)

    /**
     * @param selectedGroupKinds A list of cluster-scoped resource group kinds to restore from the backup.
     *  If specified, only the selected resources will be restored.
     *  Mutually exclusive to any other field in the `clusterResourceRestoreScope`.
     *  Structure is documented below.
     * @return builder
     */
    def selectedGroupKinds(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeSelectedGroupKindArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeSelectedGroupKindArgs.builder
      builder.selectedGroupKinds(args.map(_(argsBuilder).build)*)
